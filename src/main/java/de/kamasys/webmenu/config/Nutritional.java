
package de.kamasys.webmenu.config;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Nutritional {
    @SerializedName("Field")
    private String mField;

    @SerializedName("Matches")
    private String mMatches;

    @SerializedName("SourceField")
    private String mSourceField;

    @SerializedName("TargetField")
    private String mTargetField;


    public String getField() {
        return mField;
    }


    public void setField(String field) {
        mField = field;
    }


    public String getMatches() {
        return mMatches;
    }


    public void setMatches(String matches) {
        mMatches = matches;
    }


    public String getSourceField() {
        return mSourceField;
    }


    public void setSourceField(String sourceField) {
        mSourceField = sourceField;
    }


    public String getTargetField() {
        return mTargetField;
    }


    public void setTargetField(String targetField) {
        mTargetField = targetField;
    }
}
