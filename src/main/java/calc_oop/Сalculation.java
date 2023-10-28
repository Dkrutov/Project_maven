package calc_oop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Сalculation {
    private double operand1;
    private double operand2;
    private char znak;

    public double getOperand1() {
        return operand1;
    }

    public void setOperand1() {
        boolean inputCorrect = false;
        while (!inputCorrect) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое значение: ");
            try {
                operand1 = scanner.nextDouble();
                inputCorrect = true;
            } catch (InputMismatchException e) {
                System.out.println("ERR:" + e);
                System.out.println("Введите число");
                continue;
            }
        }
    }

    public double getOperand2() {
        return operand2;
    }

    public void setOperand2() {
        boolean inputCorrect = false;
        while (!inputCorrect) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите второе значение: ");
            try {
                operand2 = scanner.nextDouble();
                inputCorrect = true;
            }catch (InputMismatchException e) {
                System.out.println("ERR:" + e);
                System.out.println("Введите число");
                continue;
            }
        }
    }

    public char getZnak() {
        return znak;
    }

    public void setZnak() {
        boolean inputCorrect = false;
        while (!inputCorrect) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Выберите тип операции с числами: '+', '-', '*', '/'");
            znak = scanner.next().charAt(0);
            if ("+".equals(String.valueOf(znak))) {
                inputCorrect = true;
            } else if ("-".equals(String.valueOf(znak))) {
                inputCorrect = true;
            } else if ("*".equals(String.valueOf(znak))) {
                inputCorrect = true;
            } else if ("/".equals(String.valueOf(znak))) {
                inputCorrect = true;
            } else {
                System.out.println("Введен не верный знак");
            }
        }
    }





}

