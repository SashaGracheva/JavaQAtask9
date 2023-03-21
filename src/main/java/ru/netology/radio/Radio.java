package ru.netology.radio;
public class Radio {
    public int currentStation;


    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }


    public void switchToNextStation() {
        if (currentStation < 9)
            currentStation = currentStation + 1;
        if (currentStation == 9)
            currentStation = 0;
    }

    public void switchToPrevStation() {
        if (currentStation == 0)
            currentStation = 9;
        if (currentStation < 9)
            currentStation = currentStation - 1;

    }

    public int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
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
