package exercise;

// BEGIN
class ReversedSequence implements CharSequence {
    private final CharSequence sequence;

    public ReversedSequence(CharSequence sequence) {
        this.sequence = sequence;
    }

    @Override
    public int length() {
        return sequence.length();
    }

    @Override
    public char charAt(int index) {
        return sequence.charAt(length() - index - 1);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return sequence.subSequence(length() - end - 1, length() - start - 1);
    }

    @Override
    public String toString() {
        StringBuilder reversed = new StringBuilder(length());
        for (int i = length() - 1; i >= 0; i--) {
            reversed.append(sequence.charAt(i));
        }
        return reversed.toString();
    }
}
// END
