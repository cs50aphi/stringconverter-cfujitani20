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
        // if it starts with a vowel only add "yay"
        if (vowels.indexOf(str.substring(0, 1)) >= 0)
        {
            return str + "yay";
        }
        //check for vowel in str
        for (int i = 1, k = str.length(); i < k; i++)
        {
            if (vowels.indexOf(str.substring(0, 1)) >= 0)
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
        str = str.replace(" and "," & ").replace(" you "," U ").replace(" to "," 2 ").replace(" for "," 4 ").replaceALL("a","").replaceALL("e","").replaceALL("i","").replaceALL("o","").replaceALL("u","").replaceALL("A","").replaceALL("E","").replaceALL("I","").replaceALL("O","");
        return str;
    }
}
