
class solve {
	public static void main(String args[])
	{
    int n; cin>>n;
     int arr[n];
    for(int i=0; i<n; i++) cin>>arr[i];
  	if(n == 1){
		return 1;
	}
	
		Arrays.sort(arr);
		int Count = 1;
		int maxCOUNT = -1;
		for(int i=0; i < n-1; i++)
		{
			if(arr[i+1] - arr[i] == 1)
			{
				count++;
			}
			else if(arr[i+1] - arr[i] == 0)
			{
				continue;
			}
			else
			{
				count = 1;
			}
			max_count = Math.max(max_count, count);
		}
return maxCOUNT;
	}
}
