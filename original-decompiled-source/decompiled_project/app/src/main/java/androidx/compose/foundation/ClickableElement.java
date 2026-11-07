package androidx.compose.foundation;

import androidx.compose.ui.d;
import i2.a1;
import kotlin.jvm.internal.r;
import pg.f0;
import q2.i;
import r.o2;
import t.b0;
import t.y0;
import x.m;

/* loaded from: classes.dex */
final class ClickableElement extends a1<b0> {

    /* renamed from: b, reason: collision with root package name */
    public final m f778b;

    /* renamed from: c, reason: collision with root package name */
    public final y0 f779c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f780d;

    /* renamed from: e, reason: collision with root package name */
    public final String f781e;

    /* renamed from: f, reason: collision with root package name */
    public final i f782f;

    /* renamed from: g, reason: collision with root package name */
    public final eh.a<f0> f783g;

    public ClickableElement() {
        throw null;
    }

    public ClickableElement(m mVar, y0 y0Var, boolean z10, String str, i iVar, eh.a aVar) {
        this.f778b = mVar;
        this.f779c = y0Var;
        this.f780d = z10;
        this.f781e = str;
        this.f782f = iVar;
        this.f783g = aVar;
    }

    @Override // i2.a1
    public final d.c a() {
        return new b0(this.f778b, this.f779c, this.f780d, this.f781e, this.f782f, this.f783g);
    }

    @Override // i2.a1
    public final void b(d.c cVar) {
        ((b0) cVar).d2(this.f778b, this.f779c, this.f780d, this.f781e, this.f782f, this.f783g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ClickableElement.class != obj.getClass()) {
            return false;
        }
        ClickableElement clickableElement = (ClickableElement) obj;
        return r.a(this.f778b, clickableElement.f778b) && r.a(this.f779c, clickableElement.f779c) && this.f780d == clickableElement.f780d && r.a(this.f781e, clickableElement.f781e) && r.a(this.f782f, clickableElement.f782f) && this.f783g == clickableElement.f783g;
    }

    public final int hashCode() {
        m mVar = this.f778b;
        int iHashCode = (mVar != null ? mVar.hashCode() : 0) * 31;
        y0 y0Var = this.f779c;
        int iA = o2.a((iHashCode + (y0Var != null ? y0Var.hashCode() : 0)) * 31, 31, this.f780d);
        String str = this.f781e;
        int iHashCode2 = (iA + (str != null ? str.hashCode() : 0)) * 31;
        i iVar = this.f782f;
        return this.f783g.hashCode() + ((iHashCode2 + (iVar != null ? Integer.hashCode(iVar.f21770a) : 0)) * 31);
    }
}
