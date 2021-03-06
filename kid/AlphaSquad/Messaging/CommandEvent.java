package kid.AlphaSquad.Messaging;

import kid.Data.Robot.EnemyData;
import robocode.Event;

public class CommandEvent extends Event {

    private String sender;
    private CommandType commandType;
    private EnemyData enemyData;

    public CommandEvent(String sender, CommandType commandType, EnemyData enemyData)
    {
        this.sender = sender;
        this.commandType = commandType;
        this.enemyData = enemyData;
    }


    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public CommandType getCommandType() {
        return commandType;
    }

    public void setCommandType(CommandType commandType) {
        this.commandType = commandType;
    }

    public EnemyData getEnemyData() {
        return enemyData;
    }

    public void setEnemyData(EnemyData enemyData) {
        this.enemyData = enemyData;
    }
}
