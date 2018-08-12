# Spring Basics

[Spring Doc!] (https://docs.spring.io/spring/docs/current/spring-framework-reference/core.html#beans-basics)

# 1. Inversion of Control
 
   		it helps in creating more loosely coupled applications. Ioc represents the Inveriosn of application object creation, Initialization, and destruction fromthe appliction to the third party such as Framework.Now 3rd party take care of object management and dependeancies. So it's making application easy to maintain, test, and run.
 		
 		Many approches to implement the IOC, Spring provides DI (Dependency Injection)
 		
# Spring IOC 
		Spring framework delegates the responsiblity of creating and maintaing the appliction object to a spring container using configuration metadata.

 		application can get the objects its dependencies from IOC container at runtime.
 		Objects maintained by the Container are called **Beans** in Spring.

> DI is software design pattern that provides better software design to facilitate loose coupling, resuse and ease of testing


   		*Core Container of the Spring framework provides the IoC using DI*
		
		IoC container / Core Container / Spring Container
		
  		**The Spring Container knows which objects to create and when to create through the *Configuration Metadata* which we provide in our application**
  		
  		1. POJO Class
  		2. Config MetaData
  		3.IoC Container
  			a. Bean Factory
  			b. Application Context
  		Application Logic is provided through POJO classes.Config Metadata consist of bean deifinitions. Ioc Container produces objects using Pojo classes and Config Metadata.
  		
  		**Bean Factory:** *It's a basic container available in Spring*
  		**Application Context:** *It's a special type of bean factory it has additional functionalities to support enterprise application development*
  		
  		
# Spring IOC - Container

#	**Bean Factory**

 		Bean Factory container instantiates, configures and manages the beans. It is part of the core container.
 		1.XML Bean Factory

		Resource resource = new ClassPathResource("config.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		beanFactory.getBean("bean");
		
# Application Context
 		ApplicationContext Interface extend BeanFactory Interface. It includes the additional enterprice services such as JNDI,EJB, email , internationalization, validation and schedule functionality.
 		
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Object object =  context.getBean("bean");
 		
# Configuration Meta Data

Definitions of the beans

		1.XML Based configurations
		2.Annotation Based configurations
		3.Java Based configurations
 		
**Accessing Beans**

	1.Traditional way  bean id
		context.getBean("bean");
	2.Based On Bean Type
		context.getBean(DisplayBean.class);
	3.Throiugh bean id & Bean type
		context.getBean("bean",DisplayBean.class);
		


 		
 		
 	
 
