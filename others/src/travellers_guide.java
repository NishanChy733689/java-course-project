import javax.swing.*;
import java.util.Objects;

public class travellers_guide {
    public static void main(String[] args){
        String weather=get_weather_info();
        String season=get_season_info();
        System.out.println("You are travelling in the "+season+" season where the weather is "+weather);
        suggest(weather,season);
    }
    public static String get_season_info(){
        String season= JOptionPane.showInputDialog("In which season are you travelling ?");
        if (season.equals("summer") || season.equals("rainy") || season.equals("winter")){
            return season;
        }else{
            JOptionPane.showInputDialog("Error");
            System.exit(1);
        }
        return " ";
    }
    public static String get_weather_info(){
        String weather= JOptionPane.showInputDialog("What is the weather ?");
        if (weather.equals("sunny") || weather.equals("rainy") || weather.equals("cold")){
            return weather;
        }else{
            JOptionPane.showInputDialog("Error");
            System.exit(1);
        }

        return weather;
    }
    public static void suggest(String weather,String season){
        if (Objects.equals(season, "summer")){
            System.out.println("Wear light clothes");
        }else if(season.equals("rainy")){
            if (weather.equals("sunny")){
                System.out.println("Wear light clothes and also take a umbrella");
            }else{
                System.out.println("Take an umbrella and wear a rain coat");
            }
        }else{
            System.out.println("Wear woolen clothes and jackets");
        }
    }
}
