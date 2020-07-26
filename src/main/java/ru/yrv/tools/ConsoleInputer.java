package ru.yrv.tools;

import ru.yrv.model.Arguments;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;

/**
 * The constant inputer class
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 24.07.2020
 * @version 1.0
 */
public class ConsoleInputer implements Inputer {
    @Override
    public Arguments getArguments() {
        String prompts[] = {"Input a: ", "Input b: ", "Input c:"};
        List<Double> results = new ArrayList<>();
        Console console = System.console();
        for (String prompt : prompts) {
            boolean inputtedCorrectly = false;
            do {
                System.out.println(prompt);
                String line = console.readLine();
                try {
                    Double value = Double.parseDouble(line);
                    inputtedCorrectly = true;
                    results.add(value);
                } catch (NumberFormatException exception) {
                    inputtedCorrectly = false;
                    System.out.println("You've inputted an incorrect double value. Please, input it again");
                }
            } while (!inputtedCorrectly);
        }
        return new Arguments(results.get(0), results.get(1), results.get(2));
    }
}
