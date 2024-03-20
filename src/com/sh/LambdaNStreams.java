package com.sh;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LambdaNStreams {

	public static void main(String[] args) {
		//creation of Stream
		
		//1.
		List<String> strList=new ArrayList<>();
		strList.add("abc");
		strList.add("ghje");
		strList.add("renm");
		
		Stream<String> stream1 =strList.stream();
		stream1.forEach((i)->System.err.println(i));
		
		//2.
		Stream<List<String>> stream2= Stream.of(strList);
		stream2.forEach((i)->System.err.println(i));
		//3.
		Stream<String> stream3 = Stream.of("hello","hola", "hallo", "ciao");
		stream3.forEach((i)->System.err.println(i));
		//4.
		String[] words = {"hello", "hola", "hallo", "ciao"};
		Stream<String> stream4 = Stream.of(words);
		stream4.forEach((i)->System.err.println(i));
		
		//intermediate or lazy operation should have one terminal operation et end
		//after terminal operation we can use stream reference only once
		int[] digits = {0, 1, 2, 3, 4 , 5, 6, 7, 8, 9};
		IntStream s = IntStream.of(digits);
		long n = s.count();
	//	System.out.println(s.findFirst()); // An exception is thrown
		
	}

}
