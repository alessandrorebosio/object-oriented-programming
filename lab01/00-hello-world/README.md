# Hello, World!

## PHASE 1 - Understanding and Initial Compilation

Objective: get familiar with compiling and running the simplest program with observable output from the command line.

1. Open the `HelloWorld.java` file using the chosen text editor.
2. Study the behavior of the class before proceeding to the next steps (ask the instructor if you have any doubts).
3. Navigate to the folder in the terminal using the `cd` command.
4. Compile the source code of the class:
   * Use the command `javac HelloWorld.java` to invoke the Java compiler.
5. Run the resulting program:
   * Use the command `java HelloWorld` to invoke the JVM.
6. Make sure you understand why the file name is used with the extension in the `javac` command, but not in the `java` command. Ask the instructor if you're unsure.

## PHASE 2 - First Modifications to the Source Code

7. Add a new print statement with a custom message.
8. Recompile the source code, rerun the program, and verify it works as expected.
9. Modify the message to also include the result of the computation `50 + 50 * 50`.
   * NOTE 1: The computation must be performed by the Java interpreter (i.e., you must not pre-calculate the result and hardcode it into the output string).
   * NOTE 2: The expected result in standard output should look like: `Hello, world! 2550`.
   * NOTE 3: The computation in step (9) must be done in a single line of code: you cannot declare variables, and all operations must be performed *within* the `System.out.println()` call.
11. Compile and run the program again, verifying that it works as expected.
