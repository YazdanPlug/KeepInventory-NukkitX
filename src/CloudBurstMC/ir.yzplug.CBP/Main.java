package iR.yzplug.CBP;

import org.cloudburstmc.server.event.Listener;
import org.cloudburstmc.server.event.player.PlayerDeathEvent;
import org.cloudburstmc.server.event.server.ServerInitializationEvent;
import org.cloudburstmc.server.player.Player;
import org.cloudburstmc.server.plugin.Plugin;
import org.cloudburstmc.server.utils.TextFormat;

@Plugin(id = "KeepInventory", version = "1.0", authors = "YazdanPlug", description = "Keeped players inventory on death")
public class Main {
	
	@Listener
	public void onServerInitialization(ServerInitializationEvent event) {
	    
	    }
	@Listener
	public void onDeath(PlayerDeathEvent e){
		Player p = e.getEntity();
		e.setKeepInventory(true);
		p.sendMessage(TextFormat.GREEN + "+ - + [ Keeped your inventory ] + - +");
	}
	
}
