
public class HearthstoneCard 
{
	private String name;
	private int cost;
	private int attack;
	private int defense;
	
	public HearthstoneCard(String name, int cost, int attack, int defense)
	{
		this.cost = cost;
		this.attack = attack;
		this.defense = defense;
		this.name = name;
	}
	
	public int getCost()
	{
		return this.cost;
	}
	
	void display()
	{
		System.out.format("Name: %s \nCost: %d \nAttack: %d \nDefense: %d \n", this.name, this.cost, this.attack, this.defense);
	}
}
