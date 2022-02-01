package Assignment6;

public class Question2{

    Question2() {
        System.out.println("This is constructor 1 and it is running. ");
    }
    Question2(int number) {
        this();
        System.out.println(number);
    }
    public static void main(String[] args) {
        Question2 obj = new Question2(5);
    }
}
