package entity;

import handle.StudentHandle;

public class Student {
    private static int AUTOID;
    private int id;
    private String name;
    private double scoreMath;
    private double scorePhysic;
    private double scoreChemistry;

    public Student( String name, double scoreMath, double scorePhysic, double scoreChemistry) {
        this.id = ++AUTOID;
        this.name = name;
        this.scoreMath = scoreMath;
        this.scorePhysic = scorePhysic;
        this.scoreChemistry = scoreChemistry;
    }


    public static int getAUTOID() {
        return AUTOID;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScoreMath() {
        return scoreMath;
    }

    public void setScoreMath(double scoreMath) {
        this.scoreMath = scoreMath;
    }

    public double getScorePhysic() {
        return scorePhysic;
    }

    public void setScorePhysic(double scorePhysic) {
        this.scorePhysic = scorePhysic;
    }

    public double getScoreChemistry() {
        return scoreChemistry;
    }

    public void setScoreChemistry(double scoreChemistry) {
        this.scoreChemistry = scoreChemistry;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", Tên là '" + name + '\'' +
                ", Điểm Toán: " + scoreMath +
                ", Điểm Lý: " + scorePhysic +
                ", Điểm Hóa: " + scoreChemistry +
                '}';
    }
}
