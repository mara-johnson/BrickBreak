import java.awt.Graphics;
import java.awt.*;

public class Paddle {

	//your code here!
	
	//don't forget you need instance variables:
	private int x;
	private int y;
	private int width;
	private int height;
	private int velocity;
	
	
	//constructor(s):
	public Paddle(){
		x = 310;
		y = 550;
		width = 100;
		height = 8; 
		velocity = 0;
	}

	public Paddle(int initX, int initY, int initWidth, int initHeight){
		x = initX;
		y = initY;
		width = initWidth;
		height = initHeight;
		velocity = 0;
	}
	
	//methods:
	public void setX(int x){
		this.x = x;
	}

	public int getX(){
		return x;
	}

	public void setY(int y){
		this.y = y;
	}

	public int getY(){
		return y;
	}

	public void setWidth(int width){
		this.width = width;
	}

	public int getWidth(){
		return width;
	}

	public void setHeight(int height){
		this.height = height;
	}

	public int getHeight(){
		return height;
	}

	public void setVelocity(int velocity){
		this.velocity = velocity;
	}

	public int getVelocity(){
		return velocity;
	}

	//precondition: amount is not null, velocity is not null
	//postcondition: the velocity of the paddle object is updated, 
	//the velocity will be greater than or equal to -8 and less than or equal to 8
	public void addVelocity(int amount){
		velocity = velocity + amount;
		if (velocity > 8){
			velocity = 8;
		}
		if (velocity < -8){
			velocity = -8;
		}
	}

	//precondition: x and velocity are not null
	//postcondition: the location of the paddle object is updated
	public void move(){
		x += velocity;
		if (velocity > 1){
			velocity--;
		}
		if (velocity < -1){
			velocity++;
		}
		if (x >= 600 || x <= 0){
			velocity = 0;
		}
	}

	//precondition: g is not null
	//postcondition: a rectangle is drawn and filled with the color white at the position (x, y) and has a width and a height
	public void draw(Graphics g){
		g.setColor(Color.WHITE);
		g.fillRect(x, y, width, height);
	}
	
	
}
