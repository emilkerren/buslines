package com.sbab.sl.buslines;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sbab.sl.buslines.models.response.ApiResponse;
import com.sbab.sl.buslines.models.response.ResponseData;
import com.sbab.sl.buslines.models.response.Result;
import org.json.JSONException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class GsonConverterTests {
    private ApiResponse response;
    private ResponseData responseData;

    @BeforeEach
    public void setup() {

        responseData = new ResponseData("2023-04-16 00:11", "JourneyPatternPointOnLine", List.of(
                new Result(1, 1, "10008", "2022-02-15 00:00:00.000", "2022-02-15 00:00:00.000"),
                new Result(1, 1, "10012", "2023-03-07 00:00:00.000", "2023-03-07 00:00:00.000")
        ));
        response = new ApiResponse(0, null, 334, responseData);
    }

    @Test
    public void simpleGsonTest() throws JSONException {
        String expected = "{\n" +
                "    \"StatusCode\": 0,\n" +
                "    \"Message\": null,\n" +
                "    \"ExecutionTime\": 334,\n" +
                "    \"ResponseData\": {\n" +
                "        \"Version\": \"2023-04-16 00:11\",\n" +
                "        \"Type\": \"JourneyPatternPointOnLine\",\n" +
                "        \"Result\": [\n" +
                "            {\n" +
                "                \"LineNumber\": 1,\n" +
                "                \"DirectionCode\": 1,\n" +
                "                \"JourneyPatternPointNumber\": 10008,\n" +
                "                \"LastModifiedUtcDateTime\": \"2022-02-15 00:00:00.000\",\n" +
                "                \"ExistsFromDate\": \"2022-02-15 00:00:00.000\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"LineNumber\": 1,\n" +
                "                \"DirectionCode\": 1,\n" +
                "                \"JourneyPatternPointNumber\": 10012,\n" +
                "                \"LastModifiedUtcDateTime\": \"2023-03-07 00:00:00.000\",\n" +
                "                \"ExistsFromDate\": \"2023-03-07 00:00:00.000\"\n" +
                "             }\n" +
                "        ]\n" +
                "    }\n" +
                "}";

        Gson gson = new GsonBuilder().serializeNulls().create();
        String response = gson.toJson(this.response);

        JSONAssert.assertEquals(expected, response, true);
    }

    @Test
    public void errorGsonTest() throws JSONException {
        String expected = "{\n" +
                "    \"StatusCode\": 0,\n" +
                "    \"Message\": null,\n" +
                "    \"ExecutionTime\": 334,\n" +
                "    \"ResponseData\": {\n" +
                "        \"Version\": \"2023-04-16 00:11\",\n" +
                "        \"Type\": \"SOMETHING_WRONG\",\n" +
                "        \"Result\": [\n" +
                "            {\n" +
                "                \"LineNumber\": \"1\",\n" +
                "                \"DirectionCode\": \"1\",\n" +
                "                \"JourneyPatternPointNumber\": \"10008\",\n" +
                "                \"LastModifiedUtcDateTime\": \"2022-02-15 00:00:00.000\",\n" +
                "                \"ExistsFromDate\": \"2022-02-15 00:00:00.000\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"LineNumber\": \"1\",\n" +
                "                \"DirectionCode\": \"1\",\n" +
                "                \"JourneyPatternPointNumber\": \"10012\",\n" +
                "                \"LastModifiedUtcDateTime\": \"2023-03-07 00:00:00.000\",\n" +
                "                \"ExistsFromDate\": \"2023-03-07 00:00:00.000\"\n" +
                "             }\n" +
                "        ]\n" +
                "    }\n" +
                "}";

        Gson gson = new GsonBuilder().serializeNulls().create();
        String data = gson.toJson(responseData);

        JSONAssert.assertNotEquals(expected, data, false);
    }

}
