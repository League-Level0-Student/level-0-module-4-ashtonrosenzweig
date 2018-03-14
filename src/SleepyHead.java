//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        int isWeekday, isVacation;
        
        
        isWeekday = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "",JOptionPane.YES_NO_OPTION);
        isVacation = JOptionPane.showConfirmDialog(null, "Is it a vacation?", "",JOptionPane.YES_NO_OPTION);
        if(isWeekday == 1) {JOptionPane.showMessageDialog(null, "Sleep in!");}else {if(isVacation == 0) {JOptionPane.showMessageDialog(null, "Sleep in!");}
    


        /*
         * Print â€œsleep inâ€� if it is a vacation or a weekend. If itâ€™s a weekday,
         * print â€œget up lazybones!â€� If it is a weekday, and we are on vacation,
         * print â€œsleep inâ€�.
         */
    }
}
