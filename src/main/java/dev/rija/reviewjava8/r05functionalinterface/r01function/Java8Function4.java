package dev.rija.reviewjava8.r05functionalinterface.r01function;

import org.apache.commons.codec.digest.DigestUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * This example accepts Function as an argument, convert a List of String into another List of String, which was hashed with SHA256.
 */
public class Java8Function4 {
	public static void main(String[] args) {
		Java8Function4 obj = new Java8Function4();
		
		List<String> list = Arrays.asList("node", "c++", "java", "javascript");
		
		// lambda
		List<String> result1 = obj.convert(list, x -> obj.sha256(x));
		System.out.println(result1);
		// [545ea538461003efdc8c81c244531b003f6f26cfccf6c0073b3239fdedf49446, cedb1bac7efcd7db47e9f2f2250a7c832aba83b410dd85766e2aea6ec9321e51, 38a0963a6364b09ad867aa9a66c6d009673c21e182015461da236ec361877f77, eda71746c01c3f465ffd02b6da15a6518e6fbc8f06f1ac525be193be5507069d]
		
		// method reference
		List<String> result2 = obj.convert(list, obj::sha256);
		System.out.println(result2);
		// [545ea538461003efdc8c81c244531b003f6f26cfccf6c0073b3239fdedf49446, cedb1bac7efcd7db47e9f2f2250a7c832aba83b410dd85766e2aea6ec9321e51, 38a0963a6364b09ad867aa9a66c6d009673c21e182015461da236ec361877f77, eda71746c01c3f465ffd02b6da15a6518e6fbc8f06f1ac525be193be5507069d]
	}
	
	public <T, R> List<R> convert(List<T> list, Function<T, R> func) {
		List<R> result = new ArrayList<>();
		for (T t : list) {
			result.add(func.apply(t));
		}
		return result;
	}
	
	public String sha256(String str) {
		return DigestUtils.sha256Hex(str);
	}
}
