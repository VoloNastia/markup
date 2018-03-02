package markup;

import java.util.List;

public class Strikeout extends Paragraph {
    Strikeout(List<? extends AbstractParagraph> paragraphs) {
        super(paragraphs);
        this.markPrefix = "~";
        this.markSuffix = "~";
        this.texPrefix = "\\textst{";
        this.texSuffix = "}";
    }

    public void toMarkdown(StringBuilder sb) {
        super.toMarkdown(sb);
    }

    public void toTex(StringBuilder sb) {
        super.toTex(sb);
    }
}
