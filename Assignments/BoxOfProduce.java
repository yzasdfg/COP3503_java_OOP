
public class BoxOfProduce {

	private String fruit1;
	private String fruit2;
	private String fruit3;

	public BoxOfProduce(String fruit1, String fruit2, String fruit3) {

		this.fruit1=fruit1;
		this.fruit2=fruit2;
		this.fruit3=fruit3;
		//setFruit1(fruit1);
		//setFruit2(fruit2);
		//setFruit3(fruit3);
	}

	public void setFruit1(String fruit1)
	{
		this.fruit1 = fruit1;
	}

	public void setFruit2(String fruit2)
	{
		this.fruit2 = fruit2;
	}

	public void setFruit3(String fruit3)
	{
		this.fruit3 = fruit3;
	}

	public String getFruit1()
	{
		return fruit1;
	}

	public String getFruit2()
	{
		return fruit2;
	}

	public String getFruit3() {
		return fruit3;
	}

	public String toString()
	{
		return "1 : " + fruit1 + "\n" + "2 : " + fruit2 + "\n" + "3 : " + fruit3;
	}

}

