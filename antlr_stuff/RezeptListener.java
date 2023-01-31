// Generated from java-escape by ANTLR 4.11.1
package antlr_stuff;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RezeptParser}.
 */
public interface RezeptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RezeptParser#recipe}.
	 * @param ctx the parse tree
	 */
	void enterRecipe(RezeptParser.RecipeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RezeptParser#recipe}.
	 * @param ctx the parse tree
	 */
	void exitRecipe(RezeptParser.RecipeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RezeptParser#ingredient}.
	 * @param ctx the parse tree
	 */
	void enterIngredient(RezeptParser.IngredientContext ctx);
	/**
	 * Exit a parse tree produced by {@link RezeptParser#ingredient}.
	 * @param ctx the parse tree
	 */
	void exitIngredient(RezeptParser.IngredientContext ctx);
	/**
	 * Enter a parse tree produced by {@link RezeptParser#preparation_step}.
	 * @param ctx the parse tree
	 */
	void enterPreparation_step(RezeptParser.Preparation_stepContext ctx);
	/**
	 * Exit a parse tree produced by {@link RezeptParser#preparation_step}.
	 * @param ctx the parse tree
	 */
	void exitPreparation_step(RezeptParser.Preparation_stepContext ctx);
}