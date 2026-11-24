package org.example;

import java.util.Iterator;

public class Student {
    private String CID;
    private double Prog;

    private int totalGrade;
    public Student(String CID){
        this.CID = CID;
    }

    public void setCID(String CID) {
        this.CID = CID;
    }

    public boolean isAIreliant(String CID){
        if ((AssessmentFeed.getResult(CID,"Independent Programming Test","Program Mark")<(AssessmentFeed.getResult(CID,"Independent Programmin","Program Mark") + 20))){
            return true;
        }
        else return false;

    }
    public void totalMark(String CID) {
        if (AssessmentFeed.getStudentType(CID).equals("Msc")) {
            double[] Weighting = {0.25, 0.45, 0.3};

        }
        if (AssessmentFeed.getStudentType(CID).equals("UG")) {
            double[] Weighting = {0.3, 0.7, 0};

        }

    }
    public double totalGradeProg(String CID){
        if (AssessmentFeed.getResult(CID,"Independent Programming Test","Explained successfully") == (1)){
             double Prog = (AssessmentFeed.getResult(CID,"Independent Programming Test","Program Mark"));

        }else {
            Prog = 40.0;}

        return Prog;



    }
    public double totalGradeAI(String CID){

        return (Math.abs(AssessmentFeed.getResult(CID,"AI-Assisted Programming Project","Functionality mark")+
                (AssessmentFeed.getResult(CID,"AI-Assisted Programming Project","Verification Mark")/2)));


    }



}





