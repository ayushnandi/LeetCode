class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        if (arrays == null || arrays.size() < 2) {
            return 0;
        }

        int maxDistance = 0;
        int minVal = arrays.get(0).get(0);
        int maxVal = arrays.get(0).get(arrays.get(0).size() - 1);

        for (int i = 1; i < arrays.size(); i++) {
            List<Integer> array = arrays.get(i);
            int currentMin = array.get(0);
            int currentMax = array.get(array.size() - 1);

            // Calculate distances using current array's min and max
            maxDistance = Math.max(maxDistance, Math.abs(currentMax - minVal));
            maxDistance = Math.max(maxDistance, Math.abs(maxVal - currentMin));

            // Update global min and max
            minVal = Math.min(minVal, currentMin);
            maxVal = Math.max(maxVal, currentMax);
        }

        return maxDistance;
    }
}
