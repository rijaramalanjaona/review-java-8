package dev.rija.reviewjava8.r06methodreference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * the double colon (::) operator is called method references.
 * another way call to an existing method.
 *
 * There are 4 kinds of method references:
 *
 * Reference to a static method ClassName::staticMethodName
 * Reference to an instance method of a particular object Object::instanceMethodName
 * Reference to an instance method of an arbitrary object of a particular type ContainingType::methodName
 * Reference to a constructor ClassName::new
 *
 * 1. Static method
 * lambda expression
 * (args) -> ClassName.staticMethodName(args)
 * =>
 * method reference
 * ClassName::staticMethodName
 */
public class Java8MethodReference1A {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("A", "B", "C");
		
		// anonymous class
		list.forEach(new Consumer<String>() {
			@Override
			public void accept(String s) {
				SimplePrinter.print(s);
			}
		});
		
		// lambda expression
		list.forEach(x -> SimplePrinter.print(x));
		
		// method reference
		list.forEach(SimplePrinter::print);
	}
}

class SimplePrinter {
	public static void print(String str) {
		System.out.println(str);
	}
}
