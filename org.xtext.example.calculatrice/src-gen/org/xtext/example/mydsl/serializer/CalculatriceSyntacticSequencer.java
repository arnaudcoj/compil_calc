/*
 * generated by Xtext 2.9.0
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.example.mydsl.services.CalculatriceGrammarAccess;

@SuppressWarnings("all")
public class CalculatriceSyntacticSequencer extends AbstractSyntacticSequencer {

	protected CalculatriceGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Bool_LeftParenthesisKeyword_0_0_a;
	protected AbstractElementAlias match_Bool_LeftParenthesisKeyword_0_0_p;
	protected AbstractElementAlias match_Factor_LeftParenthesisKeyword_0_0_a;
	protected AbstractElementAlias match_Factor_LeftParenthesisKeyword_0_0_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (CalculatriceGrammarAccess) access;
		match_Bool_LeftParenthesisKeyword_0_0_a = new TokenAlias(true, true, grammarAccess.getBoolAccess().getLeftParenthesisKeyword_0_0());
		match_Bool_LeftParenthesisKeyword_0_0_p = new TokenAlias(true, false, grammarAccess.getBoolAccess().getLeftParenthesisKeyword_0_0());
		match_Factor_LeftParenthesisKeyword_0_0_a = new TokenAlias(true, true, grammarAccess.getFactorAccess().getLeftParenthesisKeyword_0_0());
		match_Factor_LeftParenthesisKeyword_0_0_p = new TokenAlias(true, false, grammarAccess.getFactorAccess().getLeftParenthesisKeyword_0_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Bool_LeftParenthesisKeyword_0_0_a.equals(syntax))
				emit_Bool_LeftParenthesisKeyword_0_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Bool_LeftParenthesisKeyword_0_0_p.equals(syntax))
				emit_Bool_LeftParenthesisKeyword_0_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Factor_LeftParenthesisKeyword_0_0_a.equals(syntax))
				emit_Factor_LeftParenthesisKeyword_0_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Factor_LeftParenthesisKeyword_0_0_p.equals(syntax))
				emit_Factor_LeftParenthesisKeyword_0_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     '('*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'if' (ambiguity) BoolValue='false'
	 *     (rule start) 'if' (ambiguity) BoolValue='true'
	 *     (rule start) 'if' (ambiguity) {BoolExpr.left=}
	 *     (rule start) (ambiguity) BoolValue='false'
	 *     (rule start) (ambiguity) BoolValue='true'
	 *     (rule start) (ambiguity) {BoolExpr.left=}
	 */
	protected void emit_Bool_LeftParenthesisKeyword_0_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) {BoolExpr.left=}
	 */
	protected void emit_Bool_LeftParenthesisKeyword_0_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) neg?='-'
	 *     (rule start) (ambiguity) value=INT
	 *     (rule start) (ambiguity) varCall=ID
	 *     (rule start) (ambiguity) {CalcExpr.left=}
	 */
	protected void emit_Factor_LeftParenthesisKeyword_0_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) {CalcExpr.left=}
	 */
	protected void emit_Factor_LeftParenthesisKeyword_0_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
