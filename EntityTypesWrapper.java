package com.splitroxdev.theanthill.common.components.wrappers.names;

import net.minecraft.world.entity.EntityAreaEffectCloud;
import net.minecraft.world.entity.EntityExperienceOrb;
import net.minecraft.world.entity.EntityLightning;
import net.minecraft.world.entity.EntityTypes;
import net.minecraft.world.entity.GlowSquid;
import net.minecraft.world.entity.Marker;
import net.minecraft.world.entity.ambient.EntityBat;
import net.minecraft.world.entity.animal.EntityBee;
import net.minecraft.world.entity.animal.EntityCat;
import net.minecraft.world.entity.animal.EntityChicken;
import net.minecraft.world.entity.animal.EntityCod;
import net.minecraft.world.entity.animal.EntityCow;
import net.minecraft.world.entity.animal.EntityDolphin;
import net.minecraft.world.entity.animal.EntityFox;
import net.minecraft.world.entity.animal.EntityIronGolem;
import net.minecraft.world.entity.animal.EntityMushroomCow;
import net.minecraft.world.entity.animal.EntityOcelot;
import net.minecraft.world.entity.animal.EntityPanda;
import net.minecraft.world.entity.animal.EntityParrot;
import net.minecraft.world.entity.animal.EntityPig;
import net.minecraft.world.entity.animal.EntityPolarBear;
import net.minecraft.world.entity.animal.EntityPufferFish;
import net.minecraft.world.entity.animal.EntityRabbit;
import net.minecraft.world.entity.animal.EntitySalmon;
import net.minecraft.world.entity.animal.EntitySheep;
import net.minecraft.world.entity.animal.EntitySnowman;
import net.minecraft.world.entity.animal.EntitySquid;
import net.minecraft.world.entity.animal.EntityTropicalFish;
import net.minecraft.world.entity.animal.EntityTurtle;
import net.minecraft.world.entity.animal.EntityWolf;
import net.minecraft.world.entity.animal.axolotl.Axolotl;
import net.minecraft.world.entity.animal.goat.Goat;
import net.minecraft.world.entity.animal.horse.EntityHorse;
import net.minecraft.world.entity.animal.horse.EntityHorseDonkey;
import net.minecraft.world.entity.animal.horse.EntityHorseMule;
import net.minecraft.world.entity.animal.horse.EntityHorseSkeleton;
import net.minecraft.world.entity.animal.horse.EntityHorseZombie;
import net.minecraft.world.entity.animal.horse.EntityLlama;
import net.minecraft.world.entity.animal.horse.EntityLlamaTrader;
import net.minecraft.world.entity.boss.enderdragon.EntityEnderCrystal;
import net.minecraft.world.entity.boss.enderdragon.EntityEnderDragon;
import net.minecraft.world.entity.boss.wither.EntityWither;
import net.minecraft.world.entity.decoration.EntityArmorStand;
import net.minecraft.world.entity.decoration.EntityItemFrame;
import net.minecraft.world.entity.decoration.EntityLeash;
import net.minecraft.world.entity.decoration.EntityPainting;
import net.minecraft.world.entity.decoration.GlowItemFrame;
import net.minecraft.world.entity.item.EntityFallingBlock;
import net.minecraft.world.entity.item.EntityItem;
import net.minecraft.world.entity.item.EntityTNTPrimed;
import net.minecraft.world.entity.monster.EntityBlaze;
import net.minecraft.world.entity.monster.EntityCaveSpider;
import net.minecraft.world.entity.monster.EntityCreeper;
import net.minecraft.world.entity.monster.EntityDrowned;
import net.minecraft.world.entity.monster.EntityEnderman;
import net.minecraft.world.entity.monster.EntityEndermite;
import net.minecraft.world.entity.monster.EntityEvoker;
import net.minecraft.world.entity.monster.EntityGhast;
import net.minecraft.world.entity.monster.EntityGiantZombie;
import net.minecraft.world.entity.monster.EntityGuardian;
import net.minecraft.world.entity.monster.EntityGuardianElder;
import net.minecraft.world.entity.monster.EntityIllagerIllusioner;
import net.minecraft.world.entity.monster.EntityMagmaCube;
import net.minecraft.world.entity.monster.EntityPhantom;
import net.minecraft.world.entity.monster.EntityPigZombie;
import net.minecraft.world.entity.monster.EntityPillager;
import net.minecraft.world.entity.monster.EntityRavager;
import net.minecraft.world.entity.monster.EntityShulker;
import net.minecraft.world.entity.monster.EntitySilverfish;
import net.minecraft.world.entity.monster.EntitySkeleton;
import net.minecraft.world.entity.monster.EntitySkeletonStray;
import net.minecraft.world.entity.monster.EntitySkeletonWither;
import net.minecraft.world.entity.monster.EntitySlime;
import net.minecraft.world.entity.monster.EntitySpider;
import net.minecraft.world.entity.monster.EntityStrider;
import net.minecraft.world.entity.monster.EntityVex;
import net.minecraft.world.entity.monster.EntityVindicator;
import net.minecraft.world.entity.monster.EntityWitch;
import net.minecraft.world.entity.monster.EntityZoglin;
import net.minecraft.world.entity.monster.EntityZombie;
import net.minecraft.world.entity.monster.EntityZombieHusk;
import net.minecraft.world.entity.monster.EntityZombieVillager;
import net.minecraft.world.entity.monster.hoglin.EntityHoglin;
import net.minecraft.world.entity.monster.piglin.EntityPiglin;
import net.minecraft.world.entity.monster.piglin.EntityPiglinBrute;
import net.minecraft.world.entity.npc.EntityVillager;
import net.minecraft.world.entity.npc.EntityVillagerTrader;
import net.minecraft.world.entity.player.EntityHuman;
import net.minecraft.world.entity.projectile.EntityDragonFireball;
import net.minecraft.world.entity.projectile.EntityEgg;
import net.minecraft.world.entity.projectile.EntityEnderPearl;
import net.minecraft.world.entity.projectile.EntityEnderSignal;
import net.minecraft.world.entity.projectile.EntityEvokerFangs;
import net.minecraft.world.entity.projectile.EntityFireworks;
import net.minecraft.world.entity.projectile.EntityFishingHook;
import net.minecraft.world.entity.projectile.EntityLargeFireball;
import net.minecraft.world.entity.projectile.EntityLlamaSpit;
import net.minecraft.world.entity.projectile.EntityPotion;
import net.minecraft.world.entity.projectile.EntityShulkerBullet;
import net.minecraft.world.entity.projectile.EntitySmallFireball;
import net.minecraft.world.entity.projectile.EntitySnowball;
import net.minecraft.world.entity.projectile.EntitySpectralArrow;
import net.minecraft.world.entity.projectile.EntityThrownExpBottle;
import net.minecraft.world.entity.projectile.EntityThrownTrident;
import net.minecraft.world.entity.projectile.EntityTippedArrow;
import net.minecraft.world.entity.projectile.EntityWitherSkull;
import net.minecraft.world.entity.vehicle.EntityBoat;
import net.minecraft.world.entity.vehicle.EntityMinecartChest;
import net.minecraft.world.entity.vehicle.EntityMinecartCommandBlock;
import net.minecraft.world.entity.vehicle.EntityMinecartFurnace;
import net.minecraft.world.entity.vehicle.EntityMinecartHopper;
import net.minecraft.world.entity.vehicle.EntityMinecartMobSpawner;
import net.minecraft.world.entity.vehicle.EntityMinecartRideable;
import net.minecraft.world.entity.vehicle.EntityMinecartTNT;

public class EntityTypesWrapper {

	public static final EntityTypes<EntityAreaEffectCloud> AREA_EFFECT_CLOUD = EntityTypes.b;
	public static final EntityTypes<EntityArmorStand> ARMOR_STAND = EntityTypes.c;
	public static final EntityTypes<EntityTippedArrow> TIPPED_ARROW = EntityTypes.d;
	public static final EntityTypes<Axolotl> AXOLOTL = EntityTypes.e;
	public static final EntityTypes<EntityBat> BAT = EntityTypes.f;
	public static final EntityTypes<EntityBee> BEE = EntityTypes.g;
	public static final EntityTypes<EntityBlaze> BLAZE = EntityTypes.h;
	public static final EntityTypes<EntityBoat> BOAT = EntityTypes.i;
	public static final EntityTypes<EntityCat> CAT = EntityTypes.j;
	public static final EntityTypes<EntityCaveSpider> CAVE_SPIDER = EntityTypes.k;
	public static final EntityTypes<EntityChicken> CHICKEN = EntityTypes.l;
	public static final EntityTypes<EntityCod> COD = EntityTypes.m;
	public static final EntityTypes<EntityCow> COW = EntityTypes.n;
	public static final EntityTypes<EntityCreeper> CREEPER = EntityTypes.o;
	public static final EntityTypes<EntityDolphin> DOLPHIN = EntityTypes.p;
	public static final EntityTypes<EntityHorseDonkey> HORSE_DONKEY = EntityTypes.q;
	public static final EntityTypes<EntityDragonFireball> DRAGON_FIREBALL = EntityTypes.r;
	public static final EntityTypes<EntityDrowned> DROWNED = EntityTypes.s;
	public static final EntityTypes<EntityGuardianElder> GUARDIAN_ELDER = EntityTypes.t;
	public static final EntityTypes<EntityEnderCrystal> ENDER_CRYSTAL = EntityTypes.u;
	public static final EntityTypes<EntityEnderDragon> ENDER_DRAGON = EntityTypes.v;
	public static final EntityTypes<EntityEnderman> ENDERMAN = EntityTypes.w;
	public static final EntityTypes<EntityEndermite> ENDERMITE = EntityTypes.x;
	public static final EntityTypes<EntityEvoker> EVOKER = EntityTypes.y;
	public static final EntityTypes<EntityEvokerFangs> EVOKER_FANGS = EntityTypes.z;
	public static final EntityTypes<EntityExperienceOrb> EXPERIENCE_ORB = EntityTypes.A;
	public static final EntityTypes<EntityEnderSignal> ENDER_SIGNAL = EntityTypes.B;
	public static final EntityTypes<EntityFallingBlock> FALLING_BLOCK = EntityTypes.C;
	public static final EntityTypes<EntityFireworks> FIREWORKS = EntityTypes.D;
	public static final EntityTypes<EntityFox> FOX = EntityTypes.E;
	public static final EntityTypes<EntityGhast> GHAST = EntityTypes.F;
	public static final EntityTypes<EntityGiantZombie> GIANT_ZOMBIE = EntityTypes.G;
	public static final EntityTypes<GlowItemFrame> GLOW_ITEM_FRAME = EntityTypes.H;
	public static final EntityTypes<GlowSquid> GLOW_SQUID = EntityTypes.I;
	public static final EntityTypes<Goat> GOAT = EntityTypes.J;
	public static final EntityTypes<EntityGuardian> GUARDIAN = EntityTypes.K;
	public static final EntityTypes<EntityHoglin> HOGLIN = EntityTypes.L;
	public static final EntityTypes<EntityHorse> HORSE = EntityTypes.M;
	public static final EntityTypes<EntityZombieHusk> ZOMBIE_HUSK = EntityTypes.N;
	public static final EntityTypes<EntityIllagerIllusioner> ILLAGER_ILLUSIONER = EntityTypes.O;
	public static final EntityTypes<EntityIronGolem> IRON_GOLEM = EntityTypes.P;
	public static final EntityTypes<EntityItem> ITEM = EntityTypes.Q;
	public static final EntityTypes<EntityItemFrame> ITEM_FRAME = EntityTypes.R;
	public static final EntityTypes<EntityLargeFireball> LARGE_FIREBALL = EntityTypes.S;
	public static final EntityTypes<EntityLeash> LEASH = EntityTypes.T;
	public static final EntityTypes<EntityLightning> LIGHTNING = EntityTypes.U;
	public static final EntityTypes<EntityLlama> LLAMA = EntityTypes.V;
	public static final EntityTypes<EntityLlamaSpit> LLAMA_SPIT = EntityTypes.W;
	public static final EntityTypes<EntityMagmaCube> MAGMA_CUBE = EntityTypes.X;
	public static final EntityTypes<Marker> MARKER = EntityTypes.Y;
	public static final EntityTypes<EntityMinecartRideable> MINECART_RIDEABLE = EntityTypes.Z;
	public static final EntityTypes<EntityMinecartChest> MINECART_CHEST = EntityTypes.aa;
	public static final EntityTypes<EntityMinecartCommandBlock> MINECART_COMMAND_BLOCK = EntityTypes.ab;
	public static final EntityTypes<EntityMinecartFurnace> MINECART_FURNACE = EntityTypes.ac;
	public static final EntityTypes<EntityMinecartHopper> MINECART_HOPPER = EntityTypes.ad;
	public static final EntityTypes<EntityMinecartMobSpawner> MINECART_MOB_SPAWNER = EntityTypes.ae;
	public static final EntityTypes<EntityMinecartTNT> MINECART_T_N_T = EntityTypes.af;
	public static final EntityTypes<EntityHorseMule> HORSE_MULE = EntityTypes.ag;
	public static final EntityTypes<EntityMushroomCow> MUSHROOM_COW = EntityTypes.ah;
	public static final EntityTypes<EntityOcelot> OCELOT = EntityTypes.ai;
	public static final EntityTypes<EntityPainting> PAINTING = EntityTypes.aj;
	public static final EntityTypes<EntityPanda> PANDA = EntityTypes.ak;
	public static final EntityTypes<EntityParrot> PARROT = EntityTypes.al;
	public static final EntityTypes<EntityPhantom> PHANTOM = EntityTypes.am;
	public static final EntityTypes<EntityPig> PIG = EntityTypes.an;
	public static final EntityTypes<EntityPiglin> PIGLIN = EntityTypes.ao;
	public static final EntityTypes<EntityPiglinBrute> PIGLIN_BRUTE = EntityTypes.ap;
	public static final EntityTypes<EntityPillager> PILLAGER = EntityTypes.aq;
	public static final EntityTypes<EntityPolarBear> POLAR_BEAR = EntityTypes.ar;
	public static final EntityTypes<EntityTNTPrimed> T_N_T_PRIMED = EntityTypes.as;
	public static final EntityTypes<EntityPufferFish> PUFFER_FISH = EntityTypes.at;
	public static final EntityTypes<EntityRabbit> RABBIT = EntityTypes.au;
	public static final EntityTypes<EntityRavager> RAVAGER = EntityTypes.av;
	public static final EntityTypes<EntitySalmon> SALMON = EntityTypes.aw;
	public static final EntityTypes<EntitySheep> SHEEP = EntityTypes.ax;
	public static final EntityTypes<EntityShulker> SHULKER = EntityTypes.ay;
	public static final EntityTypes<EntityShulkerBullet> SHULKER_BULLET = EntityTypes.az;
	public static final EntityTypes<EntitySilverfish> SILVERFISH = EntityTypes.aA;
	public static final EntityTypes<EntitySkeleton> SKELETON = EntityTypes.aB;
	public static final EntityTypes<EntityHorseSkeleton> HORSE_SKELETON = EntityTypes.aC;
	public static final EntityTypes<EntitySlime> SLIME = EntityTypes.aD;
	public static final EntityTypes<EntitySmallFireball> SMALL_FIREBALL = EntityTypes.aE;
	public static final EntityTypes<EntitySnowman> SNOWMAN = EntityTypes.aF;
	public static final EntityTypes<EntitySnowball> SNOWBALL = EntityTypes.aG;
	public static final EntityTypes<EntitySpectralArrow> SPECTRAL_ARROW = EntityTypes.aH;
	public static final EntityTypes<EntitySpider> SPIDER = EntityTypes.aI;
	public static final EntityTypes<EntitySquid> SQUID = EntityTypes.aJ;
	public static final EntityTypes<EntitySkeletonStray> SKELETON_STRAY = EntityTypes.aK;
	public static final EntityTypes<EntityStrider> STRIDER = EntityTypes.aL;
	public static final EntityTypes<EntityEgg> EGG = EntityTypes.aM;
	public static final EntityTypes<EntityEnderPearl> ENDER_PEARL = EntityTypes.aN;
	public static final EntityTypes<EntityThrownExpBottle> THROWN_EXP_BOTTLE = EntityTypes.aO;
	public static final EntityTypes<EntityPotion> POTION = EntityTypes.aP;
	public static final EntityTypes<EntityThrownTrident> THROWN_TRIDENT = EntityTypes.aQ;
	public static final EntityTypes<EntityLlamaTrader> LLAMA_TRADER = EntityTypes.aR;
	public static final EntityTypes<EntityTropicalFish> TROPICAL_FISH = EntityTypes.aS;
	public static final EntityTypes<EntityTurtle> TURTLE = EntityTypes.aT;
	public static final EntityTypes<EntityVex> VEX = EntityTypes.aU;
	public static final EntityTypes<EntityVillager> VILLAGER = EntityTypes.aV;
	public static final EntityTypes<EntityVindicator> VINDICATOR = EntityTypes.aW;
	public static final EntityTypes<EntityVillagerTrader> VILLAGER_TRADER = EntityTypes.aX;
	public static final EntityTypes<EntityWitch> WITCH = EntityTypes.aY;
	public static final EntityTypes<EntityWither> WITHER = EntityTypes.aZ;
	public static final EntityTypes<EntitySkeletonWither> SKELETON_WITHER = EntityTypes.ba;
	public static final EntityTypes<EntityWitherSkull> WITHER_SKULL = EntityTypes.bb;
	public static final EntityTypes<EntityWolf> WOLF = EntityTypes.bc;
	public static final EntityTypes<EntityZoglin> ZOGLIN = EntityTypes.bd;
	public static final EntityTypes<EntityZombie> ZOMBIE = EntityTypes.be;
	public static final EntityTypes<EntityHorseZombie> HORSE_ZOMBIE = EntityTypes.bf;
	public static final EntityTypes<EntityZombieVillager> ZOMBIE_VILLAGER = EntityTypes.bg;
	public static final EntityTypes<EntityPigZombie> PIG_ZOMBIE = EntityTypes.bh;
	public static final EntityTypes<EntityHuman> HUMAN = EntityTypes.bi;
	public static final EntityTypes<EntityFishingHook> FISHING_HOOK = EntityTypes.bj;

}
