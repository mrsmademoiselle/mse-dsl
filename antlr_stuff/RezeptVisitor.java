// Generated from java-escape by ANTLR 4.11.1
package antlr_stuff;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RezeptParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RezeptVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RezeptParser#recipe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecipe(RezeptParser.RecipeContext ctx);
	/**
	 * Visit a parse tree produced by {@link RezeptParser#ingredient}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIngredient(RezeptParser.IngredientContext ctx);
	/**
	 * Visit a parse tree produced by {@link RezeptParser#preparation_step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreparation_step(RezeptParser.Preparation_stepContext ctx);
}