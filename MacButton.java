package DesignPattern.GUIFACTORY;

public class MacButton implements Button{
    @Override
    public String Type() {
        return "Apple button hai bhai";
    }

    @Override
    public String Colour() {
        return "Purple";
    }

    @Override
    public int Size() {
        return 30;
    }
}
