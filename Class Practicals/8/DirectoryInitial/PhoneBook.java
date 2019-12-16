/**
Incomplete version of supplementary class for phone books.

This code illustrates the use of an array which is not full of data.
The array is variable directory, and at any one time the entries in the array
are in consecutive locations starting at subscript 0. When a new entry is added,
it is placed in the next free location. The int variable next always holds the
subscript of the first free location, that is the next one that should be used.
Therefore, if directory can hold 10 entries, and it contains 4, then those
entries are at subscripts 0-3 and next holds 4.

@author       Simon Jones (based on original code by Kenneth J. Turner)
@version      16/11/2015
 */

public class PhoneBook {

    /** Next entry to use */
    private int next = 0;

    /** Number of directory entries */
    private final int size = 5;

    /** Directory entry array */
    private Entry directory[] = new Entry[size];

    /**
    Add a phone book entry to array <var>directory</var>, checking whether
    there is space in the phone book for the new entry.

    @param name         new name
    @param phone        new phone number
    @return             true/false if entry added/not added
     */
    public boolean addEntry(String name, String phone) {//string phone??
        // make entry for name, phone
        if (next<size)
            directory[next] = new Entry(name, phone);
        if (name.length() == 0 || phone.length()==0 || next>=size) 
       
            return false;

        // make new directory entry
        next++;                                   // move to next free entry
        return true;  
        // report entry added
    } 

    /**
    Delete phone book entry from array <var>directory</var>, moving later
    entries down one place and updating the next free entry index.

    @param entry        phone book entry index
     */
    public void deleteEntry(int entry) {
    
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
        String dirName;   
        if (person.length()==0)
            return -1;  
        while (i < next) {                          // not yet at directory end?
            dirName = directory[i].getName();         // get directory name
            if (dirName.toLowerCase().indexOf(person.toLowerCase())>=0 )

                return i;                               // return entry subscript
            i++;                                      // move to next entry
        }
        return -1;                            // return invalid subscript
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
