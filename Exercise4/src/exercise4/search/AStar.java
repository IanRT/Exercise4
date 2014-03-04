package exercise4.search;

import java.util.ArrayList;
import java.util.Iterator;

import rp13.search.interfaces.SortedAgenda;

public class AStar<ItemT extends Comparable<ItemT>> implements SortedAgenda<ItemT>
{
	private ArrayList<HeuristicPair<ItemT>> agenda;

	@Override
	public void push(ItemT _item)
	{
		agenda.add(new HeuristicPair<ItemT>(_item, 1/*hmmmm*/));
	}

	@Override
	public ItemT pop() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(ItemT _item) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<ItemT> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
}
