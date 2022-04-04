package utilities;

import day34_GarbageCollection_AccessModifiers.AccessModifiers;
import jdk.swing.interop.SwingInterOpUtils;

public class AccessModifiersTest2 {
    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicData);
     //   System.out.println(AccessModifiers.defaultData); default Access Modifier is not visible outside the package
       // System.out.println(AccessModifiers.privateData); private Access Modifier is not visible outside not only package but also the class


        AccessModifiers.method1();
     //   AccessModifiers.method2(); Default is not visible outside the package
     //   AccessModifiers.method3(); private is not visible outside the class

    }
}
