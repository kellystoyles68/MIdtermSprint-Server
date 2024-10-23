package com.keyin;

import java.net.http.HttpClient;

public class AirportClientManagementApp {
    private static final String BASE_URL = "http://localhost:8080/api";
    private static final HttpClient httpClient = HttpClient.newHttpClient();
}