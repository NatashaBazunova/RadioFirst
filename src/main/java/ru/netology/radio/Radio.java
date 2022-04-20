package ru.netology.radio;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxStation = 9;
    private int minStation = 0;
    private int maxVolume = 10;
    private int minVolume = 0;

    public int getCurrentStation() {
        return currentStation;
    }

    public void nextStation() {
        if (currentStation < maxStation) {
            this.currentStation = currentStation + 1;
        } else {
            this.currentStation = minStation;
        }
    }

    public void prevStation() {
        if (currentStation > minStation) {
            this.currentStation = currentStation - 1;
        } else {
            this.currentStation = maxStation;
        }
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            this.currentVolume = currentVolume + 1;
        } else {
            this.currentVolume = maxVolume;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            this.currentVolume = currentVolume - 1;
        } else {
            this.currentVolume = minVolume;
        }
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }
}
