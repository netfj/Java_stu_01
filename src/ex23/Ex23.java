package ex23;

import java.util.Properties;
import java.util.Set;


public class Ex23 {
	public static void main(String[] args) {
		Properties properties = System.getProperties();
		System.out.println(properties);
		
		Set<String> propertyNames = properties.stringPropertyNames();
		for (String key: propertyNames) {
//			System.out.println(key);
			String value = System.getProperty(key);
			System.out.println("¡¾"+key + "¡¿" + value);
		}
		
}
}