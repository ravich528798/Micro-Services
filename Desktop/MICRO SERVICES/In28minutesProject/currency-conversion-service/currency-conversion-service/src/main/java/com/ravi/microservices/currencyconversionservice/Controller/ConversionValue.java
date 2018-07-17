package com.ravi.microservices.currencyconversionservice.Controller;

public class ConversionValue {

    private int id;
    private String from,to;
    private double conversionRate;
    private double quantity;
    private double totalAmount;
    private int port;

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public ConversionValue() {
    }

    public ConversionValue(int id, String from, String to, double conversionRate, double quantity,double totalAmount,int port) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionRate = conversionRate;
        this.quantity = quantity;
        this.totalAmount = totalAmount;
        this.port=port;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
}
