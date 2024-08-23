package 코테;

import java.util.Scanner;

public class 파리퇴치2001 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc=1; tc<=T; tc++) {
			int N = sc.nextInt(); //N배열의 크기
			int M = sc.nextInt(); //M 파리채 크기
			
			int[][] arr = new int[N][N];
			
			for(int r=0; r<N; r++) {
				for(int c=0; c<N; c++) {
					arr[r][c] = sc.nextInt();
				}
			}
			
			int maxKill = 0;
			for(int r=0; r<N-M+1; r++) {
				for(int c=0; c<N-M+1; c++) {
					
					int sum =0;
					
					for(int i=0;i<M;i++) {
						for(int j=0; j<M; j++) {
							sum += arr[r+i][c+j];
						}
					}
					
					maxKill = Math.max(maxKill, sum);
				}
			}
			
			System.out.println("#" + tc + " " + maxKill);
			
			
		}
		
	}

}
