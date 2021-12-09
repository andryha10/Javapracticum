package T4_1;
import Task_3_1.Util;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public int gcd(int a, int b) {
    	   if (b==0) return a;
    	   return gcd(b,a%b);
    }
    public void Skorotiti(){
        int gcd = gcd(numerator, denominator);
        this.numerator /= gcd;
        this.denominator /= gcd;
    }

    public Fraction add(Fraction fraction){
        if(denominator == fraction.denominator)
        {
            numerator += fraction.numerator;
        }
        else
        {
            numerator*= fraction.denominator;
            fraction.numerator *= denominator;
            numerator += fraction.numerator;
            denominator *= fraction.denominator;
        }
        return this;
    }

    @Override
    public String toString(){
        return numerator + "/" + denominator;
    }
}