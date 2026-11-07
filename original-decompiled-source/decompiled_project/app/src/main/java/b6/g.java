package b6;

import androidx.room.g0;
import pg.f0;
import ph.i0;

@vg.e(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1", f = "DBUtil.android.kt", l = {113}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class g extends vg.i implements eh.p<i0, tg.e<Object>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f3609a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f3610b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f3611c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f3612d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ eh.l f3613e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(g0 g0Var, eh.l lVar, tg.e eVar, boolean z10, boolean z11) {
        super(2, eVar);
        this.f3610b = g0Var;
        this.f3611c = z10;
        this.f3612d = z11;
        this.f3613e = lVar;
    }

    @Override // vg.a
    public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
        boolean z10 = this.f3612d;
        return new g(this.f3610b, this.f3613e, eVar, this.f3611c, z10);
    }

    @Override // eh.p
    public final Object invoke(i0 i0Var, tg.e<Object> eVar) {
        return ((g) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f3609a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
            return obj;
        }
        pg.q.b(obj);
        eh.l lVar = this.f3613e;
        g0 g0Var = this.f3610b;
        boolean z10 = this.f3612d;
        boolean z11 = this.f3611c;
        i iVar = new i(g0Var, lVar, null, z10, z11);
        this.f3609a = 1;
        Object objUseConnection$room_runtime_release = g0Var.useConnection$room_runtime_release(z11, iVar, this);
        return objUseConnection$room_runtime_release == aVar ? aVar : objUseConnection$room_runtime_release;
    }
}
