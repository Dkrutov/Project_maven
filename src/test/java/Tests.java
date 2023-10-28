import calc_oop.Operation;
import calc_oop.Сalculation;
import org.junit.Assert;
import org.junit.Test;
import test.Test1;
import test.Test2;

public class Tests {

    @Test
    public void test1() {
        Test1 box = new Test1();
        Assert.assertEquals("вес",0, box.getA());

    }

    @Test
    public void operAdditionPositiv() {
        Operation oper = new Operation();
        Assert.assertEquals(5.3,oper.Addition(3.2,2.1),0.001);
    }

    @Test
    public void operAdditionNegativ() {
        Operation oper = new Operation();
        Assert.assertEquals("Ошибка вычисления",1.1,oper.Addition(3.2,2.1),0.001);
    }

    @Test
    public void operDivisionPositiv() {
        Operation oper = new Operation();
        Assert.assertEquals("Ошибка вычисления",2.5,oper.Division(5,2),0.001);
    }

    @Test
    public void operDivisionNegativ() {
        Operation oper = new Operation();
        Assert.assertEquals("Деление на 0",0,oper.Division(5,0),0.001);
    }

    @Test
    public void operCalc() {
        Operation oper = new Operation();
        Assert.assertNotNull("Результат", oper);
    }

    @Test
    public void calcculation() {
        Сalculation calc = new Сalculation();
        Assert.assertEquals("Не пройден",1,calc.getOperand1(),0.001);
    }





}
