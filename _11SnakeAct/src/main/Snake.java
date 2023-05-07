package main;

import java.util.*;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Snake extends Circle{
	private List<Circle> tails;
	private int length;
	private Direction curvDirection;
	private static final int STEP = 8;

	public Snake(double x, double y, double radius) {
		super(x,y,radius);
		this.tails = new ArrayList<>();
		this.curvDirection = Direction.UP;
	}
	public void step() {
		for ( int i = this.length -1; i >= 0; i--) {
			if(i==0) {
				this.tails.get(i).setCenterX(getCenterX());
				this.tails.get(i).setCenterY(getCenterY());
			}else {
				this.tails.get(i).setCenterX(this.tails.get(i-1).getCenterX());
				this.tails.get(i).setCenterY(this.tails.get(i-1).getCenterY());
			}
		}
		if(this.curvDirection == Direction.UP) {
			this.setCenterY(this.getCenterY() - STEP);
		}else if(this.curvDirection == Direction.DOWN) {
			this.setCenterY(this.getCenterY() + STEP);
		}else if(this.curvDirection == Direction.LEFT) {
			this.setCenterX(this.getCenterX() - STEP);
		}else if(this.curvDirection == Direction.RIGHT) {
			this.setCenterX(this.getCenterX() + STEP);
		}
	}
	private Circle endTail() {
		if(this.length == 0) {
			return this;
		}
		return this.tails.get(this.length -1);
	}
	public void eats(Circle food) {
		Circle tail = endTail();
		food.setCenterX(tail.getCenterX());
		food.setCenterY(tail.getCenterY());
		food.setFill(Color.BLACK);
		tails.add(this.length++, food);
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public Direction getCurvDirection() {
		return curvDirection;
	}
	public void setCurvDirection(Direction curvDirection) {
		this.curvDirection = curvDirection;
	}

	public boolean eatSelf() {
		for(int i = 0; i < this.length; i++) {
			if(this.getCenterX() == this.tails.get(i).getCenterX()&&
					this.getCenterY() == this.tails.get(i).getCenterY()) {
				return true;
			}
		}
		return false;
	}
}