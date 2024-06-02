package com.aluracursos.conversor.principal.modelos;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class AnalisisFiltrado {
    //private String json;
    private double ars;
    private double brl;
    private double cop;

    public AnalisisFiltrado(String json){
        //this.json = json;
        JsonParser parser = new JsonParser();
        JsonObject jsonObject = parser.parse(json).getAsJsonObject();
        JsonObject conversionRates = jsonObject.getAsJsonObject("conversion_rates");
        this.ars = conversionRates.get("ARS").getAsDouble();
        this.brl = conversionRates.get("BRL").getAsDouble();
        this.cop = conversionRates.get("COP").getAsDouble();
    }
/*
    public String getJson() {
        return json;
    }

    public void setJson(String json) {
        this.json = json;
    }
*/
    public double getBrl() {
        return brl;
    }

    public void setBrl(double brl) {
        this.brl = brl;
    }

    public double getArs() {
        return ars;
    }

    public void setArs(double ars) {
        this.ars = ars;
    }

    public double getCop() {
        return cop;
    }

    public void setCop(double cop) {
        this.cop = cop;
    }
}
