module auctionappfx.com.auctionappfxmain {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires eu.hansolo.tilesfx;
    requires java.sql;

    opens auctionappfx.com.auctionappfxmain to javafx.fxml;
    exports auctionappfx.com.auctionappfxmain;
}