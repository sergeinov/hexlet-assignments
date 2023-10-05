package exercise;

import java.util.stream.Collectors;
import java.util.Map;

// BEGIN
class Tag {
    protected String name;
    protected Map<String, String> attributes;

    public Tag(String name, Map<String, String> attributes) {
        this.name = name;
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<").append(name);

        for (Map.Entry<String, String> entry : attributes.entrySet()) {
            stringBuilder.append(" ").append(entry.getKey()).append("=\"").append(entry.getValue()).append("\"");
        }

        stringBuilder.append(">");
        return stringBuilder.toString();
    }
}
// END
