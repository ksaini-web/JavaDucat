public class Newstring {
    
    public static boolean[] map =new boolean[26];

    static void RemoveDuplicates(String str,int idx,String newstring){


        if(idx==str.length()){
            System.out.println("New String with out Duplicate value :"+newstring);
            return;
        }


        char currchar = str.charAt(idx);

        if(map[currchar-'a']){

            RemoveDuplicates(str, idx+1, newstring);
        }
        else{ 
     map[currchar-'a']=true;
     RemoveDuplicates(str, idx+1, newstring+=currchar);
     


        }
    }

    public static void main(String[] args) {

    String str = "aloook";

  RemoveDuplicates(str,0,"");


        

    }
}
