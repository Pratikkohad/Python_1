package Java_Program;

import java.util.LinkedHashSet;

public class Duplicate_String
{
    public static void main(String[] args)
    {
        String data ="ChetanBhauChetanPraytikKohadPratik";
        LinkedHashSet<Character> set = new LinkedHashSet<Character>();
        for (char a : data.toCharArray())
        {
            set.add(Character.valueOf(a));
        }
        System.out.print("Character" + set);
    }
}
