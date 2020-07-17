package io.github.jayzhang.sentmin;

import java.util.HashSet;
import java.util.Set;

public class CommonUtility {

	public static Set<Long> decodeHotelIds(String text)
	{
		Set<Long> set = new HashSet<Long>();
		if(text == null || text.length() == 0)
			return set;
		
		String[] arr = text.split(",");
		if(arr != null && arr.length > 0)
		{
			for(String tmp: arr)
			{
				long id = Long.valueOf(tmp);
				set.add(id);
			}
		}
		return set;
	}
	
	public static String encodeHotelIds(Set<Long> set)
	{
		if(set == null || set.size() == 0)
			return "";
		
		String ret = "";
		
		for(Long id : set)
			ret += id + ",";
		
		return ret.substring(0, ret.length() - 1);
	}
	
	
	public static float safeDivide(float a, float b)
	{
		return b > 0 ? a/b : 0;
	}
}
