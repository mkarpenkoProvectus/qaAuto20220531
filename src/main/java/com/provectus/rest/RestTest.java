package com.provectus.rest;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.github.javafaker.Faker;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.provectus.rest.entities.Pet;
import okhttp3.*;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONWriter;

import java.io.IOException;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class RestTest {
  public String createPet(String name) throws IOException {
    JSONObject json = new JSONObject();
    json.put("name", name);
    json.put("status", "available");

//    System.out.println(json.toString());

    RequestBody body = RequestBody.create(json.toString().getBytes());

    Request request = new Request.Builder()
        .post(body)
        .url("https://petstore.swagger.io/v2/pet")
        .addHeader("Content-Type", "application/json")
        .build();

    Response response = new OkHttpClient().newCall(request).execute();


    System.out.println(response.code());
    String responseBody = response.body().string();

    JSONObject responseJson = new JSONObject(responseBody);
    return responseJson.get("id").toString();
  }

  public void serializePet(Pet pet) throws IOException {
    Gson gson = new Gson();
    String json = gson.toJson(pet);

    System.out.println(json);

    RequestBody body = RequestBody.create(json.getBytes());
    Request request = new Request.Builder()
        .post(body)
        .url("https://petstore.swagger.io/v2/pet")
        .addHeader("Content-Type", "application/json")
        .build();

    Response response = new OkHttpClient().newCall(request).execute();

    Pet newPet = gson.fromJson(response.body().string(), Pet.class);
    System.out.println(newPet);
  }

  public void getPetByStatus(String status) throws IOException {
    Request request = new Request.Builder()
        .get()
        .url("https://petstore.swagger.io/v2/pet/findByStatus?status=" + status)
        .build();

    OkHttpClient client = new OkHttpClient();
    Response response = client.newCall(request).execute();

    System.out.println(response.code());
    System.out.println(response.body().string());
  }
}
