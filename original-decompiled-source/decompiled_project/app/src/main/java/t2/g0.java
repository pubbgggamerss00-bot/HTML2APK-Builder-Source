package t2;

import androidx.datastore.preferences.protobuf.a1;
import d0.d2;
import java.util.List;
import r.o2;
import t2.b;
import x2.f;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final b f27809a;

    /* renamed from: b, reason: collision with root package name */
    public final l0 f27810b;

    /* renamed from: c, reason: collision with root package name */
    public final List<b.c<u>> f27811c;

    /* renamed from: d, reason: collision with root package name */
    public final int f27812d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f27813e;

    /* renamed from: f, reason: collision with root package name */
    public final int f27814f;

    /* renamed from: g, reason: collision with root package name */
    public final f3.d f27815g;

    /* renamed from: h, reason: collision with root package name */
    public final f3.r f27816h;

    /* renamed from: i, reason: collision with root package name */
    public final f.a f27817i;

    /* renamed from: j, reason: collision with root package name */
    public final long f27818j;

    public g0(b bVar, l0 l0Var, List list, int i10, boolean z10, int i11, f3.d dVar, f3.r rVar, f.a aVar, long j10) {
        this.f27809a = bVar;
        this.f27810b = l0Var;
        this.f27811c = list;
        this.f27812d = i10;
        this.f27813e = z10;
        this.f27814f = i11;
        this.f27815g = dVar;
        this.f27816h = rVar;
        this.f27817i = aVar;
        this.f27818j = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return kotlin.jvm.internal.r.a(this.f27809a, g0Var.f27809a) && kotlin.jvm.internal.r.a(this.f27810b, g0Var.f27810b) && kotlin.jvm.internal.r.a(this.f27811c, g0Var.f27811c) && this.f27812d == g0Var.f27812d && this.f27813e == g0Var.f27813e && this.f27814f == g0Var.f27814f && kotlin.jvm.internal.r.a(this.f27815g, g0Var.f27815g) && this.f27816h == g0Var.f27816h && kotlin.jvm.internal.r.a(this.f27817i, g0Var.f27817i) && f3.b.c(this.f27818j, g0Var.f27818j);
    }

    public final int hashCode() {
        return Long.hashCode(this.f27818j) + ((this.f27817i.hashCode() + ((this.f27816h.hashCode() + ((this.f27815g.hashCode() + a1.a(this.f27814f, o2.a((a2.a.a(this.f27811c, (this.f27810b.hashCode() + (this.f27809a.hashCode() * 31)) * 31, 31) + this.f27812d) * 31, 31, this.f27813e), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TextLayoutInput(text=" + ((Object) this.f27809a) + ", style=" + this.f27810b + ", placeholders=" + this.f27811c + ", maxLines=" + this.f27812d + ", softWrap=" + this.f27813e + ", overflow=" + ((Object) d2.d(this.f27814f)) + ", density=" + this.f27815g + ", layoutDirection=" + this.f27816h + ", fontFamilyResolver=" + this.f27817i + ", constraints=" + ((Object) f3.b.m(this.f27818j)) + ')';
    }
}
