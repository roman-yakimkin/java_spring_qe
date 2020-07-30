package ru.yrv.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import ru.yrv.model.Results;

import java.util.List;

/**
 * An aspect class for calculator class
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 30.07.2020
 * @version 1.0
 */
public class CalcAspect {

    public void pcDiscriminant(){}

    public void watchCalcDiscriminant(JoinPoint jp) {
        System.out.println(jp.getSignature().toString());
    }

    public void watchOutputResults(Results results) {
        List<Double> roots = results.getRoots();
        roots.forEach(System.out::println);
    }
}