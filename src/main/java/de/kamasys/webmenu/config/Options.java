
package de.kamasys.webmenu.config;

import com.google.gson.annotations.SerializedName;
import lombok.*;

import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
@ToString
@Getter
@Setter
public class Options {
    @SerializedName("DefaultURL")
    private String defaultURL = "https://";

    @SerializedName("DefaultUser")
    private String defaultUser = "user";

    @SerializedName("UpdateStrategy")
    private Long updateStrategy = 0L;
}
