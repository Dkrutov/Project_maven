package test;

public class Test1 {
    public int a=6;
    public int b;


    public Test1 () {

    }

    public Test1 (int a) {
        this.a = a;
    }

    public Test1 (int a, int b){
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }


}
