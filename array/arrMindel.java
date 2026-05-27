public class arrMindel {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int min=arr[0][0];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]<min){
                    min=arr[i][j];
                }
            }
        }
        System.out.println("the minimum element in the array is: " +min);

        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==min){
                    arr[i][j]=0; // replace the minimum element with 0
                }
            }
        }
    }
}
