package markup;

public class Text implements AbstractParagraph {
	String text;
	
	Text(String s) {
	    this.text = s;
	}


    @Override
	public void toMarkdown(StringBuilder sb) {
	    sb.append(text);
	}

    @Override
    public void toTex(StringBuilder sb) {
	    sb.append(text);
    }
}
