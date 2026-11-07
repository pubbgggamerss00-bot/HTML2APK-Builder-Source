package v;

@vg.e(c = "androidx.compose.foundation.gestures.ScrollingLogic$onScrollStopped$performFling$1", f = "Scrollable.kt", l = {748, 751, 754}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class q1 extends vg.i implements eh.p<f3.w, tg.e<? super f3.w>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public long f30033a;

    /* renamed from: b, reason: collision with root package name */
    public int f30034b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ long f30035c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s1 f30036d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(s1 s1Var, tg.e<? super q1> eVar) {
        super(2, eVar);
        this.f30036d = s1Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        q1 q1Var = new q1(this.f30036d, eVar);
        q1Var.f30035c = ((f3.w) obj).f8837a;
        return q1Var;
    }

    @Override // eh.p
    public final Object invoke(f3.w wVar, tg.e<? super f3.w> eVar) {
        long j10 = wVar.f8837a;
        q1 q1Var = new q1(this.f30036d, eVar);
        q1Var.f30035c = j10;
        return q1Var.invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j10;
        long j11;
        long j12;
        long j13;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f30034b;
        s1 s1Var = this.f30036d;
        if (i10 == 0) {
            pg.q.b(obj);
            j10 = this.f30035c;
            b2.b bVar = s1Var.f30072f;
            this.f30035c = j10;
            this.f30034b = 1;
            obj = bVar.b(j10, this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j13 = this.f30033a;
                j12 = this.f30035c;
                pg.q.b(obj);
                return new f3.w(f3.w.d(j12, f3.w.d(j13, ((f3.w) obj).f8837a)));
            }
            j11 = this.f30033a;
            j10 = this.f30035c;
            pg.q.b(obj);
            long j14 = ((f3.w) obj).f8837a;
            b2.b bVar2 = s1Var.f30072f;
            long jD = f3.w.d(j11, j14);
            this.f30035c = j10;
            this.f30033a = j14;
            this.f30034b = 3;
            obj = bVar2.a(jD, j14, this);
            if (obj != aVar) {
                j12 = j10;
                j13 = j14;
                return new f3.w(f3.w.d(j12, f3.w.d(j13, ((f3.w) obj).f8837a)));
            }
            return aVar;
        }
        j10 = this.f30035c;
        pg.q.b(obj);
        long jD2 = f3.w.d(j10, ((f3.w) obj).f8837a);
        this.f30035c = j10;
        this.f30033a = jD2;
        this.f30034b = 2;
        obj = s1Var.b(jD2, this);
        if (obj != aVar) {
            j11 = jD2;
            long j142 = ((f3.w) obj).f8837a;
            b2.b bVar22 = s1Var.f30072f;
            long jD3 = f3.w.d(j11, j142);
            this.f30035c = j10;
            this.f30033a = j142;
            this.f30034b = 3;
            obj = bVar22.a(jD3, j142, this);
            if (obj != aVar) {
            }
        }
        return aVar;
    }
}
