package Assignment7;

interface CycleNew{
    void code();
    void factories();

}
class UnicycleNew implements CycleNew{
    public void code(){
        factories();
    }
    public void factories(){
        System.out.println("Code of Unicycle is U_cyc.");
    }

};
class BicycleNew implements CycleNew{
    public void code(){
        factories();
    }
    public void factories(){
        System.out.println("Code of Bicycle is B_cyc.");
    }
};
class TricycleNew implements CycleNew{
    public void code(){
        factories();
    }
    public void factories(){
        System.out.println("Code of tricycle is T_cyc.");
    }
};
class Question4 {
    public static void main(String[] args){
        UnicycleNew obj = new UnicycleNew();
        obj.code();
        BicycleNew obj1 = new BicycleNew();
        obj1.code();
        TricycleNew obj2 = new TricycleNew();
        obj2.code();
    }
}