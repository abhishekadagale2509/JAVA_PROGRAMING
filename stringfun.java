public class stringfun {
    public static void main (String args[])
    {
        String name="abhi";
        System.out.println(name);

        //int value=name.length();
        System.out.println(name.length());
        String lower=name.toLowerCase();
        System.out.println(lower);
        String upper=name.toUpperCase();
        System.out.println(upper);
        String nonTrimmedString="   abhi ";
        System.out.println(nonTrimmedString);
    String tr=nonTrimmedString.trim();
System.out.println(tr);
System.out.println(name.substring(1));
System.out.println(name.substring(1,4));    
System.out.println(name.replace('a','A'));}
String mystring1="thsi string contains   double and triple spaces";
System.out.println(mystring1.Indexof(""));
    
}
