# Matrix 2 - Hardcoded Printer

Source: `Matrix2_HardcodedPrinter/DDArrayPrinter.java`

## Goal

Demonstrate iterating a 2D array whose contents are known at compile time.

## Design

The matrix lives in a `private static final int[][]` constant `GRID` containing
1-25 in row-major order. There is no `Scanner`, no input, no validation - just
nested `for` loops and tab-separated output.

The unused `Scanner` from the original commit has been removed.

## Sample Run

```
1   2   3   4   5
6   7   8   9   10
11  12  13  14  15
16  17  18  19  20
21  22  23  24  25
```

(Actual output uses `\t` between cells, not spaces.)