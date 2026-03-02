package com.lpu.java8;

/*
================================================================================
        🔥 MASTER GUIDE : WRAPPER STREAM CREATION APPROACHES 🔥
================================================================================

When converting primitive arrays → Stream<WrapperType>,
Java provides only a few real mechanisms.

We classify them into 3 approaches:

    APPROACH-1 → .boxed()
    APPROACH-2 → Stream.of(...)
    APPROACH-3 → Arrays.stream(Object[])

Plus the REAL universal fallback:

    APPROACH-4 → mapToObj()

================================================================================
🧠 APPROACH-1 → .boxed()
================================================================================

.boxed() converts primitive stream → wrapper stream.

WORKS ONLY ON:

    ✔ IntStream
    ✔ LongStream
    ✔ DoubleStream

So usable ONLY when primitive stream exists.

-------------------------------------------------------------------------------
✔ int[] → Stream<Integer>
-------------------------------------------------------------------------------
int[] a = {1,2,3};
Stream<Integer> s = Arrays.stream(a).boxed();

Return → Stream<Integer>

-------------------------------------------------------------------------------
✔ int → Stream<Long>
-------------------------------------------------------------------------------
Stream<Long> s =
    Arrays.stream(a)
          .mapToLong(x -> x)
          .boxed();

Return → Stream<Long>

-------------------------------------------------------------------------------
✔ int → Stream<Double>
-------------------------------------------------------------------------------
Stream<Double> s =
    Arrays.stream(a)
          .mapToDouble(x -> x)
          .boxed();

Return → Stream<Double>

-------------------------------------------------------------------------------
✔ long[] → Stream<Long>
-------------------------------------------------------------------------------
long[] a = {1L,2L};
Stream<Long> s = Arrays.stream(a).boxed();

-------------------------------------------------------------------------------
✔ long → Stream<Integer>
-------------------------------------------------------------------------------
Stream<Integer> s =
    Arrays.stream(a)
          .mapToInt(x -> (int)x)
          .boxed();

-------------------------------------------------------------------------------
✔ long → Stream<Double>
-------------------------------------------------------------------------------
Stream<Double> s =
    Arrays.stream(a)
          .mapToDouble(x -> x)
          .boxed();

-------------------------------------------------------------------------------
✔ double[] → Stream<Double>
-------------------------------------------------------------------------------
double[] a = {1.1,2.2};
Stream<Double> s = Arrays.stream(a).boxed();

-------------------------------------------------------------------------------
✔ double → Stream<Integer>
-------------------------------------------------------------------------------
Stream<Integer> s =
    Arrays.stream(a)
          .mapToInt(x -> (int)x)
          .boxed();

-------------------------------------------------------------------------------
✔ double → Stream<Long>
-------------------------------------------------------------------------------
Stream<Long> s =
    Arrays.stream(a)
          .mapToLong(x -> (long)x)
          .boxed();

-------------------------------------------------------------------------------
❌ .boxed() NOT POSSIBLE FOR:
-------------------------------------------------------------------------------

    byte[]
    short[]
    char[]
    float[]
    boolean[]

Reason:

    No primitive stream exists to call boxed() on.

================================================================================
🧠 APPROACH-2 → Stream.of(...)
================================================================================

Works ONLY for:

    ✔ object values
    ✔ boxed values
    ✔ literals
    ✔ wrapper arrays unpacked manually

-------------------------------------------------------------------------------
⚠ INTERVIEW TRAP
-------------------------------------------------------------------------------

int[] a = {1,2,3};

Stream<int[]> s = Stream.of(a);

Return → Stream<int[]>
NOT Stream<Integer>

Stream.of() does NOT unpack primitive arrays.

-------------------------------------------------------------------------------
✔ Correct usage with boxed literals
-------------------------------------------------------------------------------
Stream<Integer> s = Stream.of(1,2,3);

Return → Stream<Integer>

-------------------------------------------------------------------------------
✔ Works when values already boxed
-------------------------------------------------------------------------------

Stream<Integer>
Stream<Long>
Stream<Double>
Stream<Boolean>
Stream<String>

-------------------------------------------------------------------------------
❌ Stream.of() USELESS FOR PRIMITIVE ARRAYS
-------------------------------------------------------------------------------

byte[]
short[]
char[]
float[]
boolean[]

You must manually map them.

================================================================================
🧠 APPROACH-3 → Arrays.stream(Object[])
================================================================================

Works ONLY for reference arrays.

-------------------------------------------------------------------------------
✔ Integer[]
-------------------------------------------------------------------------------
Integer[] a = {1,2,3};
Stream<Integer> s = Arrays.stream(a);

-------------------------------------------------------------------------------
✔ Double[]
-------------------------------------------------------------------------------
Double[] a = {1.1,2.2};
Stream<Double> s = Arrays.stream(a);

-------------------------------------------------------------------------------
✔ Boolean[]
-------------------------------------------------------------------------------
Boolean[] a = {true,false};
Stream<Boolean> s = Arrays.stream(a);

-------------------------------------------------------------------------------
❌ DOES NOT WORK FOR PRIMITIVE ARRAYS
-------------------------------------------------------------------------------

Arrays.stream(byte[])    ❌
Arrays.stream(short[])   ❌
Arrays.stream(char[])    ❌
Arrays.stream(float[])   ❌
Arrays.stream(boolean[]) ❌

Only overloads exist for:

    int[]
    long[]
    double[]

================================================================================
🧠 APPROACH-4 → mapToObj()  ⭐ REAL UNIVERSAL METHOD
================================================================================

This is the TRUE universal solution.

Works for:

    ✔ ALL primitive arrays
    ✔ ALL wrapper targets
    ✔ ALL custom conversions

-------------------------------------------------------------------------------
✔ byte[] → Stream<Byte>
-------------------------------------------------------------------------------
Stream<Byte> s =
    IntStream.range(0,a.length).mapToObj(i -> a[i]);

-------------------------------------------------------------------------------
✔ float[] → Stream<Float>
-------------------------------------------------------------------------------
Stream<Float> s =
    IntStream.range(0,a.length).mapToObj(i -> a[i]);

-------------------------------------------------------------------------------
✔ boolean[] → Stream<Boolean>
-------------------------------------------------------------------------------
Stream<Boolean> s =
    IntStream.range(0,a.length).mapToObj(i -> a[i]);

-------------------------------------------------------------------------------
✔ numeric conversion
-------------------------------------------------------------------------------
Stream<Double> s =
    IntStream.range(0,a.length).mapToObj(i -> (double)a[i]);

================================================================================
🧠 REAL POSSIBILITY COUNT (INTERVIEW DEPTH)
================================================================================

Theoretical primitive conversions:

    8 primitives × 7 targets = 56

But stream support reduces real cases.

-------------------------------------------------------------------------------
.boxed() usable only for:
-------------------------------------------------------------------------------

    int, long, double sources

So only limited direct conversions exist.

-------------------------------------------------------------------------------
Stream.of() contributes NOTHING for primitive arrays
-------------------------------------------------------------------------------

because:

    Stream.of(int[]) ≠ Stream<Integer>

-------------------------------------------------------------------------------
Arrays.stream(Object[]) works ONLY for wrapper arrays
-------------------------------------------------------------------------------

So it helps only when primitives already boxed.

-------------------------------------------------------------------------------
🏁 FINAL TRUTH
-------------------------------------------------------------------------------

Most primitive → wrapper stream conversions
must use:

    mapToObj()

================================================================================
🏆 PERFECT INTERVIEW ANSWER
================================================================================

Say this:

Primitive conversions are theoretically many,
but Java Streams support only three primitive streams.

.boxed() works only for IntStream, LongStream, DoubleStream.
Stream.of() does not unpack primitive arrays.
Arrays.stream(Object[]) works only for wrapper arrays.

Therefore most primitive-to-wrapper conversions
must be done using mapToObj().

================================================================================
🔥 ONE-LINE MEMORY RULE
================================================================================

Primitive array → Wrapper stream =
    boxed() OR mapToObj()

================================================================================
*/
