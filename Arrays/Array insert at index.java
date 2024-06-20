class Solution
{
    // You need to insert the given element at the given index. 
    // After inserting the elements at index, elements
    // from index onward should be shifted one position ahead
    // You may assume that the array already has sizeOfArray - 1
    // elements.
    public void insertAtIndex(int arr[],int sizeOfArray,int index,int element)
    {
        //Your code here, Geeksfor()
        int n=sizeOfArray;
        for(int i=n-1;i>index;i--){
            arr[i]=arr[i-1];
        }
        arr[index]=element;
        
    }


}
