package com.laioffer.twitch.db;

import com.laioffer.twitch.db.entity.ItemEntity;
import org.springframework.data.repository.ListCrudRepository;

public interface ItemRepository extends ListCrudRepository<ItemEntity, Long> {
    // SELECT * FROM Items WHERE twitch_id = twitchId
    ItemEntity findByTwitchId(String twitchId);
}
