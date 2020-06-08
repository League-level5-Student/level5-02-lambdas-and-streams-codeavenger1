package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.util.*;

public class LambdaButtons {
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	
	Random r = new Random();
	int rand1 = r.nextInt(100);
	int rand2 = r.nextInt(100);
	int answer = (rand1 + rand2);
	
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		addNumbers.addActionListener(e -> {System.out.println(rand1 + " + " + rand2 + " = " + answer);});
		randNumber.addActionListener(e -> {System.out.println(rand1);});
		tellAJoke.addActionListener(e -> {System.out.println("Why do we tell actors to 'break a leg'? Because every play has a cast!");});
		
		window.setVisible(true);
		window.pack();
	}
	
	public static void main(String[] args) {
		new LambdaButtons();
	}
	
	
}
