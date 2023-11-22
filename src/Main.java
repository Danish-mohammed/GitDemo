class Demo{
    void add(){
        int num1 = 4;
        int num2 = 5;
        int sum = num1 + num2;
        System.out.println(sum);
    }
}

public class Main {
    public static void main(String[] args) {
        Demo obj = new Demo();
        System.out.println("Hello world!");
        obj.add();
    }
}

