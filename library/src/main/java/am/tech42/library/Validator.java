package am.tech42.library;

import java.util.List;
import java.util.ArrayList;
import java.lang.reflect.Field;
import java.util.Arrays;

public class Validator {
	public static List<String> validate(Object obj) {
		List<String> output = new ArrayList<>();
		List<Field> fields = new ArrayList<>();
		Class clazz = obj.getClass();
		
		while(!clazz.equals(Object.class)) {
			Field[] arr = clazz.getDeclaredFields();
			fields.addAll(Arrays.asList(arr));
			clazz = clazz.getSuperclass();
		}

		for(Field f : fields) {
			f.setAccessible(true);
			String str = f.getName();
			Class c = f.getType();
			
			try {
				if(c.isPrimitive() && !c.equals(boolean.class)) {
					int value = f.getInt(obj);
					if(value <= 0) {
						str = str + " is less then zero";
						output.add(str);
					}
				} else if(c.equals(String.class)) {
					if(f.get(obj) == null) {
						str = str + " is undefined";
						output.add(str);
					} else if("".equals((String)f.get(obj))) {
						str = str + " is empty";
						output.add(str);
					}
				} else if(c.equals(char[].class)) {
					if(f.get(obj) == null) {
						str = str + " is undefined";
						output.add(str);
					} else if(((char[])f.get(obj)).length == 0) {
						str = str + " is empty";
						output.add(str);
					}
				}
			} catch(Exception e) { 
                    e.printStackTrace();
                }
		}

		return output;
	}
}
