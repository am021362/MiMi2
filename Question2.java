public class Question2{
	public static void main(String[] args){
		txtCopy("Source.txt", "Dest.txt");
		editFile("Dest.txt");
		imgCopy("Source.jpg", "Dest.jpg");
	}
}

private String class txtCopy( String file ) throws IOException {
    BufferedReader reader = new BufferedReader( new FileReader (file));
    String         line = null;
    StringBuilder  stringBuilder = new StringBuilder();
    String         ls = System.getProperty("line.separator");

    while( ( line = reader.readLine() ) != null ) {
        stringBuilder.append( line );
        stringBuilder.append( ls );
    }

    return stringBuilder.toString();
}