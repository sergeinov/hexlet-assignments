package exercise;

// BEGIN
public class LabelTag implements TagInterface {
    private String text;
    private TagInterface innerTag;

    public LabelTag(String text, TagInterface innerTag) {
        this.text = text;
        this.innerTag = innerTag;
    }

    @Override
    public String render() {
        // Оборачиваем внутренний тег внутри <label>
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<label>").append(text).append(innerTag.render()).append("</label>");
        return stringBuilder.toString();
    }

}
// END
