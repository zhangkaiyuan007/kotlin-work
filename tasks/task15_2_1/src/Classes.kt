// Task 15.2.1: syntax for subclasses

open class Parent

// Child has to be open as well, otherwise GrandChild won't compile;
// openness doesn't carry forward from Parent to its subclasses
open class Child : Parent()

class GrandChild : Child()
