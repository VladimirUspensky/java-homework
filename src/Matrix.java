public class Matrix {
    private final int rowLength;
    private final int columnLength;

    private final Complex[][] complexes;

    public Matrix(int rowLength, int columnLength, double complexValue) {
        this.rowLength = rowLength;
        this.columnLength = columnLength;

        this.complexes = new Complex[rowLength][columnLength];
        for (int rowIdx = 0; rowIdx < rowLength; rowIdx++) {
            for (int columnIdx = 0; columnIdx < columnLength; columnIdx++) {
                this.complexes[rowIdx][columnIdx] = new Complex(complexValue);
            }
        }
    }

    public Matrix add(Matrix matrix) {
        if (this.rowLength != matrix.rowLength || this.columnLength != matrix.columnLength) {
            return null;
        }
        for (int rowIdx = 0; rowIdx < this.rowLength; rowIdx++) {
            for (int columnIdx = 0; columnIdx < this.columnLength; columnIdx++) {
                this.complexes[rowIdx][columnIdx] =
                        this.complexes[rowIdx][columnIdx].add(matrix.complexes[rowIdx][columnIdx]);
            }
        }
        return this;
    }

    public Matrix sub(Matrix matrix) {
        if (this.rowLength != matrix.rowLength || this.columnLength != matrix.columnLength) {
            return null;
        }
        for (int rowIdx = 0; rowIdx < this.rowLength; rowIdx++) {
            for (int columnIdx = 0; columnIdx < this.columnLength; columnIdx++) {
                this.complexes[rowIdx][columnIdx] =
                        this.complexes[rowIdx][columnIdx].sub(matrix.complexes[rowIdx][columnIdx]);
            }
        }
        return this;
    }

    public Matrix multiply(Matrix matrix) {
        if (this.rowLength != matrix.rowLength || this.columnLength != matrix.columnLength) {
            return null;
        }
        for (int rowIdx = 0; rowIdx < this.rowLength; rowIdx++) {
            for (int columnIdx = 0; columnIdx < this.columnLength; columnIdx++) {
                this.complexes[rowIdx][columnIdx] =
                        this.complexes[rowIdx][columnIdx].multiply(matrix.complexes[rowIdx][columnIdx]);
            }
        }
        return this;
    }

    public Matrix multiply(Complex complex) {
        for (int rowIdx = 0; rowIdx < this.rowLength; rowIdx++) {
            for (int columnIdx = 0; columnIdx < this.columnLength; columnIdx++) {
                this.complexes[rowIdx][columnIdx] =
                        this.complexes[rowIdx][columnIdx].multiply(complex);
            }
        }
        return this;
    }

    public Matrix div(Complex complex) {
        for (int rowIdx = 0; rowIdx < this.rowLength; rowIdx++) {
            for (int columnIdx = 0; columnIdx < this.columnLength; columnIdx++) {
                this.complexes[rowIdx][columnIdx] =
                        this.complexes[rowIdx][columnIdx].div(complex);
            }
        }
        return this;
    }

    public Matrix div(Matrix matrix) {
        if (this.rowLength != matrix.rowLength || this.columnLength != matrix.columnLength) {
            return null;
        }
        for (int rowIdx = 0; rowIdx < this.rowLength; rowIdx++) {
            for (int columnIdx = 0; columnIdx < this.columnLength; columnIdx++) {
                this.complexes[rowIdx][columnIdx] =
                        this.complexes[rowIdx][columnIdx].div(matrix.complexes[rowIdx][columnIdx]);
            }
        }
        return this;
    }

    public void insert(Complex complex, int rowIdx, int columnIdx) {
        complexes[rowIdx][columnIdx] = complex;
    }

    public void insert(double value, int rowIdx, int columnIdx) {
        complexes[rowIdx][columnIdx] = new Complex(value);
    }
}
