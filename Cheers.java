// Prints a crowd cheering output.
public class Cheers
 {
        public static void main(String[] args)
         {
                String name = args[0];
                int count = Integer.parseInt(args[1]);
                name = name.toUpperCase();
                int length = name.length();

                String rules = "AEFHILMNORSX";
                for (int i=0; i<length; i++)
                {
                        System.out.print("Give me ");
                        // print "an " for letters in rules, otherwise print "a  " (two spaces)
                        if( rules.indexOf(name.charAt(i)) >= 0 )
                        {
                                System.out.print("an ");
                        }
                        else
                        {
                                System.out.print("a  ");
                        }
                        // print with a space after the colon to match expected output
                        System.out.println(name.charAt(i) + ": " + name.charAt(i) + "!");
                }
                // no trailing space after the question mark
                System.out.println("What does that spell?");
                for (int j=0; j<count; j++)
                {
                        System.out.println(name + "!!!");
                }
        }
}
