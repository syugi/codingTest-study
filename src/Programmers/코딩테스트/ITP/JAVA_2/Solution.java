package Programmers.코딩테스트.ITP.JAVA_2;

import java.math.BigInteger;

class Solution {

    public String solution(String a, String b) {

        return String.valueOf(new BigInteger(a).add(new BigInteger(b)));

    }
}
