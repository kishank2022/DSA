package com.practice.dsa.java8;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.practice.dsa.java8.linkedList.Employee;

public class Array50 {

	public static void main(String[] args) throws Exception {
		Array50 array1 = new Array50();
//		maxEelement();
//		minEelement();
//		reverseElementinArray();
//		addElements();
//		countEvenOdd();
//		alternatePrint1();
		//alternatePrint2();
//		secondLargest1();
//		secondSmallest();
//		mergerSortedArray();
//		checkSorted();
//		checkSorted1();
		
//		array1.calculatorImpl(10,5);
//		evenNoList();
//		oddNoList();
		//maxInt1();
//		 maxInt2();
//		minInt1();
//		secondmaxInt3();
//		secondminInt2();
//		sortNames1();
//		sortNames2();
//		convertUpperCaseFind();
//		convertLowerCaseFind();
//		convertUpperCaseFindList();
//		countLetterInString();
//		duplicateElement();
//		uniqueElements();
//		int number = primeNo(10);
//		primeNumber();
//		wholeNo();
//		checkPalindrome();
//		limitSkip();
//		map1();
//		startsWith();
//		longestString1();
//		leftRotateByOne();
//		leftRotateByNPosition();
//		rotateRightByOnePosition();
//		frequencyElement();
//		intersectionofArray();
//		unionOfTwoArray();
//		removeDuplicateFromArray();
//		findElementOnceAppear();
//		findMissing();
//		findDuplicate();
//		allPairs();
//		maxOfTwoInteger();
//		charCount1();
//		nameList();
//		test1();
//		countAinString();
//		test3();
		commonElement();
	}
	
	// Question 1 . Find the maximum element in the array ?
	public static void maxEelement() throws Exception {
		int [] array = {1,2,3,4,5,6,7,8,9,10};
		int maxElement = Arrays.stream(array).max().orElseThrow(() -> new Exception("Array is empty!"));
		System.out.println("maximum element is :"+maxElement);
	}
	
	// Question 2 . Find the minimum element in the array ?
		public static void minEelement() throws Exception {
			int [] array = {1,2,3,4,5,6,7,8,9,10};
			int minElement = Arrays.stream(array).min().orElseThrow(() -> new Exception("Array is empty!"));
			System.out.println("minimum element is :"+minElement);
		}
	
	// Question 3 . Reverse element in the array using simple java 
		public static void reverseElementinArray() {
			int [] array = {1,2,3,4,5,6,7,8,9,10};
			for(int i = 0; i<array.length/2; i++) {
				int temp = array[i]; 
				array [i] = array[array.length - 1 - i];
				array[array.length - 1 - i] = temp;
			}
			for(int i: array) {
				System.out.print(i+" ");
			}
		}

		// Question 4. find sum of all elements in the array 
		public static void addElements() {
			int [] array = {1,2,3,4,5,6,7,8,9,10};
			int sum = Arrays.stream(array).sum();
			System.out.println("Sum of all elements in the array is "+sum);
		}
		
		// Question 5 . Count no. of even and odd elements in the array 
		public static void countEvenOdd() {
			int [] array = {1,2,3,4,5,6,7,8,9};
			long evenCount = Arrays.stream(array).filter(e -> e%2 ==0).count();
			long oddCount = Arrays.stream(array).filter(e -> e%2 != 0 ).count();
			
			System.out.println("Count of even "+evenCount);
			System.out.println("Count of odd "+oddCount);
		}
		
//		Question 6 - print element of array in alternate position using Java 8
		public static void alternatePrint1() {
			int [] array = {1,2,3,4,5,6,7,8,9,10};
			IntStream.range(0, array.length)
					.filter(i -> i%2 == 0)
					.forEach(i -> System.out.print(array[i]+" "));
		}
		
		// alternate print without java 8 
		public static void alternatePrint2() {
			int [] array = {1,2,3,4,5,6,7,8,9,10};
			for(int i = 0; i<array.length; i=i+2) {
				System.out.print(array[i]+" ");
			}
		}
		
		// Question 7 - Find second largest element in the array using Java 8 
		public static void secondLargest1() {
			int [] array = {1,2,3,4,5,6,7,8,9,10};
			Optional<Integer> secondMax = Arrays.stream(array)
					.boxed()
					.distinct()
					.sorted(Comparator.reverseOrder())
					.skip(1)
					.findFirst();
			if(secondMax.isPresent()) {
				System.out.println("Second maximum element is "+secondMax.get());
			}else {
				System.out.println("No second largest element is present");
			}
		}
		
//		Question 8 - find the second smallest element in the array 
		public static void secondSmallest() {
			int [] array = {1,2,3,4,5,6,7,8,9,10};
			Optional<Integer> secondSmallest = Arrays.stream(array).boxed().distinct().sorted().skip(1).findFirst();
			System.out.println("Second smallest: "+secondSmallest.get());
		}
		
		// Question 9 - Merge two sorted array in java 
		public static void mergerSortedArray() {
			int array1 [] = {1,3,5};
			int array2 [] = {2,4,6};
			int array3 [] = Stream.concat(Arrays.stream(array1).boxed(), Arrays.stream(array2).boxed())
					.sorted().mapToInt(Integer::intValue).toArray();
			for(int value: array3) {
				System.out.print(value+" ");
			}
			
		}
		
		// Question 10 - Check if the array is sorted or not
		public static void checkSorted() {
			int array1 [] = {1,2,3,4,5,6};
			boolean flag = true;
			for(int i = 0; i<array1.length - 1; i++) {
				if(array1[i]>array1[i+1]) {
					flag = false;
				}
			}
			if(flag) {
				System.out.println("Array is sorted");
			}else {
				System.out.println("Array is not sorted");
			}			
		}
		
		public static void checkSorted1() {
			int array1 [] = {1,2,3,4,5,6};
			int array2[] = {6,5,4,3,2,1};
			boolean ascending = IntStream.range(0, array1.length - 1).allMatch(n -> array1[n] <= array1[n+1]);
			boolean descending = IntStream.range(0, array2.length - 1).allMatch(i -> array2[i]>=array2[i+1]);
			System.out.println(ascending);
			System.out.println(descending);
		}
		
		
		// Practice Questions 
		// Calculator using Lambda expression
		public void calculatorImpl(int n1, int n2) {
			
			CalculatorInterface sum = (int n3, int n4) -> n3+n4;
			System.out.println("Sum: "+sum.calculator(n1, n2));
			
			CalculatorInterface difference = (int n3, int n4) -> n3 - n4;
			System.out.println("Difference: "+difference.calculator(n1, n2));
			
			CalculatorInterface product = (int n3, int n4) -> n3*n4;
			System.out.println("product: "+product.calculator(n1, n2));
			
			CalculatorInterface remainder = (int n3, int n4) -> n3 % n4;
			System.out.println("remainder: "+remainder.calculator(n1, n2));
			
			CalculatorInterface quotient = (int n3, int n4) -> n3 / n4;
			System.out.println("quotient: "+quotient.calculator(n1, n2));			
		}
		
		// even no.s from 1 to 100 
		public static void evenNoList() {
			IntStream.rangeClosed(1, 100).filter(n -> n%2==0).forEach(System.out::println);
		}
		
		// odd no.s from 1 to 100
		public static void oddNoList() {
			IntStream.rangeClosed(1, 100).filter(n -> n%2!=0).forEach(System.out::println);
		}
		
		
		public static void maxInt1() {
			int [] array1 = {1,2,3,4,5,6,7,8};
			Optional<Integer> maxInt = Arrays.stream(array1)
					.boxed()
					.distinct()
					.sorted(Comparator.reverseOrder()).findFirst();
			System.out.println(maxInt.get());
		}
		
		public static void maxInt2() throws Exception {
			int [] array1 = {1,10,3,4,5,6};
			int maxInt = Arrays.stream(array1)
					.max()
					.orElseThrow( () -> new Exception("Array is empty!!"));
			System.out.println(maxInt);
		}
		
		public static void secondmaxInt3() {
			int [] array1 = {1,2,100,4,5,6,7,8, 99};
			Optional<Integer> secondMax = Arrays.stream(array1)
					.boxed()
					.distinct()
					.sorted(Comparator.reverseOrder()).skip(1).findFirst();
			System.out.println(secondMax.get());
		}
		
		public static void minInt1() {
			int [] array1 = {1,10,3,4,5,6};
			Optional<Integer> minInt = Arrays.stream(array1).boxed().distinct().sorted().findFirst();
			System.out.println(minInt.get());
		}
		
		public static void secondminInt2() {
			int [] array1 = {1,10,3,4,5,6};
			Optional<Integer> secondMin = Arrays.stream(array1)
					.boxed()
					.distinct()
					.sorted()
					.skip(1)
					.findFirst();
			System.out.println(secondMin.get());
		}
		
		public static void sortNames1() {
			String [] array1 = { "kishan", "alok", "cat", "dog", "zebra" };
			List<String> list1 = Arrays.stream(array1).sorted().collect(Collectors.toList());
			for(String name : list1) {
				System.out.print(name+" ");
			}
		}
		
		public static void sortNames2() {
			String [] array1 = { "kishan", "alok", "cat", "dog", "zebra" };
			List<String> list1 = Arrays.stream(array1).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
			for(String name : list1) {
				System.out.print(name+" ");
			}			
		}
		
		// find kishan and convert to uppercase 
		public static void convertUpperCaseFind() {
			String [] array1 = { "kishan", "alok", "cat", "dog", "zebra" };
			Optional<String> s1 = Arrays.stream(array1)
					.filter(name -> "kishan".equalsIgnoreCase(name))
					.map(String::toUpperCase)
					.findFirst();
			System.out.println(s1.get());
		}
		
		// find kishan and convert to lower case 
		public static void convertLowerCaseFind() {
			String [] array1 = { "kishan", "ak", "cat", "ALok", "zebra" };
			Optional<String> s1 = Arrays.stream(array1)
					.filter(name -> "alok".equalsIgnoreCase(name))
					.map(String::toLowerCase)
					.findFirst();
			System.out.println(s1.get());
		}
		
		public static void convertUpperCaseFindList() {
			String [] array1 = {"kishan", "alok", "mahesh", "Kaam", "anita"};
			List<String> list1 = Arrays.stream(array1)
					.filter(name -> (name.startsWith("k") || name.startsWith("K")))
					.map(String::toUpperCase).collect(Collectors.toList());
			for(String name : list1) {
				System.out.print(name+" ");
			}
		}
		
		public static void countLetterInString() {
			String input1 = "kishanmaheshkushwaha";
			Map<Character, Long> map1 = input1.chars()
					.mapToObj(c -> (char) c)
					.collect(Collectors.groupingBy(
							Function.identity(), Collectors.counting()
							));
			map1.forEach((ch, count) ->{
				String text = ch+" "+count;
				System.out.println(text);	
			});			
		}
		
		public static void duplicateElement() {
			String [] array1 = {"kishan", "alok", "mahesh", "Kaam", "anita", "kishan", "mahesh", "alok", "kaam"};
			List<String> list1 = Arrays.stream(array1)
					.collect(Collectors.groupingBy( Function.identity(), Collectors.counting()))
					.entrySet().stream().filter(value -> value.getValue()>1)
					.map(Map.Entry::getKey).collect(Collectors.toList());
			for(String name: list1) {
				System.out.println(name);
			}
		}
		
		public static void uniqueElements() {
			String [] array1 = {"kishan", "alok", "mahesh", "Kaam", "anita", "kishan", "mahesh", "alok", "kaam"};
			List<String> list1 = Arrays.stream(array1)
					.collect(Collectors.groupingBy(
							Function.identity(), Collectors.counting()
							))
					.entrySet().stream().filter(value -> value.getValue() == 1)
					.map(Map.Entry::getKey).collect(Collectors.toList());
			for(String name: list1) {
				System.out.println(name);
			}
		}
		
		public static boolean primeNo(int number) {
			int count = 0;
			for(int i = 1; i<=number; i++) {
				if(number % i == 0) {
					count = count + 1;
				}
			}
			if(count > 2) {
				return false;
			}else {
				return true;
			}
		}
		
		public static void primeNumber() {
			int [] array1 = {1,2,3,4,5,6,7,8,9,10};
			List<Integer> list1 = Arrays.stream(array1).boxed().filter(Array50::primeNo).collect(Collectors.toList());
			Arrays.stream(array1)
				.filter(Array50::primeNo)
				.forEach(System.out::println);
		}
		
		public static boolean wholeNumber(int number) {
			if(number<0) {
				return false;
			}else {
				return true;
			}
		}
		
		public static void wholeNo() {
			int [] array1 = {1,2,-3,4,5,6,-7,8,9,-10};
			Arrays.stream(array1).filter(Array50::wholeNumber).forEach(System.out::println);
		}
		
		
		public static boolean filterPalindrome(String s1) {
			boolean flag = true;
			int left = 0;
			int right  = s1.length()-1;
			s1= s1.toLowerCase();
			while(left<right) {
				if(!(s1.charAt(left) == s1.charAt(right))) {
					flag = false;
				}
				left = left + 1;
				right = right -1;
			}
			return flag;
		}
		
		public static void checkPalindrome() {
			String [] array1 = { "kishan", "madam", "alok", "anita", "level"};
			String array2 [] = {"123321", "121", "12321", "1234554321", "1234"};
			Arrays.stream(array2).filter(Array50::filterPalindrome).forEach(System.out::println);
			Arrays.stream(array1).filter(Array50::filterPalindrome).forEach(System.out::println);
			List<String> list1 = Arrays.stream(array1).filter(Array50::filterPalindrome).collect(Collectors.toList());
			for(String s: list1) {
				System.out.println("s: "+s);
			}
		}
		
		// skip and limit example 
		public static void limitSkip() {
			int [] array1 = {1,2,3,4,5,6,7,8,9,10};
			Arrays.stream(array1).filter(number -> number%2 == 0).skip(3).limit(1).forEach(System.out::println);
		}
		
		// map example 
		public static void map1() {
			int [] array1 = {1,2,3,4,5,6,7,8,9,10};
			List<Integer> list1 = Arrays.stream(array1)
					.boxed()
					.filter(number -> number % 2 == 0)
					.map(number -> number * 2)
					.collect(Collectors.toList());
			Arrays.stream(array1)
				.filter(number -> number%2==0)
				.map(number -> number*number)
				.forEach(System.out::println);			
		}
		
		
		public static void startsWith() {
			String [] array1 = { "kishan", "madam", "4Bhai", "alok", "anita", "level", "4kishan"};
			Arrays.stream(array1)
				.filter(s1 -> s1.startsWith("4"))
				.map(s1 -> s1.toUpperCase())
				.forEach(System.out::println);
		}
		
		
		
		// find the longest String in the array
		public static void longestString1() {
			String [] array1 = { "kishan", "madam", "4Bhai", "alok", "kishanmkushwaha", "anita", "level", "4kishan"};
			String result = Arrays.stream(array1)
					.max(Comparator.comparingInt(String::length))
					.orElse("");
			System.out.println();
		}
		
		
		
		
		
		
		
		// Question 11. Find the largest sum contiguous subarray (Kadane’s Algorithm).
		public static void kadaneAlgorithm() {
			int array1 [] = {1,2,3,10,5,6};
			
		}
		
		
		// 12. Left rotate an array by one position.
		public static void leftRotateByOne() {
			int [] array1 = {1,2,3,4,5};
			int first = array1[0];
			for(int i = 0; i<array1.length-1; i++) {
				array1[i] = array1[i+1];
			}
			array1[array1.length - 1] = first;
			Arrays.stream(array1).forEach(number -> System.out.print(number+" "));
		}
		
		
		// 13. Left rotate an array by k positions.
		public static void leftRotateByNPosition() {
			int k = 4;
			int [] array1 = {1,2,3,4,5};
			int temp[] = new int[k];
			for(int i = 0; i<k;i++) {
				temp[i] = array1[i];
			}
			for(int i = 0; i<array1.length-k; i++) {
				array1[i] = array1[i+k];
			}
			for(int i = 0; i<k; i++) {
				array1[i+array1.length-k] = temp[i];
			}			
			Arrays.stream(array1).forEach(number -> System.out.print(number +" "));
		}
		
		
		//14. Right rotate an array by one position.
		public static void rotateRightByOnePosition() {
			int [] array1 = {1,2,3,4,5};
			int last = array1[array1.length -1];
			for(int i = array1.length -1; i>0; i--) {
				array1[i] = array1[i-1];
			}
			array1[0] = last;
			Arrays.stream(array1).forEach(number -> System.out.print(number+" "));
		}
		
		// 15. Find the frequency of each element in an array.
		public static void frequencyElement() {
			int [] array1 = {1,2,3,4,5,1,2,3};
			boolean[] barray = new boolean[array1.length];
			for(int i = 0; i<array1.length; i++) {
				int count = 0;
				for(int j = i; j<array1.length; j++) {
					if((array1[j] == array1[i]) && (!barray[j])){
						count = count +1;
						barray[j] = true;
					}
				}
				if(count>0) {
					System.out.println(array1[i]+" is present "+count+" times");
				}
			}
		}
		
		// 17. Find the intersection of two arrays.
		public static void intersectionofArray() {
			int array1 [] = {1,2,3,4,5,4,5,5};
			int array2 [] = {4,5,6,7,4,5,8,9,10};
			List<Integer> list1  = Arrays.stream(array1).distinct().boxed().collect(Collectors.toList());
			List<Integer> list2 = Arrays.stream(array2)
							     .distinct()
								.filter(number -> list1.contains(number))
								.boxed()
								.collect(Collectors.toList());
			for(int number : list2) {
				System.out.println("number:"+number);
			}
		}
		
		// 18. Find the union of two arrays.
		public static void unionOfTwoArray() {
			int array1 [] = {1,2,3,4,5,4,5,5};
			int array2 [] = {4,5,6,7,4,5,8,9,10};
			List<Integer> list1 = Arrays.stream(array1).distinct().boxed().collect(Collectors.toList());
			List<Integer> list2 = Arrays.stream(array2).distinct().boxed().filter(number -> !list1.contains(number)).collect(Collectors.toList());
			boolean add1 = list1.addAll(list2);
			for(int number : list1) {
				System.out.print(number+" ");
			}			
		}
		
		//19. Remove duplicates from an array.
		public static void removeDuplicateFromArray() {
			int array1 [] = {1,2,3,4,5,4,5,5};
			int array2[] = Arrays.stream(array1).distinct().toArray();
			for(int numner: array2) {
				System.out.print(numner+" ");
			}
		}
		
		// 20. Find the element that appears only once in an array where all others appear	twice.
		public static void findElementOnceAppear() {
			int array1 [] = {1,1,2,3,4,5,4,3,5,5};
			Optional<Integer> element = Arrays.stream(array1).distinct().boxed().findFirst();
			System.out.println("Element is "+element.get());
		}
		
		// 1. Find the missing number in an array of size n containing elements from 1 to
		public static void findMissing() {
			int array1 [] = {1,2,3,5,4,6,7,9,10};
			int length = array1.length+1;
			int actualSum = length  * (length + 1)/2;
			int sum = Arrays.stream(array1).sum();
			System.out.println("actualSum: "+actualSum);
			System.out.println("sum: "+sum);
			int missing = actualSum - sum;
			System.out.println("Missing element: "+missing);
		}
		
		// 2. Find the duplicate number in an array of n+1 integers where each integer is between 1 and n .
		public static void findDuplicate() {
			int array1 [] = {1,2,3,5,3,7,9,4,6,7,9,10};
			List<Integer> list1 = Arrays.stream(array1)
					.boxed()
					.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
					.entrySet()
					.stream()
					.filter(entry -> entry.getValue()>1)
					.map(Map.Entry::getKey)
					.collect(Collectors.toList());
			for(int n1:list1) {
				System.out.print(n1+" ");
			}
		}
		
		//4. Find all pairs in an array that sum to a given value x .
		public static void allPairs() {
			int array1 [] = {1,5,7,-1};
			int sum = 6;
			for(int i = 0; i<=array1.length-1; i++) {
				for(int j = i+1; j<array1.length; j++) {
					if(array1[i]+array1[j] == sum) {
						System.out.println(array1[i]+", "+array1[j]);
					}
				}
			}
		}
		
		// 5. Find the maximum product of two integers in an array.
		public static void maxOfTwoInteger() {
			int array1 [] = {1,20,-1,-30};
			List<Integer> list1 = Arrays.stream(array1).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
			System.out.println("Maximum product of two integers is:"+(list1.get(0)*list1.get(1)));
		}
		
		// 6. Implement a function to perform a binary search on a sorted array.
		public static void binarySearch1() {
			int search = 3;
			int array1[] = {1,2,3,4,5,6,7,8,9,10};
			int max = array1.length -1;
			int min = 0;
			boolean flag = true;
			while(min<max) {
				int mid = min + ((max-min) / 2);
				if(array1[mid] == search) {
					System.out.println("Element is present at "+ mid +" position");
					flag = false;
				}
				if(array1[mid] > search) {
					max = max -1;
				}else if(array1[mid] < search) {
					min = mid+1;
				}
			}
			if(flag) {
				System.out.println("Element is not present.");
			}
			
		}
		
		// char count using java8 
		public static void charCount1() {
			String s1 = "maharashtra";
			Map<Character, Long> map1 = s1.chars()
					.mapToObj(c -> (char) c)
					.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
			map1.forEach((K, V) -> System.out.println(K+"-"+V));
		}
		
		// select employee's name having salary greater than 50000
		public static void nameList() {
			Employee emp1 = new Employee(1, "kishan1", 52000);
			Employee emp2 = new Employee(1, "kishan2", 45000);
			Employee emp3 = new Employee(1, "kishan3", 60000);
			Employee emp4 = new Employee(1, "kishan4", 30000);
			List<Employee> list1 = Arrays.asList(emp1, emp2, emp3, emp4);
			
			List<String> namesList = list1.stream()
					.filter(employee -> employee.getSalary()>50000)
					.map(Employee::getName)
					.collect(Collectors.toList());
			namesList.forEach(System.out::println);
		}
		
		// print 1 - 100 using only 1 printing starement and withput using any loop 
		public static void test1() {
			StringBuilder sb = new StringBuilder();
			System.out.println(sb.toString());
			test2(1,100,sb);
			System.out.println(sb.toString());
		}
		
		public static void test2(int current, int end, StringBuilder sb) {
			if(current>end) {
				return;
			}
			sb.append(current);
			if(current<end) {
				sb.append(" ");
			}
			test2(current+1, end,sb);
		}
		
		
		// [ "kishan", "alok", "aakash"] count 'a' in each elements of the list 
		public static void countAinString() {
			List<String> list1 = Arrays.asList("sunny", "Kishan", "Alok", "Akash", "almomd", "aaram", "ship");
			list1 = list1.stream().filter(s1 -> (s1.contains("a") || s1.contains("A"))).collect(Collectors.toList());
			for(String s2 : list1) {
				long count1 = s2.chars().filter(character -> ((character == 'a')||(character == 'A'))).count();
				System.out.println(s2+":"+count1);
			}
		}
		
		public static void test3() {
			int n1 = 1;
			int n2 = 100;
			StringBuilder sb = new StringBuilder();
			test4(n1, n2, sb);
			
		}
		
		public static void test4(int n1, int n2, StringBuilder sb) {
			if(n1>n2) {
				return;
			}else if(n1 == n2) {
				sb.append(n1+" ");
				System.out.println(sb.toString());
			}
			
			sb.append(n1+" ");
			test4(n1+1, n2, sb);
		}
		
		// 8. Find the common elements in three sorted arrays.
		public static void commonElement() {
			int array1[] = {1,2,3,4,5};
			int array2[] = {3,4,5,6,7};
			int array3 [] = {4,5,6,7,8,9,10};
			int i = 0;
			int j = 0;
			int k = 0;
			List<Integer> list1 = new ArrayList<>();
			while(i<array1.length && j<array2.length && k<array3.length) {
				if(array1[i] == array2[j] && array2[j] == array3[k]){
					list1.add(array1[i]);
					i++;
					j++;
					k++;
				}else{
					if(array1[i]<array2[j]) {
						i++;
					}else if(array2[j]<array3[k]) {
						j++;
					}else {
						k++;
					}
				}
			}
			for(Integer number: list1) {
				System.out.print(number+" ");
			}
		}
		
		
		
		
		
}
