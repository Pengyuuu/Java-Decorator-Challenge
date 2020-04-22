
public class Olives extends PizzaDecorator {
	Pizza pizza;
	
	public Olives(Pizza pizza) {
		this.pizza = pizza;
	}
	
	public String getDescription() {
		return pizza.getDescription() + ", olives";
	}
	
	public double cost() {
		return pizza.cost() + 02.00;
	}
}
