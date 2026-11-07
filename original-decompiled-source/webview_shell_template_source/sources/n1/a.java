package n1;

import d5.j;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.k;
import p5.l;
import y.b;
import y5.e0;
import y5.s0;
import y5.t0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a extends k implements l<Throwable, j> {
    public final /* synthetic */ b.a<Object> s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e0 f13912t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b.a aVar, e0 e0Var) {
        super(1);
        this.s = aVar;
        this.f13912t = e0Var;
    }

    @Override // p5.l
    public final j invoke(Throwable th) throws Throwable {
        s0 s0Var;
        Throwable th2 = th;
        b.a<Object> aVar = this.s;
        if (th2 == null) {
            Object objE = this.f13912t.E();
            if (objE instanceof s0) {
                throw new IllegalStateException("This job has not completed yet");
            }
            if (objE instanceof y5.l) {
                throw ((y5.l) objE).f15358a;
            }
            t0 t0Var = objE instanceof t0 ? (t0) objE : null;
            if (t0Var != null && (s0Var = t0Var.f15372a) != null) {
                objE = s0Var;
            }
            aVar.a(objE);
        } else if (th2 instanceof CancellationException) {
            aVar.f15193d = true;
            b.d<Object> dVar = aVar.f15191b;
            if (dVar != null && dVar.f15194t.cancel(true)) {
                aVar.f15190a = null;
                aVar.f15191b = null;
                aVar.f15192c = null;
            }
        } else {
            aVar.b(th2);
        }
        return j.f12745a;
    }
}
