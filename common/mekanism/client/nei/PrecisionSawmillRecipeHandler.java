package mekanism.client.nei;

import java.util.Set;

import mekanism.client.gui.GuiPrecisionSawmill;
import mekanism.common.recipe.RecipeHandler.Recipe;
import mekanism.common.util.MekanismUtils;

public class PrecisionSawmillRecipeHandler extends ChanceMachineRecipeHandler
{
	@Override
	public String getRecipeName()
	{
		return MekanismUtils.localize("tile.MachineBlock2.PrecisionSawmill.name");
	}

	@Override
	public String getRecipeId()
	{
		return "mekanism.precisionsawmill";
	}

	@Override
	public String getOverlayIdentifier()
	{
		return "precisionsawmill";
	}

	@Override
	public Set getRecipes()
	{
		return Recipe.PRECISION_SAWMILL.get().entrySet();
	}

	@Override
	public String getGuiTexture()
	{
		return "mekanism:gui/GuiPrecisionSawmill.png";
	}

	@Override
	public Class getGuiClass()
	{
		return GuiPrecisionSawmill.class;
	}
}
