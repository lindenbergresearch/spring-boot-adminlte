package de.kamasys.webmenu.json;


import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.List;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class JsonRoot {

    @SerializedName("KategorieKomponentenGruppenGruppierungen")
    private List<Object> mKategorieKomponentenGruppenGruppierungen;

    @SerializedName("KomponentenGruppenGruppierungen")
    private List<Object> mKomponentenGruppenGruppierungen;

    @SerializedName("Mahlzeiten")
    private List<de.kamasys.webmenu.json.MahlzeitenTypen> mMahlzeitenTypen;

    @SerializedName("NutzungsZeit")
    private Object mNutzungsZeit;

    @SerializedName("Tage")
    private List<de.kamasys.webmenu.json.Tage> mTage;


    public List<Object> getKategorieKomponentenGruppenGruppierungen() {
        return mKategorieKomponentenGruppenGruppierungen;
    }


    public void setKategorieKomponentenGruppenGruppierungen(List<Object> kategorieKomponentenGruppenGruppierungen) {
        mKategorieKomponentenGruppenGruppierungen = kategorieKomponentenGruppenGruppierungen;
    }


    public List<Object> getKomponentenGruppenGruppierungen() {
        return mKomponentenGruppenGruppierungen;
    }


    public void setKomponentenGruppenGruppierungen(List<Object> komponentenGruppenGruppierungen) {
        mKomponentenGruppenGruppierungen = komponentenGruppenGruppierungen;
    }


    public List<de.kamasys.webmenu.json.MahlzeitenTypen> getMahlzeitenTypen() {
        return mMahlzeitenTypen;
    }


    public void setMahlzeitenTypen(List<de.kamasys.webmenu.json.MahlzeitenTypen> mahlzeitenTypen) {
        mMahlzeitenTypen = mahlzeitenTypen;
    }


    public Object getNutzungsZeit() {
        return mNutzungsZeit;
    }


    public void setNutzungsZeit(Object nutzungsZeit) {
        mNutzungsZeit = nutzungsZeit;
    }


    public List<de.kamasys.webmenu.json.Tage> getTage() {
        return mTage;
    }


    public void setTage(List<de.kamasys.webmenu.json.Tage> tage) {
        mTage = tage;
    }
}
