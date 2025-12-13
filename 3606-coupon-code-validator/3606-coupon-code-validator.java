class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
           List<String> result = new ArrayList<>();

        // Valid business line set
        Set<String> validBusinessLines = new HashSet<>(Arrays.asList("electronics", "grocery", "pharmacy", "restaurant"));

        // Priority for sorting business lines
        Map<String, Integer> priority = new HashMap<>();
        priority.put("electronics", 1);
        priority.put("grocery", 2);
        priority.put("pharmacy", 3);
        priority.put("restaurant", 4);
 
        List<String[]> validCoupons = new ArrayList<>();

        for (int i = 0; i < code.length; i++) {
            if (isActive[i]
                && code[i] != null && !code[i].isEmpty() && code[i].matches("[a-zA-Z0-9_]+")
                && validBusinessLines.contains(businessLine[i])) {
                validCoupons.add(new String[]{businessLine[i], code[i]});
            }
        }

        // Sort by businessLine priority, then by code lexicographically
        validCoupons.sort((a, b) -> {
            int cmp = priority.get(a[0]) - priority.get(b[0]);
            if (cmp == 0) return a[1].compareTo(b[1]);
            return cmp;
        });

        // Extract sorted codes
        for (String[] pair : validCoupons) {
            result.add(pair[1]);
        }

        return result;
    }}