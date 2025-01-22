import java.util.Scanner;

public  class Palindrome{
    public  static  void  main(String[] args){
        Scanner sc = new Scanner(System.in); 
        //taking user input for text
        String text = sc.nextLine().trim();
		
		// creat an object of PalindromeChecker class
        PalindromeChecker pc = new PalindromeChecker(); 

        // checking if input text is palindrome
        pc.displayResult(text);

        sc.close();
    }
}

class PalindromeChecker {
    
    private String text;

    // created a method to check if a string is palindrome or not
    private boolean checkPalindrome() {
        // iterating through the text to find if it is a palindrome or not
        for (int i = 0; i < text.length() / 2; i++) {
            if(text.charAt(i) != text.charAt(text.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    // created a method to display the result
    public void displayResult(String text) {
        this.text = text;
        if (checkPalindrome()) {
            System.out.println(text + " is a palindrome");
        } else {
            System.out.println(text + " is not a palindrome");
        }
    }
}

