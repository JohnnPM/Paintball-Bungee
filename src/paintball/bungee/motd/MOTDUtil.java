/*
 * Author: 598Johnn897
 * 
 * Date: Dec 2, 2014
 * Package: paintball.bungee
 *
 */
package paintball.bungee.motd;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import paintball.bungee.lib.References;

/**
 * 
 */
public class MOTDUtil
{
	public static void writeMOTDtoFile(String motd) throws IOException
	{
		File file = new File("./motd.txt");
		if (file.exists())
			file.delete();
		
		Files.write(Paths.get("./motd.txt"), motd.getBytes());
	}

	public static String getMOTDfromFile() throws IOException
	{
		List<String> lines = Files.readAllLines(Paths.get("./motd.txt"),
				Charset.defaultCharset());
		return lines.get(0);
	}
	
	public static String getDefaultMOTD()
	{
		return References.DEFAULT_MOTD;
	}
}
