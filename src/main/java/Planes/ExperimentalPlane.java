package Planes;

import models.ClassificationLevel;
import models.ExperimentalTypes;

public class ExperimentalPlane extends Plane {

    private final ExperimentalTypes type;
    private final ClassificationLevel classificationLevel;

    public ExperimentalPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity,
                             ExperimentalTypes type, ClassificationLevel classificationLevel) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.type = type;
        this.classificationLevel = classificationLevel;
    }

    public ClassificationLevel getClassificationLevel() {
        return classificationLevel;
    }
}