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
            this.quiz = new String[11][6];
            
            quiz[0][0] = "Question1: Which Disney character famously leaves a glass slipper behind at a royal ball?";
            quiz[0][1] = "1.Pocahontas";
            quiz[0][2] = "2.Sleeping Beauty";
            quiz[0][3] = "3.Cinderella";
            quiz[0][4] = "4.Elsa";
            quiz[0][5] = "3";

            quiz[1][0] = "Question2: Obstetrics is a branch of medicine particularly concerned with what?";
            quiz[1][1] = "1.Childbirth";
            quiz[1][2] = "2.Broken bones";
            quiz[1][3] = "3.Heart conditions";
            quiz[1][4] = "4.Old age";
            quiz[1][5] = "1";

            quiz[2][0] = "Question3: 1 million - In 1718, which pirate died in battle off the coast of what is now North Carolina?";;
            quiz[2][1] = "1.Calico Jack";
            quiz[2][2] = "2.Blackbeard";
            quiz[2][3] = "3.Bartholomew Roberts";
            quiz[2][4] = "4.Captain Kidd";
            quiz[2][5] = "2";

            quiz[3][0] = "Question4: Which toys have been marketed with the phrase “robots in disguise?";
            quiz[3][1] = "1.Bratz Dolls";
            quiz[3][2] = "2.Sylvanian Families";
            quiz[3][3] = "3.Hatchimals";
            quiz[3][4] = "4.Transformers";
            quiz[3][5] = "4";

            quiz[4][0] = "Question5: The hammer and sickle is one of the most recognisable symbols of which political ideology?";
            quiz[4][1] = "1.Republicanism";
            quiz[4][2] = "2.Communism";
            quiz[4][3] = "3.Conservatism";
            quiz[4][4] = "4.Liberalism";
            quiz[4][5] = "2";
            
            quiz[5][0] = "Question6: What does the word loquacious mean?";
            quiz[5][1] = "1.Angry";
            quiz[5][2] = "2.Chatty";
            quiz[5][3] = "3.Beautiful";
            quiz[5][4] = "4.Shy";
            quiz[5][5] = "2";
            
            quiz[6][0] = "Question7: In Doctor Who, what was the signature look of the fourth Doctor, as portrayed by Tom Baker?";
            quiz[6][1] = "1.Bow-tie, braces and tweed jacket";
            quiz[6][2] = "2.Wide-brimmed hat and extra long scarf";
            quiz[6][3] = "3.Pinstripe suit and trainers";
            quiz[6][4] = "4.Cape, velvet jacket and frilly shirt";
            quiz[6][5] = "2";
            
            quiz[7][0] = "Question8: Which of these religious observances lasts for the shortest period of time during the calendar year?";
            quiz[7][1] = "1.Ramadan";
            quiz[7][2] = "2.Lent";
            quiz[7][3] = "3.Diwali";
            quiz[7][4] = "4.Hanukkah";
            quiz[7][5] = "3";
            
            quiz[8][0] = "Question9: Construction of which of these famous landmarks was completed first?";
            quiz[8][1] = "1.Empire State Building";
            quiz[8][2] = "2.Royal Albert Hall";
            quiz[8][3] = "3.Eiffel Tower";
            quiz[8][4] = "4.Big Ben Clock Tower";
            quiz[8][5] = "4";
            
            quiz[9][0] = "Question10: Which of these cetaceans is classified as a “toothed whale”?";
            quiz[9][1] = "1.Sperm whale";
            quiz[9][2] = "2.Gray whale";
            quiz[9][3] = "3.Minke whale";
            quiz[9][4] = "4.Humpback whale";
            quiz[9][5] = "1";
            
           
        }
    
        public String[][] getQuiz(){
            return this.quiz;
        }
        
        
}



