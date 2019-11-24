
/*************************************************************************
 *  Compilation:  javac ArtCollage.java
 *  Execution:    java ArtCollage
 *
 *  @author:
 *
 *************************************************************************/

import java.awt.Color;

public class ArtCollage {

    // The orginal picture
    private Picture original;

    // The collage picture
    private Picture collage;

    // The collage Picture consists of collageDimension X collageDimension tiles
    private int collageDimension;

    // A tile consists of tileDimension X tileDimension pixels
    private int tileDimension;

    /*
     * One-argument Constructor 1. set default values of collageDimension to 4 and
     * tileDimension to 100 2. initializes original with the filename image 3.
     * initializes collage as a Picture of tileDimension*collageDimension x
     * tileDimension*collageDimension, where each pixel is black (see all
     * constructors for the Picture class). 4. update collage to be a scaled version
     * of original (see scaling filter on Week 9 slides)
     *
     * @param filename the image filename
     */
    public ArtCollage(String filename) {

        collageDimension = 4;
        tileDimension = 100;

        int num = collageDimension * tileDimension;

        original = new Picture(filename);
        collage = new Picture(num, num);

        // scaling
        for (int i = 0; i < num; i++) {
            for (int r = 0; r < num; r++) {
                int scol = i * original.width() / num;
                int srow = r * original.height() / num;
                Color color = original.get(scol, srow);
                collage.set(i, r, color);
            }
        }

    }

    /*
     * Three-arguments Constructor 1. set default values of collageDimension to cd
     * and tileDimension to td 2. initializes original with the filename image 3.
     * initializes collage as a Picture of tileDimension*collageDimension x
     * tileDimension*collageDimension, where each pixel is black (see all
     * constructors for the Picture class). 4. update collage to be a scaled version
     * of original (see scaling filter on Week 9 slides)
     *
     * @param filename the image filename
     */
    public ArtCollage(String filename, int td, int cd) {

        collageDimension = cd;
        tileDimension = td;
        int num = collageDimension * tileDimension;

        original = new Picture(filename);
        collage = new Picture(num, num);

        for (int col = 0; col < collage.width(); col++) {
            for (int row = 0; row < collage.height(); row++) {
                Color color = collage.get(col, row);
                Color gray = Luminance.toGray(color);
                collage.set(col, row, gray);

            }
        }

        // scaling
        for (int i = 0; i < num; i++) {
            for (int r = 0; r < num; r++) {
                int scol = i * original.width() / num;
                int srow = r * original.height() / num;
                Color color = original.get(scol, srow);
                collage.set(i, r, color);
            }
        }
    }

    /*
     * Returns the collageDimension instance variable
     *
     * @return collageDimension
     */
    public int getCollageDimension() {

        return collageDimension;
    }

    /*
     * Returns the tileDimension instance variable
     *
     * @return tileDimension
     */
    public int getTileDimension() {

        return getTileDimension();
    }

    /*
     * Returns original instance variable
     *
     * @return original
     */
    public Picture getOriginalPicture() {

        return original;
    }

    /*
     * Returns collage instance variable
     *
     * @return collage
     */
    public Picture getCollagePicture() {

        return collage;
    }

    /*
     * Display the original image Assumes that original has been initialized
     */
    public void showOriginalPicture() {

        original.show();
    }

    /*
     * Display the collage image Assumes that collage has been initialized
     */
    public void showCollagePicture() {

        collage.show();
    }

    /*
     * Replaces the tile at collageCol,collageRow with the image from filename Tile
     * (0,0) is the upper leftmost tile
     *
     * @param filename image to replace tile
     * 
     * @param collageCol tile column
     * 
     * @param collageRow tile row
     */
    public void replaceTile(String filename, int collageCol, int collageRow) {

        // WRITE YOUR CODE HERE
    }

    /*
     * Makes a collage of tiles from original Picture original will have
     * collageDimension x collageDimension tiles, each tile has tileDimension X
     * tileDimension pixels
     */
    public void makeCollage() {

        // WRITE YOUR CODE HERE
    }

    /*
     * Colorizes the tile at (collageCol, collageRow) with component (see Week 9
     * slides, the code for color separation is at the book's website)
     *
     * @param component is either red, blue or green
     * 
     * @param collageCol tile column
     * 
     * @param collageRow tile row
     */
    public void colorizeTile(String component, int collageCol, int collageRow) {

        // read in the picture specified by command-line argument
        Picture picture = new Picture(component);
        int width = picture.width();
        int height = picture.height();

        // create three empy pictures of the same dimension
        Picture pictureR = new Picture(width, height);
        Picture pictureG = new Picture(width, height);
        Picture pictureB = new Picture(width, height);

        // separate colors
        for (int col = 0; col < width; col++) {
            for (int row = 0; row < height; row++) {
                Color color = picture.get(col, row);
                int r = color.getRed();
                int g = color.getGreen();
                int b = color.getBlue();
                pictureR.set(col, row, new Color(r, 0, 0));
                pictureG.set(col, row, new Color(0, g, 0));
                pictureB.set(col, row, new Color(0, 0, b));
            }
        }

        // display each picture in its own window
        pictureR.show();
        pictureG.show();
        pictureB.show();
    }

    }

    /*
     * Greyscale tile at (collageCol, collageRow) (see Week 9 slides, the code for
     * luminance is at the book's website)
     *
     * @param collageCol tile column
     * 
     * @param collageRow tile row
     */

    public void greyscaleTile(int collageCol, int collageRow) {

        // Picture newPicture = new Picture(obj);

        // int width = obj.width();

        // int height = obj.height();

        // for (int column = 0; column < width; column++)

        // for (int row = 0; row < height; row++) {

        // Color color = obj.get(column, row);

        // // finding average of r,g,b values

        // int avg = (color.getRed() + color.getGreen() + color.getBlue()) / 3;

        // // creating a new color with same r g b values

        // Color gray = new Color(avg, avg, avg);

        // // setting color to current position in newPicture

        // newPicture.set(column, row, gray);

        // }

        // return newPicture;
    }

    // Test client
    public static void main(String[] args) {
        // Creates a collage of 3x3 tiles. Each tile dimension is 200x200 pixels
        ArtCollage art = new ArtCollage(args[0], 200, 3);
        art.makeCollage();
        // Colorize tile at col 2, row 1 to only show the blue component
        art.colorizeTile("blue", 2, 1);
        art.showCollagePicture();
    }
}
