package demomanmod.characters;

import basemod.abstracts.CustomPlayer;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.megacrit.cardcrawl.actions.AbstractGameAction;
import com.megacrit.cardcrawl.cards.AbstractCard;
import com.megacrit.cardcrawl.characters.AbstractPlayer;
import com.megacrit.cardcrawl.helpers.CardHelper;
import com.megacrit.cardcrawl.screens.CharSelectInfo;

import java.util.ArrayList;

public class DemomanCharacter extends CustomPlayer {

    public static Color cardRenderColor = CardHelper.getColor(80.0f, 56.0f, 0.0f);

    // -----------------Base stats-----------------
    public static final int ENERGY_PER_TURN = 3;
    public static final int STARTING_HP = 75;
    public static final int MAX_HP = 75;
    public static final int STARTING_GOLD = 99;
    public static final int CARD_DRAW = 9;
    public static final int ORB_SLOTS = 0;

    public DemomanCharacter(String name, PlayerClass playerClass, String[] orbTextures, String orbVfxPath, String model, String animation) {
        super(name, playerClass, orbTextures, orbVfxPath, model, animation);
    }

    @Override
    public ArrayList<String> getStartingDeck() {
        return null;
    }

    @Override
    public ArrayList<String> getStartingRelics() {
        return null;
    }

    @Override
    public CharSelectInfo getLoadout() {
        return null;
    }

    @Override
    public String getTitle(PlayerClass playerClass) {
        return null;
    }

    @Override
    public AbstractCard.CardColor getCardColor() {
        return null;
    }

    @Override
    public Color getCardRenderColor() {
        return null;
    }

    @Override
    public AbstractCard getStartCardForEvent() {
        return null;
    }

    @Override
    public Color getCardTrailColor() {
        return null;
    }

    @Override
    public int getAscensionMaxHPLoss() {
        return 0;
    }

    @Override
    public BitmapFont getEnergyNumFont() {
        return null;
    }

    @Override
    public void doCharSelectScreenSelectEffect() {

    }

    @Override
    public String getCustomModeCharacterButtonSoundKey() {
        return null;
    }

    @Override
    public String getLocalizedCharacterName() {
        return null;
    }

    @Override
    public AbstractPlayer newInstance() {
        return null;
    }

    @Override
    public String getSpireHeartText() {
        return null;
    }

    @Override
    public Color getSlashAttackColor() {
        return null;
    }

    @Override
    public AbstractGameAction.AttackEffect[] getSpireHeartSlashEffect() {
        return new AbstractGameAction.AttackEffect[0];
    }

    @Override
    public String getVampireText() {
        return null;
    }
}
