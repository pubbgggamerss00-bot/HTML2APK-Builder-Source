package c2;

import j2.j2;

/* loaded from: classes.dex */
public final class w extends h {

    /* renamed from: t, reason: collision with root package name */
    public final String f4703t;

    public w(b bVar) {
        super(bVar, null);
        this.f4703t = "androidx.compose.ui.input.pointer.PointerHoverIcon";
    }

    @Override // i2.o2
    public final Object L() {
        return this.f4703t;
    }

    @Override // c2.h
    public final void U1(x xVar) {
        z zVar = (z) i2.i.a(this, j2.f14792u);
        if (zVar != null) {
            zVar.b(xVar);
        }
    }

    @Override // c2.h
    public final boolean W1(int i10) {
        return (i10 == 3 || i10 == 4) ? false : true;
    }
}
