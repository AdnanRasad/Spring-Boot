
# What I have done here?


Goal: 

1.When this Spring Boot Appliation is run, it will show Hello World with a server time. But this has to be done using Restful Web Services.

2. Make a mysql DB. Add mappings, such as "/", "alldata", "delete" etc and use Rest like step 1 to connect with the methods from browser to Spring Boot. In those methods use Hibernate API to fetch and manipulate the Database.

3.Do Step no. 2 but with NoSQL Database


Key Points: 

1. REST!=Http but HTTP is a contract, a communication protocol and REST is a concept, an architectural style which may use HTTP, FTP or other communication protocols but is widely used with HTTP. 

2. Spring Boot is an application that has its own server. So no need to run it on a server, simply run it as a java application.

3.@RequestMapping("/greeting")
  public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
    return new "Hello World"+value;

"The @RequestMapping annotation ensures that HTTP requests to /greeting are mapped to the greeting() method.The above example does not specify GET vs. PUT, POST, and so forth, because @RequestMapping maps all HTTP operations by default. Use @RequestMapping(method=GET) to narrow this mapping."

4. Remember to maintain package name. If the application package is com.adnan. Then the RequestMapping methods has to be in a package named : com.adnan.something...



# Recall:

What is Rest?


https://docs.oracle.com/javaee/6/tutorial/doc/gijqy.html


In the REST architectural ( Representational State Transfer ) style,
data and functionality are considered resources and are accessed using 
Uniform Resource Identifiers (URIs), typically links on the Web. 

The REST architectural style constrains an architecture to a client/server architecture.

The following principles encourage RESTful applications to be simple, lightweight, and fast:

Resource identification through URI: A RESTful web service exposes a set of resources that identify the targets of the interaction with its clients. Resources are identified by URIs, which provide a global addressing space for resource and service discovery. See The @Path Annotation and URI Path Templates for more information.

Uniform interface: Resources are manipulated using a fixed set of four create, read, update, delete operations: PUT, GET, POST, and DELETE. PUT creates a new resource, which can be then deleted by using DELETE. GET retrieves the current state of a resource in some representation. POST transfers a new state onto a resource. See Responding to HTTP Methods and Requests for more information.

Self-descriptive messages: Resources are decoupled from their representation so that their content can be accessed in a variety of formats, such as HTML, XML, plain text, PDF, JPEG, JSON, and others. Metadata about the resource is available and used, for example, to control caching, detect transmission errors, negotiate the appropriate representation format, and perform authentication or access control. See Responding to HTTP Methods and Requests and Using Entity Providers to Map HTTP Response and Request Entity Bodies for more information.

Stateful interactions through hyperlinks: Every interaction with a resource is stateless; that is, request messages are self-contained. Stateful interactions are based on the concept of explicit state transfer. Several techniques exist to exchange state, such as URI rewriting, cookies, and hidden form fields. State can be embedded in response messages to point to valid future states of the interaction. See Using Entity Providers to Map HTTP Response and Request Entity Bodies and “Building URIs” in the JAX-RS Overview document for more information.

# Rest in Spring Boot

This has a very good guide to start with restful web services with Spring Boot
https://spring.io/guides/gs/rest-service/


