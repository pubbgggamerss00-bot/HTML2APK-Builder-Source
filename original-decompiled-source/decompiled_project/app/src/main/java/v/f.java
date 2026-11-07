package v;

import androidx.compose.ui.d;
import com.yalantis.ucrop.view.CropImageView;
import f0.f;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import org.bouncycastle.asn1.cmc.BodyPartID;
import v.d;

/* loaded from: classes.dex */
public final class f extends d.c implements i2.a0, i2.h {
    public boolean A;

    /* renamed from: q, reason: collision with root package name */
    public t0 f29827q;

    /* renamed from: r, reason: collision with root package name */
    public final s1 f29828r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f29829s;

    /* renamed from: t, reason: collision with root package name */
    public d f29830t;

    /* renamed from: w, reason: collision with root package name */
    public g2.v f29832w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f29833x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f29834y;

    /* renamed from: v, reason: collision with root package name */
    public final c f29831v = new c();

    /* renamed from: z, reason: collision with root package name */
    public long f29835z = 0;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final f.a.C0092a f29836a;

        /* renamed from: b, reason: collision with root package name */
        public final ph.m f29837b;

        public a(f.a.C0092a c0092a, ph.m mVar) {
            this.f29836a = c0092a;
            this.f29837b = mVar;
        }

        public final String toString() {
            String strD;
            ph.m mVar = this.f29837b;
            ph.h0 h0Var = (ph.h0) mVar.f21567e.get(ph.h0.f21545c);
            String str = h0Var != null ? h0Var.f21546b : null;
            StringBuilder sb = new StringBuilder("Request@");
            int iHashCode = hashCode();
            g8.w.h(16);
            String string = Integer.toString(iHashCode, 16);
            kotlin.jvm.internal.r.d(string, "toString(...)");
            sb.append(string);
            if (str == null || (strD = i8.n.d("[", str, "](")) == null) {
                strD = "(";
            }
            sb.append(strD);
            sb.append("currentBounds()=");
            sb.append(this.f29836a.invoke());
            sb.append(", continuation=");
            sb.append(mVar);
            sb.append(')');
            return sb.toString();
        }
    }

    @vg.e(c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2", f = "ContentInViewNode.kt", l = {215}, m = "invokeSuspend")
    public static final class b extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f29838a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f29839b;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ k2 f29841d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ d f29842e;

        @vg.e(c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1", f = "ContentInViewNode.kt", l = {221}, m = "invokeSuspend")
        public static final class a extends vg.i implements eh.p<s0, tg.e<? super pg.f0>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f29843a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f29844b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ k2 f29845c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ f f29846d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ d f29847e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ ph.s1 f29848f;

            /* renamed from: v.f$b$a$a, reason: collision with other inner class name */
            public static final class C0305a extends kotlin.jvm.internal.s implements eh.l<Float, pg.f0> {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ f f29849a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ph.s1 f29850b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ s0 f29851c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0305a(f fVar, ph.s1 s1Var, s0 s0Var) {
                    super(1);
                    this.f29849a = fVar;
                    this.f29850b = s1Var;
                    this.f29851c = s0Var;
                }

                @Override // eh.l
                public final pg.f0 invoke(Float f10) {
                    float fFloatValue = f10.floatValue();
                    f fVar = this.f29849a;
                    float f11 = fVar.f29829s ? 1.0f : -1.0f;
                    s1 s1Var = fVar.f29828r;
                    float fG = s1Var.g(s1Var.e(this.f29851c.a(s1Var.e(s1Var.h(f11 * fFloatValue))))) * f11;
                    if (Math.abs(fG) < Math.abs(fFloatValue)) {
                        CancellationException cancellationException = new CancellationException("Scroll animation cancelled because scroll was not consumed (" + fG + " < " + fFloatValue + ')');
                        cancellationException.initCause(null);
                        this.f29850b.cancel(cancellationException);
                    }
                    return pg.f0.f21461a;
                }
            }

            /* renamed from: v.f$b$a$b, reason: collision with other inner class name */
            public static final class C0306b extends kotlin.jvm.internal.s implements eh.a<pg.f0> {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ f f29852a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ k2 f29853b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ d f29854c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0306b(f fVar, k2 k2Var, d dVar) {
                    super(0);
                    this.f29852a = fVar;
                    this.f29853b = k2Var;
                    this.f29854c = dVar;
                }

                @Override // eh.a
                public final pg.f0 invoke() {
                    f fVar = this.f29852a;
                    c cVar = fVar.f29831v;
                    while (true) {
                        z0.b<a> bVar = cVar.f29787a;
                        int i10 = bVar.f34702c;
                        if (i10 == 0) {
                            break;
                        }
                        if (i10 == 0) {
                            throw new NoSuchElementException("MutableVector is empty.");
                        }
                        p1.e eVar = (p1.e) bVar.f34700a[i10 - 1].f29836a.invoke();
                        if (!(eVar == null ? true : fVar.V1(eVar, fVar.f29835z))) {
                            break;
                        }
                        z0.b<a> bVar2 = cVar.f29787a;
                        bVar2.k(bVar2.f34702c - 1).f29837b.resumeWith(pg.f0.f21461a);
                    }
                    if (fVar.f29833x) {
                        p1.e eVarU1 = fVar.U1();
                        if (eVarU1 != null && fVar.V1(eVarU1, fVar.f29835z)) {
                            fVar.f29833x = false;
                        }
                    }
                    this.f29853b.f29979e = f.T1(fVar, this.f29854c);
                    return pg.f0.f21461a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(k2 k2Var, f fVar, d dVar, ph.s1 s1Var, tg.e<? super a> eVar) {
                super(2, eVar);
                this.f29845c = k2Var;
                this.f29846d = fVar;
                this.f29847e = dVar;
                this.f29848f = s1Var;
            }

            @Override // vg.a
            public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
                a aVar = new a(this.f29845c, this.f29846d, this.f29847e, this.f29848f, eVar);
                aVar.f29844b = obj;
                return aVar;
            }

            @Override // eh.p
            public final Object invoke(s0 s0Var, tg.e<? super pg.f0> eVar) {
                return ((a) create(s0Var, eVar)).invokeSuspend(pg.f0.f21461a);
            }

            @Override // vg.a
            public final Object invokeSuspend(Object obj) {
                ug.a aVar = ug.a.f29706a;
                int i10 = this.f29843a;
                if (i10 == 0) {
                    pg.q.b(obj);
                    s0 s0Var = (s0) this.f29844b;
                    f fVar = this.f29846d;
                    d dVar = this.f29847e;
                    float fT1 = f.T1(fVar, dVar);
                    k2 k2Var = this.f29845c;
                    k2Var.f29979e = fT1;
                    C0305a c0305a = new C0305a(fVar, this.f29848f, s0Var);
                    C0306b c0306b = new C0306b(fVar, k2Var, dVar);
                    this.f29843a = 1;
                    if (k2Var.a(c0305a, c0306b, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pg.q.b(obj);
                }
                return pg.f0.f21461a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(k2 k2Var, d dVar, tg.e<? super b> eVar) {
            super(2, eVar);
            this.f29841d = k2Var;
            this.f29842e = dVar;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            b bVar = f.this.new b(this.f29841d, this.f29842e, eVar);
            bVar.f29839b = obj;
            return bVar;
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            f fVar = f.this;
            c cVar = fVar.f29831v;
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f29838a;
            try {
                try {
                    if (i10 == 0) {
                        pg.q.b(obj);
                        ph.s1 s1VarF = ph.v1.f(((ph.i0) this.f29839b).getCoroutineContext());
                        fVar.A = true;
                        s1 s1Var = fVar.f29828r;
                        t.b1 b1Var = t.b1.f25167a;
                        a aVar2 = new a(this.f29841d, fVar, this.f29842e, s1VarF, null);
                        this.f29838a = 1;
                        if (s1Var.f(b1Var, aVar2, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        pg.q.b(obj);
                    }
                    cVar.b();
                    fVar.A = false;
                    cVar.a(null);
                    fVar.f29833x = false;
                    return pg.f0.f21461a;
                } catch (CancellationException e10) {
                    throw e10;
                }
            } catch (Throwable th2) {
                fVar.A = false;
                cVar.a(null);
                fVar.f29833x = false;
                throw th2;
            }
        }
    }

    public f(t0 t0Var, s1 s1Var, boolean z10, d dVar) {
        this.f29827q = t0Var;
        this.f29828r = s1Var;
        this.f29829s = z10;
        this.f29830t = dVar;
    }

    public static final float T1(f fVar, d dVar) {
        p1.e eVar;
        int iCompare;
        if (f3.p.b(fVar.f29835z, 0L)) {
            return CropImageView.DEFAULT_ASPECT_RATIO;
        }
        z0.b<a> bVar = fVar.f29831v.f29787a;
        int i10 = bVar.f34702c - 1;
        a[] aVarArr = bVar.f34700a;
        if (i10 < aVarArr.length) {
            eVar = null;
            while (true) {
                if (i10 < 0) {
                    break;
                }
                p1.e eVar2 = (p1.e) aVarArr[i10].f29836a.invoke();
                if (eVar2 != null) {
                    long jD = eVar2.d();
                    long jE = f3.q.e(fVar.f29835z);
                    int iOrdinal = fVar.f29827q.ordinal();
                    if (iOrdinal == 0) {
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jD & BodyPartID.bodyIdMax)), Float.intBitsToFloat((int) (jE & BodyPartID.bodyIdMax)));
                    } else {
                        if (iOrdinal != 1) {
                            throw new pg.l();
                        }
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jD >> 32)), Float.intBitsToFloat((int) (jE >> 32)));
                    }
                    if (iCompare <= 0) {
                        eVar = eVar2;
                    } else if (eVar == null) {
                        eVar = eVar2;
                    }
                }
                i10--;
            }
        } else {
            eVar = null;
        }
        if (eVar == null) {
            p1.e eVarU1 = fVar.f29833x ? fVar.U1() : null;
            if (eVarU1 == null) {
                return CropImageView.DEFAULT_ASPECT_RATIO;
            }
            eVar = eVarU1;
        }
        long jE2 = f3.q.e(fVar.f29835z);
        int iOrdinal2 = fVar.f29827q.ordinal();
        if (iOrdinal2 == 0) {
            float f10 = eVar.f21132b;
            return dVar.a(f10, eVar.f21134d - f10, Float.intBitsToFloat((int) (jE2 & BodyPartID.bodyIdMax)));
        }
        if (iOrdinal2 != 1) {
            throw new pg.l();
        }
        float f11 = eVar.f21131a;
        return dVar.a(f11, eVar.f21133c - f11, Float.intBitsToFloat((int) (jE2 >> 32)));
    }

    @Override // androidx.compose.ui.d.c
    public final boolean I1() {
        return false;
    }

    @Override // i2.a0
    public final void O(long j10) {
        int iF;
        p1.e eVarU1;
        long j11 = this.f29835z;
        this.f29835z = j10;
        int iOrdinal = this.f29827q.ordinal();
        if (iOrdinal == 0) {
            iF = kotlin.jvm.internal.r.f((int) (j10 & BodyPartID.bodyIdMax), (int) (BodyPartID.bodyIdMax & j11));
        } else {
            if (iOrdinal != 1) {
                throw new pg.l();
            }
            iF = kotlin.jvm.internal.r.f((int) (j10 >> 32), (int) (j11 >> 32));
        }
        if (iF >= 0 || this.A || this.f29833x || (eVarU1 = U1()) == null || !V1(eVarU1, j11)) {
            return;
        }
        this.f29834y = true;
    }

    public final p1.e U1() {
        if (this.f1157p) {
            i2.g1 g1VarE = i2.k.e(this);
            g2.v vVar = this.f29832w;
            if (vVar != null) {
                if (!vVar.m()) {
                    vVar = null;
                }
                if (vVar != null) {
                    return g1VarE.N(vVar, false);
                }
            }
        }
        return null;
    }

    public final boolean V1(p1.e eVar, long j10) {
        long jX1 = X1(eVar, j10);
        return Math.abs(Float.intBitsToFloat((int) (jX1 >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (jX1 & BodyPartID.bodyIdMax))) <= 0.5f;
    }

    public final void W1() {
        d dVar = this.f29830t;
        if (dVar == null) {
            dVar = (d) i2.i.a(this, e.f29814a);
        }
        if (this.A) {
            y.c.c("launchAnimation called when previous animation was running");
        }
        d.f29799a.getClass();
        ph.h.c(H1(), null, ph.k0.f21556d, new b(new k2(d.a.f29801b), dVar, null), 1);
    }

    public final long X1(p1.e eVar, long j10) {
        long jFloatToRawIntBits;
        long j11;
        long jE = f3.q.e(j10);
        int iOrdinal = this.f29827q.ordinal();
        if (iOrdinal == 0) {
            d dVar = this.f29830t;
            if (dVar == null) {
                dVar = (d) i2.i.a(this, e.f29814a);
            }
            float f10 = eVar.f21132b;
            float fA = dVar.a(f10, eVar.f21134d - f10, Float.intBitsToFloat((int) (jE & BodyPartID.bodyIdMax)));
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(CropImageView.DEFAULT_ASPECT_RATIO);
            jFloatToRawIntBits = Float.floatToRawIntBits(fA);
            j11 = jFloatToRawIntBits2 << 32;
        } else {
            if (iOrdinal != 1) {
                throw new pg.l();
            }
            d dVar2 = this.f29830t;
            if (dVar2 == null) {
                dVar2 = (d) i2.i.a(this, e.f29814a);
            }
            float f11 = eVar.f21131a;
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(dVar2.a(f11, eVar.f21133c - f11, Float.intBitsToFloat((int) (jE >> 32))));
            jFloatToRawIntBits = Float.floatToRawIntBits(CropImageView.DEFAULT_ASPECT_RATIO);
            j11 = jFloatToRawIntBits3 << 32;
        }
        return j11 | (jFloatToRawIntBits & BodyPartID.bodyIdMax);
    }
}
