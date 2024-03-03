package lr7;

class examle {
    public int intValue;

    public examle(int intValue) {
        this.intValue = intValue;
    }

    public void setValue(int value) {
        this.intValue = value;
    }

    public String toString() {
        return "SuperClass: intValue = " + intValue;
    }
}

class SubClass1 extends examle {
    public char charValue;

    public SubClass1(int intValue, char charValue) {
        super(intValue);
        this.charValue = charValue;
    }

    public void setValue(int value, char c) {
        super.setValue(value);
        this.charValue = c;
    }

    public String toString() {
        return "SubClass1: intValue = " + intValue + ", charValue = " + charValue;
    }
}

class SubClass2 extends SubClass1 {
    public String stringValue;

    public SubClass2(int intValue, char charValue, String stringValue) {
        super(intValue, charValue);
        this.stringValue = stringValue;
    }

    public void setValue(int value, char c, String str) {
        super.setValue(value, c);
        this.stringValue = str;
    }

    public String toString() {
        return "SubClass2: intValue = " + intValue + ", charValue = " + charValue + ", stringValue = " + stringValue;
    }
}

public class example3 {
    public static void main(String[] args) {
        examle superClass = new examle(10);
        System.out.println(superClass.toString());

        SubClass1 subClass1 = new SubClass1(20, 'A');
        System.out.println(subClass1.toString());

        SubClass2 subClass2 = new SubClass2(30, 'B', "Hello");
        System.out.println(subClass2.toString());
    }
}