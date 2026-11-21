# Mini Java Projects

Two standalone console programs written to practice object-oriented Java design. These are **educational simulations**, not production business applications.

## Projects

| Program | What it demonstrates |
| --- | --- |
| [EmployeeProject.java](employee%20project/src/EmployeeProject.java) | Add, list and find employees using classes and `ArrayList` |
| [Bankfinal1.java](employee%20project/src/Bankfinal1.java) | Example accounts, deposits, withdrawals and conditional minimum-balance checks |

## Run locally

Install a Java Development Kit, then choose one of the programs:

```bash
cd "employee project/src"
javac EmployeeProject.java
java EmployeeProject
```

For the banking simulation instead:

```bash
javac Bankfinal1.java
java Bankfinal1
```

## Technical boundaries

The programs store state in memory. The banking example uses hard-coded demonstration accounts and floating-point balances: **do not use it for real banking or money handling**. There is no persistent database, authentication, or confirmed automated test suite. Future work: validate inputs, separate console interaction from domain logic, and add edge-case tests.
