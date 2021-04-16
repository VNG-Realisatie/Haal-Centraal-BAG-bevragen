"""
    Huidige bevragingen API

    Deze API levert actuele gegevens over adressen, adresseerbare objecten en panden. Actueel betekent in deze API `zonder eindstatus`. De bron voor deze API is de basisregistratie adressen en gebouwen (BAG).  # noqa: E501

    The version of the OpenAPI document: 1.1.0
    Contact: bag@kadaster.nl
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401

from openapi_client.model_utils import (  # noqa: F401
    ApiTypeError,
    ModelComposed,
    ModelNormal,
    ModelSimple,
    cached_property,
    change_keys_js_to_python,
    convert_js_args_to_python_args,
    date,
    datetime,
    file_type,
    none_type,
    validate_get_composed_info,
)

def lazy_import():
    from openapi_client.model.adres_embedded import AdresEmbedded
    from openapi_client.model.adres_hal_all_of import AdresHalAllOf
    from openapi_client.model.adres_hal_basis import AdresHalBasis
    from openapi_client.model.adres_links import AdresLinks
    from openapi_client.model.adres_mogelijk_onjuist import AdresMogelijkOnjuist
    globals()['AdresEmbedded'] = AdresEmbedded
    globals()['AdresHalAllOf'] = AdresHalAllOf
    globals()['AdresHalBasis'] = AdresHalBasis
    globals()['AdresLinks'] = AdresLinks
    globals()['AdresMogelijkOnjuist'] = AdresMogelijkOnjuist


class AdresHal(ModelComposed):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.

    Attributes:
      allowed_values (dict): The key is the tuple path to the attribute
          and the for var_name this is (var_name,). The value is a dict
          with a capitalized key describing the allowed value and an allowed
          value. These dicts store the allowed enum values.
      attribute_map (dict): The key is attribute name
          and the value is json key in definition.
      discriminator_value_class_map (dict): A dict to go from the discriminator
          variable value to the discriminator class name.
      validations (dict): The key is the tuple path to the attribute
          and the for var_name this is (var_name,). The value is a dict
          that stores validations for max_length, min_length, max_items,
          min_items, exclusive_maximum, inclusive_maximum, exclusive_minimum,
          inclusive_minimum, and regex.
      additional_properties_type (tuple): A tuple of classes accepted
          as additional properties values.
    """

    allowed_values = {
    }

    validations = {
        ('korte_naam',): {
            'max_length': 24,
        },
    }

    @cached_property
    def additional_properties_type():
        """
        This must be a method because a model may have properties that are
        of type self, this must run after the class is loaded
        """
        lazy_import()
        return (bool, date, datetime, dict, float, int, list, str, none_type,)  # noqa: E501

    _nullable = False

    @cached_property
    def openapi_types():
        """
        This must be a method because a model may have properties that are
        of type self, this must run after the class is loaded

        Returns
            openapi_types (dict): The key is attribute name
                and the value is attribute type.
        """
        lazy_import()
        return {
            'straat': (str,),  # noqa: E501
            'huisnummer': (int,),  # noqa: E501
            'huisletter': (str,),  # noqa: E501
            'huisnummertoevoeging': (str,),  # noqa: E501
            'postcode': (str,),  # noqa: E501
            'woonplaats': (str,),  # noqa: E501
            'korte_naam': (str,),  # noqa: E501
            'nummeraanduiding_identificatie': (str,),  # noqa: E501
            'openbare_ruimte_identificatie': (str,),  # noqa: E501
            'woonplaats_identificatie': (str,),  # noqa: E501
            'adresseerbaar_object_identificatie': (str,),  # noqa: E501
            'pand_identificaties': ([str],),  # noqa: E501
            'is_nevenadres': (bool,),  # noqa: E501
            'geconstateerd': (bool,),  # noqa: E501
            'mogelijk_onjuist': (AdresMogelijkOnjuist,),  # noqa: E501
            'links': (AdresLinks,),  # noqa: E501
            'embedded': (AdresEmbedded,),  # noqa: E501
        }

    @cached_property
    def discriminator():
        return None


    attribute_map = {
        'straat': 'straat',  # noqa: E501
        'huisnummer': 'huisnummer',  # noqa: E501
        'huisletter': 'huisletter',  # noqa: E501
        'huisnummertoevoeging': 'huisnummertoevoeging',  # noqa: E501
        'postcode': 'postcode',  # noqa: E501
        'woonplaats': 'woonplaats',  # noqa: E501
        'korte_naam': 'korteNaam',  # noqa: E501
        'nummeraanduiding_identificatie': 'nummeraanduidingIdentificatie',  # noqa: E501
        'openbare_ruimte_identificatie': 'openbareRuimteIdentificatie',  # noqa: E501
        'woonplaats_identificatie': 'woonplaatsIdentificatie',  # noqa: E501
        'adresseerbaar_object_identificatie': 'adresseerbaarObjectIdentificatie',  # noqa: E501
        'pand_identificaties': 'pandIdentificaties',  # noqa: E501
        'is_nevenadres': 'isNevenadres',  # noqa: E501
        'geconstateerd': 'geconstateerd',  # noqa: E501
        'mogelijk_onjuist': 'mogelijkOnjuist',  # noqa: E501
        'links': '_links',  # noqa: E501
        'embedded': '_embedded',  # noqa: E501
    }

    required_properties = set([
        '_data_store',
        '_check_type',
        '_spec_property_naming',
        '_path_to_item',
        '_configuration',
        '_visited_composed_classes',
        '_composed_instances',
        '_var_name_to_model_instances',
        '_additional_properties_model_instances',
    ])

    @convert_js_args_to_python_args
    def __init__(self, *args, **kwargs):  # noqa: E501
        """AdresHal - a model defined in OpenAPI

        Keyword Args:
            _check_type (bool): if True, values for parameters in openapi_types
                                will be type checked and a TypeError will be
                                raised if the wrong type is input.
                                Defaults to True
            _path_to_item (tuple/list): This is a list of keys or values to
                                drill down to the model in received_data
                                when deserializing a response
            _spec_property_naming (bool): True if the variable names in the input data
                                are serialized names, as specified in the OpenAPI document.
                                False if the variable names in the input data
                                are pythonic names, e.g. snake case (default)
            _configuration (Configuration): the instance to use when
                                deserializing a file_type parameter.
                                If passed, type conversion is attempted
                                If omitted no type conversion is done.
            _visited_composed_classes (tuple): This stores a tuple of
                                classes that we have traveled through so that
                                if we see that class again we will not use its
                                discriminator again.
                                When traveling through a discriminator, the
                                composed schema that is
                                is traveled through is added to this set.
                                For example if Animal has a discriminator
                                petType and we pass in "Dog", and the class Dog
                                allOf includes Animal, we move through Animal
                                once using the discriminator, and pick Dog.
                                Then in Dog, we will make an instance of the
                                Animal class but this time we won't travel
                                through its discriminator because we passed in
                                _visited_composed_classes = (Animal,)
            straat (str): Een naam die door de gemeente aan een openbare ruimte is gegeven.. [optional]  # noqa: E501
            huisnummer (int): Een nummer dat door de gemeente aan een adresseerbaar object is gegeven.. [optional]  # noqa: E501
            huisletter (str): Een toevoeging aan een huisnummer in de vorm van een letter die door de gemeente aan een adresseerbaar object is gegeven.. [optional]  # noqa: E501
            huisnummertoevoeging (str): Een toevoeging aan een huisnummer of een combinatie van huisnummer en huisletter die door de gemeente aan een adresseerbaar object is gegeven.. [optional]  # noqa: E501
            postcode (str): De door PostNL vastgestelde code die bij een bepaalde combinatie van een straatnaam en een huisnummer hoort.. [optional]  # noqa: E501
            woonplaats (str): Een woonplaats is een gedeelte van het grondgebied van de gemeente met een naam.. [optional]  # noqa: E501
            korte_naam (str): De officiële openbareruimtenaam of een verkorte versie. Beiden hebben maximaal 24 tekens.. [optional]  # noqa: E501
            nummeraanduiding_identificatie (str): Fungeert ook als identificatie van het adres.. [optional]  # noqa: E501
            openbare_ruimte_identificatie (str): [optional]  # noqa: E501
            woonplaats_identificatie (str): [optional]  # noqa: E501
            adresseerbaar_object_identificatie (str): [optional]  # noqa: E501
            pand_identificaties ([str]): Identificatie(s) van het pand of de panden waar het verblijfsobject deel van is.. [optional]  # noqa: E501
            is_nevenadres (bool): Indicatie dat dit adres een nevenadres is van een adresseerbaar object. Het adres is een hoofdadres als deze indicatie niet wordt meegeleverd.. [optional]  # noqa: E501
            geconstateerd (bool): Indicatie dat dit adres in de registratie is opgenomen door een feitelijke constatering, zonder dat er sprake was van een brondocument/vergunning. Het adres is mogelijk illegaal.. [optional]  # noqa: E501
            mogelijk_onjuist (AdresMogelijkOnjuist): [optional]  # noqa: E501
            links (AdresLinks): [optional]  # noqa: E501
            embedded (AdresEmbedded): [optional]  # noqa: E501
        """

        _check_type = kwargs.pop('_check_type', True)
        _spec_property_naming = kwargs.pop('_spec_property_naming', False)
        _path_to_item = kwargs.pop('_path_to_item', ())
        _configuration = kwargs.pop('_configuration', None)
        _visited_composed_classes = kwargs.pop('_visited_composed_classes', ())

        if args:
            raise ApiTypeError(
                "Invalid positional arguments=%s passed to %s. Remove those invalid positional arguments." % (
                    args,
                    self.__class__.__name__,
                ),
                path_to_item=_path_to_item,
                valid_classes=(self.__class__,),
            )

        self._data_store = {}
        self._check_type = _check_type
        self._spec_property_naming = _spec_property_naming
        self._path_to_item = _path_to_item
        self._configuration = _configuration
        self._visited_composed_classes = _visited_composed_classes + (self.__class__,)

        constant_args = {
            '_check_type': _check_type,
            '_path_to_item': _path_to_item,
            '_spec_property_naming': _spec_property_naming,
            '_configuration': _configuration,
            '_visited_composed_classes': self._visited_composed_classes,
        }
        required_args = {
        }
        model_args = {}
        model_args.update(required_args)
        model_args.update(kwargs)
        composed_info = validate_get_composed_info(
            constant_args, model_args, self)
        self._composed_instances = composed_info[0]
        self._var_name_to_model_instances = composed_info[1]
        self._additional_properties_model_instances = composed_info[2]
        unused_args = composed_info[3]

        for var_name, var_value in required_args.items():
            setattr(self, var_name, var_value)
        for var_name, var_value in kwargs.items():
            if var_name in unused_args and \
                        self._configuration is not None and \
                        self._configuration.discard_unknown_keys and \
                        not self._additional_properties_model_instances:
                # discard variable.
                continue
            setattr(self, var_name, var_value)

    @cached_property
    def _composed_schemas():
        # we need this here to make our import statements work
        # we must store _composed_schemas in here so the code is only run
        # when we invoke this method. If we kept this at the class
        # level we would get an error beause the class level
        # code would be run when this module is imported, and these composed
        # classes don't exist yet because their module has not finished
        # loading
        lazy_import()
        return {
          'anyOf': [
          ],
          'allOf': [
              AdresHalAllOf,
              AdresHalBasis,
          ],
          'oneOf': [
          ],
        }
