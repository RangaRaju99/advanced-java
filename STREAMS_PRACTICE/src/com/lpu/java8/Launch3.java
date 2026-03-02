package com.lpu.java8;

/*
================================================================================
        🔥 MASTER GUIDE : PRIMITIVE ARRAY → Stream<WrapperType> 🔥
================================================================================

Now we switch from:

    primitive array → primitive stream

TO:

    primitive array → Stream<WrapperType>

================================================================================
🧠 CORE RULE FOR WRAPPER STREAMS
================================================================================

Wrapper streams are created using:

    ✔ .boxed()                (only for int[], long[], double[])
    ✔ .mapToObj(...)
    ✔ IntStream.range(...).mapToObj(...)
    ✔ Stream.of(Object[])
    ✔ Arrays.stream(Object[])

Since primitives are NOT objects, most conversions use:

    IntStream.range(...).mapToObj(...)

================================================================================
🟢 1️⃣ BYTE[] → WRAPPER STREAMS
================================================================================

byte[] a = {1,2,3};

✔ byte → Byte
Stream<Byte> s1 =
    IntStream.range(0,a.length).mapToObj(i -> a[i]);

✔ byte → Short
Stream<Short> s2 =
    IntStream.range(0,a.length).mapToObj(i -> (short)a[i]);

✔ byte → Character
Stream<Character> s3 =
    IntStream.range(0,a.length).mapToObj(i -> (char)a[i]);

✔ byte → Integer
Stream<Integer> s4 =
    IntStream.range(0,a.length).mapToObj(i -> (int)a[i]);

✔ byte → Long
Stream<Long> s5 =
    IntStream.range(0,a.length).mapToObj(i -> (long)a[i]);

✔ byte → Float
Stream<Float> s6 =
    IntStream.range(0,a.length).mapToObj(i -> (float)a[i]);

✔ byte → Double
Stream<Double> s7 =
    IntStream.range(0,a.length).mapToObj(i -> (double)a[i]);

❌ byte → Boolean  (not automatic)

================================================================================
🟢 2️⃣ SHORT[] → WRAPPER STREAMS
================================================================================

short[] a = {10,20};

✔ short → Short
Stream<Short> s1 =
    IntStream.range(0,a.length).mapToObj(i -> a[i]);

✔ short → Integer
Stream<Integer> s2 =
    IntStream.range(0,a.length).mapToObj(i -> (int)a[i]);

✔ short → Long
Stream<Long> s3 =
    IntStream.range(0,a.length).mapToObj(i -> (long)a[i]);

✔ short → Double
Stream<Double> s4 =
    IntStream.range(0,a.length).mapToObj(i -> (double)a[i]);

✔ short → Character
Stream<Character> s5 =
    IntStream.range(0,a.length).mapToObj(i -> (char)a[i]);

(All numeric wrappers possible via cast)

================================================================================
🟢 3️⃣ CHAR[] → WRAPPER STREAMS
================================================================================

char[] a = {'A','B'};

✔ char → Character
Stream<Character> s1 =
    IntStream.range(0,a.length).mapToObj(i -> a[i]);

✔ char → Integer (unicode value)
Stream<Integer> s2 =
    IntStream.range(0,a.length).mapToObj(i -> (int)a[i]);

✔ char → Double
Stream<Double> s3 =
    IntStream.range(0,a.length).mapToObj(i -> (double)a[i]);

✔ char → Long
Stream<Long> s4 =
    IntStream.range(0,a.length).mapToObj(i -> (long)a[i]);

(All numeric wrappers allowed)

================================================================================
🟢 4️⃣ INT[] → WRAPPER STREAMS
================================================================================

int[] a = {1,2,3};

✔ BEST WAY → Integer
Stream<Integer> s1 = Arrays.stream(a).boxed();

✔ int → Long
Stream<Long> s2 =
    Arrays.stream(a).mapToObj(x -> (long)x);

✔ int → Double
Stream<Double> s3 =
    Arrays.stream(a).mapToObj(x -> (double)x);

✔ int → Character
Stream<Character> s4 =
    Arrays.stream(a).mapToObj(x -> (char)x);

✔ int → Float
Stream<Float> s5 =
    Arrays.stream(a).mapToObj(x -> (float)x);

(All numeric wrappers possible)

================================================================================
🟢 5️⃣ LONG[] → WRAPPER STREAMS
================================================================================

long[] a = {10L,20L};

✔ BEST WAY → Long
Stream<Long> s1 = Arrays.stream(a).boxed();

✔ long → Integer
Stream<Integer> s2 =
    Arrays.stream(a).mapToObj(x -> (int)x);

✔ long → Double
Stream<Double> s3 =
    Arrays.stream(a).mapToObj(x -> (double)x);

✔ long → Float
Stream<Float> s4 =
    Arrays.stream(a).mapToObj(x -> (float)x);

================================================================================
🟢 6️⃣ FLOAT[] → WRAPPER STREAMS
================================================================================

float[] a = {1.2f,2.3f};

(No direct stream support → use index)

✔ float → Float
Stream<Float> s1 =
    IntStream.range(0,a.length).mapToObj(i -> a[i]);

✔ float → Double
Stream<Double> s2 =
    IntStream.range(0,a.length).mapToObj(i -> (double)a[i]);

✔ float → Integer
Stream<Integer> s3 =
    IntStream.range(0,a.length).mapToObj(i -> (int)a[i]);

✔ float → Long
Stream<Long> s4 =
    IntStream.range(0,a.length).mapToObj(i -> (long)a[i]);

================================================================================
🟢 7️⃣ DOUBLE[] → WRAPPER STREAMS
================================================================================

double[] a = {1.5,2.5};

✔ BEST WAY → Double
Stream<Double> s1 = Arrays.stream(a).boxed();

✔ double → Integer
Stream<Integer> s2 =
    Arrays.stream(a).mapToObj(x -> (int)x);

✔ double → Long
Stream<Long> s3 =
    Arrays.stream(a).mapToObj(x -> (long)x);

✔ double → Float
Stream<Float> s4 =
    Arrays.stream(a).mapToObj(x -> (float)x);

================================================================================
🟢 8️⃣ BOOLEAN[] → WRAPPER STREAMS
================================================================================

boolean[] a = {true,false};

✔ boolean → Boolean
Stream<Boolean> s1 =
    IntStream.range(0,a.length).mapToObj(i -> a[i]);

✔ boolean → Integer
Stream<Integer> s2 =
    IntStream.range(0,a.length).mapToObj(i -> a[i]?1:0);

✔ boolean → String
Stream<String> s3 =
    IntStream.range(0,a.length).mapToObj(i -> String.valueOf(a[i]));

================================================================================
🏆 FINAL INTERVIEW SUMMARY (SAY THIS EXACTLY)
================================================================================

1️⃣ boxed() works only for int[], long[], double[].
2️⃣ Other primitive arrays require IntStream.range().mapToObj().
3️⃣ Any numeric primitive can convert to any numeric wrapper via casting.
4️⃣ boolean can only convert to Boolean or mapped manually.

================================================================================
🔥 ONE-LINE MEMORY RULE
================================================================================

Primitive array → wrapper stream =
    boxed() OR range().mapToObj()

================================================================================
*/

