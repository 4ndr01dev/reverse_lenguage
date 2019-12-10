// Generated from RevesParser.g4 by ANTLR 4.4
package com.backwardslanguage.reves.reves;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RevesParserParser}.
 */
public interface RevesParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RevesParserParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(@NotNull RevesParserParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link RevesParserParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(@NotNull RevesParserParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link RevesParserParser#nltnirp}.
	 * @param ctx the parse tree
	 */
	void enterNltnirp(@NotNull RevesParserParser.NltnirpContext ctx);
	/**
	 * Exit a parse tree produced by {@link RevesParserParser#nltnirp}.
	 * @param ctx the parse tree
	 */
	void exitNltnirp(@NotNull RevesParserParser.NltnirpContext ctx);
	/**
	 * Enter a parse tree produced by {@link RevesParserParser#elihw}.
	 * @param ctx the parse tree
	 */
	void enterElihw(@NotNull RevesParserParser.ElihwContext ctx);
	/**
	 * Exit a parse tree produced by {@link RevesParserParser#elihw}.
	 * @param ctx the parse tree
	 */
	void exitElihw(@NotNull RevesParserParser.ElihwContext ctx);
	/**
	 * Enter a parse tree produced by {@link RevesParserParser#var_assingn}.
	 * @param ctx the parse tree
	 */
	void enterVar_assingn(@NotNull RevesParserParser.Var_assingnContext ctx);
	/**
	 * Exit a parse tree produced by {@link RevesParserParser#var_assingn}.
	 * @param ctx the parse tree
	 */
	void exitVar_assingn(@NotNull RevesParserParser.Var_assingnContext ctx);
	/**
	 * Enter a parse tree produced by {@link RevesParserParser#fi}.
	 * @param ctx the parse tree
	 */
	void enterFi(@NotNull RevesParserParser.FiContext ctx);
	/**
	 * Exit a parse tree produced by {@link RevesParserParser#fi}.
	 * @param ctx the parse tree
	 */
	void exitFi(@NotNull RevesParserParser.FiContext ctx);
	/**
	 * Enter a parse tree produced by {@link RevesParserParser#rof}.
	 * @param ctx the parse tree
	 */
	void enterRof(@NotNull RevesParserParser.RofContext ctx);
	/**
	 * Exit a parse tree produced by {@link RevesParserParser#rof}.
	 * @param ctx the parse tree
	 */
	void exitRof(@NotNull RevesParserParser.RofContext ctx);
	/**
	 * Enter a parse tree produced by {@link RevesParserParser#esle}.
	 * @param ctx the parse tree
	 */
	void enterEsle(@NotNull RevesParserParser.EsleContext ctx);
	/**
	 * Exit a parse tree produced by {@link RevesParserParser#esle}.
	 * @param ctx the parse tree
	 */
	void exitEsle(@NotNull RevesParserParser.EsleContext ctx);
	/**
	 * Enter a parse tree produced by {@link RevesParserParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull RevesParserParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link RevesParserParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull RevesParserParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link RevesParserParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(@NotNull RevesParserParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link RevesParserParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(@NotNull RevesParserParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link RevesParserParser#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion(@NotNull RevesParserParser.CondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RevesParserParser#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion(@NotNull RevesParserParser.CondicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RevesParserParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(@NotNull RevesParserParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RevesParserParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(@NotNull RevesParserParser.OperationContext ctx);
}