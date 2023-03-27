package ru.netology.radio;

public class Radio {
    private int numberOfStations = 10;
    private final int minStation = 0;
    private final int maxStation = numberOfStations - 1;
    private int currentStation = minStation;
    private final int minVolume = 0;
    private final int maxVolume = 100;
    private int currentVolume = minVolume;


    public Radio(int numberOfStations) {
        this.numberOfStations = numberOfStations;
    }

    public Radio() {
        this.numberOfStations = numberOfStations;
    }

    public int getCurrentStation() {

        return currentStation;
    }

    public int getNumberOfStations() {

        return numberOfStations;
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            return;
        }
        if (newCurrentStation <= maxStation) {
            currentStation = newCurrentStation;
        }
        if (newCurrentStation > maxStation) {
            currentStation = minStation;
        }

    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume >= maxVolume) {
            currentVolume = maxVolume;
        } else {
            currentVolume = newCurrentVolume;
        }
    }

    public void switchToNextStation() {
        if (currentStation < maxStation) {
            currentStation++;
        } else {
            currentStation = minStation;
        }
    }

    public void switchToPrevStation() {
        if (currentStation > minStation) {
            currentStation = currentStation - 1;
        } else {
            currentStation = maxStation;
        }
    }


    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }


}
