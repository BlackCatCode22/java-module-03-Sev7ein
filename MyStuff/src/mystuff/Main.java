package mystuff;
//9/20/25
//s.n


public class Main {
    public static void main(String[] args) {
        Driver driver1 = new Driver();
        //driver class being used for car models
        driver1.carModel = "";
        driver1.carYear = 2002;
        driver1.carOwner = "Albert Heinstein";
        driver1.amountOwed = 13259.89;
        driver1.hasInsurance = true;
    System.out.println("\n Car Owner's name is: "+ driver1.carOwner);
//my everyday object i selected was songs
        Songs songs1 = new Songs();
        songs1.songName = "Billie Jean";
        songs1.artistOfSong = "Michael Jackson";
        songs1.songLength = 286;
        songs1.hasFeatures = false;
        songs1.albumName = "Thriller";

        System.out.println("\n The current Song is: " + songs1.songName + " by " + songs1.artistOfSong);
    }
    }
