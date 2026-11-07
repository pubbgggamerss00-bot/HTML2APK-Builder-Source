package w2;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f14953a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14954b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14955c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f14956d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f14957e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f14958f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f14959g;
    public final boolean h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f14960i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f14961j;

    /* renamed from: k, reason: collision with root package name */
    public final int f14962k;

    /* renamed from: l, reason: collision with root package name */
    public final int f14963l;

    /* renamed from: m, reason: collision with root package name */
    public final String f14964m;

    public n0(String str, String str2, String str3, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, int i6, int i7, String str4) {
        kotlin.jvm.internal.j.e("nightMode", str2);
        kotlin.jvm.internal.j.e("colorMode", str3);
        kotlin.jvm.internal.j.e("title", str4);
        this.f14953a = str;
        this.f14954b = str2;
        this.f14955c = str3;
        this.f14956d = z6;
        this.f14957e = z7;
        this.f14958f = z8;
        this.f14959g = z9;
        this.h = z10;
        this.f14960i = z11;
        this.f14961j = z12;
        this.f14962k = i6;
        this.f14963l = i7;
        this.f14964m = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return kotlin.jvm.internal.j.a(this.f14953a, n0Var.f14953a) && kotlin.jvm.internal.j.a(this.f14954b, n0Var.f14954b) && kotlin.jvm.internal.j.a(this.f14955c, n0Var.f14955c) && this.f14956d == n0Var.f14956d && this.f14957e == n0Var.f14957e && this.f14958f == n0Var.f14958f && this.f14959g == n0Var.f14959g && this.h == n0Var.h && this.f14960i == n0Var.f14960i && this.f14961j == n0Var.f14961j && this.f14962k == n0Var.f14962k && this.f14963l == n0Var.f14963l && kotlin.jvm.internal.j.a(this.f14964m, n0Var.f14964m);
    }

    public final int hashCode() {
        return this.f14964m.hashCode() + ((Integer.hashCode(this.f14963l) + ((Integer.hashCode(this.f14962k) + androidx.camera.camera2.internal.compat.workaround.c.c(androidx.camera.camera2.internal.compat.workaround.c.c(androidx.camera.camera2.internal.compat.workaround.c.c(androidx.camera.camera2.internal.compat.workaround.c.c(androidx.camera.camera2.internal.compat.workaround.c.c(androidx.camera.camera2.internal.compat.workaround.c.c(androidx.camera.camera2.internal.compat.workaround.c.c(androidx.camera.view.g.d(androidx.camera.view.g.d(this.f14953a.hashCode() * 31, 31, this.f14954b), 31, this.f14955c), 31, this.f14956d), 31, this.f14957e), 31, this.f14958f), 31, this.f14959g), 31, this.h), 31, this.f14960i), 31, this.f14961j)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbA = androidx.camera.camera2.internal.i0.a("PdfReaderOptions(scrollMode=", this.f14953a, ", nightMode=", this.f14954b, ", colorMode=");
        sbA.append(this.f14955c);
        sbA.append(", rememberPage=");
        sbA.append(this.f14956d);
        sbA.append(", showToolbar=");
        sbA.append(this.f14957e);
        sbA.append(", showPageIndicator=");
        sbA.append(this.f14958f);
        sbA.append(", fastScroll=");
        sbA.append(this.f14959g);
        sbA.append(", zoomEnabled=");
        sbA.append(this.h);
        sbA.append(", bookmarks=");
        sbA.append(this.f14960i);
        sbA.append(", allowExport=");
        sbA.append(this.f14961j);
        sbA.append(", startPage=");
        sbA.append(this.f14962k);
        sbA.append(", accentColor=");
        sbA.append(this.f14963l);
        sbA.append(", title=");
        return androidx.activity.m.e(sbA, this.f14964m, ")");
    }
}
