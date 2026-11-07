package v;

import com.google.protobuf.DescriptorProtos;
import com.yalantis.ucrop.view.CropImageView;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import ph.l2;
import ph.m2;
import ph.u2;

/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final s1 f29855a;

    /* renamed from: b, reason: collision with root package name */
    public final v.a f29856b;

    /* renamed from: c, reason: collision with root package name */
    public final g1 f29857c;

    /* renamed from: d, reason: collision with root package name */
    public f3.d f29858d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f29860f;

    /* renamed from: g, reason: collision with root package name */
    public l2 f29861g;

    /* renamed from: e, reason: collision with root package name */
    public final rh.c f29859e = rh.k.a(Integer.MAX_VALUE, 6, null);

    /* renamed from: h, reason: collision with root package name */
    public final r0 f29862h = new r0();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f29863a;

        /* renamed from: b, reason: collision with root package name */
        public final long f29864b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f29865c;

        public a(long j10, long j11, boolean z10) {
            this.f29863a = j10;
            this.f29864b = j11;
            this.f29865c = z10;
        }

        public final a a(a aVar) {
            return new a(p1.c.g(this.f29863a, aVar.f29863a), Math.max(this.f29864b, aVar.f29864b), this.f29865c);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p1.c.b(this.f29863a, aVar.f29863a) && this.f29864b == aVar.f29864b && this.f29865c == aVar.f29865c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f29865c) + r.e2.a(Long.hashCode(this.f29863a) * 31, 31, this.f29864b);
        }

        public final String toString() {
            return "MouseWheelScrollDelta(value=" + ((Object) p1.c.i(this.f29863a)) + ", timeMillis=" + this.f29864b + ", shouldApplyImmediately=" + this.f29865c + ')';
        }
    }

    public f0(s1 s1Var, v.a aVar, g1 g1Var, f3.d dVar) {
        this.f29855a = s1Var;
        this.f29856b = aVar;
        this.f29857c = g1Var;
        this.f29858d = dVar;
    }

    public static final float a(f0 f0Var, s0 s0Var, float f10) {
        s1 s1Var = f0Var.f29855a;
        return s1Var.g(s1Var.e(s0Var.a(s1Var.h(s1Var.d(f10)))));
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0129, code lost:
    
        if (pg.f0.f21461a == r10) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r0v13, types: [T, v.f0$a] */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, s.n] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(f0 f0Var, s1 s1Var, a aVar, float f10, float f11, vg.c cVar) {
        i0 i0Var;
        kotlin.jvm.internal.d0 d0Var;
        f0 f0Var2;
        float f12;
        s1 s1Var2;
        f0Var.getClass();
        if (cVar instanceof i0) {
            i0Var = (i0) cVar;
            int i10 = i0Var.f29921g;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                i0Var.f29921g = i10 - PKIFailureInfo.systemUnavail;
            } else {
                i0Var = new i0(f0Var, cVar);
            }
        }
        i0 i0Var2 = i0Var;
        Object obj = i0Var2.f29919e;
        ug.a aVar2 = ug.a.f29706a;
        int i11 = i0Var2.f29921g;
        if (i11 == 0) {
            pg.q.b(obj);
            kotlin.jvm.internal.g0 g0Var = new kotlin.jvm.internal.g0();
            g0Var.f16327a = aVar;
            f0Var.e(aVar);
            a aVarD = d(f0Var.f29859e);
            if (aVarD != null) {
                f0Var.e(aVarD);
                g0Var.f16327a = ((a) g0Var.f16327a).a(aVarD);
            }
            kotlin.jvm.internal.d0 d0Var2 = new kotlin.jvm.internal.d0();
            float fG = s1Var.g(s1Var.e(((a) g0Var.f16327a).f29863a));
            d0Var2.f16322a = fG;
            if (e0.a(fG)) {
                return pg.f0.f21461a;
            }
            kotlin.jvm.internal.g0 g0Var2 = new kotlin.jvm.internal.g0();
            g0Var2.f16327a = o1.j.a(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 30);
            j0 j0Var = new j0(d0Var2, g0Var2, g0Var, f10, f0Var, f11, s1Var, null);
            i0Var2.f29915a = f0Var;
            i0Var2.f29916b = s1Var;
            i0Var2.f29917c = d0Var2;
            i0Var2.f29918d = f11;
            i0Var2.f29921g = 1;
            if (f0Var.f(s1Var, j0Var, i0Var2) != aVar2) {
                d0Var = d0Var2;
                f0Var2 = f0Var;
                f12 = f11;
                s1Var2 = s1Var;
            }
            return aVar2;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
            return pg.f0.f21461a;
        }
        f12 = i0Var2.f29918d;
        d0Var = i0Var2.f29917c;
        s1Var2 = i0Var2.f29916b;
        f0Var2 = i0Var2.f29915a;
        pg.q.b(obj);
        r0 r0Var = f0Var2.f29862h;
        long jA = androidx.lifecycle.c1.a(r0Var.f30054a.b(Float.MAX_VALUE), r0Var.f30055b.b(Float.MAX_VALUE));
        if (jA == 0) {
            float fD = s1Var2.d(Math.signum(d0Var.f16322a)) * Math.min(Math.abs(d0Var.f16322a) / 100, f12) * DescriptorProtos.Edition.EDITION_2023_VALUE;
            if (fD == CropImageView.DEFAULT_ASPECT_RATIO) {
                jA = 0;
            } else {
                jA = s1Var2.f30070d == t0.f30084b ? androidx.lifecycle.c1.a(fD, CropImageView.DEFAULT_ASPECT_RATIO) : androidx.lifecycle.c1.a(CropImageView.DEFAULT_ASPECT_RATIO, fD);
            }
        }
        g1 g1Var = f0Var2.f29857c;
        i0Var2.f29915a = null;
        i0Var2.f29916b = null;
        i0Var2.f29917c = null;
        i0Var2.f29921g = 2;
        androidx.compose.foundation.gestures.j jVar = (androidx.compose.foundation.gestures.j) g1Var.f16308a;
        ph.h.c(jVar.D.c(), null, null, new h1(jVar, jA, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, s.n] */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, v.f0$a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(f0 f0Var, kotlin.jvm.internal.g0 g0Var, kotlin.jvm.internal.d0 d0Var, s1 s1Var, kotlin.jvm.internal.g0 g0Var2, long j10, vg.c cVar) {
        k0 k0Var;
        s1 s1Var2;
        kotlin.jvm.internal.g0 g0Var3;
        kotlin.jvm.internal.g0 g0Var4;
        kotlin.jvm.internal.d0 d0Var2;
        boolean z10;
        if (cVar instanceof k0) {
            k0Var = (k0) cVar;
            int i10 = k0Var.f29970g;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                k0Var.f29970g = i10 - PKIFailureInfo.systemUnavail;
            } else {
                k0Var = new k0(cVar);
            }
        }
        Object objC = k0Var.f29969f;
        ug.a aVar = ug.a.f29706a;
        int i11 = k0Var.f29970g;
        if (i11 == 0) {
            pg.q.b(objC);
            if (j10 < 0) {
                return Boolean.FALSE;
            }
            l0 l0Var = new l0(f0Var, null);
            k0Var.f29964a = f0Var;
            k0Var.f29965b = g0Var;
            k0Var.f29966c = d0Var;
            s1Var2 = s1Var;
            k0Var.f29967d = s1Var2;
            g0Var3 = g0Var2;
            k0Var.f29968e = g0Var3;
            k0Var.f29970g = 1;
            objC = u2.c(j10, l0Var, k0Var);
            if (objC == aVar) {
                return aVar;
            }
            g0Var4 = g0Var;
            d0Var2 = d0Var;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.jvm.internal.g0 g0Var5 = k0Var.f29968e;
            s1 s1Var3 = k0Var.f29967d;
            d0Var2 = k0Var.f29966c;
            g0Var4 = k0Var.f29965b;
            f0 f0Var2 = k0Var.f29964a;
            pg.q.b(objC);
            g0Var3 = g0Var5;
            s1Var2 = s1Var3;
            f0Var = f0Var2;
        }
        a aVar2 = (a) objC;
        if (aVar2 != null) {
            boolean z11 = ((a) g0Var4.f16327a).f29865c;
            long j11 = aVar2.f29863a;
            g0Var4.f16327a = new a(j11, aVar2.f29864b, z11);
            d0Var2.f16322a = s1Var2.g(s1Var2.e(j11));
            g0Var3.f16327a = o1.j.a(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 30);
            f0Var.e(aVar2);
            z10 = !e0.a(d0Var2.f16322a);
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    public static a d(rh.c cVar) {
        a aVar = null;
        lh.h hVarF = e1.d.f(new o0(new n0(cVar), null));
        while (hVarF.hasNext()) {
            a aVarA = (a) hVarF.next();
            if (aVar != null) {
                aVarA = aVar.a(aVarA);
            }
            aVar = aVarA;
        }
        return aVar;
    }

    public final void e(a aVar) {
        long j10 = aVar.f29864b;
        long j11 = aVar.f29863a;
        r0 r0Var = this.f29862h;
        r0Var.f30054a.a(Float.intBitsToFloat((int) (j11 >> 32)), j10);
        r0Var.f30055b.a(Float.intBitsToFloat((int) (j11 & BodyPartID.bodyIdMax)), j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(s1 s1Var, j0 j0Var, vg.c cVar) {
        p0 p0Var;
        f0 f0Var;
        if (cVar instanceof p0) {
            p0Var = (p0) cVar;
            int i10 = p0Var.f30027d;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                p0Var.f30027d = i10 - PKIFailureInfo.systemUnavail;
            } else {
                p0Var = new p0(this, cVar);
            }
        }
        Object obj = p0Var.f30025b;
        ug.a aVar = ug.a.f29706a;
        int i11 = p0Var.f30027d;
        if (i11 == 0) {
            pg.q.b(obj);
            this.f29860f = true;
            q0 q0Var = new q0(s1Var, j0Var, null);
            p0Var.f30024a = this;
            p0Var.f30027d = 1;
            m2 m2Var = new m2(p0Var, p0Var.getContext());
            if (d0.q1.b(m2Var, m2Var, q0Var) == aVar) {
                return aVar;
            }
            f0Var = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f0Var = p0Var.f30024a;
            pg.q.b(obj);
        }
        f0Var.f29860f = false;
        return pg.f0.f21461a;
    }
}
