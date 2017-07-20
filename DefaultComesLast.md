public class DefaultComesLast{
  public void t1(){
    switch (type) {
        case 1:
            handleTypeOne();
            break;
        default:
            handleUnknownType();
            break;        
        case 2:
            handleTypeTwo();
            break;    
    }
  }
  
  public void t2(){
    switch (type) {
        case 1:
            handleTypeOne();
            break;
        case 2:
            handleTypeTwo();
            break;
        default:
            handleUnknownType();
            break;                    
    }
  }  
}
