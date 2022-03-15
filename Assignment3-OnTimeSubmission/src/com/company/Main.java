package com.company;

import javax.swing.*;           //For use of JOptionPane
import java.util.ArrayList;     //For use of ArrayLists

public class Main {

    public static void main(String[] args) {

        //Create an arraylist of Friend objects
        ArrayList<Friend> guests = new ArrayList<Friend>();

        //Welcome/instructions message
        JOptionPane.showMessageDialog(null, "Welcome to the Party Picker.\n\nEnter " +
                "person's name and the type of food they're likely to bring,\n" +
                "then indicate whether they are actually invited to the party or not.");

        //Loop to allow the user to continue entering guests as long as they wish
        do {
            //Use a separate Input dialog to get each user input (names, food)
            String first = JOptionPane.showInputDialog(null, "Enter first name", "Party Picker", JOptionPane.QUESTION_MESSAGE);
            String last = JOptionPane.showInputDialog(null, "Enter last name", "Party Picker", JOptionPane.QUESTION_MESSAGE);
            String food = JOptionPane.showInputDialog(null, "Enter the food they usually bring", "Party Picker", JOptionPane.QUESTION_MESSAGE);

            //Use an Option dialog to show custom Invited/Not buttons
            boolean invited = false;
            Object[] choices = {"Invited", "Not Invited"};
            int result = JOptionPane.showOptionDialog(null, "Choose if this guested is Invited or Not Invited", "Party Picker",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, choices, choices[0]);

            //If user clicked Invited, set boolean flag to true
            if (result == 0) {
                invited = true;
            }
            //Create a new Friend object, passing all user values to its constructor, and add to arraylist
            guests.add(new Friend(first, last, invited, food));
            //Use a Confirm dialog to see if the user wants to enter another guest. Continue if yes (0), otherwise, stop looping
        } while (JOptionPane.showConfirmDialog(null, "Enter another guest?", "Party Picker", JOptionPane.YES_NO_OPTION) == 0);

        //Build a string for the final report
        String report = "Guests:\n";

        //Build count to final report
        double invitedTotal = 0;
        double notInvited = 0;

        //For-each loop to iterate through each Friend in arraylist, call its toString() method and add it to the final report string and isInvited to count the number of invited
        for (Friend currFriend : guests) {
            report += "\n" + currFriend.toString();
            if (currFriend.isInvited()){
                invitedTotal ++;
            } else {
                notInvited ++;
            }
        }

        // Financial invited report
        String financialReport = "Total Guests are: " + guests.size() +
                "\n-" + (int)invitedTotal + " invited.\n" +
                "-" + (int)notInvited + " not invited.\n" +
                "-Total Expenses: $" + (invitedTotal * 99.99) +
                "\n-Total Earned: $" + (notInvited * 399.99) +
                "\n-Gross Profit: $" + ((notInvited * 399.99) - (invitedTotal * 99.99)) +
                "\n-Done By: Matt Champion";

        //Print the final report in a Message dialog.
        JOptionPane.showMessageDialog(null, "\n" + report + "\n -------------------------------------------------------------- \n" + financialReport);
    }
}
