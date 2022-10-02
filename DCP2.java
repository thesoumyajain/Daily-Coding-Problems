
public class DCP2 {
	static void solve(int nums[])
	{
		int n = nums.length;
		int product = 1;
		
		for(int i=0;i<n;i++)
		{
			product = product * nums[i];
		}
		
		int res[] = new int[n];
		
		for(int i=0;i<n;i++)
		{
			res[i] = (product/nums[i]);
		}
		
		for(int element:res)
		{
			System.out.println(element);
		}
	}
	public static void main(String[] args) {
		int nums[] = new int[] {1, 2, 3, 4, 5};
		solve(nums);
	}

}
