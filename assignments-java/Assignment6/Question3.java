package Assignment6;

class Sample{
    Sample(String value){
        System.out.println(value);
    }
}

public class Question3{
    public static void main(String args[]){
        Sample[] object=new Sample[3];
        object[0]=new Sample("Mir Rafath Ali");
        object[1]=new Sample("CSE-B");
        object[2]=new Sample("Roll No: 100");
    }
}
