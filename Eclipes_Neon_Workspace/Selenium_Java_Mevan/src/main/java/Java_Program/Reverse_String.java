package Java_Program;

public class Reverse_String
{
    public static void main1(String[] args) {
        String data ="wow";

        char[] ary = data.toCharArray();

        for (int i=ary.length-1;  i>=0 ; i--)
        {
            System.out.print(ary[i]);
        }
    }


    public static void main(String[] args)
    {
        String data ="123454321";
        StringBuilder builder = new StringBuilder(data);
        builder.reverse();
        System.out.println(builder);

    }
}
