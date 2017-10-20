import java.awt.Color;

public class imageColorSep {
    public static void main(String[] args) {
        Picture picture = new Picture(args[0]);
        int width = picture.width();
        int height = picture.height();

        Picture redPic = new Picture(args[0]);
        Picture bluePic = new Picture(args[0]);
        Picture greenPic = new Picture(args[0]);

        for (int col = 0; col < height; col++) {
            for (int row = 0; row < width; row++) {
                Color temp = picture.get(row, col);
                redPic.set(row, col, new Color(temp.getRed(), 0, 0));
                bluePic.set(row, col, new Color(0, 0, temp.getBlue()));
                greenPic.set(row, col, new Color(0,  temp.getGreen(), 0));
            }
        }
    redPic.show();
    bluePic.show();
    greenPic.show();
    }
}