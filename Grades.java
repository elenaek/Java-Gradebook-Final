package javaapplication2;


public class Grades 

{
	private String name;
	private double quizOne;
	private double quizTwo;
	private double midterm;
	private double finalExam;
	private double quizOnePer;
	private double quizTwoPer;
	private double midtermPer;
	private double finalExamPer;
	
	public Grades()
	{
		quizOne = 0.0;
		quizTwo = 0.0;
		midterm = 0.0;
		finalExam = 0.0;
	}
	
	public Grades(double q1, double q2, double mt, double fe, String name)
	{
		setName(name);
		setQuizOne(q1);
		setQuizTwo(q2);
		setMidterm(mt);
		setFinalExam(fe);
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String a)
	{
		name =	a;
	}
	
	public double getQuizOne()
	{
		return quizOne;
	}
        public double getQuizOne(String a)
        {
            if (a.toLowerCase().equals("p"))
            {
                return quizOnePer * 100;
            }
            else if (a.toLowerCase().equals("w"))
            {
                return quizOnePer * 12.5;
            }
            return quizOne;
        }
	
	public void setQuizOne(double q1)
	{
		if (q1 <= 10 && q1 >= 0)
		{
			quizOnePer = q1/10.0;
			quizOne = q1;
		}	
	}
	

	public double getQuizTwo()
	{
		return quizTwo;
	}

        public double getQuizTwo(String a)
        {
            if (a.toLowerCase().equals("p"))
            {
                return quizTwoPer * 100;
            }
            else if (a.toLowerCase().equals("w"))
            {
                return quizTwoPer * 12.5;
            }

            return quizTwo;
        }

	public void setQuizTwo(double q2)
	{
		if (q2 <= 10 && q2 >= 0)
		{
			quizTwoPer = q2/10.0;
			quizTwo = q2;
		}
	}
	

	
	public double getMidterm()
	{
		return midterm;
	}

        public double getMidterm(String a)
        {
            if (a.toLowerCase().equals("p"))
            {
                return midtermPer * 100;
            }
            else if (a.toLowerCase().equals("w"))
            {
                return midtermPer * 25;
            }
            return midterm;
        }

	public void setMidterm(double mt)
	{
		if (mt <= 100 && mt >= 0)
		{
			midtermPer = mt/100.0;
			midterm = mt;
		}
	}
	
	
	public double getFinalExam()
	{
		return finalExam;
	}

        public double getFinalExam(String a)
        {
            if (a.toLowerCase().equals("p"))
            {
                return finalExamPer * 100;
            }

            else if (a.toLowerCase().equals("w"))
            {
                return finalExamPer*50;
            }

            return finalExam;
        }
	
	public void setFinalExam(double fe)
	{
		if (fe <= 100 && fe >= 0)
		{
			finalExamPer = fe/100.0;
			finalExam = fe;
		}
	}
	
	public double getTotalScore()
	{
		return quizOne + quizTwo + midterm + finalExam;
	}
	
	public double getTotalScore(String s)
	{
		if (s.toLowerCase().equals("p"))
		{
			return (quizOnePer*12.5) + (quizTwoPer*12.5) + (midtermPer*25) + (finalExamPer*50);
		}
		
		return quizOne + quizTwo + midterm + finalExam;
	}
	
	public String getLetterGrade()
	{
		double a = getTotalScore("p");
		
		if (a >= 90)
		{
			return "A";
		}
		
		else if(a >= 80 )
		{
			return "B";
		}
		
		else if (a >= 70)
		{
			return "C";
		}
		
		else if (a >= 60)
		{
			return "D";
		}
		
		return "F";
	}

}
