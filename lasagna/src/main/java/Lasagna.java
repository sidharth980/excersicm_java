public class Lasagna {
    int totalTime = 40;
    public int expectedMinutesInOven(){
        return this.totalTime;
    }

    public int remainingMinutesInOven(int cookingTime){
        return this.totalTime-cookingTime;
    }

    public int preparationTimeInMinutes(int lasagnaLayers){
        return lasagnaLayers*2;
    }

    public int totalTimeInMinutes(int lasagnaLayers,int cookingTime){
        return cookingTime+lasagnaLayers*2;
    }
}
