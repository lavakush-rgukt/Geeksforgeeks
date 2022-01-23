// Find triplets with zero sum 
class FindTripletsWithZeroSum
{
    // arr[]: input array
    // n: size of the array
    //Function to find triplets with zero sum.
	public boolean findTriplets(int arr[] , int n)
    {
        //add code here.
        for(int i=0;i<n-2;i++){
            for (int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k] == 0){
                        return true;
                    }
                }
            }
        }
    return false;
    }
}
