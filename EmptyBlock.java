public class EmptyBlock {
  public void test1(){
    if(optimistic)
      {
      }
      else
      {
      }
  }
  
  public void test2(){
    if(optimistic)
      {
        message = "half full";
      }
      else
      {
        message = "half empty";
      }
  }
}
