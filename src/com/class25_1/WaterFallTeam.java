package com.class25_1;

import com.class26.Employee;

public class WaterFallTeam extends Employee{

	
	 

			private int employeeId;
			private String companyName;

			public static void main(String[] args) {
			
				WaterFallTeam team=new WaterFallTeam();
				team.companyName="Syntax";
				//accessing protected variable in different package
				team.employeeId=102;
				
				
			}
}
