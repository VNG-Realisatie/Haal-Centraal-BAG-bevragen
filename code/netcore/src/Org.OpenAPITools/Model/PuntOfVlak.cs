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
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// Een samengesteld geometriegegevenstype waarbij wordt afgedwongen dat voor de geometrie een keuze gemaakt moet worden tussen een punt of een vlak.
    /// </summary>
    [DataContract(Name = "PuntOfVlak")]
    public partial class PuntOfVlak : IEquatable<PuntOfVlak>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PuntOfVlak" /> class.
        /// </summary>
        /// <param name="punt">punt.</param>
        /// <param name="vlak">vlak.</param>
        public PuntOfVlak(PointGeoJSON punt = default(PointGeoJSON), PolygonGeoJSON vlak = default(PolygonGeoJSON))
        {
            this.Punt = punt;
            this.Vlak = vlak;
        }

        /// <summary>
        /// Gets or Sets Punt
        /// </summary>
        [DataMember(Name = "punt", EmitDefaultValue = false)]
        public PointGeoJSON Punt { get; set; }

        /// <summary>
        /// Gets or Sets Vlak
        /// </summary>
        [DataMember(Name = "vlak", EmitDefaultValue = false)]
        public PolygonGeoJSON Vlak { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PuntOfVlak {\n");
            sb.Append("  Punt: ").Append(Punt).Append("\n");
            sb.Append("  Vlak: ").Append(Vlak).Append("\n");
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
            return this.Equals(input as PuntOfVlak);
        }

        /// <summary>
        /// Returns true if PuntOfVlak instances are equal
        /// </summary>
        /// <param name="input">Instance of PuntOfVlak to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PuntOfVlak input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Punt == input.Punt ||
                    (this.Punt != null &&
                    this.Punt.Equals(input.Punt))
                ) && 
                (
                    this.Vlak == input.Vlak ||
                    (this.Vlak != null &&
                    this.Vlak.Equals(input.Vlak))
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
                if (this.Punt != null)
                    hashCode = hashCode * 59 + this.Punt.GetHashCode();
                if (this.Vlak != null)
                    hashCode = hashCode * 59 + this.Vlak.GetHashCode();
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
            yield break;
        }
    }

}
