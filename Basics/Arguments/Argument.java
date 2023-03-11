package Basics.Arguments;

public class Argument {
    //This program is used to practice argument lists.
    //Research and implement how to use arguments that will show in output
    public static void main(String[] args){
        System.out.println("This program statically initializes variables.");
        System.out.println("It also works with arguments.");
        System.out.println("Arguments: " + args.length);

        for(int i=0; i < args.length; i++){
            System.out.println("Argument " + i + ": " + args[i]);
        }
    }

    /*
     * It took me about 10-20 minutes to figure it out.
     * It would say it couldn't find the main function of the file
     * once it was placed into a class file with:
     * javac Argument.java
     * 
     * So, what I found out is that you need to do it as so in this project:
     * 1. Navigate to the project's main directory
     * 2. javac with the package name, so:
     * javac .\Basics\Arguments\Argument.java
     * 3. Run the package file with the full package name, so:
     * java Basics.Arguments.Argument
     * 4. For adding arguments, simply do 1-3, then a space, and then
     * whatever String argument you wish to place into the program.
     * 
     * Conclusion+Review+Why:
     * It's nice to be able to run things straight from the command line
     * without multiple lines of interface, but it's only when you know
     * EXACTLY what the program does. A layperson won't do this.
     * So it's better to keep this kind of practice in data science scripts.
     */
}
