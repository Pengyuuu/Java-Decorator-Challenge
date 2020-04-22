import java.text.DecimalFormat;

public class Main {
	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		Pizza pizza = new ThinCrustPizza();
		
		pizza = new Cheese(pizza);
		pizza = new Olives(pizza);
		pizza = new Peppers(pizza);
		
		System.out.print("Order is " + pizza.getDescription() + " and the total is $" + df.format(pizza.cost()));
	}

}
