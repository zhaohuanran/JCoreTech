package CH5.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Scanner;

/**
 * this program uses reflection to print all features of a class
 *
 * @author Nauh
 * @version 1.1 2019-06-23
 */

public class ReflectionTest {
    public static void main(String[] args) {
        // read class name from command line args or user input
        String name;
        if (args.length > 0) name = args[0];
        else {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter class name (e.g. java.util.Date):");
            name = in.next();
        }
        try {
            //print class name and superclass name(if!=object)
            Class cl = Class.forName(name);
            Class superClass = cl.getSuperclass();
            String modifiers = Modifier.toString(cl.getModifiers());
            if (modifiers.length() > 0) System.out.print(modifiers = " ");
            System.out.print("class " + name);
            if (superClass != null && superClass != Objects.class)
                System.out.print("extends " + superClass.getName());
            System.out.print("\n{\n");
            printConstructors(cl);
            System.out.println();
            printMethods(cl);
            System.out.println();
            printFields(cl);
            System.out.println();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.exit(0);
    }

    /**
     * prints all constructors of a class
     *
     * @param cl class
     */
    public static void printConstructors(Class cl) {
        Constructor[] constructors = cl.getDeclaredConstructors();
        for (var c : constructors) {
            String name = c.getName();
            System.out.print("    ");
            String modifiers = Modifier.toString(c.getModifiers());
            if (modifiers.length() > 0) System.out.print(modifiers + " ");
            System.out.print(name + "(");

            // print parameter types
            Class[] paramType = c.getParameterTypes();
            for (int j = 0; j < paramType.length; j++) {
                if (j > 0) System.out.print(" , ");
                System.out.print(paramType[j].getName());
            }
            System.out.println(");");
        }
    }

    public static void printMethods(Class cl) {
        Method[] methods = cl.getDeclaredMethods();
        for (var m : methods
        ) {
            Class retType = m.getReturnType();
            String name = m.getName();
            System.out.print("  ");
            // print modifiers,return type and method name
            String modifiers = Modifier.toString(m.getModifiers());
            if (modifiers.length() > 0) System.out.print(modifiers + " ");
            System.out.print(retType.getName() + " " + name + "(");
            // print parameter types

            Class[] paramType = m.getParameterTypes();
            for (int j = 0; j < paramType.length; j++) {
                if (j > 0) System.out.print(" , ");
                System.out.print(paramType[j].getName());
            }
            System.out.println(");");
        }
    }

    /**
     * prints all fields of a class
     *
     * @param cl
     */
    public static void printFields(Class cl) {
        Field[] fields = cl.getDeclaredFields();
        for (var f : fields
        ) {
            Class type = f.getType();
            String name = f.getName();
            System.out.print("  ");
            String modifiers = Modifier.toString(f.getModifiers());
            if (modifiers.length() > 0) System.out.print(modifiers + " ");
            System.out.println(type.getName() + " " + name + ";");

        }
    }
}
