package test;

public class App {
    public static void main(String[] args) {
        Test1[] box =new Test1[3];

        Test2 abc = new Test2();
        abc.setB(3);
        System.out.println(abc.getA());

        Test1 qwerty = new Test1(2);
        System.out.println(qwerty.getA());

        Test1 abc123 = new Test1(1, 3);
        System.out.println(abc123.getA() + abc123.getB());

        box[1] = qwerty;
        box[2] = abc;
        System.out.println("Бокс 1" + box[1]);
        System.out.println("Бокс 2" + box[2]);
        int sum = abc.getSum(qwerty.getA(), abc123.getA());
        System.out.println("sum: " + sum);

    }
}
