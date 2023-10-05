package exercise;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
class PairedTag extends Tag {
    private String body;
    private List<Tag> children;

    public PairedTag(String name, Map<String, String> attributes, String body, List<Tag> children) {
        super(name, attributes);
        this.body = body;
        this.children = children;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());

        if (!body.isEmpty()) {
            stringBuilder.append(body);
        } else if (!children.isEmpty()) {
            for (Tag child : children) {
                stringBuilder.append(child.toString());
            }
        }

        stringBuilder.append("</").append(name).append(">");
        return stringBuilder.toString();
    }
}
// END
