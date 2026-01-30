public class RobotHazardAuditor {

    public double CalculateHazardRisk(
            double armPrecision,
            int workerDensity,
            String machineryState) {

        double machineRiskFactor = 3.0;
        return ((1.0 - armPrecision) * 15.0)
                + (workerDensity * machineRiskFactor);
    }
}
