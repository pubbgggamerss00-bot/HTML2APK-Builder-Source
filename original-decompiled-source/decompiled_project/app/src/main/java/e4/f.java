package e4;

/* loaded from: classes.dex */
public final class f extends g {
    public f(CharSequence charSequence, String str) {
        super(charSequence, str);
        if (str.length() <= 0) {
            throw new IllegalArgumentException("type must not be empty");
        }
    }
}
