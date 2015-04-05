package net.tyan.letslearn.init;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.tyan.letslearn.item.ItemLL;
import net.tyan.letslearn.item.ItemMapleLeaf;

/**
 * by Tyan on 05.04.2015.
 */

public class ModItems {

    public static ItemLL mapleLeaf = new ItemMapleLeaf();

    public static void init() {
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
    }
}
