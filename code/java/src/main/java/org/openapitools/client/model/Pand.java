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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.NummeraanduidingIdentificatiesArray;
import org.openapitools.client.model.PandMogelijkOnjuist;
import org.openapitools.client.model.PolygonGeoJSON;
import org.openapitools.client.model.StatusPandEnum;

/**
 * Een pand is een bouwkundige, constructief zelfstandige eenheid die direct en duurzaam met de aarde is verbonden en betreedbaar en afsluitbaar is.
 */
@ApiModel(description = "Een pand is een bouwkundige, constructief zelfstandige eenheid die direct en duurzaam met de aarde is verbonden en betreedbaar en afsluitbaar is.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-12T14:29:52.942499Z[Etc/UTC]")
public class Pand {
  public static final String SERIALIZED_NAME_IDENTIFICATIE = "identificatie";
  @SerializedName(SERIALIZED_NAME_IDENTIFICATIE)
  private String identificatie;

  public static final String SERIALIZED_NAME_DOMEIN = "domein";
  @SerializedName(SERIALIZED_NAME_DOMEIN)
  private String domein;

  public static final String SERIALIZED_NAME_GEOMETRIE = "geometrie";
  @SerializedName(SERIALIZED_NAME_GEOMETRIE)
  private PolygonGeoJSON geometrie;

  public static final String SERIALIZED_NAME_OORSPRONKELIJK_BOUWJAAR = "oorspronkelijkBouwjaar";
  @SerializedName(SERIALIZED_NAME_OORSPRONKELIJK_BOUWJAAR)
  private Integer oorspronkelijkBouwjaar;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusPandEnum status;

  public static final String SERIALIZED_NAME_GECONSTATEERD = "geconstateerd";
  @SerializedName(SERIALIZED_NAME_GECONSTATEERD)
  private Boolean geconstateerd;

  public static final String SERIALIZED_NAME_DOCUMENTDATUM = "documentdatum";
  @SerializedName(SERIALIZED_NAME_DOCUMENTDATUM)
  private LocalDate documentdatum;

  public static final String SERIALIZED_NAME_DOCUMENTNUMMER = "documentnummer";
  @SerializedName(SERIALIZED_NAME_DOCUMENTNUMMER)
  private String documentnummer;

  public static final String SERIALIZED_NAME_ADRESSEERBAAR_OBJECT_IDENTIFICATIES = "adresseerbaarObjectIdentificaties";
  @SerializedName(SERIALIZED_NAME_ADRESSEERBAAR_OBJECT_IDENTIFICATIES)
  private List<String> adresseerbaarObjectIdentificaties = null;

  public static final String SERIALIZED_NAME_NUMMERAANDUIDING_IDENTIFICATIES = "nummeraanduidingIdentificaties";
  @SerializedName(SERIALIZED_NAME_NUMMERAANDUIDING_IDENTIFICATIES)
  private List<NummeraanduidingIdentificatiesArray> nummeraanduidingIdentificaties = null;

  public static final String SERIALIZED_NAME_MOGELIJK_ONJUIST = "mogelijkOnjuist";
  @SerializedName(SERIALIZED_NAME_MOGELIJK_ONJUIST)
  private PandMogelijkOnjuist mogelijkOnjuist;


  public Pand identificatie(String identificatie) {
    
    this.identificatie = identificatie;
    return this;
  }

   /**
   * De unieke aanduiding van een pand. Elk pand waarvan gegevens zijn opgenomen in de BAG wordt uniek aangeduid door middel van een identificatiecode.
   * @return identificatie
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "De unieke aanduiding van een pand. Elk pand waarvan gegevens zijn opgenomen in de BAG wordt uniek aangeduid door middel van een identificatiecode.")

  public String getIdentificatie() {
    return identificatie;
  }


  public void setIdentificatie(String identificatie) {
    this.identificatie = identificatie;
  }


  public Pand domein(String domein) {
    
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


  public Pand geometrie(PolygonGeoJSON geometrie) {
    
    this.geometrie = geometrie;
    return this;
  }

   /**
   * Get geometrie
   * @return geometrie
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PolygonGeoJSON getGeometrie() {
    return geometrie;
  }


  public void setGeometrie(PolygonGeoJSON geometrie) {
    this.geometrie = geometrie;
  }


  public Pand oorspronkelijkBouwjaar(Integer oorspronkelijkBouwjaar) {
    
    this.oorspronkelijkBouwjaar = oorspronkelijkBouwjaar;
    return this;
  }

   /**
   * Het jaar waarin een pand oorspronkelijk als bouwkundig gereed is opgeleverd. Door de gemeente wordt een inschatting gemaakt van het bouwjaar, en aangepast als het pand wordt opgeleverd. Wijzigingen aan een pand na oplevering leiden niet tot wijziging van het bouwjaar.
   * @return oorspronkelijkBouwjaar
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1991", value = "Het jaar waarin een pand oorspronkelijk als bouwkundig gereed is opgeleverd. Door de gemeente wordt een inschatting gemaakt van het bouwjaar, en aangepast als het pand wordt opgeleverd. Wijzigingen aan een pand na oplevering leiden niet tot wijziging van het bouwjaar.")

  public Integer getOorspronkelijkBouwjaar() {
    return oorspronkelijkBouwjaar;
  }


  public void setOorspronkelijkBouwjaar(Integer oorspronkelijkBouwjaar) {
    this.oorspronkelijkBouwjaar = oorspronkelijkBouwjaar;
  }


  public Pand status(StatusPandEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StatusPandEnum getStatus() {
    return status;
  }


  public void setStatus(StatusPandEnum status) {
    this.status = status;
  }


  public Pand geconstateerd(Boolean geconstateerd) {
    
    this.geconstateerd = geconstateerd;
    return this;
  }

   /**
   * Indicatie dat het pand in de registratie is opgenomen door een feitelijke constatering, zonder dat er sprake was van een brondocument/vergunning. Het pand is mogelijk illegaal.
   * @return geconstateerd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicatie dat het pand in de registratie is opgenomen door een feitelijke constatering, zonder dat er sprake was van een brondocument/vergunning. Het pand is mogelijk illegaal.")

  public Boolean getGeconstateerd() {
    return geconstateerd;
  }


  public void setGeconstateerd(Boolean geconstateerd) {
    this.geconstateerd = geconstateerd;
  }


  public Pand documentdatum(LocalDate documentdatum) {
    
    this.documentdatum = documentdatum;
    return this;
  }

   /**
   * De vaststellingsdatum van het brondocument dat de basis is voor opname, wijziging of een verwijdering van een object.
   * @return documentdatum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Tue May 12 00:00:00 UTC 2009", value = "De vaststellingsdatum van het brondocument dat de basis is voor opname, wijziging of een verwijdering van een object.")

  public LocalDate getDocumentdatum() {
    return documentdatum;
  }


  public void setDocumentdatum(LocalDate documentdatum) {
    this.documentdatum = documentdatum;
  }


  public Pand documentnummer(String documentnummer) {
    
    this.documentnummer = documentnummer;
    return this;
  }

   /**
   * De unieke aanduiding van het brondocument op basis waarvan een opname, mutatie of een verwijdering van gegevens ten aanzien van een woonplaats heeft plaatsgevonden, binnen een gemeente. Alle karakters uit de MES-1 karakterset zijn toegestaan.
   * @return documentnummer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "09.BW.0273", value = "De unieke aanduiding van het brondocument op basis waarvan een opname, mutatie of een verwijdering van gegevens ten aanzien van een woonplaats heeft plaatsgevonden, binnen een gemeente. Alle karakters uit de MES-1 karakterset zijn toegestaan.")

  public String getDocumentnummer() {
    return documentnummer;
  }


  public void setDocumentnummer(String documentnummer) {
    this.documentnummer = documentnummer;
  }


  public Pand adresseerbaarObjectIdentificaties(List<String> adresseerbaarObjectIdentificaties) {
    
    this.adresseerbaarObjectIdentificaties = adresseerbaarObjectIdentificaties;
    return this;
  }

  public Pand addAdresseerbaarObjectIdentificatiesItem(String adresseerbaarObjectIdentificatiesItem) {
    if (this.adresseerbaarObjectIdentificaties == null) {
      this.adresseerbaarObjectIdentificaties = new ArrayList<>();
    }
    this.adresseerbaarObjectIdentificaties.add(adresseerbaarObjectIdentificatiesItem);
    return this;
  }

   /**
   * Get adresseerbaarObjectIdentificaties
   * @return adresseerbaarObjectIdentificaties
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getAdresseerbaarObjectIdentificaties() {
    return adresseerbaarObjectIdentificaties;
  }


  public void setAdresseerbaarObjectIdentificaties(List<String> adresseerbaarObjectIdentificaties) {
    this.adresseerbaarObjectIdentificaties = adresseerbaarObjectIdentificaties;
  }


  public Pand nummeraanduidingIdentificaties(List<NummeraanduidingIdentificatiesArray> nummeraanduidingIdentificaties) {
    
    this.nummeraanduidingIdentificaties = nummeraanduidingIdentificaties;
    return this;
  }

  public Pand addNummeraanduidingIdentificatiesItem(NummeraanduidingIdentificatiesArray nummeraanduidingIdentificatiesItem) {
    if (this.nummeraanduidingIdentificaties == null) {
      this.nummeraanduidingIdentificaties = new ArrayList<>();
    }
    this.nummeraanduidingIdentificaties.add(nummeraanduidingIdentificatiesItem);
    return this;
  }

   /**
   * Identificatie(s) van de hoofd- en nevenadressen van het pand.
   * @return nummeraanduidingIdentificaties
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identificatie(s) van de hoofd- en nevenadressen van het pand.")

  public List<NummeraanduidingIdentificatiesArray> getNummeraanduidingIdentificaties() {
    return nummeraanduidingIdentificaties;
  }


  public void setNummeraanduidingIdentificaties(List<NummeraanduidingIdentificatiesArray> nummeraanduidingIdentificaties) {
    this.nummeraanduidingIdentificaties = nummeraanduidingIdentificaties;
  }


  public Pand mogelijkOnjuist(PandMogelijkOnjuist mogelijkOnjuist) {
    
    this.mogelijkOnjuist = mogelijkOnjuist;
    return this;
  }

   /**
   * Get mogelijkOnjuist
   * @return mogelijkOnjuist
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PandMogelijkOnjuist getMogelijkOnjuist() {
    return mogelijkOnjuist;
  }


  public void setMogelijkOnjuist(PandMogelijkOnjuist mogelijkOnjuist) {
    this.mogelijkOnjuist = mogelijkOnjuist;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pand pand = (Pand) o;
    return Objects.equals(this.identificatie, pand.identificatie) &&
        Objects.equals(this.domein, pand.domein) &&
        Objects.equals(this.geometrie, pand.geometrie) &&
        Objects.equals(this.oorspronkelijkBouwjaar, pand.oorspronkelijkBouwjaar) &&
        Objects.equals(this.status, pand.status) &&
        Objects.equals(this.geconstateerd, pand.geconstateerd) &&
        Objects.equals(this.documentdatum, pand.documentdatum) &&
        Objects.equals(this.documentnummer, pand.documentnummer) &&
        Objects.equals(this.adresseerbaarObjectIdentificaties, pand.adresseerbaarObjectIdentificaties) &&
        Objects.equals(this.nummeraanduidingIdentificaties, pand.nummeraanduidingIdentificaties) &&
        Objects.equals(this.mogelijkOnjuist, pand.mogelijkOnjuist);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identificatie, domein, geometrie, oorspronkelijkBouwjaar, status, geconstateerd, documentdatum, documentnummer, adresseerbaarObjectIdentificaties, nummeraanduidingIdentificaties, mogelijkOnjuist);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pand {\n");
    sb.append("    identificatie: ").append(toIndentedString(identificatie)).append("\n");
    sb.append("    domein: ").append(toIndentedString(domein)).append("\n");
    sb.append("    geometrie: ").append(toIndentedString(geometrie)).append("\n");
    sb.append("    oorspronkelijkBouwjaar: ").append(toIndentedString(oorspronkelijkBouwjaar)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    geconstateerd: ").append(toIndentedString(geconstateerd)).append("\n");
    sb.append("    documentdatum: ").append(toIndentedString(documentdatum)).append("\n");
    sb.append("    documentnummer: ").append(toIndentedString(documentnummer)).append("\n");
    sb.append("    adresseerbaarObjectIdentificaties: ").append(toIndentedString(adresseerbaarObjectIdentificaties)).append("\n");
    sb.append("    nummeraanduidingIdentificaties: ").append(toIndentedString(nummeraanduidingIdentificaties)).append("\n");
    sb.append("    mogelijkOnjuist: ").append(toIndentedString(mogelijkOnjuist)).append("\n");
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

