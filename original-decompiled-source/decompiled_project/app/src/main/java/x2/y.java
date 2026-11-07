package x2;

import pg.f0;

/* loaded from: classes.dex */
public final class y extends kotlin.jvm.internal.s implements eh.l<a0, f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f32048a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f32049b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, x xVar) {
        super(1);
        this.f32048a = zVar;
        this.f32049b = xVar;
    }

    @Override // eh.l
    public final f0 invoke(a0 a0Var) {
        a0 a0Var2 = a0Var;
        z zVar = this.f32048a;
        b3.l lVar = zVar.f32050a;
        x xVar = this.f32049b;
        synchronized (lVar) {
            try {
                if (a0Var2.d()) {
                    zVar.f32051b.put(xVar, a0Var2);
                } else {
                    zVar.f32051b.remove(xVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f0.f21461a;
    }
}
