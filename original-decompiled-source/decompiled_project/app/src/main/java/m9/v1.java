package m9;

import android.os.Bundle;
import r.o2;

/* loaded from: classes.dex */
public final class v1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f17965a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17966b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17967c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f17968d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f17969e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f17970f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f17971g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f17972h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f17973i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f17974j;

    /* renamed from: k, reason: collision with root package name */
    public final int f17975k;

    /* renamed from: l, reason: collision with root package name */
    public final int f17976l;

    /* renamed from: m, reason: collision with root package name */
    public final String f17977m;

    public static final class a {
        public static v1 a(Bundle bundle) {
            v1 v1Var = new v1(null, 8191);
            if (bundle == null) {
                return v1Var;
            }
            String str = kotlin.jvm.internal.r.a(bundle.getString("scrollMode"), "horizontal") ? "horizontal" : "vertical";
            String string = bundle.getString("nightMode");
            if (!kotlin.jvm.internal.r.a(string, com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.f6996m) && !kotlin.jvm.internal.r.a(string, "system")) {
                string = com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.f6997n;
            }
            String str2 = string;
            String string2 = bundle.getString("colorMode");
            if (string2 == null) {
                string2 = "auto";
            }
            String str3 = string2;
            boolean z10 = bundle.getBoolean("rememberPage", true);
            boolean z11 = bundle.getBoolean("showToolbar", true);
            boolean z12 = bundle.getBoolean("showPageIndicator", true);
            boolean z13 = bundle.getBoolean("fastScroll", true);
            boolean z14 = bundle.getBoolean("zoomEnabled", true);
            boolean z15 = bundle.getBoolean("bookmarks", true);
            boolean z16 = bundle.getBoolean("allowExport", false);
            int i10 = bundle.getInt("startPage", 1);
            int i11 = i10 < 1 ? 1 : i10;
            int i12 = bundle.getInt("accentColor", -14575885);
            String string3 = bundle.getString("title");
            if (string3 == null) {
                string3 = "";
            }
            return new v1(str, str2, str3, z10, z11, z12, z13, z14, z15, z16, i11, i12, string3);
        }
    }

    public v1(String str, String nightMode, String colorMode, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, int i10, int i11, String title) {
        kotlin.jvm.internal.r.e(nightMode, "nightMode");
        kotlin.jvm.internal.r.e(colorMode, "colorMode");
        kotlin.jvm.internal.r.e(title, "title");
        this.f17965a = str;
        this.f17966b = nightMode;
        this.f17967c = colorMode;
        this.f17968d = z10;
        this.f17969e = z11;
        this.f17970f = z12;
        this.f17971g = z13;
        this.f17972h = z14;
        this.f17973i = z15;
        this.f17974j = z16;
        this.f17975k = i10;
        this.f17976l = i11;
        this.f17977m = title;
    }

    public static v1 a(v1 v1Var, String str, int i10, String str2, int i11) {
        String scrollMode = v1Var.f17965a;
        String nightMode = v1Var.f17966b;
        if ((i11 & 4) != 0) {
            str = v1Var.f17967c;
        }
        String colorMode = str;
        boolean z10 = v1Var.f17968d;
        boolean z11 = (i11 & 16) != 0 ? v1Var.f17969e : false;
        boolean z12 = (i11 & 32) != 0 ? v1Var.f17970f : false;
        boolean z13 = v1Var.f17971g;
        boolean z14 = v1Var.f17972h;
        boolean z15 = v1Var.f17973i;
        boolean z16 = (i11 & 512) != 0 ? v1Var.f17974j : true;
        int i12 = v1Var.f17975k;
        int i13 = (i11 & 2048) != 0 ? v1Var.f17976l : i10;
        String title = (i11 & 4096) != 0 ? v1Var.f17977m : str2;
        kotlin.jvm.internal.r.e(scrollMode, "scrollMode");
        kotlin.jvm.internal.r.e(nightMode, "nightMode");
        kotlin.jvm.internal.r.e(colorMode, "colorMode");
        kotlin.jvm.internal.r.e(title, "title");
        return new v1(scrollMode, nightMode, colorMode, z10, z11, z12, z13, z14, z15, z16, i12, i13, title);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1)) {
            return false;
        }
        v1 v1Var = (v1) obj;
        return kotlin.jvm.internal.r.a(this.f17965a, v1Var.f17965a) && kotlin.jvm.internal.r.a(this.f17966b, v1Var.f17966b) && kotlin.jvm.internal.r.a(this.f17967c, v1Var.f17967c) && this.f17968d == v1Var.f17968d && this.f17969e == v1Var.f17969e && this.f17970f == v1Var.f17970f && this.f17971g == v1Var.f17971g && this.f17972h == v1Var.f17972h && this.f17973i == v1Var.f17973i && this.f17974j == v1Var.f17974j && this.f17975k == v1Var.f17975k && this.f17976l == v1Var.f17976l && kotlin.jvm.internal.r.a(this.f17977m, v1Var.f17977m);
    }

    public final int hashCode() {
        return this.f17977m.hashCode() + androidx.datastore.preferences.protobuf.a1.a(this.f17976l, androidx.datastore.preferences.protobuf.a1.a(this.f17975k, o2.a(o2.a(o2.a(o2.a(o2.a(o2.a(o2.a(l0.k.a(l0.k.a(this.f17965a.hashCode() * 31, 31, this.f17966b), 31, this.f17967c), 31, this.f17968d), 31, this.f17969e), 31, this.f17970f), 31, this.f17971g), 31, this.f17972h), 31, this.f17973i), 31, this.f17974j), 31), 31);
    }

    public final String toString() {
        StringBuilder sbA = androidx.room.y0.a("PdfReaderOptions(scrollMode=", this.f17965a, ", nightMode=", this.f17966b, ", colorMode=");
        sbA.append(this.f17967c);
        sbA.append(", rememberPage=");
        sbA.append(this.f17968d);
        sbA.append(", showToolbar=");
        sbA.append(this.f17969e);
        sbA.append(", showPageIndicator=");
        sbA.append(this.f17970f);
        sbA.append(", fastScroll=");
        sbA.append(this.f17971g);
        sbA.append(", zoomEnabled=");
        sbA.append(this.f17972h);
        sbA.append(", bookmarks=");
        sbA.append(this.f17973i);
        sbA.append(", allowExport=");
        sbA.append(this.f17974j);
        sbA.append(", startPage=");
        sbA.append(this.f17975k);
        sbA.append(", accentColor=");
        sbA.append(this.f17976l);
        sbA.append(", title=");
        return b.o.a(sbA, this.f17977m, ")");
    }

    public /* synthetic */ v1(String str, int i10) {
        this("vertical", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.f6997n, "auto", true, true, true, true, true, true, false, 1, -14575885, (i10 & 4096) != 0 ? "" : str);
    }
}
