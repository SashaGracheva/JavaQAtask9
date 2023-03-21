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


    public void switchToNextStation(int nextCurrentStation) {
        if (nextCurrentStation < 9)
            currentStation = nextCurrentStation + 1;
        if (nextCurrentStation == 9)
            currentStation = 0;
    }

    public void switchToPrevStation(int prevCurrentStation) {
        if (prevCurrentStation < 9)
            currentStation = prevCurrentStation - 1;
        if (prevCurrentStation == 0)
            currentStation = 9;
    }

    public int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume(int newVolume) {
        if (newVolume < 10) {
            currentVolume = newVolume + 1;
        }

    }

    public void decreaseVolume(int oldVolume) {
        if (oldVolume > 0) {
            currentVolume = oldVolume - 1;
        }
    }


}
