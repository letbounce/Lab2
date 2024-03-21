public class Car {
    private final String modelName;
    private final String vinNum;
    private int mileage;
    private String licensePlate;

    public Car(String modelName, String licensePlate, String vinNum, int mileage) {
        this.modelName = modelName;
        this.licensePlate = licensePlate;
        this.vinNum = vinNum;
        this.mileage = mileage;
    }
    public String getLicensePlate(){
        return licensePlate;
    }
    public void setLicensePlate(String licensePlate){
        this.licensePlate = licensePlate;
    }

    public String getModelName(){
        return modelName;
    }

    public String getVinNum() {
        return vinNum;
    }


    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "CarModel: " + modelName +
                ", license plate: " + licensePlate +
                ", vin num: " + vinNum +
                ", mileage: " + mileage;
    }
}
