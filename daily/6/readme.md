
#### Work: Implement SuperArray class

#### Starter Files:

- SuperArray.java  - complete as much of this class as you can.
- SuperArrayDriver.java - the Driver file with main. Test your
  SuperArray class from here.

#### Other Files:
- subgoals0.java - subgoals for the SuperArray class. Look at this
  file for additional guidance for writing the methods in
  SuperArray.java.
- encapsulation00.jpg - a visual diagram of a SuperArray 

#### Instructions 

Copy the files into /programming/6 and 

Compiling and Running

You can compile each file using

- javac SuperArray.java
- javac SuperArrayDriver.java

or you can compile them both at once using

- javac SuperArrayDriver.java SuperArray.java

To run your program, first compile *both* .java files, then run using:
- java SuperArrayDriver 

#### Specifics

Your SuperArray is a class that contains an array which will store int data. The reason to use our SuperArray instead of a plain array is that our SuperArray will allow fo the following:
- If you add to the end and there's no more room in the array, it will make a new, larger array (your code will have to do this).
- If you remove an item from the array, it will shift items down to fill the gap.
