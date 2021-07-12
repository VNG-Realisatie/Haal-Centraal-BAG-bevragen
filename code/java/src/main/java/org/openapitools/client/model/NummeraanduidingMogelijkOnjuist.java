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
import java.util.ArrayList;
import java.util.List;

/**
 * Wanneer true is de waarde mogelijk onjuist en wordt juistheid op dit moment onderzocht. Zie toelichting.
 */
@ApiModel(description = "Wanneer true is de waarde mogelijk onjuist en wordt juistheid op dit moment onderzocht. Zie toelichting.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-12T14:29:52.942499Z[Etc/UTC]")
public class NummeraanduidingMogelijkOnjuist {
  public static final String SERIALIZED_NAME_HUISNUMMER = "huisnummer";
  @SerializedName(SERIALIZED_NAME_HUISNUMMER)
  private Boolean huisnummer;

  public static final String SERIALIZED_NAME_HUISLETTER = "huisletter";
  @SerializedName(SERIALIZED_NAME_HUISLETTER)
  private Boolean huisletter;

  public static final String SERIALIZED_NAME_HUISNUMMERTOEVOEGING = "huisnummertoevoeging";
  @SerializedName(SERIALIZED_NAME_HUISNUMMERTOEVOEGING)
  private Boolean huisnummertoevoeging;

  public static final String SERIALIZED_NAME_POSTCODE = "postcode";
  @SerializedName(SERIALIZED_NAME_POSTCODE)
  private Boolean postcode;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Boolean status;

  public static final String SERIALIZED_NAME_WOONPLAATS_IDENTIFICATIE = "woonplaatsIdentificatie";
  @SerializedName(SERIALIZED_NAME_WOONPLAATS_IDENTIFICATIE)
  private Boolean woonplaatsIdentificatie;

  public static final String SERIALIZED_NAME_OPENBARE_RUIMTE_IDENTIFICATIE = "openbareRuimteIdentificatie";
  @SerializedName(SERIALIZED_NAME_OPENBARE_RUIMTE_IDENTIFICATIE)
  private Boolean openbareRuimteIdentificatie;

  public static final String SERIALIZED_NAME_TOELICHTING = "toelichting";
  @SerializedName(SERIALIZED_NAME_TOELICHTING)
  private List<String> toelichting = null;


  public NummeraanduidingMogelijkOnjuist huisnummer(Boolean huisnummer) {
    
    this.huisnummer = huisnummer;
    return this;
  }

   /**
   * Get huisnummer
   * @return huisnummer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getHuisnummer() {
    return huisnummer;
  }


  public void setHuisnummer(Boolean huisnummer) {
    this.huisnummer = huisnummer;
  }


  public NummeraanduidingMogelijkOnjuist huisletter(Boolean huisletter) {
    
    this.huisletter = huisletter;
    return this;
  }

   /**
   * Get huisletter
   * @return huisletter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getHuisletter() {
    return huisletter;
  }


  public void setHuisletter(Boolean huisletter) {
    this.huisletter = huisletter;
  }


  public NummeraanduidingMogelijkOnjuist huisnummertoevoeging(Boolean huisnummertoevoeging) {
    
    this.huisnummertoevoeging = huisnummertoevoeging;
    return this;
  }

   /**
   * Get huisnummertoevoeging
   * @return huisnummertoevoeging
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getHuisnummertoevoeging() {
    return huisnummertoevoeging;
  }


  public void setHuisnummertoevoeging(Boolean huisnummertoevoeging) {
    this.huisnummertoevoeging = huisnummertoevoeging;
  }


  public NummeraanduidingMogelijkOnjuist postcode(Boolean postcode) {
    
    this.postcode = postcode;
    return this;
  }

   /**
   * Get postcode
   * @return postcode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getPostcode() {
    return postcode;
  }


  public void setPostcode(Boolean postcode) {
    this.postcode = postcode;
  }


  public NummeraanduidingMogelijkOnjuist status(Boolean status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getStatus() {
    return status;
  }


  public void setStatus(Boolean status) {
    this.status = status;
  }


  public NummeraanduidingMogelijkOnjuist woonplaatsIdentificatie(Boolean woonplaatsIdentificatie) {
    
    this.woonplaatsIdentificatie = woonplaatsIdentificatie;
    return this;
  }

   /**
   * Get woonplaatsIdentificatie
   * @return woonplaatsIdentificatie
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getWoonplaatsIdentificatie() {
    return woonplaatsIdentificatie;
  }


  public void setWoonplaatsIdentificatie(Boolean woonplaatsIdentificatie) {
    this.woonplaatsIdentificatie = woonplaatsIdentificatie;
  }


  public NummeraanduidingMogelijkOnjuist openbareRuimteIdentificatie(Boolean openbareRuimteIdentificatie) {
    
    this.openbareRuimteIdentificatie = openbareRuimteIdentificatie;
    return this;
  }

   /**
   * Get openbareRuimteIdentificatie
   * @return openbareRuimteIdentificatie
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getOpenbareRuimteIdentificatie() {
    return openbareRuimteIdentificatie;
  }


  public void setOpenbareRuimteIdentificatie(Boolean openbareRuimteIdentificatie) {
    this.openbareRuimteIdentificatie = openbareRuimteIdentificatie;
  }


  public NummeraanduidingMogelijkOnjuist toelichting(List<String> toelichting) {
    
    this.toelichting = toelichting;
    return this;
  }

  public NummeraanduidingMogelijkOnjuist addToelichtingItem(String toelichtingItem) {
    if (this.toelichting == null) {
      this.toelichting = new ArrayList<>();
    }
    this.toelichting.add(toelichtingItem);
    return this;
  }

   /**
   * Get toelichting
   * @return toelichting
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getToelichting() {
    return toelichting;
  }


  public void setToelichting(List<String> toelichting) {
    this.toelichting = toelichting;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NummeraanduidingMogelijkOnjuist nummeraanduidingMogelijkOnjuist = (NummeraanduidingMogelijkOnjuist) o;
    return Objects.equals(this.huisnummer, nummeraanduidingMogelijkOnjuist.huisnummer) &&
        Objects.equals(this.huisletter, nummeraanduidingMogelijkOnjuist.huisletter) &&
        Objects.equals(this.huisnummertoevoeging, nummeraanduidingMogelijkOnjuist.huisnummertoevoeging) &&
        Objects.equals(this.postcode, nummeraanduidingMogelijkOnjuist.postcode) &&
        Objects.equals(this.status, nummeraanduidingMogelijkOnjuist.status) &&
        Objects.equals(this.woonplaatsIdentificatie, nummeraanduidingMogelijkOnjuist.woonplaatsIdentificatie) &&
        Objects.equals(this.openbareRuimteIdentificatie, nummeraanduidingMogelijkOnjuist.openbareRuimteIdentificatie) &&
        Objects.equals(this.toelichting, nummeraanduidingMogelijkOnjuist.toelichting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(huisnummer, huisletter, huisnummertoevoeging, postcode, status, woonplaatsIdentificatie, openbareRuimteIdentificatie, toelichting);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NummeraanduidingMogelijkOnjuist {\n");
    sb.append("    huisnummer: ").append(toIndentedString(huisnummer)).append("\n");
    sb.append("    huisletter: ").append(toIndentedString(huisletter)).append("\n");
    sb.append("    huisnummertoevoeging: ").append(toIndentedString(huisnummertoevoeging)).append("\n");
    sb.append("    postcode: ").append(toIndentedString(postcode)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    woonplaatsIdentificatie: ").append(toIndentedString(woonplaatsIdentificatie)).append("\n");
    sb.append("    openbareRuimteIdentificatie: ").append(toIndentedString(openbareRuimteIdentificatie)).append("\n");
    sb.append("    toelichting: ").append(toIndentedString(toelichting)).append("\n");
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

