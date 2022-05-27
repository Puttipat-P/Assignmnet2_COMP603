/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desing_assignmnet2;

/**
 *
 * @author Puttipat
 */

public class GenerateQuestion {
    
        String[][] quiz;
        
        public GenerateQuestion(){
            this.quiz = new String[10][6];
            
            quiz[0][0] = "Question1";
            quiz[0][1] = "Choice 1";
            quiz[0][2] = "button 2";
            quiz[0][3] = "button 3";
            quiz[0][4] = "button 4";
            quiz[0][5] = "1";

            quiz[1][0] = "Question2";
            quiz[1][1] = "Choice 1";
            quiz[1][2] = "button 2";
            quiz[1][3] = "button 3";
            quiz[1][4] = "button 4";
            quiz[1][5] = "2";

            quiz[2][0] = "Question3";
            quiz[2][1] = "Choice 1";
            quiz[2][2] = "button 2";
            quiz[2][3] = "button 3";
            quiz[2][4] = "button 4";
            quiz[2][5] = "3";

            quiz[3][0] = "Question4";
            quiz[3][1] = "Choice 1";
            quiz[3][2] = "button 2";
            quiz[3][3] = "button 3";
            quiz[3][4] = "button 4";
            quiz[3][5] = "4";

            quiz[4][0] = "Question5";
            quiz[4][1] = "Choice 1";
            quiz[4][2] = "button 2";
            quiz[4][3] = "button 3";
            quiz[4][4] = "button 4";
            quiz[4][5] = "5";
        }
    
        public String[][] getQuiz(){
            return this.quiz;
        }
        
        
}



