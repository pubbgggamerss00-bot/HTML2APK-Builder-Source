package v;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class f1 implements b2.a {

    /* renamed from: a, reason: collision with root package name */
    public final s1 f29866a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f29867b;

    @vg.e(c = "androidx.compose.foundation.gestures.ScrollableNestedScrollConnection", f = "Scrollable.kt", l = {898, 901}, m = "onPostFling-RZ2iAVY")
    public static final class a extends vg.c {

        /* renamed from: a, reason: collision with root package name */
        public long f29868a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f29869b;

        /* renamed from: d, reason: collision with root package name */
        public int f29871d;

        public a(vg.c cVar) {
            super(cVar);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            this.f29869b = obj;
            this.f29871d |= PKIFailureInfo.systemUnavail;
            return f1.this.x1(0L, 0L, this);
        }
    }

    public f1(s1 s1Var, boolean z10) {
        this.f29866a = s1Var;
        this.f29867b = z10;
    }

    @Override // b2.a
    public final long n1(long j10, long j11, int i10) {
        if (!this.f29867b) {
            return 0L;
        }
        s1 s1Var = this.f29866a;
        if (s1Var.f30067a.a()) {
            return 0L;
        }
        return s1Var.h(s1Var.d(s1Var.f30067a.e(s1Var.d(s1Var.g(j11)))));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // b2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object x1(long j10, long j11, tg.e<? super f3.w> eVar) {
        a aVar;
        long jD;
        long j12;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i10 = aVar.f29871d;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f29871d = i10 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a((vg.c) eVar);
            }
        }
        Object objB = aVar.f29869b;
        ug.a aVar2 = ug.a.f29706a;
        int i11 = aVar.f29871d;
        if (i11 == 0) {
            pg.q.b(objB);
            jD = 0;
            if (this.f29867b) {
                s1 s1Var = this.f29866a;
                if (s1Var.f30074h) {
                    j12 = 0;
                    jD = f3.w.d(j11, j12);
                } else {
                    aVar.f29868a = j11;
                    aVar.f29871d = 1;
                    objB = s1Var.b(j11, aVar);
                    if (objB == aVar2) {
                        return aVar2;
                    }
                    j12 = ((f3.w) objB).f8837a;
                    jD = f3.w.d(j11, j12);
                }
            }
        } else if (i11 == 1) {
            j11 = aVar.f29868a;
            pg.q.b(objB);
            j12 = ((f3.w) objB).f8837a;
            jD = f3.w.d(j11, j12);
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j11 = aVar.f29868a;
            pg.q.b(objB);
            j12 = ((f3.w) objB).f8837a;
            jD = f3.w.d(j11, j12);
        }
        return new f3.w(jD);
    }
}
