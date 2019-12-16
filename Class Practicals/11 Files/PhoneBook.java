import java.io.*;

/**
Incomplete version of supplementary class for phone books.

This version of the application declares a (fairly) large array to hold the directory.
When this class is instantiated,  it reads in the contents of the data file
mydirectory.txt, each line of which contains one entry for the directory:
a subscriber's name, then a semicolon, then the subscriber's phone number - for example:
Father Christmas;252525
One Entry is added to the directory array for each line read in. Once the file 
has been fully processed, the launch of application is finished, and the application
starts to interact with the user.

The methods for reading and processing, and for writing the data file need completing.

This code illustrates the use of an array which is not full of data.
The array is variable directory, and at any one time the entries in the array
are in consecutive locations starting at subscript 0. When a new entry is added,
it is placed in the next free location. The int variable next always holds the
subscript of the first free location, that is the next one that should be used.
Therefore, if directory can hold 10 entries, and it contains 4, then those
entries are at subscripts 0-3 and next holds 4.

@author       Simon Jones (based on original code by Kenneth J. Turner)
@version      2/12/2015
 */

public class PhoneBook {

    /** Phone book file name */
    private String phoneBookFile = "mydirectory.txt";

    /** Next entry to use */
    private int next = 0;

    /** Number of directory entries */
    private final int size = 100;

    /** Directory entry array */
    private Entry directory[] = new Entry[size];

    /**
     * PhoneBook constructor: Initialize from data file
     */
    public PhoneBook() {
        readPhoneBookEntries();
    }

    /**
     * This method opens and reads in the contents of the data file given by phoneBookFile.
     * Each line of the file contains one entry for the directory:
     * a subscriber's name, then a semicolon, then the subscriber's phone number.
     * One Entry is added to the directory array for each line read in.
     * If any exception occurs, then the file processing is halted,
     * an on-screen alert is popped up for the user, and any
     * directory entries already made are kept.
     */
    private void readPhoneBookEntries() {
        System.out.println("readPhoneBookEntries");
        try{ // Prepare to catch IOExceptions
            String infile;
            BufferedReader infile;// Open a buffered reader for the file
           infile = new BufferedReader (new FileReader(mydirectory));
            String lines = 0;
            //String lines = lines.readLine();
            while ((line = mydirectory.readLine())!=Null){// Read and process each line in the file as follows:
              
                lines++;
                //   Extract the subscriber's name and number into two string variables
                //   Use addEntry to add the new entry
                // Close the file
                // Note: Any IOException that occurs should be caught, an
                // alert should be popped up to inform the user, and the method should be exited
                // without further reading.
            }}
        catch (IOException e){
        }
    }

    /**
     * This method opens the data file given by phoneBookFile, and writes out the current 
     * directory contents to data file. This will overwrite the previous contents of the file.
     * Each entry in the directory is output as a single line of text to the file,
     * with the a subscriber's name, then a semicolon, then the subscriber's phone number.
     * Therefore this file can be read in again at a later time by readPhoneBookEntries.
     */
    public void writePhoneBookEntries() {
        System.out.println("writePhoneBookEntries");
        // Prepare to catch IOExceptions
        // Open a buffered writer for the file
        // Process each entry in the directory as follows:
        //   Obtain the subscriber's name and number into two string variables
        //   Write a formatted line of text to the file
        // Close the file
        // Note: Any IOException that occurs should be caught, an
        // alert should be popped up to inform the user, and the method should be exited
        // without further writing. 
    }

    /**
    Add a phone book entry to array <var>directory</var>, checking whether
    there is space in the phone book for the new entry.

    @param name         new name
    @param phone        new phone number
    @return             true/false if entry added/not added
     */
    public boolean addEntry(String name, String phone) {
        if (next < size &&                          // space in directory and ...
        name.length() > 0 &&                    // name is non-empty and ...
        phone.length() > 0) {                   // phone is non-empty?
            directory[next] = new Entry(name, phone); // make new directory entry
            next++;                                   // move to next free entry
            return true;                              // report entry added
        }
        else                                        // problems with entry
            return false;                             // report entry not added
    }

    /**
    Delete phone book entry from array <var>directory</var>, moving later
    entries down one place and updating the next free entry index.

    @param entry        phone book entry index
     */
    public void deleteEntry(int entry) {
        for (int i = entry; i < next - 1; i++)      // move later entries down
            directory[i] = directory[i + 1];          // copy next entry
        next--;                                     // last entry now free
    }

    /**
    Find a phone book entry in array <var>directory</var>. Accept a partial
    match on name, irrespective of letter case. If there are several candidate
    entries, the first is found.

    @param person       person name to find
    @return             index of matching entry, or -1 if not found
     */
    public int findEntry(String person) {
        int i = 0;                                  // initialise counter
        String dirName;                             // directory name
        if (person.length() == 0)                   // name is empty?
            return -1;                                // Yes, return "not found"
        person = person.toLowerCase();              // convert name to lower case
        while (i < next) {                          // not yet at directory end?
            dirName = directory[i].getName();         // get directory name
            dirName = dirName.toLowerCase();          // make it lower case
            if (dirName.indexOf(person) != -1)        // entry name matches?
                return i;                               // return entry subscript
            i++;                                      // move to next entry
        }
        return -1;                                  // return "not found"
    }

    /**
    Get the name for a phone book entry in array <var>directory</var>.

    @param entry        phone book entry index
    @return             name for entry
     */
    public String getName(int entry) {
        return(directory[entry].getName());         // return directory name
    }

    /**
    Get the number for a phone book entry in array <var>directory</var>.

    @param entry        phone book entry index
    @return             number for entry
     */
    public String getNumber(int entry) {
        return(directory[entry].getNumber());       // return directory number
    }
}
