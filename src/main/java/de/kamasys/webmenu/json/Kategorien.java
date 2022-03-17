package de.kamasys.webmenu.json;


import com.google.gson.annotations.SerializedName;
import lombok.ToString;

import javax.annotation.Generated;
import java.util.List;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
@ToString
public class Kategorien {

    @SerializedName("Behaeltermenge")
    private Double mBehaeltermenge;

    @SerializedName("Bezeichnung")
    private String mBezeichnung;

    @SerializedName("DauerbestellartikelBis")
    private Object mDauerbestellartikelBis;

    @SerializedName("DauerbestellartikelVon")
    private Object mDauerbestellartikelVon;

    @SerializedName("DauerbestellerJomealErlaubt")
    private Boolean mDauerbestellerJomealErlaubt;

    @SerializedName("GeaendertAm")
    private String mGeaendertAm;

    @SerializedName("Id")
    private String mId;

    @SerializedName("InhaltInfo")
    private InhaltInfo mInhaltInfo;

    @SerializedName("IstDauerbestellartikel")
    private Boolean mIstDauerbestellartikel;

    @SerializedName("KategorieId")
    private String mKategorieId;

    @SerializedName("KategorieMengeAufKgUebertragen")
    private Object mKategorieMengeAufKgUebertragen;

    @SerializedName("KategorieMengeIstPflichtFeld")
    private Object mKategorieMengeIstPflichtFeld;

    @SerializedName("KomponentenAuswahlErlauben")
    private Object mKomponentenAuswahlErlauben;

    @SerializedName("MaxKatMenge")
    private Object mMaxKatMenge;

    @SerializedName("MaxMenge")
    private Object mMaxMenge;

    @SerializedName("Menge")
    private Double mMenge;

    @SerializedName("PortionsGroesse")
    private Double mPortionsGroesse;

    @SerializedName("Speisen")
    private List<Speisen> mSpeisen;


    public Double getBehaeltermenge() {
        return mBehaeltermenge;
    }


    public void setBehaeltermenge(Double behaeltermenge) {
        mBehaeltermenge = behaeltermenge;
    }


    public String getBezeichnung() {
        return mBezeichnung;
    }


    public void setBezeichnung(String bezeichnung) {
        mBezeichnung = bezeichnung;
    }


    public Object getDauerbestellartikelBis() {
        return mDauerbestellartikelBis;
    }


    public void setDauerbestellartikelBis(Object dauerbestellartikelBis) {
        mDauerbestellartikelBis = dauerbestellartikelBis;
    }


    public Object getDauerbestellartikelVon() {
        return mDauerbestellartikelVon;
    }


    public void setDauerbestellartikelVon(Object dauerbestellartikelVon) {
        mDauerbestellartikelVon = dauerbestellartikelVon;
    }


    public Boolean getDauerbestellerJomealErlaubt() {
        return mDauerbestellerJomealErlaubt;
    }


    public void setDauerbestellerJomealErlaubt(Boolean dauerbestellerJomealErlaubt) {
        mDauerbestellerJomealErlaubt = dauerbestellerJomealErlaubt;
    }


    public String getGeaendertAm() {
        return mGeaendertAm;
    }


    public void setGeaendertAm(String geaendertAm) {
        mGeaendertAm = geaendertAm;
    }


    public String getId() {
        return mId;
    }


    public void setId(String id) {
        mId = id;
    }


    public InhaltInfo getInhaltInfo() {
        return mInhaltInfo;
    }


    public void setInhaltInfo(InhaltInfo inhaltInfo) {
        mInhaltInfo = inhaltInfo;
    }


    public Boolean getIstDauerbestellartikel() {
        return mIstDauerbestellartikel;
    }


    public void setIstDauerbestellartikel(Boolean istDauerbestellartikel) {
        mIstDauerbestellartikel = istDauerbestellartikel;
    }


    public String getKategorieId() {
        return mKategorieId;
    }


    public void setKategorieId(String kategorieId) {
        mKategorieId = kategorieId;
    }


    public Object getKategorieMengeAufKgUebertragen() {
        return mKategorieMengeAufKgUebertragen;
    }


    public void setKategorieMengeAufKgUebertragen(Object kategorieMengeAufKgUebertragen) {
        mKategorieMengeAufKgUebertragen = kategorieMengeAufKgUebertragen;
    }


    public Object getKategorieMengeIstPflichtFeld() {
        return mKategorieMengeIstPflichtFeld;
    }


    public void setKategorieMengeIstPflichtFeld(Object kategorieMengeIstPflichtFeld) {
        mKategorieMengeIstPflichtFeld = kategorieMengeIstPflichtFeld;
    }


    public Object getKomponentenAuswahlErlauben() {
        return mKomponentenAuswahlErlauben;
    }


    public void setKomponentenAuswahlErlauben(Object komponentenAuswahlErlauben) {
        mKomponentenAuswahlErlauben = komponentenAuswahlErlauben;
    }


    public Object getMaxKatMenge() {
        return mMaxKatMenge;
    }


    public void setMaxKatMenge(Object maxKatMenge) {
        mMaxKatMenge = maxKatMenge;
    }


    public Object getMaxMenge() {
        return mMaxMenge;
    }


    public void setMaxMenge(Object maxMenge) {
        mMaxMenge = maxMenge;
    }


    public Double getMenge() {
        return mMenge;
    }


    public void setMenge(Double menge) {
        mMenge = menge;
    }


    public Double getPortionsGroesse() {
        return mPortionsGroesse;
    }


    public void setPortionsGroesse(Double portionsGroesse) {
        mPortionsGroesse = portionsGroesse;
    }


    public List<Speisen> getSpeisen() {
        return mSpeisen;
    }


    public void setSpeisen(List<Speisen> speisen) {
        mSpeisen = speisen;
    }
}
