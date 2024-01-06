package Students;

import java.util.ArrayList;

public class Operator2 implements StudentOperator
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

    }
}
