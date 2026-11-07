package e3;

import java.util.ArrayList;
import x0.s1;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    public static final i f8364b = new i(0);

    /* renamed from: c, reason: collision with root package name */
    public static final i f8365c = new i(1);

    /* renamed from: d, reason: collision with root package name */
    public static final i f8366d = new i(2);

    /* renamed from: a, reason: collision with root package name */
    public final int f8367a;

    public i(int i10) {
        this.f8367a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            return this.f8367a == ((i) obj).f8367a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f8367a;
    }

    public final String toString() {
        int i10 = this.f8367a;
        if (i10 == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i10 & 1) != 0) {
            arrayList.add(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d.f6970w0);
        }
        if ((i10 & 2) != 0) {
            arrayList.add(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d.f6974y0);
        }
        if (arrayList.size() != 1) {
            return s1.a(new StringBuilder("TextDecoration["), h3.a.a(arrayList, ", ", null, 62), ']');
        }
        return "TextDecoration." + ((String) arrayList.get(0));
    }
}
