# Spring 5 Basics
	(During Power Programmer Assignments)
	
Spring Framework 5.x has the following key module:

## Core Container : 
This is a group of core modules proving key features on which all the other spring modules depend.

## Data Access/Integration:
This is a group of modules which deal with data such as connecting to database, ORM, etc.

## Web:
This group of modules related to web such as Web, Spring MVC etc.,

## Others:
few Other Modules such as Testing, Messaging, Instrumentation & etc.

# Core Container:
		1.Core 2.Beans 3.Context 4.SpEL

**Core**:
	This is the most fundamental module. IOC using DI feature is provided by this module.other modules are depend on this module.
	
**Bean**:
	This is implementation of BeanFactory container which is the basic spring container. Bean factory is the main interface of this module.
	
**Context**:
	This module inherits the feature of Bean module and provides additional feature to support enterprice application development. The ApplicationContext is the main interface of this module. 
	
**Spring Expression Language**:
	This module provides an expression language for querying and handling objects.
	
# Data Access/Integration
This module provides support to interact with Database and interact with ORM solution such as Hibernate,JPA etc.

	1.JDBC 2.ORM 3.OXM 4.JMS 5.Transaction

**JDBC:**
	This modules provide abstraction layer to support JDBC calls to RDBMS
**ORM:**
	This module provide integration support for populor ORM APIs such as Hibernate, JPA, MyBatis, JDO etc..
**OXM:**
	Object XML Mapping
	This modules provide abstraction layer to support that support Object/XML mapping
**JMS:**
	Java Message Service
	This module provides feature for Producing and Consuming Messages
**Transaction:**
	This module supports programmatic and declarative transaction management
	
# Web
Spring Web module provides basic support for web application development. 
	*Web Module has web application context which is build on application Context of the Core Container*.
Spring Web Module provide complete Model View Controller implementation to develop presentation tier of the application
and also supports other presentation tier like struts and JSFs.
	
	1.Web Module 2.Servlet 3.Web Socket 4.Portlet(It's removed from Spring 5)
	
**Web Module**:
This module supports basic features to support web application development such as IOC container initialization with Servlet Listeners,  web based application context, multi part file upload functionality. 

**Servlet**:
This module provides spring model-view-controller and REST web services implementation for Web based application.

**Portlet**:
This module mirror functionalities of Servlet module to be used in Portlet environment

**Web Socket**:
This is new Module which supports two way communication between Client and Server in Web socket web application.

The above web module is built on the Servlet APIs and Servlet Containers.it is part of spring framework from the beggining 
with formal name "Spring Web MVC" & "Spring MVC" but more commonly known as Spring MVC.

parallel to Spring MVC, Spring Framework 5.x introduces a reactive Stack,web framework called Spring WebFlux to support Reactive programming in Spring's web layer and runs on containers such as Netty, Undertow, and Servlet 3.1+.

Both Spring MVC and Spring WebFlux co-exists in Spring Framework 5.x, each module is optional. Applications may use any one of them or in some cases both based on the requirement.  

# Other Modules

	1.AOP 2.Aspects 3.Instrumentation 4.Messaging 5.Test
	
**Aspect Oriented Programming**:
This module helps in isolating cross cutting functionalities from bussiness logic

**Instrumentation**:
This module provides class instrumentation and class loader implementation that could be used in server based applications.

**Messaging**:
This module provide the abstraction and annotations for messaging-based integration between applications.

**Test**:
Supports Unit and Integration testing of spring components using JUnit & TestNG.



  
	