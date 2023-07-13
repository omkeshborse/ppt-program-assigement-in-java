import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DoubledArray {
    public static int[] findOriginalArray(int[] changed) {
        if (changed.length % 2 != 0) {
            return new int[0];  // If the length is odd, it cannot be a doubled array
        }

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : changed) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> originalList = new ArrayList<>();
        for (int num : changed) {
            if (frequencyMap.containsKey(num) && frequencyMap.get(num) > 0) {
                int doubledNum = num * 2;
                if (frequencyMap.containsKey(doubledNum) && frequencyMap.get(doubledNum) > 0) {
                    originalList.add(num);
                    frequencyMap.put(num, frequencyMap.get(num) - 1);
                    frequencyMap.put(doubledNum, frequencyMap.get(doubledNum) - 1);
                }
            }
        }

        if (originalList.size() * 2 != changed.length) {
            return new int[0];  // If the original array size doesn't match the changed array length, it's not a doubled array
        }

        int[] original = new int[originalList.size()];
        for (int i = 0; i < originalList.size(); i++) {
            original[i] = originalList.get(i);
        }

        return original;
    }

    public static void main(String[] args) {
        int[] changed = {1, 3, 4, 2, 6, 8};
        int[] original = findOriginalArray(changed);
        for (int num : original) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
