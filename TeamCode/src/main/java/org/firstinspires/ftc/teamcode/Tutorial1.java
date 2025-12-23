package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
@Disabled
@Autonomous
public class Tutorial1 extends OpMode {

    @Override
    public void init() {

        telemetry.addData("Hello", "nume");
    }

    @Override
    public void loop() {

    }
}
