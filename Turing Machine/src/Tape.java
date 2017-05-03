public class Tape
{
   Square currentSquare;
   
   public Tape(String S)
   {
      currentSquare = new Square('B', null, null);
      Square nextSquare = currentSquare;
      for(char c : S.toCharArray())
      {
         nextSquare.write(c);
         nextSquare = nextSquare.getRight();
      }
      
   }
   public char read()
   {
      return currentSquare.read();
   }
   public void write(char c)
   {
      currentSquare.write(c);
   }
   public void moveRight()
   {
      currentSquare = currentSquare.getRight();
   }
   public void moveLeft()
   {
      currentSquare = currentSquare.getLeft();
   }

}