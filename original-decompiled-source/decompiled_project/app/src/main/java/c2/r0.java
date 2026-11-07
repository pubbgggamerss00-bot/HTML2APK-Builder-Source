package c2;

import j2.j2;

/* loaded from: classes.dex */
public final class r0 extends h {

    /* renamed from: t, reason: collision with root package name */
    public final String f4691t;

    public r0(b bVar, i2.q qVar) {
        super(bVar, qVar);
        this.f4691t = "androidx.compose.ui.input.pointer.StylusHoverIcon";
    }

    @Override // i2.o2
    public final Object L() {
        return this.f4691t;
    }

    @Override // c2.h
    public final void U1(x xVar) {
        z zVar = (z) i2.i.a(this, j2.f14792u);
        if (zVar != null) {
            zVar.c(xVar);
        }
    }

    @Override // c2.h
    public final boolean W1(int i10) {
        return i10 == 3 || i10 == 4;
    }
}
