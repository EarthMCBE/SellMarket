package market.events;

import cn.nukkit.Player;
import cn.nukkit.event.Cancellable;
import cn.nukkit.event.HandlerList;
import cn.nukkit.event.player.PlayerEvent;
import market.player.iTypes;

public class PlayerBuyItemEvent extends PlayerEvent implements Cancellable {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    public static HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    public iTypes types;

    public PlayerBuyItemEvent(Player player, iTypes types){
        this.player = player;
        this.types = types;
    }

    public iTypes getTypes() {
        return types;
    }


}
