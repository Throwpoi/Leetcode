public class Solution {
    /*
      zero       z
      two        w
      four       u
      six        x
      eight      g
      five       f-four
      seven      v-five
      three      h-eight
      nine       i-six-eight-five
      one        o-zero-two-four
    */
    public String originalDigits(String s) {
        int[] count=new int[10];
        for(int i=0;i<s.length();i++){
            switch(s.charAt(i)){
                case 'z': count[0]++; break;
                case 'w': count[2]++; break;
                case 'u': count[4]++; break;
                case 'x': count[6]++; break;
                case 'g': count[8]++; break;
                case 'f': count[5]++; break;
                case 'v': count[7]++; break;
                case 'h': count[3]++; break;
                case 'i': count[9]++; break;
                case 'o': count[1]++; break;
                default: break;
            }
        }
        count[5]-=count[4];
        count[7]-=count[5];
        count[3]-=count[8];
        count[9]-=(count[6]+count[8]+count[5]);
        count[1]-=(count[0]+count[2]+count[4]);
        StringBuilder result=new StringBuilder();
        for(int i=0;i<10;i++){
            for(int j=0;j<count[i];j++){
                result.append(i);                
            }
        }
        return result.toString();
    }
}
