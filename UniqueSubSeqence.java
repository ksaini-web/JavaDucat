import java.util.HashSet;

public class SubSeqence {


    public static void Sub(String str, int idx,String newstring,HashSet<String>set){


        if(idx==str.length()){

          if(set.contains(newstring)){
            return;
          }
          else{
            System.out.println(newstring);
            set.add(newstring);
            return;
          }
        }
       char currchar = str.charAt(idx);


       Sub(str,idx+1,newstring+currchar,set);

       Sub(str,idx+1,newstring,set);

       


    }

    public static void main(String[] args) {
HashSet<String>set = new HashSet<>();
        String str="aaa";
        Sub(str,0,"",set);
    }
    
}
