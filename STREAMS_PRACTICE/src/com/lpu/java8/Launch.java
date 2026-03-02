package com.lpu.java8;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Launch {

	public static void main(String args[]) {
		
		// 1) int[] array
		     
		        int arr1[]= {12,3,4,32,54,67};  // IntStream.rangeClosed() ---> always return IntStream
		        IntStream i1 = IntStream.rangeClosed(0, arr1.length);  // directly possible
		        Stream<Integer> s1=IntStream.rangeClosed(0, arr1.length).mapToObj(n->arr1[n]);
		        
		// 2) double[] array
		        
		        double arr2[]= {12.4,32.67,43.5};
		        DoubleStream i2=IntStream.rangeClosed(0, arr2.length).mapToDouble(n->arr2[n]); // here, we need to type-cast
		        Stream<Double> s2=IntStream.rangeClosed(0, arr2.length).mapToObj(n->arr2[n]);
			  //  IntStream s4= IntStream.rangeClosed(0, arr4.length).mapToInt(n->arr4[n]); // not possible

		        
	    // 3) long[] array
		        
		        long arr3[]= {12L,13L,24L,45L};
		        LongStream i3=IntStream.rangeClosed(0, arr3.length).mapToLong(n->arr3[n]);
		        Stream<Long> s3=IntStream.rangeClosed(0, arr3.length).mapToObj(n->arr3[n]);
		        Stream<Byte> s4=Arrays.stream(arr3).mapToObj(n->(byte)n);
			  //   IntStream s4= IntStream.rangeClosed(0, arr3.length).mapToInt(n->arr3[n]); // not possible

		        
		// 4) byte[] array
		        
		        byte arr4[]= {1,2,3,4};
		        // There is no ByteStream, so instead of it, we use Stream<Byte>
		        Stream<Byte> i4=IntStream.rangeClosed(0, arr4.length).mapToObj(n->arr4[n]);
		      //   IntStream s4= IntStream.rangeClosed(0, arr4.length).mapToLong(n->arr4[n]); // not possible
		        
		// 5) short[] array
		        
		        short arr5[]= {12,23,34,45};
		        Stream<Short> i5=IntStream.rangeClosed(0,arr5.length).mapToObj(n->arr5[n]);
			   //   IntStream s4= IntStream.rangeClosed(0, arr5.length).mapToLong(n->arr4[n]); // not possible

		        
		// 6) char[] array
		        
		        char arr6[]= {'a','b','c'};
		        Stream<Character> i6=IntStream.rangeClosed(0, arr6.length).mapToObj(n->arr6[n]);
			   //   IntStream s4= IntStream.rangeClosed(0, arr4.length).mapToLong(n->arr4[n]); // not possible

		        
		// 7) float[] array
		        
		        float arr7[]= {12.3f,13.4f};
		        Stream<Float> i7=IntStream.rangeClosed(0, arr7.length).mapToObj(n->arr7[n]);
			  //  IntStream s4= IntStream.rangeClosed(0, arr7.length).mapToInt(n->arr7[n]); // not possible

		        
		 // 8) boolean[] array
		        
		        boolean arr8[]= {true, false,true};
		        Stream<Boolean> i8=IntStream.rangeClosed(0, arr8.length).mapToObj(n->arr8[n]);
		        
		        
		        
		
	}
}
