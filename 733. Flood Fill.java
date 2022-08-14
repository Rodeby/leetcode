import java.util.Arrays;

public class FloodFill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = { { 1, 1, 1 }, { 1, 1, 0 }, { 1, 0, 1 } };

		System.out.println(Arrays.deepToString(array));
		int[][] res = floodFill(array, 1, 1, 2);
		System.out.println(Arrays.deepToString(res));

	}

	public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
		int color = image[sr][sc];

		if (color != newColor)
			fill(image, sr, sc, color, newColor);
		return image;
	}

	public static void fill(int[][] image, int r, int c, int color, int newColor) {
		if (image[r][c] == color) {
			image[r][c] = newColor;
			if (r >= 1)
				fill(image, r - 1, c, color, newColor);
			if (c >= 1)
				fill(image, r, c - 1, color, newColor);
			if (r + 1 < image.length)
				fill(image, r + 1, c, color, newColor);
			if (c + 1 > image[0].length)
				fill(image, r , c, color, newColor);
		}

	}

}
