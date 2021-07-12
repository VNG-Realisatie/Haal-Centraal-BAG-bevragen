/*
 * Huidige bevragingen API
 *
 * Deze API levert actuele gegevens over adressen, adresseerbare objecten en panden. Actueel betekent in deze API `zonder eindstatus`. De bron voor deze API is de basisregistratie adressen en gebouwen (BAG).
 *
 * The version of the OpenAPI document: 1.2.0
 * Contact: bag@kadaster.nl
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// Een buitenruimte met een naam die binnen één woonplaats ligt, bijvoorbeeld een straat of een plein.
    /// </summary>
    [DataContract]
    public partial class OpenbareRuimte :  IEquatable<OpenbareRuimte>, IValidatableObject
    {
        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [DataMember(Name="type", EmitDefaultValue=false)]
        public TypeOpenbareRuimteEnum? Type { get; set; }
        /// <summary>
        /// Gets or Sets Status
        /// </summary>
        [DataMember(Name="status", EmitDefaultValue=false)]
        public StatusNaamgevingEnum? Status { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="OpenbareRuimte" /> class.
        /// </summary>
        /// <param name="identificatie">identificatie.</param>
        /// <param name="domein">Het domein waartoe de identificatie behoort..</param>
        /// <param name="naam">De naam die door de gemeente aan een openbare ruimte is gegeven..</param>
        /// <param name="type">type.</param>
        /// <param name="status">status.</param>
        /// <param name="korteNaam">De officiële openbareruimtenaam of een verkorte versie. Beiden hebben maximaal 24 tekens..</param>
        /// <param name="geconstateerd">Indicator dat een openbare ruimte in de registratie is opgenomen door een feitelijke constatering, zonder dat er een brondocument aan ten grondslag ligt. De openbare ruimte is mogelijk illegaal..</param>
        /// <param name="documentdatum">De vaststellingsdatum van het brondocument dat de basis is voor opname, wijziging of een verwijdering van een object..</param>
        /// <param name="documentnummer">De unieke aanduiding van het brondocument op basis waarvan een opname, mutatie of een verwijdering van gegevens ten aanzien van een woonplaats heeft plaatsgevonden, binnen een gemeente. Alle karakters uit de MES-1 karakterset zijn toegestaan..</param>
        /// <param name="woonplaatsIdentificatie">Een openbare ruimte ligt in een woonplaats..</param>
        /// <param name="mogelijkOnjuist">mogelijkOnjuist.</param>
        public OpenbareRuimte(string identificatie = default(string), string domein = default(string), string naam = default(string), TypeOpenbareRuimteEnum? type = default(TypeOpenbareRuimteEnum?), StatusNaamgevingEnum? status = default(StatusNaamgevingEnum?), string korteNaam = default(string), bool geconstateerd = default(bool), DateTime documentdatum = default(DateTime), string documentnummer = default(string), string woonplaatsIdentificatie = default(string), OpenbareRuimteMogelijkOnjuist mogelijkOnjuist = default(OpenbareRuimteMogelijkOnjuist))
        {
            this.Identificatie = identificatie;
            this.Domein = domein;
            this.Naam = naam;
            this.Type = type;
            this.Status = status;
            this.KorteNaam = korteNaam;
            this.Geconstateerd = geconstateerd;
            this.Documentdatum = documentdatum;
            this.Documentnummer = documentnummer;
            this.WoonplaatsIdentificatie = woonplaatsIdentificatie;
            this.MogelijkOnjuist = mogelijkOnjuist;
        }

        /// <summary>
        /// Gets or Sets Identificatie
        /// </summary>
        [DataMember(Name="identificatie", EmitDefaultValue=false)]
        public string Identificatie { get; set; }

        /// <summary>
        /// Het domein waartoe de identificatie behoort.
        /// </summary>
        /// <value>Het domein waartoe de identificatie behoort.</value>
        [DataMember(Name="domein", EmitDefaultValue=false)]
        public string Domein { get; set; }

        /// <summary>
        /// De naam die door de gemeente aan een openbare ruimte is gegeven.
        /// </summary>
        /// <value>De naam die door de gemeente aan een openbare ruimte is gegeven.</value>
        [DataMember(Name="naam", EmitDefaultValue=false)]
        public string Naam { get; set; }



        /// <summary>
        /// De officiële openbareruimtenaam of een verkorte versie. Beiden hebben maximaal 24 tekens.
        /// </summary>
        /// <value>De officiële openbareruimtenaam of een verkorte versie. Beiden hebben maximaal 24 tekens.</value>
        [DataMember(Name="korteNaam", EmitDefaultValue=false)]
        public string KorteNaam { get; set; }

        /// <summary>
        /// Indicator dat een openbare ruimte in de registratie is opgenomen door een feitelijke constatering, zonder dat er een brondocument aan ten grondslag ligt. De openbare ruimte is mogelijk illegaal.
        /// </summary>
        /// <value>Indicator dat een openbare ruimte in de registratie is opgenomen door een feitelijke constatering, zonder dat er een brondocument aan ten grondslag ligt. De openbare ruimte is mogelijk illegaal.</value>
        [DataMember(Name="geconstateerd", EmitDefaultValue=false)]
        public bool Geconstateerd { get; set; }

        /// <summary>
        /// De vaststellingsdatum van het brondocument dat de basis is voor opname, wijziging of een verwijdering van een object.
        /// </summary>
        /// <value>De vaststellingsdatum van het brondocument dat de basis is voor opname, wijziging of een verwijdering van een object.</value>
        [DataMember(Name="documentdatum", EmitDefaultValue=false)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime Documentdatum { get; set; }

        /// <summary>
        /// De unieke aanduiding van het brondocument op basis waarvan een opname, mutatie of een verwijdering van gegevens ten aanzien van een woonplaats heeft plaatsgevonden, binnen een gemeente. Alle karakters uit de MES-1 karakterset zijn toegestaan.
        /// </summary>
        /// <value>De unieke aanduiding van het brondocument op basis waarvan een opname, mutatie of een verwijdering van gegevens ten aanzien van een woonplaats heeft plaatsgevonden, binnen een gemeente. Alle karakters uit de MES-1 karakterset zijn toegestaan.</value>
        [DataMember(Name="documentnummer", EmitDefaultValue=false)]
        public string Documentnummer { get; set; }

        /// <summary>
        /// Een openbare ruimte ligt in een woonplaats.
        /// </summary>
        /// <value>Een openbare ruimte ligt in een woonplaats.</value>
        [DataMember(Name="woonplaatsIdentificatie", EmitDefaultValue=false)]
        public string WoonplaatsIdentificatie { get; set; }

        /// <summary>
        /// Gets or Sets MogelijkOnjuist
        /// </summary>
        [DataMember(Name="mogelijkOnjuist", EmitDefaultValue=false)]
        public OpenbareRuimteMogelijkOnjuist MogelijkOnjuist { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class OpenbareRuimte {\n");
            sb.Append("  Identificatie: ").Append(Identificatie).Append("\n");
            sb.Append("  Domein: ").Append(Domein).Append("\n");
            sb.Append("  Naam: ").Append(Naam).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("  KorteNaam: ").Append(KorteNaam).Append("\n");
            sb.Append("  Geconstateerd: ").Append(Geconstateerd).Append("\n");
            sb.Append("  Documentdatum: ").Append(Documentdatum).Append("\n");
            sb.Append("  Documentnummer: ").Append(Documentnummer).Append("\n");
            sb.Append("  WoonplaatsIdentificatie: ").Append(WoonplaatsIdentificatie).Append("\n");
            sb.Append("  MogelijkOnjuist: ").Append(MogelijkOnjuist).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as OpenbareRuimte);
        }

        /// <summary>
        /// Returns true if OpenbareRuimte instances are equal
        /// </summary>
        /// <param name="input">Instance of OpenbareRuimte to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(OpenbareRuimte input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Identificatie == input.Identificatie ||
                    (this.Identificatie != null &&
                    this.Identificatie.Equals(input.Identificatie))
                ) && 
                (
                    this.Domein == input.Domein ||
                    (this.Domein != null &&
                    this.Domein.Equals(input.Domein))
                ) && 
                (
                    this.Naam == input.Naam ||
                    (this.Naam != null &&
                    this.Naam.Equals(input.Naam))
                ) && 
                (
                    this.Type == input.Type ||
                    (this.Type != null &&
                    this.Type.Equals(input.Type))
                ) && 
                (
                    this.Status == input.Status ||
                    (this.Status != null &&
                    this.Status.Equals(input.Status))
                ) && 
                (
                    this.KorteNaam == input.KorteNaam ||
                    (this.KorteNaam != null &&
                    this.KorteNaam.Equals(input.KorteNaam))
                ) && 
                (
                    this.Geconstateerd == input.Geconstateerd ||
                    (this.Geconstateerd != null &&
                    this.Geconstateerd.Equals(input.Geconstateerd))
                ) && 
                (
                    this.Documentdatum == input.Documentdatum ||
                    (this.Documentdatum != null &&
                    this.Documentdatum.Equals(input.Documentdatum))
                ) && 
                (
                    this.Documentnummer == input.Documentnummer ||
                    (this.Documentnummer != null &&
                    this.Documentnummer.Equals(input.Documentnummer))
                ) && 
                (
                    this.WoonplaatsIdentificatie == input.WoonplaatsIdentificatie ||
                    (this.WoonplaatsIdentificatie != null &&
                    this.WoonplaatsIdentificatie.Equals(input.WoonplaatsIdentificatie))
                ) && 
                (
                    this.MogelijkOnjuist == input.MogelijkOnjuist ||
                    (this.MogelijkOnjuist != null &&
                    this.MogelijkOnjuist.Equals(input.MogelijkOnjuist))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.Identificatie != null)
                    hashCode = hashCode * 59 + this.Identificatie.GetHashCode();
                if (this.Domein != null)
                    hashCode = hashCode * 59 + this.Domein.GetHashCode();
                if (this.Naam != null)
                    hashCode = hashCode * 59 + this.Naam.GetHashCode();
                if (this.Type != null)
                    hashCode = hashCode * 59 + this.Type.GetHashCode();
                if (this.Status != null)
                    hashCode = hashCode * 59 + this.Status.GetHashCode();
                if (this.KorteNaam != null)
                    hashCode = hashCode * 59 + this.KorteNaam.GetHashCode();
                if (this.Geconstateerd != null)
                    hashCode = hashCode * 59 + this.Geconstateerd.GetHashCode();
                if (this.Documentdatum != null)
                    hashCode = hashCode * 59 + this.Documentdatum.GetHashCode();
                if (this.Documentnummer != null)
                    hashCode = hashCode * 59 + this.Documentnummer.GetHashCode();
                if (this.WoonplaatsIdentificatie != null)
                    hashCode = hashCode * 59 + this.WoonplaatsIdentificatie.GetHashCode();
                if (this.MogelijkOnjuist != null)
                    hashCode = hashCode * 59 + this.MogelijkOnjuist.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            // KorteNaam (string) maxLength
            if(this.KorteNaam != null && this.KorteNaam.Length > 24)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for KorteNaam, length must be less than 24.", new [] { "KorteNaam" });
            }

 
            yield break;
        }
    }

}
