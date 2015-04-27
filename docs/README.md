![sakuli-logo](pics/sakuli_logo_small.png) 

# Documentation

## Usage
### Basic setup

* [Sakuli client **installation**](installation-client.md)
* Submitting Sakuli results 
  * [to OMD (Nagios/Icinga2/Shinken)](installation-omd.md)
    * [via **Gearman**](forwarder-gearman.md)
    * [via **Database**](forwarder-database.md)

### Advanced topics###

* **Headless** Sakuli checks
  * [on Windows](headless-windows.md) -- in progress
  * [on Linux](headless-linux.md)
* [**additional** Sakuli Settings](additional-settings.md)
* **Troubleshooting** and **Tuning**
  * [**Sakuli Client**](troubleshooting-tuning-sakuli-client.md) 
  * [**OMD/Nagios**](troubleshooting-omd.md) 
  
## Sakuli API

Sakuli provides methods of three different types:

* JS methods of **[Sahi](http://sahi.co.in/w/all-apis)**, which can be used 100% *natively*
* JS methods which encapsulate a subset of the **Sikuli** Java API 
* JS methods of **Sakuli** framework itself (testcase stuff, exception handling, …)  

The latter two can be found in the following classes:  
 
* [TestCase](sakuli-api.md#TestCase)
* [Application](sakuli-api.md#Application)
* [Environment](sakuli-api.md#Environment)
* [Region](sakuli-api.md#Region)
* [Keys](sakuli-api.md#Key)

## How to contribute

* [Installation instructions for **developers**](development/installation-developers.md)
* [How to prepare a **new releas**e](development/how-to-release.md)
* [**Maven Build Aspects**](development/maven-aspects.md)