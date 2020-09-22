package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@Autonomous(name = "MecanumBot",group = "MecanumBot")
public class MechanumBot extends LinearOpMode {
    @Override
    public void runOpMode(){
        DcMotor leftFrontMotor=hardwareMap.dcMotor.get("front_left_motor");
        DcMotor leftBackMotor=hardwareMap.dcMotor.get("back_left_motor");
        DcMotor rightFrontMotor=hardwareMap.dcMotor.get("front_right_motor");
        DcMotor rightBackMotor=hardwareMap.dcMotor.get("back_right_motor");

        rightBackMotor.setDirection(DcMotorSimple.Direction.REVERSE);
        rightFrontMotor.setDirection(DcMotorSimple.Direction.REVERSE);
        leftBackMotor.setDirection(DcMotorSimple.Direction.FORWARD);
        leftFrontMotor.setDirection(DcMotorSimple.Direction.FORWARD);

        double fata_spate=gamepad1.left_stick_y;
        double stanga_dreapta=gamepad1.left_stick_x;

        waitForStart();
        while(opModeIsActive()){
            leftFrontMotor.setPower(fata_spate-stanga_dreapta);
            leftBackMotor.setPower(fata_spate-stanga_dreapta);
            rightFrontMotor.setPower(fata_spate+stanga_dreapta);
            rightBackMotor.setPower(fata_spate+stanga_dreapta);
        }
    }
}
