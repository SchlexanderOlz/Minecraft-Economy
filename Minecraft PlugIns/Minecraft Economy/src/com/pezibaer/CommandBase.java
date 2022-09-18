package com.pezibaer;

import org.bukkit.command.CommandExecutor;
import org.bukkit.command.defaults.BukkitCommand;

public class CommandBase extends BukkitCommand implements CommandExecutor {
    public CommandBase(String command){
        this(command, 0);
    }

    public CommandBase(String command, boolean playerOnly){

    }

    public CommandBase(String command, int requiredArguments) {

    }

    public CommandBase(String command, int minArguments, int maxArguments) {

    }

    public CommandBase(String command, int requiredArguments, boolean playerOnly) {

    }

    public CommandBase(String command, int minArguments, int maxArguments, boolean playerOnly) {

    }
}
