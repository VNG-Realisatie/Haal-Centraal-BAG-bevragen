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
    /// NummeraanduidingLinks
    /// </summary>
    [DataContract]
    public partial class NummeraanduidingLinks :  IEquatable<NummeraanduidingLinks>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="NummeraanduidingLinks" /> class.
        /// </summary>
        /// <param name="self">self.</param>
        /// <param name="adres">adres.</param>
        /// <param name="openbareRuimte">openbareRuimte.</param>
        /// <param name="woonplaats">woonplaats.</param>
        public NummeraanduidingLinks(HalLink self = default(HalLink), HalLink adres = default(HalLink), HalLink openbareRuimte = default(HalLink), HalLink woonplaats = default(HalLink))
        {
            this.Self = self;
            this.Adres = adres;
            this.OpenbareRuimte = openbareRuimte;
            this.Woonplaats = woonplaats;
        }

        /// <summary>
        /// Gets or Sets Self
        /// </summary>
        [DataMember(Name="self", EmitDefaultValue=false)]
        public HalLink Self { get; set; }

        /// <summary>
        /// Gets or Sets Adres
        /// </summary>
        [DataMember(Name="adres", EmitDefaultValue=false)]
        public HalLink Adres { get; set; }

        /// <summary>
        /// Gets or Sets OpenbareRuimte
        /// </summary>
        [DataMember(Name="openbareRuimte", EmitDefaultValue=false)]
        public HalLink OpenbareRuimte { get; set; }

        /// <summary>
        /// Gets or Sets Woonplaats
        /// </summary>
        [DataMember(Name="woonplaats", EmitDefaultValue=false)]
        public HalLink Woonplaats { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class NummeraanduidingLinks {\n");
            sb.Append("  Self: ").Append(Self).Append("\n");
            sb.Append("  Adres: ").Append(Adres).Append("\n");
            sb.Append("  OpenbareRuimte: ").Append(OpenbareRuimte).Append("\n");
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
            return this.Equals(input as NummeraanduidingLinks);
        }

        /// <summary>
        /// Returns true if NummeraanduidingLinks instances are equal
        /// </summary>
        /// <param name="input">Instance of NummeraanduidingLinks to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(NummeraanduidingLinks input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Self == input.Self ||
                    (this.Self != null &&
                    this.Self.Equals(input.Self))
                ) && 
                (
                    this.Adres == input.Adres ||
                    (this.Adres != null &&
                    this.Adres.Equals(input.Adres))
                ) && 
                (
                    this.OpenbareRuimte == input.OpenbareRuimte ||
                    (this.OpenbareRuimte != null &&
                    this.OpenbareRuimte.Equals(input.OpenbareRuimte))
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
                if (this.Self != null)
                    hashCode = hashCode * 59 + this.Self.GetHashCode();
                if (this.Adres != null)
                    hashCode = hashCode * 59 + this.Adres.GetHashCode();
                if (this.OpenbareRuimte != null)
                    hashCode = hashCode * 59 + this.OpenbareRuimte.GetHashCode();
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
