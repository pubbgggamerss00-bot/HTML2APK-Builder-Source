package androidx.compose.foundation.layout;

import androidx.compose.ui.d;
import eh.p;
import i2.a1;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.s;
import r.o2;
import z.j2;
import z.w;

/* loaded from: classes.dex */
final class WrapContentElement extends a1<j2> {

    /* renamed from: b, reason: collision with root package name */
    public final w f958b;

    /* renamed from: c, reason: collision with root package name */
    public final s f959c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f960d;

    /* JADX WARN: Multi-variable type inference failed */
    public WrapContentElement(w wVar, p pVar, Object obj) {
        this.f958b = wVar;
        this.f959c = (s) pVar;
        this.f960d = obj;
    }

    @Override // i2.a1
    public final d.c a() {
        j2 j2Var = new j2();
        j2Var.f34560q = this.f958b;
        j2Var.f34561r = this.f959c;
        return j2Var;
    }

    @Override // i2.a1
    public final void b(d.c cVar) {
        j2 j2Var = (j2) cVar;
        j2Var.f34560q = this.f958b;
        j2Var.f34561r = this.f959c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WrapContentElement.class != obj.getClass()) {
            return false;
        }
        WrapContentElement wrapContentElement = (WrapContentElement) obj;
        return this.f958b == wrapContentElement.f958b && r.a(this.f960d, wrapContentElement.f960d);
    }

    public final int hashCode() {
        return this.f960d.hashCode() + o2.a(this.f958b.hashCode() * 31, 31, false);
    }
}
