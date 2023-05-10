# Builder
- Builder is a **creational design pattern** that lets you construct complex objects step by step. The pattern allows you to produce different types and representations of an object using the same construction code.
- The process of constructing an object should be generic so that it can be used to create different representations of the same object.
- The only big difference between the builder pattern and the abstract factory pattern is that builder provides us more control over the object creation process and that’s it.

## Intent
- Separate the construction of a complex object from its representation so that the same construction process can create different representations.
- Parse a complex representation, create one of several targets.

## Solution
- The Builder pattern suggests that you extract the object construction code out of its own class and move it to separate objects called builders.
- When the process involved in creating an object is extremely complex, with lots of mandatory and optional parameters.
- When an increase in the number of constructor parameters leads to a large list of constructors.
- When client expects different representations for the object that's constructed.

## What is construction and representation of an object?
*[Using burger example](https://stacktraceguru.com/builder-pattern/)*
- **Representation**: This step consists of how our product looks at the end when it is ready. In this step we combine the already constructed parts. For instance first there is a bread, then patty on top it followed by some veggies, then some sauces and at the end finished off with final layer of bread.
- **Construction**: whereas, this step means how the parts of the products are actually made. This may include multiple steps.
For example baking a bread, making burger patty, making different sauces, cutting of vegetables etc.

Builder pattern separates these 2 steps so that we can create different type of products using the same set of steps. Thus, it provides flexible solution to object creation problems.

## Director
- The director class defines the order in which to execute the building steps, while the builder provides the implementation for those steps.
- The construction is controlled by a director object that only needs to know the type of object it is to create.
- Can be think as a Facade Pattern.

## When to use
- Use the Builder pattern to get rid of a "telescopic constructor".
    ```
    public User (String firstName, String lastName, int age, String phone, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phone = phone;
        this.address = address;
    }
    ```
    Now what if only firstName and lastName are mandatory and the rest 3 fields are optional. Problem !! We need more constructors. This problem is called the telescoping constructors problem.
- Use the Builder pattern when you want your code to be able to create different representations of some product *(for example:- stone and wooden houses)*.
- Use the Builder to construct Composite trees or other complex objects.
- The constructor of the User class is also declared private so that only the Builder assigned to this class can access it.

## Pros
- The parameters to the constructor are reduced and are provided in highly readable method calls.
- Builder design pattern also helps in minimizing the number of parameters in the constructor and thus there is no need to pass in null for optional parameters to the constructor.
- Object is always instantiated in a complete state.
- Immutable objects can be built without much complex logic in the object building process.
- It provides clear separation between the construction and representation of an object.
- It provides better control over construction process.
- It supports to change the internal representation of objects.
- You can construct objects step-by-step, defer construction steps or run steps recursively.
- You can reuse the same construction code when building various representations of products.
- Single Responsibility Principle. You can isolate complex construction code from the business logic of the product.
- Unlike other creational patterns, Builder can construct unrelated products, which don't have the common interface.

## Cons
- The overall complexity of the code increases since the pattern requires creating multiple new classes.
- The number of lines of code increases at least to double in builder pattern, but the effort pays off in terms of design flexibility and much more readable code.
- Requires creating a separate ConcreteBuilder for each different type of Product.
- Data members of class aren't guaranteed to be initialized.
- Dependency injection may be less supported.

## Usage
In JDK there are many places where Builder design pattern is used. Some of these are as follows:
- java.lang.StringBuilder.append(): StringBuilder is based on Builder pattern.
- java.nio.IntBuffer.put(): Invocation of put() method return IntBuffer. Also there are many variants of this method to build the IntBuffer.
- javax.swing.GroupLayout.Group.addComponent(): We can use addComponent() method to build a UI that can contain multiple levels of components.
- java.lang.Appendable
- java.lang.StringBuffer.append(): StringBuffer is similar to StringBuilder and it is also based on Builder design pattern.

## Useful Links
- [Usage of Director](https://dotnettutorials.net/lesson/builder-design-pattern-real-time-example/)
- [Baeldung blog](https://www.baeldung.com/creational-design-patterns#builder)
- [Example 1](https://howtodoinjava.com/design-patterns/creational/builder-pattern-in-java/)
- [Example 2](https://blogs.oracle.com/javamagazine/post/exploring-joshua-blochs-builder-design-pattern-in-java)
- [Example 3](https://stacktraceguru.com/builder-pattern/)
- [Example 4](https://www.adevguide.com/builder-design-pattern-java/)
- [Refer Sunil's example](https://github.com/sy117/design-patterns/blob/master/builder/src/main/java/demo/Student.java)