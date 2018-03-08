package guru.springframework.lifecomponents;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class LifeCycleDemoBean
		implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {

	
	
	
	public LifeCycleDemoBean() {
		
		System.out.println("Inside LifeCycle bean Constructor");
	}

	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		System.out.println("Application Context has been set");

	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("Bean Factory has been set");

	}

	@Override
	public void setBeanName(String name) {
		System.out.println("Bean Name has been set");

	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void afterPropertiesSet() throws Exception {
			System.out.println("LifeCycle Bean properties has been set");
	}
	
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("@PostConstruct has been called");
	}

	@PreDestroy
	public void preDestroy() {
		System.out.println("@PreDestroy has been called");
	}
	
	public void beforeInit() {
		System.out.println("Before Init called By Bean Post Processor");
	}
	
	public void afterInit() {
		System.out.println("After Init called by BeanPostProcessor");
	}
}
