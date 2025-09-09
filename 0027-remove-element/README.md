<h2><a href="https://leetcode.com/problems/remove-element">27. Remove Element</a></h2><h3>Easy</h3><hr><p>Given an integer array <code>nums</code> and an integer <code>val</code>, remove all occurrences of <code>val</code> in <code>nums</code> <a href="https://en.wikipedia.org/wiki/In-place_algorithm" target="_blank"><strong>in-place</strong></a>. The order of the elements may be changed. Then return <em>the number of elements in </em><code>nums</code><em> which are not equal to </em><code>val</code>.</p>

<p>Consider the number of elements in <code>nums</code> which are not equal to <code>val</code> be <code>k</code>, to get accepted, you need to do the following things:</p>

<ul>
	<li>Change the array <code>nums</code> such that the first <code>k</code> elements of <code>nums</code> contain the elements which are not equal to <code>val</code>. The remaining elements of <code>nums</code> are not important as well as the size of <code>nums</code>.</li>
	<li>Return <code>k</code>.</li>
</ul>

<p><strong>Custom Judge:</strong></p>

<p>The judge will test your solution with the following code:</p>

<pre>
int[] nums = [...]; // Input array
int val = ...; // Value to remove
int[] expectedNums = [...]; // The expected answer with correct length.
                            // It is sorted with no values equaling val.

int k = removeElement(nums, val); // Calls your implementation

assert k == expectedNums.length;
sort(nums, 0, k); // Sort the first k elements of nums
for (int i = 0; i &lt; actualLength; i++) {
    assert nums[i] == expectedNums[i];
}
</pre>

<p>If all assertions pass, then your solution will be <strong>accepted</strong>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [3,2,2,3], val = 3
<strong>Output:</strong> 2, nums = [2,2,_,_]
<strong>Explanation:</strong> Your function should return k = 2, with the first two elements of nums being 2.
It does not matter what you leave beyond the returned k (hence they are underscores).
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [0,1,2,2,3,0,4,2], val = 2
<strong>Output:</strong> 5, nums = [0,1,4,0,3,_,_,_]
<strong>Explanation:</strong> Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
Note that the five elements can be returned in any order.
It does not matter what you leave beyond the returned k (hence they are underscores).
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>0 &lt;= nums.length &lt;= 100</code></li>
	<li><code>0 &lt;= nums[i] &lt;= 50</code></li>
	<li><code>0 &lt;= val &lt;= 100</code></li>
</ul>



<hr>
한국어 번역
<hr>

## 문제 요약

정수 배열 `nums`와 정수 `val`이 주어집니다.
`nums` 안에서 값이 `val`인 모든 원소를 **제거(in-place, 즉 배열 내부에서 직접 수정)** 해야 합니다.
그 후, `val`이 아닌 원소들의 개수 `k`를 반환해야 합니다.

배열의 순서는 바뀌어도 상관없습니다.
즉, `val`을 제거한 뒤 남은 원소들의 상대적 순서를 유지할 필요는 없습니다.

---

### 조건

* `nums` 배열을 직접 수정해야 합니다.
* 반환값 `k`는 `val`이 아닌 원소들의 개수를 의미합니다.
* 수정된 `nums`의 앞부분 `k`개에는 반드시 `val`이 아닌 원소들이 들어 있어야 합니다.
* `nums`의 그 이후 요소들은 어떤 값이든 상관없습니다. (무시해도 됨)

---

### 채점 방식 (Custom Judge)


```java
int[] nums = [...]; // 입력 배열
int val = ...;      // 제거할 값
int[] expectedNums = [...]; // 정답 배열 (val을 모두 제거한 뒤의 결과)
                            // 이 배열은 정렬된 상태이고 val 값 없음

int k = removeElement(nums, val); // 사용자가 구현한 함수 호출

assert k == expectedNums.length;
sort(nums, 0, k); // nums의 앞 k개 원소를 정렬
for (int i = 0; i < actualLength; i++) {
    assert nums[i] == expectedNums[i];
}
```

즉:

1. 함수에서 반환한 `k` 값이 기대한 길이와 같아야 하고,
2. `nums`의 앞부분 `k`개가 기대한 배열과 같으면 정답 처리됩니다.

---

### 예시 1

```
입력: nums = [3,2,2,3], val = 3
출력: 2, nums = [2,2,_,_]
설명: val=3인 원소를 모두 제거 → 남은 원소는 [2,2].
k = 2 반환. 이후 인덱스는 어떤 값이든 상관없음.
```

---

### 예시 2

```
입력: nums = [0,1,2,2,3,0,4,2], val = 2
출력: 5, nums = [0,1,4,0,3,_,_,_]
설명: val=2 제거 후 남은 원소는 [0,1,3,0,4] (순서는 바뀌어도 OK).
따라서 k = 5 반환.
```

---

### 제약 조건

* `0 <= nums.length <= 100`
* `0 <= nums[i] <= 50`
* `0 <= val <= 100`


