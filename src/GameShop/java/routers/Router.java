package GameShop.java.routers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Router {
    private final String VIEW_PATH = "../../resources/views/";
    private final String CSS_FILE = "../../resources/css/style.css";

    private final Map<RouteNames, String> routes = new HashMap<>() {{
        put(RouteNames.HOME, VIEW_PATH + "Home.fxml");
        put(RouteNames.SIGN_IN, VIEW_PATH + "SignIn.fxml");
        put(RouteNames.VIEW_GAMES, VIEW_PATH + "ViewGames.fxml");
        put(RouteNames.VIEW_CONSOLES, VIEW_PATH + "ViewConsoles.fxml");
        put(RouteNames.SHOP_KEEPER_HOME, VIEW_PATH + "ShopKeeperHome.fxml");
        put(RouteNames.CREATE_RENTAL, VIEW_PATH + "CreateRental.fxml");
    }};

    public final void changeRoute(RouteNames route, ActionEvent event) throws IOException {
        String sceneRoute = routes.get(route);

        FXMLLoader loader = new FXMLLoader(getClass().getResource(sceneRoute));
        Parent root = loader.load();
        Scene scene = new Scene(root, 1080, 720);
        root.getStylesheets().add(getClass().getResource(CSS_FILE).toExternalForm());
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
    }
}