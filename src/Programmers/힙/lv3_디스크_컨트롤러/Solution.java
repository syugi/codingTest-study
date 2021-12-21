package Programmers.힙.lv3_디스크_컨트롤러;

import javax.lang.model.element.Element;
import java.util.*;

/*
    코딩테스트연습 > 힙(Heap) > 디스크 컨트롤러
    https://programmers.co.kr/learn/courses/30/lessons/42627

    하드디스크는 한 번에 하나의 작업만 수행할 수 있습니다. 디스크 컨트롤러를 구현하는 방법은 여러 가지가 있습니다.
    각 작업에 대해 [작업이 요청되는 시점, 작업의 소요시간]을 담은 2차원 배열 jobs가 매개변수로 주어질 때,
    작업의 요청부터 종료까지 걸린 시간의 평균을 가장 줄이는 방법으로 처리하면 평균이 얼마가 되는지 return 하도록 solution 함수를 작성해주세요.
    (단, 소수점 이하의 수는 버립니다)
 */
class Solution {

    public class Job {
        int startTime;
        int procTime;
        public Job(int startTime, int procTime){
            this.startTime = startTime;
            this.procTime = procTime;
        }


        @Override
        public String toString() {
            return "Job{" +
                    "startTime=" + startTime +
                    ", procTime=" + procTime +
                    '}';
        }

    }
    public int solution(int[][] jobs) {
        int answer = 0;

        Arrays.sort(jobs,(o1,o2) -> o1[0] - o2[0]);

        LinkedList<Job> waitList = new LinkedList<>();
        PriorityQueue<Job> pq = new PriorityQueue<>((o1, o2) -> o1.procTime - o2.procTime);

        for(int[] job : jobs){
            waitList.add(new Job(job[0],job[1]));
        }

        int count   = 0;
        int endTime = waitList.peek().startTime;
        while(count < jobs.length){

            while(!waitList.isEmpty() && waitList.peek().startTime <= endTime){
                pq.add(waitList.pollFirst());
            }
            System.out.println("pq = " + pq);
            if(!pq.isEmpty()){
                Job job = pq.poll();
                System.out.println("job = " + job);
                endTime += job.procTime;
                answer += endTime - job.startTime;
                count++;
            }else{
                endTime++;
            }
            System.out.println("count = " + count+" answer : "+answer);
        }

        answer = (int)Math.floor(answer/jobs.length);

        return answer;
    }

}
