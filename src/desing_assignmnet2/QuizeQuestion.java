/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desing_assignmnet2;

import java.awt.Color;

/**
 *
 * @author Puttipat
 */
public class QuizeQuestion extends javax.swing.JFrame {

    String[][] quiz = new String[10][6];
    int question = 0;
    int score = 0;
    int life = 3;
    int skip = 1;
    GenerateQuestion generateQuestion = new GenerateQuestion();
    
    public QuizeQuestion() {
        initComponents();
        generateQuestion();
        update();
    }
    
    public void update(){
        jLabel1.setText(quiz[question][0]);
        ansButton1.setText(quiz[question][1]);
        ansButton2.setText(quiz[question][2]);
        ansButton3.setText(quiz[question][3]);
        ansButton4.setText(quiz[question][4]);
        
        
    }
    
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ansButton1 = new javax.swing.JButton();
        ansButton2 = new javax.swing.JButton();
        ansButton3 = new javax.swing.JButton();
        ansButton4 = new javax.swing.JButton();
        skipButton = new javax.swing.JButton();
        lifeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("jLabel1");

        ansButton1.setText("jButton1");
        ansButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ansButton1ActionPerformed(evt);
            }
        });

        ansButton2.setText("jButton2");
        ansButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ansButton2ActionPerformed(evt);
            }
        });

        ansButton3.setText("jButton3");
        ansButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ansButton3ActionPerformed(evt);
            }
        });

        ansButton4.setText("jButton4");
        ansButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ansButton4ActionPerformed(evt);
            }
        });

        skipButton.setText("Skip");
        skipButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skipButtonActionPerformed(evt);
            }
        });

        lifeButton.setText("50/50");
        lifeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lifeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ansButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                            .addComponent(ansButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ansButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ansButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(73, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(skipButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lifeButton)
                .addGap(276, 276, 276))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(skipButton)
                    .addComponent(lifeButton))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ansButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ansButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ansButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ansButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ansButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ansButton1ActionPerformed
        // TODO add your handling code here:
        if(quiz[question][5]=="1") {
            ansButton1.setBackground(Color.GREEN);
            score++;
        } 
        ansButton1.setEnabled(true);
        ansButton2.setEnabled(true);
        ansButton3.setEnabled(true);
        ansButton4.setEnabled(true);
        
        
        if(life>0){
            lifeButton.setEnabled(true);
        }
       
        
        
        question++;
        update();
    }//GEN-LAST:event_ansButton1ActionPerformed

    private void ansButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ansButton2ActionPerformed
        // TODO add your handling code here:
         if(quiz[question][5]=="2") {
            score++;
        }
        ansButton1.setEnabled(true);
        ansButton2.setEnabled(true);
        ansButton3.setEnabled(true);
        ansButton4.setEnabled(true);
        
        
        if(life>0){
            lifeButton.setEnabled(true);
        }
        
        question++;
        update();
    }//GEN-LAST:event_ansButton2ActionPerformed

    private void ansButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ansButton3ActionPerformed
        // TODO add your handling code here:
         if(quiz[question][5]=="3") {
            score++;
        }
        ansButton1.setEnabled(true);
        ansButton2.setEnabled(true);
        ansButton3.setEnabled(true);
        ansButton4.setEnabled(true);
       
        
        if(life>0){
            lifeButton.setEnabled(true);
        }
        
        question++;
        update();
    }//GEN-LAST:event_ansButton3ActionPerformed

    private void ansButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ansButton4ActionPerformed
        // TODO add your handling code here:
         if(quiz[question][5]=="4") {
            score++;
        }
        ansButton1.setEnabled(true);
        ansButton2.setEnabled(true);
        ansButton3.setEnabled(true);
        ansButton4.setEnabled(true);
        
        
        if(life>0){
            lifeButton.setEnabled(true);
        }
        
        question++;
        update();
    }//GEN-LAST:event_ansButton4ActionPerformed

    private void skipButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skipButtonActionPerformed
        // TODO add your handling code here:
        skip--;
        
        if(skip == 0){
            skipButton.setEnabled(false);
        }
        question++;
        score--;
        update();
    }//GEN-LAST:event_skipButtonActionPerformed

    private void lifeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lifeButtonActionPerformed
        // TODO add your handling code here:
        
        if(life >= 1){
                    life--;

        if(quiz[question][5]=="1" && quiz[question][5]!="2" && quiz[question][5]!="3" && quiz[question][5]!="4" ) {
           
            ansButton3.setEnabled(false);
            ansButton4.setEnabled(false);
            lifeButton.setEnabled(false);
            
            
        }else if(quiz[question][5]!="1" && quiz[question][5]=="2" && quiz[question][5]!="3" && quiz[question][5]!="4" ) {
           
            ansButton1.setEnabled(false);
            ansButton3.setEnabled(false);
            lifeButton.setEnabled(false);
        }else if(quiz[question][5]!="1" && quiz[question][5]!="2" && quiz[question][5]=="3" && quiz[question][5]!="4" ) {
           
            ansButton2.setEnabled(false);
            ansButton4.setEnabled(false);
            lifeButton.setEnabled(false);
        }else if(quiz[question][5]!="1" && quiz[question][5]!="2" && quiz[question][5]!="3" && quiz[question][5]=="4" ) {
           
            ansButton2.setEnabled(false);
            ansButton3.setEnabled(false);
            lifeButton.setEnabled(false);
        }
        }else if(life == 0){
            lifeButton.setEnabled(false);
        }
        
        
        score--;
        update();
        
       
    }//GEN-LAST:event_lifeButtonActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ansButton1;
    private javax.swing.JButton ansButton2;
    private javax.swing.JButton ansButton3;
    private javax.swing.JButton ansButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton lifeButton;
    private javax.swing.JButton skipButton;
    // End of variables declaration//GEN-END:variables
}