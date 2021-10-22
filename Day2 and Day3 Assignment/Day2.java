/*A static method can access only static variables but 
  non-static method can access static variables*/

import java.util.Scanner;
class Day2{
    private int eid;
    private String ename;
    private String degisnation;
    private float salary;
    private static int age=22;   //override the value of age

    
    void inputDetails(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Eid : ");
        eid = sc.nextInt(); 

        sc.nextLine();

        System.out.println("Enter Name : ");
        ename = sc.nextLine(); 

        System.out.println("Enter Degisnation : ");
        degisnation = sc.nextLine();

        System.out.println("Enter Salary : ");
        salary = sc.nextFloat(); 

        System.out.println("Enter Age : ");
        age = sc.nextInt(); 
    }

    void showDetails(){
        System.out.println("...Employee Details...");

        System.out.println("Eid : "+eid);
        System.out.println("Ename : "+ename);
        System.out.println("Degisnation : "+degisnation);
        System.out.println("Salary : "+salary);
        System.out.println("Age : "+age);
    }

    public static void main(String[] args) {
        
        Day2 d1 = new Day2();
        Day2 d2 = new Day2();

        d1.inputDetails();
        d2.inputDetails();
        d1.showDetails();
        d2.showDetails();
    }
}