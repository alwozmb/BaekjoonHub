import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int k=1, q=1, l=2, b=2, n=2, p=8;
		System.out.print(k-(Integer.parseInt(st.nextToken()))+" ");
		System.out.print(q-(Integer.parseInt(st.nextToken()))+" ");
		System.out.print(l-(Integer.parseInt(st.nextToken()))+" ");
		System.out.print(b-(Integer.parseInt(st.nextToken()))+" ");
		System.out.print(n-(Integer.parseInt(st.nextToken()))+" ");
		System.out.print(p-(Integer.parseInt(st.nextToken()))+" ");
	}
}