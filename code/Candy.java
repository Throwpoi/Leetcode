
public class Candy {
    public int candy(int[] ratings) {
        int total=0,length=ratings.length;;
        int[] candy=new int[length];
        candy[0]=1;
        for(int i=1;i<length;i++){
            if(ratings[i]>ratings[i-1]) candy[i]=candy[i-1]+1;
            else candy[i]=1;
        }
        total+=candy[length-1];
        for(int i=length-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]&&candy[i]<=candy[i+1]) candy[i]=candy[i+1]+1;
            total+=candy[i];
        }
        return total;
    }
}
