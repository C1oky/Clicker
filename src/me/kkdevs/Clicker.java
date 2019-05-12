package me.kkdevs;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Random;

import cn.nukkit.Player;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerInteractEvent;
import cn.nukkit.level.particle.AngryVillagerParticle;
import cn.nukkit.level.particle.HappyVillagerParticle;
import cn.nukkit.level.particle.HeartParticle;
import cn.nukkit.math.Vector3;
import cn.nukkit.plugin.PluginBase;
import cn.nukkit.utils.TextFormat;
import me.onebone.economyapi.EconomyAPI;
import cn.nukkit.utils.Utils;
import cn.nukkit.utils.Config;

public class Clicker extends PluginBase implements Listener {

    private EconomyAPI api;
    private Config cfg;

    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(this, this);
        EconomyCheker.checkAndRun(this);
        this.api = EconomyAPI.getInstance();
        if (!new File("plugins/Clicker").exists()) {
            new File("plugins/Clicker").mkdirs();
        }

        if (!new File("plugins/Clicker/Config.yml").exists()) {
            InputStream cfg = this.getClass().getClassLoader().getResourceAsStream("me/kkdevs/config.yml");
            try {
                Utils.writeFile("plugins/Clicker/Config.yml", cfg);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        this.cfg = new Config("plugins/Clicker/Config.yml", Config.YAML);
    }

    @EventHandler
    public void onClick(PlayerInteractEvent e) {
        Player p = e.getPlayer();

            Vector3 vector = new Vector3(p.getX() + nextDouble(-1 - 2, 1 + 4), p.getY() + 1.2, p.getZ() + nextDouble(-1 - 1, 1 + 4));
            Vector3 vector2 = new Vector3(p.getX() + nextDouble(-1 - 1, 1 + 3), p.getY() + 1.2, p.getZ() + nextDouble(-1 - 2, 1 + 3));
            Vector3 vector3 = new Vector3(p.getX() + nextDouble(-1 - 1, 1 + 0), p.getY() + 2.3, p.getZ() + nextDouble(-1 - 0, 1 + 2));
            Vector3 vector4 = new Vector3(p.getX() + nextDouble(-1 - 1, 1 + 2), p.getY() + 2.2, p.getZ() + nextDouble(-1 - 3, 1 + 3));
            Vector3 vector5 = new Vector3(p.getX() + nextDouble(-1 - 1, 1 + 2), p.getY() + 3.5, p.getZ() + nextDouble(-1 - 4, 1 + 4));
            Vector3 vector6 = new Vector3(p.getX() + nextDouble(-1 - 1, 1 + 3), p.getY() + 3.7, p.getZ() + nextDouble(-1 - 1, 1 + 0));
            Vector3 vector7 = new Vector3(p.getX() + nextDouble(-1 - 2, 1 + 4), p.getY() + 2.2, p.getZ() + nextDouble(-1 - 2, 1 + 2));
            Vector3 vector8 = new Vector3(p.getX() + nextDouble(-1 - 1, 1 + 3), p.getY() + 3.9, p.getZ() + nextDouble(-1 - 0, 1 + 3));
            Vector3 vector9 = new Vector3(p.getX() + nextDouble(-1 - 0, 1 + 2), p.getY() + 1.2, p.getZ() + nextDouble(-1 - 3, 1 + 0));
            Vector3 vector10 = new Vector3(p.getX() + nextDouble(-1 - 1, 1 + 3), p.getY() + 3.3, p.getZ() + nextDouble(-1 - 4, 1 + 1));
            Vector3 vector11 = new Vector3(p.getX() + nextDouble(-1 - 2, 1 + 4), p.getY() + 2.4, p.getZ() + nextDouble(-1 - 2, 1 + 2));
            Vector3 vector12 = new Vector3(p.getX() + nextDouble(-1 - 1, 1 + 3), p.getY() + 3.2, p.getZ() + nextDouble(-1 - 1, 1 + 3));
            Vector3 vector13 = new Vector3(p.getX() + nextDouble(-1 - 2, 1 + 4), p.getY() + 2.5, p.getZ() + nextDouble(-1 - 3, 1 + 0));
            Vector3 vector14 = new Vector3(p.getX() + nextDouble(-1 - 1, 1 + 3), p.getY() + 1.4, p.getZ() + nextDouble(-1 - 2, 1 + 2));
            Vector3 vector15 = new Vector3(p.getX() + nextDouble(-1 - 2, 1 + 2), p.getY() + 4.0, p.getZ() + nextDouble(-1 - 4, 1 + 3));
            Vector3 vector16 = new Vector3(p.getX() + nextDouble(-1 - 1, 1 + 3), p.getY() + 3.3, p.getZ() + nextDouble(-1 - 4, 1 + 1));
            Vector3 vector17 = new Vector3(p.getX() + nextDouble(-1 - 2, 1 + 4), p.getY() + 2.4, p.getZ() + nextDouble(-1 - 2, 1 + 2));
            Vector3 vector18 = new Vector3(p.getX() + nextDouble(-1 - 1, 1 + 3), p.getY() + 3.2, p.getZ() + nextDouble(-1 - 1, 1 + 3));
            Vector3 vector19 = new Vector3(p.getX() + nextDouble(-1 - 2, 1 + 4), p.getY() + 2.5, p.getZ() + nextDouble(-1 - 3, 1 + 0));
            Vector3 vector20 = new Vector3(p.getX() + nextDouble(-1 - 1, 1 + 2), p.getY() + 1.4, p.getZ() + nextDouble(-1 - 2, 1 + 2));
            Vector3 vector21 = new Vector3(p.getX() + nextDouble(-1 - 2, 1 + 2), p.getY() + 5.0, p.getZ() + nextDouble(-1 - 4, 1 + 3));
            Vector3 vector22 = new Vector3(p.getX(), p.getY() + nextDouble(1.5, 2.5), p.getZ());
            Vector3 vector23 = new Vector3(p.getX(), p.getY() + 1.9, p.getZ());
            if (e.getBlock().getId() == this.cfg.getInt("id")) {
                e.setCancelled();
                if (!p.isSurvival()) {
                    p.sendTitle(TextFormat.RED + "Перейдите в survival режим!");
                    this.getServer().getDefaultLevel().addParticle(new AngryVillagerParticle(vector23));
                } else {
                    int min = this.cfg.getInt("min");
                    int max = this.cfg.getInt("max");
                    final int money = rnd(min, max);

                    switch (this.cfg.getString("Conclusion")) {
                        case "title":
                            p.sendTitle(this.cfg.getString("text").replace("%money%", Integer.toString(money)).replace("%player%", p.getName()));
                            break;
                        case "popup":
                            p.sendPopup(this.cfg.getString("text").replace("%money%", Integer.toString(money)).replace("%player%", p.getName()));
                            break;
                        case "message":
                            p.sendMessage(this.cfg.getString("text").replace("%money%", Integer.toString(money)).replace("%player%", p.getName()));
                            break;
                    }

                    this.api.addMoney(p, money);
                    this.getServer().getDefaultLevel().addParticle(new HappyVillagerParticle(vector));
                    this.getServer().getDefaultLevel().addParticle(new HappyVillagerParticle(vector2));
                    this.getServer().getDefaultLevel().addParticle(new HappyVillagerParticle(vector3));
                    this.getServer().getDefaultLevel().addParticle(new HappyVillagerParticle(vector4));
                    this.getServer().getDefaultLevel().addParticle(new HappyVillagerParticle(vector5));
                    this.getServer().getDefaultLevel().addParticle(new HappyVillagerParticle(vector6));
                    this.getServer().getDefaultLevel().addParticle(new HappyVillagerParticle(vector7));
                    this.getServer().getDefaultLevel().addParticle(new HappyVillagerParticle(vector8));
                    this.getServer().getDefaultLevel().addParticle(new HappyVillagerParticle(vector9));
                    this.getServer().getDefaultLevel().addParticle(new HappyVillagerParticle(vector10));
                    this.getServer().getDefaultLevel().addParticle(new HappyVillagerParticle(vector11));
                    this.getServer().getDefaultLevel().addParticle(new HappyVillagerParticle(vector12));
                    this.getServer().getDefaultLevel().addParticle(new HappyVillagerParticle(vector13));
                    this.getServer().getDefaultLevel().addParticle(new HappyVillagerParticle(vector14));
                    this.getServer().getDefaultLevel().addParticle(new HappyVillagerParticle(vector15));
                    this.getServer().getDefaultLevel().addParticle(new HappyVillagerParticle(vector16));
                    this.getServer().getDefaultLevel().addParticle(new HappyVillagerParticle(vector17));
                    this.getServer().getDefaultLevel().addParticle(new HappyVillagerParticle(vector18));
                    this.getServer().getDefaultLevel().addParticle(new HappyVillagerParticle(vector19));
                    this.getServer().getDefaultLevel().addParticle(new HappyVillagerParticle(vector20));
                    this.getServer().getDefaultLevel().addParticle(new HappyVillagerParticle(vector21));
                    this.getServer().getDefaultLevel().addParticle(new HeartParticle(vector22));

                }
        }
    }

    public static double nextDouble(final double min, final double max){
        if (min == max) {
            return min;
        }
        return min + ((max - min) * new Random().nextDouble());
    }

    public static int rnd(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}