public class StringConverter
{
    // reverse string method
    public static String reverse(String str)
    {
        // itterate through string using str.length to go through entire string from last to first
        String rev = "";
        for (int i = str.length() - 1, k = 0; i >= k; i--)
        {
            rev += str.substring(i, i + 1);
        }
        return rev;
    }
    // remove non-alphabet characters
    public static String alphaOnly(String str)
    {
        // remove all characters not in alphabet such as commas and semicolons
        return str.replaceAll("[^a-zA-Z]", "");
    }
    // check if word is a palindrome method
    public static boolean checkPalindrome(String str)
    {
        String rev = "";
        // call method alphaOnly to take out chars that are not in the alphabet
        str = alphaOnly(str);
        // converts string str into lowercase using .toLowerCase()
        str = str.toLowerCase();
        // reverse the string
        rev = StringConverter.reverse(str);
        // check if word is a palindrome by checking original to temp and if match then true, else false
        if (str.equals(rev))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    // convert the string word into pig latin
    public static String pigLatinate(String str)
    {
        // first and last parts of the word
        String first = "";
        String last = "";
        // string of vowels for checking in word
        String vowels = "aeiouAEIOU";
        str = alphaOnly(str);
        // if string starts with a vowel only add "yay"
        if (vowels.indexOf(str.substring(0, 1)) >= 0)
        {
            return str + "yay";
        }
        //check for vowel in str
        for (int i = 1, k = str.length(); i < k; i++)
        {
            if (vowels.indexOf(str.substring(i, i + 1)) >= 0)
            {
                if (Character.isUpperCase(str.charAt(0)))
                {
                    // convert to pig latin if vowel is in str
                    first = str.substring(0, 1).toLowerCase() + str.substring(1,i);
                    last = str.substring(i, i + 1).toUpperCase() + str.substring(i + 1);
                }
                else
                {
                    first = str.substring(0, i);
                    last = str.substring(i);
                }
                return last + first + "ay";
            }
        }
        // if no vowels exist in str then only attach "ay"
        return str + "ay";
    }
    // converts the string into shorthand version
    public static String shorthand(String str)
    {
        // manually remove all vowels from str, and also convert for - 4. and - &, to - 2, and you - U.
        String shrt = str.replaceAll("for", "4").replaceAll(" to ", " 2 ").replaceAll(" and ", " & ").replaceAll("you", "U").replaceAll("a", "").replaceAll("e", "").replaceAll("i", "").replaceAll("o", "").replaceAll("u", "").replaceAll("A", "").replaceAll("E", "").replaceAll("I", "").replaceAll("O", "");
        return shrt;
    }
}
