package exercise;

// BEGIN
public class InputTag implements TagInterface {
    private final String type;
    private final String value;

    public InputTag(String name, String body) {
        this.type = name;
        this.value = body;
    }

    public String render() {
        return String.format("<input type=\"%s\" value=\"%s\">", type, value);

    }
}
// END
