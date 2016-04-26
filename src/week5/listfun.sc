import week5._

val nums = List(2, -4, 5, 7, -3, 1)
val fruits = List("apple", "pineapple", "orange", "banana")
val data = List("a", "a", "a", "b", "c", "c", "a")

nums filter (x => x > 0)
nums filterNot (x => x > 0)
nums partition (x => x > 0)

nums takeWhile (x => x > 0)
nums dropWhile (x => x > 0)
nums span (x => x > 0)

pack(data)
encode(data)
sum(nums)
product(nums)