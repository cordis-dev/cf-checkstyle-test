public class CommentsIndentation{
  public void test1()
  {
    // comment at the same identation level
    boolean bool = true;

      /* violation
      * (block comment should have the same indentation level as line below)
      */
    double d = 3.14;
  }
  
  public void test1()
  {
    // comment at the same identation level
    boolean bool = true;

    /* Block comment
    *  at the same indentation level
    */
    double d = 3.14;
  }  
}
