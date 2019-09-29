// Generated from G:/InfProjekte/LexikalischeFilter/src/main/java\Ipadresse.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link IpadresseParser}.
 */
public interface IpadresseListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link IpadresseParser#ip}.
	 * @param ctx the parse tree
	 */
	void enterIp(IpadresseParser.IpContext ctx);
	/**
	 * Exit a parse tree produced by {@link IpadresseParser#ip}.
	 * @param ctx the parse tree
	 */
	void exitIp(IpadresseParser.IpContext ctx);
	/**
	 * Enter a parse tree produced by {@link IpadresseParser#part}.
	 * @param ctx the parse tree
	 */
	void enterPart(IpadresseParser.PartContext ctx);
	/**
	 * Exit a parse tree produced by {@link IpadresseParser#part}.
	 * @param ctx the parse tree
	 */
	void exitPart(IpadresseParser.PartContext ctx);
}