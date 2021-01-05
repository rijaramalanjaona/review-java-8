package dev.rija.reviewjava8.r07streams.flatmap;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * This example read a text file, split the line by spaces, and displayed the total number of the words.
 *
 * D:\\tmp\\test.txt
 * hello world Java
 * hello world Python
 * hello world Node JS
 * hello world Rust
 * hello world Flutter
 */
public class Java8StreamFlatMap4 {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("D:\\tmp\\test.txt");
		
		// read the file into a stream of lines
		Stream<String> lines = Files.lines(path, StandardCharsets.UTF_8);
		
		// stream of array...hard to process.
		// Stream<String[]> words = lines.map(line -> line.split(" +"));
		
		// stream of stream of string....hmm...better flat to one level.
		// Stream<Stream<String>> words = lines.map(line -> Stream.of(line.split(" +")));
		
		Stream<String> words = lines.flatMap(line -> Stream.of(line.split(" +")));
		
		System.out.println(words.count()); // 16
	}
}
