import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		float arr1[] = new float[n];
		float arr2[] = new float[n];
		float avg=0;
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			arr1[i]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr1);
		for(int j=0; j<n; j++) {
			arr2[j]=arr1[j]/arr1[n-1]*100;
			avg += arr2[j];
		}
		System.out.println(avg/n);
		br.close();
	}
}