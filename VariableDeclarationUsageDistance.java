public class VariableDeclarationUsageDistance {
  public void test1(){
    int minutes = 10;
    doSomething();
    doSomethingElse();
    initialize();
    Calendar cal = Calendar.getInstance();
    cal.set(Calendar.MINUTE, minutes);
  }
  
  public void test1(){
    doSomething();
    doSomethingElse();
    initialize();
    Calendar cal = Calendar.getInstance();
    int minutes = 10;
    cal.set(Calendar.MINUTE, minutes);
  }
}
