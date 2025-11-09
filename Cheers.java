//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	  String name = args[0];
          String nameUpper = name.toUpperCase();
          int cheersNum = Integer.parseInt (args[1]);
          int nameLength = name.length();
          char Letter;
          //If the inputted letter is one of the letters {'A', 'E', 'F', 'H', 'I', 'L', 'M', 'N', 'O', 'R',
          //'S', 'X'}, the program prints "an" instead of "a".
          String anLetters = "AEFHILMNORSX";

          //give me a/an 'letter':
            for (int i = 0; i < nameLength; i++)
            {
                Letter = nameUpper.charAt(i);
           //check letter for condition
                if (anLetters.indexOf(Letter)!=-1)
                { 
                   System.out.println("Give me an " + Letter + ": " + Letter +"!");
                }
                else
                {
                   System.out.println("Give me a " + Letter + ": " + Letter +"!");
                }
               
            }
           
            //prints name x times:
            System.out.println("What does that spell?");
            for (int j = 0; j < cheersNum; j++)
            {
                System.out.println(nameUpper + "!!!");
            }


        }
}
