package markup;

import java.util.List;

public class Emphasis extends Paragraph {
    Emphasis(List<? extends AbstractParagraph> paragraphs) {
        super(paragraphs);
        this.markPrefix = "*";
        this.markSuffix = "*";
        this.texPrefix = "\\emph{";
        this.texSuffix = "}";
    }

    public void toMarkdown(StringBuilder sb) {
        super.toMarkdown(sb);
    }

    public void toTex(StringBuilder sb) {
        super.toTex(sb);
    }

}
