package Graphs;

public class G20FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        boolean vis[][] = new boolean[image.length][image[0].length];
        helper(image, sr, sc, color, vis, image[sr][sc]);
        return image;
    }

    private void helper(int[][] image, int sr, int sc, int color, boolean[][] vis, int orgcolor) {
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || vis[sr][sc] || image[sr][sc] != orgcolor) {
            return;
        }
        vis[sr][sc] = true;
        image[sr][sc] = color;
        helper(image, sr, sc - 1, color, vis, orgcolor);
        helper(image, sr, sc + 1, color, vis, orgcolor);
        helper(image, sr - 1, sc, color, vis, orgcolor);
        helper(image, sr + 1, sc, color, vis, orgcolor);
    }

    public static void main(String[] args) {
        G20FloodFill floodFill = new G20FloodFill();

        int[][] image = {
                {1, 1, 1},
                {1, 1, 0},
                {1, 0, 1}
        };

        int sr = 1, sc = 1, newColor = 2;

        System.out.println("Original Image:");
        printImage(image);

        floodFill.floodFill(image, sr, sc, newColor);

        System.out.println("Image after Flood Fill:");
        printImage(image);
    }

    private static void printImage(int[][] image) {
        for (int[] row : image) {
            for (int pixel : row) {
                System.out.print(pixel + " ");
            }
            System.out.println();
        }
    }
}
