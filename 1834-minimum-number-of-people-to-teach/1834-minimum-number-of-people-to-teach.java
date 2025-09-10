class Solution {
    public int minimumTeachings(int n, int[][] languages, int[][] friendships) {
        // Step 1: Convert each person's languages into a set for quick lookup
        List<Set<Integer>> personLangs = new ArrayList<>();
        for (int[] langArr : languages) {
            Set<Integer> set = new HashSet<>();
            for (int lang : langArr) {
                set.add(lang);
            }
            personLangs.add(set);
        }

        // Step 2: Find people who cannot communicate
        Set<Integer> candidates = new HashSet<>();
        for (int[] fr : friendships) {
            int u = fr[0] - 1, v = fr[1] - 1;
            boolean canTalk = false;
            for (int lang : personLangs.get(u)) {
                if (personLangs.get(v).contains(lang)) {
                    canTalk = true;
                    break;
                }
            }
            if (!canTalk) {
                candidates.add(u);
                candidates.add(v);
            }
        }

        if (candidates.isEmpty()) return 0; // all can already communicate

        // Step 3: Count how many candidates already know each language
        int[] count = new int[n + 1];
        for (int person : candidates) {
            for (int lang : personLangs.get(person)) {
                count[lang]++;
            }
        }

        // Step 4: Find the language that minimizes new teachings
        int maxCount = 0;
        for (int i = 1; i <= n; i++) {
            maxCount = Math.max(maxCount, count[i]);
        }

        return candidates.size() - maxCount;
    }
}
