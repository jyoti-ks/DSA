//Insertion Sort
public class Main
{
    public static void Print(int arr[]){
	        for(int i=0;i<arr.length;i++){
	            System.out.print(arr[i]+" ");
	        }
	    }    
	public static void main(String[] args) {
	    int arr[]={9,2,8,5,3};
	    for(int i=1;i<arr.length;i++){
	        int corrent=arr[i];
	        int j=i-1;
	        while(j>=0&&corrent<arr[j]){
	            arr[j+1]=arr[j];
	            j--;
	        }
	        arr[j+1]=corrent;
	    } 
		Print(arr);
	}
}
