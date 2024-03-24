package org.example;

public class BoundaryService {

    public int findMin(int[] marks) {
        if (marks == null || marks.length == 0) {
            throw new IllegalArgumentException();
        }
        
        int currentMin = marks[0];
        for (int mark : marks) {
            if (currentMin > mark) {
                currentMin = mark;
            }
        }
        return currentMin;
    }
}
