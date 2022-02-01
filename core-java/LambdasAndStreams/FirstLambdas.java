package LambdasAndStreams;

public class FirstLambdas {
    interface Greeting{
        public String sayHello(String g);
    }

    public void testGreeting(String a,Greeting g){
        String result=g.sayHello(a);

        System.out.println("Result:"+result);
    }

    public static void main(String args[]){
        //input -> body
        //(String s) -> "Hello, "+s;
        new FirstLambdas().testGreeting("Rafath",(String s) -> "Hello, "+s);

        new FirstLambdas().testGreeting("Mr. Rohit",(String s) -> "Hello, "+s);

        new FirstLambdas().testGreeting("",
                (String p)-> !p.isEmpty()? "Howdy, "+p: "Did you miss something?");
    }
}
