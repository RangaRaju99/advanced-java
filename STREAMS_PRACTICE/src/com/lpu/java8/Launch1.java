package com.lpu.java8;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Launch1 {

    public static void main(String args[]) {
		
/*
       Only 3 primitive streams in Java:
         1) IntStream
         2) LongStream
         3) DoubleStream
         No others exist.
Note: ---------------------->   So ALL primitives must eventually become one of these OR a wrapper stream.

// byte, short, char, int , long, float, double  ----> These are primitive Data types

*/
    	
    	/*
    	================================================================================
    	        🔥 MASTER PROGRAM : PRIMITIVE ARRAYS → JAVA STREAMS COMPLETE GUIDE 🔥
    	================================================================================

    	ONLY 3 PRIMITIVE STREAM TYPES EXIST IN JAVA:

    	    ✔ IntStream
    	    ✔ LongStream
    	    ✔ DoubleStream

    	NO OTHER PRIMITIVE STREAMS EXIST:

    	    ❌ ByteStream
    	    ❌ ShortStream
    	    ❌ CharStream
    	    ❌ FloatStream
    	    ❌ BooleanStream

    	So EVERY primitive must become:
    	        → IntStream OR LongStream OR DoubleStream

    	================================================================================
    	🔥 ARRAYS.STREAM() SUPPORT TABLE  (VERY IMPORTANT FOR EXAMS)
    	================================================================================

    	VALID DIRECTLY:
    	    Arrays.stream(int[])     ✔ IntStream
    	    Arrays.stream(long[])    ✔ LongStream
    	    Arrays.stream(double[])  ✔ DoubleStream

    	INVALID DIRECTLY:
    	    Arrays.stream(byte[])    ❌ compile error
    	    Arrays.stream(short[])   ❌ compile error
    	    Arrays.stream(char[])    ❌ compile error
    	    Arrays.stream(float[])   ❌ compile error
    	    Arrays.stream(boolean[]) ❌ compile error

    	================================================================================
    	🔥 UNIVERSAL FALLBACK FORMULA (WORKS FOR ALL PRIMITIVES)
    	================================================================================

    	    IntStream.range(0, arr.length)
    	             .map(i -> arr[i])

    	REMEMBER THIS → solves EVERYTHING.

    	================================================================================
    	🔥 ADVANCED RULES (INTERVIEW LEVEL)
    	================================================================================

    	RULE 1:
    	Primitive streams exist ONLY for:
    	        int, long, double

    	RULE 2:
    	float values ALWAYS stored in DoubleStream

    	RULE 3:
    	char automatically becomes int (unicode)

    	RULE 4:
    	boolean must be mapped manually:
    	        true → 1
    	        false → 0

    	RULE 5:
    	Inside Arrays.stream(arr).map(x -> ???)
    	        x is ELEMENT, NOT INDEX

    	RULE 6:
    	Inside IntStream.range(...).map(i -> ???)
    	        i is INDEX

    	RULE 7:
    	Use Arrays.stream() ONLY when array type is supported.
    	Else use range() method.

    	RULE 8:
    	IntStream is the UNIVERSAL ENTRY POINT
    	because:
    	        int can store byte/short/char safely

    	RULE 9:
    	Widening conversion allowed automatically:
    	        byte → short → int → long → double

    	RULE 10:
    	Narrowing requires explicit cast:
    	        double → int
    	        long → byte
    	        etc.

    	================================================================================
    	🔥 FINAL SHORTCUT MEMORY FORMULA
    	================================================================================

    	STEP 1:
    	Try Arrays.stream(arr)

    	    if works → use it
    	    if fails → go to step 2

    	STEP 2:
    	Use universal fallback:

    	    IntStream.range(0, arr.length).map(i -> arr[i])

    	STEP 3:
    	Need float?
    	    → use DoubleStream

    	STEP 4:
    	Need boolean?
    	    → convert to int (1/0)

    	================================================================================
    	*/

    	// byte, short, char, int---> IntStream
    	// float, double ---> DoubleStream
    	// long --> LongStream
		
		byte arr1[]= {1,2,3,4};   // THis is the input, you get from user
		
		  // 1) byte ---> ShortStream, It is not directly supported in Streams, so we use IntStream instead of it, we also need to type-cast if want byte values stream,Because by default, it takes int
		 IntStream s1= IntStream.range(0, arr1.length).map(i->arr1[i]); // see, here, IntStream always gives IntStream, so our output also requires IntStream because byte belongs to IntStream, why because, there is no BytEstream, so that is why we use map()
		 System.out.println(s1);
//		 IntStream s11= Arrays.stream(arr1).map(i->(short)arr1[i]);  // error, because Arrays.stream() takes only int[],long[], double[] arrays
//		 System.out.println(s11);
		 
		 // 2) byte ---> CharStream, It is not directly supported in Streams, so we use IntStream instead of it, we also need to type cast if want char values stream, Because by default, it takes int
		 IntStream s2= IntStream.range(0, arr1.length).map(i->(char)arr1[i]); // 
		 System.out.println(s2);
//		 IntStream s21= Arrays.stream(arr1).map(i->(char)arr1[i]);
//		 System.out.println(s21);
		 
		 // 3) byte ---> IntStream, It is directly supported in Streams
		 IntStream s3= IntStream.range(0, arr1.length).map(i->arr1[i]);
		 System.out.println(s3);
//		 IntStream s31= Arrays.stream(arr1).map(i->arr1[i]);
//		 System.out.println(s31);
		 
		 // 4) byte ---> LongStream, It is directly supported in Streams
		 LongStream s4= IntStream.range(0, arr1.length).mapToLong(i->arr1[i]);
		 System.out.println(s4);
//		 LongStream s41= Arrays.stream(arr1).mapToLong(i->arr1[i]);
//		 System.out.println(s41);
		 
		 // 5) byte ---> FloatStream, It is not directly supported in Streams,so we use DoubleStream instead of it
		 DoubleStream s5= IntStream.range(0, arr1.length).mapToDouble(i->arr1[i]);
		 System.out.println(s5);
//		 DoubleStream s51= Arrays.stream(arr1).mapToDouble(i->arr1[i]);
//		 System.out.println(s51);
		 
		 // 6) byte ---> DoubleStream, It is directly supported in Streams
		 DoubleStream s6= IntStream.range(0, arr1.length).mapToDouble(i->arr1[i]);
		 System.out.println(s6);
//		 DoubleStream s61= Arrays.stream(arr1).mapToDouble(i->arr1[i]);
//		 System.out.println(s61);
		 
		 // 7) byte ---> boolean conversion is not possible
		 
		
//		 ===========================================================================================================================================
		 
		 short arr2[]= {12,245,432,43};   // THis is the input, you get from user
			
		  // 1) short ---> ByteStream, It is not directly supported in Streams, so we use IntStream instead of it, we also need to type-cast,Because it is explicit type-casting
		 IntStream t1= IntStream.range(0, arr2.length).map(i->(byte)arr2[i]);
		 System.out.println(t1);
		 
		 // 2) short ---> CharStream, It is not directly supported in Streams, so we use IntStream instead of it, we also need to type cast, Because by default, it takes int
		 IntStream t2= IntStream.range(0, arr2.length).map(i->(char)arr2[i]);
		 System.out.println(t2);
		 
		 // 3) short ---> IntStream, It is directly supported in Streams
		 IntStream t3= IntStream.range(0, arr2.length).map(i->arr2[i]);
		 System.out.println(t3);
		 
		 // 4) short ---> LongStream, It is directly supported in Streams 
		 LongStream t4= IntStream.range(0, arr2.length).mapToLong(i->arr2[i]);
		 System.out.println(t4);
		 
		 // 5) short ---> FloatStream, It is not directly supported in Streams,so we use DoubleStream instead of it
		 DoubleStream t5= IntStream.range(0, arr2.length).mapToDouble(i->arr2[i]);
		 System.out.println(t5);
		 
		 // 6) short ---> DoubleStream, It is directly supported in Streams
		 DoubleStream t6= IntStream.range(0, arr2.length).mapToDouble(i->arr2[i]);
		 System.out.println(t6);
		 
		 // 7) short ---> boolean conversion is not possible
		 
		 
//		 ===========================================================================================================================================

		 
		 char arr3[]= {'a','b','c','d'};   // THis is the input, you get from user
			
		 // 1) char ---> ByteStream, It is not directly supported in Streams, so we use IntStream instead of it, we also need to type-cast,Because it is explicit type-casting
		 IntStream c1= IntStream.range(0, arr3.length).map(i->(byte)arr3[i]);
		 System.out.println(c1);
		 
		 // 2) char ---> ShortStream, It is not directly supported in Streams, so we use IntStream instead of it, we also need to type cast, Because it is explicit type-casting
		 IntStream c2= IntStream.range(0, arr3.length).map(i->(short)arr2[i]);
		 System.out.println(c2);
		 
		 // 3) char ---> IntStream, It is directly supported in Streams
		 IntStream c3= IntStream.range(0, arr3.length).map(i->arr3[i]);
		 System.out.println(c3);
		 
		 // 4) char ---> LongStream, It is directly supported in Streams 
		 LongStream c4= IntStream.range(0, arr3.length).mapToLong(i->arr3[i]);
		 System.out.println(c4);
		 
		 // 5) char ---> FloatStream, It is not directly supported in Streams,so we use DoubleStream instead of it
		 DoubleStream c5= IntStream.range(0, arr3.length).mapToDouble(i->arr3[i]);
		 System.out.println(c5);
		 
		 // 6) char ---> DoubleStream, It is directly supported in Streams
		 DoubleStream c6= IntStream.range(0, arr3.length).mapToDouble(i->arr3[i]);
		 System.out.println(c6);
		 
		 // 7) char ---> boolean conversion is not possible
		 
		 
//		 ===========================================================================================================================================

		 
		 int arr4[]= {12,34,2345,12345};   // THis is the input, you get from user
			
		 // 1) int ---> ByteStream, It is not directly supported in Streams, so we use IntStream instead of it, we also need to type-cast,Because it is explicit type-casting
		 IntStream i1= IntStream.range(0, arr4.length).map(i->(byte)arr4[i]);
		 System.out.println(i1);
		 IntStream i11= Arrays.stream(arr4).map(x->x);  // same for all below
		 System.out.println(i11);
		 
		 // 2) int ---> ShortStream, It is not directly supported in Streams, so we use IntStream instead of it, we also need to type cast, Because it is explicit type-casting
		 IntStream i2= IntStream.range(0, arr4.length).map(i->(short)arr4[i]);
		 System.out.println(i2);
		 
		 // 3) int ---> CharStream, It is directly supported in Streams, so we use IntStream instead of it, we also need to type cast, Because it is explicit type-casting
		 IntStream i3= IntStream.range(0, arr4.length).map(i->(char)arr4[i]);
		 System.out.println(i3);
		 
		 // 4) int ---> LongStream, It is directly supported in Streams 
//		 LongStream i4= IntStream.range(0, arr4.length).mapToLong(i->arr4[i]);
		 LongStream i4= IntStream.range(0, arr4.length).mapToLong(i->arr4[i]);
		 System.out.println(i4);
		 LongStream i41= Arrays.stream(arr4).asLongStream();
		 System.out.println(i41);
		 LongStream s42= Arrays.stream(arr4).mapToLong(i->i);   // fine, no error
		 System.out.println(s42);
		 
		 // 5) int ---> FloatStream, It is not directly supported in Streams,so we use DoubleStream instead of it
		 DoubleStream i5= IntStream.range(0, arr4.length).mapToDouble(i->arr4[i]);
		 System.out.println(i5);
		 DoubleStream i51= Arrays.stream(arr4).asDoubleStream();
		 System.out.println(i51);
		 DoubleStream i52= Arrays.stream(arr4).mapToDouble(x->x);
		 System.out.println(i52);
		 
		 // 6) int ---> DoubleStream, It is directly supported in Streams
		 DoubleStream i6= IntStream.range(0, arr4.length).mapToDouble(i->arr4[i]);
		 System.out.println(i6);
		 DoubleStream i61= Arrays.stream(arr4).asDoubleStream();
		 System.out.println(i61);
		 DoubleStream i62= Arrays.stream(arr4).mapToDouble(i->arr4[i]);
		 System.out.println(i62);
		 
		 // 7) int ---> boolean conversion is not possible
		 
		 
//		 ===========================================================================================================================================

		 
		 long arr5[]= {12L,65L,789L,9999L};   // THis is the input, you get from user
			
		 // 1) long ---> ByteStream, It is not directly supported in Streams, so we use IntStream instead of it, we also need to type-cast,Because it is explicit type-casting
		 IntStream l1= IntStream.range(0, arr5.length).map(i->(byte)arr5[i]);
		 System.out.println(i1);
		 IntStream l11= Arrays.stream(arr5).mapToInt(x->(byte)x); 
		 System.out.println(l11);
 
		 // 2) long ---> ShortStream, It is not directly supported in Streams, so we use IntStream instead of it, we also need to type cast, Because it is explicit type-casting
		 IntStream l2= IntStream.range(0, arr5.length).map(i->(short)arr5[i]);
		 System.out.println(i2);
		 
		 // 3) long ---> CharStream, It is directly supported in Streams, so we use IntStream instead of it, we also need to type cast, Because it is explicit type-casting
		 IntStream l3= IntStream.range(0, arr5.length).map(i->(char)arr5[i]);
		 System.out.println(l3);
		 
		 // 4) long ---> IntStream, It is directly supported in Streams 
		 IntStream l4= IntStream.range(0, arr5.length).map(i->(int)arr5[i]);
		 System.out.println(l4);
		 
		 // 5) long ---> FloatStream, It is not directly supported in Streams,so we use DoubleStream instead of it
		 DoubleStream l5= IntStream.range(0, arr5.length).mapToDouble(i->arr5[i]);
		 System.out.println(l5);
		 DoubleStream l51= Arrays.stream(arr5).asDoubleStream();
		 System.out.println(l51);
		// DoubleStream l52= Arrays.stream(arr5).mapToDouble(i->arr5[i]); // error
		 DoubleStream l52= Arrays.stream(arr5).mapToDouble(i->i);
		 System.out.println(l52);
		 
		 // 6) long ---> DoubleStream, It is directly supported in Streams
		 DoubleStream l6= IntStream.range(0, arr5.length).mapToDouble(i->arr5[i]);
		 System.out.println(l6);
		 DoubleStream l61= Arrays.stream(arr5).asDoubleStream();
		 System.out.println(l61);
		 
		 // 7) long ---> boolean conversion is not possible
		 
		 
//		 ===========================================================================================================================================

		 
		 float arr6[]= {6.0f,3.5554f,9.987f};   // THis is the input, you get from user
			
		 // 1) float ---> ByteStream, It is not directly supported in Streams, so we use IntStream instead of it, we also need to type-cast,Because it is explicit type-casting
		 IntStream f1= IntStream.range(0, arr6.length).map(i->(byte)arr6[i]);
		 System.out.println(f1);
		 
		 // 2) float ---> ShortStream, It is not directly supported in Streams, so we use IntStream instead of it, we also need to type cast, Because it is explicit type-casting
		 IntStream f2= IntStream.range(0, arr6.length).map(i->(short)arr6[i]);
		 System.out.println(f2);
		 
		 // 3) float ---> CharStream, It is directly supported in Streams, so we use IntStream instead of it, we also need to type cast, Because it is explicit type-casting
		 IntStream f3= IntStream.range(0, arr6.length).map(i->(char)arr6[i]);
		 System.out.println(f3);
		 
		 // 4) float ---> IntStream, It is directly supported in Streams 
		 IntStream f4= IntStream.range(0, arr6.length).map(i->(int)arr6[i]);
		 System.out.println(f4);
		 
		 // 5) float ---> LongStream, It is directly supported in Streams
		 LongStream f5= IntStream.range(0, arr6.length).mapToLong(i->(long)arr6[i]);
		 System.out.println(f5);
		 
		 // 6) float ---> DoubleStream, It is directly supported in Streams
		 DoubleStream f6= IntStream.range(0, arr6.length).mapToDouble(i->arr6[i]);
		 System.out.println(f6);
		
		 
		 // 7) float ---> boolean conversion is not possible
		 
		 
//		 ===========================================================================================================================================

		 
		 double arr7[]= {3.5,76.5432,22.44};   // THis is the input, you get from user
			
		 // 1) double ---> ByteStream, It is not directly supported in Streams, so we use IntStream instead of it, we also need to type-cast,Because it is explicit type-casting
		 IntStream d1= IntStream.range(0, arr7.length).map(i->(byte)arr7[i]);
		 System.out.println(d1);
		 
		 // 2) double ---> ShortStream, It is not directly supported in Streams, so we use IntStream instead of it, we also need to type cast, Because it is explicit type-casting
		 IntStream d2= IntStream.range(0, arr7.length).map(i->(short)arr7[i]);
		 System.out.println(f2);
		 
		 // 3) double ---> CharStream, It is directly supported in Streams, so we use IntStream instead of it, we also need to type cast, Because it is explicit type-casting
		 IntStream d3= IntStream.range(0, arr7.length).map(i->(char)arr7[i]);
		 System.out.println(d3);
		 
		 // 4) double ---> IntStream, It is directly supported in Streams 
		 IntStream d4= IntStream.range(0, arr7.length).map(i->(int)arr7[i]);
		 System.out.println(f4);
		 
		 // 5) double ---> LongStream, It is directly supported in Streams
		 LongStream d5= IntStream.range(0, arr7.length).mapToLong(i->(long)arr7[i]);
		 System.out.println(d5);
		 
		 // 6) double ---> FloatStream, It is not directly supported in Streams, so we use DoubleStream instead it
		 DoubleStream d6= IntStream.range(0, arr7.length).mapToDouble(i->(float)arr7[i]);
		 System.out.println(d6);
		 
		 // 7) double ---> boolean conversion is not possible
		 
		 
//		 ===========================================================================================================================================

		 
		 boolean arr8[]= {true,false,false,true};
		 
		 IntStream b1 =IntStream.range(0,arr8.length).map(i -> arr8[i] ? 1 : 0);  // like this we can store for all
		 System.out.println(b1); 

		 
	
		 
		 
		 
		 
		 
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
