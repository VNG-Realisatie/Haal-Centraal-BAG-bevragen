/*
 * Huidige bevragingen API
 * Deze API levert actuele gegevens over adressen, adresseerbare objecten en panden. Actueel betekent in deze API `zonder eindstatus`. De bron voor deze API is de basisregistratie adressen en gebouwen (BAG).
 *
 * The version of the OpenAPI document: 1.2.0
 * Contact: bag@kadaster.nl
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;
import org.openapitools.client.model.Nummeraanduiding;
import org.openapitools.client.model.NummeraanduidingHalBasisAllOf;
import org.openapitools.client.model.NummeraanduidingLinks;
import org.openapitools.client.model.NummeraanduidingMogelijkOnjuist;
import org.openapitools.client.model.StatusNaamgevingEnum;

/**
 * NummeraanduidingHalBasis
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-12T14:29:52.942499Z[Etc/UTC]")
public class NummeraanduidingHalBasis {
  public static final String SERIALIZED_NAME_IDENTIFICATIE = "identificatie";
  @SerializedName(SERIALIZED_NAME_IDENTIFICATIE)
  private String identificatie;

  public static final String SERIALIZED_NAME_DOMEIN = "domein";
  @SerializedName(SERIALIZED_NAME_DOMEIN)
  private String domein;

  public static final String SERIALIZED_NAME_HUISNUMMER = "huisnummer";
  @SerializedName(SERIALIZED_NAME_HUISNUMMER)
  private Integer huisnummer;

  public static final String SERIALIZED_NAME_HUISLETTER = "huisletter";
  @SerializedName(SERIALIZED_NAME_HUISLETTER)
  private String huisletter;

  public static final String SERIALIZED_NAME_HUISNUMMERTOEVOEGING = "huisnummertoevoeging";
  @SerializedName(SERIALIZED_NAME_HUISNUMMERTOEVOEGING)
  private String huisnummertoevoeging;

  public static final String SERIALIZED_NAME_POSTCODE = "postcode";
  @SerializedName(SERIALIZED_NAME_POSTCODE)
  private String postcode;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusNaamgevingEnum status;

  public static final String SERIALIZED_NAME_GECONSTATEERD = "geconstateerd";
  @SerializedName(SERIALIZED_NAME_GECONSTATEERD)
  private Boolean geconstateerd;

  public static final String SERIALIZED_NAME_DOCUMENTDATUM = "documentdatum";
  @SerializedName(SERIALIZED_NAME_DOCUMENTDATUM)
  private LocalDate documentdatum;

  public static final String SERIALIZED_NAME_DOCUMENTNUMMER = "documentnummer";
  @SerializedName(SERIALIZED_NAME_DOCUMENTNUMMER)
  private String documentnummer;

  public static final String SERIALIZED_NAME_WOONPLAATS_IDENTIFICATIE = "woonplaatsIdentificatie";
  @SerializedName(SERIALIZED_NAME_WOONPLAATS_IDENTIFICATIE)
  private String woonplaatsIdentificatie;

  public static final String SERIALIZED_NAME_OPENBARE_RUIMTE_IDENTIFICATIE = "openbareRuimteIdentificatie";
  @SerializedName(SERIALIZED_NAME_OPENBARE_RUIMTE_IDENTIFICATIE)
  private String openbareRuimteIdentificatie;

  public static final String SERIALIZED_NAME_MOGELIJK_ONJUIST = "mogelijkOnjuist";
  @SerializedName(SERIALIZED_NAME_MOGELIJK_ONJUIST)
  private NummeraanduidingMogelijkOnjuist mogelijkOnjuist;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private NummeraanduidingLinks links;


  public NummeraanduidingHalBasis identificatie(String identificatie) {
    
    this.identificatie = identificatie;
    return this;
  }

   /**
   * Get identificatie
   * @return identificatie
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIdentificatie() {
    return identificatie;
  }


  public void setIdentificatie(String identificatie) {
    this.identificatie = identificatie;
  }


  public NummeraanduidingHalBasis domein(String domein) {
    
    this.domein = domein;
    return this;
  }

   /**
   * Het domein waartoe de identificatie behoort.
   * @return domein
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Het domein waartoe de identificatie behoort.")

  public String getDomein() {
    return domein;
  }


  public void setDomein(String domein) {
    this.domein = domein;
  }


  public NummeraanduidingHalBasis huisnummer(Integer huisnummer) {
    
    this.huisnummer = huisnummer;
    return this;
  }

   /**
   * Nummer dat door de gemeente aan een adresseerbaar object is gegeven.
   * @return huisnummer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "Nummer dat door de gemeente aan een adresseerbaar object is gegeven.")

  public Integer getHuisnummer() {
    return huisnummer;
  }


  public void setHuisnummer(Integer huisnummer) {
    this.huisnummer = huisnummer;
  }


  public NummeraanduidingHalBasis huisletter(String huisletter) {
    
    this.huisletter = huisletter;
    return this;
  }

   /**
   * Toevoeging aan een huisnummer in de vorm van een letter die door de gemeente aan een adresseerbaar object is gegeven.
   * @return huisletter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "A", value = "Toevoeging aan een huisnummer in de vorm van een letter die door de gemeente aan een adresseerbaar object is gegeven.")

  public String getHuisletter() {
    return huisletter;
  }


  public void setHuisletter(String huisletter) {
    this.huisletter = huisletter;
  }


  public NummeraanduidingHalBasis huisnummertoevoeging(String huisnummertoevoeging) {
    
    this.huisnummertoevoeging = huisnummertoevoeging;
    return this;
  }

   /**
   * Toevoeging aan een huisnummer of een combinatie van huisnummer en huisletter die door de gemeente aan een adresseerbaar object is gegeven.
   * @return huisnummertoevoeging
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "bis", value = "Toevoeging aan een huisnummer of een combinatie van huisnummer en huisletter die door de gemeente aan een adresseerbaar object is gegeven.")

  public String getHuisnummertoevoeging() {
    return huisnummertoevoeging;
  }


  public void setHuisnummertoevoeging(String huisnummertoevoeging) {
    this.huisnummertoevoeging = huisnummertoevoeging;
  }


  public NummeraanduidingHalBasis postcode(String postcode) {
    
    this.postcode = postcode;
    return this;
  }

   /**
   * Door PostNL vastgestelde code die bij een bepaalde combinatie van een straatnaam en een huisnummer hoort.
   * @return postcode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "6922KZ", value = "Door PostNL vastgestelde code die bij een bepaalde combinatie van een straatnaam en een huisnummer hoort.")

  public String getPostcode() {
    return postcode;
  }


  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }


  public NummeraanduidingHalBasis status(StatusNaamgevingEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StatusNaamgevingEnum getStatus() {
    return status;
  }


  public void setStatus(StatusNaamgevingEnum status) {
    this.status = status;
  }


  public NummeraanduidingHalBasis geconstateerd(Boolean geconstateerd) {
    
    this.geconstateerd = geconstateerd;
    return this;
  }

   /**
   * Indicator dat de nummeraanduiding in de registratie is opgenomen door een feitelijke constatering, zonder dat er sprake was van een brondocument/vergunning. De nummeraanduiding is mogelijk illegaal.
   * @return geconstateerd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicator dat de nummeraanduiding in de registratie is opgenomen door een feitelijke constatering, zonder dat er sprake was van een brondocument/vergunning. De nummeraanduiding is mogelijk illegaal.")

  public Boolean getGeconstateerd() {
    return geconstateerd;
  }


  public void setGeconstateerd(Boolean geconstateerd) {
    this.geconstateerd = geconstateerd;
  }


  public NummeraanduidingHalBasis documentdatum(LocalDate documentdatum) {
    
    this.documentdatum = documentdatum;
    return this;
  }

   /**
   * De vaststellingsdatum van het brondocument dat de basis is voor opname, wijziging of een verwijdering van een object.
   * @return documentdatum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Mon Nov 25 00:00:00 UTC 2019", value = "De vaststellingsdatum van het brondocument dat de basis is voor opname, wijziging of een verwijdering van een object.")

  public LocalDate getDocumentdatum() {
    return documentdatum;
  }


  public void setDocumentdatum(LocalDate documentdatum) {
    this.documentdatum = documentdatum;
  }


  public NummeraanduidingHalBasis documentnummer(String documentnummer) {
    
    this.documentnummer = documentnummer;
    return this;
  }

   /**
   * Identificatie van het brondocument dat ten grondslag ligt aan de opname, mutatie of een verwijdering van gegevens.
   * @return documentnummer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Duiven 25112019", value = "Identificatie van het brondocument dat ten grondslag ligt aan de opname, mutatie of een verwijdering van gegevens.")

  public String getDocumentnummer() {
    return documentnummer;
  }


  public void setDocumentnummer(String documentnummer) {
    this.documentnummer = documentnummer;
  }


  public NummeraanduidingHalBasis woonplaatsIdentificatie(String woonplaatsIdentificatie) {
    
    this.woonplaatsIdentificatie = woonplaatsIdentificatie;
    return this;
  }

   /**
   * Een nummeraanduiding ligt in een woonplaats.
   * @return woonplaatsIdentificatie
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2096", value = "Een nummeraanduiding ligt in een woonplaats.")

  public String getWoonplaatsIdentificatie() {
    return woonplaatsIdentificatie;
  }


  public void setWoonplaatsIdentificatie(String woonplaatsIdentificatie) {
    this.woonplaatsIdentificatie = woonplaatsIdentificatie;
  }


  public NummeraanduidingHalBasis openbareRuimteIdentificatie(String openbareRuimteIdentificatie) {
    
    this.openbareRuimteIdentificatie = openbareRuimteIdentificatie;
    return this;
  }

   /**
   * Een nummeraanduiding ligt aan een openbare ruimte.
   * @return openbareRuimteIdentificatie
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0226300000136166", value = "Een nummeraanduiding ligt aan een openbare ruimte.")

  public String getOpenbareRuimteIdentificatie() {
    return openbareRuimteIdentificatie;
  }


  public void setOpenbareRuimteIdentificatie(String openbareRuimteIdentificatie) {
    this.openbareRuimteIdentificatie = openbareRuimteIdentificatie;
  }


  public NummeraanduidingHalBasis mogelijkOnjuist(NummeraanduidingMogelijkOnjuist mogelijkOnjuist) {
    
    this.mogelijkOnjuist = mogelijkOnjuist;
    return this;
  }

   /**
   * Get mogelijkOnjuist
   * @return mogelijkOnjuist
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NummeraanduidingMogelijkOnjuist getMogelijkOnjuist() {
    return mogelijkOnjuist;
  }


  public void setMogelijkOnjuist(NummeraanduidingMogelijkOnjuist mogelijkOnjuist) {
    this.mogelijkOnjuist = mogelijkOnjuist;
  }


  public NummeraanduidingHalBasis links(NummeraanduidingLinks links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NummeraanduidingLinks getLinks() {
    return links;
  }


  public void setLinks(NummeraanduidingLinks links) {
    this.links = links;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NummeraanduidingHalBasis nummeraanduidingHalBasis = (NummeraanduidingHalBasis) o;
    return Objects.equals(this.identificatie, nummeraanduidingHalBasis.identificatie) &&
        Objects.equals(this.domein, nummeraanduidingHalBasis.domein) &&
        Objects.equals(this.huisnummer, nummeraanduidingHalBasis.huisnummer) &&
        Objects.equals(this.huisletter, nummeraanduidingHalBasis.huisletter) &&
        Objects.equals(this.huisnummertoevoeging, nummeraanduidingHalBasis.huisnummertoevoeging) &&
        Objects.equals(this.postcode, nummeraanduidingHalBasis.postcode) &&
        Objects.equals(this.status, nummeraanduidingHalBasis.status) &&
        Objects.equals(this.geconstateerd, nummeraanduidingHalBasis.geconstateerd) &&
        Objects.equals(this.documentdatum, nummeraanduidingHalBasis.documentdatum) &&
        Objects.equals(this.documentnummer, nummeraanduidingHalBasis.documentnummer) &&
        Objects.equals(this.woonplaatsIdentificatie, nummeraanduidingHalBasis.woonplaatsIdentificatie) &&
        Objects.equals(this.openbareRuimteIdentificatie, nummeraanduidingHalBasis.openbareRuimteIdentificatie) &&
        Objects.equals(this.mogelijkOnjuist, nummeraanduidingHalBasis.mogelijkOnjuist) &&
        Objects.equals(this.links, nummeraanduidingHalBasis.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identificatie, domein, huisnummer, huisletter, huisnummertoevoeging, postcode, status, geconstateerd, documentdatum, documentnummer, woonplaatsIdentificatie, openbareRuimteIdentificatie, mogelijkOnjuist, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NummeraanduidingHalBasis {\n");
    sb.append("    identificatie: ").append(toIndentedString(identificatie)).append("\n");
    sb.append("    domein: ").append(toIndentedString(domein)).append("\n");
    sb.append("    huisnummer: ").append(toIndentedString(huisnummer)).append("\n");
    sb.append("    huisletter: ").append(toIndentedString(huisletter)).append("\n");
    sb.append("    huisnummertoevoeging: ").append(toIndentedString(huisnummertoevoeging)).append("\n");
    sb.append("    postcode: ").append(toIndentedString(postcode)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    geconstateerd: ").append(toIndentedString(geconstateerd)).append("\n");
    sb.append("    documentdatum: ").append(toIndentedString(documentdatum)).append("\n");
    sb.append("    documentnummer: ").append(toIndentedString(documentnummer)).append("\n");
    sb.append("    woonplaatsIdentificatie: ").append(toIndentedString(woonplaatsIdentificatie)).append("\n");
    sb.append("    openbareRuimteIdentificatie: ").append(toIndentedString(openbareRuimteIdentificatie)).append("\n");
    sb.append("    mogelijkOnjuist: ").append(toIndentedString(mogelijkOnjuist)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

