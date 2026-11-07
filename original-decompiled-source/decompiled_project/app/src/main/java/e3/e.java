package e3;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final int f8350b = 66305;

    /* renamed from: a, reason: collision with root package name */
    public final int f8351a;

    public static String a(int i10) {
        StringBuilder sb = new StringBuilder("LineBreak(strategy=");
        int i11 = i10 & 255;
        String str = "Invalid";
        sb.append((Object) (i11 == 1 ? "Strategy.Simple" : i11 == 2 ? "Strategy.HighQuality" : i11 == 3 ? "Strategy.Balanced" : i11 == 0 ? "Strategy.Unspecified" : "Invalid"));
        sb.append(", strictness=");
        int i12 = (i10 >> 8) & 255;
        sb.append((Object) (i12 == 1 ? "Strictness.None" : i12 == 2 ? "Strictness.Loose" : i12 == 3 ? "Strictness.Normal" : i12 == 4 ? "Strictness.Strict" : i12 == 0 ? "Strictness.Unspecified" : "Invalid"));
        sb.append(", wordBreak=");
        int i13 = (i10 >> 16) & 255;
        if (i13 == 1) {
            str = "WordBreak.None";
        } else if (i13 == 2) {
            str = "WordBreak.Phrase";
        } else if (i13 == 0) {
            str = "WordBreak.Unspecified";
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f8351a == ((e) obj).f8351a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8351a);
    }

    public final String toString() {
        return a(this.f8351a);
    }
}
