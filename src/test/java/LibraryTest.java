import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LibraryTest {
  @Test
  public void testSomeLibraryMethod() {
    Library classUnderTest = new Library();
    assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
  }

  @Test
  public void testSomeLibraryMethodReturningString() {
    Library classUnderTest = new Library();
    String expected= """
            {"1":"val1","2":"val2","3":"val3"}
            """.replace('\n',' ').trim();
    assertEquals(classUnderTest.someLibraryMethodReturningString(),expected);
  }
}
