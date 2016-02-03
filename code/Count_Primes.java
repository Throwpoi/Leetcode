
public class Count_Primes {
    public int countPrimes(int n) {
        int num=0;
        boolean[] flag=new boolean[n];
        for(int i=2;i*i<n;i++){
            if(!flag[i]){
                for(int j=i*i;j<n;j+=i) flag[j]=true;
            }
        }
        for(int i=2;i<n;i++){
            if(!flag[i]) num++;
        }
        return num;
    }
}
