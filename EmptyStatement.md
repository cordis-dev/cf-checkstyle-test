public class EmptyStatement{
  public void t1(){
    doSomething();;

    while (condition)
    {
        ;
    }
  }
  
  public void t2(){
    doSomething();
    
    while (condition)
    {
        // empty
    }
  }  
}
