import java.util.ArrayList;

class RandomizedSet {
    ArrayList<Integer> arr;

    public RandomizedSet() {
        arr = new ArrayList<>();
    }

    public boolean insert(int val) {
        if (arr.contains((Integer) val)) {
            return false;
        } else {
            arr.add((Integer)val);
            System.out.println(arr);
            return true;

        }

    }

    public boolean remove(int val) {
        if (arr.contains((Integer) val)) {
            arr.remove((Integer) val);
            System.out.println(arr);
            return true;
        } else {
            return false;
        }
    }

    public int getRandom() {
        return arr.get((int) (Math.random() * arr.size()));
    }
}

public class insertDeleteGetRandom {
    public static void main(String[] args) {
        RandomizedSet obj = new RandomizedSet();
        System.out.println(obj.insert(1));
        System.out.println(obj.remove(2));
        System.out.println(obj.insert(2));
        System.out.println(obj.getRandom());
        System.out.println(obj.remove(1));
        System.out.println(obj.insert(2));
        System.out.println(obj.getRandom());
    }
}
