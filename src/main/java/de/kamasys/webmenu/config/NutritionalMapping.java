
package de.kamasys.webmenu.config;

import com.google.gson.annotations.SerializedName;
import lombok.*;

import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
@ToString
@Getter
@Setter
public class NutritionalMapping {
    @SerializedName("Field")
    private String field;

    @SerializedName("Matches")
    private String matches;

    @SerializedName("SourceFieldName")
    private String sourceFieldName;

    @SerializedName("TargetFieldName")
    private String targetFieldName;


    /* -------------------------------------------------------- */


    /**
     * Try to match a given field and copies the
     * content of class A field A to class B field B.
     *
     * @param source
     * @param target
     * @throws MappingException
     * @throws ReflectiveOperationException
     */
    public void doMapField(Object source, Object target) throws MappingException, ReflectiveOperationException {
        var matchField = source.getClass().getDeclaredField(field);
        matchField.setAccessible(true);

        var value = (String) matchField.get(source);

        // field does not match content
        if (!value.trim().equals(matches)) {
            return;
        }

        var sourceField = source.getClass().getDeclaredField(sourceFieldName);
        sourceField.setAccessible(true);

        var targetField = target.getClass().getDeclaredField(targetFieldName);
        sourceField.setAccessible(true);

        targetField.set(target, sourceField.get(source));
    }
}
