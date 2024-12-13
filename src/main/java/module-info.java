module com.example.interfaz_odoo_2_3_mejorada {
    requires javafx.controls;
    requires javafx.fxml;
    requires retrofit2;
    requires retrofit2.converter.gson;
    requires java.sql;


    opens com.example.interfaz_odoo_2_3_mejorada to javafx.fxml;
    exports com.example.interfaz_odoo_2_3_mejorada;
}