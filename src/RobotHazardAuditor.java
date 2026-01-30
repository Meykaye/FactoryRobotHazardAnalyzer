public class RobotHazardAuditor {

    public double CalculateHazardRisk(
            double armPrecision,
            int workerDensity,
            String machineryState)
            throws RobotSafetyException {

        if (armPrecision < 0.0 || armPrecision > 1.0)
            throw new RobotSafetyException(
                    "Error: Arm precision must be 0.0-1.0");

        if (workerDensity < 1 || workerDensity > 20)
            throw new RobotSafetyException(
                    "Error: Worker density must be 1-20");

        double machineRiskFactor = 3.0;
        return ((1.0 - armPrecision) * 15.0)
                + (workerDensity * machineRiskFactor);
    }
}
