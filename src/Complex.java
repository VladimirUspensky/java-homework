public class Complex {
    private double re;
    private double im;

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public Complex(double re) {
        this(re, 0);
    }

    public Complex(Complex complex) {
        this.re = complex.re;
        this.im = complex.im;
    }

    public Complex sub(Complex complex) {
        this.re -= complex.re;
        this.im -= complex.im;
        return this;
    }

    public Complex add(Complex complex) {
        this.re += complex.re;
        this.im += complex.im;
        return this;
    }

    public Complex multiply(Complex complex) {
        this.re *= complex.re;
        this.im *= complex.im;
        return this;
    }

    public Complex div(Complex complex) {
        this.re /= complex.re;
        this.im /= complex.im;
        return this;
    }
}