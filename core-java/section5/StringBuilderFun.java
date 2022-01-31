import java.util.*;
public class StringBuilderFun {
    public static void main(String args[])
    {
        StringBuilder sb=new StringBuilder("Mir Rafath Ali");

        sb.append(" is awesome");
        System.out.println(sb);

        sb.insert(4," Asif");
        System.out.println(sb);

        sb.replace(23,30,"amazing");
        System.out.println(sb);

        sb.delete(4,14);
        System.out.println(sb);
    }
}
