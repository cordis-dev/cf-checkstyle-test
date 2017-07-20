public class SimplifyBooleanReturn{
  public bool t1(){
    if (valid())
        return false;
    else
        return true;
  }
  
  public bool t2(){
    return !valid();
  }  
}
