/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package whispir_sdk_java.utils;

/**
 *
 * @author carlangeloorale
 */
public class WrapperInit {
    private String API_KEY, CONTENT_TYPE, ACCEPT;

    public String getApiKey() {
        return API_KEY;
    }

    public String getContentType() {
        return CONTENT_TYPE;
    }

    public String getAccept() {
        return ACCEPT;
    }

    public void setInitValues(String apiKey, String contentType, String accept) {
        this.API_KEY = apiKey;
        this.CONTENT_TYPE = contentType;
        this.ACCEPT = accept;
    }
}
