package calc_oop;

public class Base {
    public static void main(String[] args) {
        Operation oper = new Operation();
        Сalculation calc = new Сalculation();
        oper.calculation();
        System.out.printf("Результат операции: %.4f", oper.getResult());
        oper.getResult();
        calc.getOperand1();

    }
}