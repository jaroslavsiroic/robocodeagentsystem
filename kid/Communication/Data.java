package kid.Communication;

import kid.AlphaSquad.Messaging.CommandEvent;
import robocode.TeamRobot;
import kid.Data.Robot.*;
import kid.Data.Virtual.*;

public class Data implements java.io.Serializable {

    private static final long serialVersionUID = 5131684452528873817L;

    private Me Me;
    // private EnemyData[] EnemyData;
    private VirtualBullet[] VirtualBullets;
    private CommandEvent event;

    public Data(TeamRobot MyRobot, EnemyData[] EnemyData, VirtualBullet[] VirtualBullets) {
        Me = new Me(MyRobot);
        // this.EnemyData = EnemyData;
        this.VirtualBullets = VirtualBullets;
    }

    public Data(CommandEvent e) {
        this.event = e;
    }

    public CommandEvent getCommandEvent() {
        return event;
    }

    public TeammateData getTeammate() {
        return Me.getTeammate();
    }

    public EnemyData[] getEnemyRobots() {
        return new EnemyData[0];
    }

    public VirtualBullet[] getVirtualBullets() {
        return VirtualBullets;
    }

}
