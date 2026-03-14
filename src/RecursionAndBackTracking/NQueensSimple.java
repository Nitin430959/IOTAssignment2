package RecursionAndBackTracking;

public class NQueensSimple {
    static int N = 4;

    static boolean safe(int b[][], int r, int c){
        for(int i=0;i<c;i++) if(b[r][i]==1) return false;
        for(int i=r,j=c;i>=0&&j>=0;i--,j--) if(b[i][j]==1) return false;
        for(int i=r,j=c;i<N&&j>=0;i++,j--) if(b[i][j]==1) return false;
        return true;
    }

    static void solve(int b[][], int c){
        if(c==N){
            for(int[] r:b){ for(int x:r) System.out.print(x+" "); System.out.println(); }
            return;
        }
        for(int i=0;i<N;i++)
            if(safe(b,i,c)){ b[i][c]=1; solve(b,c+1); b[i][c]=0; }
    }

    public static void main(String[] args){
        solve(new int[N][N],0);
    }
}

