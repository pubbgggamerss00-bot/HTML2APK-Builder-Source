package androidx.compose.foundation;

import androidx.compose.ui.d;
import i2.a1;
import kotlin.jvm.internal.r;
import r.o2;
import t.s1;
import t.u1;

/* loaded from: classes.dex */
public final class ScrollingLayoutElement extends a1<s1> {

    /* renamed from: b, reason: collision with root package name */
    public final u1 f809b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f810c;

    public ScrollingLayoutElement(u1 u1Var, boolean z10) {
        this.f809b = u1Var;
        this.f810c = z10;
    }

    @Override // i2.a1
    public final d.c a() {
        s1 s1Var = new s1();
        s1Var.f25345q = this.f809b;
        s1Var.f25346r = this.f810c;
        return s1Var;
    }

    @Override // i2.a1
    public final void b(d.c cVar) {
        s1 s1Var = (s1) cVar;
        s1Var.f25345q = this.f809b;
        s1Var.f25346r = this.f810c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ScrollingLayoutElement)) {
            return false;
        }
        ScrollingLayoutElement scrollingLayoutElement = (ScrollingLayoutElement) obj;
        return r.a(this.f809b, scrollingLayoutElement.f809b) && this.f810c == scrollingLayoutElement.f810c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f810c) + o2.a(this.f809b.hashCode() * 31, 31, false);
    }
}
