package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.d;
import d0.k;
import d0.l;
import d0.m;
import i2.a1;
import kotlin.jvm.internal.r;
import r.o2;
import v.t0;

/* loaded from: classes.dex */
final class LazyLayoutBeyondBoundsModifierElement extends a1<l> {

    /* renamed from: b, reason: collision with root package name */
    public final m f986b;

    /* renamed from: c, reason: collision with root package name */
    public final k f987c;

    /* renamed from: d, reason: collision with root package name */
    public final t0 f988d;

    public LazyLayoutBeyondBoundsModifierElement(m mVar, k kVar, t0 t0Var) {
        this.f986b = mVar;
        this.f987c = kVar;
        this.f988d = t0Var;
    }

    @Override // i2.a1
    public final d.c a() {
        l lVar = new l();
        lVar.f7179q = this.f986b;
        lVar.f7180r = this.f987c;
        lVar.f7181s = this.f988d;
        return lVar;
    }

    @Override // i2.a1
    public final void b(d.c cVar) {
        l lVar = (l) cVar;
        lVar.f7179q = this.f986b;
        lVar.f7180r = this.f987c;
        lVar.f7181s = this.f988d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutBeyondBoundsModifierElement)) {
            return false;
        }
        LazyLayoutBeyondBoundsModifierElement lazyLayoutBeyondBoundsModifierElement = (LazyLayoutBeyondBoundsModifierElement) obj;
        return r.a(this.f986b, lazyLayoutBeyondBoundsModifierElement.f986b) && r.a(this.f987c, lazyLayoutBeyondBoundsModifierElement.f987c) && this.f988d == lazyLayoutBeyondBoundsModifierElement.f988d;
    }

    public final int hashCode() {
        return this.f988d.hashCode() + o2.a((this.f987c.hashCode() + (this.f986b.hashCode() * 31)) * 31, 31, false);
    }
}
