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
    /// PolygonGeoJSON
    /// </summary>
    [DataContract]
    public partial class PolygonGeoJSON :  IEquatable<PolygonGeoJSON>, IValidatableObject
    {
        /// <summary>
        /// Defines Type
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum TypeEnum
        {
            /// <summary>
            /// Enum Polygon for value: Polygon
            /// </summary>
            [EnumMember(Value = "Polygon")]
            Polygon = 1

        }

        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [DataMember(Name="type", EmitDefaultValue=true)]
        public TypeEnum Type { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="PolygonGeoJSON" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected PolygonGeoJSON() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="PolygonGeoJSON" /> class.
        /// </summary>
        /// <param name="type">type (required).</param>
        /// <param name="coordinates">coordinates (required).</param>
        public PolygonGeoJSON(TypeEnum type = default(TypeEnum), List<List<List<decimal>>> coordinates = default(List<List<List<decimal>>>))
        {
            // to ensure "type" is required (not null)
            if (type == null)
            {
                throw new InvalidDataException("type is a required property for PolygonGeoJSON and cannot be null");
            }
            else
            {
                this.Type = type;
            }

            // to ensure "coordinates" is required (not null)
            if (coordinates == null)
            {
                throw new InvalidDataException("coordinates is a required property for PolygonGeoJSON and cannot be null");
            }
            else
            {
                this.Coordinates = coordinates;
            }

        }


        /// <summary>
        /// Gets or Sets Coordinates
        /// </summary>
        [DataMember(Name="coordinates", EmitDefaultValue=true)]
        public List<List<List<decimal>>> Coordinates { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PolygonGeoJSON {\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  Coordinates: ").Append(Coordinates).Append("\n");
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
            return this.Equals(input as PolygonGeoJSON);
        }

        /// <summary>
        /// Returns true if PolygonGeoJSON instances are equal
        /// </summary>
        /// <param name="input">Instance of PolygonGeoJSON to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PolygonGeoJSON input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Type == input.Type ||
                    (this.Type != null &&
                    this.Type.Equals(input.Type))
                ) && 
                (
                    this.Coordinates == input.Coordinates ||
                    this.Coordinates != null &&
                    input.Coordinates != null &&
                    this.Coordinates.SequenceEqual(input.Coordinates)
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
                if (this.Type != null)
                    hashCode = hashCode * 59 + this.Type.GetHashCode();
                if (this.Coordinates != null)
                    hashCode = hashCode * 59 + this.Coordinates.GetHashCode();
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
