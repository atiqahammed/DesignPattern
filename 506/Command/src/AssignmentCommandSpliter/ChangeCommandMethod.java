package AssignmentCommandSpliter;

import java.util.ArrayList;
import java.util.Scanner;

import AssignmentInterfaces.ICommandProcedurerMethods;
import command.TransformCommand;
import receiver.ReceiverCircle;

public class ChangeCommandMethod implements  ICommandProcedurerMethods{

	private Scanner scanner;
	
	public ChangeCommandMethod() {
		scanner = new Scanner(System.in);
	}
	
	@Override
	public void proceedCommand(ArrayList<TransformCommand> commandList, ReceiverCircle circle) {
		
		System.out.print("Please enter new x:: ");
		String xString = scanner.nextLine();
		System.out.print("Please enter new y:: ");
		String yString = scanner.nextLine();
		int x = Integer.parseInt(xString);
		int y = Integer.parseInt(yString);
		TransformCommand command = new TransformCommand(circle, x, y);
		command.execute();
		commandList.add(command);
		
		System.out.println("New x of circle is :> " + circle.getCircleX());
		System.out.println("New y of circle is :> " + circle.getCircleY());
		
	}

}
