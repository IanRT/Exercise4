package exercise4.search;

import java.util.ArrayList;
import java.util.Iterator;

import rp13.search.interfaces.Agenda;


class Dfs<ItemT> implements Agenda<ItemT>
{
	private ArrayList<ItemT> agenda;
	
	@Override
	public Iterator<ItemT> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void push(ItemT _item) {
		agenda.add(_item);
				
	}

	@Override
	public ItemT pop() {
		// TODO Auto-generated method stub
		ItemT node = agenda.get(agenda.size()-1);
		agenda.remove(agenda.size()-1);
		return node;
	}

	@Override
	public boolean isEmpty() {
		return agenda.isEmpty();
	}

	@Override
	public boolean contains(ItemT _item) {
		// TODO Auto-generated method stub
		return agenda.contains(_item);
	}

}
