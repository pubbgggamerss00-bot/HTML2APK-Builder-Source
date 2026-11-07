package androidx.compose.ui.graphics;

import androidx.compose.ui.d;
import eh.l;
import pg.f0;
import q1.f2;
import q1.l1;
import q1.l2;
import q1.m1;
import q1.y1;

/* loaded from: classes.dex */
public final class a {
    public static final d a(d dVar, l<? super l1, f0> lVar) {
        return dVar.h(new BlockGraphicsLayerElement(lVar));
    }

    public static d b(d dVar, float f10, float f11, float f12, float f13, float f14, f2 f2Var, boolean z10, int i10) {
        float f15 = (i10 & 1) != 0 ? 1.0f : f10;
        float f16 = (i10 & 2) != 0 ? 1.0f : f11;
        float f17 = (i10 & 4) != 0 ? 1.0f : f12;
        float f18 = (i10 & 32) != 0 ? 0.0f : f13;
        float f19 = (i10 & 256) != 0 ? 0.0f : f14;
        long j10 = l2.f21718b;
        f2 f2Var2 = (i10 & 2048) != 0 ? y1.f21750a : f2Var;
        boolean z11 = (i10 & 4096) != 0 ? false : z10;
        long j11 = m1.f21721a;
        return dVar.h(new GraphicsLayerElement(f15, f16, f17, f18, f19, j10, f2Var2, z11, j11, j11));
    }
}
