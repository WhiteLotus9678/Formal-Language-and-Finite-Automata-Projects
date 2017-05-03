import java.util.Scanner;

public class TM
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      Tape t;
      System.out.print("Enter the String \"xx\" using alphabet a and b \n");
      System.out.print("Example: \"abab\" \n");
      String input = in.nextLine();
      in.close();
      t = new Tape(input);
      
      int currentState = 0;
      while(currentState < 9)
      {
         switch(currentState)
         {
            case 0:
               if(t.read()=='a')
               {
                  currentState = 1;
                  t.write('0');
                  t.moveRight();System.out.print("going to state " + currentState + "\n");
               }
               else if(t.read()=='b')
               {
                  currentState = 1;
                  t.write('1');
                  t.moveRight();System.out.print("going to state " + currentState + "\n");
               }
               else if(t.read()=='B')
               {
                  currentState = 9;
                  t.write('B');
                  t.moveRight();System.out.print("going to state " + currentState + "\n");
               }
               else if(t.read()=='Q')
               {
                  currentState = 4;
                  t.write('Q');
                  t.moveLeft();System.out.print("going to state " + currentState + "\n");
               }
               else if(t.read()=='A')
               {
                  currentState = 4;
                  t.write('A');
                  t.moveLeft();System.out.print("going to state " + currentState + "\n");
               }
               else
               {
                  currentState=99;System.out.print("going to state " + currentState + "\n");
               }
               break;
            case 1:
               if(t.read()=='a')
               {
                  currentState = 1;
                  t.write('a');
                  t.moveRight();System.out.print("going to state " + currentState + "\n");
               }
               else if(t.read()=='b')
               {
                  currentState = 1;
                  t.write('b');
                  t.moveRight();System.out.print("going to state " + currentState + "\n");
               }
               else if(t.read()=='A')
               {
                  currentState=2;
                  t.write('A');
                  t.moveLeft();System.out.print("going to state " + currentState + "\n");
               }
               else if(t.read()=='Q')
               {
                  currentState=2;
                  t.write('Q');
                  t.moveLeft();System.out.print("going to state " + currentState + "\n");
               }
               else if(t.read()=='B')
               {
                  currentState=2;
                  t.write('B');
                  t.moveLeft();System.out.print("going to state " + currentState + "\n");
               }
               else
               {
                  currentState=99;System.out.print("going to state " + currentState + "\n");
               }
               break;
           case 2:
               if(t.read()=='b')
               {
                  currentState=3;
                  t.write('Q');
                  t.moveLeft();System.out.print("going to state " + currentState + "\n");
               }
               else if(t.read()=='a')
               {
                  currentState=3;
                  t.write('A');
                  t.moveLeft();System.out.print("going to state " + currentState + "\n");
               }
               else
               {
                  currentState=99;System.out.print("going to state " + currentState + "\n");
               }
               break;
          case 3:
               if(t.read()=='a')
               {
                  currentState=3;
                  t.write('a');
                  t.moveLeft();System.out.print("going to state " + currentState + "\n");
               }
               else if(t.read()=='b')
               {
                  currentState=3;
                  t.write('b');
                  t.moveLeft();System.out.print("going to state " + currentState + "\n");
               }
               else if(t.read()=='0')
               {
                  currentState=0;
                  t.write('0');
                  t.moveRight();System.out.print("going to state " + currentState + "\n");
               }
               else if(t.read()=='1')
               {
                  currentState=0;
                  t.write('1');
                  t.moveRight();System.out.print("going to state " + currentState + "\n");
               }
               else
               {
                  currentState=99;System.out.print("going to state " + currentState + "\n");
               }
               break;
          case 4:
              if(t.read()=='0')
               {
                  currentState=4;
                  t.write('0');
                  t.moveLeft();System.out.print("going to state " + currentState + "\n");
               }
               else if(t.read()=='1')
               {
                  currentState=4;
                  t.write('1');
                  t.moveLeft();System.out.print("going to state " + currentState + "\n");
               }
               else if(t.read()=='B')
               {
                  currentState=5;
                  t.write('B');
                  t.moveRight();System.out.print("going to state " + currentState + "\n");
               }
               else
               {
                  currentState=99;System.out.print("going to state " + currentState + "\n");
               }
               break;
           case 5:
               if(t.read()=='X')
               {
                  currentState=5;
                  t.write('X');
                  t.moveRight();System.out.print("going to state " + currentState + "\n");
               }
               else if(t.read()=='1')
               {
                  currentState=6;
                  t.write('X');
                  t.moveRight();System.out.print("going to state " + currentState + "\n");
               }
               else if(t.read()=='0')
               {
                  currentState=8;
                  t.write('X');
                  t.moveRight();System.out.print("going to state " + currentState + "\n");
               }
               else if(t.read()=='B')
               {
                  currentState=9;
                  t.write('B');
                  t.moveRight();System.out.print("going to state " + currentState + "\n");
               }
               else
               {
                  currentState=99;System.out.print("going to state " + currentState + "\n");
               }
               break;
          case 6:
              if(t.read()=='X')
              {
                  currentState=6;
                  t.write('X');
                  t.moveRight();System.out.print("going to state " + currentState + "\n");
              }
              else if(t.read()=='1')
              {
                  currentState=6;
                  t.write('1');
                  t.moveRight();System.out.print("going to state " + currentState + "\n");
              }
              else if(t.read()=='0')
              {
                  currentState=6;
                  t.write('0');
                  t.moveRight();System.out.print("going to state " + currentState + "\n");
              }
              else if(t.read()=='Q')
              {
                  currentState=7;
                  t.write('X');
                  t.moveLeft();System.out.print("going to state " + currentState + "\n");
              }
              else
              {
               currentState=99;System.out.print("going to state " + currentState + "\n");
              }
              break;
           case 7:
              if(t.read()=='X')
              {
                  currentState=7;
                  t.write('X');
                  t.moveLeft();System.out.print("going to state " + currentState + "\n");
              }
              else if(t.read()=='1')
              {
                  currentState=7;
                  t.write('1');
                  t.moveLeft();System.out.print("going to state " + currentState + "\n");
              }
              else if(t.read()=='0')
              {
                  currentState=7;
                  t.write('0');
                  t.moveLeft();System.out.print("going to state " + currentState + "\n");
              }
              else if(t.read()=='B')
              {
                  currentState=5;
                  t.write('B');
                  t.moveRight();System.out.print("going to state " + currentState + "\n");
              }
              else
              {
               currentState=99;System.out.print("going to state " + currentState + "\n");
              }
              break;
           case 8:
              if(t.read()=='X')
              {
                  currentState=8;
                  t.write('X');
                  t.moveRight();System.out.print("going to state " + currentState + "\n");
              }
              else if(t.read()=='1')
              {
                  currentState=8;
                  t.write('1');
                  t.moveRight();System.out.print("going to state " + currentState + "\n");
              }
              else if(t.read()=='0')
              {
                  currentState=8;
                  t.write('0');
                  t.moveRight();System.out.print("going to state " + currentState + "\n");
              }
              else if(t.read()=='A')
              {
                  currentState=7;
                  t.write('X');
                  t.moveLeft();System.out.print("going to state " + currentState + "\n");
              }
              else
              {
               currentState=99;System.out.print("going to state " + currentState + "\n");
              }
              break;  
         }
      }
      
      if(currentState == 9)
       {
         System.out.println("Accepted String.");
       }
       else
         System.out.println("Not Accepted.");
   }
}