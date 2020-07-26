package ru.yrv.tools;

import ru.yrv.model.Arguments;
import ru.yrv.model.Results;

/**
 * The calculator class to calculate quadratic equations
 * @author Roman Yakimkin (r.yakimin@yandex.ru)
 * @since 24.07.2020
 * @version 1.0
 */
public class Calculator {
    private Arguments arguments;
    private Results results;

    public Calculator() {

    }

    public Calculator(Arguments arguments, Results results) {
        this.arguments = arguments;
        this.results = results;
    }

    public void setArguments(Arguments arguments) {
        this.arguments = arguments;
    }

    public void setResults(Results results) {
        this.results = results;
    }

    private double discriminant() {
        return arguments.getB() * arguments.getB() - 4 * arguments.getA() * arguments.getC();
    }

    public void calculate() {
        double x1, x2;
        if (arguments.getA() == 0) {
            x1 = -arguments.getC() / arguments.getB();
            results.setResults(new Double[] {x1});
        } else if (discriminant() < 0) {
            results.setResults(new Double[] {});
        } else {
            x1 = (- arguments.getB() + Math.sqrt(discriminant())) / (2 * arguments.getA());
            x2 = (- arguments.getB() - Math.sqrt(discriminant())) / (2 * arguments.getA());
            results.setResults(new Double[] {x1, x2});
        }
    }
}
