package org.openapitools.api;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.openapitools.configuration.ClientConfiguration;

@FeignClient(name="${openAPIPetstore.name:openAPIPetstore}", url="${openAPIPetstore.url:http://petstore.swagger.io/v2}", configuration = ClientConfiguration.class)
public interface StoreApiClient extends StoreApi {
}