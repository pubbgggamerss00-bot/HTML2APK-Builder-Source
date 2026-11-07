package y2;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final int f33766a;

    public static String a(int i10) {
        return i10 == 0 ? "Unspecified" : i10 == 1 ? "Text" : i10 == 2 ? "Ascii" : i10 == 3 ? "Number" : i10 == 4 ? "Phone" : i10 == 5 ? "Uri" : i10 == 6 ? "Email" : i10 == 7 ? "Password" : i10 == 8 ? "NumberPassword" : i10 == 9 ? com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.e.f6980g : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return this.f33766a == ((r) obj).f33766a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f33766a);
    }

    public final String toString() {
        return a(this.f33766a);
    }
}
