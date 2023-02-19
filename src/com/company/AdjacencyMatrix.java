package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class AdjacencyMatrix {
    public static void display(int [][]adjMatrix){
        for(int []row : adjMatrix){
            System.out.println(Arrays.toString(row));
        }
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        // Take number of Edges
        System.out.print("Enter Number of Edges: ");
        int e = sc.nextInt();
        // Take Number of Vertices
        System.out.print("Enter Number of Vertices: ");
        int n = sc.nextInt();
        // Create Adjacency Matrix
        int [][]adjMatrix = new int[n][n];
        // Take Edges
        for(int i=0; i<e; i++){
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            adjMatrix[v1][v2] = 1;
            adjMatrix[v2][v1] = 1;
        }

        // Display Graph
        display(adjMatrix);
    }
}
