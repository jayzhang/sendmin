package sentmin;

import java.util.List;

import io.github.jayzhang.sentmin.SMiner;
import io.github.jayzhang.sentmin.SMiningResult;

public class TestSMiner {
 
	public static void main(String[] args)  {

		SMiner miner = new SMiner();
		
		miner.load("srule.txt");
		
		long t1 = System.currentTimeMillis();
		
		List<SMiningResult> list = miner.extractTargets("服务不怎么样 ，自助餐还可以，周围很安静");
		for(SMiningResult result : list)
			System.out.println("result:" + result);
				
		long t2 = System.currentTimeMillis();
		
		System.out.println("time:" + ((t2-t1)/1000) + " sec");
	}


}
