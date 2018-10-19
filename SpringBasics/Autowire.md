# AutoWire
Spring Automatically inject the bean dependency.
It is not neccessary to provide values to all the properties of a bean in the config file.

For **Non-Primitive** properties we can enable the Autowiring feature.

If, Autowiring enable,

1. Spring container is automatically initializes the dependencies of that bean.
2.There is no need to give constructor and property tag with ref for bean definition

Autowiring can't be used to inject the primitive type & String

**Four Modes:**
	
	1.No (No Auto Wiring)
	2.byName
	3.byType
	4.constructor

Spring Contanier looks for bean in the container with same Name/Type that needs to be autowired. 
byName&byType internally uses Setter Injection
**By Name**:

	<bean id="Employee" class="com.spring.EmployeeService" autowire="byName">
		<property name="age" value="10" />
	</bean>
	
	<bean id="address" class="com.spring.Address" />
**By Type**:

	<bean id="Employee" class="com.spring.EmployeeService" autowire="byType">
		<property name="age" value="10" />
	</bean>
	
	<bean id="anyName" class="com.spring.Address" />
	
**Constructor**:

	 <bean id="Employee" class="com.spirng.Employee" autowire="constructor">    
        <constructor-arg name="age" value="20" />
    </bean>
    <bean id="anyName" class="com.spring.Address" />
    
Spring Constructor same as ByType. It is uses ByType only with parameterized constructor. No mandate to have same id.
Dependency inject through the constructor.

**No AutoWiring**:
Another mode of autowiring is "no", which means no autowiring. Dependency is explicitly wired using <property name="propertyName" ref="beanId"> in setter injection or <constructor-arg ref="beanId"> in constructor injection configuration in the configuration.



