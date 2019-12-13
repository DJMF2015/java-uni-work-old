import java.awt.*;                              // include window-handling
import java.io.*;                               // include file-handling
import javax.swing.*; 
import javax.swing.text.*;                          // include Swing

/**


@author       Simon Jones (based on original code by Kenneth J. Turner)
@version      16/11/2015
 */

/** TEST TEXT:

Scotland has voted "No" to independence in the historic referendum on the nation's future. xxx12345 xxx///????95495. fgjdjgndmfgndf'''''546456==fff xxxx1234567891012====+++.
For now, that means it will continue to form an integral part of the UK - but for Scottish devolution, the process of granting powers from Westminster to the Scottish parliament, it's far from business as usual.
The focus will now be on how the UK government delivers its promise of more powers for the Scottish parliament, based at Holyrood, Edinburgh.
Here's what's likely to happen next.
 */ 

public class Formatter {
    // ------------------------------ Constants ------------------------------
    /** Text area width (characters) */
    public final static int textWidth = 80;

    // ------------------------------ Variables ------------------------------
    private static String word;
    /** Text area */
    private JTextArea textArea;

    /** Current text length */
    private int textLength;

    /** Current text position (character offset) */
    private int textPosition = 0;

    /** Current text words */
    private static String textWords;
    // ------------------------------ Constructor (complete) ------------------------------
    /**
    Create the text formatter, noting the main text area.

    @param textPane text area in user interface
     */
    public Formatter(JTextArea textArea) { // formatter constructor
        this.textArea = textArea;            // set text area
    }
    // ------------------------------ Methods (complete) ------------------------------
    /**
    Display debug message in the console window.

    @param message  message to be displayed
     */
    private void debug(String message) {    // show debug message
        System.err.println(message);        // display debug message
    }

    /**
    Get the current text details, storing the text in <var>textWords</var>, and
    the cursor position in <var>textPosition</var>.
     */
    public void getText() {             // get current text details
        textWords = textArea.getText();  // get text area words
        textPosition = textArea.getCaretPosition(); // get text area position
    }

    /** Highlight selection in text area, e.g. start 3 end 6 selects characters 3, 4
    and 5.

    @param position1    start of selection (first character)
    @param position2    end of selection (last character - not selected)
     */

    public void setSelection(int position1, int position2) { // set selection
        textArea.setCaretPosition(position1);   // set text selection start
        textArea.moveCaretPosition(position2);  // set text selection end
    }

    // ------------------------------ Methods (incomplete) ------------------------------

    /**
    Remove all text in the main area.
     */
    public void clearText() {           // clear text area
        textArea.setText(""); //clear textArea with empty string
        /**
        Count lines in main area, considering a line to be one or more characters
        ending with a newline (or the end of the text).

        @return     line count
         */
    }

    public int countLines() {  
        int count = 0;  //count lines in main area
        getText(); //get text area words and position
        textLength = textWords.length(); //specifies length of textword & stores in textLength varaible
        if(textLength > 0)  { //if the length of word is greater than zero move start condition
            int charCount; //loop counter
            for(charCount=0;charCount<textLength -1;charCount++){  //for the textLength starting at first word begin incrementing counter
                char c = textWords.charAt(charCount);  //variable char c  equals index of charCount
                if((c == '\n' && textWords.charAt(charCount + 1) != '\n')) //if c (charCount) is a newline & letter of word does not equal new line///
                    count++; //increment line count 
            }
            count++; //line count added
        }

        return count;  // return line count
    }
    /**
    Count words in main area, considering a word to be a number of consecutive
    non-space characters.
    @return     word count
     */
    /* The number of lines is just one plus the number of times the
    end of line character, '\n', occurs in the text. */
    public int countWords(){
        int wordCount = 0;
        int charCount = 0;
        textWords = textArea.getText();
        charCount = textWords.length();
        for (int i = 0; i < charCount; i++) { // for every char in length of word, increment loop counter 'i'
            boolean  inWord;   // initialise not in word
            if ( Character.isLetter (textWords.charAt(i)) == false )// if the character in word is not a letter...
                inWord= false;  // Not a letter.
            else if (i == 0)   //else if counter is equal to zero...
                inWord = true;   //...then this marks beginning of a letter at start of text/word
            else if ( Character.isLetter(textWords.charAt(i-1)) )
                inWord = false;   // else if character in text contains one letter after another...
            else if ( textWords.charAt(i-1) == '\'' && i > 1 
            && Character.isLetter(textWords.charAt(i-2)) )
                inWord = false;  // else if apostrophe is preceded by a letter then is a continuation of one word-not a new word.
            else
                inWord = true;   //This is a letter preceded by  a non-letter.    
            if ( inWord) //if true...
                wordCount++;//increment word count for each true statement
        }
        return wordCount;
    }

    /**
    Search for text in main area, starting from the current cursor position.

    @param searchText   text to be searched for
    @return     true/false if text found/not found

     */
    //findText finds all instances of word being searched for in text fiel

    public boolean findText(String searchText) {    // find text in main area
        boolean found = false;  // initialise find result  
        int startPos = 0;
        textWords = textArea.getText(); // *** get current text   
        textPosition = textArea.getCaretPosition(); 
        startPos = textWords.indexOf(searchText, textPosition);    //   move current position to end of found text
        int endPos = searchText.length() + startPos; // ***     set selection using start and end of found text

        if (startPos>= 0){
            found = true;
            setSelection( startPos, endPos);
        }
        return found;   // return find result

    }

    /**
    Replace text in main area.

    @param searchText       text to be searched for
    @param replacementText  replacement text
    @return         true/false if text replaced/not found
     */
    public boolean replaceText(String searchText, String replacementText) { // Replace text in main area
        boolean replaced = false;   // initialise replace result
        int startPos = 0;
        textWords = textArea.getText();//get text and return
        textPosition = textArea.getCaretPosition();
        startPos = textWords.indexOf(searchText, textPosition);//start from textPosition look for searchText and return the index (int) of 1st (0) char of searchText
        int endPos = searchText.length() + startPos; //end position becomes the length of search text plus start position 
        if (startPos >= 0 && searchText.length() > 0){//if startpos and legth of word greater than 0...
            textArea.replaceRange(replacementText, startPos, endPos);//for the start and end positon of word, replace searchText with replacementText
            replaced = true;
            setSelection(startPos,endPos+2);//setselection start and end
        }
        return replaced;
    }

    public void tidyText() {            // tidy text in main area
        int startPos = 0; //initialise start position
        textWords = textArea.getText();  // get text
        textWords = textWords.trim().replaceAll(" +", " "); // this will take care of multiple lines and spaces in the end
        textWords = textWords.trim().replaceAll("\\t", "");// this line will ensure that any tabs between words will be removed or inside of a word
        if(!(textWords.substring(textWords.length() - 1) == "\n")){
            textWords = textWords + "\n"; //this adds a new line in the end if there isn't one already
        }
        textWords = textWords.replaceAll("\n{3,}", "\n\n"); //to replace three or more consecutive new lines
        textArea.setText(textWords); // this will set and update the text on the text area

        /*       textWords = textArea.getText();
        int Length;
        Length=textWords.length();

        int[] a = new int[Length];

        for (int i = 0; i < Length; i++)
        a[i] = i;

        // shuffle
        for (int i = 0; i < Length; i++) {
        int r = (int) (Math.random() * (i+1));     // int between 0 and i
        int swap = a[r];
        a[r] = a[i];
        a[i] = swap;
        }

        // print permutation
        for (int i = 0; i < Length; i++)
        System.out.print(a[i] + " ");
        System.out.println("");

        // print checkerboard visualization
        for (int i = 0; i < Length; i++) {
        for (int j = 0; j < Length; j++) {
        if (a[j] == i) System.out.print("* ");
        // else           System.out.print(". ");
        }
        System.out.println(Length);
        }
         */ }

}
