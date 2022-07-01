# Daily Assignments
We'll use this section to post work throughout the sessions. This page will update daily with plans, links, etc. Associated code will be stored in the folder corresponding to the day. (If you reading this on github.com, look above to see these subdirectories.)

---

### Day 0 | Day 0b0000 | Day 0x00 : 6/29
Intros
- course
- instructors
- cohort
- program overview

Toolset
- slack
- repl.it
- CLI, javac, java

Lecture: Java basics/overview 

#### Work: Review pre-work
- __Note any observed best practices.__
- Bookmark locations of others' repos.
- Grow cohort KB ("knowledge base") on slack:
  - Have a Q? Ask.
  - Confident in your skills/knowledge? _See how well you can explain it._
- Small group sessions:
  - Discuss pre-work, explore one another's solutions.
  - Reconvene and present your team's cleanest solution / clearest explanation.
- DELIVERABLE:
  - Better version of each pre-work submission.
  - Cite any resources (human or other) you find helpful, as in-line comments.
  - Will be stored in your new work repo.

Your work repo should take on this structure:

```
cohort-3-summer-work_csci70900-tofr/programming$ tree
.
├── 0
│   └── readme.md
├── 1
│   └── readme.md
├── 2
│   └── readme.md
├── 3
│   └── readme.md
├── 4
│   └── readme.md
├── 5
│   └── readme.md
├── 6
│   └── readme.md
├── 7
│   └── readme.md
├── 8
│   └── readme.md
├── pre
│   ├── 0
│   │   └── readme.md
│   ├── 1
│   │   └── readme.md
│   ├── 2
│   │   └── readme.md
│   ├── 3
│   │   └── readme.md
│   ├── 4
│   │   └── readme.md
│   ├── 5
│   │   └── readme.md
│   ├── 6
│   │   └── readme.md
│   ├── 7
│   │   └── readme.md
│   ├── 8
│   │   └── readme.md
│   └── 9
│       └── readme.md
└── README.org
```

* * *

### Day 1 | Day 0b0001 | Day 0x01 : 6/30

Demo: Starting a new coding assignment from scratch in repl.it

#### Work: Game of Nim

#### Lecture: Java basics, 1D arrays

* * *

### Day 2 | Day 0b0010 | Day 0x02 : 7/1

Team demos: Game of Nim

new team formation...

#### Work: 1D Array Lab

Lab work time in small groups.

#### Lecture: Arrays, continued...

Lab work time in small groups.

#### Lecture: Recursion Basics -- Food for Thought (...and Later, Digestion)
- visuals: 
  - [1. Blastoff!](
http://pythontutor.com/java.html#code=public%20class%20YourClassNameHere%20%7B%0A%0Apublic%20static%20void%20main%28String%5B%5D%20args%29%20%7B%0A%20%20int%20x%20%3D%203%3B%0A%20%20countdown%28x%29%3B%0A%7D%0A%0Apublic%20static%20void%20countdown%28int%20n%29%20%7B%0A%20%20if%20%28n%20%3D%3D%200%29%20%7B%0A%20%20%20%20System.out.println%28%22Blastoff%22%29%3B%0A%20%20%7D%20else%20%7B%0A%20%20%20%20System.out.println%28n%29%3B%0A%20%20%20%20countdown%28n%20-%201%29%3B%0A%20%20%7D%0A%7D%0A%0A%7D%0A//&cumulative=false&curInstr=0&heapPrimitives=nevernest&mode=display&origin=opt-frontend.js&py=java&rawInputLstJSON=%5B%5D&textReferences=false
)
  - [2. Factorial](
http://pythontutor.com/java.html#code=public%20class%20ClassNameHere%20%7B%20%0A%20%20%20%0A%20%20%20public%20static%20void%20main%28String%5B%5D%20args%29%20%7B%0A%20%20%20%20%20%20int%20x%20%3D%204%3B%0A%20%20%20%20%20%20factorial%28x%29%3B%0A%20%20%20%7D%0A%0A%20%20%20public%20static%20int%20factorial%28int%20n%29%20%7B%0A%20%20%20%20%20%20if%20%28n%20%3D%3D%200%29%20%7B%0A%20%20%20%20%20%20%20%20%20return%201%3B%0A%20%20%20%20%20%20%7D%20else%20%7B%0A%20%20%20%20%20%20%20%20%20int%20recurse%20%3D%20factorial%28n-1%29%3B%0A%20%20%20%20%20%20%20%20%20int%20result%20%3D%20n%20*%20recurse%3B%0A%20%20%20%20%20%20%20%20%20System.out.println%28n%29%3B%0A%20%20%20%20%20%20%20%20%20System.out.println%28%22%20%20%22%29%3B%0A%20%20%20%20%20%20%20%20%20System.out.println%28result%29%3B%0A%20%20%20%20%20%20%20%20%20System.out.println%28%22%20%20%22%29%3B%0A%20%20%20%20%20%20%20%20%20System.out.println%28result%29%3B%0A%20%20%20%20%20%20%20%20%20return%20result%3B%0A%20%20%20%20%20%20%7D%0A%20%20%20%7D%0A%0A%7D&cumulative=false&curInstr=0&heapPrimitives=nevernest&mode=display&origin=opt-frontend.js&py=java&rawInputLstJSON=%5B%5D&textReferences=false
)

Lab work time in small groups.

