import java.awt.*;

public class Ball {
	//your code here!
	
	//don't forget you need instance variables:
	private int xPos;
	private int yPos;
	private int size;
	private int yVelocity;
	private int xVelocity;
	
	//constructor(s):
	public Ball(){
		//350, 450, 20
		xPos = 350;
		yPos = 450;
		size = 20;
		yVelocity = 0;
		xVelocity = 0;
	}
	
	//methods:
	public Ball(int initXPos, int initYPos, int initSize){
		xPos = initXPos;
		yPos = initYPos;
		size = initSize;
		yVelocity = 0;
		xVelocity = 0;
	}

	public void setXpos(int xPos){
		this.xPos = xPos;
	}

	public void setX(int xPos){
		this.setXpos(xPos);
	}

	public int getXpos(){
		return xPos;
	}

	public void setYpos(int yPos){
		this.yPos = yPos;
	}

	public void setY(int yPos){
		this.setYpos(yPos);
	}

	public int getYpos(){
		return yPos;
	}

	public void setSize(int size){
		this.size = size;
	}

	public int getSize(){
		return size;
	}

	public void setXVelocity(int xVelocity){
		this.xVelocity = xVelocity;
	}

	public int getXVelocity(){
		return xVelocity;
	}

	public void setYVelocity(int yVelocity){
		this.yVelocity = yVelocity;
	}

	public int getYVelocity(){
		return yVelocity;
	}

	//precondition: xVelocity is not null and is an int
	//postcondition: the new xVelocity is the reverse of the old xVelocity
	public void reverseX(){
		xVelocity = 0 - xVelocity;
	}

	//precondition: yVelocity is not null and is an int
	//postcondition: the new yVelocity is the reverse of the old yVelocity
	public void reverseY(){
		yVelocity = 0 - yVelocity;
	}

	//precondition: g is not null
	//postcondition: the ball is drawn and updated
	public void draw(Graphics g){
		g.setColor(Color.YELLOW);
		g.fillOval(xPos, yPos, size, size);
	}

	//precondition: xVelocity, and yVelocity are not null, xPos and yPos are greater than or equal to 0
	//postcondition: the location of the ball is updated
	public void move(){
		xPos += xVelocity;
		yPos += yVelocity;
		if (xPos == 650){
			reverseX();
		}
		if (xPos == 0){
			reverseX();
		}
	
	}

	



}
