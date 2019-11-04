package ru.sbrf.panchenko.efs.calculator.calc;

import javax.script.ScriptException;

public interface Calc {
    String calculate() throws ScriptException;

    String getOp() throws ScriptException;
}
