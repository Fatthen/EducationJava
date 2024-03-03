package lr7;

class FirstClass {
    public char symbol;

    public FirstClass(char symbol) {
        this.symbol = symbol;
    }

    public FirstClass(FirstClass original) {
        this.symbol = original.symbol;
    }
}

// Класс с символьным и текстовым полями
class SecondClass extends FirstClass {
    public String text;

    public SecondClass(char symbol, String text) {
        super(symbol);
        this.text = text;
    }

    public SecondClass(SecondClass original) {
        super(original);
        this.text = original.text;
    }
}

// Класс с символьным, текстовым и целочисленным полями
class ThirdClass extends SecondClass {
    public int number;

    public ThirdClass(char symbol, String text, int number) {
        super(symbol, text);
        this.number = number;
    }

    public ThirdClass(ThirdClass original) {
        super(original);
        this.number = original.number;
    }
}

public class example4 {
    public static void main(String[] args) {
        // Создание объектов каждого класса
        FirstClass obj1 = new FirstClass('A');
        SecondClass obj2 = new SecondClass('B', "Hello");
        ThirdClass obj3 = new ThirdClass('C', "World", 123);

        // Создание копий объектов
        FirstClass obj1Copy = new FirstClass(obj1);
        SecondClass obj2Copy = new SecondClass(obj2);
        ThirdClass obj3Copy = new ThirdClass(obj3);
    }
}
