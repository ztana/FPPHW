package w1l4;

/**
 * 
 * @author 984881
 * result
 * 
index of target: 13
index of target: 14
index of target: 0
index of target: 4
index of target: 5
 */

public class Q3 {

	private int Source[] = {0,3,4,5,23,55,56,78,88,99,772,1010,1111,1112,2222};
	private int target;

	private int curStart;
	private int curEnd;
	private int curMid;
	
	Q3(int target)
	{
		this.target = target;
		setCurStart(0);
		setCurEnd(Source.length);
		setCurMid();
		binarySort(curMid);
	}
	
	public void binarySort(int pos)
	{
		if(Source[pos] == target)
			return;
		else
		{
			if(Source[pos]< target)
				curStart = curMid;
			else
				curEnd = curMid;
			setCurMid();
			binarySort(curMid);
		}
	}

	public void setCurStart(int curStart) {
		this.curStart = curStart;
	}


	public void setCurEnd(int curEnd) {
		this.curEnd = curEnd;
	}


	public void setCurMid() {
		this.curMid = (curStart + curEnd)/2;
	}

	
	public void result()
	{
		System.out.println("index of target: " + curMid);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q3 sort = new Q3(1112);
		sort.result();
		Q3 sort1 = new Q3(2222);
		sort1.result();
		Q3 sort2 = new Q3(0);
		sort2.result();
		Q3 sort3 = new Q3(23);
		sort3.result();
		Q3 sort4 = new Q3(55);
		sort4.result();
	}

}
