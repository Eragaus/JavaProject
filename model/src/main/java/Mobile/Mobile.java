package Mobile;

import Element.Element;
import contract.IMobile;
import contract.IMovement;
import contract.Permeability;
import contract.State;

public abstract class Mobile extends Element implements IMobile{
	
	protected int x;
	protected int y;
	protected int LastPositionX;
	protected int LastPositionY;
	protected State state;
	protected IMovement movement;
	//protected ISpeed speed;
	
	
	public Mobile(Permeability permeability, char sprite/*, IMovement movement, ISpeed speed*/) {
		super(permeability, sprite);
		this.state=this.alive();
		//this.movement=movement;
		
	}
	public void finish()
	{
		this.state=State.Finish;
	}
	@Override
	public State alive()
	{
		return State.Life;
	}
	
	@Override
	public void die()
	{
		this.state=State.Dead;
	}
	
	@Override
	public int getX() {
		return this.x;
	}


	@Override
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}


	@Override
	public int getY() {
		return this.y;
	}



	@Override
	public int getLastPositionX() {
		return this.LastPositionX;
	}


	@Override
	public void setLastPositionX(int lastPositionX, int lastPositionY) {
		this.LastPositionX = lastPositionX;
		this.LastPositionY = lastPositionY;
	}


	@Override
	public int getLastPositionY() {
		return this.LastPositionY;
	}



	@Override
	public State getState() {
		return this.state;
	}




	public IMovement getMovement() {
		return this.movement;
	}



	public void setMovement(IMovement movement) {
		this.movement = movement;
	}

	public void moveLeft()
	{
		this.setXY(getX()+1, getY());
	}
	
	

	/*public ISpeed getSpeed() {
		return this.speed;
	}


	public void setSpeed(ISpeed speed) {
		this.speed = speed;
	}*/
	public void GugusForm(char value)
	{
	this.setSprite(value);
		
	}

}
