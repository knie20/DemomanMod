package demomanmod;

import basemod.BaseMod;
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
import demomanmod.patches.AbstractCardEnum;
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

    //This is for the in-game mod settings panel.
    private static final String MODNAME = "Demoman Mod";
    private static final String AUTHOR = "knie20";
    private static final String DESCRIPTION = "A Slay the Spire Mod that incorporates the Drunken Scottish Cyclops";

    public static final Color DEMOMAN_BRONZE = CardHelper.getColor(80.0f, 56.0f, 0.0f);

    private static final String DEFAULT_MOD_ASSETS_FOLDER = "demoman_images";

    private static final String ATTACK_CARD_PATH = "cardui/512/bg_attack_bronze_512.png";
    private static final String SKILL_CARD_PATH = "cardui/512/bg_skill_bronze_512.png";
    private static final String POWER_CARD_PATH = "cardui/512/bg_power_bronze_512.png";
    private static final String ENERGY_ORB_PATH = "cardui/512/card_energy_bronze_orb.png";
    private static final String CARD_ENERGY_ORB = "cardui/512/card_small_bronze_orb.png";
    private static final String PORTRAIT_ATTACK_CARD_PATH = "cardui/1024/bg_attack_bronze.png";
    private static final String PORTRAIT_SKILL_CARD_PATH = "cardui/1024/bg_skill_bronze.png";
    private static final String PORTRAIT_POWER_CARD_PATH = "cardui/1024/bg_power_bronze.png";
    private static final String PORTRAIT_ENERGY_ORB_PATH = "cardui/1024/energy_bronze.png";

    public DemomanMod() {
        BaseMod.subscribe(this);

        BaseMod.addColor(
                AbstractCardEnum.DEMOMAN_BRONZE,
                DEMOMAN_BRONZE,
                makePath(ATTACK_CARD_PATH),
                makePath(ATTACK_CARD_PATH),
                makePath(ATTACK_CARD_PATH),
                makePath(ATTACK_CARD_PATH),
                makePath(ATTACK_CARD_PATH),
                makePath(ATTACK_CARD_PATH),
        );
    }

    public static void initialize() {
        new DemomanMod();
    }

    public static final String makePath(String resource) {
        return DEFAULT_MOD_ASSETS_FOLDER + "/" + resource;
    }


    public void receiveEditCards() {

    }

    public void receiveEditCharacters() {

    }

    public void receiveEditKeywords() {

    }

    public void receiveEditRelics() {

    }

    public void receiveEditStrings() {

    }

    public void receivePostInitialize() {

    }
}
