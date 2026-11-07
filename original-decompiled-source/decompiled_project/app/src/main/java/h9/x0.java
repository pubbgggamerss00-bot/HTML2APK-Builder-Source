package h9;

import androidx.room.a;

/* loaded from: classes.dex */
public final /* synthetic */ class x0 implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12874a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12875b;

    public /* synthetic */ x0(Object obj, int i10) {
        this.f12874a = i10;
        this.f12875b = obj;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, pg.j] */
    @Override // eh.a
    public final Object invoke() {
        switch (this.f12874a) {
            case 0:
                s8.b2.e((p5.x) this.f12875b);
                return pg.f0.f21461a;
            case 1:
                kotlinx.serialization.internal.n0 n0Var = (kotlinx.serialization.internal.n0) this.f12875b;
                return Integer.valueOf(kotlinx.serialization.internal.o0.b(n0Var, (bi.f[]) n0Var.f16397j.getValue()));
            default:
                return ((a.C0039a) this.f12875b).a(":memory:");
        }
    }
}
