# multiDimensionalArrays

Java console exercises for the **two-dimensional arrays** lab. Five small programs,
one per algorithm: read or build a matrix, then do something with it.

> **Note:** the repository name `multiDimensionalArrays` keeps the original
> capitalization from the first commit. The Java classes and folders follow
> standard PascalCase naming.

---

## Repository Layout

Each program lives in its own folder along with its own `README.md`. Higher-level
design notes live under `docs/`.

| Folder | Topic | Entry file |
| --- | --- | --- |
| `Matrix1_InputAndPrint/` | Read a user-sized 2D int matrix, then print it | `DDArrayInputAndPrint.java` |
| `Matrix2_HardcodedPrinter/` | Print a hard-coded 5x5 int matrix | `DDArrayPrinter.java` |
| `Matrix3_RowAverageCalculator/` | Read a user-sized 2D double matrix, then print each row's average | `DDArrayRowAverageCalculator.java` |
| `Matrix4_RowSumCalculator/` | Read a user-sized 2D int matrix, then print each row's sum | `DDArrayRowSumCalculator.java` |
| `Matrix5_DifferencesCounter/` | Read two same-sized 2D int matrices, then count the differing cells | `MatrixDifferencesCounter.java` |

## Prerequisites

- **JDK 8 or newer** (JDK 17+ recommended)
- Verify with `java -version` and `javac -version`

No external libraries. Pure JDK.

---

## How to Run

Pick any program and run it directly:

```bash
cd Matrix1_InputAndPrint
javac DDArrayInputAndPrint.java
java DDArrayInputAndPrint
```

```bash
cd Matrix2_HardcodedPrinter
javac DDArrayPrinter.java
java DDArrayPrinter
```

```bash
cd Matrix3_RowAverageCalculator
javac DDArrayRowAverageCalculator.java
java DDArrayRowAverageCalculator
```

```bash
cd Matrix4_RowSumCalculator
javac DDArrayRowSumCalculator.java
java DDArrayRowSumCalculator
```

```bash
cd Matrix5_DifferencesCounter
javac MatrixDifferencesCounter.java
java MatrixDifferencesCounter
```

---

## Documentation

- [Matrix 1 - Input and Print](docs/matrix-1-input-and-print.md)
- [Matrix 2 - Hardcoded Printer](docs/matrix-2-hardcoded-printer.md)
- [Matrix 3 - Row Average Calculator](docs/matrix-3-row-average-calculator.md)
- [Matrix 4 - Row Sum Calculator](docs/matrix-4-row-sum-calculator.md)
- [Matrix 5 - Differences Counter](docs/matrix-5-differences-counter.md)

---

## Concepts Covered

- Declaring and instantiating 2D arrays (`new int[rows][columns]`, `new double[rows][columns]`)
- Iterating 2D arrays with nested `for` loops (row-major order)
- Distinguishing `array.length` (rows) from `array[i].length` (columns)
- Populating matrices with `Scanner` input
- Pretty-printing matrices with `\t` and `printf` (`%.2f`)
- Row-wise aggregation: `sum`, `average`
- Comparing two matrices element-by-element and counting differences
- Hard-coded (literal) matrices vs. user-populated matrices
- `Scanner.nextInt` / `Scanner.nextDouble` for typed input
- Input validation with `Scanner.hasNextInt` / `Scanner.hasNextDouble` and re-prompt loops

---

## What Changed from the Old Repo

The original commit dumped all five `.java` files at the repo root with no
`README`, no `LICENSE`, no `.gitignore`, and a couple of rough edges (lowercase
class name `matrixDifferencesEncounter`, weird variable names like `forday`,
`noIdea`, `average`, `calculator`, and `matrix`). This restructured version:

- Moves each program into its own folder
- Renames `matrixDifferencesEncounter` -> `MatrixDifferencesCounter` (PascalCase)
- Renames confusing variables (`forday` -> `SCANNER`, `noIdea` -> `GRID`, etc.)
- Adds `Scanner.hasNextInt` / `hasNextDouble` validation so non-numeric input
  re-prompts instead of crashing
- Adds per-folder `README.md` and a `docs/` entry per program
- Adds the missing `LICENSE` (MIT) and `.gitignore`

---

## License

Released under the [MIT License](LICENSE).

---

## Author

**zhameersheraz**