

package frc.robot;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;



public class Robot extends TimedRobot {
  CANSparkMax sparkMax;
  
  @Override
  public void robotInit() {
    sparkMax = new CANSparkMax(1,MotorType.kBrushless);
  
  }

  
  @Override
  public void robotPeriodic() {


  }

  
  @Override
  public void autonomousInit() {
    
  }


  @Override
  public void autonomousPeriodic() {
  
  }

 
  @Override
  public void teleopInit() {}

  
  
  @Override
  public void teleopPeriodic() {
    sparkMax.set(0.2);
  }

  
  @Override
  public void disabledInit() {}

 
  @Override
  public void disabledPeriodic() {}


  @Override
  public void testInit() {}

  @Override
  public void testPeriodic() {}
}
