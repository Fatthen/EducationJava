package lr7;

class SuperClass {
    private String text;

    public SuperClass(String text) {
        this.text = text;
    }

    public int getLength() {
        return text.length();
    }

    public void setText() {
        this.text = "";
    }

    public void setText(String text) {
        this.text = text;
    }
}

// Подкласс
class SubClass extends SuperClass {
    int number;

    public SubClass(int number, String text) {
        super(text);
        this.number = number;
    }

    @Override
    public void setText() {
        super.setText();
        this.number = 0;
    }

    @Override
    public void setText(String text) {
        super.setText(text);
        this.number = 0;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setNumber(String text, int number) {
        super.setText(text);
        this.number = number;
    }
}

public class example2 {
    public static void main(String[] args) {
        SubClass obj = new SubClass(10, "Hello");

        System.out.println("Length of text: " + obj.getLength());
        System.out.println("Number: " + obj.number);

        obj.setText("Java");
        obj.setNumber(5);

        System.out.println("Length of text: " + obj.getLength());
        System.out.println("Number: " + obj.number);
    }
}
