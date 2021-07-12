"""
    Huidige bevragingen API

    Deze API levert actuele gegevens over adressen, adresseerbare objecten en panden. Actueel betekent in deze API `zonder eindstatus`. De bron voor deze API is de basisregistratie adressen en gebouwen (BAG).  # noqa: E501

    The version of the OpenAPI document: 1.2.0
    Contact: bag@kadaster.nl
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401

from openapi_client.api_client import ApiClient, Endpoint as _Endpoint
from openapi_client.model_utils import (  # noqa: F401
    check_allowed_values,
    check_validations,
    date,
    datetime,
    file_type,
    none_type,
    validate_and_convert_types
)
from openapi_client.model.adresseerbaar_object_hal import AdresseerbaarObjectHal
from openapi_client.model.adresseerbaarobject_hal_collectie import AdresseerbaarobjectHalCollectie
from openapi_client.model.bad_request_foutbericht import BadRequestFoutbericht
from openapi_client.model.crs_enum import CrsEnum
from openapi_client.model.foutbericht import Foutbericht


class AdresseerbaarObjectApi(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

        def __raadpleeg_adresseerbaarobject(
            self,
            adresseerbaarobjectidentificatie,
            **kwargs
        ):
            """levert een verblijfsobject, standplaats of ligplaats  # noqa: E501

            Raadpleeg een actueel adresseerbaar object met de identificatie. Dit is de identificatie van een verblijfsobject, ligplaats of standplaats. Gebruik de fields-parameter als je alleen specifieke velden in het antwoord wil zien, zie [functionele specificaties fields-parameter](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.3.0/features/fields.feature). Gebruik de expand-parameter als je het antwoord wil uitbreiden met (delen van) de gerelateerde resources adres en pand, zie [functionele specificaties expand-parameter](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.3.0/features/expand.feature).  # noqa: E501
            This method makes a synchronous HTTP request by default. To make an
            asynchronous HTTP request, please pass async_req=True

            >>> thread = api.raadpleeg_adresseerbaarobject(adresseerbaarobjectidentificatie, async_req=True)
            >>> result = thread.get()

            Args:
                adresseerbaarobjectidentificatie (str): De identificatie van een adresserbaar object uit de BAG. Deze is 16 cijfers lang en kan een verblijfsobject, een standplaats of een ligplaats zijn.

            Keyword Args:
                expand (str): Hiermee kun je opgeven welke gerelateerde resources meegeleverd moeten worden, en hun inhoud naar behoefte aanpassen. Hele resources of enkele properties geef je in de expand parameter kommagescheiden op. Properties die je wil ontvangen geef je op met de resource-naam gevolgd door de property naam, met daartussen een punt. In de definitie van het antwoord kun je bij _embedded zien welke gerelateerde resources meegeleverd kunnen worden. Zie [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.3.0/features/expand.feature).. [optional]
                fields (str): Hiermee kun je de inhoud van de resource naar behoefte aanpassen door een door komma's gescheiden lijst van property namen op te geven. Bij opgave van niet-bestaande properties wordt een 400 Bad Request teruggegeven. Wanneer de fields parameter niet is opgegeven, worden alle properties met een waarde teruggegeven. Zie [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.3.0/features/fields.feature). [optional]
                accept_crs (CrsEnum): Gewenste CRS van de coördinaten in de response.. [optional]
                _return_http_data_only (bool): response data without head status
                    code and headers. Default is True.
                _preload_content (bool): if False, the urllib3.HTTPResponse object
                    will be returned without reading/decoding response data.
                    Default is True.
                _request_timeout (int/float/tuple): timeout setting for this request. If
                    one number provided, it will be total request timeout. It can also
                    be a pair (tuple) of (connection, read) timeouts.
                    Default is None.
                _check_input_type (bool): specifies if type checking
                    should be done one the data sent to the server.
                    Default is True.
                _check_return_type (bool): specifies if type checking
                    should be done one the data received from the server.
                    Default is True.
                _host_index (int/None): specifies the index of the server
                    that we want to use.
                    Default is read from the configuration.
                async_req (bool): execute request asynchronously

            Returns:
                AdresseerbaarObjectHal
                    If the method is called asynchronously, returns the request
                    thread.
            """
            kwargs['async_req'] = kwargs.get(
                'async_req', False
            )
            kwargs['_return_http_data_only'] = kwargs.get(
                '_return_http_data_only', True
            )
            kwargs['_preload_content'] = kwargs.get(
                '_preload_content', True
            )
            kwargs['_request_timeout'] = kwargs.get(
                '_request_timeout', None
            )
            kwargs['_check_input_type'] = kwargs.get(
                '_check_input_type', True
            )
            kwargs['_check_return_type'] = kwargs.get(
                '_check_return_type', True
            )
            kwargs['_host_index'] = kwargs.get('_host_index')
            kwargs['adresseerbaarobjectidentificatie'] = \
                adresseerbaarobjectidentificatie
            return self.call_with_http_info(**kwargs)

        self.raadpleeg_adresseerbaarobject = _Endpoint(
            settings={
                'response_type': (AdresseerbaarObjectHal,),
                'auth': [
                    'apiKeyBAG'
                ],
                'endpoint_path': '/adresseerbareobjecten/{adresseerbaarobjectidentificatie}',
                'operation_id': 'raadpleeg_adresseerbaarobject',
                'http_method': 'GET',
                'servers': None,
            },
            params_map={
                'all': [
                    'adresseerbaarobjectidentificatie',
                    'expand',
                    'fields',
                    'accept_crs',
                ],
                'required': [
                    'adresseerbaarobjectidentificatie',
                ],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                    'adresseerbaarobjectidentificatie',
                ]
            },
            root_map={
                'validations': {
                    ('adresseerbaarobjectidentificatie',): {

                        'regex': {
                            'pattern': r'^[0-9]{16}$',  # noqa: E501
                        },
                    },
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'adresseerbaarobjectidentificatie':
                        (str,),
                    'expand':
                        (str,),
                    'fields':
                        (str,),
                    'accept_crs':
                        (CrsEnum,),
                },
                'attribute_map': {
                    'adresseerbaarobjectidentificatie': 'adresseerbaarobjectidentificatie',
                    'expand': 'expand',
                    'fields': 'fields',
                    'accept_crs': 'Accept-Crs',
                },
                'location_map': {
                    'adresseerbaarobjectidentificatie': 'path',
                    'expand': 'query',
                    'fields': 'query',
                    'accept_crs': 'header',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/hal+json',
                    'application/problem+json'
                ],
                'content_type': [],
            },
            api_client=api_client,
            callable=__raadpleeg_adresseerbaarobject
        )

        def __raadpleeg_adresseerbareobjecten(
            self,
            **kwargs
        ):
            """vindt verblijfsobjecten, ligplaatsen, standplaatsen  # noqa: E501

            Zoek actuele adresseerbare objecten (verblijfsobjecten, standplaatsen of ligplaatsen) met een nummeraanduidingidentificatie of pandidentificatie. Gebruik de fields-parameter als je alleen specifieke velden in het antwoord wil zien, zie [functionele specificaties fields-parameter](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.3.0/features/fields.feature). Gebruik de expand-parameter als je het antwoord wil uitbreiden met (delen van) de gerelateerde resources adres en pand, zie [functionele specificaties expand-parameter](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.3.0/features/expand.feature).  # noqa: E501
            This method makes a synchronous HTTP request by default. To make an
            asynchronous HTTP request, please pass async_req=True

            >>> thread = api.raadpleeg_adresseerbareobjecten(async_req=True)
            >>> result = thread.get()


            Keyword Args:
                nummeraanduiding_identificatie (str): Identificatie van een nummeraanduiding uit de BAG. Deze is 16 cijfers lang.. [optional]
                pand_identificatie (str): Identificatie van een pand uit de BAG. Deze is 16 cijfers lang.. [optional]
                expand (str): Hiermee kun je opgeven welke gerelateerde resources meegeleverd moeten worden, en hun inhoud naar behoefte aanpassen. Hele resources of enkele properties geef je in de expand parameter kommagescheiden op. Properties die je wil ontvangen geef je op met de resource-naam gevolgd door de property naam, met daartussen een punt. In de definitie van het antwoord kun je bij _embedded zien welke gerelateerde resources meegeleverd kunnen worden. Zie [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.3.0/features/expand.feature).. [optional]
                fields (str): Hiermee kun je de inhoud van de resource naar behoefte aanpassen door een door komma's gescheiden lijst van property namen op te geven. Bij opgave van niet-bestaande properties wordt een 400 Bad Request teruggegeven. Wanneer de fields parameter niet is opgegeven, worden alle properties met een waarde teruggegeven. Zie [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.3.0/features/fields.feature). [optional]
                accept_crs (CrsEnum): Gewenste CRS van de coördinaten in de response.. [optional]
                page (int): Pagina nummer. [optional] if omitted the server will use the default value of 1
                page_size (int): [optional] if omitted the server will use the default value of 20
                _return_http_data_only (bool): response data without head status
                    code and headers. Default is True.
                _preload_content (bool): if False, the urllib3.HTTPResponse object
                    will be returned without reading/decoding response data.
                    Default is True.
                _request_timeout (int/float/tuple): timeout setting for this request. If
                    one number provided, it will be total request timeout. It can also
                    be a pair (tuple) of (connection, read) timeouts.
                    Default is None.
                _check_input_type (bool): specifies if type checking
                    should be done one the data sent to the server.
                    Default is True.
                _check_return_type (bool): specifies if type checking
                    should be done one the data received from the server.
                    Default is True.
                _host_index (int/None): specifies the index of the server
                    that we want to use.
                    Default is read from the configuration.
                async_req (bool): execute request asynchronously

            Returns:
                AdresseerbaarobjectHalCollectie
                    If the method is called asynchronously, returns the request
                    thread.
            """
            kwargs['async_req'] = kwargs.get(
                'async_req', False
            )
            kwargs['_return_http_data_only'] = kwargs.get(
                '_return_http_data_only', True
            )
            kwargs['_preload_content'] = kwargs.get(
                '_preload_content', True
            )
            kwargs['_request_timeout'] = kwargs.get(
                '_request_timeout', None
            )
            kwargs['_check_input_type'] = kwargs.get(
                '_check_input_type', True
            )
            kwargs['_check_return_type'] = kwargs.get(
                '_check_return_type', True
            )
            kwargs['_host_index'] = kwargs.get('_host_index')
            return self.call_with_http_info(**kwargs)

        self.raadpleeg_adresseerbareobjecten = _Endpoint(
            settings={
                'response_type': (AdresseerbaarobjectHalCollectie,),
                'auth': [
                    'apiKeyBAG'
                ],
                'endpoint_path': '/adresseerbareobjecten',
                'operation_id': 'raadpleeg_adresseerbareobjecten',
                'http_method': 'GET',
                'servers': None,
            },
            params_map={
                'all': [
                    'nummeraanduiding_identificatie',
                    'pand_identificatie',
                    'expand',
                    'fields',
                    'accept_crs',
                    'page',
                    'page_size',
                ],
                'required': [],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                    'nummeraanduiding_identificatie',
                    'pand_identificatie',
                    'page',
                    'page_size',
                ]
            },
            root_map={
                'validations': {
                    ('nummeraanduiding_identificatie',): {

                        'regex': {
                            'pattern': r'^[0-9]{16}$',  # noqa: E501
                        },
                    },
                    ('pand_identificatie',): {

                        'regex': {
                            'pattern': r'^[0-9]{16}$',  # noqa: E501
                        },
                    },
                    ('page',): {

                        'inclusive_minimum': 1,
                    },
                    ('page_size',): {

                        'inclusive_maximum': 100,
                        'inclusive_minimum': 1,
                    },
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'nummeraanduiding_identificatie':
                        (str,),
                    'pand_identificatie':
                        (str,),
                    'expand':
                        (str,),
                    'fields':
                        (str,),
                    'accept_crs':
                        (CrsEnum,),
                    'page':
                        (int,),
                    'page_size':
                        (int,),
                },
                'attribute_map': {
                    'nummeraanduiding_identificatie': 'nummeraanduidingIdentificatie',
                    'pand_identificatie': 'pandIdentificatie',
                    'expand': 'expand',
                    'fields': 'fields',
                    'accept_crs': 'Accept-Crs',
                    'page': 'page',
                    'page_size': 'pageSize',
                },
                'location_map': {
                    'nummeraanduiding_identificatie': 'query',
                    'pand_identificatie': 'query',
                    'expand': 'query',
                    'fields': 'query',
                    'accept_crs': 'header',
                    'page': 'query',
                    'page_size': 'query',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/hal+json',
                    'application/problem+json'
                ],
                'content_type': [],
            },
            api_client=api_client,
            callable=__raadpleeg_adresseerbareobjecten
        )
