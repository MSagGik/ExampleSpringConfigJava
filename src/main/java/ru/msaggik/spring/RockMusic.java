package ru.msaggik.spring;

import org.springframework.stereotype.Component;

public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "Earthlings Grass near the house";
    }
}
