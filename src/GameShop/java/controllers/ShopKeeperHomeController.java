package GameShop.java.controllers;

import GameShop.java.routers.RouteNames;
import GameShop.java.routers.Router;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.event.ActionEvent;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ShopKeeperHomeController implements Initializable {
    private final Router router = new Router();

    @FXML
    private void handleSignOut(ActionEvent event) throws IOException {
        router.changeRoute(RouteNames.HOME, event);
    }

    @FXML
    private void handleCreateRental(ActionEvent event) throws IOException {
        router.changeRoute(RouteNames.CREATE_RENTAL, event);
    }

    @FXML
    private void handleViewRentals(ActionEvent event) throws IOException {
        router.changeRoute(RouteNames.VIEW_RENTALS, event);
    }

    @FXML
    private void handleViewCustomers(ActionEvent event) throws IOException {
        router.changeRoute(RouteNames.VIEW_CUSTOMERS, event);
    }

    @FXML
    private void handleEditGames(ActionEvent event) throws IOException {
        router.changeRoute(RouteNames.EDIT_GAMES, event);
    }

    @FXML
    private void handleEditConsoles(ActionEvent event) throws IOException {
        router.changeRoute(RouteNames.EDIT_CONSOLES, event);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {}
}
