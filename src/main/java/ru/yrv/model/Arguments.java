package ru.yrv.model;

/**
 * The arguments class for quadratic equation
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 24.07.2020
 * @version 1.0
 */
public class Arguments {
    private Double a;
    private Double b;
    private Double c;

    public Arguments() {

    }

    public Arguments(Arguments args) {
        this.a = args.getA();
        this.b = args.getB();
        this.c = args.getC();
    }

    public Arguments(Double a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(Double c) {
        this.c = c;
    }
}

