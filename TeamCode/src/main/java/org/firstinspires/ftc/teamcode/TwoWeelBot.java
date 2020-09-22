package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

@Autonomous(name = "TwoWeel",group = "TwoWeel")
public class TwoWeelBot extends LinearOpMode {
    @Override

    public void runOpMode(){
        DcMotor leftMotor=hardwareMap.dcMotor.get("left_motor");
        DcMotor rightMotor= hardwareMap.dcMotor.get("right_motor");

        leftMotor.setDirection(DcMotorSimple.Direction.FORWARD);
        rightMotor.setDirection(DcMotorSimple.Direction.REVERSE);

        waitForStart();
        while(opModeIsActive()){
            leftMotor.setPower(-gamepad1.left_stick_y);
            rightMotor.setPower(-gamepad2.right_stick_y);
        }
    }
}
