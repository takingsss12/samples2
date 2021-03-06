package samples;

import java.lang.reflect.Modifier;

public final class Program {

	public static void main(String[] args)
	{
		assert isMainMethodPresent();
	}
	
	private static boolean isMainMethodPresent ()
	{
		try
		{
			return Modifier.isStatic(Program.class.getDeclaredMethod("main", String[].class).getModifiers());
		}
		catch (final NoSuchMethodException exception)
		{
			return false;
		}
	}

}
