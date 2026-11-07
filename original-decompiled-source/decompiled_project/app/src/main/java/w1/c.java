package w1;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.s;
import pg.f0;
import q1.b1;
import q1.i2;
import q1.j0;
import q1.l0;
import q1.r1;
import q1.u0;
import qg.z;
import s1.a;
import t.r;

/* loaded from: classes.dex */
public final class c extends j {

    /* renamed from: b, reason: collision with root package name */
    public float[] f31048b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f31049c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public boolean f31050d = true;

    /* renamed from: e, reason: collision with root package name */
    public long f31051e = b1.f21654h;

    /* renamed from: f, reason: collision with root package name */
    public List<? extends g> f31052f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f31053g;

    /* renamed from: h, reason: collision with root package name */
    public j0 f31054h;

    /* renamed from: i, reason: collision with root package name */
    public eh.l<? super j, f0> f31055i;

    /* renamed from: j, reason: collision with root package name */
    public final a f31056j;

    /* renamed from: k, reason: collision with root package name */
    public String f31057k;

    /* renamed from: l, reason: collision with root package name */
    public float f31058l;

    /* renamed from: m, reason: collision with root package name */
    public float f31059m;

    /* renamed from: n, reason: collision with root package name */
    public float f31060n;

    /* renamed from: o, reason: collision with root package name */
    public float f31061o;

    /* renamed from: p, reason: collision with root package name */
    public float f31062p;

    /* renamed from: q, reason: collision with root package name */
    public float f31063q;

    /* renamed from: r, reason: collision with root package name */
    public float f31064r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f31065s;

    public static final class a extends s implements eh.l<j, f0> {
        public a() {
            super(1);
        }

        @Override // eh.l
        public final f0 invoke(j jVar) {
            j jVar2 = jVar;
            c cVar = c.this;
            cVar.g(jVar2);
            eh.l<? super j, f0> lVar = cVar.f31055i;
            if (lVar != null) {
                lVar.invoke(jVar2);
            }
            return f0.f21461a;
        }
    }

    public c() {
        int i10 = m.f31210a;
        this.f31052f = z.f22752a;
        this.f31053g = true;
        this.f31056j = new a();
        this.f31057k = "";
        this.f31061o = 1.0f;
        this.f31062p = 1.0f;
        this.f31065s = true;
    }

    @Override // w1.j
    public final void a(s1.e eVar) {
        if (this.f31065s) {
            float[] fArrA = this.f31048b;
            if (fArrA == null) {
                fArrA = r1.a();
                this.f31048b = fArrA;
            } else {
                r1.d(fArrA);
            }
            r1.f(fArrA, this.f31063q + this.f31059m, this.f31064r + this.f31060n);
            float f10 = this.f31058l;
            if (fArrA.length >= 16) {
                double d10 = f10 * 0.017453292519943295d;
                float fSin = (float) Math.sin(d10);
                float fCos = (float) Math.cos(d10);
                float f11 = fArrA[0];
                float f12 = fArrA[4];
                float f13 = (fSin * f12) + (fCos * f11);
                float f14 = -fSin;
                float f15 = (f12 * fCos) + (f11 * f14);
                float f16 = fArrA[1];
                float f17 = fArrA[5];
                float f18 = (fSin * f17) + (fCos * f16);
                float f19 = (f17 * fCos) + (f16 * f14);
                float f20 = fArrA[2];
                float f21 = fArrA[6];
                float f22 = (fSin * f21) + (fCos * f20);
                float f23 = (f21 * fCos) + (f20 * f14);
                float f24 = fArrA[3];
                float f25 = fArrA[7];
                fArrA[0] = f13;
                fArrA[1] = f18;
                fArrA[2] = f22;
                fArrA[3] = (fSin * f25) + (fCos * f24);
                fArrA[4] = f15;
                fArrA[5] = f19;
                fArrA[6] = f23;
                fArrA[7] = (fCos * f25) + (f14 * f24);
            }
            float f26 = this.f31061o;
            float f27 = this.f31062p;
            if (fArrA.length >= 16) {
                fArrA[0] = fArrA[0] * f26;
                fArrA[1] = fArrA[1] * f26;
                fArrA[2] = fArrA[2] * f26;
                fArrA[3] = fArrA[3] * f26;
                fArrA[4] = fArrA[4] * f27;
                fArrA[5] = fArrA[5] * f27;
                fArrA[6] = fArrA[6] * f27;
                fArrA[7] = fArrA[7] * f27;
                fArrA[8] = fArrA[8] * 1.0f;
                fArrA[9] = fArrA[9] * 1.0f;
                fArrA[10] = fArrA[10] * 1.0f;
                fArrA[11] = fArrA[11] * 1.0f;
            }
            r1.f(fArrA, -this.f31059m, -this.f31060n);
            this.f31065s = false;
        }
        if (this.f31053g) {
            if (!this.f31052f.isEmpty()) {
                j0 j0VarA = this.f31054h;
                if (j0VarA == null) {
                    j0VarA = l0.a();
                    this.f31054h = j0VarA;
                }
                i.b(this.f31052f, j0VarA);
            }
            this.f31053g = false;
        }
        a.b bVarQ0 = eVar.Q0();
        long jD = bVarQ0.d();
        bVarQ0.a().d();
        try {
            s1.b bVar = bVarQ0.f24180a;
            float[] fArr = this.f31048b;
            if (fArr != null) {
                bVar.f24183a.a().g(fArr);
            }
            j0 j0Var = this.f31054h;
            if (!this.f31052f.isEmpty() && j0Var != null) {
                bVar.a(j0Var);
            }
            ArrayList arrayList = this.f31049c;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((j) arrayList.get(i10)).a(eVar);
            }
            r.a(bVarQ0, jD);
        } catch (Throwable th2) {
            r.a(bVarQ0, jD);
            throw th2;
        }
    }

    @Override // w1.j
    public final eh.l<j, f0> b() {
        return this.f31055i;
    }

    @Override // w1.j
    public final void d(a aVar) {
        this.f31055i = aVar;
    }

    public final void e(int i10, j jVar) {
        ArrayList arrayList = this.f31049c;
        if (i10 < arrayList.size()) {
            arrayList.set(i10, jVar);
        } else {
            arrayList.add(jVar);
        }
        g(jVar);
        jVar.d(this.f31056j);
        c();
    }

    public final void f(long j10) {
        if (this.f31050d && j10 != 16) {
            long j11 = this.f31051e;
            if (j11 == 16) {
                this.f31051e = j10;
                return;
            }
            int i10 = m.f31210a;
            if (b1.i(j11) == b1.i(j10) && b1.h(j11) == b1.h(j10) && b1.f(j11) == b1.f(j10)) {
                return;
            }
            this.f31050d = false;
            this.f31051e = b1.f21654h;
        }
    }

    public final void g(j jVar) {
        if (!(jVar instanceof f)) {
            if (jVar instanceof c) {
                c cVar = (c) jVar;
                if (cVar.f31050d && this.f31050d) {
                    f(cVar.f31051e);
                    return;
                } else {
                    this.f31050d = false;
                    this.f31051e = b1.f21654h;
                    return;
                }
            }
            return;
        }
        f fVar = (f) jVar;
        u0 u0Var = fVar.f31101b;
        if (this.f31050d && u0Var != null) {
            if (u0Var instanceof i2) {
                f(((i2) u0Var).f21711a);
            } else {
                this.f31050d = false;
                this.f31051e = b1.f21654h;
            }
        }
        u0 u0Var2 = fVar.f31106g;
        if (this.f31050d && u0Var2 != null) {
            if (u0Var2 instanceof i2) {
                f(((i2) u0Var2).f21711a);
            } else {
                this.f31050d = false;
                this.f31051e = b1.f21654h;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.f31057k);
        ArrayList arrayList = this.f31049c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            j jVar = (j) arrayList.get(i10);
            sb.append("\t");
            sb.append(jVar.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
