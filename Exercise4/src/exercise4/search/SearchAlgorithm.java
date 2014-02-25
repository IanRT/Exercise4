package exercise4.search;

import rp13.search.interfaces.Agenda;
import rp13.search.util.EqualityGoalTest;

public class SearchAlgorithm<node, StateT, ItemT>
{
	public node search(StateT __goal)
	{
		EqualityGoalTest<StateT> test = new EqualityGoalTest<StateT>(_goal);
		Agenda<ItemT> agenda = new Agenda<ItemT>;
		
		while(!agenda.isEmpty())
		{
			node = agenda.pop();
			if(isGoal(node.getState()))
			{
				return node;
			}
			else
			{
				node.getState().generateSuccessors();
				
				//add successors to agenda with for loop
			}
		}
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
