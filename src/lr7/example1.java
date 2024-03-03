package lr7;

class example {
    private String text;

    public example(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Superclass: " + text;
    }
}

// Подкласс, наследующий суперкласс
class Subclass extends example {
    private String additionalText;

    public Subclass(String text, String additionalText) {
        super(text);
        this.additionalText = additionalText;
    }

    public Subclass(String text) {
        super(text);
    }

    @Override
    public String toString() {
        if (additionalText != null) {
            return "Subclass: " + super.toString() + ", " + additionalText;
        } else {
            return "Subclass: " + super.toString();
        }
    }
}

public class example1 {
    public static void main(String[] args) {
        example superClassObject = new example("Hello");
        System.out.println(superClassObject.toString());

        Subclass subClassObject1 = new Subclass("Hi", "World");
        System.out.println(subClassObject1.toString());

        Subclass subClassObject2 = new Subclass("Hey");
        System.out.println(subClassObject2.toString());
    }
}
