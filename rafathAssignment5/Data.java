package rafathAssignment5;

public class Data{
    public int integer;
    char character;
    public void display(){
        System.out.println("The value of integer is " +integer);
        System.out.println("the value of character is "+character );
    }
    public void show(){
        //without the initialization of local variable print their vaule in not possible.
        int secondInteger=0; //if these are not initialized we will get an error
        char secondCharacter='a';
        System.out.println("The value of another integer and character are: "+secondInteger);
        System.out.println(secondCharacter);
    }

}

