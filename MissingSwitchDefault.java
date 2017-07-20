public class MissingSwitchDefault{
  public void test1(){
    switch(type)
    {
        case 1:
            doSomething();
            break;
        case 2:
            doSomethingElse();
            break;
    }
  }
  
  public void test2(){
    switch(type)
    {
        case 1:
            doSomething();
            break;
        case 2:
            doSomethingElse();
            break;
        default:
            handle();
            break;
    }
  }
}
