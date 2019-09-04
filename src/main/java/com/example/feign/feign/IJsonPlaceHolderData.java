package com.example.feign.feign;

import org.springframework.cloud.openfeign.FeignClient;
        import org.springframework.http.ResponseEntity;
        import org.springframework.stereotype.Component;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RequestMethod;

        import java.util.List;
import java.util.Map;

@FeignClient(name="${name2}", url ="${json.placeholder.url}")
public interface IJsonPlaceHolderData {

    @RequestMapping(method = RequestMethod.GET)
    ResponseEntity<Map> getJson();

}
