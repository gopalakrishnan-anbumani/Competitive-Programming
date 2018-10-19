# Bean Scope
Life Time of bean is based on bean scope. bean scope can be defined while declaring it in config file

	1. Singleton 2.Prototype
	
1. Singleton: 	It creates when container starts up. the same bean instance reused every time the bean is requested.
2. ProtoType: 	the bean with prototype initialize every time the bean is requested. Every time new Instance.

	<bean id="Empoloyee" class="com.spring.Employee" scope="singleton">
	
without scope attribute this bean is singleton only.

	<bean id="Empoloyee" class="com.spring.Employee" scope="prototype">
	
	
	
