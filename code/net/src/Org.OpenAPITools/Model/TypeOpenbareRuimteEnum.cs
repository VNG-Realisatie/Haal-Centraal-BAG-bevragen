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
    /// Een codering van de verschillende waarden die de typering van een openbare ruimte kan aannemen.
    /// </summary>
    /// <value>Een codering van de verschillende waarden die de typering van een openbare ruimte kan aannemen.</value>
    
    [JsonConverter(typeof(StringEnumConverter))]
    
    public enum TypeOpenbareRuimteEnum
    {
        /// <summary>
        /// Enum Weg for value: Weg
        /// </summary>
        [EnumMember(Value = "Weg")]
        Weg = 1,

        /// <summary>
        /// Enum Water for value: Water
        /// </summary>
        [EnumMember(Value = "Water")]
        Water = 2,

        /// <summary>
        /// Enum Spoorbaan for value: Spoorbaan
        /// </summary>
        [EnumMember(Value = "Spoorbaan")]
        Spoorbaan = 3,

        /// <summary>
        /// Enum Terrein for value: Terrein
        /// </summary>
        [EnumMember(Value = "Terrein")]
        Terrein = 4,

        /// <summary>
        /// Enum Kunstwerk for value: Kunstwerk
        /// </summary>
        [EnumMember(Value = "Kunstwerk")]
        Kunstwerk = 5,

        /// <summary>
        /// Enum Landschappelijkgebied for value: Landschappelijk gebied
        /// </summary>
        [EnumMember(Value = "Landschappelijk gebied")]
        Landschappelijkgebied = 6,

        /// <summary>
        /// Enum Administratiefgebied for value: Administratief gebied
        /// </summary>
        [EnumMember(Value = "Administratief gebied")]
        Administratiefgebied = 7

    }

}
