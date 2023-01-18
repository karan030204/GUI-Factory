package DesignPattern.GUIFACTORY;

public class WinCheckbox implements Checkbox{

    @Override
    public String Type() {
        return "Window hai bhai";
    }

    @Override
    public String Colour() {
        return "Blue";
    }

    @Override
    public String State() {
        return "Not Clicked";
    }
}
