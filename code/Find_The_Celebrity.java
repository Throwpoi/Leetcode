
public class Find_The_Celebrity {
	boolean knows(int a, int b){
		return true;
	}
	
    public int findCelebrity(int n) {
        if(n==1) return 0;
        int a=0,b=1;
        while(b<n){
            boolean temp=knows(a,b);
            if(temp){a=b;b++;}
            else b++;
        }
        for(int i=0;i<n;i++){
            if(i==a) continue;
            if(!knows(i,a)||knows(a,i)) return -1;
        }
        return a;
    }
}
