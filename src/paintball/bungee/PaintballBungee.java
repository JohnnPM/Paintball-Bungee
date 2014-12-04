/*
 * Author: 598Johnn897
 * 
 * Date: Nov 27, 2014
 * Package: paintball.bungee
 *
 */
package paintball.bungee;

import lombok.Getter;
import net.md_5.bungee.api.plugin.Plugin;
import paintball.bungee.lib.References;

/**
 * 
 */
public class PaintballBungee extends Plugin
{
	@Getter private static PaintballBungee instance;
	
	@Override public void onLoad()
	{
		instance = this;
	}

	@Override public void onEnable()
	{
		try
		{
			PaintballBungeeUtil.registerCommands(this);
			PaintballBungeeUtil.registerEvents(this);
			
		    getProxy().registerChannel(References.PB_MSG_CHANNEL);
	    
		} catch (Exception e)
		{
			e.printStackTrace();
		} finally
		{

		}
	}

	@Override public void onDisable()
	{

	}
}
