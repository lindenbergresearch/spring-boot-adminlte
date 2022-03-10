package de.kamasys.webmenu.json;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class ZusatzstoffeAllergene {

    @SerializedName("Bezeichnung")
    private String mBezeichnung;

    @SerializedName("Fussnote")
    private String mFussnote;

    @SerializedName("Id")
    private String mId;

    @SerializedName("IstAllergen")
    private Boolean mIstAllergen;


    public String getBezeichnung() {
        return mBezeichnung;
    }


    public void setBezeichnung(String bezeichnung) {
        mBezeichnung = bezeichnung;
    }


    public String getFussnote() {
        return mFussnote;
    }


    public void setFussnote(String fussnote) {
        mFussnote = fussnote;
    }


    public String getId() {
        return mId;
    }


    public void setId(String id) {
        mId = id;
    }


    public Boolean getIstAllergen() {
        return mIstAllergen;
    }


    public void setIstAllergen(Boolean istAllergen) {
        mIstAllergen = istAllergen;
    }
}
