package com.benkkstudio.bsjson;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class BSObject {
    private JsonObject jsObj;
    public BSObject() {
        jsObj = new JsonObject();

    }

    public void addProperty(String property, String value){
        jsObj.addProperty(property, value);
    }

    public JsonObject getProperty(){
        return jsObj;
    }
}
