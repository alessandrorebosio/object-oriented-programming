# Organizing Source Code and Bytecode

#### PHASE 1 - Compilation to Arbitrary Paths

1. Observe the project structure: the `src` folder contains the source code.
2. Create a new `bin` folder:
    - On Unix: use the command `mkdir`
    - On Windows: use the command `md`
    - Do not use the file manager!
3. Compile the code by specifying `bin` as the output destination for the compilation:
    - On Unix: `javac -d bin src/Calculator.java`
    - On Windows: `javac -d bin src\Calculator.java`
    - Note the different path separator.
4. Check that `Calculator.class` is present inside `bin`:
    - On Unix: `ls bin`
    - On Windows: `dir bin`
5. Change the terminal's working directory to `bin` (use the `cd` command).
6. Run the `Calculator` class.

#### PHASE 2 - Execution with Explicit Classpath

1. Position the terminal in the folder that contains both `src` and `bin`.
2. From this location, execute the `Calculator` class using the appropriate `-cp` option (refer to the lab slides).
3. Move the terminal to the root of the file system:
    - On Unix, `/`
    - On Windows, `C:\` (or another drive letter if the file isn't located in `C:`)
4. Without changing the terminal's location, execute `Calculator` again.
