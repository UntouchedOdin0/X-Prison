package dev.drawethree.ultraprisoncore.gems.service.impl;

import dev.drawethree.ultraprisoncore.gems.repo.GemsRepository;
import dev.drawethree.ultraprisoncore.gems.service.GemsService;
import org.bukkit.OfflinePlayer;

import java.util.Map;
import java.util.UUID;

public class GemsServiceImpl implements GemsService {

	private final GemsRepository repository;

	public GemsServiceImpl(GemsRepository repository) {
		this.repository = repository;
	}

	@Override
	public long getPlayerGems(OfflinePlayer player) {
		return repository.getPlayerGems(player);
	}

	@Override
	public void setGems(OfflinePlayer player, long newAmount) {
		repository.updateGems(player, newAmount);
	}

	@Override
	public Map<UUID, Long> getTopGems(int amountOfRecords) {
		return repository.getTopGems(amountOfRecords);
	}

	@Override
	public void createGems(OfflinePlayer player, long startingGems) {
		repository.updateGems(player, startingGems);
	}
}