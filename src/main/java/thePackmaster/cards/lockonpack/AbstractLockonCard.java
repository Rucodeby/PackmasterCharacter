package thePackmaster.cards.lockonpack;

import thePackmaster.cards.AbstractPackmasterCard;

public abstract class AbstractLockonCard extends AbstractPackmasterCard
{
    public AbstractLockonCard(String cardID, int cost, CardType type, CardRarity rarity, CardTarget target)
    {
        super(cardID, cost, type, rarity, target, (String)null);
    }
}
