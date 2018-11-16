# J11Cook_OOP


# My big takeaways
- RuntimeExceptions do not need to be inside a try-catch block so are useful for making more descriptive errors
- NullPointerExceptions are something you have to pay attention to when making object-oriented designs
- Whenever you instantiate a class, you can override any method in the class


# Classes

## Example 1 : Classes

### Notable Discoveries
- RuntimeExceptions do not need to be inside a try-catch block so are useful for making more descriptive errors
- NullPointerExceptions are something you have to pay attention to when making object-oriented designs

## Example 2 : Inner Classes

### There are three types of inner classes
- **Inner class** can access private members of enclosing class and vice versa; private members or private class itself is not accessible from outside
- **Method-local inner class** class is defined inside a method. Accessible only within the method
- **Anonymous inner class** defined without a name and defined during instantiation based on an interface or extended class


This example is not a great one for demonstrating why inner classes are useful because it can be done better using something like a method local inner class. But there are cases for it:
- if it were used in multiple functions
- if it needed to extend an existing class or interface

## Example 3 : Method-Local Inner Classes
- Classes can be instantiated and used inside methods. 
- Useful if you want to create one time use classes?

## Example 4 : Anonymous Inner Classes
- You can instantiate any class and overwrite one or more of its methods, cool.


## Example 5 : Static Inner Classes
- Can't reference static members of the outer class.

## Example 6 : Inheritance