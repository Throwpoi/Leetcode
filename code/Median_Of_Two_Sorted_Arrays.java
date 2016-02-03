
public class Median_Of_Two_Sorted_Arrays {
	   public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		   int length1=nums1.length, length2=nums2.length;
	       if((length1+length2)%2==0){
	    	   return (help(nums1,0,nums2,0,(length1+length2)/2)+
	        			help(nums1,0,nums2,0,(length1+length2)/2+1))/2.0;
	       }
	       else return help(nums1,0,nums2,0,(length1+length2)/2+1);
	   }
	   
	   int help(int[] nums1, int start1, int[] nums2, int start2, int k){
		   if(start1>=nums1.length) return nums2[start2+k-1];
		   if(start2>=nums2.length) return nums1[start1+k-1];
		   if(k==1) return Math.min(nums1[start1], nums2[start2]);
		   int num1=((start1+k/2-1)<nums1.length)?nums1[start1+k/2-1]:Integer.MAX_VALUE;
		   int num2=((start2+k/2-1)<nums2.length)?nums2[start2+k/2-1]:Integer.MAX_VALUE;
		   if(num1<num2) return help(nums1,start1+k/2,nums2,start2,k-k/2);
		   else return help(nums1,start1,nums2,start2+k/2,k-k/2);
	   }
}
