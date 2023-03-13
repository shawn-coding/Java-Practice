package Basics.Strings;

class StringBasics {
    //This java class practices String syntax and edge cases.
    public static void stringEquality(){
        //First off, string comparisons. == vs .equals().
        //A few starting devs confuse the two sometimes, let's remedy that.
        //make two new strings, same content, different references
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        //check if the references are the same
        System.out.println("Does s1 == s2?: " + (s1 == s2));
        //check if the content is the same
        System.out.println("Does s1.equals(s2)?: " + s1.equals(s2));
        //These should print out false then true, as the references
        //are different even though the content is the same.


        /*
        * Interesting side note, I originally made the first
        * one as ("string" + s1 == s2) and it just printed false,
        * I didnt' understand why. But then realised I accidentally
        * concatenated the first two into a new string, so it was literally
        * asking (does "string" concatenated with s1 equal the refernece
        * to s2?). So if you've got an equation you wanna concatenate,
        * always encapsulate it in parentheses
        */
    }
    public static void main(String[] args){
        stringEquality();
    }

}