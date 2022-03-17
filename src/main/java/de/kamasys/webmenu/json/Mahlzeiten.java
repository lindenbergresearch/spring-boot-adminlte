package de.kamasys.webmenu.json;

import com.google.gson.annotations.SerializedName;
import lombok.ToString;

import javax.annotation.Generated;
import java.util.List;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
@ToString
public class Mahlzeiten {

    @SerializedName("Bezeichnung")
    private String mBezeichnung;

    @SerializedName("Kategorien")
    private List<Kategorien> mKategorien;

    @SerializedName("MahlzeitId")
    private String mMahlzeitId;

    @SerializedName("SpeiseplanId")
    private String mSpeiseplanId;


    public String getBezeichnung() {
        return mBezeichnung;
    }


    public void setBezeichnung(String bezeichnung) {
        mBezeichnung = bezeichnung;
    }


    public List<Kategorien> getKategorien() {
        return mKategorien;
    }


    public void setKategorien(List<Kategorien> kategorien) {
        mKategorien = kategorien;
    }


    public String getMahlzeitId() {
        return mMahlzeitId;
    }


    public void setMahlzeitId(String mahlzeitId) {
        mMahlzeitId = mahlzeitId;
    }


    public String getSpeiseplanId() {
        return mSpeiseplanId;
    }


    public void setSpeiseplanId(String speiseplanId) {
        mSpeiseplanId = speiseplanId;
    }
}
