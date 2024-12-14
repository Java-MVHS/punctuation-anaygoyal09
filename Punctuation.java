// Anay Goyal
// Punctuation.java
// Friday, Dec 13

public class Punctuation  // Declare a public class named Punctuation
{
    public static void main (String[] args)  // Main method, entry point of the program
    {
        Punctuation p = new Punctuation();  // Create a new instance of Punctuation class
        p.searchIt();  // Call the searchIt method on the Punctuation instance
    }

    public void searchIt()  // Method that initiates the punctuation check
    {
        checkForPunctuation();  // Calls checkForPunctuation method
    }

    public void checkForPunctuation()  // Method that initializes the string with a sample text
    {
        String Str1 = new String("Blood, Sweat, and Tears by Winston Churchill " +  // A large string concatenated with text
            "May 13, 1940" +
            "Mr. Speaker:" +
            "On Friday evening last I received His Majesty’s commission to form a new " +
            "Administration. It was the evident wish and will of Parliament and the nation that this should be conceived on the broadest possible basis and that it should include all parties, both those who supported the late Government and also the parties of the Opposition." +
            "I have completed the most important part of this task. A War Cabinet has been formed of five Members, representing, with the Liberal Opposition, the unity of the nation. The three party Leaders have agreed to serve, either in the War Cabinet or in high executive office. The three Fighting Services have been filled. It was necessary that this should be done in one single day, on account of the extreme urgency and rigour of events. A number of other key positions were filled yesterday, and I am submitting a further list to His Majesty tonight. I hope to complete the appointment of the principal Ministers during tomorrow. The appointment of the other Ministers usually takes a little longer, but I trust that, when Parliament meets again, this part of my task will be completed, and that the Administration will be complete in all respects." +
            "Sir, I considered it in the public interest to suggest that the House should be summoned to meet today. Mr. Speaker agreed and took the necessary steps, in accordance with the powers conferred upon him by the Resolution of the House. At the end of the proceedings today, the Adjournment of the House will be proposed until Tuesday, the 21st May, with, of course, provision for earlier meeting, if need be. The business to be considered during that week will be notified to Members at the earliest opportunity. I now invite the House, by the Resolution which stands in my name, to record its approval of the steps taken and to declare its confidence in the new Government." +
            "Sir, to form an Administration of this scale and complexity is a serious undertaking in itself, but it must be remembered that we are in the preliminary stage of one of the greatest battles in history, that we are in action at many points in Norway and in Holland, that we have to be prepared in the Mediterranean, that the air battle is continuous and that many preparations have to be made here at home. In this crisis I hope I may be pardoned if I do not address the House at any length today. I hope that"
            + " any of my friends and colleagues, or former colleagues, who are affected by the political reconstruction, will make all allowances for any lack of ceremony with which it has been necessary to act. I would say to the House, as I said to those who’ve joined this government: \"I have nothing to offer but blood, toil, tears and sweat.\"" +
            "We have before us an ordeal of the most grievous kind. We have before us many, many long months of struggle and of suffering. You ask, what is our policy? I will say: It is to wage war, by sea, land and air, with all our might and with all the strength that God can give us; to wage war against a monstrous tyranny, never surpassed in the dark and lamentable catalogue of human crime. That is our policy. You ask, what is our aim? I can answer in one word: victory. Victory at all costs, victory in spite of all terror, victory, however long and hard the road may be; for without victory, there is no survival. Let that be realised; no survival for the British Empire, no survival for all that the British Empire has stood for, no survival for the urge and impulse of the ages, that mankind will move forward towards its goal. " +
            "But I take up my task with buoyancy and hope. I feel sure that our cause will not be suffered to fail among men. At this time I feel entitled to claim the aid of all, and I say, \"Come then, let us go forward together with our united strength.\"");
        getPunctuationWords(Str1);  // Calls getPunctuationWords to search and print words containing punctuation
    }

    public void getPunctuationWords(String StrIn)  // Method that searches for words containing punctuation
    {
        int start = 0;  // Start index for substring extraction
        int end = 0;  // End index for substring extraction
        int length = StrIn.length();  // Get the length of the input string

        do
        {
            while(end < length && StrIn.charAt(end) != ' ')  // Loop through the string to find spaces (word boundaries)
            {
                end++;  // Increment the end index until a space is found
            }

            printWords(StrIn.substring(start, end));  // Call printWords to print the current word
            start = end + 1;  // Move the start index past the space
            end += 2;  // Skip over the space by moving the end index ahead by 2

        }
        while(end < length);  // Continue the loop while the end index is less than the length of the string
    }

    public void printWords(String TempIn)  // Method that checks if the word contains punctuation and prints it
    {
        boolean character = false;  // Flag to indicate if the word contains punctuation
        int counter = 0;  // Counter for iterating through the word
        while(counter < TempIn.length())  // Loop through each character of the word
        {
            // Check if the current character is a punctuation mark
            if(TempIn.charAt(counter) == '.' || TempIn.charAt(counter) == ',' || 
                TempIn.charAt(counter) == ';' || TempIn.charAt(counter) == ':' || 
                TempIn.charAt(counter) == '!' || TempIn.charAt(counter) == '?' || 
                TempIn.charAt(counter) == '\'' || TempIn.charAt(counter) == '\"' || 
                TempIn.charAt(counter) == '(' || TempIn.charAt(counter) == '-')
            {
                character = true;  // Set the flag to true if punctuation is found
            }
            else {
                character = false;  // Set the flag to false if no punctuation is found
            }
            counter++;  // Move to the next character
        }

        if(character == true)  // If the word contains punctuation, print it
        {
            System.out.print(TempIn + " ");  // Print the word followed by a space
        }
    }
}
