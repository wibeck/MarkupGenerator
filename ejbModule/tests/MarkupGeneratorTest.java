package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.markupGenerator.MarkupGeneratorBean;

class MarkupGeneratorTest {

  @Test
  void test1() {
    MarkupGeneratorBean mB = new MarkupGeneratorBean();
    
    assertTrue(mB.generateDocumentFromUrl("http://localhost:8330/html-files/hi2.html") !=null);
  }
  
  //Issue with Test2: even if the expected is declared with mB.generateDocumentFromUrl's output, test fails
  @Test
  void test2() {
    MarkupGeneratorBean mB = new MarkupGeneratorBean();
    String expected ="<html><body>  <p>hi2</p>  <button id=\"btn\" >click!</button> <script>    </script></body></html>"; 
    assertEquals(mB.generateDocumentFromUrl("http://localhost:8330/html-files/hi2.html"), expected);
  }

}
