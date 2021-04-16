/*
 * Huidige bevragingen API
 * Deze API levert actuele gegevens over adressen, adresseerbare objecten en panden. Actueel betekent in deze API `zonder eindstatus`. De bron voor deze API is de basisregistratie adressen en gebouwen (BAG).
 *
 * The version of the OpenAPI document: 1.1.0
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
import org.openapitools.client.model.PointGeoJSON;
import org.openapitools.client.model.PolygonGeoJSON;

/**
 * Een samengesteld geometriegegevenstype waarbij wordt afgedwongen dat voor de geometrie een keuze gemaakt moet worden tussen een punt of een vlak.
 */
@ApiModel(description = "Een samengesteld geometriegegevenstype waarbij wordt afgedwongen dat voor de geometrie een keuze gemaakt moet worden tussen een punt of een vlak.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T10:02:13.304775Z[Etc/UTC]")
public class PuntOfVlak {
  public static final String SERIALIZED_NAME_PUNT = "punt";
  @SerializedName(SERIALIZED_NAME_PUNT)
  private PointGeoJSON punt;

  public static final String SERIALIZED_NAME_VLAK = "vlak";
  @SerializedName(SERIALIZED_NAME_VLAK)
  private PolygonGeoJSON vlak;


  public PuntOfVlak punt(PointGeoJSON punt) {
    
    this.punt = punt;
    return this;
  }

   /**
   * Get punt
   * @return punt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PointGeoJSON getPunt() {
    return punt;
  }


  public void setPunt(PointGeoJSON punt) {
    this.punt = punt;
  }


  public PuntOfVlak vlak(PolygonGeoJSON vlak) {
    
    this.vlak = vlak;
    return this;
  }

   /**
   * Get vlak
   * @return vlak
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PolygonGeoJSON getVlak() {
    return vlak;
  }


  public void setVlak(PolygonGeoJSON vlak) {
    this.vlak = vlak;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PuntOfVlak puntOfVlak = (PuntOfVlak) o;
    return Objects.equals(this.punt, puntOfVlak.punt) &&
        Objects.equals(this.vlak, puntOfVlak.vlak);
  }

  @Override
  public int hashCode() {
    return Objects.hash(punt, vlak);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PuntOfVlak {\n");
    sb.append("    punt: ").append(toIndentedString(punt)).append("\n");
    sb.append("    vlak: ").append(toIndentedString(vlak)).append("\n");
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

