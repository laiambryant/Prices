package Util;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
/*
public class GUI extends JFrame {

	private static final long serialVersionUID = 1L;
	
	//Input Variables and labels
	JLabel WTP_Max_txt = new JLabel("Maximum Willingness To Pay: "); 
	JTextField WTP_Max = new JTextField(15); 
	JLabel OC_Min_txt = new JLabel("Minimum Opportunity Cost: "); 
	JTextField OC_Min = new JTextField(15); 
	JLabel slope_demand_txt = new JLabel("Demand Curve Slope: "); 
	JTextField slope_demand = new JTextField(15);	
	JLabel slope_supply_txt = new JLabel("Supply Curve Slope: "); 
	JTextField slope_supply = new JTextField(15); 

	JPanel top_panel = new JPanel();
	JPanel bot_panel = new JPanel();
	
	//Btns
	JButton calculate_btn = new JButton("Calculate");
	JButton reset_btn = new JButton("Reset");
	
	public GUI() {
		
		this.setLayout(new FlowLayout());

		GraphPanel gp = new GraphPanel();
		
		createInputElems(top_panel);
		addSpace();
		CreateButtons(top_panel);
		this.add(gp);
		defaultOps();
		
	}
	

	
	private void createInputElems(JPanel top_panel) {
		this.add(WTP_Max_txt);
		this.add(WTP_Max);
		this.add(OC_Min_txt);
		this.add(OC_Min);
		this.add(slope_demand_txt);
		this.add(slope_demand);
		this.add(slope_supply_txt);
		this.add(slope_supply);
	}
	
	private void addSpace() {
		
		JPanel space = new JPanel();
		space.setSize(100,100);
		space.setLayout(new GridLayout(2,2));
		this.add(space);
		space.setVisible(true);
		
	}
	
	private void CreateButtons(JPanel top_panel) {
		
		//Action Listener for reset button
		ActionListener reset_al = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				//resets all values
				WTP_Max.setText("");
				OC_Min.setText("");
				slope_demand.setText("");
				slope_supply.setText("");
				
			}
			
		};
		
		//Action listener for calculate button
		ActionListener calculate_al = new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent arg0) {	
					
					double WTP_Max = Double.parseDouble(WTP_Max_txt.getText()); 
					double OC_Min = Double.parseDouble(OC_Min_txt.getText()); 
					double slope_demand = Double.parseDouble(slope_demand_txt.getText()); 
					double slope_supply = Double.parseDouble(slope_supply_txt.getText()); 
		
					//TODO:Process Data
					
					
					//TODO:return data to screen
					
					
					//TODO:Call Python program
					
					
					//TODO:add image to screen
					
					
				}
			
		};		
		this.add(calculate_btn);
		calculate_btn.addActionListener(calculate_al);
		this.add(reset_btn);
		reset_btn.addActionListener(reset_al);
	}

	private void defaultOps() {
		
		this.setVisible(true);
		this.setSize(800,800);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
}
*/

