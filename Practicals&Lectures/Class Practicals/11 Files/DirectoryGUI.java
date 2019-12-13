import java.awt.*;                              // include widget handling
import java.awt.event.*;                        // include event handling
import javax.swing.*;                           // include Swing handling

/**
Final version of user interface class to support the directory program. Maintain a
telephone directory with names and numbers.

<ul>

<li>Enter: create directory entry from name/phone fields</li>

<li>Find: search directory for name field, setting name/phone fields</li>

<li>
Delete: delete directory entry for name field, setting name/phone fields
</li>

</ul>

@author       Simon Jones (based on original by Kenneth J. Turner)
@version      16/11/2015
 */

public class DirectoryGUI extends JFrame implements ActionListener {

    /** Application name */
    private String windowName;

    /** Name and phone labels */
    private JLabel nameLabel, phoneLabel;

    /** Name and phone text fields */
    private JTextField nameText, phoneText;

    /** Buttons for enter, find, delete */
    private JButton enterButton, findButton, deleteButton;

    /** Phone book */
    private PhoneBook phoneBook;

    /**
    Constructor for directory application.
    Create directory window and set up phone book object to hold the directory data.
     */
    public DirectoryGUI(String windowName) {      // create directory window
        this.windowName = windowName;
        setTitle(windowName);
        createGUI();                                // initialise window
        pack();                                     // layout window and set the size
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        phoneBook = new PhoneBook();                // create new phone book
    }

    /**
    Handle button clicks to enter name/number, find number by name, and
    delete name/number.

    @param event        button click event
     */
    public void actionPerformed(ActionEvent event) {
        String name, phone;                         // name and phone
        String status = "";                         // initialise status message
        int entry;                                  // entry subscript

        if (event.getSource() == enterButton) {       // enter button clicked?
            name = nameText.getText();                // get name
            phone = phoneText.getText();              // get phone
            if (phoneBook.addEntry(name, phone))      // entry added?
                status = "Entry added";               // note entry added
            else                                      // entry not added
                status = "Entry not added";           // note entry not added
        }
        else if (event.getSource() == findButton) {   // find button clicked?
            name = nameText.getText();                // get name
            entry = phoneBook.findEntry(name);        // get entry number for name
            if (entry != -1) {                        // name found?
                nameText.setText(phoneBook.getName(entry));    // set name from entry
                phoneText.setText(phoneBook.getNumber(entry)); // set phone from entry                    
                status = "Name found";                // note name found
            }
            else {                                    // name not found
                phoneText.setText("");                // make phone empty
                status = "Name not found";            // note name not found
            }
        }
        else if (event.getSource() == deleteButton) { // delete button clicked?
            name = nameText.getText();                // get name
            entry = phoneBook.findEntry(name);        // get entry number for name
            if (entry != -1) {                        // name found?
                nameText.setText(phoneBook.getName(entry));     // set name from entry      
                phoneText.setText(phoneBook.getNumber(entry));  // set phone from entry
                phoneBook.deleteEntry(entry);         // delete entry for this name
                status = "Name deleted";              // note name deleted
            }
            else                                      // name not found
                status = "Name not deleted";          // note name not deleted
        }
        setTitle(windowName + ": " + status);         // set window title with status           
    }

    /**
    Initialise directory application and set up on-screen display.
     */
    public void createGUI() {
        Container contentPane = getContentPane();   // get content pane
        contentPane.setLayout(new FlowLayout());    // set flow layout
        nameLabel = new JLabel("Name:");            // create name label
        contentPane.add(nameLabel);                 // add name label to layout
        nameText = new JTextField(20);              // create text field for name
        contentPane.add(nameText);                  // add name text to layout
        phoneLabel = new JLabel("Phone:");          // create phone label
        contentPane.add(phoneLabel);                // add phone label to layout
        phoneText = new JTextField(20);             // create text field for phone
        contentPane.add(phoneText);                 // add phone text to layout
        enterButton = new JButton("Enter");         // create enter button
        contentPane.add(enterButton);               // add enter button to layout
        enterButton.addActionListener(this);        // listen for enter button
        findButton = new JButton("Find");           // create find button
        contentPane.add(findButton);                // add find button to layout
        findButton.addActionListener(this);         // listen for find button
        deleteButton = new JButton("Delete");       // create delete button
        contentPane.add(deleteButton);              // add delete button to layout
        deleteButton.addActionListener(this);       // listen for delete button
        addWindowListener(new WindowAdapter() {     // arrange to save the phone book when window is closing
          // Handle the window closing event
          public void windowClosing(WindowEvent e) {
            phoneBook.writePhoneBookEntries();
          }
        });
    }

}
