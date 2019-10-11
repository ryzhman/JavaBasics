package com.go2it.edu.enums;

/**
 * @author Alex Ryzhkov
 */
public class EnumExample {
	public static void main(String[] args) {
//		BeerType type = BeerType.valueOf("DARK");
		BeerType beerType = BeerType.valueOf("DARK");
		System.out.println(beerType.getAlcoholLevel());

		for(BeerType type:BeerType.values()) {
			System.out.println(type);
		}

//		System.out.println(BeerGlass.HUGE);
//		System.out.println(BeerType.DARK);
	}


	private enum BeerType{
		DARK(8.0), LIGHT(2.0);

		private double alcoholLevel;

		BeerType(double alcoholLevel){
			this.alcoholLevel = alcoholLevel;
		}

		public double getAlcoholLevel() {
			return alcoholLevel;
		}

	}
}
