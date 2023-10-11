package com.example.trianglegraph2;

import java.text.Format;
import java.text.NumberFormat;

import static java.lang.Math.sqrt;

public class Triangle {

    int A, B, C;

    public Triangle(int a, int b, int c) throws MineExcept, NegativeLenException {
        if (a <= 0){
            throw new NegativeLenException(a);
        }
        if (b <= 0){
            throw new NegativeLenException(b);
        }
        if (c <= 0){
            throw new NegativeLenException(c);
        }

        if (((a + b) < c) || ((a + c) < b) || ((b + c) < a))
            throw new MineExcept();
        A = a;
        B = b;
        C = c;

    }

//    public Triangle(Object o) {
//        try {
//            if (o instanceof Integer) {
//                A = (int) o;
//                B = (int) o;
//                C = (int) o;
//            }
//        } catch (NumberFormatException exception) {
//            System.out.println("Exception: " + exception);
//        }
//    }



    double getArea() {
        double p = (double) (A + B + C) / 2;
        return sqrt(p * (p - A) * (p - B) * (p - C));
    }

}
