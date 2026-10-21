package Projects.Day1;

public class Calculator {

    static void addNumbers(int a,int b){
        int c=a+b;
        System.out.println("Addition :"+c);
    }
    static void subNumbers(int a,int b){
        int c=a-b;
        System.out.println("Subtraction : "+c);
    }
    static void multiplyNumbers(int a,int b){
        int c=a*b;
        System.out.println("Multiplication : "+c);
    }
    static void divideNumbers(int a,int b){
        if(b==0){
            System.out.println("Cannot divide by zero");

        }else {
            double c=(double) a/b;
            System.out.println("Divide : "+c);
        }

    }
    static void calculate(int a,int b,char c){
        switch (c){
            case '+'->addNumbers(a,b);
            case '-'->subNumbers(a,b);
            case '*'->multiplyNumbers(a,b);
            case '/'->divideNumbers(a,b);
            default -> System.out.println("Enter Valid operator");
        }
    }

    public static void main(String[] args) {
        calculate(20,10,'+');
        calculate(50,20,'-');
        calculate(6,5,'*');
        calculate(10,4,'/');
        calculate(10,0,'/');
    }
}
