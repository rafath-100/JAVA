package LambdasAndStreams;

import java.lang.reflect.Method;

interface Movie{
    public boolean check(int id);
}

public class MethodReferences {

    //static method reference usage
    public void testMovieStaticMethodRef(){
        Movie m1 = (i) -> i<100?true:false;
        Movie m2 = MethodReferences::isClassic;
    }
    //Instance method reference usage
    private void testMovieInstanceMethodsRef(){
        MethodReferences ref=new MethodReferences();
        Movie m1 = (i) -> i>10 && i<100?true:false;
        Movie m2 = ref:: isTop10;
    }
    private void testMovieArbitaryObjectMethod(){
        //Movie m1 = SomeMethodReferences::isComedy;
    }
    public boolean isTop10(int movie){
        return true;
    }
    public static boolean isClassic(int movieid){
        return true;
    }
    public static void main(String[] args) {

    }
}
