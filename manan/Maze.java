package manan;

import java.util.ArrayList;
import java.util.Arrays;

public class Maze {
    public static void main(String[] args) {
//        System.out.println(count(3,3));
//       path("",3,3);
//        ArrayList<String> ans = pathRetDiag("",3,3);
//        System.out.println(ans);
        boolean maze[][] = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        int [][] path = new int[maze.length][maze[0].length];
        int steps =0;
        allPathPrint("", maze,path, 0, 0,steps);
    }

    static int count(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }
        int left = count(r - 1, c);
        int right = count(r, c - 1);
        return left + right;
    }

    static void path(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }
        if (r > 1) {
            path(p + 'D', r - 1, c);
        }
        if (c > 1) {
            path(p + 'R', r, c - 1);
        }
    }

    static ArrayList<String> pathRet(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if (r > 1) {
            ans.addAll(pathRet(p + 'D', r - 1, c));
        }
        if (c > 1) {
            ans.addAll(pathRet(p + 'R', r, c - 1));
        }
        return ans;
    }

    static ArrayList<String> pathRetDiag(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if (r > 1 && c > 1) {
            ans.addAll(pathRetDiag(p + 'D', r - 1, c - 1));
        }
        if (r > 1) {
            ans.addAll(pathRetDiag(p + 'V', r - 1, c));
        }
        if (c > 1) {
            ans.addAll(pathRetDiag(p + 'H', r, c - 1));
        }
        return ans;
    }

    static void pathRestrictions(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (!maze[r][c]) {
            return;
        }
        if (r < maze.length - 1) {
            pathRestrictions(p + 'D', maze, r + 1, c);
        }
        if (c < maze[0].length - 1) {
            pathRestrictions(p + 'R', maze, r, c + 1);
        }


    }
   static void allPath(String p,boolean[][] maze,int r,int c){
       if (r == maze.length - 1 && c == maze[0].length - 1) {
           System.out.println(p);
           return;
       }
       if (!maze[r][c]) {
           return;
       }
       // i am considering this block in my path
       maze[r][c] = false;
       if (r < maze.length - 1) {
           allPath(p + 'D', maze, r + 1, c);
       }
       if (c < maze[0].length - 1) {
           allPath(p + 'R', maze, r, c + 1);
       }
       if (r>0) {
           allPath(p+'L',maze,r-1,c);
       }
       if (c>0) {
           allPath(p+'L',maze,r,c-1);
       }
       // this line is where the function will be over
       // so before function gets removed , also remove the changes that were made by this function
       maze[r][c]=true;
    }
    static void allPathPrint(String p,boolean[][] maze,int [][] path,int r,int c,int steps){
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c]=steps;
            for(int []arr:path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if (!maze[r][c]) {
            return;
        }
        // I am considering this block in my path
        maze[r][c] = false;
        path[r][c] = steps;
        if (r < maze.length - 1) {
            allPathPrint(p + 'D', maze, path,r + 1, c,steps+1);
        }
        if (c < maze[0].length - 1) {
            allPathPrint(p + 'R', maze, path,r, c + 1,steps+1);
        }
        if (r>0) {
            allPathPrint(p+'L',maze,path,r-1,c,steps+1);
        }
        if (c>0) {
            allPathPrint(p+'L',maze,path,r,c-1,steps+1);
        }
        // this line is where the function will be over
        // so before function gets removed , also remove the changes that were made by this function
        maze[r][c]=true;
        path[r][c]=0;
    }
}
