package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
@Disabled
@TeleOp
public class GamePadPractice extends OpMode {

    @Override
    public void init() {

    }

    @Override
    public void loop() {

        double speedForward = gamepad1.left_stick_y / 2.0;
        double difference = gamepad1.left_stick_x - gamepad1.right_stick_x;
        double sumTriggers = gamepad1.left_trigger + gamepad1.right_trigger;

        telemetry.addData("x_left", gamepad1.left_stick_x);
        telemetry.addData("y_left", speedForward);
        telemetry.addData("x_right", gamepad1.right_stick_x);
        telemetry.addData("y_right", gamepad1.right_stick_y);

        telemetry.addData("a button", gamepad1.a);
        telemetry.addData("b button", gamepad1.b);

        telemetry.addData("left x - right x", difference);
        telemetry.addData("sum of triggers", sumTriggers);

    }
}
