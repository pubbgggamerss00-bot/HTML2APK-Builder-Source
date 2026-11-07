package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.d;
import i0.i2;
import i2.a1;
import k0.c;
import k0.j1;
import k0.m1;
import kotlin.jvm.internal.r;
import m0.x2;

/* loaded from: classes.dex */
final class LegacyAdaptingPlatformTextInputModifier extends a1<j1> {

    /* renamed from: b, reason: collision with root package name */
    public final m1 f1065b;

    /* renamed from: c, reason: collision with root package name */
    public final i2 f1066c;

    /* renamed from: d, reason: collision with root package name */
    public final x2 f1067d;

    public LegacyAdaptingPlatformTextInputModifier(m1 m1Var, i2 i2Var, x2 x2Var) {
        this.f1065b = m1Var;
        this.f1066c = i2Var;
        this.f1067d = x2Var;
    }

    @Override // i2.a1
    public final d.c a() {
        return new j1(this.f1065b, this.f1066c, this.f1067d);
    }

    @Override // i2.a1
    public final void b(d.c cVar) {
        j1 j1Var = (j1) cVar;
        if (j1Var.f1157p) {
            ((c) j1Var.f15852q).c();
            j1Var.f15852q.j(j1Var);
        }
        m1 m1Var = this.f1065b;
        j1Var.f15852q = m1Var;
        if (j1Var.f1157p) {
            if (m1Var.f15873a != null) {
                y.c.c("Expected textInputModifierNode to be null");
            }
            m1Var.f15873a = j1Var;
        }
        j1Var.f15853r = this.f1066c;
        j1Var.f15854s = this.f1067d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LegacyAdaptingPlatformTextInputModifier)) {
            return false;
        }
        LegacyAdaptingPlatformTextInputModifier legacyAdaptingPlatformTextInputModifier = (LegacyAdaptingPlatformTextInputModifier) obj;
        return r.a(this.f1065b, legacyAdaptingPlatformTextInputModifier.f1065b) && r.a(this.f1066c, legacyAdaptingPlatformTextInputModifier.f1066c) && r.a(this.f1067d, legacyAdaptingPlatformTextInputModifier.f1067d);
    }

    public final int hashCode() {
        return this.f1067d.hashCode() + ((this.f1066c.hashCode() + (this.f1065b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.f1065b + ", legacyTextFieldState=" + this.f1066c + ", textFieldSelectionManager=" + this.f1067d + ')';
    }
}
