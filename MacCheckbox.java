package DesignPattern.GUIFACTORY;

public class MacCheckbox implements Checkbox{
    @Override
    public String Type() {
        return "MacBook hai bhai, Apple hai";
    }

    @Override
    public String Colour() {
        return "Grey ";
    }

    @Override
    public String State() {
        return "Clicked hai bhai";
    }
}
