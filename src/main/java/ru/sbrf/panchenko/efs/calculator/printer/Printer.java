package ru.sbrf.panchenko.efs.calculator.printer;

import org.w3c.dom.ls.LSOutput;
import ru.sbrf.panchenko.efs.calculator.calc.Calc;

public interface Printer {
    String printResult (Calc inputExp);
}
