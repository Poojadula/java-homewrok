class Number {
    int value;
}

public class Main {

    static void swap(Number a, Number b) {
        int temp = a.value;
        a.value = b.value;
        b.value = temp;
    }

    public static void main(String[] args) {

        Number a = new Number();
        Number b = new Number();

        a.value = 10;
        b.value = 20;

        swap(a, b);

        System.out.println("a = " + a.value + " b = " + b.value);
    }
}