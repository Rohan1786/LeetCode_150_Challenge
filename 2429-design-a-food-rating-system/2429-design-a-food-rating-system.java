
class FoodRatings {
    private static class Food implements Comparable<Food> {
        String name;
        int rating;

        Food(String name, int rating) {
            this.name = name;
            this.rating = rating;
        }

        @Override
        public int compareTo(Food other) {
            if (this.rating != other.rating) {
                return other.rating - this.rating; // higher rating first
            }
            return this.name.compareTo(other.name); // lexicographically smaller first
        }
    }

    // Mappings
    private Map<String, String> foodToCuisine;
    private Map<String, Food> foodObjects;
    private Map<String, TreeSet<Food>> cuisineToFoods;

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        foodToCuisine = new HashMap<>();
        foodObjects = new HashMap<>();
        cuisineToFoods = new HashMap<>();

        for (int i = 0; i < foods.length; i++) {
            String food = foods[i];
            String cuisine = cuisines[i];
            int rating = ratings[i];

            Food f = new Food(food, rating);
            foodToCuisine.put(food, cuisine);
            foodObjects.put(food, f);

            cuisineToFoods.putIfAbsent(cuisine, new TreeSet<>());
            cuisineToFoods.get(cuisine).add(f);
        }
    }

    public void changeRating(String food, int newRating) {
        String cuisine = foodToCuisine.get(food);
        Food f = foodObjects.get(food);

        // Remove old entry
        cuisineToFoods.get(cuisine).remove(f);

        // Update rating
        f.rating = newRating;

        // Reinsert with updated rating
        cuisineToFoods.get(cuisine).add(f);
    }

    public String highestRated(String cuisine) {
        return cuisineToFoods.get(cuisine).first().name;
    }
}


/**
 * Your FoodRatings object will be instantiated and called as such:
 * FoodRatings obj = new FoodRatings(foods, cuisines, ratings);
 * obj.changeRating(food,newRating);
 * String param_2 = obj.highestRated(cuisine);
 */