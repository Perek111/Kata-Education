/*Реши предыдущую задачу с использованием try-with-resources*/
package ErrorHandlingExceptionsDebugging;

public class Task_4_2_9 {
    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        int attempt = 0;
        while (attempt < 3) {
            try (RobotConnection robotConnection = robotConnectionManager.getConnection()) {
                robotConnection.moveRobotTo(toX, toY);
                attempt = 3;
            } catch (RobotConnectionException rce) {
                attempt++;
                if (attempt == 3) {
                    throw rce;
                }
            }
        }
    }
}
