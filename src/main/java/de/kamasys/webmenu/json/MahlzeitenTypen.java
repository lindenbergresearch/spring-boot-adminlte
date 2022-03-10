package de.kamasys.webmenu.json;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.List;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class MahlzeitenTypen {

    @SerializedName("AlternativBezeichnung")
    private String mAlternativBezeichnung;

    @SerializedName("Bezeichnung")
    private String mBezeichnung;

    @SerializedName("Id")
    private String mId;

    @SerializedName("Kategorien")
    private List<String> mKategorien;


    public String getAlternativBezeichnung() {
        return mAlternativBezeichnung;
    }


    public void setAlternativBezeichnung(String alternativBezeichnung) {
        mAlternativBezeichnung = alternativBezeichnung;
    }


    public String getBezeichnung() {
        return mBezeichnung;
    }


    public void setBezeichnung(String bezeichnung) {
        mBezeichnung = bezeichnung;
    }


    public String getId() {
        return mId;
    }


    public void setId(String id) {
        mId = id;
    }


    public List<String> getKategorien() {
        return mKategorien;
    }


    public void setKategorien(List<String> kategorien) {
        mKategorien = kategorien;
    }
}
