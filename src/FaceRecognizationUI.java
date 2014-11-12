
import java.util.Calendar;
import static java.util.Calendar.*;
import java.util.Date;
import java.util.GregorianCalendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fuyun
 */
public class FaceRecognizationUI extends javax.swing.JFrame {

    GregorianCalendar gc=new GregorianCalendar(); 
    int totdays; 
    /**
     * Creates new form FaceRecognizationUI
     */
    public FaceRecognizationUI() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        jComboBox6 = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        year1 = new javax.swing.JComboBox();
        month1 = new javax.swing.JComboBox();
        month2 = new javax.swing.JComboBox();
        day1 = new javax.swing.JComboBox();
        day2 = new javax.swing.JComboBox();
        year2 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        Category = new javax.swing.JPanel();
        CategoryLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        CategoryList = new javax.swing.JList();
        Gender = new javax.swing.JPanel();
        GenderLabel = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        GenderList = new javax.swing.JList();
        Result = new javax.swing.JPanel();
        ResultLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ResultText = new javax.swing.JTextPane();
        buttons = new javax.swing.JPanel();
        search = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabel2.setText("From");

        year1.setModel(new javax.swing.DefaultComboBoxModel(new Integer[] { 2014, 2013, 2012, 2011, 2010, 2009, 2008, 2007, 2006, 2005, 2004, 2003, 2002, 2001, 2000 }));
        year1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                year1ActionPerformed(evt);
            }
        });

        month1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "January", "Feburary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        month2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "January", "Feburary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        day1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        day2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        day2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                day2ActionPerformed(evt);
            }
        });

        year2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000" }));
        year2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                year2ActionPerformed(evt);
            }
        });

        jLabel1.setText("To");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(year2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(year1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(month1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(day1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(month2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(day2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(291, 291, 291))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(year1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(month1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(day1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(year2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(month2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(day2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = -266;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(40, 30, 0, 0);
        getContentPane().add(jPanel1, gridBagConstraints);

        CategoryLabel.setText("Category");

        CategoryList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "stapler", "tuition fees", "complaints", "collect assignments", "meet people" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(CategoryList);

        javax.swing.GroupLayout CategoryLayout = new javax.swing.GroupLayout(Category);
        Category.setLayout(CategoryLayout);
        CategoryLayout.setHorizontalGroup(
            CategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CategoryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CategoryLayout.createSequentialGroup()
                        .addComponent(CategoryLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
                .addContainerGap())
        );
        CategoryLayout.setVerticalGroup(
            CategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CategoryLayout.createSequentialGroup()
                .addComponent(CategoryLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 82;
        gridBagConstraints.ipady = -5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(22, 27, 0, 0);
        getContentPane().add(Category, gridBagConstraints);

        GenderLabel.setText("Gender");

        GenderList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Male", "Female" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(GenderList);

        javax.swing.GroupLayout GenderLayout = new javax.swing.GroupLayout(Gender);
        Gender.setLayout(GenderLayout);
        GenderLayout.setHorizontalGroup(
            GenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GenderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(GenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GenderLabel)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        GenderLayout.setVerticalGroup(
            GenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GenderLayout.createSequentialGroup()
                .addComponent(GenderLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(24, 13, 227, 0);
        getContentPane().add(Gender, gridBagConstraints);

        ResultLabel.setText("Result");

        jScrollPane3.setViewportView(ResultText);

        javax.swing.GroupLayout ResultLayout = new javax.swing.GroupLayout(Result);
        Result.setLayout(ResultLayout);
        ResultLayout.setHorizontalGroup(
            ResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ResultLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ResultLabel)
                .addContainerGap(204, Short.MAX_VALUE))
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        ResultLayout.setVerticalGroup(
            ResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ResultLayout.createSequentialGroup()
                .addComponent(ResultLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 198;
        gridBagConstraints.ipady = 144;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(22, 10, 0, 0);
        getContentPane().add(Result, gridBagConstraints);

        buttons.setLayout(new java.awt.GridBagLayout());

        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 40, 0, 35);
        buttons.add(search, gridBagConstraints);

        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 40, 14, 35);
        buttons.add(clear, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 80;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 36, 0, 15);
        getContentPane().add(buttons, gridBagConstraints);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void year1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_year1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_year1ActionPerformed

    private void day2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_day2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_day2ActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        Database db = new Database();
        Calendar date1 = Calendar.getInstance();
        date1.set(YEAR, (int)year1.getSelectedItem());
        date1.set(MONTH, (int)month1.getSelectedItem());
        date1.set(DATE, (int)day1.getSelectedItem());
        Calendar date2 = Calendar.getInstance();
        date2.set(YEAR, (int)year2.getSelectedItem());
        date2.set(MONTH, (int)month2.getSelectedItem());
        date2.set(DATE, (int)day2.getSelectedItem());
        ResultText.setText("The frequency is" +db.getFrequency(date1, date2,(String)CategoryList.getSelectedValue(), (String)GenderList.getSelectedValue()));
    }//GEN-LAST:event_searchActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearActionPerformed

    private void year2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_year2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_year2ActionPerformed

    private void setVal(Date date,int iday,int iselMonth,int iselYear) 
{ 
gc.setTime(date); 
if(iselMonth==0 || iselMonth==2 || iselMonth==4 || iselMonth==6 || iselMonth== 7 ||iselMonth==9 || iselMonth==11) 
{ 
totdays=31; 
setButtons(iday,totdays); 
} 

if(iselMonth==3 || iselMonth==5 || iselMonth==8 || iselMonth==10) 
{ 
totdays=30; 
setButtons(iday,totdays); 
} 

if(gc.isLeapYear(iselYear) && iselMonth==1) 
{ 
totdays=29; 
setButtons(iday,totdays); 
} 
if( !gc.isLeapYear(iselYear) && iselMonth==1) 
{ 
totdays=28; 
setButtons(iday,totdays); 
} 

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
            java.util.logging.Logger.getLogger(FaceRecognizationUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FaceRecognizationUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FaceRecognizationUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FaceRecognizationUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FaceRecognizationUI().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Category;
    private javax.swing.JLabel CategoryLabel;
    private javax.swing.JList CategoryList;
    private javax.swing.JPanel Gender;
    private javax.swing.JLabel GenderLabel;
    private javax.swing.JList GenderList;
    private javax.swing.JPanel Result;
    private javax.swing.JLabel ResultLabel;
    private javax.swing.JTextPane ResultText;
    private javax.swing.JPanel buttons;
    private javax.swing.JButton clear;
    private javax.swing.JComboBox day1;
    private javax.swing.JComboBox day2;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JComboBox month1;
    private javax.swing.JComboBox month2;
    private javax.swing.JButton search;
    private javax.swing.JComboBox year1;
    private javax.swing.JComboBox year2;
    // End of variables declaration//GEN-END:variables
}