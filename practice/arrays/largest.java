class largest{
    public static void main(String[] args) {

        int[] arr = {1,3,5,12,7};
        int n = arr.length;
        int largest = arr[0];
        for (int i=0;i<n;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        
        System.out.println(largest);


        //print second largest

        int second = -1;
        for (int i=0;i<n;i++){
            if(arr[i]>second&&arr[i]!=largest){
                second=arr[i];
            }
        }

        System.out.println(second);


/*Complexity for above is O(N)+O(N) = O(2N)
 so optimal solution*/
        
        for (int i=0;i<n;i++){
            if(arr[i]>largest){
                second = largest;
                largest=arr[i];
            }else if(arr[i]<largest&&arr[i]>second){
                second = arr[i];
            }
        }
        
        System.out.println(largest);
                System.out.println(second);


    }
}