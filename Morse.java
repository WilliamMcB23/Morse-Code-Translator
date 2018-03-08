import java.util.Scanner;

public class Morse
{
  public static void main(String[] args) throws Exception

   {
      // user input assigned to look for a string of letters.
      Scanner sc = new Scanner(System.in);
      String userInput;
    
    
      // prompt message for the user.
      System.out.println("Enter your message : ");
    
      // assinged scanner to the String variable.
      userInput = sc.nextLine();



      char Eng[] = {'a', 'b', 'c', 'd', 'e', 'f',   // char array containing the alphabet and numbers from one to 10.
                    'g', 'h', 'i', 'j', 'k', 'l',
                    'm', 'n', 'o', 'p', 'q', 'r',
                    's', 't', 'u', 'v', 'w', 'x',
                    'y', 'z','0','1', '2', '3', '4',
                    '5', '6', '7', '8', '9', '/',};

       String Morse[] = {".-",    "-...",   "-.-.",  "-..",    ".",     "..-.",  // corresponding string array for Morse units.
                         "--.",   "....",   "..",    ".---",   "-.-",   ".-..",
                         "--",     "-.",    "---",    ".--.",  "--.-",   ".-.",
                         "...",    "-",     "..-",    "-..-",  "-.--",   "--..",
                         "-----",  ".----", "..---",  "...--", "....-",  ".....",
                         "-....",  "--...", "---..",  "----.", "/",};

        
        // for loop that scans throught the characters inputted from keyboard.
        for (int i = 0; i < userInput.length(); i++)
        {
          
          // for loop that matches the english array to those inputs.
          for(int j = 0; j < Eng.length; j++)
          {
            // statements to match the eng array elemtents to the morse elements.
            if(userInput.charAt(i) == Eng[j])
            {
              System.out.println(Morse[j]);
              break;
            }
            
            // if statment to recognize the space from keyboard as a '/' in Morse Code.
            if(userInput.charAt(i) == ' ')
            {
              i++;
              System.out.println("/");
            }

          }

       }
      //Print Statment.
      System.out.println(" ");
  }
}
