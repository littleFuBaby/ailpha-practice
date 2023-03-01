package com.ailpha.leetcode.p2373;

public class SolutionDemo {

    public static void main(String[] args) {
        SolutionDemo solutionDemo = new SolutionDemo();
        int[][] grid1 = {{9,9,8,1},{5,6,2,6},{8,2,6,4},{6,2,2,2}};
        int[][] grid2 = {{1,1,1,1,1},{1,1,1,1,1},{1,1,2,1,1},{1,1,1,1,1},{1,1,1,1,1}};
        solutionDemo.largestLocal(grid1);
        solutionDemo.largestLocal(grid2);
    }

    public int[][] largestLocal(int[][] grid) {

        int[][] maxLocal = new int[grid.length - 2][grid.length - 2];

        for (int i=0; i<maxLocal.length; i++) {
            for (int j=0; j<maxLocal.length; j++) {
                maxLocal[i][j] = getMax(i + 1, j + 1, grid);
            }
        }
        return maxLocal;
    }

    public int getMax(int ci, int cj, int[][] grid) {
        int max = 0;
        for (int i=ci-1; i<=ci+1; i++) {
            for (int j=cj-1; j<=cj+1; j++) {
                max = Math.max(max, grid[i][j]);
            }
        }
        return max;
    }

}
