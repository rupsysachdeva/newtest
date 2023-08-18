class binarysearch
{
    public static int binary(int numbers[],int key)
    {
        int start=0;
        int end=numbers.length-1;
        
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(key==numbers[mid])
            {
                return mid;
            }
                 if(key<numbers[mid])
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        int numbers[]={5,6,7,8,9};
        int key=9;
        int a=binary(numbers,key);
        if(a==-1)
        {
            System.out.println("Key is not found");
            
        }
        else
        {
            System.out.println("Key is found at position:"+(a+1));
        }
    }

}
