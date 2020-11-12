public class StudentImpl {

    public static void main(String[] args) {
        StudentAnalyzer studentAnalyzer = new StudentAnalyzer();
        Student[] studList = studentAnalyzer.acceptStudentDetails();
        studentAnalyzer.displayScoreCard(studList);
    }
}
