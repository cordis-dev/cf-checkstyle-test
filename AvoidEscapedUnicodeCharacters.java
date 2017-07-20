public class AvoidEscapedUnicodeCharacters {
   public void test() {
    String t1 = "∞"; // ok
    String t1 = "\u221e"; //
   }
}
