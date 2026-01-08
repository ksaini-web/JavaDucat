class Vehicle{

     int speed=10;
     
    void SpeedUp(){

       
        System.out.println("The SpeedUp of Vehicle :"+speed++);
    }
}

class car extends Vehicle{

 void SpeedUp(){

        int speed=20;
        System.out.println("The SpeedUp of Vehicle :"+speed++);
    }
}

class bicycle extends Vehicle{
   
     void SpeedUp(){

        
        System.out.println("The SpeedUp of Vehicle :"+speed++);
    }

}

public class VehicalSpeedUp {
    
    public static void main(String[] args) {
        
        Vehicle V = new Vehicle();
    V.SpeedUp();;

        car C = new car();

        C.SpeedUp();

        bicycle B = new bicycle();

        B.SpeedUp();


    }
}
