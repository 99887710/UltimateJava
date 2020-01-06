package codewithjeff.ui;

public class TextBox extends UIControl{

    private int width;
    private int height;

    public TextBox() {
        super(true);
    }

    @Override
    public void setName(String name) {
        super.setName("TextBox name: " + name);
    }

    @Override
    public String toString() {
        return "TextBox= " + name;
    }
}
