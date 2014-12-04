/*
 * Author: 598Johnn897
 * 
 * Date: Dec 2, 2014
 * Package: paintball.bungee
 *
 */
package paintball.bungee.motd;

import java.io.IOException;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.ServerPing;
import net.md_5.bungee.api.event.ProxyPingEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;

/**
 * 
 */
public class PaintballMOTD implements Listener
{
	@EventHandler public void onPing(ProxyPingEvent ev)
	{
		ServerPing ping = ev.getResponse();
		try
		{
			ping.setDescription(ChatColor.translateAlternateColorCodes('&',
					MOTDUtil.getMOTDfromFile()));
		} catch (IOException e)
		{
			ping.setDescription(ChatColor.translateAlternateColorCodes('&',
					MOTDUtil.getDefaultMOTD()));
		}
		ev.setResponse(ping);
	}
}
