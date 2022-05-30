/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desing_assignmnet2;

import java.awt.Color;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Puttipat
 */
public class Game extends javax.swing.JFrame {

    String[][] quiz;
    int question = 0;
    int score = 0;
    int life = 3;
    int skip = 1;
    
    public Game() {
        initComponents();
        generateQuestion();
        update();
        
        setExtendedState(JFrame.MAXIMIZED_HORIZ);
        setVisible(true);
        setResizable(false);
        
    }
    
    public void update(){
       
     
        QuestionsTextField.setText(quiz[question][0]);
        QuestionsTextField.setEditable(false);
        
        lifeLabel.setText("You have "+life+" 50/50 left");
        skipLabel.setText("You have "+skip+" skip left");
        ansButton1.setText(quiz[question][1]);
        ansButton2.setText(quiz[question][2]);
        ansButton3.setText(quiz[question][3]);
        ansButton4.setText(quiz[question][4]);
        
        
        
        if(score == 1){
          scoreLabel1.setBackground(Color.GREEN);
          scoreLabel1.setOpaque(true);
        }
        if(score == 2){
          scoreLabel2.setBackground(Color.GREEN);
          scoreLabel2.setOpaque(true);
        }
        if(score == 3){
          scoreLabel3.setBackground(Color.GREEN);
          scoreLabel3.setOpaque(true);
        }
        if(score == 4){
          scoreLabel4.setBackground(Color.GREEN);
          scoreLabel4.setOpaque(true);
        }
        if(score == 5){
          scoreLabel5.setBackground(Color.GREEN);
          scoreLabel5.setOpaque(true);
        }
        if(score == 6){
          scoreLabel6.setBackground(Color.GREEN);
          scoreLabel6.setOpaque(true);
        }
        if(score == 7){
          scoreLabel7.setBackground(Color.GREEN);
          scoreLabel7.setOpaque(true);
        }
        if(score == 8){
          scoreLabel8.setBackground(Color.GREEN);
          scoreLabel8.setOpaque(true);
        }
        if(score == 9){
          scoreLabel9.setBackground(Color.GREEN);
          scoreLabel9.setOpaque(true);
        }
        if(score == 10){
          scoreLabel10.setBackground(Color.GREEN);
          scoreLabel10.setOpaque(true);
        }
        
        
        
        
        if (question >= 10)
        {
        QuizEnd quizend= new QuizEnd(this);
        quizend.setVisible(true);
        
       
        
        }
        
    }
    
    public void generateQuestion(){
        this.quiz = new GenerateQuestion().getQuiz();
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
        ansButton1 = new javax.swing.JButton();
        ansButton2 = new javax.swing.JButton();
        ansButton3 = new javax.swing.JButton();
        ansButton4 = new javax.swing.JButton();
        skipButton = new javax.swing.JButton();
        lifeButton = new javax.swing.JButton();
        scoreLabel1 = new javax.swing.JLabel();
        scoreLabel2 = new javax.swing.JLabel();
        scoreLabel3 = new javax.swing.JLabel();
        scoreLabel4 = new javax.swing.JLabel();
        scoreLabel5 = new javax.swing.JLabel();
        scoreLabel6 = new javax.swing.JLabel();
        scoreLabel7 = new javax.swing.JLabel();
        scoreLabel8 = new javax.swing.JLabel();
        scoreLabel9 = new javax.swing.JLabel();
        scoreLabel10 = new javax.swing.JLabel();
        skipLabel = new javax.swing.JLabel();
        lifeLabel = new javax.swing.JLabel();
        QuestionsTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        scoreLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scoreLabel1.setText("100,000");
        scoreLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        scoreLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scoreLabel2.setText("200,000");
        scoreLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        scoreLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scoreLabel3.setText("300,000");
        scoreLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        scoreLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scoreLabel4.setText("400,000");
        scoreLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        scoreLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scoreLabel5.setText("500,000");
        scoreLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        scoreLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scoreLabel6.setText("600,000");
        scoreLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        scoreLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scoreLabel7.setText("700,000");
        scoreLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        scoreLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scoreLabel8.setText("800,000");
        scoreLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        scoreLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scoreLabel9.setText("900,000");
        scoreLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        scoreLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scoreLabel10.setText("1,000,000");
        scoreLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        skipLabel.setText("jLabel3");

        lifeLabel.setText("jLabel4");

        QuestionsTextField.setText("jTextField1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ansButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                                    .addComponent(ansButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ansButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ansButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(81, 81, 81)
                                    .addComponent(skipLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lifeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(109, 109, 109)
                                    .addComponent(skipButton)
                                    .addGap(305, 305, 305)
                                    .addComponent(lifeButton)
                                    .addGap(63, 63, 63))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(QuestionsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scoreLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scoreLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scoreLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scoreLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scoreLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scoreLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scoreLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scoreLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scoreLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scoreLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(scoreLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(scoreLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scoreLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(QuestionsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scoreLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scoreLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(skipLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(skipButton)
                                .addGap(6, 6, 6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lifeLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lifeButton)
                                .addGap(4, 4, 4)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(scoreLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(scoreLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scoreLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scoreLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scoreLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ansButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ansButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ansButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ansButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ansButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ansButton1ActionPerformed
        // TODO add your handling code here:
        if(quiz[question][5]=="1") { 
            
            JOptionPane.showMessageDialog(null,"Correct","Message",JOptionPane.INFORMATION_MESSAGE);
            
            score++;
        } else if(quiz[question][5]!="1") {
            JOptionPane.showMessageDialog(null,"Wrong","Message",JOptionPane.INFORMATION_MESSAGE);
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
         JOptionPane.showMessageDialog(null,"Correct","Message",JOptionPane.INFORMATION_MESSAGE);
            
            score++;
        } else if(quiz[question][5]!="2") {
            JOptionPane.showMessageDialog(null,"Wrong","Message",JOptionPane.INFORMATION_MESSAGE);
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
            JOptionPane.showMessageDialog(null,"Correct","Message",JOptionPane.INFORMATION_MESSAGE);
            
            score++;
        } else if(quiz[question][5]!="3") {
            JOptionPane.showMessageDialog(null,"Wrong","Message",JOptionPane.INFORMATION_MESSAGE);
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
            JOptionPane.showMessageDialog(null,"Correct","Message",JOptionPane.INFORMATION_MESSAGE);
            
            score++;
        } else if(quiz[question][5]!="4") {
            JOptionPane.showMessageDialog(null,"Wrong","Message",JOptionPane.INFORMATION_MESSAGE);
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
        
        
       
        update();
        
        
       
    }//GEN-LAST:event_lifeButtonActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField QuestionsTextField;
    private javax.swing.JButton ansButton1;
    private javax.swing.JButton ansButton2;
    private javax.swing.JButton ansButton3;
    private javax.swing.JButton ansButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton lifeButton;
    private javax.swing.JLabel lifeLabel;
    private javax.swing.JLabel scoreLabel1;
    private javax.swing.JLabel scoreLabel10;
    private javax.swing.JLabel scoreLabel2;
    private javax.swing.JLabel scoreLabel3;
    private javax.swing.JLabel scoreLabel4;
    private javax.swing.JLabel scoreLabel5;
    private javax.swing.JLabel scoreLabel6;
    private javax.swing.JLabel scoreLabel7;
    private javax.swing.JLabel scoreLabel8;
    private javax.swing.JLabel scoreLabel9;
    private javax.swing.JButton skipButton;
    private javax.swing.JLabel skipLabel;
    // End of variables declaration//GEN-END:variables
}
