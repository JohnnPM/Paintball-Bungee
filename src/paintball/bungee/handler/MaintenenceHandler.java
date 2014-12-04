/*
 * Author: 598Johnn897
 * 
 * Date: Dec 3, 2014
 * Package: paintball.bungee.handler
 *
 */
package paintball.bungee.handler;

import paintball.bungee.lib.References;
import net.md_5.bungee.api.event.PostLoginEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;

/**
 * 
 */
public class MaintenenceHandler implements Listener
{
	public boolean maintence = false;
	
	@SuppressWarnings("deprecation") 
	@EventHandler public void onLogin(PostLoginEvent ev)
	{
		if (maintence) 
			if(!ev.getPlayer().getName().equals(References.AUTHOR)) 
				ev.getPlayer().disconnect("Maintence Mode");
	}
}
