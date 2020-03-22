package Demo.StringDemo;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveSameString {

    public static void main(String[] args) {
        System.out.println(removerepeatedchar("ddddccffgddccff"));
        //dcfgdcf
        System.out.println("=================");
        System.out.println(removesamestring2("ddddccffgddccff"));
        //[d, c, f, g]
        System.out.println("=================");
        System.out.println(removesamestring3("ddddccffgddccff"));
        //dcfg
    }

    public static String removerepeatedchar(String s) {
        if (s == null)
            return s;
        StringBuffer sb = new StringBuffer();
        int i = 0, len = s.length();
        while (i < len) {
            char c = s.charAt(i);
            sb.append(c);
            i++;
            while (i < len && s.charAt(i) == c) {
                i++;
            }
        }
        return sb.toString();
    }

    private static String removesamestring2(String str)
    {
        Set<String> mlinkedset = new LinkedHashSet<String>();
        char[] strarray = str.toCharArray();
        for (int i = 0; i < strarray.length; i++)
        {
            if (!mlinkedset.contains(strarray[i]))
            {
                mlinkedset.add(strarray[i]+"");
            }
        }
//        System.out.println(mlinkedset);
        return mlinkedset.toString();
    }

    private static String removesamestring3(String str)
    {

        char[] strarray = str.toCharArray();
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < strarray.length; i++)
        {
            String s = sb.toString();
            if (!s.contains(strarray[i]+""))
            {
                sb.append(strarray[i]);
            }
        }
//        System.out.println(sb.toString());
        return sb.toString();
    }
}
