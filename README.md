# BankApp
Created an Application to handle new customer bank account requests. <br />

* Read a .csv of names, social security numbers, account type, and initial deposit <br />
* Used data structures to store all those accounts. <br />

Savings and Checking accounts share the following properties: <br />
* *deposit()* <br />
* *withdraw()* <br />
* *transfer()* <br />
* *showInfo()*: This will reveal relevant account information as well as information specific to Checking and Savings account. <br />

Both accounts will use an interface that determines the base interest rate. <br />
* *Savings accounts will use .25 points less than the base interest rate*
* *Checking accounts will use 15% of the base rate*
