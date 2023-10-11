package com.example.trianglegraph2;

public class NegativeLenException extends Exception{
    double badLen;

    public NegativeLenException(double badLen) {
        this.badLen = badLen;
    }

    @Override
    public String toString() {
        return "NegativeLenException{" +
                "badLen=" + badLen +
                '}';
    }
}
