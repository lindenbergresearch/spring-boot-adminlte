
package de.kamasys.webmenu.config;

import com.google.gson.annotations.SerializedName;
import lombok.*;

import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
@Getter
@Setter
public class Version {
    @SerializedName("Major")
    private Long major = 0L;

    @SerializedName("Minor")
    private Long minor = 0L;

    @SerializedName("Patch")
    private Long patch = 0L;


    @Override
    public String toString() {
        return "Version " +
            major +
            "." + minor +
            "." + patch;
    }
}
