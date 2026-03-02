package com.lpu.java8;

import java.util.Arrays;
import java.util.stream.*;

/*
================================================================================
        🔥 UNIVERSAL RANGE FORMULA — FINAL CORRECT CONCEPT 🔥
================================================================================

❗ IMPORTANT CORRECTION:

Earlier many students think:

    IntStream.range(...).map(i -> arr[i])

is UNIVERSAL.

❌ WRONG.

✔ ONLY range() is universal.
✔ map() is NOT universal.

================================================================================
WHY?
================================================================================

map() always returns IntStream.

So it works ONLY when result can fit in int.

Works for:
    byte, short, char, int

Fails for:
    long, float, double

================================================================================
THE REAL UNIVERSAL FORMULA
================================================================================

    IntStream.range(0, arr.length)
             .mapXXX(i -> arr[i])

Where:

    map()          → result must be int
    mapToLong()    → result must be long
    mapToDouble()  → result must be double/float

================================================================================
FINAL MEMORY RULE (WRITE THIS IN EXAM)

👉 range() is universal
👉 mapping method depends on target primitive

================================================================================
*/

public class Launch2{

    public static void main(String[] args) {

        // ==============================================================
        // BYTE ARRAY
        // ==============================================================
        byte[] byteArr = {1,2,3};

        // ✔ byte fits in int → use map()
        IntStream byteStream =
                IntStream.range(0, byteArr.length)
                         .map(i -> byteArr[i]);


        // ==============================================================
        // SHORT ARRAY
        // ==============================================================
        short[] shortArr = {10,20,30};

        IntStream shortStream =
                IntStream.range(0, shortArr.length)
                         .map(i -> shortArr[i]);


        // ==============================================================
        // CHAR ARRAY
        // ==============================================================
        char[] charArr = {'a','b','c'};

        // char internally becomes unicode int
        IntStream charStream =
                IntStream.range(0, charArr.length)
                         .map(i -> charArr[i]);


        // ==============================================================
        // INT ARRAY
        // ==============================================================
        int[] intArr = {5,10,15};

        IntStream intStream =
                IntStream.range(0, intArr.length)
                         .map(i -> intArr[i]);

        // OR best method:
        IntStream intStream2 = Arrays.stream(intArr);


        // ==============================================================
        // LONG ARRAY
        // ==============================================================
        long[] longArr = {100L,200L};

        // ❌ WRONG (map returns int)
        // IntStream wrongLong =
        //     IntStream.range(0,longArr.length)
        //              .map(i -> longArr[i]);

        // ✔ CORRECT
        LongStream longStream =
                IntStream.range(0, longArr.length)
                         .mapToLong(i -> longArr[i]);

        // OR direct support
        LongStream longStream2 = Arrays.stream(longArr);


        // ==============================================================
        // FLOAT ARRAY
        // ==============================================================
        float[] floatArr = {1.2f,2.5f};

        // ❌ WRONG
        // IntStream wrongFloat =
        //     IntStream.range(0,floatArr.length)
        //              .map(i -> floatArr[i]);

        // ✔ CORRECT → float stored in DoubleStream
        DoubleStream floatStream =
                IntStream.range(0, floatArr.length)
                         .mapToDouble(i -> floatArr[i]);


        // ==============================================================
        // DOUBLE ARRAY
        // ==============================================================
        double[] doubleArr = {2.2,3.3};

        // ❌ WRONG
        // IntStream wrongDouble =
        //     IntStream.range(0,doubleArr.length)
        //              .map(i -> doubleArr[i]);

        // ✔ CORRECT
        DoubleStream doubleStream =
                IntStream.range(0, doubleArr.length)
                         .mapToDouble(i -> doubleArr[i]);

        // OR direct support
        DoubleStream doubleStream2 = Arrays.stream(doubleArr);


        // ==============================================================
        // BOOLEAN ARRAY
        // ==============================================================
        boolean[] boolArr = {true,false,true};

        // must convert manually to int
        IntStream boolStream =
                IntStream.range(0, boolArr.length)
                         .map(i -> boolArr[i] ? 1 : 0);


        // ==============================================================
        // FINAL MEMORY SHORTCUTS
        // ==============================================================

        /*
        🔥 10-SECOND REVISION FORMULA

        STEP 1:
            Try Arrays.stream(arr)

        STEP 2:
            If not supported → use range()

        STEP 3:
            Choose mapping:

                map()         → int result
                mapToLong()   → long result
                mapToDouble() → float/double result

        STEP 4:
            boolean → convert manually (1/0)

        ONE-LINE RULE:

            range + correct map method = universal solution

        */

        System.out.println("Universal range concept demonstrated successfully.");
    }
}


/*
================================================================================
        🔥 FINAL MASTER RULES : PRIMITIVE ARRAYS → JAVA STREAMS 🔥
================================================================================

===============================================================================
1️⃣ ONLY 3 PRIMITIVE STREAMS EXIST IN JAVA
===============================================================================

    ✔ IntStream
    ✔ LongStream
    ✔ DoubleStream

NO OTHER STREAMS EXIST:

    ❌ ByteStream
    ❌ ShortStream
    ❌ CharStream
    ❌ FloatStream
    ❌ BooleanStream

👉 So EVERY primitive must finally become:
        int OR long OR double

===============================================================================
2️⃣ ARRAYS.STREAM() DIRECT SUPPORT TABLE  ⭐ VERY IMPORTANT
===============================================================================

    Arrays.stream(int[])     → IntStream ✔
    Arrays.stream(long[])    → LongStream ✔
    Arrays.stream(double[])  → DoubleStream ✔

    Arrays.stream(byte[])    → ❌ NOT supported
    Arrays.stream(short[])   → ❌ NOT supported
    Arrays.stream(char[])    → ❌ NOT supported
    Arrays.stream(float[])   → ❌ NOT supported
    Arrays.stream(boolean[]) → ❌ NOT supported

👉 Remember:
    Arrays.stream() works ONLY for int, long, double arrays.

===============================================================================
3️⃣ UNIVERSAL FALLBACK RULE  ⭐ MOST IMPORTANT
===============================================================================

If Arrays.stream(arr) fails → ALWAYS use:

    IntStream.range(0, arr.length)

This ALWAYS works.

But mapping method depends on result type:

    map()          → for int result
    mapToLong()    → for long result
    mapToDouble()  → for double/float result

👉 So real universal formula is:

    IntStream.range(0, arr.length).mapXXX(i -> arr[i])

NOT just map().

===============================================================================
4️⃣ RANGE vs STREAM BEHAVIOUR  ⭐ VERY COMMON INTERVIEW QUESTION
===============================================================================

A) range()

    IntStream.range(...).map(i -> arr[i])

    👉 i is INDEX
    👉 use arr[i]

B) Arrays.stream(arr)

    Arrays.stream(arr).map(x -> ...)

    👉 x is ELEMENT
    👉 DO NOT use arr[x]

===============================================================================
5️⃣ TYPE CONVERSION RULES
===============================================================================

Widening (automatic, safe):

    byte → short → int → long → double

Narrowing (needs explicit cast):

    double → int
    long → byte
    float → short
    etc.

===============================================================================
6️⃣ SPECIAL PRIMITIVE RULES
===============================================================================

✔ char internally becomes int (unicode)

✔ float has NO stream → stored in DoubleStream

✔ boolean has NO stream → must convert manually

        true  → 1
        false → 0

===============================================================================
7️⃣ WHICH STREAM TO CHOOSE (FAST DECISION TABLE)
===============================================================================

Primitive type → Best stream

byte   → IntStream
short  → IntStream
char   → IntStream
int    → IntStream
long   → LongStream
float  → DoubleStream
double → DoubleStream
boolean → IntStream (manual mapping)

===============================================================================
8️⃣ FINAL 10-SECOND EXAM SHORTCUT  ⭐ GOLD RULE
===============================================================================

STEP 1:
    Try Arrays.stream(arr)

STEP 2:
    If not supported → use range()

STEP 3:
    Choose mapping:

        map()         → int
        mapToLong()   → long
        mapToDouble() → float/double

STEP 4:
    boolean → convert to 1/0

===============================================================================
9️⃣ ONE-LINE MEMORY STATEMENT (WRITE IN EXAM)
===============================================================================

👉 Java primitive streams exist only for int, long, and double.
👉 Arrays.stream() supports only these arrays.
👉 For others, use IntStream.range() with proper map method.

===============================================================================
🔟 MOST COMMON MISTAKES (PROFESSORS LOVE THESE)
===============================================================================

❌ Using Arrays.stream(byte[])
❌ Using map() when result should be long/double
❌ Using arr[x] inside Arrays.stream()
❌ Thinking float stream exists
❌ Thinking boolean stream exists
❌ Forgetting narrowing cast

===============================================================================
                ✔ END OF FINAL MASTER REVISION NOTES ✔
===============================================================================
*/
