package algorithms.intersectionArray;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionArray {
        public int[] intersection(int[] nums1, int[] nums2) {
            List<Integer> resultList = new ArrayList<>();
            Set<Integer> firstSet = new HashSet<>();
            for(Integer number: nums1){
                firstSet.add(number);
            }

            Set<Integer> secondSet = new HashSet<>();
            for(Integer number: nums2){
                secondSet.add(number);
            }

            for(Integer number: secondSet){
                if(firstSet.contains(number)) resultList.add(number);
            }

            int[] returnArray = new int[resultList.size()];
            for(int index = 0; index< resultList.size() ; index++) {
                returnArray[index] = resultList.get(index);
            }

            return returnArray;
        }
}
