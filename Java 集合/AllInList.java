/* 
 在集合类中添加不同类型的元素
*/
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class AllInList{
	public static void main(String[] args){
		List lnklist = new LinkedList();
		lnklist.add("element1");
		lnklist.add("element2");
		lnklist.add("element3");
		lnklist.add("element4");
		displayAll(lnklist);
		List aryLst = new ArrayList();
		aryLst.add("x");
		aryLst.add("y");
		aryLst.add("z");
		aryLst.add("w");
		displayAll(aryLst);
		Set hashSet = new HashSet();
		hashSet.add("set1");
		hashSet.add("set2");
		hashSet.add("set3");
		hashSet.add("set4");
		displayAll(hashSet);
		SortedSet treeSet = new TreeSet();
		treeSet.add("1");
		treeSet.add("2");
		treeSet.add("3");
		treeSet.add("4");
		displayAll(treeSet);
		LinkedHashSet lnkHashset = new LinkedHashSet();
		lnkHashset.add("one");
		lnkHashset.add("two");
		lnkHashset.add("three");
		lnkHashset.add("four");
		displayAll(lnkHashset);
		Map map1 = new HashMap();
		map1.put("key1", "J");
		map1.put("key2", "K");
		map1.put("key3", "L");
		map1.put("key4", "M");
		displayAll(map1.keySet());
		displayAll(map1.values());
		SortedMap map2 = new TreeMap();
		map2.put("key1", "JJ");
		map2.put("key2", "KK");
		map2.put("key3", "LL");
		map2.put("key4", "MM");
		displayAll(map2.keySet());
		displayAll(map2.values());
		LinkedHashMap map3 = new LinkedHashMap();
		map3.put("key1", "JJJ");
		map3.put("key2", "KKK");
		map3.put("key3", "LLL");
		map3.put("key4", "MMM");
		displayAll(map3.keySet());	
		displayAll(map3.values());
	}
	static void displayAll(Collection col){
		Iterator itr = col.iterator();
		while(itr.hasNext()){
			String str = (String) itr.next();
			System.out.print(str + " ");
		}
		System.out.println();
	}
}
/* 
element1 element2 element3 element4
x y z w
set3 set2 set4 set1
1 2 3 4
one two three four
key1 key2 key3 key4
J K L M
key1 key2 key3 key4
JJ KK LL MM
key1 key2 key3 key4
JJJ KKK LLL MMM
 */