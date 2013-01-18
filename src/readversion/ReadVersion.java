package readversion;

import javax.mail.internet.InternetAddress;

/** 
 
This code taken from http://tinyurl.com/ahqb9km and used to 
create a hopefully more useful example that builds as needed to 
demonstrate what it does. The person at the referenced web-site 
did all the original work, I just tried to make it easier to 
use/build/understand. :0) 
 
The enclosed files can be built using Eclipse (.project file) 
or with ant (ant clean build) or using the command line (your 
choice). 
 
Display package name and version information for 
javax.mail.internet. 
 
This example is a bit artificial, since examining the version of 
a jar from Sun Microsystems is unusual. 
 
Output Example: 
Package name: JavaMail(TM) API Design Specification
Package version: 1.4 
 
*/

public final class ReadVersion {
  
  public static void main(String... aArgs){
    ReadVersion readVersion = new ReadVersion();
    readVersion.readVersionInfoInManifest();
  }
  
  public void readVersionInfoInManifest(){
    
    //build an object whose class is in the target jar
    InternetAddress object = new InternetAddress();
    
    //navigate from its class object to a package object
    Package objPackage = object.getClass().getPackage();
    
    //examine the package object 
    String name = objPackage.getSpecificationTitle();
    String version = objPackage.getSpecificationVersion();
    //some jars may use 'Implementation Version' entries in the manifest instead
    
    System.out.println("Package name: " + name);
    System.out.println("Package version: " + version);
  }
} 
