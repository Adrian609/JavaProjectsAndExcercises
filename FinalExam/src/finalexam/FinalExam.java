/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalexam;

import java.util.Arrays;

/**
 *
 * @author Arod6
 */
public class FinalExam {

     /* Four-way heap and heapsort
     * Data supplied in array declaration
     * Children of parent i are 4i-2, 4i-1, 4i, and 4i+1
     * Parent of child j is (j+2)/4
     */
    private int size;
    private int[] data;

    public FinalExam() {
        data = new int[15];
        size = 0;
    }

    public boolean isEmpty() {
        for (int i = 1; i < 15; i++) {
            if (data[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public void display() {

    }

    public boolean add(int elt) {

        if (data[1] == 0) {
            data[1] = elt;
            size++;
        } else {
            int hole = percolateUp(++size, elt);
            data[hole] = elt;
        }

        return true;
    }
//percolate up 4i+1
    private int percolateUp(int hole, int elt) {
        while (hole != 0 && data[(hole + 2) / 4] > elt) {
            data[hole] = data[(hole + 2) / 4];
            hole = (hole + 2) / 4;
        }
        return hole;
    }

    public int remove() {

        int root = data[1];
        int last = data[size--];
        int hole = percolateDown(1, last);
        return root;
    }

    private int percolateDown(int hole, int elt) {

        //elt is last element in heap
        while (4 * hole + 2 < size) {

            int min = 0;
            int minOfChildren = Integer.MAX_VALUE;
            // Children of parent i are 4i-2, 4i-1, 4i, and 4i+1
            int[] children = new int[]{data[hole * 4 - 2], data[hole * 4 - 1], data[hole * 4], data[hole * 4 + 1]};

            for (int i = 0; i < children.length; i++) {
//                System.out.print("is " + children[i] + " < " + minOfChildren);
                if ((children[i] != 0) && (children[i] < minOfChildren)) {
//                    System.out.print(" yes\n");
                    min = i;
                    minOfChildren = children[i];

                } else {
                    System.out.println();
                }
            }
//            System.out.println("hole: " + hole);

            switch (min) {
                //hole is root at first
                case 0: //left child
                    if (data[(hole * 4) - 2] < data[hole]) {
                        System.out.println("left" + data[hole * 4 - 2]);
                        data[hole] = data[hole * 4 - 2];
                        data[hole * 4 - 2] = 0;
                        hole = hole * 4 - 2;
                    } else {

                    }
                    break;
                case 1: //left mid child
                    if (data[(hole * 4) - 1] < data[hole]) {
//                        System.out.println("leftmid" + data[hole * 4 - 1]);
                        data[hole] = data[hole * 4 - 1];
//                        data[hole * 4 - 1] = 0;
                        hole = hole * 4 - 1;
                    } else {

                    }
                    return hole;
                case 2: //right mid child
                    if (data[(hole * 4)] < data[hole]) {
//                        System.out.println("rightmid" + data[hole * 4]);
                        data[hole] = data[hole * 4];
                        data[hole * 4] = 0;
                        hole = hole * 4;
                    } else {

                    }
                    return hole;
                case 3: //right child
                    if (data[(hole * 4) + 1] < data[hole]) {
//                        System.out.println("right" + data[hole * 4 + 1]);
                        data[hole] = data[hole * 4 + 1];
                        data[hole * 4 + 1] = 0;
                        hole = hole * 4 + 1;
                    } else {

                    }
                    return hole;
                default:
                    System.out.println(minOfChildren);
                    return hole;
            }
        }
        return Integer.MAX_VALUE;
    }

    public static void display(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) throws Exception {
        int[] A = {17, 14, 34, 12, 28, 99, 23, 46, 16, 22, 11, 89, 78, 26};
        System.out.println("Array:");
        display(A);

        FinalExam H = new FinalExam();

        for (int z : A) {
            H.add(z);
            H.display(H.data);
        }
//        System.exit(0);
//        while (!H.isEmpty()) {
//            H.remove();
//        }

        for (int i = 0; i < 14; i++) {
//            System.out.println(i);
            H.remove();
            display(H.data);
        }
    }
}
