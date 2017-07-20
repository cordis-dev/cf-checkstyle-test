public class OverloadMethodsDeclarationOrder{
  public void foo(int i) {}
  public void foo(String s) {}
  public void notFoo() {} // unrelated method
  public void foo(int i, String s) {}
  
  public void bar(int i) {}
  public void bar(String s) {}
  public void bar() {} // ok
}
