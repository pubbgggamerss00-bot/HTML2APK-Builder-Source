package e4;

/* loaded from: classes.dex */
public final class n extends o {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(CharSequence charSequence, String type) {
        super(charSequence, type);
        kotlin.jvm.internal.r.e(type, "type");
        if (type.length() <= 0) {
            throw new IllegalArgumentException("type must not be empty");
        }
    }
}
