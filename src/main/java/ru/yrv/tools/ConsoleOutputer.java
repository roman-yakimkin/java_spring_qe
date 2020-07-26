package ru.yrv.tools;

import ru.yrv.model.Results;

import java.util.List;

/**
 * The console outputer class
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 24.07.2020
 * @version 1.0
 */
public class ConsoleOutputer implements Outputer {
    Results results;

    @Override
    public void output(Results results) {
        List<Double> roots = results.getRoots();
        int size = roots.size();
        String message = "";
        switch (size) {
            case 0:
                message = "This quadratic equation has no real roots";
                break;
            case 1:
                message = "This quadratic equation is a linear equation and it's root value = " + roots.get(0);
                break;
            case 2:
                message = "This quadratic equation has two real roots and their values = " + roots.get(0) + " and " + roots.get(1);
                break;
        }
        System.out.println(message);
    }
}
