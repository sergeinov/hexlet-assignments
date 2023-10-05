package exercise;

import java.util.Map;

// BEGIN
class SingleTag extends Tag {
    public SingleTag(String name, Map<String, String> attributes) {
        super(name, attributes);
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
