public class CollegeData {
    int Year;
    String Name;
    int Score;
    int Semester;
    String CollegeName;
    String Branch;

    CollegeData(int year, String ename, String collegeName, int semester, int score, String branch) {
        this.Year = year;
        this.Name = ename;
        this.Score = score;
        this.Semester = semester;
        this.CollegeName = collegeName;
        this.Branch = branch;
    }

    void DisplayProfile() {
        System.out.println("Year : " + Year);
        System.out.println("Name : " + Name);
        System.out.println("Score : " + Score);
        System.out.println("Semester : " + Semester);
        System.out.println("College Name : " + CollegeName);
        System.out.println("Branch : " + Branch);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {

        CollegeData s1 = new CollegeData(2026, "Prashant", "IPS", 3, 700, "Computer Science");
        CollegeData s2 = new CollegeData(2024, "Rajhant", "IPS", 4, 780, "Electrical");
        CollegeData s3 = new CollegeData(2022, "Raja", "IPS", 7, 900, "Civil");

        s1.DisplayProfile();
        s2.DisplayProfile();
        s3.DisplayProfile();
    }
}