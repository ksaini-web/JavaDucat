public class SubSeqence {


    public static void Sub(String str, int idx,String newstring){


        if(idx==str.length()){

            System.out.println(newstring);
            return;
        }
       char currchar = str.charAt(idx);


       Sub(str,idx+1,newstring+currchar);
       
       Sub(str,idx+1,newstring);

       


    }

    public static void main(String[] args) {

        String str="abc";
        Sub(str,0,"");
    }
    
}
