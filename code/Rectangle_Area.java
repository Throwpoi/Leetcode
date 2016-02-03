
public class Rectangle_Area {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int a=(C-A)*(D-B)+(G-E)*(H-F);
        if(C<=E||G<=A||B>=H||F>=D) return a;
        else return a-(Math.min(G,C)-Math.max(A,E))*(Math.min(D,H)-Math.max(B,F));
    }
}
