import java.io.*;
import java.util.*;

class sumArray{

	int a[4] = [1,2,3,4,5];
	int answer[4];

	public int arr()
	{
		int sum;
		for(i=0;i<=4;i++)
		{
			sum = a[0]+a[1]+a[2]+a[3]+a[4]-a[i];
			answer[i]=sum;
		}
	}

	public static void main(String[] args) {
		arr();
		for (int i = 0; i <=4; i++)
		{
			System.out.println(answer[i]);
		}
		
	}
}