# Matrix 1 - Input and Print

Source: `Matrix1_InputAndPrint/DDArrayInputAndPrint.java`

## Goal

Practice the basics of 2D arrays: declare, populate, and print.

## Design

A single `Scanner` is held in a `private static final` field. Two helpers
(`readInt`, `readPositiveInt`) keep the input code in `main` flat.

```
rows   = readPositiveInt(...)
cols   = readPositiveInt(...)
matrix = new int[rows][cols]
for i in 0..rows-1:
    for j in 0..cols-1:
        matrix[i][j] = readInt("Element at [i][j]: ")
print matrix[i][j] with a single space between cells, newline per row
```

## Notes

- The original code had a `Scanner` named `forday` and no validation. The
  cleaned-up version renames it to `SCANNER` and rejects non-integer tokens.
- Dimensions are forced to be positive to avoid `NegativeArraySizeException`
  and zero-sized arrays that produce empty output.

## Sample Run

```
Enter the number of rows: 2
Enter the number of columns: 3
Enter the elements of the array:
Element at [0][0]: 1
Element at [0][1]: 2
Element at [0][2]: 3
Element at [1][0]: 4
Element at [1][1]: 5
Element at [1][2]: 6
Elements of the array:
1 2 3
4 5 6
```