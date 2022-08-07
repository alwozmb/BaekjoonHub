import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int x = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		int a, b, sum=0;
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			a=Integer.parseInt(st.nextToken());
			b=Integer.parseInt(st.nextToken());
			sum += a*b;
		}
		if(x == sum) System.out.println("Yes");
		else System.out.println("No");
		br.close();
	}
}