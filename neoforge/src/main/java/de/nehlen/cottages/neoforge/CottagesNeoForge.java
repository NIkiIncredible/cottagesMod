package de.nehlen.cottages.neoforge;

import de.nehlen.cottages.Cottages;
import net.neoforged.fml.common.Mod;

@Mod(Cottages.MOD_ID)
public final class CottagesNeoForge {
    public CottagesNeoForge() {
        // Run our common setup.
        Cottages.init();
    }
}
