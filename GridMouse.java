public class GridMouse {

    public static boolean isSafe(int maze[][], int i, int j) {

        return (i >= 0 && i < maze.length) && (j >= 0 && j < maze.length) && maze[i][j] == 1;
    }

    public static boolean gridMouse(int maze[][]) {
        int path[][] = new int[maze.length][maze.length];
        if (solve(maze, 0, 0, path) == false) {
            System.out.println("No solution");
            return false;
        }
        print(path);
        return true;
    }

    public static boolean solve(int maze[][], int i, int j, int path[][]) {
        if (i == maze.length - 1 && j == maze.length - 1 && maze[i][j] == 1) {
            path[i][j] = 1;
            return true;
        }

        if (isSafe(maze, i, j) == true) {
            if (path[i][j] == 1)
                return false;
            path[i][j] = 1;
            if(solve(maze, i+1, j, path))
                return true;
            if(solve(maze, i, j+1, path))
                return true;
            path[i][j] = 0;
            return false;
        }
        return false;
    }

    public static void print(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int maze[][] = { { 1, 0, 0, 0 }, { 1, 1, 0, 1 }, { 0, 1, 0, 0 }, { 1, 1, 1, 1 } };
        // System.out.println(gridMouse(0, 0, 3, 3));
        gridMouse(maze);
    }
}
