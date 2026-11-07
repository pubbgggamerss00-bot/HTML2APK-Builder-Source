package c2;

import androidx.compose.ui.d;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.yalantis.ucrop.view.CropImageView;
import j2.k5;
import java.util.ArrayList;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import ph.l2;
import v.w1;

/* loaded from: classes.dex */
public final class y0 extends d.c implements u0, j0, f3.d {
    public long A;

    /* renamed from: q, reason: collision with root package name */
    public Object f4712q;

    /* renamed from: r, reason: collision with root package name */
    public Object f4713r;

    /* renamed from: s, reason: collision with root package name */
    public PointerInputEventHandler f4714s;

    /* renamed from: t, reason: collision with root package name */
    public l2 f4715t;

    /* renamed from: v, reason: collision with root package name */
    public r f4716v = s0.f4692a;

    /* renamed from: w, reason: collision with root package name */
    public final z0.b<a<?>> f4717w;

    /* renamed from: x, reason: collision with root package name */
    public final z0.b f4718x;

    /* renamed from: y, reason: collision with root package name */
    public final z0.b<a<?>> f4719y;

    /* renamed from: z, reason: collision with root package name */
    public r f4720z;

    public final class a<R> implements c2.c, f3.d, tg.e<R> {

        /* renamed from: a, reason: collision with root package name */
        public final ph.m f4721a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ y0 f4722b;

        /* renamed from: c, reason: collision with root package name */
        public ph.m f4723c;

        /* renamed from: d, reason: collision with root package name */
        public t f4724d = t.f4695b;

        /* renamed from: e, reason: collision with root package name */
        public final tg.i f4725e = tg.i.f28768a;

        public a(ph.m mVar) {
            this.f4721a = mVar;
            this.f4722b = y0.this;
        }

        @Override // c2.c
        public final Object C1(t tVar, vg.a aVar) throws Throwable {
            ph.m mVar = new ph.m(1, ah.p.c(aVar));
            mVar.p();
            this.f4724d = tVar;
            this.f4723c = mVar;
            Object objO = mVar.o();
            ug.a aVar2 = ug.a.f29706a;
            return objO;
        }

        @Override // f3.d
        public final long E(long j10) {
            return this.f4722b.E(j10);
        }

        @Override // f3.d
        public final float G0() {
            return this.f4722b.G0();
        }

        @Override // c2.c
        public final r M() {
            return y0.this.f4716v;
        }

        @Override // f3.d
        public final float N0(float f10) {
            return this.f4722b.getDensity() * f10;
        }

        @Override // c2.c
        public final long R0() {
            y0 y0Var = y0.this;
            y0Var.getClass();
            long jE = y0Var.E(i2.k.f(y0Var).D.d());
            long j10 = y0Var.A;
            float fMax = Math.max(CropImageView.DEFAULT_ASPECT_RATIO, Float.intBitsToFloat((int) (jE >> 32)) - ((int) (j10 >> 32))) / 2.0f;
            float fMax2 = Math.max(CropImageView.DEFAULT_ASPECT_RATIO, Float.intBitsToFloat((int) (jE & BodyPartID.bodyIdMax)) - ((int) (j10 & BodyPartID.bodyIdMax))) / 2.0f;
            return (Float.floatToRawIntBits(fMax) << 32) | (Float.floatToRawIntBits(fMax2) & BodyPartID.bodyIdMax);
        }

        @Override // f3.d
        public final int T0(long j10) {
            return this.f4722b.T0(j10);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // c2.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object Z(long j10, w1 w1Var, tg.e eVar) {
            x0 x0Var;
            if (eVar instanceof x0) {
                x0Var = (x0) eVar;
                int i10 = x0Var.f4711c;
                if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                    x0Var.f4711c = i10 - PKIFailureInfo.systemUnavail;
                } else {
                    x0Var = new x0(this, (vg.a) eVar);
                }
            }
            Object obj = x0Var.f4709a;
            ug.a aVar = ug.a.f29706a;
            int i11 = x0Var.f4711c;
            try {
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pg.q.b(obj);
                    return obj;
                }
                pg.q.b(obj);
                x0Var.f4711c = 1;
                Object objY1 = y1(j10, w1Var, x0Var);
                return objY1 == aVar ? aVar : objY1;
            } catch (v unused) {
                return null;
            }
        }

        @Override // c2.c
        public final long a() {
            return y0.this.A;
        }

        @Override // f3.d
        public final int b1(float f10) {
            return this.f4722b.b1(f10);
        }

        @Override // tg.e
        public final tg.h getContext() {
            return this.f4725e;
        }

        @Override // f3.d
        public final float getDensity() {
            return this.f4722b.getDensity();
        }

        @Override // c2.c
        public final k5 getViewConfiguration() {
            y0 y0Var = y0.this;
            y0Var.getClass();
            return i2.k.f(y0Var).D;
        }

        @Override // f3.d
        public final long o(float f10) {
            return this.f4722b.o(f10);
        }

        @Override // f3.d
        public final long p(long j10) {
            return this.f4722b.p(j10);
        }

        @Override // f3.d
        public final float q(long j10) {
            return this.f4722b.q(j10);
        }

        @Override // f3.d
        public final float r1(long j10) {
            return this.f4722b.r1(j10);
        }

        @Override // tg.e
        public final void resumeWith(Object obj) {
            y0 y0Var = y0.this;
            synchronized (y0Var.f4718x) {
                y0Var.f4717w.j(this);
                pg.f0 f0Var = pg.f0.f21461a;
            }
            this.f4721a.resumeWith(obj);
        }

        @Override // f3.d
        public final long t(float f10) {
            return this.f4722b.t(f10);
        }

        @Override // f3.d
        public final float u(int i10) {
            return this.f4722b.u(i10);
        }

        @Override // f3.d
        public final float v(float f10) {
            return f10 / this.f4722b.getDensity();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r7v0, types: [long] */
        /* JADX WARN: Type inference failed for: r7v1, types: [ph.s1] */
        /* JADX WARN: Type inference failed for: r7v4, types: [ph.s1] */
        /* JADX WARN: Type inference failed for: r7v7 */
        /* JADX WARN: Type inference failed for: r7v8 */
        @Override // c2.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object y1(long j10, eh.p pVar, vg.c cVar) {
            v0 v0Var;
            ph.m mVar;
            if (cVar instanceof v0) {
                v0Var = (v0) cVar;
                int i10 = v0Var.f4702d;
                if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                    v0Var.f4702d = i10 - PKIFailureInfo.systemUnavail;
                } else {
                    v0Var = new v0(this, cVar);
                }
            }
            Object objInvoke = v0Var.f4700b;
            ug.a aVar = ug.a.f29706a;
            int i11 = v0Var.f4702d;
            try {
                if (i11 == 0) {
                    pg.q.b(objInvoke);
                    if (j10 <= 0 && (mVar = this.f4723c) != null) {
                        mVar.resumeWith(pg.q.a(new v(j10)));
                    }
                    l2 l2VarC = ph.h.c(y0.this.H1(), null, null, new w0(j10, this, null), 3);
                    v0Var.f4699a = l2VarC;
                    v0Var.f4702d = 1;
                    objInvoke = pVar.invoke(this, v0Var);
                    j10 = l2VarC;
                    if (objInvoke == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    l2 l2Var = v0Var.f4699a;
                    pg.q.b(objInvoke);
                    j10 = l2Var;
                }
                return objInvoke;
            } finally {
                j10.cancel(d.f4612a);
            }
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements eh.l<Throwable, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a<R> f4727a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a<R> aVar) {
            super(1);
            this.f4727a = aVar;
        }

        @Override // eh.l
        public final pg.f0 invoke(Throwable th2) {
            Throwable th3 = th2;
            a<R> aVar = this.f4727a;
            ph.m mVar = aVar.f4723c;
            if (mVar != null) {
                mVar.cancel(th3);
            }
            aVar.f4723c = null;
            return pg.f0.f21461a;
        }
    }

    @vg.e(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$onPointerEvent$1", f = "SuspendingPointerInputFilter.kt", l = {717, 719}, m = "invokeSuspend")
    public static final class c extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f4728a;

        public c(tg.e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return y0.this.new c(eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f4728a;
            if (i10 == 0) {
                pg.q.b(obj);
                y0 y0Var = y0.this;
                PointerInputEventHandler pointerInputEventHandler = y0Var.f4714s;
                this.f4728a = 2;
                if (pointerInputEventHandler.invoke(y0Var, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1 && i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
            }
            return pg.f0.f21461a;
        }
    }

    public y0(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler) {
        this.f4712q = obj;
        this.f4713r = obj2;
        this.f4714s = pointerInputEventHandler;
        z0.b<a<?>> bVar = new z0.b<>(new a[16]);
        this.f4717w = bVar;
        this.f4718x = bVar;
        this.f4719y = new z0.b<>(new a[16]);
        this.A = 0L;
    }

    @Override // c2.u0
    public final void F1() {
        l2 l2Var = this.f4715t;
        if (l2Var != null) {
            l2Var.n(new i0("Pointer input was reset"));
            this.f4715t = null;
        }
    }

    @Override // f3.d
    public final float G0() {
        return i2.k.f(this).B.G0();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // i2.i2
    public final void J(r rVar, t tVar, long j10) {
        this.A = j10;
        if (tVar == t.f4694a) {
            this.f4716v = rVar;
        }
        if (this.f4715t == null) {
            this.f4715t = ph.h.c(H1(), null, ph.k0.f21556d, new c(null), 1);
        }
        T1(rVar, tVar);
        ?? r52 = rVar.f4687a;
        int size = r52.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                rVar = null;
                break;
            } else if (!s.c((b0) r52.get(i10))) {
                break;
            } else {
                i10++;
            }
        }
        this.f4720z = rVar;
    }

    @Override // androidx.compose.ui.d.c
    public final void M1() {
        F1();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x003d A[Catch: all -> 0x003b, TryCatch #1 {all -> 0x003b, blocks: (B:6:0x000d, B:13:0x001b, B:16:0x0027, B:18:0x002f, B:20:0x0033, B:21:0x0038, B:24:0x003d, B:26:0x0046, B:28:0x004e, B:30:0x0052), top: B:41:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T1(r rVar, t tVar) {
        ph.m mVar;
        ph.m mVar2;
        synchronized (this.f4718x) {
            z0.b<a<?>> bVar = this.f4719y;
            bVar.d(bVar.f34702c, this.f4717w);
        }
        try {
            int iOrdinal = tVar.ordinal();
            if (iOrdinal == 0) {
                z0.b<a<?>> bVar2 = this.f4719y;
                a<?>[] aVarArr = bVar2.f34700a;
                int i10 = bVar2.f34702c;
                for (int i11 = 0; i11 < i10; i11++) {
                    a<?> aVar = aVarArr[i11];
                    if (tVar == aVar.f4724d && (mVar = aVar.f4723c) != null) {
                        aVar.f4723c = null;
                        mVar.resumeWith(rVar);
                    }
                }
            } else if (iOrdinal == 1) {
                z0.b<a<?>> bVar3 = this.f4719y;
                int i12 = bVar3.f34702c - 1;
                a<?>[] aVarArr2 = bVar3.f34700a;
                if (i12 < aVarArr2.length) {
                    while (i12 >= 0) {
                        a<?> aVar2 = aVarArr2[i12];
                        if (tVar == aVar2.f4724d && (mVar2 = aVar2.f4723c) != null) {
                            aVar2.f4723c = null;
                            mVar2.resumeWith(rVar);
                        }
                        i12--;
                    }
                }
            } else if (iOrdinal != 2) {
            }
        } finally {
            this.f4719y.g();
        }
    }

    @Override // c2.j0
    public final <R> Object U0(eh.p<? super c2.c, ? super tg.e<? super R>, ? extends Object> pVar, tg.e<? super R> eVar) {
        ph.m mVar = new ph.m(1, ah.p.c(eVar));
        mVar.p();
        a aVar = new a(mVar);
        synchronized (this.f4718x) {
            this.f4717w.b(aVar);
            new tg.j(ah.p.c(ah.p.b(pVar, aVar, aVar)), ug.a.f29706a).resumeWith(pg.f0.f21461a);
        }
        mVar.s(new b(aVar));
        return mVar.o();
    }

    @Override // f3.d
    public final float getDensity() {
        return i2.k.f(this).B.getDensity();
    }

    @Override // c2.j0
    public final k5 getViewConfiguration() {
        return i2.k.f(this).D;
    }

    @Override // i2.i2
    public final void q1() {
        F1();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // i2.i2
    public final void r0() {
        r rVar = this.f4720z;
        if (rVar == null) {
            return;
        }
        ?? r12 = rVar.f4687a;
        int size = r12.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((b0) r12.get(i10)).f4596d) {
                ArrayList arrayList = new ArrayList(r12.size());
                int size2 = r12.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    b0 b0Var = (b0) r12.get(i11);
                    long j10 = b0Var.f4593a;
                    long j11 = b0Var.f4595c;
                    long j12 = b0Var.f4594b;
                    float f10 = b0Var.f4597e;
                    boolean z10 = b0Var.f4596d;
                    arrayList.add(new b0(j10, j12, j11, false, f10, j12, j11, z10, z10, b0Var.f4601i, 0L));
                }
                r rVar2 = new r(arrayList, null);
                this.f4716v = rVar2;
                T1(rVar2, t.f4694a);
                T1(rVar2, t.f4695b);
                T1(rVar2, t.f4696c);
                this.f4720z = null;
                return;
            }
        }
    }

    @Override // i2.j, i2.i2
    public final void x() {
        F1();
    }
}
