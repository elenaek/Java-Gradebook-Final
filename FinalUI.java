package javaapplication2;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Keane
 */
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import java.io.*;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
public class FinalUI extends javax.swing.JFrame {

    /**
     * Creates new form FinalUI
     */
    
    private ArrayList<Grades> gradesList = new ArrayList();
    private DefaultListModel defaultModel = new DefaultListModel();
    private FileNameExtensionFilter filter = new FileNameExtensionFilter("Text Files","txt");
    private static boolean keyPressOne = false;
    private static boolean keyPressTwo = false;
    private static boolean keyPressThree = false;
    private static boolean keyPressFour = false;
    private static boolean keyPressFive = false;
    

    public FinalUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fcSave = new javax.swing.JFileChooser();
        txtName = new javax.swing.JTextField();
        txtQuizOne = new javax.swing.JTextField();
        txtQuizTwo = new javax.swing.JTextField();
        txtMidterm = new javax.swing.JTextField();
        txtFinalExam = new javax.swing.JTextField();
        btnDisplay = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        lblQuizOne = new javax.swing.JLabel();
        lblQuizTwo = new javax.swing.JLabel();
        lblMidterm = new javax.swing.JLabel();
        lblFinalExam = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstStudents = new javax.swing.JList(defaultModel);
        btnSave = new javax.swing.JButton();
        mnubarOne = new javax.swing.JMenuBar();
        mnuFile = new javax.swing.JMenu();
        mnuitmSave = new javax.swing.JMenuItem();
        mnuHelp = new javax.swing.JMenu();
        mnuitmInstructions = new javax.swing.JMenuItem();
        mnuitmBored = new javax.swing.JMenuItem();

        fcSave.setFileFilter(filter);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Grading Program");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        txtName.setText("Enter name of student.");
        txtName.setToolTipText("Enter the name of the Student.");
        txtName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNameMouseClicked(evt);
            }
        });
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNameKeyPressed(evt);
            }
        });

        txtQuizOne.setText("Enter score for Quiz One.");
        txtQuizOne.setToolTipText("Enter score for Quiz One.");
        txtQuizOne.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtQuizOneMouseClicked(evt);
            }
        });
        txtQuizOne.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtQuizOneKeyPressed(evt);
            }
        });

        txtQuizTwo.setText("Enter score for Quiz Two.");
        txtQuizTwo.setToolTipText("Enter score for Quiz Two.");
        txtQuizTwo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtQuizTwoMouseClicked(evt);
            }
        });
        txtQuizTwo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtQuizTwoKeyPressed(evt);
            }
        });

        txtMidterm.setText("Enter score for Midterm.");
        txtMidterm.setToolTipText("Enter score for Midterm.");
        txtMidterm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtMidtermMouseClicked(evt);
            }
        });
        txtMidterm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMidtermKeyPressed(evt);
            }
        });

        txtFinalExam.setText("Enter score for Final Exam.");
        txtFinalExam.setToolTipText("Enter score for Final Exam.");
        txtFinalExam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFinalExamMouseClicked(evt);
            }
        });
        txtFinalExam.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFinalExamKeyPressed(evt);
            }
        });

        btnDisplay.setText("Display Student Grade");
        btnDisplay.setToolTipText("Display the selected student's grade.");
        btnDisplay.setEnabled(false);
        btnDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayActionPerformed(evt);
            }
        });

        btnAdd.setText("Add");
        btnAdd.setToolTipText("Add the records to the list.");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        lblName.setText("Student's Name:");

        lblQuizOne.setText("Quiz One(0-10):");

        lblQuizTwo.setText("Quiz Two(0-10):");

        lblMidterm.setText("Midterm(0-100):");

        lblFinalExam.setText("Final Exam(0-100):");

        btnClear.setText("Clear");
        btnClear.setToolTipText("Clear all text fields.");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        lstStudents.setModel(defaultModel);
        lstStudents.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstStudentsValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(lstStudents);

        btnSave.setText("Save");
        btnSave.setToolTipText("Save all records on the list into a text file.");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        mnuFile.setText("File");

        mnuitmSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        mnuitmSave.setText("Save As");
        mnuitmSave.setEnabled(false);
        mnuitmSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuitmSaveActionPerformed(evt);
            }
        });
        mnuFile.add(mnuitmSave);

        mnubarOne.add(mnuFile);

        mnuHelp.setText("Help");

        mnuitmInstructions.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        mnuitmInstructions.setText("Instructions");
        mnuitmInstructions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuitmInstructionsActionPerformed(evt);
            }
        });
        mnuHelp.add(mnuitmInstructions);

        mnuitmBored.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        mnuitmBored.setText("Bored?");
        mnuitmBored.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuitmBoredActionPerformed(evt);
            }
        });
        mnuHelp.add(mnuitmBored);

        mnubarOne.add(mnuHelp);

        setJMenuBar(mnubarOne);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(lblName)
                                                .addComponent(lblQuizOne, javax.swing.GroupLayout.Alignment.LEADING))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(lblMidterm, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lblQuizTwo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGap(26, 26, 26))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblFinalExam)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFinalExam, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMidterm, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtQuizTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtQuizOne, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDisplay))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblQuizOne, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtQuizOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblQuizTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtQuizTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMidterm, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMidterm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFinalExam, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFinalExam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd)
                            .addComponent(btnClear))
                        .addGap(70, 70, 70)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNameMouseClicked
      txtName.requestFocus();
      txtName.setText("");
    }//GEN-LAST:event_txtNameMouseClicked

    private void txtQuizOneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtQuizOneMouseClicked
      txtQuizOne.requestFocus();
      txtQuizOne.setText("");
    }//GEN-LAST:event_txtQuizOneMouseClicked

    private void txtQuizTwoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtQuizTwoMouseClicked
      txtQuizTwo.requestFocus();
      txtQuizTwo.setText("");
    }//GEN-LAST:event_txtQuizTwoMouseClicked

    private void txtMidtermMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMidtermMouseClicked
      txtMidterm.requestFocus();
      txtMidterm.setText("");       
    }//GEN-LAST:event_txtMidtermMouseClicked

    private void txtFinalExamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFinalExamMouseClicked
      txtFinalExam.requestFocus();
      txtFinalExam.setText("");
    }//GEN-LAST:event_txtFinalExamMouseClicked

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
     txtName.setText("");
     txtQuizOne.setText("");
     txtQuizTwo.setText("");
     txtMidterm.setText("");
     txtFinalExam.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void txtNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyPressed
        if (keyPressOne == false)
        {
         txtName.requestFocus();
         txtName.setText("");
         keyPressOne = true;
        }
    }//GEN-LAST:event_txtNameKeyPressed

    private void txtQuizOneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuizOneKeyPressed
        if (keyPressTwo == false)
        {
         txtQuizOne.requestFocus();
         txtQuizOne.setText("");
         keyPressTwo = true;  
        }
    }//GEN-LAST:event_txtQuizOneKeyPressed

    private void txtQuizTwoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuizTwoKeyPressed
        if (keyPressThree == false)
        {
         txtQuizTwo.requestFocus();
         txtQuizTwo.setText("");
         keyPressThree = true;  
        }
    }//GEN-LAST:event_txtQuizTwoKeyPressed

    private void txtMidtermKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMidtermKeyPressed
        if (keyPressFour == false)
        {
         txtMidterm.requestFocus();
         txtMidterm.setText("");
         keyPressFour = true;  
        }
    }//GEN-LAST:event_txtMidtermKeyPressed

    private void txtFinalExamKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFinalExamKeyPressed
       if (keyPressFive == false)
        {
         txtFinalExam.requestFocus();
         txtFinalExam.setText("");
         keyPressFive = true;  
        }
    }//GEN-LAST:event_txtFinalExamKeyPressed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
     double q1 = -1.0;
     double q2 = -1.0;
     double mt = -1.0;
     double fe = -1.0;
     String name = txtName.getText();
     try{
      q1 = Double.parseDouble(txtQuizOne.getText());
      q2 = Double.parseDouble(txtQuizTwo.getText());
      mt = Double.parseDouble(txtMidterm.getText());
      fe = Double.parseDouble(txtFinalExam.getText());
     }
     catch(Exception er)
     {
       JOptionPane.showMessageDialog(null, "You must input valid numbers in the score boxes.","Invalid Input Value",JOptionPane.ERROR_MESSAGE);
     }
     
     
     if (q1 < 0.0 || q1 > 10.0)
     {
      JOptionPane.showMessageDialog(null, "Quiz One input must be within the range of 0 - 10!","Invalid Input Value",JOptionPane.ERROR_MESSAGE);
     }
     else if (q2 < 0.0 || q2 > 10.0)
     {
      JOptionPane.showMessageDialog(null, "Quiz Two input must be within the range of 0 - 10!","Invalid Input Value",JOptionPane.ERROR_MESSAGE);
     }
     else if (mt < 0.0 || mt > 100.0)
     {
      JOptionPane.showMessageDialog(null, "Midterm input must be within the range of 0 - 100!","Invalid Input Value",JOptionPane.ERROR_MESSAGE);
     }
     else if (fe < 0.0 || fe > 100.0)
     {
      JOptionPane.showMessageDialog(null, "Final Exam input must be within the range of 0 - 100!","Invalid Input Value",JOptionPane.ERROR_MESSAGE);
     }
     else if (name.equals(""))
     {
         JOptionPane.showMessageDialog(null, "You must input a valid name or title in the name input box.","Invalid Input Value",JOptionPane.ERROR_MESSAGE);
     }
     else
     {
     Grades a = new Grades(q1 ,q2 ,mt, fe , txtName.getText());
     gradesList.add(a);
     defaultModel.addElement(a.getName());
     btnSave.setEnabled(true);
     mnuitmSave.setEnabled(true);
     btnClear.doClick(1);
     txtName.requestFocus();
     }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayActionPerformed
     int a = lstStudents.getSelectedIndex();
     String title = gradesList.get(a).getName() + "'s Grade Sheet";
     String output = "Student Name: " + gradesList.get(a).getName() + "\n" + gradesList.get(a).getName() + "'s Grade Percentage: " + gradesList.get(a).getTotalScore("p")+
             "% " + "\n" + gradesList.get(a).getName() + "'s Total Score is : " + (int)gradesList.get(a).getTotalScore() + "\n" + gradesList.get(a).getName() + "'s Letter Grade: " + gradesList.get(a).getLetterGrade()+
             "\n" + gradesList.get(a).getName() + "'s assignments scores: " + "\n" + "----------------------------------------------------------------------------------" +
             "\n" + "Quiz One: " + (int)gradesList.get(a).getQuizOne() + "/" + "10 : " + gradesList.get(a).getQuizOne("p") + "%" + " Weighted Percentage: " + gradesList.get(a).getQuizOne("w") + "%" +
             "\n" + "Quiz Two: " + (int)gradesList.get(a).getQuizTwo() + "/" + "10 : " + gradesList.get(a).getQuizTwo("p")+ "%" + " Weighted Percentage: " + gradesList.get(a).getQuizTwo("w") + "%" +
             "\n" + "Midterm: " + (int)gradesList.get(a).getMidterm() + "/" + "100 : " + gradesList.get(a).getMidterm("p") + "%" + " Weighted Percentage: " + gradesList.get(a).getMidterm("w") + "%" +
             "\n" + "Final Exam: " + (int)gradesList.get(a).getFinalExam() + "/" + "100 : " + gradesList.get(a).getFinalExam("p") + "%" + " Weighted Percentage: " + gradesList.get(a).getFinalExam("w") + "%" +
             "\n" + "----------------------------------------------------------------------------------";
     JOptionPane.showMessageDialog(null, output,title,JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_btnDisplayActionPerformed

    private void mnuitmInstructionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuitmInstructionsActionPerformed
   
     String instructions = "Step 1: Input all the values in the text fields." + "\n" + "Step 2: Click the Add button to add the Student and their scores to the list on the right." +
             "\n" + "Step 3: To display a student's grade sheet, click on their name on the list and then click the Display Student Grade button.";
     JOptionPane.showMessageDialog(null, instructions, "How to use Grading Program",JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_mnuitmInstructionsActionPerformed

    private void mnuitmBoredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuitmBoredActionPerformed
        JokesFrame e = new JokesFrame();
        e.pack();
        e.setLocationRelativeTo(null);
        e.show();
    }//GEN-LAST:event_mnuitmBoredActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
      PrintStream output = selectTextFile();
      if (output!= null)
      {
          for(int x = 0; x < gradesList.size(); x++)
          {
          output.println("_____________________________________________________________________________________________________");
          output.println("_____________________________________________________________________________________________________");
          output.println("Student Name: " + gradesList.get(x).getName());
          output.println(gradesList.get(x).getName() + "'s Grade Percentage: " + gradesList.get(x).getTotalScore("p") + "%");
          output.println(gradesList.get(x).getName() + "'s Total Score is : " + (int)gradesList.get(x).getTotalScore());
          output.println(gradesList.get(x).getName() + "'s Letter Grade: " + gradesList.get(x).getLetterGrade());
          output.println(gradesList.get(x).getName() + "'s Assignment scores: ");
          output.println("------------------------------------------------------------------------------------------------------");
          output.println("Quiz One: " + (int)gradesList.get(x).getQuizOne() + "/" + "10 : " + gradesList.get(x).getQuizOne("p") + "%" + " Weighted Percentage: " + gradesList.get(x).getQuizOne("w") + "%" + "|");
          output.println("Quiz Two: " + (int)gradesList.get(x).getQuizTwo() + "/" + "10 : " + gradesList.get(x).getQuizTwo("p") + "%" + " Weighted Percentage: " + gradesList.get(x).getQuizTwo("w") + "%" + "|");
          output.println("Midterm: " + (int)gradesList.get(x).getMidterm() + "/" + "100 : " + gradesList.get(x).getMidterm("p") + "%" + " Weighted Percentage: " + gradesList.get(x).getMidterm("w") + "%" + "|");
          output.println("Final Exam: " + (int)gradesList.get(x).getFinalExam() + "/" + "100 : " + gradesList.get(x).getFinalExam("p") + "%" + " Weighted Percentage: " + gradesList.get(x).getFinalExam("w") + "%" + "|");
          }
      }
      output.println("_____________________________________________________________________________________________________");
      output.println("_____________________________________________________________________________________________________");
      output.println();
      output.println();
      output.println("            The class average is : " + getClassAverage(gradesList, gradesList.size()) + "                                 ");
      output.close();
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void mnuitmSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuitmSaveActionPerformed
      btnSave.doClick();
    }//GEN-LAST:event_mnuitmSaveActionPerformed

    private void lstStudentsValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstStudentsValueChanged
       if (lstStudents.getSelectedIndex() >= 0)
       {
           btnDisplay.setEnabled(true);
       }
       else
       {
           btnDisplay.setEnabled(false);
       }
    }//GEN-LAST:event_lstStudentsValueChanged

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
     this.getRootPane().setDefaultButton(btnAdd);
    }//GEN-LAST:event_formWindowActivated
    
    public void keyPressClear()
    {
        
        
    }

    private double getClassAverage(ArrayList<Grades> a, double size)
    {
        for(int x=0 ; x < size; x++)
        {
            double runningTotal = 0;
            runningTotal += a.get(x).getTotalScore("p");
            return runningTotal/size;
        }
        return 0.0;
    }
    
    private PrintStream selectTextFile()
    {
      do{
       int option = fcSave.showSaveDialog(this);
        try{
            if (option == JFileChooser.APPROVE_OPTION)
            {
                return new PrintStream(fcSave.getSelectedFile() + ".txt");
            }
            else
            {
                return null;
            }
        }
        catch(FileNotFoundException er)
        {
            JOptionPane.showMessageDialog(null,"File is invalid.","Invalid File", JOptionPane.ERROR_MESSAGE);
        }
      } while(true);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FinalUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FinalUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FinalUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FinalUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FinalUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDisplay;
    private javax.swing.JButton btnSave;
    private javax.swing.JFileChooser fcSave;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblFinalExam;
    private javax.swing.JLabel lblMidterm;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblQuizOne;
    private javax.swing.JLabel lblQuizTwo;
    private javax.swing.JList lstStudents;
    private javax.swing.JMenu mnuFile;
    private javax.swing.JMenu mnuHelp;
    private javax.swing.JMenuBar mnubarOne;
    private javax.swing.JMenuItem mnuitmBored;
    private javax.swing.JMenuItem mnuitmInstructions;
    private javax.swing.JMenuItem mnuitmSave;
    private javax.swing.JTextField txtFinalExam;
    private javax.swing.JTextField txtMidterm;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtQuizOne;
    private javax.swing.JTextField txtQuizTwo;
    // End of variables declaration//GEN-END:variables
}
