package calc_oop;

public class Operation {
    private double result;
    private double operand1;
    private double operand2;
    private char znak;


    public double Addition (double operand1, double operand2){
        result = operand1 + operand2;
        return result;
    }

    public double Subtraction (double operand1, double operand2){
        result = operand1 - operand2;
        return result;
    }

    public double Multiplication (double operand1, double operand2){
        result = operand1 * operand2;
        return result;
    }

    public double Division (double operand1, double operand2){
        if (operand2 != 0) {
            result = operand1 / operand2;
            return result;
        } else {
            System.out.println("Деление на 0 запрещено!");
            result = 0;
            return result;
        }

    }

    public void  calculation(){
        Сalculation calc = new Сalculation();
        calc.setOperand1();
        calc.setOperand2();
        operand1 = calc.getOperand1();
        operand2 = calc.getOperand2();
        calc.setZnak();
        znak = calc.getZnak();
        if (calc.getZnak() == '+') {
            Addition(calc.getOperand1(),calc.getOperand2());
        }
        else if (calc.getZnak() == '-') {
            Subtraction(calc.getOperand1(),calc.getOperand2());
        }
        else if (calc.getZnak() == '*') {
            Multiplication(calc.getOperand1(),calc.getOperand2());
        }
        else if (calc.getZnak() == '/') {
            Division(calc.getOperand1(),calc.getOperand2());
        } else {
            System.out.println("Введен неверный знак");
        }
    }

    public double getResult() {
        return result;
    }

    public void  getPrint(){
        System.out.println("Вы ввели первое значение: " + operand1);
        System.out.println("Вы ввели второе значение: " + operand2);
        System.out.println("Вы ввели знак: " + znak);
        System.out.printf("Результат операции: %.4f", result);
    }
}
