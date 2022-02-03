package LambdasAndStreams;

import java.util.*;
import java.util.stream.*;
import java.util.stream.Collectors;

class Student
{
    private int id, age, yearOfEnrollment;
    private String name, gender, engDepartment;
    private double perTillDate;


    public Student(int id, String name, int age, String gender, String engDepartment,int yearOfEnrollment, double perTillDate){
        this.id=id;
        this.age=age;
        this.yearOfEnrollment=yearOfEnrollment;
        this.name=name;
        this.gender=gender;
        this.engDepartment=engDepartment;
        this.perTillDate=perTillDate;
    }
    public void printDetails(){
        System.out.print("\nid:"+this.id+"\nname:"+this.name+"\nage:"+this.age+"\ngender:"+this.gender);
        System.out.println("\nengDepartment:"+this.engDepartment+"\nyearOfEnrollment:"+this.yearOfEnrollment+"\nperTilldate:"+this.perTillDate);
    }

    public int getAge(){
        return age;
    }
    public String getGender(){
        return gender;
    }
    public double getPerTillDate(){
        return perTillDate;
    }
    public String getEngDepartment(){
        return engDepartment;
    }

    static List<Student> studentList = new ArrayList<Student>();
    public static void main(String args[]){
        studentList.add(new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018,70.8));
        studentList.add(new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
        studentList.add(new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
        studentList.add(new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80));
        studentList.add(new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
        studentList.add(new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70));
        studentList.add(new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70));
        studentList.add(new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80));
        studentList.add(new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85));
        studentList.add(new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82));
        studentList.add(new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83));
        studentList.add(new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
        studentList.add(new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
        studentList.add(new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
        studentList.add(new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));
        studentList.add(new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4));
        studentList.add(new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));

       //1
        System.out.println();
        System.out.println("1. Print the name of all departments in the college?");
        Set<String> listOfEngDepartment = studentList.stream().map(e -> e.engDepartment).collect(Collectors.toSet());
        System.out.println(listOfEngDepartment);

        //2
        System.out.println();
        System.out.println("2.Get the names of all students who have enrolled after 2018?");
        List<String> studentOf2018 = studentList.stream().filter(n ->n.yearOfEnrollment>2018).map(m ->m.name).collect(Collectors.toList());
        System.out.println(studentOf2018);

        //3
        System.out.println();
        System.out.println("3. Get the details of all male student in the Computer Science department?");
        studentList.stream().filter(n -> n.engDepartment.equals("Computer Science") && n.gender.equals("Male")).map(m->m).forEach(y -> y.printDetails());

        //4
        System.out.println();
        System.out.println("4. How many male and female student are there ?");
        Map<String, Long> noOfMaleAndFemale
                = studentList.stream().collect(Collectors.groupingBy(p -> p.gender,Collectors.counting()));
        System.out.println(noOfMaleAndFemale);

        //5
        System.out.println();
        System.out.println("5.What is the average age of male and female students?");
        Map<String, Double> average
                = studentList.stream().collect(Collectors.groupingBy(Student::getGender,Collectors.averagingInt(Student::getAge)));
        System.out.println(average);

        //6
        System.out.println();
        System.out.println("6.Get the details of highest student having highest percentage ?");
        Student s;
        Optional<Student> result3 = studentList.stream().collect(Collectors.maxBy(Comparator.comparing(Student::getPerTillDate)));
        result3.get().printDetails();

        //7
        System.out.println();
        System.out.println("7. Count the number of students in each department?");
        Map<String, Long> count
                = studentList.stream().collect(Collectors.groupingBy(Student::getEngDepartment,Collectors.counting()));
        System.out.println(count);

        //8
        System.out.println();
        System.out.println("8. What is the average percentage achieved in each department?");
        Map<String, Double> averageOfEachDepartment
                = studentList.stream().collect(Collectors.groupingBy(Student::getEngDepartment,Collectors.averagingDouble(Student::getPerTillDate)));
        System.out.println(averageOfEachDepartment);

        //9
        System.out.println();
        System.out.println("9. Get the details of youngest male student in the Electronic department?");
        Optional<Student> electronicStudent =
                studentList.stream().filter(p -> p.engDepartment.equals("Electronic")).collect(Collectors.minBy(Comparator.comparing(Student::getAge)));
        electronicStudent.get().printDetails();


        //10
        System.out.println();
        System.out.println("10.How many male and female students are there in the computer science department?");
        Map<String, Long> totalCseStudents
                = studentList.stream().filter(p->p.engDepartment.equals("Computer Science")).collect(Collectors.groupingBy(p->p.gender,Collectors.counting()));
        System.out.println(totalCseStudents);

    }

}













