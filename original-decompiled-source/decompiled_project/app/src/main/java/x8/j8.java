package x8;

import android.content.Context;
import androidx.compose.ui.d;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.List;

/* loaded from: classes.dex */
public final class j8 extends kotlin.jvm.internal.s implements eh.r<b0.e, Integer, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f32828a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SimpleDateFormat f32829b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f32830c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c.k f32831d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f32832e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f32833f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j8(List list, SimpleDateFormat simpleDateFormat, Context context, c.k kVar, x0.n1 n1Var, x0.n1 n1Var2) {
        super(4);
        this.f32828a = list;
        this.f32829b = simpleDateFormat;
        this.f32830c = context;
        this.f32831d = kVar;
        this.f32832e = n1Var;
        this.f32833f = n1Var2;
    }

    @Override // eh.r
    public final pg.f0 f(b0.e eVar, Integer num, x0.j jVar, Integer num2) {
        int i10;
        b0.e eVar2 = eVar;
        int iIntValue = num.intValue();
        x0.j jVar2 = jVar;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 6) == 0) {
            i10 = (jVar2.K(eVar2) ? 4 : 2) | iIntValue2;
        } else {
            i10 = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i10 |= jVar2.i(iIntValue) ? 32 : 16;
        }
        if (jVar2.A(i10 & 1, (i10 & 147) != 146)) {
            File file = (File) this.f32828a.get(iIntValue);
            jVar2.L(1137654254);
            String name = file.getName();
            kotlin.jvm.internal.r.d(name, "getName(...)");
            boolean zI = mh.t.i(name, ".apk", true);
            String name2 = file.getName();
            kotlin.jvm.internal.r.d(name2, "getName(...)");
            boolean zI2 = mh.t.i(name2, ".aab", true);
            androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f);
            h0.e eVarA = h0.f.a(16);
            x0.s3 s3Var = t0.f2.f25858a;
            long jC = q1.b1.c(0.3f, ((t0.e2) jVar2.f(s3Var)).f25772r);
            long jB = t0.f2.b(jC, jVar2);
            long j10 = q1.b1.f21654h;
            long jC2 = q1.b1.c(0.38f, t0.f2.b(jC, jVar2));
            t0.e2 e2Var = (t0.e2) jVar2.f(s3Var);
            t0.y0 y0Var = e2Var.P;
            if (y0Var == null) {
                float f10 = v0.x.f30497a;
                v0.d dVar = v0.d.f30253s;
                y0Var = new t0.y0(t0.f2.d(e2Var, dVar), t0.f2.a(e2Var, t0.f2.d(e2Var, dVar)), t0.f2.d(e2Var, dVar), q1.b1.c(0.38f, t0.f2.a(e2Var, t0.f2.d(e2Var, dVar))));
                e2Var.P = y0Var;
            }
            t0.d1.c(dVarD, eVarA, y0Var.a(jC, jB, j10, jC2), null, a9.d2.a(1, q1.b1.c(0.6f, ((t0.e2) jVar2.f(s3Var)).B)), f1.c.b(-1231418071, new f8(zI, zI2, file, this.f32829b, this.f32830c, this.f32831d, this.f32832e, this.f32833f), jVar2), jVar2, 196614);
            jVar2.B();
        } else {
            jVar2.v();
        }
        return pg.f0.f21461a;
    }
}
