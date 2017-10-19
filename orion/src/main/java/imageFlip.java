import java.awt.*;

public class imageFlip {

    // write a function which reads in the file and reverses it
    public static void main(String[] args) {
        Picture picture = new Picture(args[0]);
        int width = picture.width();
        int height = picture.height();
        picture.show();

        // flip the image
        for (int col = 0; col < height; col++) {
            for (int row = 0; row < width / 2; row++) {
                Color colVal1 = picture.get(row, col);
                Color colVal2 = picture.get(width - row - 1, col);

                picture.set(row, col, colVal2);
                picture.set(width - row - 1, col, colVal1);

            }
        }
        picture.show();
    }

}