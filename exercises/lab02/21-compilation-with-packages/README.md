# Compilation and Packaging

## Compilation and Execution from Arbitrary Locations of Classes Contained in Packages

1. Observe the content of the `src` folder. Note how it doesn't directly contain Java source files but rather a hierarchy of folders; inside the last folder, there is a source file.
2. View the contents of the source file (e.g., using `cat`/`head` on Unix or `type` on Windows) and note that the class's package corresponds to the directory structure that contains the source file.
    - **Note**: It's good practice to organize your source files so that their file system structure replicates the package structure. However, since the compiler works with files, this choice is not strictly required.
3. Position the terminal to point to the folder that *contains* `src`; that is, the folder where the `ls` (or `dir` on Windows) command will list `src` among its contents.
4. Compile the `ComplexNum.java` file inside a new `bin/` folder.
5. Make a prediction about the contents of `bin` (in terms of which folders and files will be inside).
6. Verify your prediction.
7. Run the class using the command: `java -cp bin ComplexNum`
    - Uh-oh... error. Why? Try to understand the reason and correct the command.
8. Change the terminal to `bin/compilation/lab/math/`.
9. Try running the class using the command: `java ComplexNum`
    - Uh-oh... error. Why? The `ComplexNum.class` file is right there. Try to understand the reason and correct the command.
