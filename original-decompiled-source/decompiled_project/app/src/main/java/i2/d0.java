package i2;

import java.util.Comparator;

/* loaded from: classes.dex */
public final /* synthetic */ class d0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        e0 e0Var = (e0) obj;
        e0 e0Var2 = (e0) obj2;
        float f10 = e0Var.K.f13929p.I;
        float f11 = e0Var2.K.f13929p.I;
        return f10 == f11 ? kotlin.jvm.internal.r.f(e0Var.H(), e0Var2.H()) : Float.compare(f10, f11);
    }
}
