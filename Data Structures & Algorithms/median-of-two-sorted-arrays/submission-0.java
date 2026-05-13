class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        List<Double> list = new ArrayList<>();
        
        for(double x : nums1){
            list.add(x);
        }

        for(double x : nums2) list.add(x);


        Collections.sort(list);
        int n = list.size();



        if( n % 2 != 0){

            return list.get((n/2));
        }

        else {

            double mid1 = list.get((n / 2) - 1);
            double mid2 = list.get(n / 2);

            return (mid1 + mid2) / 2.0;
        }
        
    }
}
