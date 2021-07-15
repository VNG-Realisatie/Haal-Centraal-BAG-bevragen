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
import org.openapitools.client.model.OpenbareRuimte;
import org.openapitools.client.model.OpenbareRuimteHalBasisAllOf;
import org.openapitools.client.model.OpenbareRuimteLinks;
import org.openapitools.client.model.OpenbareRuimteMogelijkOnjuist;
import org.openapitools.client.model.StatusNaamgevingEnum;
import org.openapitools.client.model.TypeOpenbareRuimteEnum;

/**
 * OpenbareRuimteHalBasis
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-13T10:42:05.060374Z[Etc/UTC]")
public class OpenbareRuimteHalBasis {
  public static final String SERIALIZED_NAME_IDENTIFICATIE = "identificatie";
  @SerializedName(SERIALIZED_NAME_IDENTIFICATIE)
  private String identificatie;

  public static final String SERIALIZED_NAME_DOMEIN = "domein";
  @SerializedName(SERIALIZED_NAME_DOMEIN)
  private String domein;

  public static final String SERIALIZED_NAME_NAAM = "naam";
  @SerializedName(SERIALIZED_NAME_NAAM)
  private String naam;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeOpenbareRuimteEnum type;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusNaamgevingEnum status;

  public static final String SERIALIZED_NAME_KORTE_NAAM = "korteNaam";
  @SerializedName(SERIALIZED_NAME_KORTE_NAAM)
  private String korteNaam;

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

  public static final String SERIALIZED_NAME_MOGELIJK_ONJUIST = "mogelijkOnjuist";
  @SerializedName(SERIALIZED_NAME_MOGELIJK_ONJUIST)
  private OpenbareRuimteMogelijkOnjuist mogelijkOnjuist;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private OpenbareRuimteLinks links;


  public OpenbareRuimteHalBasis identificatie(String identificatie) {
    
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


  public OpenbareRuimteHalBasis domein(String domein) {
    
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


  public OpenbareRuimteHalBasis naam(String naam) {
    
    this.naam = naam;
    return this;
  }

   /**
   * De naam die door de gemeente aan een openbare ruimte is gegeven.
   * @return naam
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Laan van de landinrichtingscommissie Duiven-Westervoort", value = "De naam die door de gemeente aan een openbare ruimte is gegeven.")

  public String getNaam() {
    return naam;
  }


  public void setNaam(String naam) {
    this.naam = naam;
  }


  public OpenbareRuimteHalBasis type(TypeOpenbareRuimteEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TypeOpenbareRuimteEnum getType() {
    return type;
  }


  public void setType(TypeOpenbareRuimteEnum type) {
    this.type = type;
  }


  public OpenbareRuimteHalBasis status(StatusNaamgevingEnum status) {
    
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


  public OpenbareRuimteHalBasis korteNaam(String korteNaam) {
    
    this.korteNaam = korteNaam;
    return this;
  }

   /**
   * De officiële openbareruimtenaam of een verkorte versie. Beiden hebben maximaal 24 tekens.
   * @return korteNaam
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Ln vd l D-Westervoort", value = "De officiële openbareruimtenaam of een verkorte versie. Beiden hebben maximaal 24 tekens.")

  public String getKorteNaam() {
    return korteNaam;
  }


  public void setKorteNaam(String korteNaam) {
    this.korteNaam = korteNaam;
  }


  public OpenbareRuimteHalBasis geconstateerd(Boolean geconstateerd) {
    
    this.geconstateerd = geconstateerd;
    return this;
  }

   /**
   * Indicator dat een openbare ruimte in de registratie is opgenomen door een feitelijke constatering, zonder dat er een brondocument aan ten grondslag ligt. De openbare ruimte is mogelijk illegaal.
   * @return geconstateerd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicator dat een openbare ruimte in de registratie is opgenomen door een feitelijke constatering, zonder dat er een brondocument aan ten grondslag ligt. De openbare ruimte is mogelijk illegaal.")

  public Boolean getGeconstateerd() {
    return geconstateerd;
  }


  public void setGeconstateerd(Boolean geconstateerd) {
    this.geconstateerd = geconstateerd;
  }


  public OpenbareRuimteHalBasis documentdatum(LocalDate documentdatum) {
    
    this.documentdatum = documentdatum;
    return this;
  }

   /**
   * De vaststellingsdatum van het brondocument dat de basis is voor opname, wijziging of een verwijdering van een object.
   * @return documentdatum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Tue Feb 09 00:00:00 UTC 2010", value = "De vaststellingsdatum van het brondocument dat de basis is voor opname, wijziging of een verwijdering van een object.")

  public LocalDate getDocumentdatum() {
    return documentdatum;
  }


  public void setDocumentdatum(LocalDate documentdatum) {
    this.documentdatum = documentdatum;
  }


  public OpenbareRuimteHalBasis documentnummer(String documentnummer) {
    
    this.documentnummer = documentnummer;
    return this;
  }

   /**
   * De unieke aanduiding van het brondocument op basis waarvan een opname, mutatie of een verwijdering van gegevens ten aanzien van een woonplaats heeft plaatsgevonden, binnen een gemeente. Alle karakters uit de MES-1 karakterset zijn toegestaan.
   * @return documentnummer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BAG-21", value = "De unieke aanduiding van het brondocument op basis waarvan een opname, mutatie of een verwijdering van gegevens ten aanzien van een woonplaats heeft plaatsgevonden, binnen een gemeente. Alle karakters uit de MES-1 karakterset zijn toegestaan.")

  public String getDocumentnummer() {
    return documentnummer;
  }


  public void setDocumentnummer(String documentnummer) {
    this.documentnummer = documentnummer;
  }


  public OpenbareRuimteHalBasis woonplaatsIdentificatie(String woonplaatsIdentificatie) {
    
    this.woonplaatsIdentificatie = woonplaatsIdentificatie;
    return this;
  }

   /**
   * Een openbare ruimte ligt in een woonplaats.
   * @return woonplaatsIdentificatie
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2096", value = "Een openbare ruimte ligt in een woonplaats.")

  public String getWoonplaatsIdentificatie() {
    return woonplaatsIdentificatie;
  }


  public void setWoonplaatsIdentificatie(String woonplaatsIdentificatie) {
    this.woonplaatsIdentificatie = woonplaatsIdentificatie;
  }


  public OpenbareRuimteHalBasis mogelijkOnjuist(OpenbareRuimteMogelijkOnjuist mogelijkOnjuist) {
    
    this.mogelijkOnjuist = mogelijkOnjuist;
    return this;
  }

   /**
   * Get mogelijkOnjuist
   * @return mogelijkOnjuist
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OpenbareRuimteMogelijkOnjuist getMogelijkOnjuist() {
    return mogelijkOnjuist;
  }


  public void setMogelijkOnjuist(OpenbareRuimteMogelijkOnjuist mogelijkOnjuist) {
    this.mogelijkOnjuist = mogelijkOnjuist;
  }


  public OpenbareRuimteHalBasis links(OpenbareRuimteLinks links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OpenbareRuimteLinks getLinks() {
    return links;
  }


  public void setLinks(OpenbareRuimteLinks links) {
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
    OpenbareRuimteHalBasis openbareRuimteHalBasis = (OpenbareRuimteHalBasis) o;
    return Objects.equals(this.identificatie, openbareRuimteHalBasis.identificatie) &&
        Objects.equals(this.domein, openbareRuimteHalBasis.domein) &&
        Objects.equals(this.naam, openbareRuimteHalBasis.naam) &&
        Objects.equals(this.type, openbareRuimteHalBasis.type) &&
        Objects.equals(this.status, openbareRuimteHalBasis.status) &&
        Objects.equals(this.korteNaam, openbareRuimteHalBasis.korteNaam) &&
        Objects.equals(this.geconstateerd, openbareRuimteHalBasis.geconstateerd) &&
        Objects.equals(this.documentdatum, openbareRuimteHalBasis.documentdatum) &&
        Objects.equals(this.documentnummer, openbareRuimteHalBasis.documentnummer) &&
        Objects.equals(this.woonplaatsIdentificatie, openbareRuimteHalBasis.woonplaatsIdentificatie) &&
        Objects.equals(this.mogelijkOnjuist, openbareRuimteHalBasis.mogelijkOnjuist) &&
        Objects.equals(this.links, openbareRuimteHalBasis.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identificatie, domein, naam, type, status, korteNaam, geconstateerd, documentdatum, documentnummer, woonplaatsIdentificatie, mogelijkOnjuist, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbareRuimteHalBasis {\n");
    sb.append("    identificatie: ").append(toIndentedString(identificatie)).append("\n");
    sb.append("    domein: ").append(toIndentedString(domein)).append("\n");
    sb.append("    naam: ").append(toIndentedString(naam)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    korteNaam: ").append(toIndentedString(korteNaam)).append("\n");
    sb.append("    geconstateerd: ").append(toIndentedString(geconstateerd)).append("\n");
    sb.append("    documentdatum: ").append(toIndentedString(documentdatum)).append("\n");
    sb.append("    documentnummer: ").append(toIndentedString(documentnummer)).append("\n");
    sb.append("    woonplaatsIdentificatie: ").append(toIndentedString(woonplaatsIdentificatie)).append("\n");
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

