package com.hottabych04.example;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        List<Point> points = new LinkedList<>();

        for (int i = 0; i < n; i++){
            points.add(
                    new Point(scanner.nextLong(), scanner.nextLong())
            );
        }

        System.out.println(solution(points));
    }

    private static int solution(List<Point> points){
        int count = 0;

        for (int i = 2; i < points.size(); i++) {
            for (int j = i - 1; j < i; j++) {
                for (int k = j - 1; k < j; k++) {
                    Point pi = points.get(i);
                    Point pj = points.get(j);
                    Point pk = points.get(k);

                    if (isNonDegenerateTriangle(
                            pi,
                            pj,
                            pk
                    )){
                        points.remove(pi);
                        points.remove(pj);
                        points.remove(pk);
                        count++;
                    }
                }
            }
        }

        return count;
    }

    private static boolean isNonDegenerateTriangle(Point p1, Point p2, Point p3){
        return (p1.x*(p2.y - p3.y) + p2.x*(p3.y-p1.y) + p3.x*(p1.y-p2.y)) != 0;
    }

    record Point(
            long x,
            long y
    ){
    }
}
