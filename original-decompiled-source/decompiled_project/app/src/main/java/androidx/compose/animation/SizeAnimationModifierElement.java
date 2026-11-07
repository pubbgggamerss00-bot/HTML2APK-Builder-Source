package androidx.compose.animation;

import androidx.compose.ui.d;
import i2.a1;
import j1.d;
import j1.f;
import kotlin.jvm.internal.r;
import r.h2;
import s.l1;

/* loaded from: classes.dex */
final class SizeAnimationModifierElement extends a1<h2> {

    /* renamed from: b, reason: collision with root package name */
    public final l1 f754b;

    /* renamed from: c, reason: collision with root package name */
    public final f f755c = d.a.f14602a;

    public SizeAnimationModifierElement(l1 l1Var) {
        this.f754b = l1Var;
    }

    @Override // i2.a1
    public final d.c a() {
        return new h2(this.f754b, this.f755c);
    }

    @Override // i2.a1
    public final void b(d.c cVar) {
        h2 h2Var = (h2) cVar;
        h2Var.f22834q = this.f754b;
        h2Var.f22835r = this.f755c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeAnimationModifierElement)) {
            return false;
        }
        SizeAnimationModifierElement sizeAnimationModifierElement = (SizeAnimationModifierElement) obj;
        return r.a(this.f754b, sizeAnimationModifierElement.f754b) && r.a(this.f755c, sizeAnimationModifierElement.f755c);
    }

    public final int hashCode() {
        return (this.f755c.hashCode() + (this.f754b.hashCode() * 31)) * 31;
    }

    public final String toString() {
        return "SizeAnimationModifierElement(animationSpec=" + this.f754b + ", alignment=" + this.f755c + ", finishedListener=null)";
    }
}
