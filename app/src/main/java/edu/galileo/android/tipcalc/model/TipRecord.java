package edu.galileo.android.tipcalc.model;

import java.text.SimpleDateFormat;
import java.util.Date;

import butterknife.internal.ListenerClass;

/**
 * Created by ykro.
 */
public class TipRecord {
    private String nombreSuperHeroe;
    private Date timestamp;
    private int tipPercentage;

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getNombreSuperHeroe() {
        return nombreSuperHeroe;
    }

    public void setNombreSuperHeroe(String nombreSuperHeroe) {
        this.nombreSuperHeroe = nombreSuperHeroe;
    }

    public int getTipPercentage() {
        return tipPercentage;
    }

    public void setTipPercentage(int tipPercentage) {
        this.tipPercentage = tipPercentage;
    }

    public String getTip() {
        return nombreSuperHeroe;
    }

    public String getDateFormatted(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM dd,yyyy HH:mm");
        return simpleDateFormat.format(timestamp);
    }
}
