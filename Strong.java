package markup;

import java.util.List;

public class Strong extends Paragraph {

    Strong(List<? extends AbstractParagraph> paragraphs) {
        super(paragraphs);
        this.markPrefix = "__";
        this.markSuffix = "__";
        this.texPrefix = "\\textbf{";
        this.texSuffix = "}";
    }

    public void toMarkdown(StringBuilder sb) {
        super.toMarkdown(sb);
    }

    public void toTex(StringBuilder sb) {
        super.toTex(sb);
    }

}
