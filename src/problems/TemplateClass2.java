package problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class TemplateClass2 {

    public String solution(String S) {

        char[] chars = S.toCharArray();
        List<Character> ll = new LinkedList<Character>();
        for(int i = 0; i < chars.length; i++){
            ll.add(chars[i]);
        }

        int i = 0;

        while(i < ll.size()-1){

            int first = ll.get(i);
            int second = ll.get(i+1);
            if(first == 'A' && second == 'B' || first == 'B' && second == 'A' || first == 'C' && second == 'D' || first == 'D' && second == 'C'){
                ll.remove(i);
                ll.remove(i);
                i = 0;
            } else {
                i++;
            }

        }

        StringBuilder sb = new StringBuilder();

        for(Character ch : ll){
            sb.append(ch);
        }

        return sb.toString();
    }

//    public Character getChar(int i){
//        if(i == 1) return 'A';
//        if(i == 2) return 'B';
//        if(i == 3) return 'C';
//        return 'D';
//    }
//
//    public Integer getInt(Character c){
//        if(c == 'A') return 1;
//        if(c == 'B') return 2;
//        if(c == 'C') return 3;
//        return 4;
//    }
}
