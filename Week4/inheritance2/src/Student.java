public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    /** constructor. */
    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    /** :). */
    @Override
    public String toString() {
        String res = "Student[";
        res += super.toString();
        res += ",program=" + program;
        res += ",year=" + year;
        res += ",fee=" + fee;
        res += "]";
        return res;
    }
}
