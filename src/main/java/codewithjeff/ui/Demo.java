package codewithjeff.ui;

public class Demo {

    public static void main(String[] args) {
        UIControl uiControl = new UIControl();
        TextBox textBox = new TextBox();
        show(uiControl);
}

    public static void show(UIControl control){
        if (control instanceof TextBox) {
            TextBox textBox = (TextBox) control;
            textBox.setName("eee");
        } else {
            control.setName("control123");
        }
        System.out.println(control);
    }
}
