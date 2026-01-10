public class moveAllxINlast {

    
    
    public static String MoveX(String str,int idx,int count){

       
  
        
        //Base case

        if(idx==str.length()){
            String newString = "";

            for(int i=0;i<  count;i++){
                newString+='x';
            }

            return newString;
        }

        char currchar =str.charAt(idx);

        if(currchar!='x'){

      return currchar +  MoveX(str,idx+1,count);

        }
        else{
           return MoveX(str,idx+1,count+1);
        }

        
    }
    public static void main(String[]args){

    String str="abhxxuxxf";
    String result = MoveX(str,0,0);
     
    System.out.print(result);

   
    }
}
