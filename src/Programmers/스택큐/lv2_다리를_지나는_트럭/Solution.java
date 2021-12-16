package Programmers.스택큐.lv2_다리를_지나는_트럭;

import java.util.LinkedList;
import java.util.Queue;

/*
    코딩테스트연습 > 스택/큐 > 다리를 지나는 트럭
    https://programmers.co.kr/learn/courses/30/lessons/42583

    트럭 여러 대가 강을 가로지르는 일차선 다리를 정해진 순으로 건너려 합니다. 모든 트럭이 다리를 건너려면 최소 몇 초가 걸리는지 알아내야 합니다.
    다리에는 트럭이 최대 bridge_length대 올라갈 수 있으며, 다리는 weight 이하까지의 무게를 견딜 수 있습니다. 단, 다리에 완전히 오르지 않은 트럭의 무게는 무시합니다.
    solution 함수의 매개변수로 다리에 올라갈 수 있는 트럭 수 bridge_length, 다리가 견딜 수 있는 무게 weight, 트럭 별 무게 truck_weights가 주어집니다.
    이때 모든 트럭이 다리를 건너려면 최소 몇 초가 걸리는지 return 하도록 solution 함수를 완성하세요.
 */
/*
1[] [7]
2[7] []
3[] [4]
4[4][5]
5[5][]
6[][6]
7[6][]
8[] []
 */
class Solution {
    public class Truck {
        int position;
        int weight;
        public Truck(int position, int weight){
            this.position = position;
            this.weight = weight;
        }
    }
    public int solution(int bridge_length, int weight, int[] truck_weights){
        int answer = 0;
        Queue<Integer> inBridge = new LinkedList<>();
        Queue<Integer> waitTruck = new LinkedList<>();


        for (int t : truck_weights) {
            waitTruck.add(t);
        }

        int time = 0;
        while (!waitTruck.isEmpty()) {

            if(inBridge.size() > bridge_length) {
                //다리지남
                inBridge.poll();
                System.out.println("======== inBridge = " + inBridge + " bridge_length : " + bridge_length);
            }

            //현재 다리위
            int sum = 0;
            for (int q : inBridge) {
                sum += q;
            }

            int nextTruck = waitTruck.peek();
            System.out.println("sum = " + sum+" nextTruck : "+nextTruck+" weight : "+weight);
            if(sum+nextTruck < weight) {
                inBridge.add(waitTruck.poll());
            }

            System.out.println("inBridge = " + inBridge);
            System.out.println("waitTruck = " + waitTruck);

            time++;
        }
        System.out.println("time = " + time);
        answer = time;

        return answer;
    }
}
