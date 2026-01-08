//Q2

class person{

    void getFirstname(String firstname){

        System.out.println("The Name of Employee : "+firstname);

    }
    void getlastname(String lastname){

         System.out.print(" "+lastname);

    }
}

class Employee extends person {

    String getEmloyeeid(String id){

        return id;

    }
    //overriding
 void getlastname(String emplyeejobtitle){

String id="123";

         System.out.print("And Job Tittle is  "+emplyeejobtitle+" And Emloyeee id : "+getEmloyeeid( id));

    }


}

public class Q1person {

    public static void main(String[] args) {
        
        Employee E =new Employee();

        E.getFirstname("Alok");
        E.getlastname("SD2");
        
    }
    
}

