import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.evacipated.cardcrawl.modthespire.lib.SpireInitializer;
import com.megacrit.cardcrawl.helpers.CardHelper;
import com.megacrit.cardcrawl.localization.CardStrings;
import com.megacrit.cardcrawl.localization.PotionStrings;
import com.megacrit.cardcrawl.localization.PowerStrings;
import com.megacrit.cardcrawl.localization.RelicStrings;
import com.megacrit.cardcrawl.unlock.UnlockTracker;

import basemod.BaseMod;
import basemod.ModLabel;
import basemod.ModPanel;
import basemod.helpers.RelicType;
import basemod.interfaces.EditCardsSubscriber;
import basemod.interfaces.EditCharactersSubscriber;
import basemod.interfaces.EditKeywordsSubscriber;
import basemod.interfaces.EditRelicsSubscriber;
import basemod.interfaces.EditStringsSubscriber;
import basemod.interfaces.PostInitializeSubscriber;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@SpireInitializer
public class SpireFortressMod
        implements
        EditCardsSubscriber,
        EditRelicsSubscriber,
        EditStringsSubscriber,
        EditKeywordsSubscriber,
        EditCharactersSubscriber,
        PostInitializeSubscriber
{
    public static final Logger logger = LogManager.getLogger(DefaultMod.class.getName());

    //This is for the in-game mod settings panel.
    private static final String MODNAME = "SpireFortress Mod";
    private static final String AUTHOR = "knie20";
    private static final String DESCRIPTION = "A Slay the Spire Mod that incorporates Team Fortress 2";

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
