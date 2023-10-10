package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Module1CodingAssessment {






	public static void main(String[] args) {

		List<FlowerShopOrder> flowerOrders = new ArrayList<>();

		FlowerShopOrder flowerShopOrder = new FlowerShopOrder("Elegant", 2);
		FlowerShopOrder flowerShopOrder1 = new FlowerShopOrder("Basic", 6);





		File flowerFile = new File("FlowerInput.csv");

		try {
			Scanner fileInput = new Scanner(flowerFile);
			List<FlowerShopOrder> orders = new ArrayList<>();
			while(fileInput.hasNextLine()){
				String orderLine = fileInput.nextLine();
				String[] lineArr = orderLine.split("\\,");

				FlowerShopOrder flowerShopOrder01 =  new FlowerShopOrder(lineArr[0], Integer.parseInt(lineArr[1]));
				orders.add(flowerShopOrder01);
			}


			for(FlowerShopOrder flowerShopOrder01: orders){
				System.out.println(flowerShopOrder01);
			}

		} catch(FileNotFoundException e){
			System.out.println("File not found");
		}

	}

}
