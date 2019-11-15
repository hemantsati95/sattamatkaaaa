package Nov14;

public class Longest_Palinfrom {
    static String palindrom(String s)
    {
        String longestPalindrom="";
        for(int i=0;i<s.length();i++)
        {
            for(int j=s.length()-1;j>=0 && j!=i;j--)
            {
                if(flag(s.substring(i,j+1)))
                {
                    if(s.substring(i,j+1).length()>longestPalindrom.length())
                    {
                        longestPalindrom=s.substring(i,j+1);
                        return longestPalindrom;
                    }
                }
            }
        }
        return longestPalindrom;
    }
    static boolean flag(String s)
    {
        int end= s.length()-1;
        for(int i=0;i<s.length()/2;i++)
        {
            if(s.charAt(i)!=s.charAt(end))
            {
                return false;
            }
            end --;
        }
        return true;
    }
    public static void main(String [] args)
    {
        String s="abdbacabdc";
        System.out.println(palindrom(s));
        System.out.println(flag(s));
        
    }
}
