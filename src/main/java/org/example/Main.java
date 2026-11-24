package org.example;


import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.example.AssessmentFeed.AI_PROJECT;

import static org.example.AssessmentFeed.isAIreliant;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    String[] IDs = AssessmentFeed.getCIDs().toArray(new String[0]);
    Student student1 = new Student((IDs[0]));
    Student student2 = new Student((IDs[1]));
    Student student3 = new Student((IDs[2]));
    Student student4 = new Student((IDs[3]));

    public static void main(String[] args){



        JFrame frame = new JFrame("Title");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 900);

        JPanel mainPanel = new JPanel(new GridLayout(4, 6, 2, 2));
        String[] IDs = AssessmentFeed.getCIDs().toArray(new String[0]);
        Map<String, JLabel> labels = new LinkedHashMap<>();
        for (String i : IDs) {
            System.out.println(i);
            JPanel cell = new JPanel(new GridLayout(1, 6));
            cell.setBorder(BorderFactory.createTitledBorder("StudentInfo"));



            JLabel text = new JLabel("--", SwingConstants.CENTER);
            labels.put(i, text);
            cell.add(text);
            mainPanel.add(cell);
            labels.get(i).setText(String.format(
                    "<html><right>Name : %s <br> CID : %s <br> Type : %s <br> Independent Programming Test  : %s  <br>AI Assisted Programming Test :  %s <br> Software Design Viva :  %s <br>",
                    i,
                    AssessmentFeed.getStudentName(i),
                    AssessmentFeed.getStudentType(i),
                    AssessmentFeed.getResult(i,"Independent Programming Test","Program mark"),
                    AssessmentFeed.getResult(i,"AI-Assisted Programming Project","Functionality mark"),
                    AssessmentFeed.getResult(i,"AI-Assisted Programming Project","Functionality mark")

                    ));

        }


        frame.add(mainPanel);
        frame.setVisible(true);

    }

}
