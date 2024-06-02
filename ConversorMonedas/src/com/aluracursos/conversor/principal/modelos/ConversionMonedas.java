package com.aluracursos.conversor.principal.modelos;

public class ConversionMonedas {
    public String resultado;

    public String DolarAPesoArgentino(double cantidad){

        Conexion solicitud = new Conexion();
        if(solicitud.getJson().equals("Sin resultados!")){
            resultado = solicitud.getJson();
        }
        else{
            AnalisisFiltrado valorMoneda = new AnalisisFiltrado(solicitud.getJson());
            resultado = String.valueOf(valorMoneda.getArs()*cantidad);
        }
        return resultado;
    }

    public String PesoArgentinoADolar(double cantidad){

        Conexion solicitud = new Conexion();
        if(solicitud.getJson().equals("Sin resultados!")){
            resultado = solicitud.getJson();
        }
        else{
            AnalisisFiltrado valorMoneda = new AnalisisFiltrado(solicitud.getJson());
            resultado = String.valueOf(cantidad/valorMoneda.getArs());
        }
        return resultado;
    }

    public String DolarARealBrasileno(double cantidad){

        Conexion solicitud = new Conexion();
        if(solicitud.getJson().equals("Sin resultados!")){
            resultado = solicitud.getJson();
        }
        else{
            AnalisisFiltrado valorMoneda = new AnalisisFiltrado(solicitud.getJson());
            resultado = String.valueOf(valorMoneda.getBrl()*cantidad);
        }
        return resultado;
    }

    public String RealBrasilenoADolar(double cantidad){

        Conexion solicitud = new Conexion();
        if(solicitud.getJson().equals("Sin resultados!")){
            resultado = solicitud.getJson();
        }
        else{
            AnalisisFiltrado valorMoneda = new AnalisisFiltrado(solicitud.getJson());
            resultado = String.valueOf(cantidad/valorMoneda.getBrl());
        }
        return resultado;
    }

    public String DolarAPesoColombiano(double cantidad){

        Conexion solicitud = new Conexion();
        if(solicitud.getJson().equals("Sin resultados!")){
            resultado = solicitud.getJson();
        }
        else{
            AnalisisFiltrado valorMoneda = new AnalisisFiltrado(solicitud.getJson());
            resultado = String.valueOf(valorMoneda.getCop()*cantidad);
        }
        return resultado;
    }

    public String PesoColombianoADolar(double cantidad){

        Conexion solicitud = new Conexion();
        if(solicitud.getJson().equals("Sin resultados!")){
            resultado = solicitud.getJson();
        }
        else{
            AnalisisFiltrado valorMoneda = new AnalisisFiltrado(solicitud.getJson());
            resultado = String.valueOf(cantidad/valorMoneda.getCop());
        }
        return resultado;
    }

}
