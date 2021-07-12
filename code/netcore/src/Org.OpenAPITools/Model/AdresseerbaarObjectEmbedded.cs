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
    /// AdresseerbaarObjectEmbedded
    /// </summary>
    [DataContract(Name = "AdresseerbaarObjectEmbedded")]
    public partial class AdresseerbaarObjectEmbedded : IEquatable<AdresseerbaarObjectEmbedded>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="AdresseerbaarObjectEmbedded" /> class.
        /// </summary>
        /// <param name="adressen">adressen.</param>
        /// <param name="panden">panden.</param>
        public AdresseerbaarObjectEmbedded(List<AdresHalBasis> adressen = default(List<AdresHalBasis>), List<PandHalBasis> panden = default(List<PandHalBasis>))
        {
            this.Adressen = adressen;
            this.Panden = panden;
        }

        /// <summary>
        /// Gets or Sets Adressen
        /// </summary>
        [DataMember(Name = "adressen", EmitDefaultValue = false)]
        public List<AdresHalBasis> Adressen { get; set; }

        /// <summary>
        /// Gets or Sets Panden
        /// </summary>
        [DataMember(Name = "panden", EmitDefaultValue = false)]
        public List<PandHalBasis> Panden { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class AdresseerbaarObjectEmbedded {\n");
            sb.Append("  Adressen: ").Append(Adressen).Append("\n");
            sb.Append("  Panden: ").Append(Panden).Append("\n");
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
            return this.Equals(input as AdresseerbaarObjectEmbedded);
        }

        /// <summary>
        /// Returns true if AdresseerbaarObjectEmbedded instances are equal
        /// </summary>
        /// <param name="input">Instance of AdresseerbaarObjectEmbedded to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AdresseerbaarObjectEmbedded input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Adressen == input.Adressen ||
                    this.Adressen != null &&
                    input.Adressen != null &&
                    this.Adressen.SequenceEqual(input.Adressen)
                ) && 
                (
                    this.Panden == input.Panden ||
                    this.Panden != null &&
                    input.Panden != null &&
                    this.Panden.SequenceEqual(input.Panden)
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
                if (this.Adressen != null)
                    hashCode = hashCode * 59 + this.Adressen.GetHashCode();
                if (this.Panden != null)
                    hashCode = hashCode * 59 + this.Panden.GetHashCode();
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
