package lr6;

public class Example1 {

    private char symbolField;
    private String textField;

    public void setValue(char value) {
        symbolField = value;
    }

    public void setValue(String value) {
        textField = value;
    }

    public void setValue(char[] value) {
        if (value.length == 1) {
            symbolField = value[0];
        } else {
            textField = new String(value);
        }
    }

    public static void main(String[] args) {
        Example1 myObject = new Example1();

        myObject.setValue('A');
        System.out.println(myObject.symbolField);

        myObject.setValue("Hello");
        System.out.println(myObject.textField);

        char[] array = {'J', 'a', 'v', 'a'};
        myObject.setValue(array);
        System.out.println(myObject.textField);
    }
}
