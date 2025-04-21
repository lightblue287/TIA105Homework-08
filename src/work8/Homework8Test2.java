package work8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Homework8Test2 {

	public static void main(String[] args) {

		List<Train> trainlist = new ArrayList<Train>();

		trainlist.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		trainlist.add(new Train(1254, "區間", "屏東", "基隆", 700));
		trainlist.add(new Train(118, "自強", "高雄", "台北", 500));
		trainlist.add(new Train(1288, "區間", "新竹", "基隆", 400));
		trainlist.add(new Train(122, "自強", "台中", "花蓮", 600));
		trainlist.add(new Train(1222, "區間", "樹林", "七堵", 300));
		trainlist.add(new Train(1254, "區間", "屏東", "基隆", 700));

		for(int i =0; i < trainlist.size(); i++) {
			Train train= trainlist.get(i);
			train.trainInfo();
		}

		System.out.println("====================================================");

		Map<Integer, Train> trainMap = new HashMap<Integer, Train>();

		trainMap.put(202, new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		trainMap.put(1254, new Train(1254, "區間", "屏東", "基隆", 700));
		trainMap.put(118, new Train(118, "自強", "高雄", "台北", 500));
		trainMap.put(1288, new Train(1288, "區間", "新竹", "基隆", 400));
		trainMap.put(122, new Train(122, "自強", "台中", "花蓮", 600));
		trainMap.put(1222, new Train(1222, "區間", "樹林", "七堵", 300));
		trainMap.put(1254, new Train(1254, "區間", "屏東", "基隆", 700));

		for (Train train2 : trainMap.values()) {
			train2.trainInfo();
		}

		System.out.println("====================================================");

		Map<Integer, Train> trainMap2 = new TreeMap<Integer, Train>(Comparator.reverseOrder());

		trainMap2.put(202, new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		trainMap2.put(1254, new Train(1254, "區間", "屏東", "基隆", 700));
		trainMap2.put(118, new Train(118, "自強", "高雄", "台北", 500));
		trainMap2.put(1288, new Train(1288, "區間", "新竹", "基隆", 400));
		trainMap2.put(122, new Train(122, "自強", "台中", "花蓮", 600));
		trainMap2.put(1222, new Train(1222, "區間", "樹林", "七堵", 300));
		trainMap2.put(1254, new Train(1254, "區間", "屏東", "基隆", 700));
		
		Iterator<Entry<Integer, Train>> train3 = trainMap2.entrySet().iterator();
		while(train3.hasNext()) {
			
			
		}
		
		}
	}
