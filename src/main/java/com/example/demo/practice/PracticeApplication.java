package com.example.demo.practice;

public class PracticeApplication {

	public static void main(String[] args){

		Member mem1 = new Member("문대진", 2);
		Member mem2 = new Member("문데진", 1);
		Member mem3 = new Member("문dp진", 24);

		Member mem1_1 = new Member("문대진", 10);
		Member dismissedMem = new Member("NONAMED", 999);

		// array, [], 불변성 배열. 길이 변경이 불가능함. 선언 시에만 가능
//		Member[] memArray = new Member[10];
//		memArray[0] = new Member("aa", 11);
//		memArray[1] = new Member("nb", 12);

//		Member[] memArray = new Member[]{
//				new Member("aa", 11),
//				new Member("nb", 12),
//		};

//		memArray[0] = null; // 이려면 지우는 거긴 한데... 실질적으로 공간까지 지워지는 건 아님.

//		System.out.println("배열 길이: " + memArray.length);
		// todo:처음에 값을 넣어주며 init 하는거 해보기
//		List<Member> members = new ArrayList<>(
//				Arrays.asList(
//						mem1,
//						mem2
//				)
//		);
//		List<Member> addMemList = new ArrayList<>();
//
//		members.add(0, mem1); // add index 넣으면 해당 index에 값이 있을 때, 밀어넣기 함.
//		members.add(mem1);
//		members.add(mem2);
//
//		System.out.println(members);
//
//		members.sort(Comparator.comparing(Member::getAge)); // 정렬 기준을 정하고 그 기준으로 정렬이 가능함.
//
//		System.out.println(members);

		// List Set: 해당 인덱스의 요소 수정.
//		System.out.println(members);
//		members.set(0, mem3);
//		System.out.println(members);

		// addAll: 컬랙션을 추가함.
//		addMemList.add(mem3);
//		members.addAll(addMemList);

		// 리스트 전체 정리
//		members.clear();

		// 포함되지 않으면 -1, 마지막 꺼면 0, 마지막이 아니면 1
//		System.out.println(members.lastIndexOf(mem1));
//		System.out.println(members.lastIndexOf(mem2));

		// 컬렉션에 특정 항목 포함 여부. 포함시 true
//		System.out.println(members.contains(mem3));
//		// 컬렉션에 특정 컬렉션의 포함 여부. All 을 쓴다고 해서 모든 것을 포함해야 하는 것은 아니다. 리스트의 항목이 포함되어 있으면 true.
//		addMemList.add(mem1);
//		addMemList.add(mem2);
//		System.out.println(members.containsAll(addMemList));


		// retain: 해당 요소만 남겨라. 만약 해당 요소가 없으면 다 날라감.
//		addMemList.add(mem3);
//		members.retainAll(addMemList);
//		System.out.println(members);

		// all을 쓰면 대부분 collection 이랑 collection 느낌이더라구요
		// 네네

		// List
//		members.spliterator() // 병렬 작업 특화라고 함... 뭔지 나중에 알아보자.

		// set: 중복을 허용하지 않는 collection
//		Set<Member> memberSet = new HashSet<>();
//
//		// 주소가 다르기 때문에 되지 않을까? ==> 잘 됨.
//		memberSet.add(mem1);
//		memberSet.add(mem2);

		// 이건? ==> 넣어도 하나만 추가 됨. exception 따로 뜨진 않는 듯.
		// 그냥 밀어넣어도 결국 같은 개채면 1개만 저장되는 거 같음.
//		memberSet.add(mem1);
//		memberSet.add(mem1);

		// 반복 반환이 뭘 의미할까?
		// 지금 순서가 저장되어 있는 collection 인 듯? 현재 상태? 혹은 가리키고 있는 값이 뭔지 알 수 있다.
		// next() 나 previous() 같은 함수 쓸 수 있는듯.
//		Iterator<Member> memberIterable = memberSet.iterator();

		// 이러면 반복하는 게 남을 때 까지 반복이 가능함.
		// next() 함수 자체는 지금의 값을 반환하고 자료 구조가 가리키는 index 를 증가시키는 듯.
//		while (memberIterable.hasNext()) {
//			System.out.println(memberIterable.next());
//		}

		//todo: while 쓰지말고 for 문 써라.

		// 나머지는 List 랑 같은듯.
//		System.out.println(memberSet);

		// Map: Key, Value 를 쌍으로 갖는 Collection.
//		Map<Integer, Member> memberMap = new HashMap<>();
//		// 같은 index 로 put 2번 하면 업데이트
//		memberMap.put(1, mem1);
//		System.out.println(memberMap);
//		memberMap.put(1, mem2);
//		System.out.println(memberMap);
//		memberMap.put(2, mem2);

		/*
		map util 관련
		  함수들 중 put을 제외한 유틸 함수들(remove, replace ...)
		  만약 key, value 값을 둘 다 받는다면 더블 체킹 후 작업 성공 여부 반환.
		*/

//		System.out.println(memberMap); // 전체 Map 보기
////		System.out.println(memberMap.values()); // Map 중 value 값만 가져옴
////		System.out.println(memberMap.keySet()); // Map 중 Key 값만 가져옴
////		memberMap.replace(2, mem3); // 해당 key 의 value 값을 변경
////		System.out.println(memberMap.replace(2, mem1, mem3)); // key, oldValue 를 통해 더블 체킹 하는 듯? 바뀌지 않으면 false 를 반환
////		System.out.println(memberMap);
//		// 특정 키 값에 대하여, 해당 map 에 매핑되는 값들에 대해 remapping 을 진행할 수 있는 듯 함.
		// compute 의 경우 대체적으로 null 여부를 비교하여 반환하거나 키를 추가할 수 있는듯. optional 같은 느낌?
//		memberMap.compute(1, (k, v) -> v == null? new Member("임시", 999) : memberMap.get(k));

//		System.out.println(memberMap.hashCode()); // hash code 반환?

		/*
		 * map : key value fair
		 * entry : key, value 한 짝?
		 * map : key, value, entry
		 * 	map = entry 의 집합
		 * 		entry : key, value
		 *
		 * map 에 있는 entry 들을 하나씩 쓸 때 ==> for 문 돌릴 때 사용. Set 형태의 데이터 구조로 반환 받고, 엔트리 하나씩 루프
		 * Iterator 잘 안씀.
		 *
		 */

//		Set<Entry<Integer, Member>> memberEntry = memberMap.entrySet();
//		Iterator<Entry<Integer, Member>> iterator = memberEntry.iterator();
//
//		for(Entry<Integer, Member> each : memberEntry) {
//			System.out.println(each.getKey() + " -------- " + each.getValue());
//		}

//		while (iterator.hasNext()){
//			Map.Entry<Integer, Member> entry = iterator.next();
//			System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue());
//		}

		// 해당 키 값이 존재하지 않으면 뒤의 defaultValue 반환
//		System.out.println(memberMap.getOrDefault(1, dismissedMem));
//		System.out.println(memberMap.getOrDefault(5, dismissedMem));

		// forEach key, value 를 매개변수로 가져가는 함수형 인터페이스를 사용하는 반복문.
//		memberMap.forEach((key, value) -> System.out.println("key: " + key + " value: " + value));

		// merge -> key 가 없으면 value 를 넣고, 있으면 function 에 나온 값으로 replace 한다..
		// 기본적으로 key 로 조회되는 값에 값을 추가하기 위해 사용하는 듯?
		// 뒤의 InterfaceFunction 변수 취급이 oldValue, newValue 임
//		memberMap.forEach((key, value) -> memberMap.merge(key, value, (v1, v2) -> v1));

//		Integer i = 1;
//		Integer ii = 1;
//
//		System.out.println(i == ii);
//		//
//		Integer j = 99999999;
//		Integer jj = 99999999;
//
//		System.out.println(j == jj);
//		System.out.println(j.equals(jj));

	}

}
