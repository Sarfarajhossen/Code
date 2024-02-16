
class student{
    String name;
    int age;
    String dep;
    public student(String name, int age, String dep){
        this.name = name;
        this.age = age;
        this.dep = dep;
    }
}

public class Person {
    public static void main (String[] args){
        student s1 = new student("Sarfaraj", 22, "CSE");
        System.out.println("Hello, i am "+ s1.name +" and i am "+ s1.age+ " years old. "+"Department "+ s1.dep);
    }
}
