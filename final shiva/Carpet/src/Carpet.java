public abstract class Carpet {
    int measurement;
    SizeAdapter size;

    abstract void setMeasurement(int measurement);

    public int calculateExpense (int units){
        return units*measurement;
    }
}
