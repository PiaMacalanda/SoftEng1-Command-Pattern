## Programming Challenge

Imagine you're building a smart home automation system where various devices (lights, thermostat, music player, etc.) can be controlled remotely using a central hub or app. Each device has different functionalities, but you want to create a unified and flexible control mechanism.

Design a system that allows you to control multiple smart home devices with ease. Your goal is to create a solution where:

You can control a variety of devices from a central hub or app, sending commands like "Turn On," "Turn Off," "Increase Temperature," "Decrease Volume," etc.
Each device has unique actions associated with these commands. For example, turning on the lights might involve changing their brightness level, while turning on the music player may involve playing a specific playlist.

New devices can be seamlessly integrated into the system without modifying existing code. You want to ensure that adding a new device doesn't require changes to the central control logic.

Devices can be controlled without the central hub or app needing to understand the internal workings of each device. It should send high-level commands without needing low-level details.

Your challenge is to apply a design pattern that provides a flexible and scalable way to control a variety of smart home devices, ensuring that new devices can be added without disrupting the existing system's functionality.
## UML Diagram
![alt text](https://github.com/JerryEsperanza/SoftEng1_4BSCS2/blob/master/commandPattern/commandPatternImage.png?raw=true)

## Components

ViewerApp (Client): This represents an application used by viewers to control the TV. It interacts with the RemoteControl to send commands.

RemoteControl (Invoker): The RemoteControl acts as an invoker, receiving commands from the ViewerApp and executing them. It has a clickButton() method to invoke commands.

Command (Interface): An interface defining the execute() method, which concrete command objects must implement. It ensures that all concrete commands have an execute() method.

PowerOn (Concrete Command): A concrete command object representing the "power on" operation for the TV. It encapsulates the switchOn() method of the Tv object.

PowerOff (Concrete Command): A concrete command object representing the "power off" operation for the TV. It encapsulates the switchOff() method of the Tv object.

Tv (Receiver): The TV object represents the device being controlled. It has switchOn() and switchOff() methods to control its power state.

