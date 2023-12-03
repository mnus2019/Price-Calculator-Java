
package Project1;
import java.awt.Color;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JSpinner;
import java.text.DecimalFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
* Class             QuiltProductsGUI()
* File              QuiltProductsGUI.java
* Description       Provides quilt constants for Shinning Star,Kat Soup, 
*                   Birch Trees, Tax and creates an object to set the
*                   Dollar format as private instance.Constructor 
*                   QuiltProductsGUI And methods setDate(),
*                   printJMenuItemActionPerformed(),quitJButtonActionPerformed()
*                   clearJButtonActionPerformed(),QuitJMenuItemActionPerformed()
*                   ClearJMenuItemActionPerformed(),calculateJButtonActionPerformed()
*                   aboutJMenuItemActionPerformed(), quilt1JSpinnerStateChanged(),
*                   quilt2JSpinnerStateChanged(), quilt3JSpinnerStateChanged()
* Environment       PC,Windows 10, jdk 20, NetBeans 17.
* Date              4/25/2023
* @author           <i>Minassie Ghebremicael</i>
* @version          1.0.0
* History Log   
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
class QuiltProductsGUI extends javax.swing.JFrame
{
       private final double SHINNING_STAR = 950;
       private final double KAT_SOUP = 480;
       private final double BIRCH_TREES = 315;
       private final double TAX = 0.098;
       private DecimalFormat dollars = new DecimalFormat("$#,##0.00");
       
    
    

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    * Constructor           QuiltProductsGUI()
    * Description           set a format for current date, and display 
    *                       it in the respective text field.Create customer name
    *                       file and puts in the respected JSpinner.Organize 
    *                       and Shape the form.  
    * @author               <i>Minassie Ghebremicael</i>
    * @see                  java.text.DateFormat
    * @see                  java.text.SimpleDateFormat
    * @see                  java.util.Date
    * Date                  4/25/2023
    * History Log   
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public QuiltProductsGUI() {
        initComponents();
         //set calculateJButton as default
        this.getRootPane().setDefaultButton(calculateJButton);
        //centers the form when run application
        this.setLocationRelativeTo(null);
        //set icon for form 
        this.setIconImage(Toolkit.getDefaultToolkit().
                getImage("src/Project1/patternQuilt.jpg"));
         //change the background color
        this.getContentPane().setBackground (new Color(255,255,204));
        // make JSpinner read-only(not Editable)
        ((JSpinner.DefaultEditor) quilt1JSpinner.getEditor()).getTextField().
                setEditable(false);
        ((JSpinner.DefaultEditor) quilt2JSpinner.getEditor()).getTextField().
                setEditable(false);
        ((JSpinner.DefaultEditor) quilt3JSpinner.getEditor()).getTextField().
                setEditable(false);
        headingJLabel.setForeground(new Color(188,215,204));
        // create the quilt price with a dollar sign
        q1PriceJLabel.setText(dollars.format(SHINNING_STAR));
        q2PriceJLabel.setText(dollars.format(KAT_SOUP));
        q3PriceJLabel.setText(dollars.format(BIRCH_TREES));
        // create a file object for the customer.txt
        File customerName = new File("C:\\CS& 141 Projects\\Lab projects"
                + "\\solution to project 1\\src\\Project1\\customerName.txt"); 
       
       try{ 
            //read from the file
           Scanner readFile = new Scanner(customerName);
       // conditional while checks if there is a file
        while(readFile.hasNext()){
            // add item to the customerJComboBox
            String read = readFile.nextLine();
            customerJComboBox.addItem(read);
           
        }
        } 
       // catches error if there is no file and display in showMessageDialog box
       // This helps me to craft my skills by doing and will improve it.
         catch (FileNotFoundException ex) {
                 JOptionPane.showMessageDialog(null, 
           "ERROR Message:File not Found");
           }
              
       setDate();  // call a method to set the date in title of the form
    }
    
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    * Method                setDate()
    * Description           set a format for current date.Displays title on 
    *                       title bar and date it in the respective text field.
    * @author               <i>Minassie Ghebremicael</i>
    * @see                  java.text.DateFormat
    * @see                  java.text.SimpleDateFormat
    * @see                  java.util.Date
    * Date                  4/24/2023
    * History Log   
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void setDate()
    {
        //create an object
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date now = new Date(); // get current date in milliseconds since1/1/1970
        //set title in the title bar of the form
        this.setTitle("Gini's QUilts Works" );
        // displays date in the dateJTextField of the form
        dateJTextField.setText(dateFormat.format(now));
    } 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headingJLabel = new javax.swing.JLabel();
        invoceJLabel = new javax.swing.JLabel();
        invoiceJFormattedTextField = new javax.swing.JFormattedTextField();
        dateJLabel = new javax.swing.JLabel();
        dateJTextField = new javax.swing.JTextField();
        nameJLabel = new javax.swing.JLabel();
        quiltsJPanel = new javax.swing.JPanel();
        quiltJLabel = new javax.swing.JLabel();
        quantityJLabel = new javax.swing.JLabel();
        priceJLabel = new javax.swing.JLabel();
        ExtendedPriceJLabel = new javax.swing.JLabel();
        quilt1JLabel = new javax.swing.JLabel();
        quilt1JSpinner = new javax.swing.JSpinner();
        q1PriceJLabel = new javax.swing.JLabel();
        q1ExtendedPriceJLabel = new javax.swing.JLabel();
        quilt2JLabel = new javax.swing.JLabel();
        quilt2JSpinner = new javax.swing.JSpinner();
        q2PriceJLabel = new javax.swing.JLabel();
        q2ExtendedPriceJLabel = new javax.swing.JLabel();
        quilt3JLabel = new javax.swing.JLabel();
        quilt3JSpinner = new javax.swing.JSpinner();
        q3PriceJLabel = new javax.swing.JLabel();
        q3ExtendedPriceJLabel = new javax.swing.JLabel();
        controlJPanel = new javax.swing.JPanel();
        calculateJButton = new javax.swing.JButton();
        clearJButton = new javax.swing.JButton();
        quitJButton = new javax.swing.JButton();
        totalJPanel = new javax.swing.JPanel();
        subTotalJLabel = new javax.swing.JLabel();
        subtotalOutputJLabel = new javax.swing.JLabel();
        taxJLabel = new javax.swing.JLabel();
        taxOutputJLabel = new javax.swing.JLabel();
        totalJLabel = new javax.swing.JLabel();
        totalOutputJLabel = new javax.swing.JLabel();
        customerJComboBox = new javax.swing.JComboBox<>();
        quiltJMenuBar = new javax.swing.JMenuBar();
        fileJMenu = new javax.swing.JMenu();
        ClearJMenuItem = new javax.swing.JMenuItem();
        printJMenuItem = new javax.swing.JMenuItem();
        quitJMenuItem = new javax.swing.JMenuItem();
        helpJMenu = new javax.swing.JMenu();
        aboutJMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 204));

        headingJLabel.setBackground(new java.awt.Color(255, 255, 255));
        headingJLabel.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        headingJLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        headingJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project1/antiquiQuilt.jpg"))); // NOI18N
        headingJLabel.setText("  Gini's Quilts Works");

        invoceJLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        invoceJLabel.setText("Invoice Number:");
        invoceJLabel.setFocusable(false);

        try {
            invoiceJFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        invoiceJFormattedTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        invoiceJFormattedTextField.setToolTipText("Maximum 4 digits Invoice Number");
        invoiceJFormattedTextField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        dateJLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dateJLabel.setText("Date:");
        dateJLabel.setFocusable(false);

        dateJTextField.setEditable(false);
        dateJTextField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        nameJLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nameJLabel.setText("Customer Name:");

        quiltsJPanel.setBackground(new java.awt.Color(255, 255, 204));
        quiltsJPanel.setLayout(new java.awt.GridLayout(4, 4, 3, 3));

        quiltJLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        quiltJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quiltJLabel.setText("   Quilt");
        quiltsJPanel.add(quiltJLabel);

        quantityJLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        quantityJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quantityJLabel.setText("  Quantity");
        quiltsJPanel.add(quantityJLabel);

        priceJLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        priceJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        priceJLabel.setText("Price");
        quiltsJPanel.add(priceJLabel);

        ExtendedPriceJLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ExtendedPriceJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ExtendedPriceJLabel.setText("Extended Price");
        quiltsJPanel.add(ExtendedPriceJLabel);

        quilt1JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quilt1JLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project1/patternQuilt.jpg"))); // NOI18N
        quilt1JLabel.setToolTipText("Shinning Star, queen size, $950, quantity 6");
        quilt1JLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        quilt1JLabel.setMaximumSize(new java.awt.Dimension(2, 2));
        quilt1JLabel.setMinimumSize(new java.awt.Dimension(2, 2));
        quilt1JLabel.setPreferredSize(new java.awt.Dimension(2, 1));
        quiltsJPanel.add(quilt1JLabel);

        quilt1JSpinner.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        quilt1JSpinner.setModel(new javax.swing.SpinnerNumberModel(Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)6), Byte.valueOf((byte)1)));
        quilt1JSpinner.setToolTipText("maximum 10 quilts");
        quilt1JSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                quilt1JSpinnerStateChanged(evt);
            }
        });
        quiltsJPanel.add(quilt1JSpinner);

        q1PriceJLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        q1PriceJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q1PriceJLabel.setText("$850");
        quiltsJPanel.add(q1PriceJLabel);

        q1ExtendedPriceJLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        q1ExtendedPriceJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quiltsJPanel.add(q1ExtendedPriceJLabel);

        quilt2JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quilt2JLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project1/threadtilesQuilt.jpg"))); // NOI18N
        quilt2JLabel.setToolTipText("Kat Soup, queen size, $480, quantity 10");
        quilt2JLabel.setMaximumSize(new java.awt.Dimension(100, 73));
        quilt2JLabel.setMinimumSize(new java.awt.Dimension(100, 72));
        quiltsJPanel.add(quilt2JLabel);

        quilt2JSpinner.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        quilt2JSpinner.setModel(new javax.swing.SpinnerNumberModel(Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)10), Byte.valueOf((byte)1)));
        quilt2JSpinner.setToolTipText("maimum 6 quilts");
        quilt2JSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                quilt2JSpinnerStateChanged(evt);
            }
        });
        quiltsJPanel.add(quilt2JSpinner);

        q2PriceJLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        q2PriceJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q2PriceJLabel.setText("$450");
        quiltsJPanel.add(q2PriceJLabel);

        q2ExtendedPriceJLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        q2ExtendedPriceJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quiltsJPanel.add(q2ExtendedPriceJLabel);

        quilt3JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quilt3JLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project1/coloredQuilt.jpg"))); // NOI18N
        quilt3JLabel.setToolTipText("Birch Trees, single size, $315, quantity 3");
        quiltsJPanel.add(quilt3JLabel);

        quilt3JSpinner.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        quilt3JSpinner.setModel(new javax.swing.SpinnerNumberModel(Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)3), Byte.valueOf((byte)1)));
        quilt3JSpinner.setToolTipText("maximum 3 quilts");
        quilt3JSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                quilt3JSpinnerStateChanged(evt);
            }
        });
        quiltsJPanel.add(quilt3JSpinner);

        q3PriceJLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        q3PriceJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q3PriceJLabel.setText("$315");
        quiltsJPanel.add(q3PriceJLabel);

        q3ExtendedPriceJLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        q3ExtendedPriceJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quiltsJPanel.add(q3ExtendedPriceJLabel);

        controlJPanel.setBackground(new java.awt.Color(255, 255, 204));
        controlJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        calculateJButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        calculateJButton.setMnemonic('C');
        calculateJButton.setText("Calculate");
        calculateJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateJButtonActionPerformed(evt);
            }
        });
        controlJPanel.add(calculateJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 200, 40));

        clearJButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        clearJButton.setMnemonic('r');
        clearJButton.setText("Clear");
        clearJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearJButtonActionPerformed(evt);
            }
        });
        controlJPanel.add(clearJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 90, 40));

        quitJButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        quitJButton.setMnemonic('Q');
        quitJButton.setText("Quit");
        quitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitJButtonActionPerformed(evt);
            }
        });
        controlJPanel.add(quitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 90, 40));

        totalJPanel.setBackground(new java.awt.Color(255, 255, 204));
        totalJPanel.setLayout(new java.awt.GridLayout(3, 2, 3, 3));

        subTotalJLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        subTotalJLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        subTotalJLabel.setText("Subtotal:");
        totalJPanel.add(subTotalJLabel);

        subtotalOutputJLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        subtotalOutputJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalJPanel.add(subtotalOutputJLabel);

        taxJLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        taxJLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        taxJLabel.setText("        Tax:");
        totalJPanel.add(taxJLabel);

        taxOutputJLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        taxOutputJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalJPanel.add(taxOutputJLabel);

        totalJLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        totalJLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        totalJLabel.setText("     Total:");
        totalJPanel.add(totalJLabel);

        totalOutputJLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        totalOutputJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalJPanel.add(totalOutputJLabel);

        customerJComboBox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        customerJComboBox.setToolTipText("Customer Name");

        fileJMenu.setText("File");
        fileJMenu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        ClearJMenuItem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ClearJMenuItem.setMnemonic('C');
        ClearJMenuItem.setText("Clear");
        ClearJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearJMenuItemActionPerformed(evt);
            }
        });
        fileJMenu.add(ClearJMenuItem);

        printJMenuItem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        printJMenuItem.setMnemonic('P');
        printJMenuItem.setText("Print");
        printJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printJMenuItemActionPerformed(evt);
            }
        });
        fileJMenu.add(printJMenuItem);

        quitJMenuItem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        quitJMenuItem.setMnemonic('Q');
        quitJMenuItem.setText("Quit");
        quitJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitJMenuItemActionPerformed(evt);
            }
        });
        fileJMenu.add(quitJMenuItem);

        quiltJMenuBar.add(fileJMenu);

        helpJMenu.setText("Help");
        helpJMenu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        aboutJMenuItem.setMnemonic('A');
        aboutJMenuItem.setText("About");
        aboutJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutJMenuItemActionPerformed(evt);
            }
        });
        helpJMenu.add(aboutJMenuItem);

        quiltJMenuBar.add(helpJMenu);

        setJMenuBar(quiltJMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(controlJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(totalJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(invoceJLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(invoiceJFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(133, 133, 133)
                                .addComponent(dateJLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dateJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(nameJLabel)
                                .addGap(18, 18, 18)
                                .addComponent(customerJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(quiltsJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(headingJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headingJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(invoiceJFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(invoceJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nameJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(customerJComboBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(quiltsJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(controlJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                    .addComponent(totalJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    * Method               printJMenuItemActionPerformed()
    * Description          Print form as a GUI using PrintUtilities helper class.
    * Date                 4/25/2023
    * @author              <i>Minassie Ghebremicael</i>
    * @param               evt java.awt.event.ActionEvent
    * @see                 java.awt.event.ActionEvent
    * History Log   
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void printJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printJMenuItemActionPerformed
        // makes printing available by calling the printComponent()
        PrintInvoice.printComponent(this);
    }//GEN-LAST:event_printJMenuItemActionPerformed
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    * Method               quitJButtonActionPerformed()
    * Description          Quits the application.
    * Date                 4/24/2023
    * @author              <i>Minassie Ghebremicael</i>
    * @param               evt java.awt.event.ActionEvent
    * @see                 java.awt.event.ActionEvent
    * History Log   
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void quitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitJButtonActionPerformed
        // exits the form
        System.exit(0);
    }//GEN-LAST:event_quitJButtonActionPerformed
     /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    * Method               clearJButtonActionPerformed()
    * Description          Clears the form and resets it to its original state.
    * Date                 4/25/2023
    * @author              <i>Minassie Ghebremicael</i>
    * @param               evt java.awt.event.ActionEvent
    * @see 		   java.text.DecimalFormat
    * History Log   
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void clearJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearJButtonActionPerformed
      
      // clear all the text field to reset the form
      invoiceJFormattedTextField.setText("");
      dateJTextField.setText("");
      //sets the JSpinners to zero
      quilt1JSpinner.setValue(0);
      quilt2JSpinner.setValue(0);
      quilt3JSpinner.setValue(0);
      // puts the cursor in the invoiceJFormattedTextField
      invoiceJFormattedTextField.requestFocus();
    }//GEN-LAST:event_clearJButtonActionPerformed
     /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    * Method               quitJMenuItemActionPerformed()
    * Description          Quit the application by calling 
    *                      quitJButtonActionPerformed the
    *                      event handler.
    * Date                 4/24/2023
    * @author              <i>Minassie Ghebremicael</i>
    * @param               evt java.awt.event.ActionEvent
    * @see                 java.awt.event.ActionEvent
    * History Log   
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/ 
    private void quitJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitJMenuItemActionPerformed
        // quits the form
        quitJButtonActionPerformed(evt);
    }//GEN-LAST:event_quitJMenuItemActionPerformed
      /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    * Method               clearJMenuItemActionPerformed()
    * Description          Clears the form and resets it to its original 
    *                      state by calling clearJMenuItemActionPerformed 
    *                      event handler.
    * Date                 4/25/2023
    * @author              <i>Minassie Ghebremicael</i>
    * @param               evt java.awt.event.ActionEvent
    * @see 		   java.text.DecimalFormat
    * History Log   
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void ClearJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearJMenuItemActionPerformed
        // clear the text field and set the JSpinner to zero
        clearJButtonActionPerformed(evt);
    }//GEN-LAST:event_ClearJMenuItemActionPerformed
     /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    * Method               calculateJButtonActionPerformed()
    * Description          Calculates quilt costs total, Tax, and subTotal.
    *                      Instantiate variables invoice,shinningStarOrder,
    *                      kitSoup, birchTrees, idString,subTotal, tax and total
    *                      is passed to the QuitPrice constructor to
    *                      create quiltItems object upon which the 
    *                      calculateSubTotal(),calculateTotal(),
    *                      calculateTax() is invoked.Handles customer name and 
    *                      invoice error. 
    * Date                 4/25/2023
    * @author              <i>Minassie Ghebremicael</i>
    * @param               evt java.swing.event.ActionEvent
    * @see 		   java.swing.event.ActionEvent
    * History Log   
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void calculateJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateJButtonActionPerformed
 try
       {
         // declartion of variables
         byte invoice = 0;
         byte shinningStarOrder = 0, katSuopOrder = 0, birchTreesOrder = 0;
         String idString = "";
         double subTotal = 0,tax = 0, total= 0;
            
         // read input from GUI invoice number and customer name
         idString = invoiceJFormattedTextField.getText();
         String selectedString = customerJComboBox.getSelectedItem().toString();
         
         if(idString.length() != 3 && selectedString.isEmpty())
           throw new NumberFormatException();
         shinningStarOrder = Byte.parseByte(quilt1JSpinner.getValue().toString());
         katSuopOrder = Byte.parseByte(quilt2JSpinner.getValue().toString());
         birchTreesOrder = Byte.parseByte(quilt3JSpinner.getValue().toString());

         //instantiate a QuiltsPrice Object with parameters
         QuiltsPrice quiltItems = new QuiltsPrice(invoice,
                 shinningStarOrder,katSuopOrder,
                 birchTreesOrder);
         
         // generates the subtotal, tax and total of quilts 
         subTotal = quiltItems.calculateSubTotal();
         total = quiltItems.calculateTotal();
         tax = quiltItems.calculateTax();
         
         // sets the subtotal, total,and tax with corresponding price
         subtotalOutputJLabel.setText(dollars.format(subTotal));
         taxOutputJLabel.setText(dollars.format( tax));
         totalOutputJLabel.setText(dollars.format( total));
      
       }
       // catches invoice number 4 digit error and no customer name
       catch(NumberFormatException nexp)
        {
           JOptionPane.showMessageDialog(this,
                   "ERROR:Please enter 4 digit invoice number or select a "
                           + "customer name ");
          // set the focus for invoice number
           invoiceJFormattedTextField.requestFocus();
           invoiceJFormattedTextField.selectAll();
           
        }
    }//GEN-LAST:event_calculateJButtonActionPerformed
     /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    * Method               aboutJMenuItemActionPerformed()
    * Description          Creates and shows the about form.
    * Date                 4/24/2023
    * @author              <i>Minassie Ghebremicael</i>
    * @param               evt java.swing.event.ActionEvent
    * @see 		   java.swing.event.ActionEvent
    * History Log   
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void aboutJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutJMenuItemActionPerformed
        //Show the About Form
        About myAbout = new About(this,false );
        myAbout.setVisible(true);
    }//GEN-LAST:event_aboutJMenuItemActionPerformed
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    * Method           quilt1JSpinnerStateChanged()
    * Description      Calculates the extended price shinning Star quilt by getting
    *                  the value of the JSpinner value multiply with the
    *                  quilt price(constant).Sets the price in
    *                  extendedPriceJLabel and zero in the total,subtotal,and tax
    * Date             4/25/2023
    * @author          <i>Minassie Ghebremicael</i>
    * @param           evt javax.swing.event.ChangeEvent
    * @see             java.swing.event.ActionEvent
    * History Log   
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void quilt1JSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_quilt1JSpinnerStateChanged
         // decares variable
         Byte quiltValue;
         double extendedPrice1;
         //get the value and calculates it
         quiltValue = Byte.parseByte(quilt1JSpinner.getValue().toString()); 
         extendedPrice1 = quiltValue * SHINNING_STAR;
         //sets the price for extendedPriceJLabel and makes zero total,subtotal tax 
         q1ExtendedPriceJLabel.setText(dollars.format(extendedPrice1));
         totalOutputJLabel.setText(dollars.format(0));
         taxOutputJLabel.setText(dollars.format(0));
         subtotalOutputJLabel.setText(dollars.format(0));
         
         
    }//GEN-LAST:event_quilt1JSpinnerStateChanged
     /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    * Method           quilt2JSpinnerStateChanged()
    * Description      Calculates the extended price Kat Soup quilt  by getting
    *                  the value of the JSpinner value multiply with the
    *                  quilt price(constant).Sets the price in
    *                  extendedPriceJLabel and zero in the total,subtotal,and tax
    * Date             4/25/2023
    * @author          <i>Minassie Ghebremicael</i>
    * @param           evt javax.swing.event.ChangeEvent
    * @see             java.swing.event.ActionEvent
    * History Log   
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void quilt2JSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_quilt2JSpinnerStateChanged
        
          // decares variable
         Byte quilt2Value;
         double extendedPrice2;
         //get the value and calculates it
         quilt2Value = Byte.parseByte(quilt2JSpinner.getValue().toString()); 
         extendedPrice2 = quilt2Value * KAT_SOUP;
         //sets the price for extendedPriceJLabel and makes zero total,subtotal tax 
         q2ExtendedPriceJLabel.setText(dollars.format(extendedPrice2));
         totalOutputJLabel.setText(dollars.format(0));
         taxOutputJLabel.setText(dollars.format(0));
         subtotalOutputJLabel.setText(dollars.format(0));
    }//GEN-LAST:event_quilt2JSpinnerStateChanged
      /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    * Method           quilt3JSpinnerStateChanged()
    * Description      Calculates the extended price BIrch Trees quilt by getting
    *                  the value of the JSpinner value multiply with the
    *                  quilt price(constant).Sets the price in
    *                  extendedPriceJLabel and zero in the total,subtotal,and tax
    * Date             4/25/2023
    * @author          <i>Minassie Ghebremicael</i>
    * @param           evt javax.swing.event.ChangeEvent
    * @see             java.swing.event.ActionEvent
    * History Log   
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void quilt3JSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_quilt3JSpinnerStateChanged
        
         // decares variable
         Byte quilt3Value;
         double extendedPrice3;
         //get the value and calculates it
         quilt3Value = Byte.parseByte(quilt3JSpinner.getValue().toString()); 
         extendedPrice3 = quilt3Value * BIRCH_TREES;
         //sets the price for extendedPriceJLabel and makes zero total,subtotal tax 
         q3ExtendedPriceJLabel.setText(dollars.format(extendedPrice3));
         totalOutputJLabel.setText(dollars.format(0));
         taxOutputJLabel.setText(dollars.format(0));
         subtotalOutputJLabel.setText(dollars.format(0));
    }//GEN-LAST:event_quilt3JSpinnerStateChanged

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    * Method            main()
    * Description       Invoke default constructor to create quilt charges
    *                   form and displays it.
    * @author           <i>Minassie Ghebremicael</i>
    * @param            args are the command line Strings
    * Date              4/25/2023
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuiltProductsGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ClearJMenuItem;
    private javax.swing.JLabel ExtendedPriceJLabel;
    private javax.swing.JMenuItem aboutJMenuItem;
    private javax.swing.JButton calculateJButton;
    private javax.swing.JButton clearJButton;
    private javax.swing.JPanel controlJPanel;
    private javax.swing.JComboBox<String> customerJComboBox;
    private javax.swing.JLabel dateJLabel;
    private javax.swing.JTextField dateJTextField;
    private javax.swing.JMenu fileJMenu;
    private javax.swing.JLabel headingJLabel;
    private javax.swing.JMenu helpJMenu;
    private javax.swing.JLabel invoceJLabel;
    private javax.swing.JFormattedTextField invoiceJFormattedTextField;
    private javax.swing.JLabel nameJLabel;
    private javax.swing.JLabel priceJLabel;
    private javax.swing.JMenuItem printJMenuItem;
    private javax.swing.JLabel q1ExtendedPriceJLabel;
    private javax.swing.JLabel q1PriceJLabel;
    private javax.swing.JLabel q2ExtendedPriceJLabel;
    private javax.swing.JLabel q2PriceJLabel;
    private javax.swing.JLabel q3ExtendedPriceJLabel;
    private javax.swing.JLabel q3PriceJLabel;
    private javax.swing.JLabel quantityJLabel;
    private javax.swing.JLabel quilt1JLabel;
    private javax.swing.JSpinner quilt1JSpinner;
    private javax.swing.JLabel quilt2JLabel;
    private javax.swing.JSpinner quilt2JSpinner;
    private javax.swing.JLabel quilt3JLabel;
    private javax.swing.JSpinner quilt3JSpinner;
    private javax.swing.JLabel quiltJLabel;
    private javax.swing.JMenuBar quiltJMenuBar;
    private javax.swing.JPanel quiltsJPanel;
    private javax.swing.JButton quitJButton;
    private javax.swing.JMenuItem quitJMenuItem;
    private javax.swing.JLabel subTotalJLabel;
    private javax.swing.JLabel subtotalOutputJLabel;
    private javax.swing.JLabel taxJLabel;
    private javax.swing.JLabel taxOutputJLabel;
    private javax.swing.JLabel totalJLabel;
    private javax.swing.JPanel totalJPanel;
    private javax.swing.JLabel totalOutputJLabel;
    // End of variables declaration//GEN-END:variables
}
