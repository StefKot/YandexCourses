public class Converter {
    int stepLength = 75;
    int stepEnergy = 50;
    int kcal = 1000;
    int cmToKm = 100000;

    int convertToKm(int steps) {
        return steps * stepLength / cmToKm;
    }

    int convertStepsToKilocalories(int steps) {
        return steps * stepEnergy / kcal;
    }
}
