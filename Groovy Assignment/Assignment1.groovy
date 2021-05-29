package com.test.demo

import oops.Money

Number Data Types
1.a
def i=2
println i.getClass().getName()

def i1=20
println i1.getClass().getName()

def i2=200
println i2.getClass().getName()

def i3=2000
println i3.getClass().getName()

def i4=200000000000
println i4.getClass().getName()

def i5=20000000000000000000
println i5.getClass().getName()

def i6=2.0
println i6.getClass().getName()

Ans:A
java.lang.Integer
java.lang.Integer
java.lang.Integer
java.lang.Integer
java.lang.Long
java.math.BigInteger
java.math.BigDecimal


1.b
def x=1+1.5
println x
println x.getClass().getName()

Ans:B
2.5
java.math.BigDecimal

1.c
def x=5/2
println x
println x.getClass().getName()

int x1=(5/2)
println x1
println x1.getClass().getName()

Ans:C
2.5
java.math.BigDecimal
2
java.lang.Integer

2.Wrapper Classes

byte b=10
println b
println Byte.MIN_VALUE
println Byte.MAX_VALUE
println "\n"
int i=10
println i
println Integer.MIN_VALUE
println Integer.MAX_VALUE
println "\n"
long l=100
println l
println Long.MIN_VALUE
println Long.MAX_VALUE
println "\n"
float f=2.5
println f 
println Float.MIN_VALUE
println Float.MAX_VALUE
println "\n"
double d=22222
println d
println Double.MIN_VALUE
println Double.MAX_VALUE



Ans:

10
-128
127

10
-2147483648
2147483647


100
-9223372036854775808
9223372036854775807


2.5
1.4E-45
3.4028235E38


22222.0
4.9E-324
1.7976931348623157E308


3 2s Complement
byte b=127+1
println b
println b.getClass().getName()

Ans:

-128
java.lang.Byte

4 Strings and groovyStrings
4.a
def str = "Hello, Groovy!"
println str.length()

Ans:
14

4.b
def name = "Pratiksha"
println "Hello ".concat(name)
println "Hello "+name

Ans:
Hello Pratiksha
Hello Pratiksha

4.c
String name = "Bob"
if (name[-1..0].equalsIgnoreCase() == name[0..-1].equalsIgnoreCase()){
	println "$name is palindrom"
}
		else {
			println "$name is NOT palindrom"
		}

Ans:
Bob is palindrom

4.d
def array = "Hello, World. How are you?"

println array.split()
def array1 = array.split()
println array1.size()

assert array.tokenize() instanceof List
assert ['Hello,', 'World.', 'How', 'are', 'you?']==array.tokenize()


ANs:
[Hello,, World., How, are, you?]
5

4.e
def array = "Hello, World. How are you?"
println array[7..11]

ANs:World

4.f
def array = "Hello, World. How are you?"
def array1 = array.split()
println array1
println array[-1..-4]
Ans:
[Hello,, World., How, are, you?]
?uoy



5.Prime Numbers


def isPrime(int a)
{
 def i = 1
  
  for (i ; i<= a/2; i++)
	{
	   if (a%2 == 0)
		{
		  return false
		}
	   else
		{
		  return true
		}
	 }
}

int number = 19
s = isPrime(number)
println s
println s.getClass()

Ans:
true
class java.lang.Boolean




6.1 Sorting Stringd
def myList =['Hello','World!','I','am','Pratiksha']

println myList =myList.sort { it.size() }

println myList = myList.sort { -it.size() }
assert myList.sort()
println myList

Ans:

[I, am, Hello, World!, Pratiksha]
[Pratiksha, World!, Hello, am, I]
[Hello, I, Pratiksha, World!, am]


6.2	Processing a list of numbers
def myList=[1,2,3,4,5,6]
println myList.sum()
println myList.average()

def myList1 = myList.collectNested { item -> item *2 }
println myList1
println myList1.sum()
println myList1.average()

Ans:

21
3.5
[2, 4, 6, 8, 10, 12]
42
7

6.3 Reading Web Page
String filePath="data1.txt"
File myFile=new File(filePath)
//Reading Content As String
println myFile.text
//Read file line by line
myFile.eachLine{
	line->
	println line.length()
	println "line:$line"
	}
	
	Ans:
	Hello World
	I am Pratiksha here
	Assignment Groovy
	11
	line:Hello World
	19
	line:I am Pratiksha here
	17
	line:Assignment Groovy
	



6.4 Closures as a filter
def myClouser=[1,2,3,4,5,6,-1,-2,-3,0]
println myClouser.findAll{item->item>0}


Ans:[1, 2, 3, 4, 5, 6]


6.5 Multiline string

def string= """Hello World,
			My Name is Pratiksha,
			example for assignment """
count=0
def vow=["a","e","i","o","u"]
for (def i in string) {
for (def j in vow) {
if (i==j) {
count+=1

}
}
}
println "The number of vowels in the given string is :"+count

Ans:The number of vowels in the given string is :16

6.6	Print the numbers from 0 to 15 in binary 
for (i in 0..15)
	println String.format("%4s", Integer.toBinaryString(i)).replace(" ", "0")
	
	Ans:
0000
0001
0010
0011
0100
0101
0110
0111
1000
1001
1010
1011
1100
1101
1110
1111

1.	Encode and decode

String username = "Pratiksha_solanke"
String password = "****"

String str = "$username "+"$password"
println username
println password

//Concatenated string
println str

//Byte array of String
println str.getBytes()

////encode to base64

def str1 = str.bytes.encodeBase64().toString()
println str1
//decode
byte[] str2 = str1.decodeBase64()
println new String(str2)

println str.split("")

Ans:
Pratiksha_solanke
****
Pratiksha_solanke ****
[80, 114, 97, 116, 105, 107, 115, 104, 97, 95, 115, 111, 108, 97, 110, 107, 101, 32, 42, 42, 42, 42]
UHJhdGlrc2hhX3NvbGFua2UgKioqKg==
Pratiksha_solanke ****
[P, r, a, t, i, k, s, h, a, _, s, o, l, a, n, k, e,  , *, *, *, *]



last
package oops

class Money
{
	double ammount = 50
	String currency = 'EUR'
	Money(String currency, double ammount)
	{
		this.ammount = ammount
		this.currency = currency
		
	}
	def plus(Money m1)
	{
		if (this.currency==m1.currency)
			{
				return new Money(this.currency + ","+m1.currency,this.ammount+m1.ammount)
	
			}
			else {
			println "Currency is not same"
			}
	}
	def minus(Money m2)
	{
		return new Money(this.currency + ","+m2.currency,this.ammount-m2.ammount)
	}
	 public static void main(args)
	 {

	 }
}


MoneyTest
package oops

class MoneyTest
{
	
	public static void main(args)
	{
		Money m3 = new Money("EUR",80)
		
		Money m4 = new Money("EUR",90)
		
		Money m5 = m3+m4
		println m5.ammount
		println m5.currency
		
	}
}

Ans:
170.0
EUR,EUR

Ans:
Currency is not same





