import java.util.Scanner;

public class StudentAnalyzer {

    /**
     * this method taking the input from the user
     * 
     * @return
     */
    public Student[] acceptStudentDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Student : ");
        int noOfStudent = sc.nextInt();
        int n = noOfStudent;
        Student studList[] = new Student[n];

        for (int i = 0; i < n; i++) {
            Student stud = new Student();
            System.out.println("Enter the " + (i + 1) + " Name : ");
            String name = sc.next();
            stud.setStudentName(name);
            int rollNo = (i + 1);
            stud.setStudentRollNo(rollNo);
            System.out.println("Math Marks : ");
            double mathMarks = sc.nextDouble();
            stud.setMathMarks(mathMarks);
            System.out.println("Science Marks : ");
            double sciMarks = sc.nextDouble();
            stud.setSciMarks(sciMarks);
            System.out.println("English Marks : ");
            double engMarks = sc.nextDouble();
            stud.setEngMarks(engMarks);
            System.out.println("Language Marks : ");
            double langMarks = sc.nextDouble();
            stud.setLangMarks(langMarks);
            System.out.println("Social Science Marks : ");
            double socialMarks = sc.nextDouble();
            stud.setSocialMarks(socialMarks);

            studList[i] = stud;

        }
        return studList;

    }

    public double[] calculateTotalMarks(Student[] studList) {
        double[] totalMarks = new double[studList.length];
        for (int i = 0; i < studList.length; i++) {
            totalMarks[i] = studList[i].getMathMarks() + studList[i].getSciMarks() + studList[i].getEngMarks()
                    + studList[i].getLangMarks() + studList[i].getSocialMarks();
        }
        return totalMarks;
    }

    public double[] calculateAvgMarks(double[] totalMarks) {
        double[] avgMarks = new double[totalMarks.length];
        for (int i = 0; i < totalMarks.length; i++) {
            avgMarks[i] = totalMarks[i] / 5;
        }
        return avgMarks;
    }

    public String[] calculateGrade(double[] avgMarks) {
        String[] gradeMarks = new String[avgMarks.length];
        for (int i = 0; i < avgMarks.length; i++) {
            if (avgMarks[i] >= 90) {
                gradeMarks[i] = "A";
            } else if (avgMarks[i] >= 80 && avgMarks[i] < 90) {
                gradeMarks[i] = "B";
            } else if (avgMarks[i] >= 70 && avgMarks[i] < 80) {
                gradeMarks[i] = "C";
            } else if (avgMarks[i] >= 60 && avgMarks[i] < 70) {
                gradeMarks[i] = "D";
            } else if (avgMarks[i] >= 50 && avgMarks[i] < 60) {
                gradeMarks[i] = "E";
            } else {
                gradeMarks[i] = "F";
            }
        }
        return gradeMarks;
    }

    public void displayScoreCard(Student[] studList) {

        double[] totalMarks = calculateTotalMarks(studList);
        double[] avgMarks = calculateAvgMarks(totalMarks);
        String[] gradeMarks = calculateGrade(avgMarks);
        System.out.println("            <<<<<<<<<<<<<<<<<<<<<<<< SCORE CARD >>>>>>>>>>>>>>>>>>>>>>>>>>          ");
        System.out.format("\n%s\t%4s\t%12s\t%12s\t%12s\t%12s\t%12s\t%12s\t%10s\t%10s\n", "Roll Number", "Name", "Math",
                "Science", "English", "Language ", "Social Science", "Total Marks", "Average Marks", "Grade");

        for (int i = 0; i < studList.length; i++) {
            System.out.format("%d\t%13s\t%13.1f\t%13.1f\t%13.1f\t%13.1f\t%13.1f\t%13.1f\t%13.1f\t%13s\n", // \t%13.1f\t%13.1f\t%6s
                    studList[i].getStudentRollNo(), studList[i].getStudentName(), studList[i].getMathMarks(),
                    studList[i].getSciMarks(), studList[i].getEngMarks(), studList[i].getLangMarks(),
                    studList[i].getSocialMarks(), totalMarks[i], avgMarks[i], gradeMarks[i]);
        }

    }

}
