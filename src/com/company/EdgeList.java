package com.company;

import java.util.Scanner;

class Edge{
    int v1;
    int v2;
    Edge(int v1, int v2){
        this.v1 = v1;
        this.v2 = v2;
    }
}
public class EdgeList {
    private static void display(Edge []list){
        for(int i=0; i<list.length; i++){
            int v1 = list[i].v1;
            int v2 = list[i].v2;
            if(v1 > v2){
                System.out.println("( " + v2 + ", " + v1  +" )");
            }else{
                System.out.println("( " + v1 + ", " + v2  +" )");
            }
        }
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        // Take Number of Edges
        System.out.print("Enter Number of Edges: ");
        int e = sc.nextInt();
        // Create an Edge List to Store Edges
        Edge []list = new Edge[e];
        for(int i=0; i<e; i++){
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            Edge edge = new Edge(v1, v2);
            list[i] = edge;
        }

        display(list);
    }
}
