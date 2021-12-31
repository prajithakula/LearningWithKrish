# LearningWithKrish

The program is created to check the behaviours of the static block, empty block and the constructor. So I have written a small program like giving the result regarding the exam marks. So i have created the static variables, non static variables, static method and the non static method for the testing that how those blocks are behaving for those.

According to the program execution the static block only got the static variables and the static methods. Only static variables and methods can be initialized in static block.
When we execute the program the static block always run at the first.This block gets executed when the class is loaded in the memory. Lets see how multiple static blocks work in Java. They execute in the given order which means the first static block executes before second static block. That’s the reason, values initialized by first block are overwritten by second block. 
 
After the static block the empty block will run. Empty block will be called when you are creating the object with new keyword. It will not get execute if you are not creating the object. Both static and not static variable can be initialized in empty block. It will be called before your default constructor. Instance method and static method can be called in empty block.

Then the constructor will be executed after the static and empty block. We can call the methods by using this constructor.
 
 
