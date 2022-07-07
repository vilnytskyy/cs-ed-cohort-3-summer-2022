Schedule for Day 3
1. Demos and review of ArrayPractice lab
2. Lecture: 2D Arrays
  - reading: https://chortle.ccsu.edu/Java5/Notes/chap49C/ch49C_1.html
  - online editor / visuals: https://runestone.academy/ns/books/published//csawesome/Unit8-2DArray/topic-8-2-2D-array-loops.html
3. Lab work time in small groups.
4. Demos on beginning of Array2DPractice
5. If time, introduction on Conway's Game of Life lab.  We will upload a skeleton for Conway's Game of life before we cover the topic. 


#### Work: Fundamental 2D Array Traversal Operations

_GOAL:_

Gain familiarity with 2D array manipulation through implementation of basic traversal functions.

_GUIDELINES:_

This skeleton-based task lends itself well to a driver/codriver paradigm: one person shares screen, types, while all dialogue in real time to generate code.

_YOUR CODING MISSION:_

Fill in the missing body of each method and use the main() method to test. You are welcome to add additional code to the main() method, but do not delete any existing code.
- Copy the starter code from this directory into your repl.it. Place it in the folder `/programming/3` (you will have to make the 3 folder if you haven't done so already).

- NOTES & PROTIPS:
  - Design first. Sketch out your plan on paper ("keys to success"), transcribe into comments in your code file.
  - Get something, however, minimal, to compile and run ASAP. Incrementally grow it until it aligns with your goal.
  - Never stray far from runnable code. 
  - Additional instrtuctions can be found in the Array2DPractice.java file.
  - Work with your breakout room - help each other - make sure you're all progressing together. Feel free to use repl.it's multi-player feature (the invite button) but if you do make sure everyone you work with copies all the code to their own repo.
  - Make sure to sync your solution to GitHub when finished.
  - Credit your partners in your source code file. Specifically, add a comment above any function to tell us who you worked with, or if you got assistance, who from.
  - Read all the methods before you start - earlier ones might be easier for some people but for others, a later problem might be easier to start with.
- Grow cohort KB ("knowledge base") on slack:
  - Have a Q? Ask.
  - Confident in your skills/knowledge? _See how well you can explain it._
- DELIVERABLE:
  - Save in your work repo: `programming/3/Array2DPractice.java`
  - Include heading at top of file, as comment. List all collaborators and consultants.


Teams (2D Array Work):
```
1	Aasine C	Amanda L	Sam L	Alana R
2	Dave C	adam d	stacy G	Alise B
3	Jing X	Christopher D	Taylor G	Alicia W
4	Marieke T	Charles D	Greg S	Benjamin E
5	Maxwell Y	Ed H	Tanya W	Latoya B
6	Seth A	Erwin L	Wayne T	Christine M
7	Nicole C	Kiana H	Yanique S	Jenna L
8	Patti E	Jessica N	Saranii M	Jerusha T
9	Sarah M	Jihae P	Adam P	Kirk M
10	Suzie S	Kate M	David M	Shana Elizabeth H
11	usman a	Michael R	Harrison F	Mike P
12	Yenmin Y	Joshua H	Joel B	Vanessa Z
13	Elizabeth R	William L	Marisa S	Richard P
14	Yeidy L	Parmanand M	Rachel K	
15	Ashley U	Steve S	Théa W	
```


* * *

#### Work: Putting 2D Arrays to Use -- CGOL

_GOAL:_

Design and implement an engine to play Conway's Game of Life.

_GUIDELINES:_

__The Rules of Life:__

Survivals: 
  - Every living cell with 2 or 3 living neighbours survives for the next generation.

Death:
  - Each cell with >3 neighbours dies from overpopulation.
  - Every cell with <2 neighbours dies from isolation.

Birth:
  - Each dead cell adjacent to exactly 3 living neighbours is a birth cell. It will come alive next generation.
  
_Nota bene: All births and deaths occur simultaneously. Together, they constitute a single generation._


_YOUR CODING MISSION:_

1. Read the entire skeleton file, as a team, for understanding. 
2. Discuss, as a team, how you will approach this. Pick the approach that makes the most sense to all teammates, and implement it.

- PROTIPS and NOTES:
  - Design first. Sketch out your plan on paper ("keys to success"), transcribe into comments in your code file.
  - Get something, however, minimal, to compile and run ASAP. Incrementally grow it until it aligns with your goal.
  - Never stray far from runnable code. 
  - Need to tune your mental model? Play here: https://playgameoflife.com/
  - Want more background? Read up here: https://en.wikipedia.org/wiki/The_Game_of_Life
  - ...or here: https://www.nytimes.com/2020/12/28/science/math-conway-game-of-life.html
  - The Scientific American Article: https://www.ibiblio.org/lifepatterns/october1970.html
  - Beyond:
    - gallery: https://conwaylife.com/wiki/List_of_common_still_lifes
    - golly: http://golly.sourceforge.net/
  - Grow cohort KB ("knowledge base") on slack:
    - Have a Q? Ask.
    - Confident in your skills/knowledge? _See how well you can explain it._
- DELIVERABLE:
  - Save in your_work_repo: `programming/3/Cgol.java`
  - Include heading at top of file, as comment. List all collaborators and consultants.

Teams (CGOL):
```
1	Marieke T	Erwin L	Sam L	Latoya B
2	Harrison F	Kiana H	stacy G	Alise B
3	David M	Jessica N	Taylor G
4	Marisa S	Jihae P	Seth A	Shana Elizabeth H
5	Rachel K	Kate M	usman a	Yeidy L
6	Adam P	Michael R	Aasine C	Jenna L
7	Greg S	Joshua H	Dave C	Christine M
8	Vanessa Z	William L	Patti E	Alana R
9	Ashley U	Parmanand M	Sarah M	Kirk M
10	Elizabeth R	Steve S	Suzie S	Richard P
11	Benjamin E	Amanda L	Nicole C	Saranii M
12	Tanya W	adam d	Jing X	Yanique S
13	Mike P	Christopher D	Maxwell Y	Wayne T
14	Alicia W	Charles D	Yenmin Y	Jerusha T
15	Théa W	Ed H	Joel B
```

* * *
