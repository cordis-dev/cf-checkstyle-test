public class IllegalTokenText {
   public void test() {
    String t1 = "\012"; \\ bad - Unicode
    String t1 = "\u000a"; \\ bad - octal
    String t3 = "\t"; \\ ok
   }
}
