


public class strictlyIncreasing {
    
    public static boolean iSsorted(int arr[],int idx){

        //base case

        if(idx==arr.length-1){
           
            return true;
        }

        if(arr[idx]>=arr[idx+1]){
            return false;
        }

        return iSsorted(arr, idx+1);


    }

    public static void main(String[] args) {
        
        int arr[]={1,2,3,4,5,6};
        System.err.println(iSsorted(arr,0));
    }

}
