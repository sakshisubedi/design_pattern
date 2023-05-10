# Singleton
Singleton is a **creational design pattern** that lets you ensure that a class has only one instance, while providing a global access point to this instance.

## Intent
 - Ensure a class has only one instance, and provide a global point of access to it.
 - Encapsulated **just-in-time initialization** or **initialization on first use**.

## Solution
 - Make the default constructor private, to prevent other objects from using the new operator with the Singleton class. *(private access modifier prevent object creation outside the class)*
 - Create a static creation method that acts as a constructor. Under the hood, this method calls the private constructor to create an object and saves it in a static field. All following calls to this method return the cached object.

## Implementations:
### Eager Initialization
In this, object of class is created when it is loaded to the memory by JVM. It is done by assigning the reference of an instance directly.
```
private static SingletonEager obj = new SingletonEager();
```
 - Very simple to implement.
 - May lead to resource wastage. Because instance of class is created always, whether it is required or not.
 - CPU time is also wasted in creation of instance if it is not required.
 - Exception handling is not possible.

### Lazy Initialization
In this method, object is created only if it is needed. This may prevent resource wastage.
```
public static SingletonLazy getInstance(){
        if(obj == null){
            obj = new SingletonLazy();
        }
        return obj;
    }
```
 - Object is created only if it is needed. It may overcome resource and wastage of CPU time.
 - Exception handling is also possible in method.
 - Every time a condition of null has to be checked. Instance can’t be accessed directly.
 - In multithreaded environment, it may break singleton property.

### Lazy initialization with Synchronized method (Thread Safe Singleton)
To make a singleton class thread-safe, getInstance() method is made synchronized so that multiple threads can’t access it simultaneously.
```
synchronized  public static SingletonSynchronizedMethod getInstance(){
        if(obj == null){
            obj = new SingletonSynchronizedMethod();
        }
        return obj;
    }
```
 - Lazy initialization is possible.
 - It is also thread safe.
 - getInstance() method is synchronized so it causes slow performance as multiple threads can’t access it simultaneously.

### Lazy initialization with "Double Checked Locking" (Thread Safe Singleton)
In this mechanism, we overcome the overhead problem of synchronized method. In this approach, getInstance is not synchronized but the block which creates instance is synchronized so that minimum number of threads have to wait and that’s only for first time.
```
public static SingletonSynchronizedBlock getInstance(){
        if(obj == null){
            synchronized (SingletonSynchronizedBlock.class){
                if(obj == null){
                    obj = new SingletonSynchronizedBlock();
                }
            }
        }
        return obj;
    }
```
 - Lazy initialization is possible.
 - It is also thread safe.
 - Performance overhead gets reduced because of synchronized keyword.
 - First time, it can affect performance.
 - This method drastically reduces the overhead of calling the synchronized method every time.

### Static Block Initialization

### Bill Pugh Singleton Implementation

### Enum Singleton

### Serialization and Singleton

### Using Reflection to destroy Singleton Pattern

## When to use
- Use the Singleton pattern when a class in your program should have just a single instance available to all clients; for example, a single database object shared by different parts of the program.
- Use the Singleton pattern when you need stricter control over global variables - "Unlike global variables, the Singleton pattern guarantees that there’s just one instance of a class. Nothing, except for the Singleton class itself, can replace the cached instance."
- **Singleton pattern is mostly used in multi-threaded and database applications. It is used in logging, caching, thread pools, configuration settings etc.**

## Pros
 - Saves memory because object is not created at each request. Only single instance is reused again and again. You can be sure that a class has only a single instance.
 - You gain a global access point to that instance.
 - The singleton object is initialized only when it’s requested for the first time  (not for eager/early initialization).

## Cons
 - Violates the Single Responsibility Principle. The pattern solves two problems at the time. One managing its instance and, it is also responsible for whatever its main role is in the application. 
 - It may be difficult to unit test the client code of the Singleton because many test frameworks rely on inheritance when producing mock objects. Since the constructor of the singleton class is private and overriding static methods is impossible in most languages, you will need to think of a creative way to mock the singleton. Or just don’t write the tests. Or don’t use the Singleton pattern.
 - The pattern requires special treatment in a multithreaded environment so that multiple threads won’t create a singleton object several times.
 - The Singleton pattern can mask bad design, for instance, when the components of the program know too much about each other.
 - Difficult to subclass the Singleton code as it will require the private constructor of Singleton class to be public.

 ## Useful Links
 - [baeldung blog](https://www.baeldung.com/java-singleton)
 - [Example](https://www.adevguide.com/singleton-creational-design-pattern-java/)
 - [GeeksForGeeks](https://www.geeksforgeeks.org/singleton-design-pattern/)
 - [Additional Implementations](https://www.journaldev.com/1377/java-singleton-design-pattern-best-practices-examples)
 - [educative.io](https://www.educative.io/courses/software-design-patterns-best-practices/B8nMkqBWONo)

