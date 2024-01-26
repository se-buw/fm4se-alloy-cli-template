package de.buw.fm4se.alloy.cli;

import org.apache.commons.cli.*;

import de.buw.fm4se.alloy.examples.ExampleUsingTheAPI;

public class AlloyCli {

	public static void main(String[] args) {
		Options options = new Options();
		options.addOption("h", "help", false, "print this message");
		options.addOption("e", "example", false, "Alloy CLI example");

		CommandLineParser parser = new DefaultParser();

		try {
			CommandLine cmd = parser.parse(options, args);

			if (cmd.hasOption("h")) {
				HelpFormatter formatter = new HelpFormatter();
				formatter.printHelp("AlloyCli", options);
				System.exit(0);
			}

			if (cmd.hasOption("e")) {
				System.out.println("=========== Alloy CLI Example =============");
				ExampleUsingTheAPI.main(args);
			}
			 

		} catch (ParseException e) {
			System.err.println("Parsing failed. Reason: " + e.getMessage());
		}
	}
}
