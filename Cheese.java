public class Cheese extends PizzaDecorator {
	Pizza pizza;
	
	public Cheese(Pizza pizza) {
		this.pizza = pizza;
	}
	
	public String getDescription() {
		return pizza.getDescription() + ", cheese";
	}
	
	public double cost() {
		return pizza.cost() + 2.00;
	}
}
