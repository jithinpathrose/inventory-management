package com.inventory.management.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class AdaptorDemo {

	public static void main(String[] args) {
		List<Shape> employees = new ArrayList<>();


		ShapeLdap employeeLdap = new ShapeLdap("2", "12", "WHITE", "56");
		employees.add(new ShapeAdapterLdap(employeeLdap));
		
		System.out.println(employees.get(0).toString());
	
	}

}
