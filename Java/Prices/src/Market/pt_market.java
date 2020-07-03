package Market;

public class pt_market {

	double WTP_Max; double OC_Min; double slope_demand; double slope_supply;
	
	//Constructor
	public pt_market(double WTP_Max, double OC_Min, double slope_demand, double slope_supply) {
		
		this.WTP_Max = WTP_Max;
		this.OC_Min = OC_Min;
		this.slope_demand = slope_demand;
		this.slope_supply = slope_supply;
	
		if(WTP_Max < OC_Min) {
			System.out.println("You need higher demand\n");
			System.exit(1);
		}
		
	}
	
        
        public double getWTP_Max(){
            return this.WTP_Max;
        }
        public double getOC_Min(){
            return this.OC_Min;
        } 
        public double getslope_demand(){
            return this.slope_demand;
        }
        public double getslope_supply(){
            return this.slope_supply;
        }

	public double getEquilibriumQuantity() {
		//Computes equilibrium quantity
		return (this.WTP_Max-this.OC_Min)/(this.slope_demand+this.slope_supply);
	}
	public double getEquilibriumPrice() {
		//Computes equilibrium price
		return this.WTP_Max-this.slope_demand*(this.getEquilibriumQuantity());
	}
	public double getConsumerSurplus() {
		//Computes consumer surplus
		return (this.WTP_Max-this.getEquilibriumPrice())*this.getEquilibriumQuantity();
	}
	public double getProducerSurplus() {
		//Computes producer surplus 
		return (this.getEquilibriumPrice()-this.OC_Min)*this.getEquilibriumQuantity()/2;
	}
	public double getTotalSurplus(){
		//Computes total surplus
		return (this.getProducerSurplus()+this.getConsumerSurplus());
	}
	public double getDemandCurve(float x) {
		//Computes Demand Curve
		return this.WTP_Max-this.slope_demand*x;
	}
	public double getSupplyCurve(float x) {
		//Computes Supply Curve
		return this.OC_Min+this.slope_supply*x;
	}
	
	
}
