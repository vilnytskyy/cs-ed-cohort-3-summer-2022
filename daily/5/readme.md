
#### Work: Design and Implement Recursive Methods

_GOAL:_

Gain familiarity with recursion by writing recursive functions.

_GUIDELINES:_

In ascending order of richness/difficulty, these are the stub/skeleton files in this directory:
* Fib.java
* Fence.java
* Reverser.java
* Binsearch.java

You are encouraged to peruse all four, then code as many as you can.

_YOUR CODING MISSION:_

Fill in the missing code where necessary and use the main() method to test. You are welcome to add additional code to the main() method, but do not delete any existing code.
- Copy the starter code from this directory into your repl.it. Place it in the folder `/programming/5` (you will have to make the 5 folder if you haven't done so already).

- NOTES & PROTIPS:
  - Design first. Sketch out your plan on paper ("keys to success"), transcribe into comments in your code file.
  - Get something, however, minimal, to compile and run ASAP. Incrementally grow it until it aligns with your goal.
  - Never stray far from runnable code. 
  - Additional instrtuctions can be found in the source code files.
  - Work with your breakout room - help each other - make sure you're all progressing together. Feel free to use repl.it's multi-player feature (the invite button) but if you do make sure everyone you work with copies all the code to their own repo.
  - Make sure to sync your solution to GitHub when finished.
  - Credit your partners in your source code file. Specifically, add a comment above any function to tell us who you worked with, or if you got assistance, who from.
  - Read entirety of any given code before you begin planning.
- Grow cohort KB ("knowledge base") on slack:
  - Have a Q? Ask.
  - Confident in your skills/knowledge? _See how well you can explain it._
- DELIVERABLE:
  - Save in your work repo: `programming/5/____.java`
  - Include heading at top of file, as comment. List all collaborators and consultants.








Visuals for Better Understanding: 
- [0. Not Recursion](
http://pythontutor.com/java.html#code=public%20class%20YourClassNameHere%20%7B%0A%20%20%0A%20%20public%20static%20void%20main%28String%5B%5D%20args%29%20%7B%0A%20%20%20%20int%20x%3B%0A%20%20%20%20x%20%3D%20myHelperFunction%285%29%3B%0A%20%20%7D%0A%20%20%20%20%0A%20%20public%20static%20int%20myHelperFunction%28int%20x%29%20%7B%0A%20%20%20%20int%20y%3B%0A%20%20%20%20y%20%3D%20myHelpersHelperFunction%28x%29%3B%0A%20%20%20%20return%20y%3B%0A%20%20%7D%0A%0A%20%20public%20static%20int%20myHelpersHelperFunction%28int%20y%29%20%7B%0A%20%20%20%20int%20z%20%3D%20y%3B%0A%20%20%20%20return%20z%3B%0A%20%20%7D%0A%20%20%0A%7D&cumulative=false&curInstr=11&heapPrimitives=nevernest&mode=display&origin=opt-frontend.js&py=java&rawInputLstJSON=%5B%5D&textReferences=false
)
- [1. Blastoff!](
http://pythontutor.com/java.html#code=public%20class%20YourClassNameHere%20%7B%0A%0Apublic%20static%20void%20main%28String%5B%5D%20args%29%20%7B%0A%20%20int%20x%20%3D%203%3B%0A%20%20countdown%28x%29%3B%0A%7D%0A%0Apublic%20static%20void%20countdown%28int%20n%29%20%7B%0A%20%20if%20%28n%20%3D%3D%200%29%20%7B%0A%20%20%20%20System.out.println%28%22Blastoff%22%29%3B%0A%20%20%7D%20else%20%7B%0A%20%20%20%20System.out.println%28n%29%3B%0A%20%20%20%20countdown%28n%20-%201%29%3B%0A%20%20%7D%0A%7D%0A%0A%7D%0A//&cumulative=false&curInstr=0&heapPrimitives=nevernest&mode=display&origin=opt-frontend.js&py=java&rawInputLstJSON=%5B%5D&textReferences=false
)
- [2. Factorial](
http://pythontutor.com/java.html#code=public%20class%20ClassNameHere%20%7B%20%0A%20%20%20%0A%20%20%20public%20static%20void%20main%28String%5B%5D%20args%29%20%7B%0A%20%20%20%20%20%20int%20x%20%3D%204%3B%0A%20%20%20%20%20%20factorial%28x%29%3B%0A%20%20%20%7D%0A%0A%20%20%20public%20static%20int%20factorial%28int%20n%29%20%7B%0A%20%20%20%20%20%20if%20%28n%20%3D%3D%200%29%20%7B%0A%20%20%20%20%20%20%20%20%20return%201%3B%0A%20%20%20%20%20%20%7D%20else%20%7B%0A%20%20%20%20%20%20%20%20%20int%20recurse%20%3D%20factorial%28n-1%29%3B%0A%20%20%20%20%20%20%20%20%20int%20result%20%3D%20n%20*%20recurse%3B%0A%20%20%20%20%20%20%20%20%20System.out.println%28n%29%3B%0A%20%20%20%20%20%20%20%20%20System.out.println%28%22%20%20%22%29%3B%0A%20%20%20%20%20%20%20%20%20System.out.println%28result%29%3B%0A%20%20%20%20%20%20%20%20%20System.out.println%28%22%20%20%22%29%3B%0A%20%20%20%20%20%20%20%20%20System.out.println%28result%29%3B%0A%20%20%20%20%20%20%20%20%20return%20result%3B%0A%20%20%20%20%20%20%7D%0A%20%20%20%7D%0A%0A%7D&cumulative=false&curInstr=0&heapPrimitives=nevernest&mode=display&origin=opt-frontend.js&py=java&rawInputLstJSON=%5B%5D&textReferences=false
)
- [3. Digit Sum](
http://pythontutor.com/java.html#code=public%20class%20YourClassNameHere%20%7B%0A%20%20%0A%20%20%0Apublic%20static%20void%20main%28String%5B%5D%20args%29%20%7B%0A%20%20%20%20int%20sum%3B%0A%20%20%20%20sum%20%3D%20digit_sum%281729%29%3B%0A%7D%0A%0Apublic%20static%20int%20digit_sum%28int%20n%29%20//Calculate%20sum%20of%20all%20digits%0A%7B%0A%20%20%20%20//%20Special%20%28base%29%20case%20for%20terminating%20the%20recursion%3A%0A%20%20%20%20if%20%28n%20%3D%3D%200%29%20%7B%20%0A%20%20%20%20%20%20%20%20return%200%3B%20%0A%20%20%20%20%7D%0A%20%20%20%20else%20%7B%20//%20General%20%28recursive%29%20case%3A%0A%20%20%20%20%20%20%20%20int%20the_sum%20%3D%20digit_sum%28n%20/%2010%29%3B%20//%20Recursive%20call%0A%20%20%20%20%20%20%20%20the_sum%20%3D%20the_sum%20%2B%20n%20%25%2010%3B%20//%20After%20recursive%20call%0A%20%20%20%20%20%20%20%20return%20the_sum%3B%0A%20%20%20%20%7D%0A%7D%0A%20%20%20%20%0A%20%20%20%20%0A%7D&cumulative=false&curInstr=0&heapPrimitives=nevernest&mode=display&origin=opt-frontend.js&py=java&rawInputLstJSON=%5B%5D&textReferences=false
)


* * *

#### Work: Gaining Familiarity with Classes via Time Class

For this project you'll be completing and testing a class that represents time.

Time can be represented in a class in one of two ways:
1. Using three variables, one for hours, one for minutes.
or
2. Using a single variable  for the time in seconds.

Design Considerations:
* The first approach is easier for things like printing or setting a specific number of minutes.
* The second approach is easier for comparing times.
* You can use either representation for your project.

#### Starter files and file locations

This folder has two starter files:
- Time.java (where you'll write your class)
- Driver.java - the Driver file you will use to test it

Copy these files into your rep under the `/programming/5` folder.


#### Specifics

You will complete your class in Time.java and you will write the code to test it in Driver.java. Specific requirements and levels are in the Time.java file.
	
#### Compiling and Running 

You can compile each file using
- `javac Time.java`
- `javac Driver.java`

or you can compile them both at once using
- `javac Driver.java Time.java`

To run your program, first compile __both__ .java files, then run using
- `java Driver`

Notice that you only specifiy the Driver on the java line.


Teams (recursion+classes):
```
```

* * *
