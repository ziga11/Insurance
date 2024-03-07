package com.example.zavarovanje;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    public MenuButton TipVozila;
    public MenuButton sedezi;
    public MenuButton znamkaCB;
    public MenuItem Drugo;
    public javafx.scene.control.Slider Slider;
    public MenuButton gorivo;
    public javafx.scene.control.Slider mocSlider;
    public TextField MocCB;
    public TextField oznaka;
    public TextField imeCB;
    public TextField priimekCB;
    public TextField hisnaCB;
    public TextField ulicaCB;
    public TextField postnaCB;
    public TextField krajCB;
    public DatePicker datumCB;
    public ToggleGroup tipVoznika;
    public DatePicker registracijaCB;
    public TextField RegistrskaOznacba;
    public TextField KrajRegistracije;
    public MenuButton Zavarovanje;
    public MenuButton DodatnoZavarovanje;
    public MenuButton Kasko;
    public CheckBox GumeCB;
    public CheckBox TocaCB;
    public CheckBox ParkingCB;
    public CheckBox KrajaCB;
    public CheckBox TretjaCB;
    public CheckBox PotnikiCB;
    public CheckBox SteklaCB;
    public ColorPicker barvaCB;
    public Label status;

    public void GolfCB() {
        znamkaCB.setText("Golf");
    }

    public void MercedesCB() {
        znamkaCB.setText("Mercedes");
    }

    public void RenaultCB() {
        znamkaCB.setText("Renault");
    }

    public void AudiCB() {
        znamkaCB.setText("Audi");
    }

    public void SkodaCB() {
        znamkaCB.setText("Skoda");
    }

    public void one() {
        sedezi.setText("1");
    }

    public void two() {
        sedezi.setText("2");
    }

    public void three() {
        sedezi.setText("3");
    }

    public void four() {
        sedezi.setText("4");
    }

    public void five() {
        sedezi.setText("5");
    }

    public void Dizel() {
        gorivo.setText("Dizel");
    }

    public void Benzin() {
        gorivo.setText("Benzin");
    }

    public void Elektrika() {
        gorivo.setText("Elektrika");
    }

    public void Tovornjak() {
        TipVozila.setText("Tovornjak");
    }

    public void Motor() {
        TipVozila.setText("Motor");
    }

    public void Traktor() {
        TipVozila.setText("Traktor");
    }

    public void Avtobus() {
        TipVozila.setText("Avtobus");
    }

    public void OsebniAvto() {
        TipVozila.setText("Osebni Avto");
    }

    public void AO() {
        Zavarovanje.setText("AO");
    }

    public void AOplus(ActionEvent actionEvent) {
        Zavarovanje.setText("AO+");
    }

    public void brez() {
        Kasko.setText("Brez");
    }

    public void Fransiza() {
        Kasko.setText("Odbitna franšiza");
    }

    public void Polno() {
        Kasko.setText("Polno");
    }

    public void izhodCB() {
        System.exit(0);
    }

    public void avtorCB() {
        status.setText("Avtor sem jaz");
    }

    public void pobrisiOseba() {
        datumCB.getEditor().clear();
        postnaCB.clear();
        krajCB.clear();
        tipVoznika.selectToggle(null);
        ulicaCB.clear();
        priimekCB.clear();
        imeCB.clear();
        Drugo.setText("");
        hisnaCB.clear();
    }
    public void IzbrisiCB() {
        pobrisiOseba();
        VoziloPobrisi();
        PobrisiZavarovanje();
    }

    public void PobrisiZavarovanje() {
        Kasko.setText("Kasko");
        Zavarovanje.setText("Osnovno Zavarovanje");
        registracijaCB.getEditor().clear();
        KrajRegistracije.clear();
        RegistrskaOznacba.clear();
        GumeCB.setSelected(false);
        TretjaCB.setSelected(false);
        TocaCB.setSelected(false);
        KrajaCB.setSelected(false);
        PotnikiCB.setSelected(false);
        SteklaCB.setSelected(false);
        ParkingCB.setSelected(false);
    }

    public void VoziloPobrisi() {
        barvaCB.setValue(Color.WHITE);
        znamkaCB.setText("Znamka");
        mocSlider.setValue(1);
        Slider.setValue(6);
        sedezi.setText("Sedeži");
        gorivo.setText("Gorivo");
        oznaka.clear();
        TipVozila.setText("Tip Vozila");
        MocCB.setText("Moč (kW)");
    }

    public void ShraniCB() {
        boolean retrn = false;
        if (TipVozila.getText().equals("Tip Vozila")) {
            status.setText(status.getText() + " Izberi tip vozila,");
            retrn = true;
        }
        if (!MocCB.getText().matches("[0-9]]")) {
            status.setText(status.getText() + " Izberi moč vozila,");
            retrn = true;
        }
        if (oznaka.getText().length() == 0 || !oznaka.getText().substring(0, 2).matches("[A-Z]+")) {
            status.setText(status.getText() + " Vpiši ustrezno oznako vozila,");
            retrn = true;
        }
        if (gorivo.getText().equals("Gorivo")) {
            status.setText(status.getText() + " Izberi način goriva,");
            retrn = true;
        }
        if (sedezi.getText().equals("Sedeži")) {
            status.setText(status.getText() + " Izberi št. sedežev,");
            retrn = true;
        }
        if (znamkaCB.getText().equals("Znamka")) {
            status.setText(status.getText() + " Izberi znamko,");
            retrn = true;
        }
        if (Kasko.getText().equals("Kasko")) {
            status.setText(status.getText() + " Vnesi kasko,");
            retrn = true;
        }
        if (Zavarovanje.getText().equals("Osnovno Zavarovanje")) {
            status.setText(status.getText() + " Izberi način zavarovanja,");
            retrn = true;
        }
        if (registracijaCB.getEditor().getText().length() == 0) {
            status.setText(status.getText() + " Vnesi datum prve registracije,");
            retrn = true;
        }
        if (KrajRegistracije.getText().length() == 0 || !KrajRegistracije.getText().matches("[A-z]+")) {
            status.setText(status.getText() + " Vnesi ustrezen kraj prve registracije,");
            retrn = true;
        }
        if (RegistrskaOznacba.getText().length() == 0 || !RegistrskaOznacba.getText().substring(0, 2).matches("[A-Z]+")) {
            status.setText(status.getText() + " Vnesi ustrezno registracijsko oznacbo,");
            retrn = true;
        }
        if (imeCB.getText().length() == 0 || !priimekCB.getText().matches("[A-z]+")) {
            status.setText(status.getText() + " Vnesi ustrezno ime,");
            retrn = true;
        }
        if (priimekCB.getText().length() == 0 || !priimekCB.getText().matches("[A-z]+")) {
            status.setText(status.getText() + " Vnesi ustrezen priimek,");
            retrn = true;
        }
        if (datumCB.getEditor().getText().length() == 0) {
            status.setText(status.getText() + " Vnesi ustrezen datum rojstva,");
            retrn = true;
        }
        if (postnaCB.getText().length() == 0 || !postnaCB.getText().matches("[0-9]+")) {
            status.setText(status.getText() + " Vnesi ustrezno poštno številko,");
            retrn = true;
        }
        if (krajCB.getText().length() == 0 || !krajCB.getText().matches("[A-z]+")) {
            status.setText(status.getText() + " Vnesi ustrezen kraj prebivališča,");
            retrn = true;
        }
        if (ulicaCB.getText().length() == 0 || !ulicaCB.getText().matches("[A-z]+")) {
            status.setText(status.getText() + " Vnesi ustrezno ulico prebivališča,");
            retrn = true;
        }
        if (hisnaCB.getText().length() == 0 || !hisnaCB.getText().matches("[0-9]+")) {
            status.setText(status.getText() + " Vnesi ustrezno hišno številko,");
            retrn = true;
        }
        if (tipVoznika.getToggles().isEmpty()) {
            status.setText(status.getText() + " Izberi tip voznika,");
            retrn = true;
        }
        if (retrn)
            return;
        FileChooser fileChooser = new FileChooser();
        FileChooser.ExtensionFilter extensionFilter = new FileChooser.ExtensionFilter("TXT files (*.txt)", "*.txt");
        fileChooser.getExtensionFilters().add(extensionFilter);
        File file = fileChooser.showSaveDialog(null);
        if (file == null)
            return;
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("Podatki o vozilu:\n" +
                                "   Tip Vozila: " + TipVozila + "\n" +
                                "   Št. sedežev: " + sedezi + "\n" +
                                "   Oznaka: " + oznaka + "\n" +
                                "   Znamka: " + znamkaCB + "\n" +
                                "   Gorivo: " + gorivo + "\n" +
                                "   Barva: " + barvaCB + "\n" +
                                "   Moč: " + MocCB);
            fileWriter.write("Podatki o Osebi:\n" +
                                "   Ime: " + imeCB + "\n" +
                                "   Priimek: " + priimekCB + "\n" +
                                "   Datum rojstva: " + datumCB + "\n" +
                                "   Ulica: " + ulicaCB + "\n" +
                                "   Hišna št.: " + hisnaCB + "\n" +
                                "   Poštna št.: " + postnaCB + "\n" +
                                "   kraj: " + krajCB);
            fileWriter.write("Podatki o zavarovancu:\n" +
                                "   Osnovno zavarovanje: " + Zavarovanje + "\n" +
                                "   Dodatno zavarovanje: " + DodatnoZavarovanje + "\n" +
                                "   Kasko: " + Kasko + "\n" +
                                "   Registrska označba: " + RegistrskaOznacba + "\n" +
                                "   Datum prve registracije: " + registracijaCB + "\n" +
                                "   Kraj prve registracije: " + KrajRegistracije);
            fileWriter.close();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        mocSlider.setMin(1);
        mocSlider.setMax(3000);
        mocSlider.setBlockIncrement(1);
        mocSlider.valueProperty().addListener((obser, val, newV) -> MocCB.setText(String.format("%.0f", newV)));
        Slider.setMin(6);
        Slider.setMax(100);
        Slider.setBlockIncrement(1);
        Slider.valueProperty().addListener((observableValue, number, t1) -> {
            Drugo.setText(String.format("%.0f", t1));
            sedezi.setText(String.format("%.0f", t1));
        });
    }
}