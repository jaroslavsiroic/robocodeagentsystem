package kid.AlphaSquad.Strategies;

import kid.Managers.DataManager;

public interface BaseStrategy {
    /**
     * get the scanned robot data, and use this data to execute the strategy.
     * @param Data
     */
    void getEnemy(DataManager Data);

    /**
     * send command to teammates, so that they target the robot based on used strategy.
     */
    void sendCommand();
}
