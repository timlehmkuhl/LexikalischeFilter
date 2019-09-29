// Generated from G:/InfProjekte/Lexikalische Filter/src/main/ANTLR\Zeit.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ZeitParser}.
 */
public interface ZeitListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ZeitParser#zeit}.
	 * @param ctx the parse tree
	 */
	void enterZeit(ZeitParser.ZeitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZeitParser#zeit}.
	 * @param ctx the parse tree
	 */
	void exitZeit(ZeitParser.ZeitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZeitParser#einheit}.
	 * @param ctx the parse tree
	 */
	void enterEinheit(ZeitParser.EinheitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZeitParser#einheit}.
	 * @param ctx the parse tree
	 */
	void exitEinheit(ZeitParser.EinheitContext ctx);
}