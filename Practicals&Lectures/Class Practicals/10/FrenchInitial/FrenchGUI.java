import java.awt.*;                              // include widget handling
import java.awt.event.*;                        // include event handling
import javax.swing.*;                           // include Swing handling

/**
Incomplete version of translation GUI class to support English to French translation.

<ul>

<li>Edit: make translation editable</li>

<li>Reset: reset translation parameters</li>

<li>Quit: quit application</li>

</ul>

@author       Simon Jones (based on original code by Kenneth J. Turner)
@version      30/11/2015
 */

public class FrenchGUI extends JFrame implements ActionListener, ItemListener {

    /** Menu bar */
    private JMenuBar menus = new JMenuBar();

    /** "Action" menu */
    private JMenu actionMenu = new JMenu("Action");

    /** "Edit" menu item */
    private JMenuItem editItem = new JMenuItem("Edit");

    private JMenuItem resetItem = new JMenuItem("Reset");

    /** "Quit" menu item */
    private JMenuItem quitItem = new JMenuItem("Quit");

    /** Language choice */
    private JComboBox<String> languageChoice = new JComboBox<String>();

    /** "Very" check box */
    private JCheckBox veryBox = new JCheckBox("very");

    /** Opinion button group */
    private ButtonGroup opinionGroup = new ButtonGroup();

    /** "Easy" opinion as default */
    private JRadioButton easyButton = new JRadioButton("easy", true);

    /** "Hard" opinion */
    private JRadioButton hardButton = new JRadioButton("hard");

    private JRadioButton niceButton = new JRadioButton("nice");

    /** Translation field */
    private JTextField translation;

    /** Language */
    private String language;

    /** "Very" option */
    private boolean very;

    /** Opinion */
    private String opinion;

    /**
    Constructor for translation application.
    Create translator window and initialize translator.
     */
    public FrenchGUI(String title) {
        setTitle(title);                 // set window title
        createGUI();                     // initialise window
        pack();                          // pack widgets into window
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);  // configure window close
        reset();                         // initialise translation
    }

    /**
    Set up on-screen display.
     */
    private void createGUI() {
        // set up content pane
        Container contentPane = getContentPane();   // get content pane
        contentPane.setLayout(new FlowLayout());    // set flow layout

        // set up menu items
        actionMenu.add(editItem);                   // add edit to action menu
        editItem.addActionListener(this); 
        // listen for reset menu item

        actionMenu.add(resetItem);      
        resetItem.addActionListener(this); 

        quitItem.setAccelerator(                    // set Control-Q for quit item
            KeyStroke.getKeyStroke(KeyEvent.VK_Q, ActionEvent.CTRL_MASK));
        actionMenu.add(quitItem);                   // add quit to action menu
        quitItem.addActionListener(this);           // listen for quit menu item

        resetItem.setAccelerator(                    // set Control-Q for quit item
            KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
        actionMenu.add(resetItem);                   // add quit to action menu
        resetItem.addActionListener(this);           // listen for quit menu item

        editItem.setAccelerator(                    // set Control-Q for quit item
            KeyStroke.getKeyStroke(KeyEvent.VK_E, ActionEvent.CTRL_MASK));
        actionMenu.add(editItem);                   // add quit to action menu
        editItem.addActionListener(this);           // listen for quit menu item

        menus.add(actionMenu);                      // add action menu to menu bar
        setJMenuBar(menus);                         // add menu bar to window

        // set up language choice
        languageChoice.addItem("English");          // add English to choice
        languageChoice.addItem("Japanese");    // add Japanese to choice
        languageChoice.addItem("German"); // add German to choice
        contentPane.add(languageChoice);            // add choice to layout
        languageChoice.addItemListener(this);       // listen for choice selection

        // set up "is" and "very" box
        contentPane.add(new JLabel("is"));          // add "is" to layout
        contentPane.add(veryBox);                   // add very box to layout
        veryBox.addItemListener(this);              // listen for "very" selection

        // set up "easy"/"hard" button group
        opinionGroup.add(easyButton);               // add "easy" button to group
        contentPane.add(easyButton);                // add "easy" button to layout
        easyButton.addActionListener(this);         // listen for "easy" button

        // set up "easy"/"hard" button group
        opinionGroup.add(niceButton);               // add "nice" button to group
        contentPane.add(niceButton);                // add "nice" button to layout
        niceButton.addActionListener(this);         // listen for "nice" button

        opinionGroup.add(hardButton);               // add "hard" button to group
        contentPane.add(hardButton);                // add "hard" button to layout
        hardButton.addActionListener(this);         // listen for "hard" button

        // set up "=" and translation
        contentPane.add(new JLabel("="));           // add "=" to layout
        translation = new JTextField(30);           // initialise translation
        translation.setEditable(true);             // make translation uneditable
        contentPane.add(translation);               // add translation to layout

    }

    /**
    Handle menu clicks to edit text, reset translation, quit the
    application, and button clicks to set "easy", "nice", "hard".

    @param event        menu/button click event
     */
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == editItem)          // edit menu item?
            translation.setEditable(!translation.isEditable());
        else if (event.getSource() == resetItem)
            reset();// flip translation editability
        else if (event.getSource() == quitItem)     // quit menu item?
            System.exit(0);                           // exit application
        else if (event.getSource() ==editItem)     // quit menu item?
            System.exit(0);        
        else if (event.getSource() ==resetItem)     // quit menu item?
            System.exit(0);   
        else if (event.getSource() == easyButton)   // "easy" clicked?
            opinion = "easy";                         // set "easy" opinion
        else if (event.getSource() == hardButton)   // "hard" clicked?
            opinion = "hard";     // set "hard" opinion
        else if (event.getSource() ==niceButton)   // "hard" clicked?
            opinion = "nice";  
        showTranslation();                          // update translation on screen
    }

    /**
    Handle item clicks to set language and "very" option.

    @param event        item event
     */
    public void itemStateChanged(ItemEvent event) {//clicking boxes
        if (event.getSource() == languageChoice)    // language choice clicked?
            language = (String) languageChoice.getSelectedItem(); // get language choice
        else if (event.getSource() == veryBox)      // very box clicked?
            very = veryBox.isSelected();              // get "very" setting
        showTranslation();                          // update translation on screen
    }

    /**
    Display translated sentence on-screen.
     */
    private void showTranslation() {
        String sentence;                            // declare sentence
        if (language.equals("English"))             // English?
            sentence = "Anglais";                     // start translation
        else if (language.equals("Japanese"))       // Japanese?
            sentence = "Japonais"; 
        else if (language.equals("German"))       //German?
            sentence = "Allemand";  // start translation
        else                                        // unknown language
            sentence = "";                            // start sentence
        if (!sentence.equals(""))                   // sentence has language?
            sentence += " est ";                      // add translation of "is"
        if (very)                                   // very set?
            sentence += "tres ";                      // add translation
        if (opinion.equals("easy"))                 // easy?
            sentence += "facile";       
        if (opinion.equals("nice"))                 // easy?
            sentence += "agreable";  // add translation
        else if (opinion.equals("hard"))            // hard?
            sentence += "difficile";                  // add translation
        translation.setText(sentence);               // display translation
    }

    /**
    Reset translation fields.
     */
    private void reset() {
        language = "English";                       // initialise language
        languageChoice.setSelectedItem(language);   // reset language
        very = false;                               // initialise not "very"
        veryBox.setSelected(false);                 // select not "very"
        opinion = "easy";                           // initialise "easy" opnion
        easyButton.setSelected(true);               // select "easy" opinion
        translation.setEditable(true);             // disable translation editing
        showTranslation();                          // show initial translation on screen
    }

}
