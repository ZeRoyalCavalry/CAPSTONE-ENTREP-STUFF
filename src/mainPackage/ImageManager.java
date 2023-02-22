package mainPackage;

import java.awt.Image;
import javax.swing.ImageIcon;

public class ImageManager {

    Game game;
    public ImageIcon bedroomView, cityView, bayRouteView, livingroomView;

    public ImageManager(Game game2, int screenWidth, int screenHeight) {
        game = game2;

        bedroomView = new ImageIcon(getClass().getClassLoader().getResource("bedroom.png"));
            Image newBedroom = bedroomView.getImage();
            Image resizedBedroom = newBedroom.getScaledInstance(game.screenWidth, game.screenHeight, Image.SCALE_SMOOTH);
            bedroomView = new ImageIcon(resizedBedroom);       
        
        cityView = new ImageIcon(getClass().getClassLoader().getResource("temp3.jpg"));
            Image newCity = cityView.getImage();
            Image resizedCity = newCity.getScaledInstance(game.screenWidth, game.screenHeight, Image.SCALE_SMOOTH);
            cityView = new ImageIcon(resizedCity);

        bayRouteView = new ImageIcon(getClass().getClassLoader().getResource("temp4.png"));
            Image newBayRoute = cityView.getImage();
            Image resizedBayRoute = newBayRoute.getScaledInstance(game.screenWidth, game.screenHeight, Image.SCALE_SMOOTH);
            bayRouteView = new ImageIcon(resizedBayRoute);

        livingroomView = new ImageIcon(getClass().getClassLoader().getResource("livingRoom.jpg"));
            Image newLivingRoom = livingroomView.getImage();
            Image resizedLivingRoom = newLivingRoom.getScaledInstance(game.screenWidth, game.screenHeight, Image.SCALE_SMOOTH);
            livingroomView = new ImageIcon(resizedLivingRoom);
    }
}
