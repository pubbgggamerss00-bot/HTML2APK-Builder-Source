package androidx.room;

import tg.f;
import tg.h;

/* loaded from: classes.dex */
public final class h0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tg.h f2970a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ph.m f2971b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g0 f2972c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i0 f2973d;

    @vg.e(c = "androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$startTransactionCoroutine$2$1$1", f = "RoomDatabase.android.kt", l = {2048}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f2974a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f2975b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ g0 f2976c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ph.m f2977d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ i0 f2978e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g0 g0Var, ph.m mVar, i0 i0Var, tg.e eVar) {
            super(2, eVar);
            this.f2976c = g0Var;
            this.f2977d = mVar;
            this.f2978e = i0Var;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            a aVar = new a(this.f2976c, this.f2977d, this.f2978e, eVar);
            aVar.f2975b = obj;
            return aVar;
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            tg.e eVar;
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f2974a;
            if (i10 == 0) {
                pg.q.b(obj);
                h.a aVar2 = ((ph.i0) this.f2975b).getCoroutineContext().get(f.a.f28767a);
                kotlin.jvm.internal.r.b(aVar2);
                tg.f fVar = (tg.f) aVar2;
                p0 p0Var = new p0(fVar);
                tg.h hVarPlus = fVar.plus(p0Var).plus(new uh.c0(Integer.valueOf(System.identityHashCode(p0Var)), this.f2976c.getSuspendingTransactionId()));
                ph.m mVar = this.f2977d;
                this.f2975b = mVar;
                this.f2974a = 1;
                obj = ph.h.e(hVarPlus, this.f2978e, this);
                if (obj == aVar) {
                    return aVar;
                }
                eVar = mVar;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                eVar = (tg.e) this.f2975b;
                pg.q.b(obj);
            }
            eVar.resumeWith(obj);
            return pg.f0.f21461a;
        }
    }

    public h0(tg.h hVar, ph.m mVar, g0 g0Var, i0 i0Var) {
        this.f2970a = hVar;
        this.f2971b = mVar;
        this.f2972c = g0Var;
        this.f2973d = i0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ph.m mVar = this.f2971b;
        try {
            ph.h.d(this.f2970a.minusKey(f.a.f28767a), new a(this.f2972c, mVar, this.f2973d, null));
        } catch (Throwable th2) {
            mVar.cancel(th2);
        }
    }
}
