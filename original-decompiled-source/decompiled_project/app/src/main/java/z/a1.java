package z;

import androidx.compose.ui.d;

/* loaded from: classes.dex */
public final class a1 extends d.c implements i2.g2 {

    /* renamed from: q, reason: collision with root package name */
    public float f34442q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f34443r;

    @Override // i2.g2
    public final Object O0(f3.d dVar, Object obj) {
        j1 j1Var = obj instanceof j1 ? (j1) obj : null;
        if (j1Var == null) {
            j1Var = new j1(0);
        }
        j1Var.f34557a = this.f34442q;
        j1Var.f34558b = this.f34443r;
        return j1Var;
    }
}
