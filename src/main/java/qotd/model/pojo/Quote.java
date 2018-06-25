package qotd.model.pojo;

public class Quote {
	
	public String compressedQuote;
	public int[] indexes;
	
	public String getCompressedQuote() {
		return compressedQuote;
	}
	public void setCompressedQuote(String compressedQuote) {
		this.compressedQuote = compressedQuote;
	}
	public int[] getIndexes() {
		return indexes;
	}
	public void setIndexes(int[] indexes) {
		this.indexes = indexes;
	}
}
