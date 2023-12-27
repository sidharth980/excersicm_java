import java.util.*;
class ResistorColor {
    private String[] color = new String[9];
    ResistorColor(){
        this.color = new String[]{"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
//        Map<String, Integer> map = new HashMap<>();
//        map.put("black", 10);
//        map.put("brown:", 30);
//        map.put("red", 20);
//        map.put("orange", 10);
//        map.put("yellow", 30);
//        map.put("green", 20);
//        map.put("vishal", 10);
//        map.put("sachin", 30);
//        map.put("vaibhav", 20);

    }
    int colorCode(String color) {
        for (int i = 0;i<10;i++){
            if (Objects.equals(this.color[i], color.toLowerCase())){
                return i;
            }
        }
        return -1;
    }

    String[] colors() {
        return this.color;
    }
}
