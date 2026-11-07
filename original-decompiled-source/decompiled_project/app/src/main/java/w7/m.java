package w7;

import android.content.Context;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final Context f31401a;

    /* renamed from: b, reason: collision with root package name */
    public final x7.h f31402b;

    /* renamed from: c, reason: collision with root package name */
    public final x7.f f31403c;

    /* renamed from: d, reason: collision with root package name */
    public final x7.c f31404d;

    /* renamed from: e, reason: collision with root package name */
    public final String f31405e;

    /* renamed from: f, reason: collision with root package name */
    public final hi.n f31406f;

    /* renamed from: g, reason: collision with root package name */
    public final c f31407g;

    /* renamed from: h, reason: collision with root package name */
    public final c f31408h;

    /* renamed from: i, reason: collision with root package name */
    public final c f31409i;

    /* renamed from: j, reason: collision with root package name */
    public final g7.j f31410j;

    public m(Context context, x7.h hVar, x7.f fVar, x7.c cVar, String str, hi.n nVar, c cVar2, c cVar3, c cVar4, g7.j jVar) {
        this.f31401a = context;
        this.f31402b = hVar;
        this.f31403c = fVar;
        this.f31404d = cVar;
        this.f31405e = str;
        this.f31406f = nVar;
        this.f31407g = cVar2;
        this.f31408h = cVar3;
        this.f31409i = cVar4;
        this.f31410j = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return kotlin.jvm.internal.r.a(this.f31401a, mVar.f31401a) && kotlin.jvm.internal.r.a(this.f31402b, mVar.f31402b) && this.f31403c == mVar.f31403c && this.f31404d == mVar.f31404d && kotlin.jvm.internal.r.a(this.f31405e, mVar.f31405e) && kotlin.jvm.internal.r.a(this.f31406f, mVar.f31406f) && this.f31407g == mVar.f31407g && this.f31408h == mVar.f31408h && this.f31409i == mVar.f31409i && kotlin.jvm.internal.r.a(this.f31410j, mVar.f31410j);
    }

    public final int hashCode() {
        int iHashCode = (this.f31404d.hashCode() + ((this.f31403c.hashCode() + ((this.f31402b.hashCode() + (this.f31401a.hashCode() * 31)) * 31)) * 31)) * 31;
        String str = this.f31405e;
        return this.f31410j.f11510a.hashCode() + ((this.f31409i.hashCode() + ((this.f31408h.hashCode() + ((this.f31407g.hashCode() + ((this.f31406f.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Options(context=" + this.f31401a + ", size=" + this.f31402b + ", scale=" + this.f31403c + ", precision=" + this.f31404d + ", diskCacheKey=" + this.f31405e + ", fileSystem=" + this.f31406f + ", memoryCachePolicy=" + this.f31407g + ", diskCachePolicy=" + this.f31408h + ", networkCachePolicy=" + this.f31409i + ", extras=" + this.f31410j + ')';
    }
}
