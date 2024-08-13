package me.chocolf.moneyfrommobs.commands;

import me.chocolf.moneyfrommobs.managers.MessageManager;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import me.chocolf.moneyfrommobs.MoneyFromMobs;

public class HelpCommand implements CommandExecutor{
	
	
	public HelpCommand(MoneyFromMobs plugin) {
		plugin.getCommand("mfmhelp").setExecutor(this);
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		sender.sendMessage("");
		sender.sendMessage(MessageManager.applyColour("----------MoneyFromMobs Help!----------"));
		sender.sendMessage("");
		sender.sendMessage(MessageManager.applyColour("/MfmReload - Reloads MoneyFromMobs"));
		sender.sendMessage("");
		sender.sendMessage(MessageManager.applyColour("/MfmClear - Clears all money from the ground. Can also be used to remove glitched holographic messages"));
		sender.sendMessage("");
		sender.sendMessage(MessageManager.applyColour("/MfmMute - Mute incoming messages when picking up money for the player who ran this command"));
		sender.sendMessage("");
		sender.sendMessage(MessageManager.applyColour("/DropMoney <AmountToDrop> - Drops money in front of the player and takes money from their balance"));
		sender.sendMessage("");
		sender.sendMessage(MessageManager.applyColour("/AdminDropMoney <AmountToDrop> [NumberOfDrops] [World] [PosX] [PosY] [PosZ] - Drops money on player's cursor or in a certain position"));
		sender.sendMessage("");
		sender.sendMessage(MessageManager.applyColour("/MfmEvent <Start/Stop> [PercentageIncrease] [Duration e.g. 1h10m0s] - Create global multipliers for a limited time"));
		sender.sendMessage("");
		sender.sendMessage(MessageManager.applyColour(MessageManager.applyColour("Wiki: https://github.com/chocolf/MoneyFromMobs/wiki")));
		
		return true;
	}
}
