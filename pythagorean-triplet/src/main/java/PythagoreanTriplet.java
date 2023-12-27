import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class PythagoreanTriplet {
    private final int a;
    private final int b;
    private final int c;

    PythagoreanTriplet(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof PythagoreanTriplet other)
            return this.hashCode() == other.hashCode();
        return false;
    }

    static TripletListBuilder makeTripletsList() {
        return new TripletListBuilder();
    }

    static class TripletListBuilder {
        int sum;
        int factor = 0;

        TripletListBuilder thatSumTo(int sum) {
            this.sum = sum;
            return this;
        }

        TripletListBuilder withFactorsLessThanOrEqualTo(int maxFactor) {
            this.factor = maxFactor;
            return this;
        }

        public List<PythagoreanTriplet> build() {
            List<PythagoreanTriplet> triplets = new ArrayList<>();
            factor = factor == 0 ? sum : factor;
            for (int i = 1; i < factor - 2; i++) {
                for (int j = i + 1; j <= factor - 1; j++) {
                    int k = sum - i - j;
                    if (k <= factor && i * i + j * j == k * k) {
                        triplets.add(new PythagoreanTriplet(i, j, k));
                        System.out.println(i+" "+j+" "+k);
                    }
                }
            }
            return triplets;
        }
    }
}