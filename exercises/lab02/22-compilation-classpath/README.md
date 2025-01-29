# Compilation and Classpath

## Using the Classpath During Compilation and Multiple-Path Classpath

1. Try compiling the `UseComplex.java` file inside the `bin` folder (which should be created).
   - Uh-oh... Error.
2. Carefully read the error message: what is the compiler complaining about?
3. The provided class requires `ComplexNum` to work, but `ComplexNum` was provided in the previous exercise. Using the appropriate `-cp` option of `javac`, compile `UseComplex.java` into the `bin` folder, utilizing the *compiled* `ComplexNum` class from the previous exercise. Consider the following constraints:
   - **Do not move any files** (source or compiled).
   - **Do not recompile the `ComplexNum` source**.
   - Keep the terminal in the folder that contains `src`.
   - Remember that `..` means "one directory level above the current directory" (i.e., the folder that contains the current folder).
   - Note that `javac -d bin -cp ../01-packages/bin FILETOCOMPILE` tells `javac` that it should also use compiled classes from the path `../01-packages/bin`.
4. Run `UseComplex` with the command: `java -cp bin compilation.lab.math.UseComplex`.
   - Uh-oh... Error. Read it carefully: why did the interpreter throw an error? (Note: if no error occurs, consult the instructor; something was likely missed at step 3).
5. Run the class `compilation.lab.math.UseComplex`, properly specifying multiple paths in the classpath. To do this, keep in mind:
   - The path separator is `:` on Linux and `;` on Windows.
   - The command `java -cp bin:../01-packages/bin CLASSNAME` (Unix format; use `;` as the separator on Windows) tells the Java interpreter to load classes not only from the current location but also from the `bin` folder and the folder `../01-packages/bin`.
