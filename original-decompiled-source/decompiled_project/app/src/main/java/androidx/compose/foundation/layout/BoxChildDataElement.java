package androidx.compose.foundation.layout;

import androidx.compose.ui.d;
import eh.l;
import i2.a1;
import j2.e3;
import kotlin.jvm.internal.r;
import pg.f0;

/* loaded from: classes.dex */
final class BoxChildDataElement extends a1<z.f> {

    /* renamed from: b, reason: collision with root package name */
    public final j1.f f925b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f926c;

    /* renamed from: d, reason: collision with root package name */
    public final l<e3, f0> f927d;

    public BoxChildDataElement(j1.f fVar, boolean z10, l lVar) {
        this.f925b = fVar;
        this.f926c = z10;
        this.f927d = lVar;
    }

    @Override // i2.a1
    public final d.c a() {
        z.f fVar = new z.f();
        fVar.f34503q = this.f925b;
        fVar.f34504r = this.f926c;
        return fVar;
    }

    @Override // i2.a1
    public final void b(d.c cVar) {
        z.f fVar = (z.f) cVar;
        fVar.f34503q = this.f925b;
        fVar.f34504r = this.f926c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        BoxChildDataElement boxChildDataElement = obj instanceof BoxChildDataElement ? (BoxChildDataElement) obj : null;
        return boxChildDataElement != null && r.a(this.f925b, boxChildDataElement.f925b) && this.f926c == boxChildDataElement.f926c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f926c) + (this.f925b.hashCode() * 31);
    }
}
