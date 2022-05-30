/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desing_assignmnet2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Puttipat
 */
public class GenerateQuestionTest {
    
    public GenerateQuestionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getQuiz method, of class GenerateQuestion.
     */
    @Test
    public void testGetQuiz() {
        System.out.println("getQuiz");
        GenerateQuestion instance = new GenerateQuestion();
        String[][] expResult = new String[11][6];
        
        String[][] result = instance.getQuiz();
        
        expResult[0][0] = "Question1: Which Disney character famously leaves a glass slipper behind at a royal ball?";
        expResult[0][1] = "1.Pocahontas";
        expResult[0][2] = "2.Sleeping Beauty";
        expResult[0][3] = "3.Cinderella";
        expResult[0][4] = "4.Elsa";
        expResult[0][5] = "3";

        expResult[1][0] = "Question2: Obstetrics is a branch of medicine particularly concerned with what?";
        expResult[1][1] = "1.Childbirth";
        expResult[1][2] = "2.Broken bones";
        expResult[1][3] = "3.Heart conditions";
        expResult[1][4] = "4.Old age";
        expResult[1][5] = "1";

        expResult[2][0] = "Question3: 1 million - In 1718, which pirate died in battle off the coast of what is now North Carolina?";;
        expResult[2][1] = "1.Calico Jack";
        expResult[2][2] = "2.Blackbeard";
        expResult[2][3] = "3.Bartholomew Roberts";
        expResult[2][4] = "4.Captain Kidd";
        expResult[2][5] = "2";

        expResult[3][0] = "Question4: Which toys have been marketed with the phrase “robots in disguise?";
        expResult[3][1] = "1.Bratz Dolls";
        expResult[3][2] = "2.Sylvanian Families";
        expResult[3][3] = "3.Hatchimals";
        expResult[3][4] = "4.Transformers";
        expResult[3][5] = "4";

        expResult[4][0] = "Question5: The hammer and sickle is one of the most recognisable symbols of which political ideology?";
        expResult[4][1] = "1.Republicanism";
        expResult[4][2] = "2.Communism";
        expResult[4][3] = "3.Conservatism";
        expResult[4][4] = "4.Liberalism";
        expResult[4][5] = "2";
            
        expResult[5][0] = "Question6: What does the word loquacious mean?";
        expResult[5][1] = "1.Angry";
        expResult[5][2] = "2.Chatty";
        expResult[5][3] = "3.Beautiful";
        expResult[5][4] = "4.Shy";
        expResult[5][5] = "2";
            
        expResult[6][0] = "Question7: In Doctor Who, what was the signature look of the fourth Doctor, as portrayed by Tom Baker?";
        expResult[6][1] = "1.Bow-tie, braces and tweed jacket";
        expResult[6][2] = "2.Wide-brimmed hat and extra long scarf";
        expResult[6][3] = "3.Pinstripe suit and trainers";
        expResult[6][4] = "4.Cape, velvet jacket and frilly shirt";
        expResult[6][5] = "2";
            
        expResult[7][0] = "Question8: Which of these religious observances lasts for the shortest period of time during the calendar year?";
        expResult[7][1] = "1.Ramadan";
        expResult[7][2] = "2.Lent";
        expResult[7][3] = "3.Diwali";
        expResult[7][4] = "4.Hanukkah";
        expResult[7][5] = "3";
            
        expResult[8][0] = "Question9: Construction of which of these famous landmarks was completed first?";
        expResult[8][1] = "1.Empire State Building";
        expResult[8][2] = "2.Royal Albert Hall";
        expResult[8][3] = "3.Eiffel Tower";
        expResult[8][4] = "4.Big Ben Clock Tower";
        expResult[8][5] = "4";
            
        expResult[9][0] = "Question10: Which of these cetaceans is classified as a “toothed whale”?";
        expResult[9][1] = "1.Sperm whale";
        expResult[9][2] = "2.Gray whale";
        expResult[9][3] = "3.Minke whale";
        expResult[9][4] = "4.Humpback whale";
        expResult[9][5] = "1";
        
        assertArrayEquals(expResult, result);
    }
    
}
