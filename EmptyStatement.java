public class EmptyStatement{
  public void t1(){
    doSomething();;
    while (condition)
    {
        ;
    }
  }
  
  public void t1(){
    doSomething();
    while (condition)
    {
       /** intentionally empty */
    }
  }
}
