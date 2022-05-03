
public class ClassParticipation_1 {



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fan fan1 =new Fan();
		fan1.setSpeed(Fan.FAST); // FAST is static
		fan1.setRadius(10);
		fan1.setColor("yellow");
		fan1.setOn(true);
		System.out.println("fan1: \n" +fan1.toString()+ "\n");
		
		Fan fan2 =new Fan();
		System.out.println("fan2: \n" +fan2.toString()+ "\n");
	}

}




class Fan{

	public static final int SLOW=1;
	public static final int MEDIUM=2;
	public static final int FAST=3;

	private int speed=SLOW;
	private boolean on=false;
	private double radius=5;
	private String color="blue";

	public Fan(){

	}

	public int getSpeed(){
		return speed;
	}

	public void setSpeed(int newSpeed){
		speed= newSpeed;
	}

	public boolean isOn(){
		return on;
	}

	public void setOn(boolean trueOrFalse){
		on=trueOrFalse; // don't use this.on 
	}

	public double getRadius(){
		return radius;
	}

	public void setRadius(double newRadius){
		radius=newRadius;
	}

	public String getColor(){
		return color;
	}

	public void setColor( String newColor){
		color= newColor;
	}

	public String toString(){
		if (on){
			return "speed " + speed + "\n" + "radius " + radius+ "\n"+ "color " +color+ "\n" 
					+ "fan is on";
		}
		else{
			return "color " +color+ "\n" + "radius " + radius+ "\n"+ "fan is off";
		}		
	}

}



