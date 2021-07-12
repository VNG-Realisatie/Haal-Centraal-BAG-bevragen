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
    /// AdresEmbedded
    /// </summary>
    [DataContract]
    public partial class AdresEmbedded :  IEquatable<AdresEmbedded>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="AdresEmbedded" /> class.
        /// </summary>
        /// <param name="openbareRuimte">openbareRuimte.</param>
        /// <param name="nummeraanduiding">nummeraanduiding.</param>
        /// <param name="woonplaats">woonplaats.</param>
        public AdresEmbedded(OpenbareRuimteHalBasis openbareRuimte = default(OpenbareRuimteHalBasis), NummeraanduidingHalBasis nummeraanduiding = default(NummeraanduidingHalBasis), WoonplaatsHalBasis woonplaats = default(WoonplaatsHalBasis))
        {
            this.OpenbareRuimte = openbareRuimte;
            this.Nummeraanduiding = nummeraanduiding;
            this.Woonplaats = woonplaats;
        }

        /// <summary>
        /// Gets or Sets OpenbareRuimte
        /// </summary>
        [DataMember(Name="openbareRuimte", EmitDefaultValue=false)]
        public OpenbareRuimteHalBasis OpenbareRuimte { get; set; }

        /// <summary>
        /// Gets or Sets Nummeraanduiding
        /// </summary>
        [DataMember(Name="nummeraanduiding", EmitDefaultValue=false)]
        public NummeraanduidingHalBasis Nummeraanduiding { get; set; }

        /// <summary>
        /// Gets or Sets Woonplaats
        /// </summary>
        [DataMember(Name="woonplaats", EmitDefaultValue=false)]
        public WoonplaatsHalBasis Woonplaats { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class AdresEmbedded {\n");
            sb.Append("  OpenbareRuimte: ").Append(OpenbareRuimte).Append("\n");
            sb.Append("  Nummeraanduiding: ").Append(Nummeraanduiding).Append("\n");
            sb.Append("  Woonplaats: ").Append(Woonplaats).Append("\n");
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
            return this.Equals(input as AdresEmbedded);
        }

        /// <summary>
        /// Returns true if AdresEmbedded instances are equal
        /// </summary>
        /// <param name="input">Instance of AdresEmbedded to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AdresEmbedded input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.OpenbareRuimte == input.OpenbareRuimte ||
                    (this.OpenbareRuimte != null &&
                    this.OpenbareRuimte.Equals(input.OpenbareRuimte))
                ) && 
                (
                    this.Nummeraanduiding == input.Nummeraanduiding ||
                    (this.Nummeraanduiding != null &&
                    this.Nummeraanduiding.Equals(input.Nummeraanduiding))
                ) && 
                (
                    this.Woonplaats == input.Woonplaats ||
                    (this.Woonplaats != null &&
                    this.Woonplaats.Equals(input.Woonplaats))
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
                if (this.OpenbareRuimte != null)
                    hashCode = hashCode * 59 + this.OpenbareRuimte.GetHashCode();
                if (this.Nummeraanduiding != null)
                    hashCode = hashCode * 59 + this.Nummeraanduiding.GetHashCode();
                if (this.Woonplaats != null)
                    hashCode = hashCode * 59 + this.Woonplaats.GetHashCode();
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
