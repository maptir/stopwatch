# Stopwatch tasks by Archawin Tirugsapun (5910545892)

I ran the tasks on a Windows 7, and got these results:

Task                                  | Time
--------------------------------------|-------:
Append  50,000 chars to String        |  0.937135 sec
Append 100,000 chars to String        |  3.307709 sec
Append 100,000 chars to StringBuilder |  0.004220 sec
Add 1 billion double using array      |  1.381592 sec
Add 1 billion Double using array	  |  6.353346 sec
Add 1 billion BigDecimal using array  |  12.410227 sec

# Explanation of Results

## 	Why does appending 100,000 chars to a String take more than 2X the time to append 50,000 chars?

	: Because when we add chars to a string it create a new object of string chars and then it create new string
	that contains old string and string chars such as this code in SpeedTest ---> result = result + CHAR;
	it create CHAR and then add to old string result next it create new string result that have CHAR and old result.

## 	Why is appending to StringBuilder so much different than appending to String?  What is happening to the String?

	: Because append to StringBuilder is add a new string CHAR to a char[] in StringBuilder it not create a new string
	like add string but StringBuilder will slow when the char[] array size is full and it will add size of array into
	char[] then it make some slow in this process.

## 	Explain difference in time to sum double, Double, and BigDecimal.  Which is faster and why?

	: Because double is a primitive and the Double and BigDecimal is an object. Double primitive is fastest but for 
	Double that is an object code in TaskSumDouble ---> sum = sum + values[i]; sum is an Double object and object 
	can't plus like this so Double object change double into double primitive and then it plus like normal primitive
	number so it will take longer time. BigDecimal is like a double primitive and Double object but BigDecimal have to
	change double number to besome strange number with strange decimal such as if you create BigDecimal with param 1.2
	and then you print you will get 1.1999999999999999555910790149937383830547332763671875 some kind like this it will
	take more time and many data usage thismake BigDecimal slower than double and Double.