package x2;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final int f32027a;

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            return this.f32027a == ((n) obj).f32027a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f32027a);
    }

    public final String toString() {
        int i10 = this.f32027a;
        return i10 == 0 ? com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d.f6965t0 : i10 == 1 ? "Italic" : "Invalid";
    }
}
