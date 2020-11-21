package iR.yzplug.death;

import cn.nukkit.Player;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerDeathEvent;
import cn.nukkit.plugin.PluginBase;
import cn.nukkit.utils.TextFormat;

public class Main extends PluginBase implements Listener {
	@Override
	public void onEnable() {
		this.getLogger().info("KeepInventory plugin is Enabled");
		this.getLogger().info("KeepInventory plugin created by" + TextFormat.YELLOW + "(YazdanPlug)");
		this.getServer().getPluginManager().registerEvents(this, this);
	}
	@Override
	public void onDisable() {
		this.getLogger().info("KeepInventory plugin is Disabled");
		this.getServer().getPluginManager().registerEvents(this, this);
	}
	@EventHandler
	public void PlayerDeath(PlayerDeathEvent e) {
		Player p = e.getEntity();
		e.setKeepInventory(true);
		p.sendMessage(TextFormat.GREEN + "Keeped youre inventory");
	}
}
