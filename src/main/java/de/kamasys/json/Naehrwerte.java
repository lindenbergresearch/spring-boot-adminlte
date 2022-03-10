package de.kamasys.webmenu.json;

import javax.annotation.Generated;

import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Naehrwerte {

    @SerializedName("Einheit")
    private String mEinheit;
    @SerializedName("Menge")
    private Double mMenge;
    @SerializedName("Name")
    private String mName;


    public String getEinheit() {
        return mEinheit;
    }


    public void setEinheit(String einheit) {
        mEinheit = einheit;
    }


    public Double getMenge() {
        return mMenge;
    }


    public void setMenge(Double menge) {
        mMenge = menge;
    }


    public String getName() {
        return mName;
    }


    public void setName(String name) {
        mName = name;
    }

}
