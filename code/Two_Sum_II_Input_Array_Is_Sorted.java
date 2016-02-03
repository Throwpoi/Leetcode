
public class Two_Sum_II_Input_Array_Is_Sorted {
    public int[] twoSum(int[] numbers, int target) {
        int length=numbers.length;
        int i=0,j=length-1;
        int[] result=new int[2];
        while(i<j){
            int temp1=numbers[i],temp2=numbers[j];
            if(temp1+temp2==target) break;
            else if(temp1+temp2>target) j--;
            else i++;
        }
        result[0]=i+1;result[1]=j+1;
        return result;
    }
}
