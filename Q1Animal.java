 class Animal  {

    void move(){

        System.out.println("Animal is move");
    }
    
}

class cheetah extends Animal{

    cheetah(){

        System.out.println("Cheetah is move in forest");
    }
}

public class Q1move {

    public static void main(String[]args){

        Animal a=new Animal();
        cheetah c=new cheetah();

        a.move();
        c.move();
    }
    
}
