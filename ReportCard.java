/**
 * Created by Kevin Baltodano on 17/9/2016.
 */

public class ReportCard {
    //Attributes that belong to the Student, such as name or ID should be stored in a separate Student.Java file
    //In this example, a numeric grading scale is used and grades are stored as doubles to allow decimal values, e.g. 70.5.
    private double religionGrade;
    private double socialStudiesGrade;
    private double englishGrade;
    private double mathGrade;
    private double historyGrade;
    private double musicGrade;
    private double readingGrade;
    private double spanishGrade;
    private double scienceGrade;
    private double artGrade;
    private double physicalEducationGrade;

    /**
     * Constructor method
     */
    public ReportCard(double religionGrade, double socialStudiesGrade, double englishGrade, double mathGrade, double historyGrade, double musicGrade, double readingGrade, double spanishGrade, double scienceGrade, double artGrade, double physicalEducationGrade) {
        setReligionGrade(religionGrade);
        setSocialStudiesGrade(socialStudiesGrade);
        setEnglishGrade(englishGrade);
        setMathGrade(mathGrade);
        setHistoryGrade(historyGrade);
        setMusicGrade(musicGrade);
        setReadingGrade(readingGrade);
        setSpanishGrade(spanishGrade);
        setScienceGrade(scienceGrade);
        setArtGrade(artGrade);
        setPhysicalEducationGrade(physicalEducationGrade);
    }

    /**
     * Getter and Setter Methods
     */
    public double getReligionGrade() {
        return religionGrade;
    }

    public void setReligionGrade(double religionGrade) {
        this.religionGrade = religionGrade;
    }

    public double getSocialStudiesGrade() {
        return socialStudiesGrade;
    }

    public void setSocialStudiesGrade(double socialStudiesGrade) {
        this.socialStudiesGrade = socialStudiesGrade;
    }

    public double getEnglishGrade() {
        return englishGrade;
    }

    public void setEnglishGrade(double englishGrade) {
        this.englishGrade = englishGrade;
    }

    public double getMathGrade() {
        return mathGrade;
    }

    public void setMathGrade(double mathGrade) {
        this.mathGrade = mathGrade;
    }

    public double getHistoryGrade() {
        return historyGrade;
    }

    public void setHistoryGrade(double historyGrade) {
        this.historyGrade = historyGrade;
    }

    public double getMusicGrade() {
        return musicGrade;
    }

    public void setMusicGrade(double musicGrade) {
        this.musicGrade = musicGrade;
    }

    public double getReadingGrade() {
        return readingGrade;
    }

    public void setReadingGrade(double readingGrade) {
        this.readingGrade = readingGrade;
    }

    public double getSpanishGrade() {
        return spanishGrade;
    }

    public void setSpanishGrade(double spanishGrade) {
        this.spanishGrade = spanishGrade;
    }

    public double getScienceGrade() {
        return scienceGrade;
    }

    public void setScienceGrade(double scienceGrade) {
        this.scienceGrade = scienceGrade;
    }

    public double getArtGrade() {
        return artGrade;
    }

    public void setArtGrade(double artGrade) {
        this.artGrade = artGrade;
    }

    public double getPhysicalEducationGrade() {
        return physicalEducationGrade;
    }

    public void setPhysicalEducationGrade(double physicalEducationGrade) {
        this.physicalEducationGrade = physicalEducationGrade;
    }

    /**
     * Prints a summary of all the grades
     */
    @Override
    public String toString() {
        return "Report Card for Student" +
                "\nReligion Grade: " + getReligionGrade() +
                "\nSocial Studies Grade: " + getSocialStudiesGrade() +
                "\nEnglish Grade: " + getEnglishGrade() +
                "\nMath Grade: " + getMathGrade() +
                "\nHistory Grade: " + getHistoryGrade() +
                "\nMusic Grade: " + getMusicGrade() +
                "\nReading Grade: " + getReadingGrade() +
                "\nSpanish Grade: " + getSpanishGrade() +
                "\nScience Grade: " + getScienceGrade() +
                "\nArt Grade: " + getArtGrade() +
                "\nPhysical Education Grade: " + getPhysicalEducationGrade();
    }
}
