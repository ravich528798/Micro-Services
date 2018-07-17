package com.ravi.microservices.currencyexchangeservice.Services;






public class ExchangeValue {

    private Long id;
    private String from;
    private String to;
    private double conversionRate;
    private int port;



    public ExchangeValue() {
    }

    public ExchangeValue(Long id,String from, String to, double conversionRate) {
        this.id=id;
        this.from = from;
        this.to = to;
        this.conversionRate = conversionRate;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public double getConversionRate() {
        return conversionRate;
    }

    public void setConversionRate(double conversionRate) {
        this.conversionRate = conversionRate;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
