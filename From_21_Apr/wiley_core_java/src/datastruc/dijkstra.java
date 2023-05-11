package datastruc;

import java.util.Arrays;

public class dijkstra {

	public static void main(String[] args) {
		int[][] graph= { {0,4,2,0,0}, {1,0,1,5,0},{2,1,0,8,10}, {0,5,8,0,2},
				{0,0,10,2,0}};
		
		//source vertex
		int source=0;
		int[] distances=dijkstra(graph,source);
		
		for(int i=0;i<distances.length;i++) {
		 System.out.println("shortest distance from source to vertex "+i+" : "+distances[i]);
		}
		
		}

	private static int[] dijkstra(int[][] graph, int source) {
		
		int n=graph.length;
		int[] distances=new int[n];
		boolean[] visited=new boolean[n];
		
		Arrays.fill(distances, Integer.MAX_VALUE);
		distances[source]=0;
		
		for(int i=0;i<n-1;i++) {
			int minvertex=findminvertex(distances, visited);
			visited[minvertex]=true;
			
			for(int j=0;j<n;j++) {
				if(graph[minvertex][j] !=0 && !visited[j]) {
					int newdis=distances[minvertex]+graph[minvertex][j];
					if(newdis<distances[j]) {
						distances[j]=newdis;
					}
				}
		}
		}
		
		return distances;
	}

	private static int findminvertex(int[] distances, boolean[] visited) {
			int minvertex = -1;
			for (int i = 0; i < distances.length; i++) {
				if (!visited[i] && (minvertex == -1 || distances[i] < distances[minvertex])) {
					minvertex = i;
				}
			}
		
			return minvertex;
		}
	}

	


