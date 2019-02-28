package lab2.ex1;

public class Book {
	private String chapters[];
	private static final int DEFAULT_CHAPTERS = 10;
	public Book()
	{
		chapters = new String[DEFAULT_CHAPTERS];
		for(int i = 0; i < chapters.length; i++)
		{
			chapters[i] = "Chapter " + 1;
		}
	}
	
	public Book(String chapterNames[])
	{
		chapters = new String[chapterNames.length];
		for(int i = 0; i < chapterNames.length; i++)
			chapters[i] = chapterNames[i];
	}
	
	public String getChapter(int i)
	{
		if(i > 0 && i < chapters.length)
			return chapters[i];
		else
			return "invalid chapter";
	}
	
	public String[] getChapters()
	{
		return chapters;
	}
}
