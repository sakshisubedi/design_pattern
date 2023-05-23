# Proxy
- Proxy is a **structural design pattern** that lets you provide a substitute or placeholder for another real object. 
- The proxy acts as an intermediatory layer between the client and the real object and hence can control the access to the real object, add additional functionality, and even restrict client access allowing you to perform something either before or after the request gets through to the original/real object. It is also known as **Surrogate Pattern**.
- A remote proxy acts as a *local representative to a remote object.*
- Proxy pattern is used when we need to create a wrapper to cover the main object’s complexity from the client.

## Types of Proxy
- Remote proxy: They are responsible for representing the object located remotely. Talking to the real object might involve marshalling and unmarshalling of data and talking to the remote object. All that logic is encapsulated in these proxies and the client application need not worry about them.
- Virtual proxy: These proxies will provide some default and instant results if the real object is supposed to take some time to produce results. These proxies initiate the operation on real objects and provide a default result to the application. Once the real object is done, these proxies push the actual data to the client where it has provided dummy data earlier.
- Protection proxy: If an application does not have access to some resource then such proxies will talk to the objects in applications that have access to that resource and then get the result back.
- Smart Proxy: A smart proxy provides additional layer of security by interposing specific actions when the object is accessed. An example can be to check if the real object is locked before it is accessed to ensure that no other object can change it.

## Intent
 - Provide a surrogate or placeholder for another object to control access to it.
 - Use an extra level of indirection to support distributed, controlled, or intelligent access.
 - Add a wrapper and delegation to protect the real component from undue complexity.

## When to use
- Lazy initialization (virtual proxy). This is when you have a heavyweight service object that wastes system resources by being always up, even though you only need it from time to time.
- Access control (protection proxy). This is when you want only specific clients to be able to use the service object; for instance, when your objects are crucial parts of an operating system and clients are various launched applications (including malicious ones).
- Local execution of a remote service (remote proxy). This is when the service object is located on a remote server.
- Logging requests (logging proxy). This is when you want to keep a history of requests to the service object.
- Caching request results (caching proxy). This is when you need to cache results of client requests and manage the life cycle of this cache, especially if results are quite large.
- Smart reference. This is when you need to be able to dismiss a heavyweight object once there are no clients that use it.

## Pros
- You can control the service object without clients knowing about it. 
- You can manage the lifecycle of the service object when clients don’t care about it. 
- The proxy works even if the service object isn’t ready or is not available. 
- Open/Closed Principle. You can introduce new proxies without changing the service or clients.
- One of the advantages of Proxy pattern is security.
- This pattern avoids duplication of objects which might be huge size and memory intensive. This in turn increases the performance of the application. 
- The remote proxy also ensures about security by installing the local code proxy (stub) in the client machine and then accessing the server with help of the remote code.

## Cons
- The code may become more complicated since you need to introduce a lot of new classes.
- The response from the service might get delayed.
- This pattern introduces another layer of abstraction which sometimes may be an issue if the RealSubject code is accessed by some of the clients directly and some of them might access the Proxy classes. This might cause disparate behaviour.

## Examples
- While dealing with software applications in our day-to-day life, it is not always possible to load or display heavy images and video files especially while dealing with limited resource devices or low bandwidth internet connectivity. To ensure uninterrupted service in these cases, software developers make use of the Proxy Design Pattern.

## Proxy Vs Adapter vs Decorator Design Pattern
- Adapter pattern gives a different interface to its subject, while Proxy patterns provides the same interface from the original object but the decorator provides an enhanced interface. Decorator pattern adds additional behaviour at runtime.

## Important Points
- Even if we have only one concrete creator it is still advantageous to use Factory Design Pattern because we are decoupling the implementation of the product from its use. If any additional products are added or change a product's implementation, it will not affect the Creator.
- It is not always necessary to declare factory method and the Creator as abstract. 
- When we directly instantiate an object, we are depending on the concrete class. Therefore, factroy pattern is a good way to deal with this. 


## Useful Links
- [Good Example](https://www.scaler.com/topics/design-patterns/proxy-design-pattern/)
- [Baeldung blog](https://www.baeldung.com/java-proxy-pattern)
- [GFG](https://www.geeksforgeeks.org/proxy-design-pattern/)
- [Example](https://medium.com/swlh/what-is-proxy-pattern-64ff58a8bc00)