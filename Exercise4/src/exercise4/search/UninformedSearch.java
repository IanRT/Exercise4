package exercise4.search;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import rp13.search.interfaces.Agenda;
import rp13.search.interfaces.SuccessorFunction;
import rp13.search.util.*;

public class UninformedSearch<node, StateT, ItemT, ActionT>
{
	private ActionStatePair<ActionT, StateT> theNode;
	public Stack<ActionT> doSearch(StateT start, StateT goal, SuccessorFunction<ActionT, StateT> successorFn, Agenda<ActionStatePair<ActionT, StateT>> agenda)
	{
		
		EqualityGoalTest<StateT> test = new EqualityGoalTest<StateT>(goal);
		List<ActionStatePair<ActionT, StateT>> firstSuccessors = new ArrayList<ActionStatePair<ActionT, StateT>>();
		ArrayList<StateT> visited = new ArrayList<StateT>();
		successorFn.getSuccessors(start, firstSuccessors);
		visited.add(start);
		for (ActionStatePair<ActionT, StateT> node: firstSuccessors) 
		{
			if(visited.contains(node.getState()) == false)
					{
						agenda.push(node);
					}
		}
		
		while(!agenda.isEmpty())
		{
			ActionStatePair<ActionT, StateT> currNode = agenda.pop();
			visited.add(currNode.getState());
			if(test.isGoal(currNode.getState()))
			{
				Stack<ActionT> stack = new Stack<ActionT>();
				theNode = currNode;
				stack.add(theNode.getAction());
				while(theNode.getParent() != null)
				{
					theNode = theNode.getParent();
					stack.add(theNode.getAction());
				}
				System.out.println(goal);
				return stack;
			}
			else
			{
				ArrayList<ActionStatePair<ActionT, StateT>> successors = new ArrayList<ActionStatePair<ActionT, StateT>>();
			
				successorFn.getSuccessors(currNode.getState(), successors);
				for (ActionStatePair<ActionT, StateT> node : successors) 
				{
					if(visited.contains(node.getState()) == false)
					{
						node.setParent(currNode);
						agenda.push(node);
					}
				}
				//add successors to agenda with for loop
			}
		}
		return null;
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
