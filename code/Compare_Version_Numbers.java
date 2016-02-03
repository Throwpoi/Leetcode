
public class Compare_Version_Numbers {
    public int compareVersion(String version1, String version2) {
        String[] a=version1.split("\\."), b=version2.split("\\.");
        int i=0,length1=a.length,length2=b.length;
        while(i<length1&&i<length2){
            int temp1=Integer.parseInt(a[i]),temp2=Integer.parseInt(b[i]);
            if(temp1>temp2) return 1;
            if(temp1<temp2) return -1;
            i++;
        }
        if(i<length1){
            String temp="";
            while(i<length1) temp+=a[i++];
            if(Integer.parseInt(temp)==0) return 0;
            else return 1;
        }
        if(i<length2){
            String temp="";
            while(i<length2) temp+=b[i++];
            if(Integer.parseInt(temp)==0) return 0;
            else return -1;
        }
        return 0;
    }
}
