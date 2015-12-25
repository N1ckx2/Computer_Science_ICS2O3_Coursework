# Nicholas Vadivelu
# ICS 203-02
# October 17, 2014
# Python Input Output Program

num1 = int(input("Type in a number and <Enter>: "))
num2 = int(input("Type in another number and <Enter>: "))

summ = num1 + num2
prod = num1 * num2

print "The sum of " + str(num1) + " and " + str(num2) + " is " + str(summ)
print "The product of " + str(num1) + " and " + str(num2) + " is " + str(prod)

if (summ > prod): print "The sum is greater than the product"
elif (summ < prod): print "The product is greater than the sum"
else:
	print "The sum and product are equal"
	print "What are the chances!"
	
print""
input("Press enter to continue...")
