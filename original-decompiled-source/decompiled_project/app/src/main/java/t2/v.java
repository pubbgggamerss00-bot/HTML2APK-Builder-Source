package t2;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: b, reason: collision with root package name */
    public static final v f27886b = new v();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f27887a;

    public v(int i10) {
        this.f27887a = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v) {
            return this.f27887a == ((v) obj).f27887a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (Boolean.hashCode(this.f27887a) * 31);
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.f27887a + ", emojiSupportMatch=EmojiSupportMatch.Default)";
    }

    public v(boolean z10) {
        this.f27887a = z10;
    }

    public v() {
        this(false);
    }
}
