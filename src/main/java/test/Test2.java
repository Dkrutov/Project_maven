package test;

public class Test2 extends Test1 {
    private int c;

    public Test2(int a, int b, int c){
        super(a, b);
        this.c = c;
    }

    public Test2(){

    }

    public int getId() {
        return c;
    }

    public void setId(int c) {
        this.c = c;
    }

    public int getSum (int a, int c) {
        int sum = a + c;
        return sum;
    }
}
