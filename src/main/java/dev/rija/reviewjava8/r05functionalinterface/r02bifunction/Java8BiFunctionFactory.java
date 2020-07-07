package dev.rija.reviewjava8.r05functionalinterface.r02bifunction;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.function.BiFunction;

/**
 * This example uses BiFunction to create an object, acts as a factory pattern
 */
public class Java8BiFunctionFactory {
	public static void main(String[] args) {
		GPS gps = factory("40.741895", "-73.989308", GPS::new);
		System.out.println(gps);
		// GPS(latitude=40.741895, longitude=-73.989308)
		
		/**
		 * The GPS::new calls the following constructor, which accepts two arguments and return an object (GPS),
		 * so it matches with the BiFunction signature.
		 *
		 * public GPS(String latitude, String longitude) {
		 *       this.latitude = latitude;
		 *       this.longitude = longitude;
		 *   }
		 */
	}
	
	public static <R extends GPS> R factory(String latitude, String longitude,
											BiFunction<String, String, R> func) {
		return func.apply(latitude, longitude);
	}
}

@Data
@AllArgsConstructor
class GPS {
	String latitude;
	String longitude;
}
