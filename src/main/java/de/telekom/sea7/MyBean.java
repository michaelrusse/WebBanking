package de.telekom.sea7;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import de.telekom.sea7.view.ControllerZahlungen;

@Component
public class MyBean implements ApplicationContextAware {
	
	@Autowired
	private ControllerZahlungen controllerZahlungen;
	private ApplicationContext applicationContext;
	
	
	public MyBean() {
		System.out.println("Zeigt den Inhalt bei der vor Inalisierung an:" + controllerZahlungen);
	}
	
	@PostConstruct
	public void init() {
		System.out.println("********************** Hallo von ControllerZahlungen ****************");
		System.out.println(controllerZahlungen);
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("******************* Aufwiedersehen ************************");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
		ControllerZahlungen controllerZahlungen2 = (ControllerZahlungen) applicationContext.getBean("controllerZahlungen");
		System.out.println("Die ist das Ergebnis der ApplicationContext" + controllerZahlungen2);
	}

}

