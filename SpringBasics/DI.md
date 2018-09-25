# Dependency Injection

    As we dicussed before, We defined Bean as Shown Below

<bean id = "beanId" class = "com.java.bean">

In Dependency Injection, you do not create the objects but describe how they should be created.

Spring Container uses two ways to initialize the properties:

**Constructor Injection** : This is acheived through when the container invokes parameterized constructor to intialize the properties of a class.

**Parameterized Injection** : This is achieved when the container invokes the setter method of a class to intialize the properties after invoking the default constructor.


## Constructor Injection

	constructor-arg tag has to be used to inject the property value in the bean definition.
	
**Mandatory for Constructor Injection** 
	1. Parameterized Constuctor -> We are injecting the values through the constructor argument.
	2. constructor-arg tag in the bean definition

We can use constructor injection to intialize the multiple properties.

		<bean id="bean" class="sample.spring.beans.DisplayBean">
			<constructor-arg value="150"></constructor-arg>
			<constructor-arg value="200"></constructor-arg>
		</bean>

Spring are supplied values constructor arguments in appropriate order.
Spring 3 introduced to "name" keyword to assigne the value to given arguments.Spring provides two more attributes **type** && **index** which can also used to provide values to clarity.

**Type:**

	<constructor-arg value="200.00" type = "double"/> 
	<constructor-arg value="50" type = "int" /> 
 
**Index:**

	<constructor-arg value="200.00" index = "1"/> 
	<constructor-arg value="50" index = "0" /> 
 
We can inject dependent object using construtor-arg tag with "ref" attribute.For Object Dependency, constructor-arg tag has to be used to inject the dependency by referring the beans which present in container using ref attribute.

		<bean id="bean" class="sample.spring.beans.DisplayBean">
			<constructor-arg name="student" ref="student1"></constructor-arg>
		</bean>
		
		<bean id="student1" class="sample.spring.beans.Student"> </bean>



