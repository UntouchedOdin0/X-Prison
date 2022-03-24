package dev.drawethree.ultraprisoncore.mines.api;

import dev.drawethree.ultraprisoncore.mines.UltraPrisonMines;
import dev.drawethree.ultraprisoncore.mines.model.mine.Mine;
import org.bukkit.Location;

public class UltraPrisonMinesAPIImpl implements UltraPrisonMinesAPI {

	private UltraPrisonMines plugin;

	public UltraPrisonMinesAPIImpl(UltraPrisonMines plugin) {
		this.plugin = plugin;
	}

	@Override
	public Mine getMineByName(String name) {
		return this.plugin.getManager().getMineByName(name);
	}

	@Override
	public Mine getMineAtLocation(Location loc) {
		return this.plugin.getManager().getMineAtLocation(loc);
	}
}