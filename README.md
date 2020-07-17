# 酒店评论情感挖掘

评论情感挖掘主要包括两个子任务：1) 识别评论文本描述酒店的属性（服务、设施、卫生、地理等）；2) 挖掘用户对这些属性的情感倾向（好评与差评）；3) 并根据1)和2)的结果对酒店评论进行聚类、索引和搜索。
使用案例：

```
SMiner miner = new SMiner();
		
miner.load("srule.txt");
	
List<SMiningResult> list = miner.extractTargets("服务不怎么样 ，自助餐还可以，周围很安静");
for(SMiningResult result : list)
  System.out.println("result:" + result);

```
