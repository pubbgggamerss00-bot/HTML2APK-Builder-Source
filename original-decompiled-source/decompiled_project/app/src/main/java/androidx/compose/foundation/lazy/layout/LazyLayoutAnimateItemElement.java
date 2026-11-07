package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.d;
import d0.j;
import f3.m;
import i2.a1;
import kotlin.jvm.internal.r;
import s.e0;

/* loaded from: classes.dex */
public final class LazyLayoutAnimateItemElement extends a1<j> {

    /* renamed from: b, reason: collision with root package name */
    public final e0<Float> f983b;

    /* renamed from: c, reason: collision with root package name */
    public final e0<m> f984c;

    /* renamed from: d, reason: collision with root package name */
    public final e0<Float> f985d;

    public LazyLayoutAnimateItemElement(e0<Float> e0Var, e0<m> e0Var2, e0<Float> e0Var3) {
        this.f983b = e0Var;
        this.f984c = e0Var2;
        this.f985d = e0Var3;
    }

    @Override // i2.a1
    public final d.c a() {
        j jVar = new j();
        jVar.f7154q = this.f983b;
        jVar.f7155r = this.f984c;
        jVar.f7156s = this.f985d;
        return jVar;
    }

    @Override // i2.a1
    public final void b(d.c cVar) {
        j jVar = (j) cVar;
        jVar.f7154q = this.f983b;
        jVar.f7155r = this.f984c;
        jVar.f7156s = this.f985d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutAnimateItemElement)) {
            return false;
        }
        LazyLayoutAnimateItemElement lazyLayoutAnimateItemElement = (LazyLayoutAnimateItemElement) obj;
        return r.a(this.f983b, lazyLayoutAnimateItemElement.f983b) && r.a(this.f984c, lazyLayoutAnimateItemElement.f984c) && r.a(this.f985d, lazyLayoutAnimateItemElement.f985d);
    }

    public final int hashCode() {
        e0<Float> e0Var = this.f983b;
        int iHashCode = (e0Var == null ? 0 : e0Var.hashCode()) * 31;
        e0<m> e0Var2 = this.f984c;
        int iHashCode2 = (iHashCode + (e0Var2 == null ? 0 : e0Var2.hashCode())) * 31;
        e0<Float> e0Var3 = this.f985d;
        return iHashCode2 + (e0Var3 != null ? e0Var3.hashCode() : 0);
    }

    public final String toString() {
        return "LazyLayoutAnimateItemElement(fadeInSpec=" + this.f983b + ", placementSpec=" + this.f984c + ", fadeOutSpec=" + this.f985d + ')';
    }
}
