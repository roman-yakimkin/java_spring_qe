package ru.yrv.tools;

import ru.yrv.model.Arguments;

/**
 * The constant inputer class
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 24.07.2020
 * @version 1.0
 */
public class ConstantInputer implements Inputer {
    @Override
    public Arguments getArguments() {
        return new Arguments(3.0, 4.0, 1.0);
    }
}
