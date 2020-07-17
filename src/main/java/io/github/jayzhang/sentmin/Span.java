package io.github.jayzhang.sentmin;

public class Span {
	public int begin;
	public int end;
	public String text;
	
	public String toString()
	{
		return text + "(" + begin + "-" + end + ")";
	}
}
