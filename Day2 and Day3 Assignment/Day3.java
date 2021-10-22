import java.util.Scanner;

class EmpDetail{
    private int eid;
    private int age;

    void setEid(int id){
        this.eid = id;
    }
    int getId(){
        return eid;
    }

    void setAge(int age){
        if(age >= 22){
            this.age = age;
        }
        else{
            System.out.println("You are not Eligible for Job!");
        }
    }
    int getAge(){
        return age;
    }
}

class Day3{

    public static void main(String[] args) {
        
        EmpDetail d3 = new EmpDetail();
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter Id: ");

        // d2.eid = sc.nextInt();  --> error
        int empId;
        empId = sc.nextInt();
        d3.setEid(empId);
        System.out.println("Eid: "+d3.getId());
        

        System.out.println("Enter Age:");

        int empAge = sc.nextInt();
        d3.setAge(empAge);
        System.out.println("Age: "+d3.getAge());
    }
}
