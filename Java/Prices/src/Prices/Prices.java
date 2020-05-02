package Prices;
import Market.*;
import Util.*;

//Suppositions made in this analysis are the following:
//both demand curve and supply curve are considered linear;

//We will focus on one good, and we will 

public class Prices {
	public static void main(String[] args) {
		
		Prices_GUI myGraphicalInterface = new Prices_GUI();
                myGraphicalInterface.setVisible(true);
		
		//Prototype pt_market(WTP_Max, OC_Min, slope_demand, slope_supply
		//Baseline data from altroconsumo data	
		
		pt_market online_market = new pt_market(3.9, 0.35, 50, 1);
		pt_market physical_market = new pt_market(5.9, 0.6, 50,2);
		
		System.out.println("Economia di Mercato, agenti sono price takers, prezzo, domanda e offerta non vincolate");
		
		//Prezzo medio indicato su Altroconsumo per negozi di ecommerce => 2 euro
		//Prezzo medio indicato su Altroconsumo per negozi fisici => 1,80 euro
		
		System.out.println("\nPrezzo di equilibrio medio per unità di bene");
		System.out.println("Online Market:   " + online_market.getEquilibriumPrice());
		System.out.println("Physical Market: " + physical_market.getEquilibriumPrice());
		
		System.out.println("\nQuantità di mascherine per consumatore ogni giorno");
		System.out.println("Online Market:   " + online_market.getEquilibriumQuantity());
		System.out.println("Physical Market: " + physical_market.getEquilibriumQuantity());
		
		System.out.println("\n\nEconomia di Mercato, agenti sono price takers, domanda e offerta non vincolate, prezzo vincolato");
		
		pt_market fp_online_market = new pt_market(0.51, 0.35, 3, 1.5);
		pt_market fp_physical_market = new pt_market(0.51, 0.50, 1000000,2);
		
		System.out.println("\nPrezzo di equilibrio medio per unità di bene");
		System.out.println("Online Market:   " + fp_online_market.getEquilibriumPrice());
		System.out.println("Physical Market: " + fp_physical_market.getEquilibriumPrice());
		
		System.out.println("\nQuantità di mascherine per consumatore ogni giorno");
		System.out.println("Online Market:   " + fp_online_market.getEquilibriumQuantity());
		System.out.println("Physical Market: " + fp_physical_market.getEquilibriumQuantity());
		
		
	}
}
