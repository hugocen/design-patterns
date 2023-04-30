package command.remote;

import command.remote.command.*;
import command.remote.remote.RemoteControl;
import command.remote.vendor.*;

public class RemoteLoader {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		TV tv = new TV("Living Room");
        CeilingFan ceilingFan= new CeilingFan("Living Room");
		GarageDoor garageDoor = new GarageDoor("Garage");
		Stereo stereo = new Stereo("Living Room");
		Hottub hottub = new Hottub();


        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

		LightOnCommand lightOn = new LightOnCommand(livingRoomLight);
		StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
		TVOnCommand tvOn = new TVOnCommand(tv);
		HottubOnCommand hottubOn = new HottubOnCommand(hottub);
		LightOffCommand lightOff = new LightOffCommand(livingRoomLight);
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);
		TVOffCommand tvOff = new TVOffCommand(tv);
		HottubOffCommand hottubOff = new HottubOffCommand(hottub);

		Command[] partyOn = { lightOn, stereoOnWithCD, tvOn, hottubOn};
		Command[] partyOff = { lightOff, stereoOff, tvOff, hottubOff};

		MacroCommand partyOnMacro = new MacroCommand(partyOn);
		MacroCommand partyOffMacro = new MacroCommand(partyOff);

		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
		remoteControl.setCommand(2, ceilingFanMedium, ceilingFanOff);
		remoteControl.setCommand(3, stereoOnWithCD, stereoOff);
        remoteControl.setCommand(4, partyOnMacro, partyOffMacro);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		remoteControl.onButtonWasPushed(1);
		remoteControl.offButtonWasPushed(1);
		remoteControl.onButtonWasPushed(2);
		remoteControl.offButtonWasPushed(2);
		remoteControl.onButtonWasPushed(3);
		remoteControl.offButtonWasPushed(3);

		System.out.println(remoteControl);
		System.out.println("--- Pushing Macro On---");
		remoteControl.onButtonWasPushed(4);
		System.out.println("--- Pushing Macro Off---");
		remoteControl.offButtonWasPushed(4);
    }

}
