

public class ReversString {

    public static void printRev(String s,int idx){

        if(idx<0){

            return;
        }
        System.out.print(s.charAt(idx));
  printRev(s,idx-1);


    
}


    public static void main(String[] args) {
        
        String str ="abcd";
        printRev(str,str.length()-1);
    }
    
}
