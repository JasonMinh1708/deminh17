public class Colony {
    private final int START_PAIRS = 1;
    private int month;
    private int newBornPairs;
    private int oneMonthPairs;
    private int maturePairs;

    public Colony() {
        month = 2;
        newBornPairs = 0;
        maturePairs = 0;
        oneMonthPairs = START_PAIRS;
    }

    public void aheadAMonth() { 
        maturePairs += oneMonthPairs;       // Cặp một tháng tuổi trở thành trưởng thành
        oneMonthPairs = newBornPairs;       // Cặp mới sinh trở thành một tháng tuổi
        newBornPairs = maturePairs;    // Cặp mới sinh do cặp trưởng thành đẻ ra
        month++;
    }

    public int getMonth() {
        return month;
    }

    public int getNewBornPairs() {
        return newBornPairs;
    }

    public int getOneMonthPairs() {
        return oneMonthPairs;
    }

    public int getMaturePairs() {
        return maturePairs;
    }

    public int getPopulation() {
        return newBornPairs + oneMonthPairs + maturePairs;
    }

    public void display() {
        System.out.println("Month: " + month + " — Pairs: " + getPopulation());
    }
}
