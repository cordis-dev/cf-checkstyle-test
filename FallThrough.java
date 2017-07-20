public class FallThrough{
  public void t1(){
    switch (input) {
      case 1:
      case 2:
        prepareOneOrTwo();
      case 3:
        handleOneTwoOrThree();
        break;
      default:
        handleLargeNumber(input);
    }  
  }
  
  public void t2(){
    switch (input) {
      case 1:
      case 2:
        prepareOneOrTwo();
        // fall through
      case 3:
        handleOneTwoOrThree();
        break;
      default:
        handleLargeNumber(input);
    }
  }  
}
