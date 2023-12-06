# DSL

A small assignment to familiarize myself with Java DSL, created for my university module "modern software development".

<details>
 <summary>Peak assignment</summary>
 
 1. Build a meaningful Java DSL in the style of Expression Builders/Fluent Interfaces for your favorite domain. Of course, you can also do this in any other programming language.

 2. Play around with Xtext, ANTLR, (MPS), or other tools to create your own micro-language. There may be frameworks for this in your language. Alternatively, define keywords in your programming language, similar to what Mockito did (import static...).
</details>

<hr>

### Assignment part 1
The Java DSL was built in `Training.java`. An exemplary use can be found in `main.java`


### Assignment part 2
For this part of the assignment, ANTLR was chosen. Everything ANTLR-specific was moved into the folder `antlr_stuff`.

If the ANTLR dependency or the ANTLR plugin has not been used in this IDE before, it may need to be added manually. For this reason, I also moved it into the folder.
In IntelliJ, you can add the dependency via `File -> Project Structure -> Libraries -> + -> Java -> <select .jar>`.

The grammar can be found in `Rezept.g4`, all further files have been generated automatically by the ANTLR Plugin.

You can start the parser by calling the main-function in `main.java`.
