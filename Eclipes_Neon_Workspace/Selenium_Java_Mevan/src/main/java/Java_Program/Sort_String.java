package Java_Program;

public class Sort_String
{
    public static void main(String[] args)
    {
        String data ="a1b2c3d4";
        char[] array = data.toCharArray();

        String number ="";
        String Char ="";

        for(int i=0 ; i<array.length;i++)
        {
             if (Character.isDigit(data.charAt(i)))
            {
                number= number + data.charAt(i);
            }
            else if(Character.isAlphabetic(data.charAt(i)))
            {
                Char = Char + data.charAt(i);
            }

        }
        System.out.println(number);
        System.out.println(Char);
    }
}
