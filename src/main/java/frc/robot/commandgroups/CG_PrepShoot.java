package frc.robot.commandgroups;

import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.RobotContainer;
import frc.robot.commands.C_LetsGetReadyToRUMBLE;
import frc.robot.commands.C_PrepFeederToShoot;
import frc.robot.commands.C_PrepShoot;

public class CG_PrepShoot extends SequentialCommandGroup {
  public CG_PrepShoot() {
    super(
      new ParallelCommandGroup(
        new C_PrepShoot(), 
        new C_PrepFeederToShoot()
      ),
      new C_LetsGetReadyToRUMBLE(RobotContainer.getRumbleJoystick(), 0.01, 0.7)
    );
  }
}
