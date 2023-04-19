package com.sbab.sl.buslines;

import com.sbab.sl.buslines.controller.BusController;
import com.sbab.sl.buslines.models.response.ApiResponse;
import com.sbab.sl.buslines.models.response.ResponseData;
import com.sbab.sl.buslines.models.response.Result;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.client.RestClientTest;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.BDDMockito.given;

@RunWith(SpringRunner.class)
@RestClientTest(BusController.class)
public class BusControllerTest {
    @Autowired
    private RestTemplate restTemplate;
    private ApiResponse apiResponse;
    private ResponseEntity<String> stringEntityResponse;
    private ResponseData responseData;

    @BeforeEach
    public void setUp() {
        responseData = new ResponseData("2023-04-16 00:11", "JourneyPatternPointOnLine", List.of(
                new Result(1, 1, "10008", "2022-02-15 00:00:00.000", "2022-02-15 00:00:00.000"),
                new Result(1, 1, "10012", "2023-03-07 00:00:00.000", "2023-03-07 00:00:00.000")
        ));
        apiResponse = new ApiResponse(200, "", 500, responseData);
        stringEntityResponse = new ResponseEntity<>(apiResponse.toString(), HttpStatusCode.valueOf(200));
    }
    @Test
    public void givenXml_whenCallApiData_thenReturnApiResponseClass() {
        given(restTemplate.getForObject(anyString(), any())).willReturn(apiResponse);


    }

    @Test
    public void givenXml_whenCallApiData_thenReturnStringClass() {
//        given(restTemplate.getForEntity(anyString(), any())).willReturn(stringEntityResponse);
//
//        restTemplate.
    }
}
