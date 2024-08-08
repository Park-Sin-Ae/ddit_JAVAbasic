package kr.or.ddit.study13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		/*
		 * HashMap
		 * key와 value로 이루어짐
		 * 
		 * key 값은 중복을 허용하지 않고 순서가 보장되지 않음
		 * Map 타입의 컬렉션
		 * 
		 * 주요 메솓
		 * .put(key, value) : 데이터 입력 key 값은 중복 되지 않음. value는 중복 될 수 없음.
		 * .get(key)		: 입력 받은 value 값을 key 
		 * .keySet()		: key로 이루어지 hashSet 값을 가져옴.
		 * 
		 * 
		 */

		
//		비밀번호/비트코인 등에 많이 사용 된다
		//HashMap map = new HashMap();
		Map map = new HashMap();
		map.put("박신애", "305호"); 
		map.put("김미미", "406호");
		
		// 스트링으로 넣었기 때문에 스트링을 꺼내야한다.
//		String str = (String)map.get("박신애");
		
		System.out.println(map.get("박신애"));
		System.out.println(map.get("김미미"));
		
		/* <> 제네릭이란: 타입을 미리 설정한다 */
		Map<String, String> map2 = new HashMap();
		map2.put("박신애", "305호");
		map2.put("박순대", "305호");
		map2.put("김미미", "406호");
		String str2 = map2.get("김미미");
	
		Set set = map2.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {// -> hasNext : ~값이 있다면
//			String key = (String) it.next();
			String key = it.next();
			String value = map2.get(key);
			System.out.println("key : " + key +", value : "+ value);
		}
	}
}
