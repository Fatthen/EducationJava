package lr7;

class Super {
    protected String text;

    public Super(String text) {
        this.text = text;
    }

    public void displayInfo() {
        System.out.println("Class Name: " + this.getClass().getSimpleName());
        System.out.println("Text Field Value: " + text);
    }
}

class Sub1 extends Super {
    protected int number;

    public Sub1(String text, int number) {
        super(text);
        this.number = number;
    }

    @Override
    public void displayInfo() {
        System.out.println("Class Name: " + this.getClass().getSimpleName());
        System.out.println("Text Field Value: " + text);
        System.out.println("Number Field Value: " + number);
    }
}

class Sub2 extends Super {
    protected char character;

    public Sub2(String text, char character) {
        super(text);
        this.character = character;
    }

    @Override
    public void displayInfo() {
        System.out.println("Class Name: " + this.getClass().getSimpleName());
        System.out.println("Text Field Value: " + text);
        System.out.println("Character Field Value: " + character);
    }
}

public class example5 {
    public static void main(String[] args) {
        Super obj1 = new Sub1("Hello", 42);
        Super obj2 = new Sub2("World", 'A');

        obj1.displayInfo();
        System.out.println("-------------------");
        obj2.displayInfo();
        System.out.println("-------------------");

        // Вызов метода через объектную переменную суперкласса, которая ссылается на объект производного класса
        Super obj3 = new Sub1("Goodbye", 99);
        obj3.displayInfo();
    }
}
