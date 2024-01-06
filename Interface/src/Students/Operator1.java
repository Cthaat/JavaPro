package Students;

import java.util.ArrayList;

public class Operator1 implements StudentOperator
{
    @Override
    public void PrintAllInformation(ArrayList<Student> students)
    {
        for (int i = 0 ; i < students.size() ; i++)
        {
            Student TempStudent = students.get(i);
            System.out.println(TempStudent.getName());
            System.out.println(TempStudent.getAge());
            System.out.println(TempStudent.getScore());
            System.out.println("------------------------");
        }
    }

    @Override
    public void PrintAverageScore(ArrayList<Student> students)
    {
        double AllScore = 0.0;
        double max = students.get(0).getScore();
        double min = students.get(0).getScore();
        for (int i = 0 ; i < students.size() ; i++)
        {
            AllScore += students.get(i).getScore();
            max = Math.max(max , students.get(i).getScore());
            min = Math.min(min , students.get(i).getScore());
        }
        System.out.println("平均成绩为：" + (AllScore - max - min) / students.size());
    }
}
