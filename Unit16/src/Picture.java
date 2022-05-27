
import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.lang.Math;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
  
  public void keepOnlyBlue() {
	  Pixel[][] pixels = this.getPixels2D();
	  for (Pixel[] rowArray : pixels) {
		  for (Pixel pixelObj : rowArray) {
			  pixelObj.setRed(0);
			  pixelObj.setGreen(0);
		  }
	  }
  }
	
	public void negate() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				pixelObj.setRed(255 - pixelObj.getRed());
				pixelObj.setGreen(255 - pixelObj.getGreen());
				pixelObj.setBlue(255 - pixelObj.getBlue());
			}
		}
	}
	
	public void grayscale() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				int total = pixelObj.getRed() + pixelObj.getGreen() + pixelObj.getBlue();
				int average = total / 3;
				pixelObj.setRed(average);
				pixelObj.setGreen(average);
				pixelObj.setBlue(average);
			}
		}
	}
  
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
        count = count + 1;
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
    System.out.println(count);
  }
  
  public void mirrorVerticalRightToLeft() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel leftPixel;
		Pixel rightPixel;
		int width = pixels[0].length;
		for (int row = 0; row < pixels.length; row++) {
			for (int col = 0; col < width / 2; col++) {
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][width - 1 - col];
				leftPixel.setColor(rightPixel.getColor());
			}
		}
  }
	
  public void mirrorHorizotal() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel topPixel;
		Pixel bottomPixel;
		int height = pixels.length;
		for (int c = 0; c < pixels[0].length; c++) {
			for (int r = 0; r < height / 2; r++) {
				topPixel = pixels[r][c];
				bottomPixel = pixels[height - r - 1][c];
				bottomPixel.setColor(topPixel.getColor());
			}
		}
  }
	
  public void mirrorHorizotalBotToTop() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel topPixel;
		Pixel bottomPixel;
		int height = pixels.length;
		for (int c = 0; c < pixels[0].length; c++) {
			for (int r = 0; r < height / 2; r++) {
				topPixel = pixels[r][c];
				bottomPixel = pixels[height - r - 1][c];
				topPixel.setColor(bottomPixel.getColor());
			}
		}
  }
  
  public void mirrorArms() {
		int reflection = 200;
		Pixel topPixel;
		Pixel bottomPixel;
		Pixel[][] pixels = this.getPixels2D();
		for (int r = 158; r < reflection; r++) {
			for (int c = 100; c < 170; c++) {				
				topPixel = pixels[r][c];
				bottomPixel = pixels[reflection * 2 - r][c];	
				bottomPixel.setColor(topPixel.getColor());
			}
		}
		for (int x = 158; x < reflection; x++) {
			for (int y = 239; y < 305; y++) {
				topPixel = pixels[x][y];
				bottomPixel = pixels[reflection * 2 - x][y];
				bottomPixel.setColor(topPixel.getColor());
			}
		}
	}
	
	public void mirrorGull() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel originalPixel;
		Pixel newPixel;
		for (int row = 230; row < 330; row++) {
			for (int col = 230; col < 350; col++) {				
				originalPixel = pixels[row][col];
				newPixel = pixels[row + 20][col + 160];
				newPixel.setColor(originalPixel.getColor());
			}
		}
	}
	
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }
  
  	public void copy(Picture fromPic, int startRow, int startCol, int endRow, int endCol) {
	  	Pixel fromPixel;
		Pixel toPixel;
		Pixel[][] toPixels = this.getPixels2D();
		Pixel[][] fromPixels = fromPic.getPixels2D();
		for (int fromRow = 0, toRow = startRow; fromRow < endRow && toRow < endRow; fromRow++, toRow++) {
		      for (int fromCol = 0, toCol = startCol; fromCol < endCol && toCol < endCol; fromCol++, toCol++) {
			        fromPixel = fromPixels[fromRow][fromCol];
			        toPixel = toPixels[toRow][toCol];
			        toPixel.setColor(fromPixel.getColor());
		      }
		  } 
	}	

  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("flower1.jpg");
    Picture flower2 = new Picture("flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("collage.jpg");
  }
  
  public void myCollage() {
		Picture flower = new Picture("flower1.jpg");
		Picture swan = new Picture("swan.jpg");
		Picture beach = new Picture("beach.jpg");
		this.copy(flower, 0, 0, 100, 100);
		this.copy(swan, 100, 300);
		this.copy(beach, 200, 400);
		this.mirrorHorizotal();
		this.write("collage.jpg");
  }
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
    Pixel topPixel;
    Pixel bottomPixel;
    Color topColor;
    for (int col = 0; col < pixels[0].length; col++)
    {
      for (int row = 0; row < pixels.length - 1; row++) {
        topPixel = pixels[row][col];
        bottomPixel = pixels[row + 1][col];
        topColor = topPixel.getColor();
        if (bottomPixel.colorDistance(topColor) > edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
  }
  
  public void encode(Picture messagePict) {  
	  Pixel[][] messagePixels = messagePict.getPixels2D();  
	  Pixel[][] currPixels = this.getPixels2D();  
	  Pixel currPixel = null; 
	  Pixel messagePixel = null; 
	  int count = 0; 
	  for (int row = 0; row < this.getHeight(); row++)  { 
		  for (int col = 0; col < this.getWidth(); col++)  { 
			  currPixel = currPixels[row][col]; 
			  if (currPixel.getRed() > 127 && currPixel.getRed() % 2 == 0) {
				  currPixel.setRed(currPixel.getRed() + 1);  
			  } 
			  if (currPixel.getRed() <= 127 && currPixel.getRed() % 2 == 1) {
				  currPixel.setRed(currPixel.getRed() - 1);  
			  }
			  if (currPixel.getGreen() > 127 && currPixel.getGreen() % 2 == 0) {
				  currPixel.setGreen(currPixel.getGreen() + 1);  
			  } 
			  if (currPixel.getGreen() <= 127 && currPixel.getGreen() % 2 == 1) {
				  currPixel.setGreen(currPixel.getGreen() - 1);  
			  }
			  if (currPixel.getBlue() > 127 && currPixel.getBlue() % 2 == 0) {
				  currPixel.setBlue(currPixel.getBlue() + 1);  
			  } 
			  if (currPixel.getBlue() <= 127 && currPixel.getBlue() % 2 == 1) {
				  currPixel.setBlue(currPixel.getBlue() - 1);  
			  }
			  messagePixel = messagePixels[row][col];  
			  if (messagePixel.colorDistance(Color.BLACK) < 50)  { 
				  int randomNumber = (int) (Math.random() * 3);
				  if (randomNumber == 0) {
					  currPixel.setRed(currPixel.getRed() - (currPixel.getRed() % 2) + ((currPixel.getRed() % 2) + 1) % 2);
				  } else if (randomNumber == 1) {
					  currPixel.setGreen(currPixel.getGreen() - (currPixel.getGreen() % 2) + ((currPixel.getGreen() % 2) + 1) % 2);
				  } else {
					  currPixel.setBlue(currPixel.getBlue() - (currPixel.getBlue() % 2) + ((currPixel.getBlue() % 2) + 1) % 2);
				  }
				  count++; 
			  } 
		  } 
	  } 
	  System.out.println(count);
  } 
  
  public Picture decode() { 
	  Pixel[][] pixels = this.getPixels2D(); 
	  int height = this.getHeight(); 
	  int width = this.getWidth(); 
	  Pixel currPixel = null;
	  Pixel messagePixel = null; 
	  Picture messagePicture = new Picture(height,width);  
	  Pixel[][] messagePixels = messagePicture.getPixels2D();  
	  int count = 0; 
	  for (int row = 0; row < this.getHeight(); row++)  { 
		  for (int col = 0; col < this.getWidth(); col++)  { 
			  currPixel = pixels[row][col]; 
			  messagePixel = messagePixels[row][col]; 
			  if ((currPixel.getRed() > 127 && currPixel.getRed() % 2 == 1) || (currPixel.getRed() <= 127 && currPixel.getRed() % 2 == 0)) {
				  if ((currPixel.getGreen() > 127 && currPixel.getGreen() % 2 == 1) || (currPixel.getGreen() <= 127 && currPixel.getGreen() % 2 == 0)) {
					  if ((currPixel.getBlue() > 127 && currPixel.getBlue() % 2 == 1) || (currPixel.getBlue() <= 127 && currPixel.getBlue() % 2 == 0)) {
						  messagePixel.setColor(Color.WHITE); 
					  } else {
						  messagePixel.setColor(Color.BLACK);
					  }
				  } else {
					  messagePixel.setColor(Color.BLACK);
				  }
			  } else {
				  messagePixel.setColor(Color.BLACK);
			  }
			  count++;
		  } 
	  } 
	  System.out.println(count);
	  return messagePicture; 
  }

  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
} // this } is the end of class Picture, put all new methods before this
