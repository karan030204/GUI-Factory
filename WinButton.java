package DesignPattern.GUIFACTORY;

public class WinButton implements Button{

    @Override
    public String Type() {
        return "Windows type hai bhai";
    }

    @Override
    public String Colour() {
        return "Red Button";
    }

    @Override
    public int Size() {
        return 20;
    }
}
