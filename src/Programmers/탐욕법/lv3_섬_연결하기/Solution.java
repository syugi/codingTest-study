package Programmers.탐욕법.lv3_섬_연결하기;

import java.util.Arrays;
import java.util.Comparator;
import java.util.SplittableRandom;

/*
    코딩테스트연습 > 탐욕법(Greedy) > 섬 연결하기
    https://programmers.co.kr/learn/courses/30/lessons/42861

    n개의 섬 사이에 다리를 건설하는 비용(costs)이 주어질 때, 최소의 비용으로 모든 섬이 서로 통행 가능하도록 만들 때
    필요한 최소 비용을 return 하도록 solution을 완성하세요.
    다리를 여러 번 건너더라도, 도달할 수만 있으면 통행 가능하다고 봅니다.
    예를 들어 A 섬과 B 섬 사이에 다리가 있고, B 섬과 C 섬 사이에 다리가 있으면 A 섬과 C 섬은 서로 통행 가능합니다.
 */
class Solution {

    int[] parent;

    public int solution(int n, int[][] costs) {
        int answer = 0;
        parent = new int[n];

        Arrays.sort(costs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                Integer a = o1[2];
                Integer b = o2[2];
                return a.compareTo(b);
            }
        });

        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }

        for (int[] edge : costs) {
            int from = edge[0];
            int to   = edge[1];
            int cost = edge[2];
            System.out.println("from = " + from);
            System.out.println("to = " + to);
            int fromParent = findParent(from);
            int toParent   = findParent(to);

            if (fromParent != toParent){
                answer += cost;
                parent[toParent] = fromParent;
            }
        }

        System.out.println("answer = " + answer);
        return answer;
    }


    private int findParent(int node) {
        System.out.println("node = " + node+" parent[node] : "+parent[node]);
        if (parent[node] == node) return node;
        return parent[node] = findParent(parent[node]);
    }
}