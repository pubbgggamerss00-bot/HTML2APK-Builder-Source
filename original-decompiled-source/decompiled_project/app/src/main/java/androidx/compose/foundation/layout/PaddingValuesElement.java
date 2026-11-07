package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.f;
import androidx.compose.ui.d;
import i2.a1;
import kotlin.jvm.internal.r;
import z.f1;
import z.h1;

/* loaded from: classes.dex */
final class PaddingValuesElement extends a1<h1> {

    /* renamed from: b, reason: collision with root package name */
    public final f1 f949b;

    public PaddingValuesElement(f1 f1Var, f.d dVar) {
        this.f949b = f1Var;
    }

    @Override // i2.a1
    public final d.c a() {
        h1 h1Var = new h1();
        h1Var.f34540q = this.f949b;
        return h1Var;
    }

    @Override // i2.a1
    public final void b(d.c cVar) {
        ((h1) cVar).f34540q = this.f949b;
    }

    public final boolean equals(Object obj) {
        PaddingValuesElement paddingValuesElement = obj instanceof PaddingValuesElement ? (PaddingValuesElement) obj : null;
        if (paddingValuesElement == null) {
            return false;
        }
        return r.a(this.f949b, paddingValuesElement.f949b);
    }

    public final int hashCode() {
        return this.f949b.hashCode();
    }
}
