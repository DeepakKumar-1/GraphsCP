package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AdjacencyList {
    private static void display(HashMap<Integer, ArrayList<Integer>> list) {
        System.out.println(list);
    }
    public static void main(String []args){
        HashMap<Integer,ArrayList<Integer>> list = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        // take Number of Vertices
        System.out.print("Enter number of Vertices: ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            System.out.print("Entries for Vertex : " + i);
            System.out.println();
            System.out.print("Enter number of Adjacent Vertex: ");
            int m = sc.nextInt();

            System.out.print("Enter Vertices: ");
            ArrayList<Integer> ls = new ArrayList<>();
            for(int j=0; j<m; j++){
                int k = sc.nextInt();
                ls.add(k);
            }
            list.put(i, ls);
        }
        display(list);
    }


}

/*
        // OUTPUT
        Enter number of Vertices: 5
        Entries for Vertex : 0
        Enter number of Adjacent Vertex: 3
        Enter Vertices: 1 2 3
        Entries for Vertex : 1
        Enter number of Adjacent Vertex: 2
        Enter Vertices: 0 2
        Entries for Vertex : 2
        Enter number of Adjacent Vertex: 4
        Enter Vertices: 0 1 3 4
        Entries for Vertex : 3
        Enter number of Adjacent Vertex: 2
        Enter Vertices: 0 2
        Entries for Vertex : 4
        Enter number of Adjacent Vertex: 1
        Enter Vertices: 2
        {0=[1, 2, 3], 1=[0, 2], 2=[0, 1, 3, 4], 3=[0, 2], 4=[2]}
 */