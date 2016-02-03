class Bucket{
    int max;
    int min;
    public Bucket(int max, int min){this.max=max;this.min=min;}
}

public class Maximum_Gap {
    public int maximumGap(int[] nums) {
        int length=nums.length;
        if(length<2) return 0;
        int max=nums[0],min=nums[0];
        for(int i=1;i<length;i++){
            max=Math.max(max,nums[i]);
            min=Math.min(min,nums[i]);
        }
        Bucket[] a=new Bucket[length+1];
        for(int i=0;i<=length;i++) a[i]=new Bucket(-1,Integer.MAX_VALUE);
        double dif=(max-min)/(double)length;
        for(int i=0;i<length;i++){
            int index=(int)((nums[i]-min)/dif);
            a[index].max=Math.max(a[index].max,nums[i]);
            a[index].min=Math.min(a[index].min,nums[i]);
        }
        int gap=0,last=-1;
        for(int i=0;i<=length;i++){
            if(a[i].max==-1) continue;
            else{
                if(last!=-1) gap=Math.max(gap,a[i].min-last);
                last=a[i].max;
            }
        }
        return gap;
    }
}
