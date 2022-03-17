package com.te.prac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class RepeatedWords {
	
	public static void main(String[] args) {
		String[] str = {"Darshana", "Ozarde", "Darshana", "Ozarde", "Darshana"};
		Map<String, Long> collect = Arrays.stream(str).collect(Collectors.groupingBy(a-> a,Collectors.counting()));
		System.out.println(collect);
	}

}
