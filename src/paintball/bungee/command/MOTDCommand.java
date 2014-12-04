/*
 * Author: 598Johnn897
 * 
 * Date: Dec 2, 2014
 * Package: paintball.bungee.command
 *
 */
package paintball.bungee.command;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.plugin.Command;

/**
 * 
 */
public class MOTDCommand extends Command
{
	static final String name = "setmotd";
	static final String permission = "pb.bungee.broadcast";
	static final String[] aliases =
	{ "messageoftheday", "setmotd" };

	public MOTDCommand()
	{
		super(name, permission, aliases);
	}

	@Override public void execute(CommandSender sender, String[] args)
	{
		
	}
}
	
