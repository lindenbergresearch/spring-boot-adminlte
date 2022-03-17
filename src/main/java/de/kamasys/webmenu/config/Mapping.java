
package de.kamasys.webmenu.config;

import com.google.gson.annotations.SerializedName;
import lombok.*;

import javax.annotation.Generated;
import java.util.*;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
@ToString
@Getter
@Setter
public class Mapping {
    @SerializedName("NutritionalMapping")
    private List<NutritionalMapping> nutritionalMapping = new ArrayList<>();


    /**
     * Apply mapping to all configured fields.
     *
     * @param source The source class instance.
     * @param target
     * @throws MappingException
     * @throws ReflectiveOperationException
     */
    public void applyNutritionalMapping(Object source, Object target) throws MappingException, ReflectiveOperationException {
        for (var obj : nutritionalMapping)
            obj.doMapField(source, target);
    }
}
