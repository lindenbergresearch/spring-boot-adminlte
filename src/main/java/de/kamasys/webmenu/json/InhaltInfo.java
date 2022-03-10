package de.kamasys.webmenu.json;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.List;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class InhaltInfo {

    @SerializedName("Naehrwerte")
    private List<de.kamasys.webmenu.json.Naehrwerte> mNaehrwerte;

    @SerializedName("ZusatzstoffeAllergene")
    private List<de.kamasys.webmenu.json.ZusatzstoffeAllergene> mZusatzstoffeAllergene;


    public List<de.kamasys.webmenu.json.Naehrwerte> getNaehrwerte() {
        return mNaehrwerte;
    }


    public void setNaehrwerte(List<de.kamasys.webmenu.json.Naehrwerte> naehrwerte) {
        mNaehrwerte = naehrwerte;
    }


    public List<de.kamasys.webmenu.json.ZusatzstoffeAllergene> getZusatzstoffeAllergene() {
        return mZusatzstoffeAllergene;
    }


    public void setZusatzstoffeAllergene(List<de.kamasys.webmenu.json.ZusatzstoffeAllergene> zusatzstoffeAllergene) {
        mZusatzstoffeAllergene = zusatzstoffeAllergene;
    }
}
