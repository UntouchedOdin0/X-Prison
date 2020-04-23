package me.drawethree.wildprisonautosell.api;

import com.sk89q.worldguard.protection.regions.ProtectedRegion;
import me.drawethree.wildprisonautosell.WildPrisonAutoSell;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

public class WildPrisonAutoSellAPIImpl implements WildPrisonAutoSellAPI {

    private WildPrisonAutoSell plugin;

    public WildPrisonAutoSellAPIImpl(WildPrisonAutoSell plugin) {
        this.plugin = plugin;
    }

    @Override
    public long getCurrentEarnings(Player player) {
        return plugin.getCurrentEarnings(player);
    }

    @Override
    public int getPriceForBrokenBlock(ProtectedRegion region, Block block) {
        return plugin.getPriceForBrokenBlock(region, block);
    }

    @Override
    public boolean hasAutoSellEnabled(Player p) {
        return plugin.hasAutoSellEnabled(p);
    }
}
