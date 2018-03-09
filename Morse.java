import java.util.Scanner;

public class Morse
{
  public static void main(String[] args) throws Exception

   {
      Scanner sc = new Scanner(System.in);
      String userInput;

      System.out.println("Enter your message : ");
      userInput = sc.nextLine();
      userInput = userInput.toLowerCase();


      char Eng[] = {'a', 'b', 'c', 'd', 'e', 'f',
                    'g', 'h', 'i', 'j', 'k', 'l',
                    'm', 'n', 'o', 'p', 'q', 'r',
                    's', 't', 'u', 'v', 'w', 'x',
                    'y', 'z','0','1', '2', '3', '4',
                    '5', '6', '7', '8', '9',};

       String Morse[] = {".-",    "-...",   "-.-.",  "-..",    ".",     "..-.",
                         "--.",   "....",   "..",    ".---",   "-.-",   ".-..",
                         "--",     "-.",    "---",    ".--.",  "--.-",   ".-.",
                         "...",    "-",     "..-",    "...-",  ".--",   "-..-",
                         "-.--",   "--..",  "-----",  ".----", "..---",  "...--",
                         "....-",  ".....", "-....",  "--...", "---..",  "----."};


        for (int i = 0; i < userInput.length(); i++)
        {

          for(int j = 0; j < Eng.length; j++)
          {
            if(userInput.charAt(i) == Eng[j])
            {
              System.out.println(Morse[j]);
              break;
            }

            if(userInput.charAt(i) == ' ')
            {
              i++;
              System.out.println("/");
            }

          }

       }

      System.out.println(" ");
  }
}
