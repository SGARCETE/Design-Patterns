# Singleton

Singleton is a very simple yet very useful pattern. Its intent is to create a unique instance of a Class, meaning that
there will only be a single instance during the full lifecycle of the program.

The advantage of Singleton is its disadvantage. By having one single instance, which might come in handy, if for some
reason requirements change and more than one instance is needed, there will be a refactoring problem.

Singleton is a single class which makes its constructor private and a property of its own type as well. There's a public
method that returns the single instance of the class, if it doesn't exist it creates it (just once).

In order for this to be possible, both the "instance" (ASingleton type) property and the getInstance() method must be
static, meaning that these properties and methods belong to the class, and not to a specific instance.
