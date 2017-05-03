public class Square
{
   private Square left, right;
   private char c;
   
   public Square(char c, Square left, Square right)
   {
      this.c = c;
      this.left = left;
      this.right = right;
   }
   
   public Square getLeft()
   {
      if(left == null)
      {
         left = new Square('B', null, this);
      }
      return left;
   }
   
   public Square getRight()
   {
      if(right == null)
      {
        right = new Square('B', this, null);
      }
      return right;
   }
   
   public char read()
   {
      return this.c;
   }
   public void write(char c)
   {
      this.c = c;
   }
}