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
    Picture beach = new Picture("/Users/jeremiahliao/Documents/GitHub/Liao_Jeremiah_APCSA-2021/Unit16/src/images/beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  public static void testKeepOnlyBlue()
  {
	  Picture beach = new Picture("/Users/jeremiahliao/Documents/GitHub/Liao_Jeremiah_APCSA-2021/Unit16/src/images/beach.jpg");
	  beach.explore();
	  beach.keepOnlyBlue();
	  beach.explore();
  }
  
  public static void testNegate()
  {
	  Picture beach = new Picture("/Users/jeremiahliao/Documents/GitHub/Liao_Jeremiah_APCSA-2021/Unit16/src/images/beach.jpg");
	  beach.explore();
	  beach.negate();
	  beach.explore();
  }
  
  public static void testGrayscale()
  {
	  Picture beach = new Picture("/Users/jeremiahliao/Documents/GitHub/Liao_Jeremiah_APCSA-2021/Unit16/src/images/beach.jpg");
	  beach.explore();
	  beach.grayscale();
	  beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("/Users/jeremiahliao/Documents/GitHub/Liao_Jeremiah_APCSA-2021/Unit16/src/images/caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  public static void testMirrorVerticalRightToLeft()
  {
	  Picture motorcycle = new Picture("/Users/jeremiahliao/Documents/GitHub/Liao_Jeremiah_APCSA-2021/Unit16/src/images/redMotorcycle.jpg");
	  motorcycle.explore();
	  motorcycle.mirrorVerticalRightToLeft();
	  motorcycle.explore();
  }
  
  public static void testMirrorHorizontal()
  {
	  Picture motorcycle = new Picture("/Users/jeremiahliao/Documents/GitHub/Liao_Jeremiah_APCSA-2021/Unit16/src/images/redMotorcycle.jpg");
	  motorcycle.explore();
	  motorcycle.mirrorHorizontal();
	  motorcycle.explore();
  }
  
  public static void testMirrorHorizontalBotToTop()
  {
	  Picture motorcycle = new Picture("/Users/jeremiahliao/Documents/GitHub/Liao_Jeremiah_APCSA-2021/Unit16/src/images/redMotorcycle.jpg");
	  motorcycle.explore();
	  motorcycle.mirrorHorizontalBotToTop();
	  motorcycle.explore();
  }
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("/Users/jeremiahliao/Documents/GitHub/Liao_Jeremiah_APCSA-2021/Unit16/src/images/temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  public static void testMirrorDiagonal()
  {
	  Picture beach = new Picture("/Users/jeremiahliao/Documents/GitHub/Liao_Jeremiah_APCSA-2021/Unit16/src/images/beach.jpg");
	  beach.explore();
	  beach.mirrorDiagonal();
	  beach.explore();
  }
  
  public static void testMirrorArms()
  {
	  Picture snowman = new Picture("/Users/jeremiahliao/Documents/GitHub/Liao_Jeremiah_APCSA-2021/Unit16/src/images/snowman.jpg");
	  snowman.explore();
	  snowman.mirrorArms();
	  snowman.explore();
  }
  
  public static void testMirrorGull()
  {
	  Picture gull = new Picture("/Users/jeremiahliao/Documents/GitHub/Liao_Jeremiah_APCSA-2021/Unit16/src/images/seagull.jpg");
	  gull.explore();
	  gull.mirrorGull();
	  gull.explore();
  }
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("/Users/jeremiahliao/Documents/GitHub/Liao_Jeremiah_APCSA-2021/Unit16/src/images/640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("/Users/jeremiahliao/Documents/GitHub/Liao_Jeremiah_APCSA-2021/Unit16/src/images/swan.jpg");
    swan.explore();
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testFixUnderwater()
  {
	  Picture water = new Picture("/Users/jeremiahliao/Documents/GitHub/Liao_Jeremiah_APCSA-2021/Unit16/src/images/Water.jpg");
	  water.explore();
	  water.fixUnderwater();
	  water.explore();
  }
  
  public static void testCopy()
  {
	  Picture canvas = new Picture("/Users/jeremiahliao/Documents/GitHub/Liao_Jeremiah_APCSA-2021/Unit16/src/images/640x480.jpg");
	  Picture flower1 = new Picture("/Users/jeremiahliao/Documents/GitHub/Liao_Jeremiah_APCSA-2021/Unit16/src/images/flower1.jpg");
	  canvas.secondCopy(flower1, 50,0,100,100);
	  flower1.explore();
	  canvas.explore();
  }
  
  public static void testMyCollage()
  {
	  Picture canvas = new Picture("/Users/jeremiahliao/Documents/GitHub/Liao_Jeremiah_APCSA-2021/Unit16/src/images/640x480.jpg");
	  canvas.myCollage();
	  canvas.explore();
  }
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
//    testZeroBlue();
//    testKeepOnlyBlue();
//    testKeepOnlyRed();
//    testKeepOnlyGreen();
//    testNegate();
//    testGrayscale();
//    testFixUnderwater();
//    testMirrorVertical();
//    testMirrorVerticalRightToLeft();
//	  testMirrorHorizontal();
//	  testMirrorHorizontalBotToTop();
//    testMirrorTemple();
//    testMirrorArms();
//    testMirrorGull();
//    testMirrorDiagonal();
//    testCollage();
//    testCopy();
//	  testMyCollage();
    testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}