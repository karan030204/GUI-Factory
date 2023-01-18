package DesignPattern.GUIFACTORY;

public class Application {
    public static void main(String[] args) {

        System.out.println();

        System.out.println("-----------WinFactory---------");

        //WinFactory
        GUIFactory factory1 = new WinFactory();
        Button btn = factory1.createButton();
        Checkbox chk = factory1.createCheckbox();

        //For WinButton
        System.out.println("Colour of Button : "+btn.Colour());
        System.out.println("Size of the Button : "+btn.Size());
        System.out.println("Type of the Button : "+btn.Type());

        System.out.println();

        //For WinCheckbox
        System.out.println("Type of Checkbox : "+chk.Type());
        System.out.println("state of the Checkbox : "+chk.State());
        System.out.println("Colour of The Checkbox : "+chk.Colour());

        System.out.println();
        //MacFactory
        System.out.println("-----------MacFactory---------");
        GUIFactory factory2 = new MacFactory();
        Button btn2 = factory2.createButton();
        Checkbox chk2 = factory2.createCheckbox();

        //Macbutton
        System.out.println("Colour of The button : "+btn2.Colour());
        System.out.println("size of The button : "+btn2.Size());
        System.out.println("Type of The button : "+btn2.Type());

        System.out.println();

        //MacCheckbox
        System.out.println("State of the checkbox : "+chk2.State());
        System.out.println("Colour of the checkbox : "+chk2.Colour());
        System.out.println("Type of the checkbox : "+chk2.Type());



    }
}
