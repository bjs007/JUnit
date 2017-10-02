# JUnit

<B>What is unit testing?</B>
<BR>
A unit can be a function, a class, a package, or a subsystem. So, the term unit testing refers to the practice of testing such small units of your code, so as to ensure that they work as expected. For example, we can test whether an output is what we expected to see given some inputs or if a condition is true or false.
<BR>
<BR>
<BR>
<B>Test coverage</B>
<BR>
In general, the development community has different opinion regarding the percentage of code that should be tested (test coverage). Some developers believe that the code should have 100% test coverage, while others are comprised with a test coverage of 50% or less. In any case, you should write tests for complex or critical parts of your code.
<B> Unit testing in Java</B>
<BR>
<BR>
The most popular testing framework in Java is JUnit. JUnit is an open source testing framework which is used to write and run repeatable automated tests, so that we can be ensured that our code works as expected.
<BR>

<B>JUnit provides:</B>

Assertions for testing expected results.<BR>
Test features for sharing common test data.<BR>
Test suites for easily organizing and running tests.<BR>
Graphical and textual test runners.<BR><BR>
JUnit is used to test:
an entire object<BR>
part of an object – a method or some interacting methods<BR>
interaction between several objects<BR>

<B>Basic Annotations:</B><BR>
@Test</B>
public void method(): </B>
The Test annotation indicates that the public void method to which it is attached can be run as a test case.</B>
  
@Before</B>
public void method():</B>
The Before annotation indicates that this method must be executed before each test in the class, so as to execute some preconditions necessary for the test.</B>

@BeforeClass</B>
public static void method():</B>
The BeforeClass annotation indicates that the static method to which is attached must be executed once and before all tests in the class. That happens when the test methods share computationally expensive setup (e.g. connect to database).</B>

@After</B>
public void method():</B>
The After annotation indicates that this method gets executed after execution of each test (e.g. reset some variables after execution of every test, delete temporary variables etc)</B>

@AfterClass</B>
public static void method():</B>
The AfterClass annotation can be used when a method needs to be executed after executing all the tests in a JUnit Test Case class so as to clean-up the expensive set-up (e.g disconnect from a database). Attention: The method attached with this annotation (similar to BeforeClass) must be defined as static.</B>

@Ignore</B>
public static void method():</B>
The Ignore annotation can be used when you want temporarily disable the execution of a specific test. Every method that is annotated with @Ignore won’t be executed.</B>


  
  
</BR><B>Unit assertions</B>
In this section we will present a number of assertion methods. All those methods are provided by the Assert class which extends the class java.lang.Object and they are useful for writing tests so as to detect failures. In the table below there is a more detailed explanation of the most commonly used assertion methods.
</BR>void assertEquals([String message], expected value, actual value)</B>: Asserts that two values are equal. Values might be type of int, short, long, byte, char or java.lang.Object. The first argument is an optional String message.
</BR><B>void assertTrue([String message], boolean condition):</B> Asserts that a condition is true.
</BR><B>void assertFalse([String message],boolean condition):</B>	Asserts that a condition is false.
</BR><B>void assertNotNull([String message], java.lang.Object object):</B>	Asserts that an object is not null.
</BR><B>void assertNull([String message], java.lang.Object object):</B> Asserts that an object is null.
</BR><B>void assertSame([String message], java.lang.Object expected, java.lang.Object actual):</B> Asserts that the two objects refer to the same object.
</BR><B>void assertNotSame([String message], java.lang.Object unexpected, java.lang.Object actual):</B> Asserts that the two objects do not refer to the same object.
</BR><B>void assertArrayEquals([String message], expectedArray, resultArray):</B> Asserts that the array expected and the resulted array are equal. The type of Array might be int, long, short, char, byte or java.lang.Object.