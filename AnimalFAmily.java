class Animal{

    void Sound(){

        System.out.println("Animal make's the Sound ");
    }
}

class cat extends Animal{

    //Overtride the method Sound

    void Sound(){

        System.out.println("Cat make's the Sound ");
    }
}

class bird{

     void Sound(){

        System.out.println("Bird Cat make's the Sound ");
    }

} 
public class AnimalFamily{

    public static void main(String[]args){
    Animal A=new Animal();
    cat C = new cat();
    bird B = new bird();

    A.Sound();
    C.Sound();
    B.Sound();

    }
}
