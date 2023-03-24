package ru.netology.radio;

public class Radio {
    private int currentStation;
    private int currentVolume;


    public int getCurrentStation() {

        return currentStation;
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        currentStation = newCurrentStation;
        if (newCurrentStation > 9) {
            currentStation = 9;
        }

    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        currentVolume = newCurrentVolume;

        if (newCurrentVolume > 10) {
            currentVolume = 10;
        }
    }

    public void switchToNextStation() {
        if (currentStation < 9)
            currentStation = currentStation + 1;
        if (currentStation == 9)
            currentStation = 0;
    }

    public void switchToPrevStation() {
        if (currentStation >0)
            currentStation = currentStation - 1;
        if (currentStation == 0)
            currentStation = 9;
    }


    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }

    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }


}
