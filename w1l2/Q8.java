package w1l1;
/**
 * 
 * @author 984881
 * result
Student 0's correct count is 7
Student 1's correct count is 6
Student 2's correct count is 5
Student 3's correct count is 4
Student 4's correct count is 8
Student 5's correct count is 7
Student 6's correct count is 7
Student 7's correct count is 7
 */
public class Q8 {
	public static void main(String[] args) {
		char studentsAnswer2Question[][]= 
			{{'A','B','A','C','C','D','E','E','A','D'},
			{'D','B','A','B','C','A','E','E','A','D'},
			{'E','D','D','A','C','B','E','E','A','D'},
			{'C','B','A','E','D','C','E','E','A','D'},
			{'A','B','D','C','C','D','E','E','A','D'},
			{'B','B','E','C','C','D','E','E','A','D'},
			{'B','B','A','C','C','D','E','E','A','D'},
			{'E','B','E','C','C','D','E','E','A','D'}};
		char key[] = {'D','B','D','C','C','D','A','E','A','D'};
		
		for(int i=0;i<studentsAnswer2Question.length;i++)
		{
			int count =0;
			for(int j=0;j<studentsAnswer2Question[0].length;j++)
			{
				if(key[j]==studentsAnswer2Question[i][j])
				{
					count++;
				}
			}
			System.out.println("Student "+i+"'s correct count is "+count);
		}
	}
}
