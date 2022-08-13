import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int test_case = Integer.parseInt(br.readLine()); //테스트케이스 개수 입력
		
		for(int i=0; i<test_case; i++) {
			st = new StringTokenizer(br.readLine()," ");
			int n = Integer.parseInt(st.nextToken());
			int arr[] = new int[n];
			
			int sum=0;
			for(int j=0; j<n; j++) {
				arr[j]=Integer.parseInt(st.nextToken());
				sum += arr[j];
				
			}
			double avg = sum/(double)n;
			int count=0;
			for(int k=0; k<n; k++) {
				if(arr[k]>avg) {
					count++;
			}
			}
			
			double overavg = (double)count/n;
			sb.append(String.format("%.3f", overavg*100.0)).append("%"+"\n");
			
		}
		br.close();
		System.out.println(sb);

	}

}