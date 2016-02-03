import java.util.*;

public class Flatten_2D_Vector {
    List<List<Integer>> vec2d;
    Iterator<List<Integer>> big;
    Iterator<Integer> small;
    List<Integer> newBig;
    public Flatten_2D_Vector(List<List<Integer>> vec2d) {
        this.vec2d=vec2d;
        big=vec2d.iterator();
    }

    public int next() {
        if(small!=null&&small.hasNext()) return small.next();
        else{
            small=newBig.iterator();
            return small.next();
        }
    }

    public boolean hasNext() {
        if(small!=null&&small.hasNext()) return true;
        List<Integer> temp=null;
        while(big.hasNext()){
            temp=big.next();
            if(temp.size()!=0) break;
        }
        if(temp==null||temp.size()==0) return false;
        else{newBig=temp;return true;}
    }
}
