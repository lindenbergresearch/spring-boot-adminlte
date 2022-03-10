package de.kamasys.webmenu.json;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.List;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Tage {

    @SerializedName("Mahlzeiten")
    private List<Mahlzeiten> mMahlzeiten;

    @SerializedName("Tag")
    private String mTag;


    public List<Mahlzeiten> getMahlzeiten() {
        return mMahlzeiten;
    }


    public void setMahlzeiten(List<Mahlzeiten> mahlzeiten) {
        mMahlzeiten = mahlzeiten;
    }


    public String getTag() {
        return mTag;
    }


    public void setTag(String tag) {
        mTag = tag;
    }
}
