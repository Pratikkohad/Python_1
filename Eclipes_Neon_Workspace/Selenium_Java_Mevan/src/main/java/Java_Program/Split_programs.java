package Java_Program;

public class Split_programs {
    public static void main(String[] args) {
        String string = "0000-789458";

        String[] part = string.split("-");
        String part1 =part[0];
        String part2 = part[1];
        System.out.println(part1);
        System.out.println(part2);


    }
}
