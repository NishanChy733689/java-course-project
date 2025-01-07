public class BackTracking {
    static int n=4;
    static int[] ld=new int[30];
    static int[] rd=new int[30];
    static int[] cl =new int[30];
    public static int[][] makeBoard(){
        int[][] board={  {0,0,0,0}
                        ,{0,0,0,0}
                        ,{0,0,0,0}
                        ,{0,0,0,0}};
        return board;
    }
    public static void printSolution(int[][] board){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(board[i][j]);
            }
        }
    }
    public static boolean solveNQueen(int[][] board,int col){
        if (col >=n){
            return true;
        }
        for (int i=0;i<n;i++){
            if ((ld[i- col +n-1]!=1&&rd[i+col]!=1)&&cl[i]!=1){
                board[i][col]=1;
                ld[i- col +n-1]=rd[i+col]=cl[i]=1;
            }
        }

    }
}
