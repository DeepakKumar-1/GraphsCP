package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS {
    private static void bfs(int [][]adjMatrix, int s, boolean []visited){
        // Initialize a Queue to Store Nodes that are at same level or neighbours of s
        Queue<Integer> queue = new LinkedList<>();
        // Mark Current node as Visited
        // And Put into the Queue
        visited[s] = true;
        queue.add(s);
        while(!queue.isEmpty()){
            // Remove Node From the Queue
            int currentNode = queue.poll();
            // Print Current Node
            System.out.print(currentNode + " ");
            // Add all Neighbours of Current Node
            for(int i=0; i<adjMatrix.length; i++){
                if(adjMatrix[currentNode][i] == 1 && !visited[i]){
                    // Add it into the Queue
                    queue.add(i);
                    // Mark it as Visited
                    visited[i] = true;
                }
            }
        }

    }
    private static void bfs(int [][]adjMatrix){
        Scanner sc = new Scanner(System.in);
        // Take Start Node
        System.out.print("Enter Start Node: ");
        int s = sc.nextInt();

        // Initialize Visited Array to store Status of Nodes
        boolean []visited = new boolean[adjMatrix.length];
        bfs(adjMatrix, s, visited);
    }
    public static void main(String []args){
        // Create Adjacency List
        Scanner sc = new Scanner(System.in);

        // Take Number of vertices
        System.out.print("Enter number of Vertices: ");
        int n = sc.nextInt();
        int [][]adjMatrix = new int[n][n];

        // Take Number of Edges
        System.out.print("Enter number of Edges: ");
        int e = sc.nextInt();

        for(int i=0; i<e; i++){
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            adjMatrix[v1][v2] = 1;
            adjMatrix[v2][v1] = 1;
        }
        bfs(adjMatrix);
    }
}

/*
        Enter number of Vertices: 4
        Enter number of Edges: 5
        0 1
        1 2
        0 2
        1 3
        3 2
        Enter Start Node: 3
        3 1 2 0
 */