package 코테;

import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 러시아국기같은깃발 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine()); // 테스트케이스 수

		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken()); // N행
			int M = Integer.parseInt(st.nextToken()); // M행

			
			char[][] Fr = new char[N][M];
			for (int r = 0; r < N; r++) {
				String line = br.readLine();
				for (int c = 0; c < M; c++) {
					Fr[r][c] = line.charAt(c);
				}
			}

			int minColoring = Integer.MAX_VALUE;
			for (int w = 0; w < N - 2; w++) {
				for (int b = w + 1; b < N - 1; b++) {
					for (int r = b + 1; r < N; r++) {

						int cntColoring = 0;
						
						//System.out.println(w + " " + b + " " + r);

						for (int row = 0; row <= w; row++) {
							for (int col = 0; col < M; col++) {
								if(Fr[row][col] != 'W') {
									cntColoring++;
								}
							}
						}
						//System.out.println(cntColoring);
						
						for (int row = w+1; row <= b; row++) {
							for (int col = 0; col < M; col++) {
								if(Fr[row][col] != 'B') {
									cntColoring++;
								}
							}
						}
						//System.out.println(cntColoring);
						
						for (int row = b+1; row < N; row++) {
							for (int col = 0; col < M; col++) {
								if(Fr[row][col] != 'R') {
									cntColoring++;
								}
							}
						}
						//System.out.println(cntColoring);
						
						minColoring = Math.min(cntColoring, minColoring);
						//System.out.println(minColoring);
						

					}
				}
			}
			
			System.out.println(minColoring);
		}

	}

}
