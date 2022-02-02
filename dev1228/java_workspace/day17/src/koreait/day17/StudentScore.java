package koreait.day17;

public class StudentScore  {
	    private int num;
	    private String name;
	    private int korean;
	    private int english;
	    private int science;

	    public StudentScore(int num, int korean, int english, int science) {
	        this.num = num;
	        this.korean = korean;
	        this.english = english;
	        this.science = science;
	    }

	    public int sum() {
	        return (korean + english + science);
	    }

	    public double avg() {
	        return (double) sum() / 3;
	    }

	    public int getNum() {
	        return num;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getEnglish() {
	        return english;
	    }

	    public int getKorean() {
	        return korean;
	    }

	    public int getScience() {
	        return science;
	    }

	}

