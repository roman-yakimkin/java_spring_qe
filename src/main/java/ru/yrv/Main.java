package ru.yrv;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.yrv.model.Results;
import ru.yrv.tools.Calculator;
import ru.yrv.tools.ConsoleOutputer;
import ru.yrv.tools.Outputer;

/**
 * The main class
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 26.07.2020
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("qe.xml");
        Calculator calc = (Calculator) ctx.getBean("calculator");
        calc.calculate();
        Outputer outputer = (ConsoleOutputer) ctx.getBean("outputer");
        Results results = (Results) ctx.getBean("results");
        outputer.output(results);
    }
}
