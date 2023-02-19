package com.company;

import java.util.Scanner;

public class DFS {

    private static void dfs(int [][]adjMatrix, int s, boolean []visited){
        // Print the Node
        System.out.print(s + " ");
        // Mark it as Visited
        visited[s] = true;

        // Now Explore for all Neighbours of s
        for(int i = 0; i < adjMatrix.length; i++){
            if(!visited[i] && adjMatrix[s][i] == 1){
                // this is unvisited Neighbour of s
                dfs(adjMatrix, i, visited);
            }
        }
    }
    private static void dfs(int [][]adjMatrix){
        // Select Start Node
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter Start Node: ");
        int s = sc.nextInt();

        boolean []visited = new boolean[adjMatrix.length];
        dfs(adjMatrix, s, visited);
    }
    public static void main(String []args){
        // Create a Adjacency Matrix
        Scanner sc = new Scanner(System.in);

        // Take Number of Vertices
        System.out.print("Enter Number of Vertices: ");
        int n = sc.nextInt();
        int [][]adjMatrix = new int[n][n];

        // Take Number of Edges
        System.out.print("Enter Number of Edges: ");
        int e = sc.nextInt();

        for(int i=0; i<e; i++){
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            adjMatrix[v1][v2] = 1;
            adjMatrix[v2][v1] = 1;
        }

        dfs(adjMatrix);
    }
}

/*
            Enter Number of Vertices: 4
            Enter Number of Edges: 4
            0 1
            0 2
            1 2
            1 3
            Enter Start Node: 2
            2 0 1 3
 */