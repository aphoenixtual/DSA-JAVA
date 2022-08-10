public class BlockedMaze {
    public static void main(String[] args) {
        int[][] maze = {{0,1,0,0},{0,0,0,0},{0,1,0,0},{0,0,1,0}};
        BlockedMazePath(maze,0, 0, "", new  boolean[maze.length][maze[0].length]);
    }

    public static  void BlockedMazePath(int[][] maze, int row, int col, String ans, boolean[][] visited){

        //Positive Base Case
        if(row == maze.length-1 && col == maze[0].length-1){
            System.out.println(ans);
            return;
        }

        //Negative Base Case
        if(row == -1 || row == maze.length || col == -1 || col == maze.length || maze[row][col] ==1 || visited[row][col]){
            return;
        }

        //Put a mark
        visited [row][col] = true;

        //Top
        BlockedMazePath(maze, row-1, col, ans + "T", visited);

        //Down
        BlockedMazePath(maze, row+1, col, ans + "D", visited);

        //left
        BlockedMazePath(maze, row, col-1, ans + "L", visited);

        //Right
        BlockedMazePath(maze, row, col+1, ans + "R", visited);

        //Remove the mark -> Backtracking Reference
        visited [row][col] = false;
    }
}
