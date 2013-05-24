//exchange sort of an array of comparable elements
//sorts in ascending order in time O(n^2)
public void exchangeSort (E [] values) 
{
	//start with first element and compare it to all other elements after it
	for (int i = 0; i < values.length - 1; i++)
	{
		for (int j = i + 1; j < values.length; j++)
		{
			//swap current element with any element after it
			//if current element is > any element after it
			if ( values[i].compareTo(values[j]) > 0 )
			{
 
				E temp = values[i];
				values[i] = values[j];
				values[j] = temp;
 
			}
		}
	}
}