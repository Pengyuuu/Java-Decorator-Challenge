
public class Peppers extends PizzaDecorator {
	Pizza pizza;
	
	public Peppers(Pizza pizza) {
		this.pizza = pizza;
	}
	public String getDescription() {
		return pizza.getDescription() + ", peppers";
	}
	
	public double cost() {
		return pizza.cost() + 2.00;
	}
}
