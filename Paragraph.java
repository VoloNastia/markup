package markup;

import java.util.List;

public class Paragraph implements AbstractParagraph {
    private List<? extends AbstractParagraph> paragraphs;
    String markPrefix = "";
    String markSuffix = "";
    String texPrefix = "";
    String texSuffix = "";

    Paragraph(List<? extends AbstractParagraph> paragraphs) {
        this.paragraphs = paragraphs;
    }

    @Override
    public void toMarkdown(StringBuilder sb) {
        sb.append(markPrefix);
        for (AbstractParagraph p : paragraphs) {
            p.toMarkdown(sb);
        }
        sb.append(markSuffix);
    }

    @Override
    public void toTex(StringBuilder sb) {
        sb.append(texPrefix);
        for (AbstractParagraph p : paragraphs) {
            p.toTex(sb);
        }
        sb.append(texSuffix);
    }

}
