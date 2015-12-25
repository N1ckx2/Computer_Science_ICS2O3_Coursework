/* Nicholas Vadivelu
October 17, 2014
ICS 203-02
C++ Input Output Program */

#include <stdio.h>
#include <conio.h>
#include <iostream>

using namespace std;

int main() {
	int num1, num2, summ, prod;
	cout << "Type in a number and <Enter>: ";
	cin >> num1;
	cout << "\nType in another number and <Enter>: ";
	cin >> num2;
	
	summ = num1+num2;
	prod = num1*num2;

	cout << "The sum of " << num1 << " and " << num2 << " is " << summ << endl;
	cout << "The product of " << num1 << " and " << num2 << " is " << prod << endl;

	if (summ > prod) cout << "The sum is greater than the product" << endl << endl;
    else if (summ < prod) cout << "The product is greater than the sum"<< endl << endl;
    else 
	{
		cout << "The sum and product are equal"<< endl;
		cout << "What are the chances!" << endl;
	}
        
    cout << "Press enter to continue...";
    getch();
    return 0;
}
