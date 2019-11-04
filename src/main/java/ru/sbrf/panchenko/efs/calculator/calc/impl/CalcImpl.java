package ru.sbrf.panchenko.efs.calculator.calc.impl;

import ru.sbrf.panchenko.efs.calculator.calc.Calc;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CalcImpl implements Calc {
    private String inputExp;


    public CalcImpl(String inputExp) {
        this.inputExp = inputExp;
    }

    @Override
    public String calculate() throws ScriptException {
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        String foo = this.inputExp;
        return engine.eval(foo).toString();

       // System.out.println(engine.eval(foo));


    }

    @Override
    public String getOp() throws ScriptException {
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        return String.valueOf(engine.eval(this.inputExp));
    }
}
