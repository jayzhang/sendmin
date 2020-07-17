package io.github.jayzhang.sentmin;


public class SMiningResult {
	public String matchText;
	public String matchPattern;
	public int property;
	public int rate;
	public int begin;
	public int end;
	
	public String toString()
	{
		return "SentiMiningResult[matchText=" + matchText + ", property=" + HotelProperties.findByValue(property) + ", rate=" 
				+ Rates.findByValue(rate) + ", span=(" + begin + "-" + end + ")" + ", pattern=" + matchPattern + "]";
	}
}
