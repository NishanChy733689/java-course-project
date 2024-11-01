// Base class
abstract class Wonder {
    protected String name;
    protected String location;

    public Wonder(String name, String location) {
        this.name = name;
        this.location = location;
    }

    // Abstract method to display information, implemented by each subclass
    public abstract void displayInfo();
}

// Subclass for each wonder
class GreatWallOfChina extends Wonder {
    public GreatWallOfChina() {
        super("Great Wall of China", "China");
    }

    @Override
    public void displayInfo() {
        System.out.println(name + " - Location: " + location);
        System.out.println("Reason: Known for its impressive length and historical significance in ancient China.");
    }
}

class Petra extends Wonder {
    public Petra() {
        super("Petra", "Jordan");
    }

    @Override
    public void displayInfo() {
        System.out.println(name + " - Location: " + location);
        System.out.println("Reason: Renowned for its rock-cut architecture and water conduit system.");
    }
}

class ChristTheRedeemer extends Wonder {
    public ChristTheRedeemer() {
        super("Christ the Redeemer", "Brazil");
    }

    @Override
    public void displayInfo() {
        System.out.println(name + " - Location: " + location);
        System.out.println("Reason: Famous for its iconic statue overlooking Rio de Janeiro.");
    }
}

class MachuPicchu extends Wonder {
    public MachuPicchu() {
        super("Machu Picchu", "Peru");
    }

    @Override
    public void displayInfo() {
        System.out.println(name + " - Location: " + location);
        System.out.println("Reason: An ancient Incan city set high in the Andes Mountains.");
    }
}

class ChichenItza extends Wonder {
    public ChichenItza() {
        super("Chichen Itza", "Mexico");
    }

    @Override
    public void displayInfo() {
        System.out.println(name + " - Location: " + location);
        System.out.println("Reason: Known for its pyramid-like structure and importance in Mayan culture.");
    }
}

class RomanColosseum extends Wonder {
    public RomanColosseum() {
        super("Roman Colosseum", "Italy");
    }

    @Override
    public void displayInfo() {
        System.out.println(name + " - Location: " + location);
        System.out.println("Reason: A historic Roman amphitheater known for gladiatorial events.");
    }
}

class TajMahal extends Wonder {
    public TajMahal() {
        super("Taj Mahal", "India");
    }

    @Override
    public void displayInfo() {
        System.out.println(name + " - Location: " + location);
        System.out.println("Reason: Known for its magnificent white marble structure and romantic history.");
    }
}

// Main class to run the program
public class WondersOfTheWorld{
    public static void main(String[] args) {
        // Create an array of Wonder objects
        Wonder[] wonders = {
                new GreatWallOfChina(),
                new Petra(),
                new ChristTheRedeemer(),
                new MachuPicchu(),
                new ChichenItza(),
                new RomanColosseum(),
                new TajMahal()
        };

        // Display information about each wonder using polymorphism
        for (Wonder wonder : wonders) {
            wonder.displayInfo();
            System.out.println();
        }
    }
}
