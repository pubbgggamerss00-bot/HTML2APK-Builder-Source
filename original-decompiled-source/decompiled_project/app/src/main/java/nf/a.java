package nf;

import cf.f;
import cf.i;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class a implements jf.c {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f18803a;

    public a(cf.a aVar) {
        this.f18803a = aVar.D0();
    }

    @Override // jf.c
    public final cf.b Z() {
        cf.a aVar = new cf.a();
        cf.a aVar2 = new cf.a();
        aVar2.f5416b.clear();
        for (float f10 : this.f18803a) {
            aVar2.g0(new f(f10));
        }
        aVar.g0(aVar2);
        aVar.g0(i.q0(0));
        return aVar;
    }

    public final String toString() {
        return "PDLineDashPattern{array=" + Arrays.toString(this.f18803a) + ", phase=0}";
    }
}
