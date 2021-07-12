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
    /// AdresseerbaarobjectHalCollectieEmbedded
    /// </summary>
    [DataContract]
    public partial class AdresseerbaarobjectHalCollectieEmbedded :  IEquatable<AdresseerbaarobjectHalCollectieEmbedded>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="AdresseerbaarobjectHalCollectieEmbedded" /> class.
        /// </summary>
        /// <param name="adresseerbareObjecten">adresseerbareObjecten.</param>
        public AdresseerbaarobjectHalCollectieEmbedded(List<AdresseerbaarObjectHal> adresseerbareObjecten = default(List<AdresseerbaarObjectHal>))
        {
            this.AdresseerbareObjecten = adresseerbareObjecten;
        }

        /// <summary>
        /// Gets or Sets AdresseerbareObjecten
        /// </summary>
        [DataMember(Name="adresseerbareObjecten", EmitDefaultValue=false)]
        public List<AdresseerbaarObjectHal> AdresseerbareObjecten { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class AdresseerbaarobjectHalCollectieEmbedded {\n");
            sb.Append("  AdresseerbareObjecten: ").Append(AdresseerbareObjecten).Append("\n");
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
            return this.Equals(input as AdresseerbaarobjectHalCollectieEmbedded);
        }

        /// <summary>
        /// Returns true if AdresseerbaarobjectHalCollectieEmbedded instances are equal
        /// </summary>
        /// <param name="input">Instance of AdresseerbaarobjectHalCollectieEmbedded to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AdresseerbaarobjectHalCollectieEmbedded input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.AdresseerbareObjecten == input.AdresseerbareObjecten ||
                    this.AdresseerbareObjecten != null &&
                    input.AdresseerbareObjecten != null &&
                    this.AdresseerbareObjecten.SequenceEqual(input.AdresseerbareObjecten)
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
                if (this.AdresseerbareObjecten != null)
                    hashCode = hashCode * 59 + this.AdresseerbareObjecten.GetHashCode();
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
