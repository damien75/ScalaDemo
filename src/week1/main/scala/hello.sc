import demo.Hello

val hello = new Hello

print(hello.sayHello("Damien"))

hello.sqrt(2)
hello.sqrt(4)
hello.sqrt(1e-6)
hello.sqrt(1e60)

hello.factorial(6)

hello.gcd(12, 70)

hello.sum(hello.cube)(1, 9)