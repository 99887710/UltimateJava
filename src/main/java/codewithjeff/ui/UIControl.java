package codewithjeff.ui;

public class UIControl {
    protected boolean isEnabled  = true;
    public String name;

    public UIControl() {
    }

    public UIControl(boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "UICtrol= " + name;
    }
}
