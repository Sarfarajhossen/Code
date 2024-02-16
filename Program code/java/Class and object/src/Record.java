
import java.util.Scanner;

class pet{
    String Name;
    int age;
    String id;
    
    public void Display(String Name, int age, String id){
        this.Name = Name;
        this.age = age;
        this.id = id;
        System.out.println("Pet Name: " +this.Name +" Pet age : "+ this.age+ " Pet id: "+ this.id);
        System.out.printf("Pet name : %s %nPet Age : %d %n", Name, age);
    }
    public void Collect(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter name : ");
        Name = scanner.nextLine();
        
        System.out.print("Enter Age : ");
        age = scanner.nextInt();
        
        scanner.nextLine();
        System.out.print("Enter ID : ");
        id = scanner.nextLine();
        
        Display(Name, age, id);
    }
}
public class Record {
    public static void main(String[] args){
        pet pet1 = new pet();
        pet1.Collect();
        //pet1.Display("Shiva", 25, "p010");
    }
}
