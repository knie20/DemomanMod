package demomanmod;

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

    public static final Color DEMOMAN_BRONZE = CardHelper.getColor(64.0f, 70.0f, 70.0f);

    private static final String DEFAULT_MOD_ASSETS_FOLDER = "demoman_images";

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
