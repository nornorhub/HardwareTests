package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.hardware.Servo;
import org.firstinspires.ftc.robotcore.external.Telemetry;

public class TestServo extends TestItem {
    private Servo servo;
    private double on;
    private double off;

    public TestServo(String description, Servo servo, double on, double off) {
        super(description);
        this.servo = servo;
        this.on = on;
        this.off = off;
    }

    @Override
    public void run(boolean on, Telemetry telemetry) {
        if (on) {
            servo.setPosition(this.on);
        } else {
            servo.setPosition(this.off);
        }
        telemetry.addData("Servo", on ? "on": "off");
    }
}
