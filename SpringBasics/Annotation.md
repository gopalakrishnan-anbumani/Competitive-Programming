# Spring Annotations and Java Based Configurations

Spring supports Annotations for configurations. Both (Xml & Annotations) of them can co-exist in same project.

Which helps to cut down the amount of XML configurations with help of

**Autowiring**: this figures out how to wire bean dependencies. Achieved through @Autowiring & @Qualifier
**AutoScanning**:This figures out which class should be configured as Spring Bean. It is reducing need for <bean> def in config XML file.

To Enable annotation, <context:annotation-config> has to be specified in XML config file.

@Autowire annotation perform byType Autowiring.
@Autowire is not for primitive data type

Used at Property ,Setter , Constructor Level

you heve idea about Setter & Constructor

	@Autowire
	private Employee employee1;
	
	-> Property level actually use Java Reflection for initializing this property 
	
@Value is used for initialing the value for primitive type

It is generally advisable to autowire beans of work flow classes such as controller, service or repository and not advisable to autowire domain objects as they represent data in a table.

This is using byType autowiring method.So when you have configured same class two beans in config file.
application throws an exception "UnsatisfiedDependencyException."

Resolve this problem by using @Qualifier("beanId")

We can give **@Autowire(required=true)** which avoid runtime exception when required bean doesn't exist in the container.

Explicit dependencies in property & constructor-arg will always over ride autowiring.

## Auto Scanning

Annotations based config using Autowired reduced the size of XML config file by replacing the tag like <constuctor-arg> & <property> tag using @Autowired

But Still the bean definition <bean> need to be defined.

Auto Scanning helps to remove explicit bean definition using <bean> tag.

Spring provides the way to automatically detect the beans to be injected and avoid the bean definition with in the spring configuration file through the AutoScanning

In AutoScanning, Spring framework automatically scans, detect & instantiates the bean from the specified base package.

Auto Scannig is switched on by <context:component-scan>

<context:component-scan> also do what ever <context:annotation-config>

Automatically detect the beans can be acheived by:

	1. Use @Component annotation at POJO 
	2. Add following line in Config File
	<context:component-scan base-package = "packageName"/>
 
Spring Container scans the base package (including sub-packages) to detect @Compomnent annotated classes and Create beans of the classes with default bean name as the class name(1st letter small)

@Component @Controller @Service @Repository

We can give explicit name also @Component("employee")






