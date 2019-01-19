package demomanmod;

import basemod.BaseMod;
import basemod.ModLabel;
import basemod.ModPanel;
import com.evacipated.cardcrawl.modthespire.lib.SpireInitializer;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;

import basemod.interfaces.EditCardsSubscriber;
import basemod.interfaces.EditCharactersSubscriber;
import basemod.interfaces.EditKeywordsSubscriber;
import basemod.interfaces.EditRelicsSubscriber;
import basemod.interfaces.EditStringsSubscriber;
import basemod.interfaces.PostInitializeSubscriber;

import com.megacrit.cardcrawl.helpers.CardHelper;
import demomanmod.characters.DemomanCharacter;
import demomanmod.patches.AbstractCardEnum;
import demomanmod.patches.DemomanCharacterEnum;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@SpireInitializer
public class DemomanMod
        implements
        EditCardsSubscriber,
        EditRelicsSubscriber,
        EditStringsSubscriber,
        EditKeywordsSubscriber,
        EditCharactersSubscriber,
        PostInitializeSubscriber
{
    public static final Logger logger = LogManager.getLogger(DemomanMod.class.getName());

    // -----------------This is for the in-game mod settings panel-----------------
    private static final String MODNAME = "Demoman Mod";
    private static final String AUTHOR = "knie20";
    private static final String DESCRIPTION = "A Slay the Spire Mod that incorporates the Drunken Scottish Cyclops";

    public static final Color DEMOMAN_BRONZE = CardHelper.getColor(80.0f, 56.0f, 0.0f);

    private static final String DEFAULT_MOD_ASSETS_FOLDER = "demoman_images";

    // -----------------Card backgrounds-----------------
    private static final String ATTACK_CARD_PATH = "cardui/512/bg_attack_bronze_512.png";
    private static final String SKILL_CARD_PATH = "cardui/512/bg_skill_bronze_512.png";
    private static final String POWER_CARD_PATH = "cardui/512/bg_power_bronze_512.png";
    private static final String CARD_ENERGY_ORB_PATH = "cardui/512/card_energy_bronze_orb.png";
    private static final String CARD_ENERGY_ORB_SMALL_PATH = "cardui/512/card_small_bronze_orb.png";
    private static final String PORTRAIT_ATTACK_CARD_PATH = "cardui/1024/bg_attack_bronze.png";
    private static final String PORTRAIT_SKILL_CARD_PATH = "cardui/1024/bg_skill_bronze.png";
    private static final String PORTRAIT_POWER_CARD_PATH = "cardui/1024/bg_power_bronze.png";
    private static final String PORTRAIT_ENERGY_ORB_PATH = "cardui/1024/energy_bronze.png";

    // -----------------Card images-----------------
    public static final String DEMOMAN_COMMON_STRIKE = "cards/Demoman_Strike.png";
    public static final String DEMOMAN_COMMON_DEFEND = "cards/Demoman_Defend.png";

    // -----------------Power(Buffs/Debuffs) images-----------------
    public static final String DEMOMAN_POWER_INTOXICATED = "powers/Demoman_Intoxicated.png";

    // -----------------Relic images-----------------
    public static final String DEMOMAN_RELIC_CYLINDRICAL_CHAMBERS = "relics/Demoman_Cylindrical_Chambers.png";

    // -----------------Character assets-----------------
    private static final String DEMOMAN_CHARSELECT_BUTTON = "char/Demoman_Character_Button.png";
    private static final String DEMOMAN_PORTRAIT = "char/Demoman_Character_Portrait.png";
    public static final String DEMOMAN_SHOULDER_1 = "char/Demoman_Shoulder1.png";
    public static final String DEMOMAN_SHOULDER_2 = "char/Demoman_Shoulder2.png";
    public static final String DEMOMAN_CORPSE = "char/Demoman_Corpse.png";

    // -----------------Mod Badge-----------------
    public static final String DEMOMAN_BADGE_IMAGE = "Badge.png";

    public DemomanMod() {
        BaseMod.subscribe(this);

        BaseMod.addColor(
                AbstractCardEnum.DEMOMAN_BRONZE,
                DEMOMAN_BRONZE,
                makePath(ATTACK_CARD_PATH),
                makePath(SKILL_CARD_PATH),
                makePath(POWER_CARD_PATH),
                makePath(CARD_ENERGY_ORB_PATH),
                makePath(PORTRAIT_ATTACK_CARD_PATH),
                makePath(PORTRAIT_SKILL_CARD_PATH),
                makePath(PORTRAIT_POWER_CARD_PATH),
                makePath(PORTRAIT_ENERGY_ORB_PATH),
                makePath(CARD_ENERGY_ORB_SMALL_PATH)
        );

        logger.info("Done creating the color");
    }

    public static final String makePath(String resource) {
        return DEFAULT_MOD_ASSETS_FOLDER + "/" + resource;
    }

    @SuppressWarnings("unused")
    public static void initialize() {
        logger.info("========================= Initializing Demoman Mod. Aye. =========================");
        DemomanMod mod = new DemomanMod();
        logger.info("========================= /Default Mod Initialized/ =========================");
    }

    @Override
    public void receiveEditCharacters() {
        logger.info("Beginning to edit characters. " + "Add " + DemomanCharacterEnum.DEMOMAN.toString());

        BaseMod.addCharacter((new DemomanCharacter("The Demoman", DemomanCharacterEnum.DEMOMAN),
                makePath(DEMOMAN_CHARSELECT_BUTTON), makePath(DEMOMAN_PORTRAIT), DemomanCharacterEnum.DEMOMAN);

        receiveEditPotions();
        logger.info("Done editing characters");
    }

    @Override
    public void receivePostInitialize() {
        logger.info("Loading badge image and mod options");
        // Load the Mod Badge
        Texture badgeTexture = new Texture(makePath(DEMOMAN_BADGE_IMAGE));

        // Create the Mod Menu
        ModPanel settingsPanel = new ModPanel();
        settingsPanel.addUIElement(new ModLabel("DemomanMod doesn't have any settings!", 400.0f, 700.0f,
                settingsPanel, (me) -> {
        }));
        BaseMod.registerModBadge(badgeTexture, MODNAME, AUTHOR, DESCRIPTION, settingsPanel);

        logger.info("Done loading badge Image and mod options");
    }

    public void receiveEditPotions() {
        logger.info("Beginning to edit potions");

        // use BaseMod.addPotion to add a custom potion.

        logger.info("Done editing potions");
    }

    public void receiveEditCards() {

    }

    public void receiveEditKeywords() {

    }

    public void receiveEditRelics() {

    }

    public void receiveEditStrings() {

    }
}
