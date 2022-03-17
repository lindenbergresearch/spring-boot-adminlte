package de.kamasys.webmenu.json;

import com.google.gson.annotations.SerializedName;
import lombok.ToString;

import javax.annotation.Generated;
import java.util.*;


@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
@ToString
public class InhaltInfo {

    @SerializedName("Naehrwerte")
    private List<Naehrwerte> mNaehrwerte = new ArrayList<>();

    @SerializedName("ZusatzstoffeAllergene")
    private List<ZusatzstoffeAllergene> mZusatzstoffeAllergene = new ArrayList<>();


    public List<Naehrwerte> getNaehrwerte() {
        return mNaehrwerte;
    }


    public void setNaehrwerte(List<Naehrwerte> naehrwerte) {
        mNaehrwerte = naehrwerte;
    }


    public List<ZusatzstoffeAllergene> getZusatzstoffeAllergene() {
        return mZusatzstoffeAllergene;
    }


    public void setZusatzstoffeAllergene(List<ZusatzstoffeAllergene> zusatzstoffeAllergene) {
        mZusatzstoffeAllergene = zusatzstoffeAllergene;
    }
}
