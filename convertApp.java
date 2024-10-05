import java.util.*;

class Convert {
    char ch[];

    void setChar(char c[]) {
        ch = c;
    }

    void convertUpp() 
{
        System.out.println("Before conversion");
        for (int i = 0; i < ch.length; i++)
        {
            System.out.printf("ch[%d]--%c\n", i, ch[i]);
        }

        for (int i = 0; i < ch.length; i++) 
         {
            if (ch[i] >= 'a' && ch[i] <= 'z') 
            {
                int convertedChar = (int) ch[i] - 32;
                ch[i] = (char) convertedChar;
            }
        }

        System.out.println("After conversion");
        for (int i = 0; i < ch.length; i++)
         {
            System.out.printf("ch[%d]--%c\n", i, ch[i]);
        }
    
}
}
public class convertApp
{
    public static void main(String args[]) 
     {
        Convert c = new Convert();
        char ch[] = { 'a','b','h','i' };
        c.setChar(ch);
        c.convertUpp();
    }
}
