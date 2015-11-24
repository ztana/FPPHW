package w1l1;

import java.util.*;
import java.util.Formatter;
/**
 * 
 * @author 984881
 * result
 "horse","dog","cat"
 */
public class Q5 {
	public static void main(String[] args) {
		String[] inputArray = {"horse", "dog", "cat", "horse","dog"};
		String[] outputArray = new String[10];
		boolean notNeed2Add = false;
		int i = 0;
		int oIndex = 0 ;
		
		for(i=0; i<inputArray.length; i++)
		{
			for(int j=0; j<outputArray.length; j++)
			{
				if(inputArray[i].equals(outputArray[j]))
					notNeed2Add = true;
			}
			if(!notNeed2Add)//need to add
			{
				outputArray[oIndex++] = inputArray[i];
			}
		}
		for(int k =0; k<oIndex;k++)
		{
			System.out.print("\""+ outputArray[k]+"\"");
			if(k != oIndex-1)
				System.out.print(",");
		}
		
	}
}
