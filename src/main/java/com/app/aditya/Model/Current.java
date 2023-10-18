package com.app.aditya.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonIgnoreProperties
public class Current{
    public int last_updated_epoch;
    public String last_updated;
    public int temp_c;
    public int temp_f;
    public int is_day;
    public Condition condition;
    public double wind_mph;
    public double wind_kph;
    public int wind_degree;
    public String wind_dir;
    public int pressure_mb;
    public double pressure_in;
    public int precip_mm;
    public int precip_in;
    public int humidity;
    public int cloud;
    public double feelslike_c;
    public double feelslike_f;
    public int vis_km;
    public int vis_miles;
    public int uv;
    public double gust_mph;
    public double gust_kph;
}