# Matrix 2 - Hardcoded Printer

Prints a fixed 5x5 integer matrix in tabular form using tab-separated columns.

## Entry Point

`DDArrayPrinter.java`

## How It Works

The matrix is declared as a `private static final` literal at the top of the file
holding the integers 1-25 in row-major order. The program iterates with nested
`for` loops and prints each cell followed by a tab, emitting a newline at the end
of every row.

## Sample Run

```
1    2    3    4    5
6    7    8    9    10
11   12   13   14   15
16   17   18   19   20
21   22   23   24   25
```

(Tabs in the actual output are wider than spaces.)

## Compile and Run

```bash
javac DDArrayPrinter.java
java DDArrayPrinter
```