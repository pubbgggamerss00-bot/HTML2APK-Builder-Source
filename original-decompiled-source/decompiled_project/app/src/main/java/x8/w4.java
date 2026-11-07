package x8;

import androidx.compose.ui.d;
import p0.va;

/* loaded from: classes.dex */
public final class w4 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f33325a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f33326b;

    public w4(String str, long j10) {
        this.f33325a = str;
        this.f33326b = j10;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            t0.t4.b(va.a(), this.f33325a, androidx.compose.foundation.layout.g.n(d.a.f1143b, 26), this.f33326b, jVar2, 384, 0);
        }
        return pg.f0.f21461a;
    }
}
