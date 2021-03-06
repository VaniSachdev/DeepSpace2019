/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package com.team687;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
	// Cosmos testing
	
	public static final int kRightTalon1 = 1;
	public static final int kRightTalon2 = 2;
	public static final int kLeftTalon1 = 4;
	public static final int kLeftTalon2 = 6;
	
	// Power up robots
	
    public static final int kRightMasterTalonID = 0;
    public static final int kLeftMasterTalonID = 1;

    // practice bot
    public static final int kRightSlaveTalon1ID = 4;
    public static final int kLeftSlaveTalon1ID = 5;

    // comp bot
    public static final int kRightSlaveVictorID = 4;
    public static final int kLeftSlaveVictorID = 5;

}
