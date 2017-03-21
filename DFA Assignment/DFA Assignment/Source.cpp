#include <iostream>
#include <string>

using namespace std;

int main()
{

	int accept = false;
	const int size = 20;
	char arr[size];
	string binary;
	char response;

	while (accept == false)
	{

		//Input string
		cout << "Enter any binary string: ";
		cin >> binary;

		//test
		cout << binary << endl;
		cout << binary.length() << endl;

		//Put string into array char by char
		for (int i = 0; i <= binary.length(); i++)
		{
			arr[i] = binary[i];
		}

		//test
		cout << arr[0] << endl;

		//determine whether the binary string is valid or not for: mod 7 = 2
		int path = 0;
		int element = 0;

		while (element <= binary.length()) //start from arr[2] then go to arr[1], etc.
		{
			switch (path)
			{
			case 0:
				cout << "State 0" << endl;
				accept = false;
				if (arr[element] == '1')
				{
					path = 1;
					element++;
				}
				else
				{
					path = 0;
					element++;
				}
				break;
			case 1:
				cout << "State 1" << endl;
				accept = false;
				if (arr[element] == '1')
				{
					path = 3;
					element++;
				}
				else
				{
					path = 2;
					element++;
				}
				break;
			case 2:
				cout << "State 2" << endl;
				accept = true;
				if (arr[element] == '1')
				{
					path = 5;
					element++;
				}
				else
				{
					path = 4;
					element++;
				}
				break;
			case 3:
				cout << "State 3" << endl;
				accept = false;
				if (arr[element] == '1')
				{
					path = 0;
					element++;
				}
				else
				{
					path = 6;
					element++;
				}
				break;
			case 4:
				cout << "State 4" << endl;
				accept = false;
				if (arr[element] == '1')
				{
					path = 2;
					element++;
				}
				else
				{
					path = 1;
					element++;
				}
				break;
			case 5:
				cout << "State 5" << endl;
				accept = false;
				if (arr[element] == '1')
				{
					path = 4;
					element++;
				}
				else
				{
					path = 3;
					element++;
				}
				break;
			case 6:
				cout << "State 6" << endl;
				accept = false;
				if (arr[element] == '1')
				{
					path = 6;
					element++;
				}
				else
				{
					path = 0;
					element++;
				}
				break;
			}
		}

		if (accept == true)
		{
			cout << "The string is valid." << endl;
		}
		else
		{
			cout << "The string is invalid." << endl;
		}

		cout << "Would you like to enter another string? (Enter Y or N)" << endl;
		cin >> response;
		if (response == 'Y' || response == 'y')
		{
			accept = false;
		}
		else
		{
			accept = true;
		}
		cout << endl;

	}

	return 0;

}