public class EmptyCatchBlock{
  public void test1()
  {
    try {
      int i = Integer.parseInt(response);
      return handleNumericResponse(i);
    } catch (NumberFormatException exception) {
    }
  }
  
  public void test2()
  {
    try {
      int i = Integer.parseInt(response);
      return handleNumericResponse(i);
    } catch (NumberFormatException exception) {
      // it's not numeric; that's fine, just continue
    }
  }  
}
