package dev.rija.reviewjava8.r05functionalinterface.r09supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/**
 * returns a Supplier
 */
public class Java8Supplier2 {
	public static void main(String[] args) {
		Java8Supplier2 obj = new Java8Supplier2();
		List<Object> list = obj.supplier().get();
	}
	
	public <T> Supplier<List<T>> supplier() {
		// return () -> new ArrayList<>();
		return ArrayList::new;
	}
}
