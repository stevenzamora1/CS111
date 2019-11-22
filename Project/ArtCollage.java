
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
        original = filename;
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

        // WRITE YOUR CODE HERE
    }

    /*
     * Display the collage image Assumes that collage has been initialized
     */
    public void showCollagePicture() {

        // WRITE YOUR CODE HERE
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

        // WRITE YOUR CODE HERE
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

        // WRITE YOUR CODE HERE
    }

    // Test client
    public static void main(String[] args) {

    }
}
