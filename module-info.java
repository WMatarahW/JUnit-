class File
{
	private static string a;
	public void file() 
	{
		ofstream f1("data.txt");
		f1 << a << endl;
	}
};