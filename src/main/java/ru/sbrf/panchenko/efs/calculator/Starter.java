package ru.sbrf.panchenko.efs.calculator;

import ru.sbrf.panchenko.efs.calculator.calc.Calc;
import ru.sbrf.panchenko.efs.calculator.calc.impl.CalcImpl;

import javax.script.ScriptException;
import java.util.Scanner;

public class Starter {
    public static void main(String[] args) throws ScriptException {
        Starter starter = new Starter();
        starter.startClientInteraction();
    }

    private void startClientInteraction() throws ScriptException {
        System.out.println("Enter your expression here and press \"Enter\" button:");
        Scanner scanner = new Scanner(System.in);
        String inputExp = scanner.nextLine();
        CalcImpl calc = new CalcImpl(inputExp);
        System.out.println("Result: " + calc.calculate());
        System.out.println("Thx, gl.");
    }
}
