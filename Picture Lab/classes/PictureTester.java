/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
    /** Method to test zeroBlue */
    public static void testZeroBlue()
    {
        Picture beach = new Picture("beach.jpg");
        beach.explore();
        beach.zeroBlue();
        beach.explore();
    }

    /** Method to test keepOnlyBlue */
    public static void testKeepOnlyBlue(){
        Picture beach = new Picture("beach.jpg");
        beach.explore();
        beach.keepOnlyBlue();
        beach.explore();
    }

    /** Method to test negate */
    public static void testNegate(){
        Picture beach = new Picture("beach.jpg");
        beach.explore();
        beach.negate();
        beach.explore();
    }
    
    /** Mehtod to test grayscale*/ 
    public static void testGrayscale(){
        Picture beach = new Picture("beach.jpg");
        beach.explore();
        beach.grayscale();
        beach.explore();
    }
    
    /** Method to test fixUnderWater */
    public static void testFixUnderWater(){
        Picture water = new Picture("water.jpg");
        water.explore();
        water.fixUnderWater();
        water.explore();
    }
    
    /** Method to test mirrorVertical right to left*/
    public static void testMirrorVerticalRighttoLeft(){
        Picture caterpillar = new Picture("caterpillar.jpg");
        caterpillar.explore();
        caterpillar.mirrorVerticalRighttoLeft();
        caterpillar.explore();
    }
    
    /** Method to test mirrorHorizontal */
    public static void testMirrorHorizontal(){
        Picture motorcycle = new Picture("redMotorcycle.jpg");
        motorcycle.explore();
        motorcycle.mirrorHorizontal();
        motorcycle.explore();
    }
    
        /** Method to test mirrorHorizontal bot to top */
    public static void testMirrorHorizontalBottoTop(){
        Picture motorcycle = new Picture("redMotorcycle.jpg");
        motorcycle.explore();
        motorcycle.mirrorHorizontalBottoTop();
        motorcycle.explore();
    }
    

    /** Method to test mirrorVertical */
    public static void testMirrorVertical()
    {
        Picture caterpillar = new Picture("caterpillar.jpg");
        caterpillar.explore();
        caterpillar.mirrorVertical();
        caterpillar.explore();
    }
    
    /** Method to test mirror Diagonal 
    public static void testMirrorDiagonal(){
        Picture beach = new Picture("beach.jpg");
        beach.explore();
        beach.mirrorDiagonal();
        beach.explore();
    }   */

    /** Method to test mirrorTemple */
    public static void testMirrorTemple()
    {
        Picture temple = new Picture("temple.jpg");
        temple.explore();
        temple.mirrorTemple();
        temple.explore();
    }
    
    /** Method to test mirror Arms */ 
    public static void testMirrorArms(){
        Picture snowman = new Picture("snowman.jpg");
        snowman.explore();
        snowman.mirrorArms();
        snowman.explore();
    }

    /** Method to test the collage method */
    public static void testCollage()
    {
        Picture canvas = new Picture("640x480.jpg");
        canvas.createCollage();
        canvas.explore();
    }

    /** Method to test edgeDetection */
    public static void testEdgeDetection()
    {
        Picture swan = new Picture("swan.jpg");
        swan.edgeDetection(10);
        swan.explore();
    }

    /** Main method for testing.  Every class can have a main
     * method in Java */
    public static void main(String[] args)
    {
        // uncomment a call here to run a test
        // and comment out the ones you don't want
        // to run
        testZeroBlue();
        testKeepOnlyBlue();
        //testKeepOnlyRed();
        //testKeepOnlyGreen();
        testNegate();
        testGrayscale();
        testFixUnderWater();
        testMirrorVertical();
        testMirrorVerticalRighttoLeft();
        testMirrorHorizontal();
        testMirrorHorizontalBottoTop();
       // testMirrorDiagonal();
        testMirrorTemple();
        testMirrorArms();
        //testMirrorGull();
        //testMirrorDiagonal();
        //testCollage();
        //testCopy();
        //testEdgeDetection();
        //testEdgeDetection2();
        //testChromakey();
        //testEncodeAndDecode();
        //testGetCountRedOverValue(250);
        //testSetRedToHalfValueInTopHalf();
        //testClearBlueOverValue(200);
        //testGetAverageForColumn(0);
    }
}