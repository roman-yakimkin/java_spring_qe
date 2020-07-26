package ru.yrv.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * The results for quadratic equation
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 24.07.2020
 * @version 1.0
 */
public class Results {
    private List<Double> roots = new ArrayList<>();

    public Results() {
        
    }

    public void setResults(Double[] results) {
        roots.clear();
        roots.addAll(Arrays.asList(results));
    }

    public List<Double> getRoots() {
        return roots;
    }
}
