package exercise4.search;

public class HeuristicPair<ItemT> implements Comparable<HeuristicPair<ItemT>>
{
	protected final int m_heuristic;
	protected final ItemT m_item;
	
	public HeuristicPair(ItemT _item, int _heuristicValue)
	{
		m_heuristic = _heuristicValue;
		m_item = _item;
	}
	
	public int getHeuristic()
	{
		return m_heuristic;
	}
	
	public ItemT getItem()
	{
		return m_item;
	}

	@Override
	public int compareTo(HeuristicPair<ItemT> o)
	{
		return m_heuristic - o.m_heuristic;
	}
}
