ReadVersion: Extract the package version information from a Java 
jar file.

This code taken from http://tinyurl.com/ahqb9km and used to 
create a hopefully more useful example that builds as needed to 
demonstrate what it does. The person at the referenced web-site 
did all the original work, I just tried to make it easier to 
use/build/understand. :0) 
 
Display package name and version information for 
javax.mail.internet. 
 
NOTE1: you will most likely need to download the API to get this
example code to work. Once you have the API (jar) then you will 
also have to make sure that the Eclipse project (assuming you 
want to use Eclipse) pointing at the API/jar directory. 
 
NOTE2: Once you have the API downloaded, you will need to either 
place its jar files in the $JAVA_HOME/lib dir or "cheat" and 
place them in the src directory of this project. 
 
NOTE3: API ref as of the date this code was converted: (I 
created a Tiny URL so it'd fit in this commentary): 
http://preview.tinyurl.com/aksfhwp  

NOTE4: If you'd like, you can use the API jar file within this 
project to save yourself downloading etc!  :0)) 

This example is a bit artificial, since examining the version of a 
jar from Sun Microsystems is unusual. 
 
Output Example:
Package name: JavaMail(TM) API Design Specification
Package version: 1.4 
