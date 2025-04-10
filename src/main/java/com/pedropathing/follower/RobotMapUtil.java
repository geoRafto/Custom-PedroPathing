package com.pedropathing.follower;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.IMU;
import com.qualcomm.robotcore.hardware.VoltageSensor;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.inventors.ftc.robotbase.hardware.Battery;
import org.inventors.ftc.robotbase.hardware.GamepadExEx;
import org.inventors.ftc.robotbase.hardware.MotorExEx;
import org.openftc.easyopencv.OpenCvWebcam;

public interface RobotMapUtil {

    // ----------------------------------------- Telemetry -------------------------------------- //
    HardwareMap getHardwareMap();

    // ------------------------------------ Drivetrain Motors ----------------------------------- //
    MotorExEx getFrontLeftMotor();
    MotorExEx getFrontRightMotor();
    MotorExEx getRearLeftMotor();
    MotorExEx getRearRightMotor();

    // ------------------------------------------ Sensors --------------------------------------- //
    IMU getIMU();

    // ------------------------------------------ Battery --------------------------------------- //
    VoltageSensor getVoltageSensor();

}
