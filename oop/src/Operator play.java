class Car {
    private String make;
    private String model;
    private int year;
    private String color;

    // Primary constructor with all parameters
    public Car(String make, String model, int year, String color) {
        if (make == null || make.isEmpty() || model == null || model.isEmpty()) {
            throw new IllegalArgumentException("Make and model cannot be null or empty.");
        }
        if (year < 1886 || year > 2024) { // assuming 1886 as the first car's year
            throw new IllegalArgumentException("Year must be realistic.");
        }
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = (color != null && !color.isEmpty()) ? color : "Unknown"; // default color
    }

    // Overloaded constructor with default color
    public Car(String make, String model, int year) {
        this(make, model, year, "Unknown");
    }
  
    // Getters
    public String getMake() { return make; }
    public String getModel() { return model; }
    public int getYear() { return year; }
    public String getColor() { return color; }

    // Method to display car details
    public void displayCarInfo() {
        System.out.println("Car Details:");
        System.out.printf("Make: %s, Model: %s, Year: %d, Color: %s%n", make, model, year, color);
    }
}
