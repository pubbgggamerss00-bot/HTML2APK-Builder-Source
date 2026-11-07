package m0;

import com.yalantis.ucrop.view.CropImageView;
import j2.a5;
import j2.b5;
import java.util.ArrayList;
import m0.z;
import org.bouncycastle.asn1.cmc.BodyPartID;
import t2.b;

/* loaded from: classes.dex */
public final class r1 {

    /* renamed from: a, reason: collision with root package name */
    public final l2 f17469a;

    /* renamed from: e, reason: collision with root package name */
    public y1.a f17473e;

    /* renamed from: f, reason: collision with root package name */
    public eh.l<? super t2.b, pg.f0> f17474f;

    /* renamed from: g, reason: collision with root package name */
    public a5 f17475g;

    /* renamed from: j, reason: collision with root package name */
    public p1.c f17478j;

    /* renamed from: k, reason: collision with root package name */
    public g2.v f17479k;

    /* renamed from: r, reason: collision with root package name */
    public i1 f17486r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f17487s;

    /* renamed from: b, reason: collision with root package name */
    public final x0.x1 f17470b = bg.b.h(null);

    /* renamed from: c, reason: collision with root package name */
    public final x0.x1 f17471c = bg.b.h(Boolean.TRUE);

    /* renamed from: d, reason: collision with root package name */
    public kotlin.jvm.internal.s f17472d = new h();

    /* renamed from: h, reason: collision with root package name */
    public final o1.c0 f17476h = new o1.c0();

    /* renamed from: i, reason: collision with root package name */
    public final x0.x1 f17477i = bg.b.h(Boolean.FALSE);

    /* renamed from: l, reason: collision with root package name */
    public final x0.x1 f17480l = bg.b.h(new p1.c(0));

    /* renamed from: m, reason: collision with root package name */
    public final x0.x1 f17481m = bg.b.h(new p1.c(0));

    /* renamed from: n, reason: collision with root package name */
    public final x0.x1 f17482n = bg.b.h(null);

    /* renamed from: o, reason: collision with root package name */
    public final x0.x1 f17483o = bg.b.h(null);

    /* renamed from: p, reason: collision with root package name */
    public final x0.x1 f17484p = bg.b.h(null);

    /* renamed from: q, reason: collision with root package name */
    public final x0.x1 f17485q = bg.b.h(null);

    public static final class a extends kotlin.jvm.internal.s implements eh.l<Long, pg.f0> {
        public a() {
            super(1);
        }

        @Override // eh.l
        public final pg.f0 invoke(Long l10) {
            long jLongValue = l10.longValue();
            r1 r1Var = r1.this;
            if (r1Var.f17469a.f().a(jLongValue)) {
                r1Var.o();
                r1Var.q();
            }
            return pg.f0.f21461a;
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements eh.r<Boolean, g2.v, p1.c, e0, pg.f0> {
        public b() {
            super(4);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0041  */
        @Override // eh.r
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final pg.f0 f(Boolean bool, g2.v vVar, p1.c cVar, e0 e0Var) {
            boolean zBooleanValue = bool.booleanValue();
            g2.v vVar2 = vVar;
            long jFloatToRawIntBits = cVar.f21129a;
            e0 e0Var2 = e0Var;
            long jA = vVar2.a();
            float fIntBitsToFloat = (int) (jA >> 32);
            float fIntBitsToFloat2 = (int) (jA & BodyPartID.bodyIdMax);
            int i10 = (int) (jFloatToRawIntBits >> 32);
            float fIntBitsToFloat3 = Float.intBitsToFloat(i10);
            if (CropImageView.DEFAULT_ASPECT_RATIO > fIntBitsToFloat3 || fIntBitsToFloat3 > fIntBitsToFloat) {
                if (Float.intBitsToFloat(i10) < CropImageView.DEFAULT_ASPECT_RATIO) {
                    fIntBitsToFloat = 0.0f;
                } else if (Float.intBitsToFloat(i10) <= fIntBitsToFloat) {
                    fIntBitsToFloat = Float.intBitsToFloat(i10);
                }
                int i11 = (int) (jFloatToRawIntBits & BodyPartID.bodyIdMax);
                if (Float.intBitsToFloat(i11) < CropImageView.DEFAULT_ASPECT_RATIO) {
                    fIntBitsToFloat2 = 0.0f;
                } else if (Float.intBitsToFloat(i11) <= fIntBitsToFloat2) {
                    fIntBitsToFloat2 = Float.intBitsToFloat(i11);
                }
                jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & BodyPartID.bodyIdMax);
            } else {
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jFloatToRawIntBits & BodyPartID.bodyIdMax));
                if (CropImageView.DEFAULT_ASPECT_RATIO > fIntBitsToFloat4 || fIntBitsToFloat4 > fIntBitsToFloat2) {
                }
            }
            r1 r1Var = r1.this;
            long jA2 = r1.a(r1Var, vVar2, jFloatToRawIntBits);
            if ((9223372034707292159L & jA2) != 9205357640488583168L) {
                r1Var.l(zBooleanValue);
                r1Var.f17486r = null;
                r1Var.p(jA2, 9205357640488583168L, false, e0Var2);
                o1.c0.b(r1Var.f17476h);
                r1Var.n(false);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class c extends kotlin.jvm.internal.s implements eh.p<Boolean, Long, pg.f0> {
        public c() {
            super(2);
        }

        /* JADX WARN: Type inference failed for: r1v8, types: [eh.l, kotlin.jvm.internal.s] */
        @Override // eh.p
        public final pg.f0 invoke(Boolean bool, Long l10) {
            y1.a aVar;
            long j10;
            boolean zBooleanValue = bool.booleanValue();
            long jLongValue = l10.longValue();
            r1 r1Var = r1.this;
            z zVarE = r1Var.e();
            p.c0 c0Var = p.o.f20698a;
            p.c0 c0Var2 = new p.c0();
            l2 l2Var = r1Var.f17469a;
            ArrayList arrayListJ = l2Var.j(r1Var.j());
            int size = arrayListJ.size();
            int i10 = 0;
            z zVar = null;
            while (i10 < size) {
                x xVar = (x) arrayListJ.get(i10);
                z zVarH = xVar.e() == jLongValue ? xVar.h() : null;
                if (zVarH != null) {
                    c0Var2.h(zVarH, xVar.e());
                }
                if (zVar == null) {
                    j10 = jLongValue;
                    zVar = zVarH;
                } else if (zVarH == null) {
                    j10 = jLongValue;
                } else {
                    z.a aVar2 = zVarH.f17594b;
                    boolean z10 = zVarH.f17595c;
                    boolean z11 = zVar.f17595c;
                    if (z11 || z10) {
                        j10 = jLongValue;
                        if (z10) {
                            aVar2 = zVarH.f17593a;
                        }
                        zVar = new z(aVar2, z11 ? zVar.f17594b : zVar.f17593a, true);
                    } else {
                        zVar = z.a(zVar, null, aVar2, false, 5);
                        j10 = jLongValue;
                    }
                }
                i10++;
                jLongValue = j10;
            }
            if (r1Var.g() && !kotlin.jvm.internal.r.a(zVar, zVarE) && (aVar = r1Var.f17473e) != null) {
                aVar.a(9);
            }
            if (!kotlin.jvm.internal.r.a(zVar, r1Var.e())) {
                l2Var.f17406k.setValue(c0Var2);
                r1Var.f17472d.invoke(zVar);
            }
            r1Var.l(zBooleanValue);
            o1.c0.b(r1Var.f17476h);
            r1Var.n(false);
            return pg.f0.f21461a;
        }
    }

    public static final class d extends kotlin.jvm.internal.s implements eh.t<Boolean, g2.v, p1.c, p1.c, Boolean, e0, Boolean> {
        public d() {
            super(6);
        }
    }

    public static final class e extends kotlin.jvm.internal.s implements eh.a<pg.f0> {
        public e() {
            super(0);
        }

        @Override // eh.a
        public final pg.f0 invoke() {
            r1 r1Var = r1.this;
            r1Var.n(true);
            r1Var.f17484p.setValue(null);
            r1Var.f17485q.setValue(null);
            return pg.f0.f21461a;
        }
    }

    public static final class f extends kotlin.jvm.internal.s implements eh.l<Long, pg.f0> {
        public f() {
            super(1);
        }

        @Override // eh.l
        public final pg.f0 invoke(Long l10) {
            long jLongValue = l10.longValue();
            r1 r1Var = r1.this;
            if (r1Var.f17469a.f().a(jLongValue)) {
                r1Var.i();
                r1Var.m(null);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class g extends kotlin.jvm.internal.s implements eh.l<Long, pg.f0> {
        public g() {
            super(1);
        }

        @Override // eh.l
        public final pg.f0 invoke(Long l10) {
            z.a aVar;
            z.a aVar2;
            long jLongValue = l10.longValue();
            r1 r1Var = r1.this;
            z zVarE = r1Var.e();
            if (zVarE != null && (aVar2 = zVarE.f17593a) != null && jLongValue == aVar2.f17598c) {
                r1Var.f17482n.setValue(null);
            }
            z zVarE2 = r1Var.e();
            if (zVarE2 != null && (aVar = zVarE2.f17594b) != null && jLongValue == aVar.f17598c) {
                r1Var.f17483o.setValue(null);
            }
            if (r1Var.f17469a.f().a(jLongValue)) {
                r1Var.q();
            }
            return pg.f0.f21461a;
        }
    }

    public static final class h extends kotlin.jvm.internal.s implements eh.l<z, pg.f0> {
        public h() {
            super(1);
        }

        @Override // eh.l
        public final pg.f0 invoke(z zVar) {
            r1.this.m(zVar);
            return pg.f0.f21461a;
        }
    }

    public /* synthetic */ class i extends kotlin.jvm.internal.p implements eh.a<pg.f0> {
        @Override // eh.a
        public final pg.f0 invoke() {
            r1 r1Var = (r1) this.receiver;
            r1Var.b();
            r1Var.i();
            return pg.f0.f21461a;
        }
    }

    public /* synthetic */ class j extends kotlin.jvm.internal.p implements eh.a<pg.f0> {
        @Override // eh.a
        public final pg.f0 invoke() {
            ((r1) this.receiver).k();
            return pg.f0.f21461a;
        }
    }

    public r1(l2 l2Var) {
        this.f17469a = l2Var;
        l2Var.f17400e = new a();
        l2Var.f17401f = new b();
        new c();
        l2Var.f17402g = new d();
        l2Var.f17403h = new e();
        l2Var.f17404i = new f();
        l2Var.f17405j = new g();
    }

    public static final long a(r1 r1Var, g2.v vVar, long j10) {
        g2.v vVar2 = r1Var.f17479k;
        if (vVar2 == null || !vVar2.m()) {
            return 9205357640488583168L;
        }
        return r1Var.j().L(vVar, j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        t2.b bVarE;
        eh.l<? super t2.b, pg.f0> lVar;
        if (e() != null) {
            l2 l2Var = this.f17469a;
            if (l2Var.f().f20681e == 0) {
                bVarE = null;
            } else {
                b.C0288b c0288b = new b.C0288b();
                ArrayList arrayListJ = l2Var.j(j());
                int size = arrayListJ.size();
                for (int i10 = 0; i10 < size; i10++) {
                    x xVar = (x) arrayListJ.get(i10);
                    z zVarB = l2Var.f().b(xVar.e());
                    if (zVarB != null) {
                        z.a aVar = zVarB.f17593a;
                        z.a aVar2 = zVarB.f17594b;
                        t2.b text = xVar.getText();
                        c0288b.c(zVarB.f17595c ? text.subSequence(aVar2.f17597b, aVar.f17597b) : text.subSequence(aVar.f17597b, aVar2.f17597b));
                    }
                }
                bVarE = c0288b.e();
            }
        }
        if (bVarE != null) {
            t2.b bVar = bVarE.f27761b.length() > 0 ? bVarE : null;
            if (bVar == null || (lVar = this.f17474f) == null) {
                return;
            }
            lVar.invoke(bVar);
        }
    }

    public final x c(z.a aVar) {
        return this.f17469a.f17398c.b(aVar.f17598c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final i0.u1 d() {
        return (i0.u1) this.f17484p.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final z e() {
        return (z) this.f17470b.getValue();
    }

    public final boolean f() {
        z zVarB;
        g2.v vVarJ = j();
        l2 l2Var = this.f17469a;
        ArrayList arrayListJ = l2Var.j(vVarJ);
        if (arrayListJ.isEmpty()) {
            return true;
        }
        int size = arrayListJ.size();
        for (int i10 = 0; i10 < size; i10++) {
            x xVar = (x) arrayListJ.get(i10);
            t2.b text = xVar.getText();
            if (text.f27761b.length() != 0 && ((zVarB = l2Var.f().b(xVar.e())) == null || Math.abs(zVarB.f17593a.f17597b - zVarB.f17594b.f17597b) != text.f27761b.length())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean g() {
        return ((Boolean) this.f17471c.getValue()).booleanValue();
    }

    public final boolean h() {
        z zVarE = e();
        if (zVarE != null) {
            z.a aVar = zVarE.f17594b;
            z.a aVar2 = zVarE.f17593a;
            if (!kotlin.jvm.internal.r.a(aVar2, aVar)) {
                if (aVar2.f17598c == aVar.f17598c) {
                    return true;
                }
                g2.v vVarJ = j();
                l2 l2Var = this.f17469a;
                ArrayList arrayListJ = l2Var.j(vVarJ);
                int size = arrayListJ.size();
                for (int i10 = 0; i10 < size; i10++) {
                    z zVarB = l2Var.f().b(((x) arrayListJ.get(i10)).e());
                    if (zVarB != null && zVarB.f17593a.f17597b != zVarB.f17594b.f17597b) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [eh.l, kotlin.jvm.internal.s] */
    public final void i() {
        y1.a aVar;
        p.c0 c0Var = p.o.f20698a;
        kotlin.jvm.internal.r.c(c0Var, "null cannot be cast to non-null type androidx.collection.LongObjectMap<V of androidx.collection.LongObjectMapKt.emptyLongObjectMap>");
        this.f17469a.f17406k.setValue(c0Var);
        n(false);
        if (e() != null) {
            this.f17472d.invoke(null);
            if (!g() || (aVar = this.f17473e) == null) {
                return;
            }
            aVar.a(9);
        }
    }

    public final g2.v j() {
        g2.v vVar = this.f17479k;
        if (vVar == null) {
            y.c.b("null coordinates");
            throw new pg.g();
        }
        if (!vVar.m()) {
            y.c.a("unattached coordinates");
        }
        return vVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [eh.l, kotlin.jvm.internal.s] */
    public final void k() {
        g2.v vVarJ = j();
        l2 l2Var = this.f17469a;
        ArrayList arrayListJ = l2Var.j(vVarJ);
        if (arrayListJ.isEmpty()) {
            return;
        }
        p.c0 c0Var = p.o.f20698a;
        p.c0 c0Var2 = new p.c0();
        int size = arrayListJ.size();
        z zVar = null;
        z zVar2 = null;
        for (int i10 = 0; i10 < size; i10++) {
            x xVar = (x) arrayListJ.get(i10);
            z zVarH = xVar.h();
            if (zVarH != null) {
                if (zVar == null) {
                    zVar = zVarH;
                }
                long jE = xVar.e();
                int iD = c0Var2.d(jE);
                Object[] objArr = c0Var2.f20679c;
                Object obj = objArr[iD];
                c0Var2.f20678b[iD] = jE;
                objArr[iD] = zVarH;
                zVar2 = zVarH;
            }
        }
        if (c0Var2.f20681e == 0) {
            return;
        }
        if (zVar != zVar2) {
            kotlin.jvm.internal.r.b(zVar);
            z.a aVar = zVar.f17593a;
            kotlin.jvm.internal.r.b(zVar2);
            zVar = new z(aVar, zVar2.f17594b, false);
        }
        l2Var.f17406k.setValue(c0Var2);
        this.f17472d.invoke(zVar);
        this.f17486r = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l(boolean z10) {
        x0.x1 x1Var = this.f17471c;
        if (((Boolean) x1Var.getValue()).booleanValue() != z10) {
            x1Var.setValue(Boolean.valueOf(z10));
            q();
        }
    }

    public final void m(z zVar) {
        this.f17470b.setValue(zVar);
        if (zVar != null) {
            o();
        }
    }

    public final void n(boolean z10) {
        this.f17487s = z10;
        q();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o() {
        long j10;
        p1.c cVar;
        z.a aVar;
        z.a aVar2;
        z zVarE = e();
        g2.v vVar = this.f17479k;
        p1.c cVar2 = null;
        x xVarC = (zVarE == null || (aVar2 = zVarE.f17593a) == null) ? null : c(aVar2);
        x xVarC2 = (zVarE == null || (aVar = zVarE.f17594b) == null) ? null : c(aVar);
        g2.v vVarI = xVarC != null ? xVarC.i() : null;
        g2.v vVarI2 = xVarC2 != null ? xVarC2.i() : null;
        x0.x1 x1Var = this.f17483o;
        x0.x1 x1Var2 = this.f17482n;
        if (zVarE == null || vVar == null || !vVar.m() || (vVarI == null && vVarI2 == null)) {
            x1Var2.setValue(null);
            x1Var.setValue(null);
            return;
        }
        p1.e eVarC = a2.c(vVar);
        if (vVarI != null) {
            j10 = 9205357640488583168L;
            long jK = xVarC.k(zVarE, true);
            if ((jK & 9223372034707292159L) != 9205357640488583168L) {
                long jL = vVar.L(vVarI, jK);
                cVar = new p1.c(jL);
                if (d() != i0.u1.f13616b && !a2.a(eVarC, jL)) {
                }
            }
            x1Var2.setValue(cVar);
            if (vVarI2 != null) {
                long jK2 = xVarC2.k(zVarE, false);
                if ((jK2 & 9223372034707292159L) != j10) {
                    long jL2 = vVar.L(vVarI2, jK2);
                    p1.c cVar3 = new p1.c(jL2);
                    if (d() == i0.u1.f13617c || a2.a(eVarC, jL2)) {
                        cVar2 = cVar3;
                    }
                }
            }
            x1Var.setValue(cVar2);
        }
        j10 = 9205357640488583168L;
        cVar = null;
        x1Var2.setValue(cVar);
        if (vVarI2 != null) {
        }
        x1Var.setValue(cVar2);
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [eh.l, kotlin.jvm.internal.s] */
    public final boolean p(long j10, long j11, boolean z10, e0 e0Var) {
        this.f17484p.setValue(z10 ? i0.u1.f13616b : i0.u1.f13617c);
        this.f17485q.setValue(new p1.c(j10));
        g2.v vVarJ = j();
        l2 l2Var = this.f17469a;
        ArrayList arrayListJ = l2Var.j(vVarJ);
        int i10 = p.m.f20675a;
        p.a0 a0Var = new p.a0(6);
        int size = arrayListJ.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            a0Var.e(i12, ((x) arrayListJ.get(i12)).e());
        }
        i1 r2Var = null;
        j1 j1Var = new j1(j10, j11, vVarJ, z10, (j11 & 9223372034707292159L) == 9205357640488583168L ? null : e(), new s1(a0Var));
        int size2 = arrayListJ.size();
        for (int i13 = 0; i13 < size2; i13++) {
            ((x) arrayListJ.get(i13)).c(j1Var);
        }
        int i14 = j1Var.f17374k + 1;
        ArrayList arrayList = j1Var.f17371h;
        int size3 = arrayList.size();
        if (size3 != 0) {
            if (size3 != 1) {
                int i15 = j1Var.f17372i;
                if (i15 == -1) {
                    i15 = i14;
                }
                int i16 = j1Var.f17373j;
                if (i16 == -1) {
                    i16 = i14;
                }
                r2Var = new t(j1Var.f17370g, arrayList, i15, i16, j1Var.f17367d, j1Var.f17368e);
            } else {
                y yVar = (y) qg.x.S(arrayList);
                int i17 = j1Var.f17372i;
                int i18 = i17 == -1 ? i14 : i17;
                int i19 = j1Var.f17373j;
                r2Var = new r2(j1Var.f17367d, i18, i19 == -1 ? i14 : i19, j1Var.f17368e, yVar);
            }
        }
        if (r2Var == null || !r2Var.f(this.f17486r)) {
            return false;
        }
        z zVarA = e0Var.a(r2Var);
        if (!kotlin.jvm.internal.r.a(zVarA, e())) {
            if (g()) {
                ArrayList arrayList2 = l2Var.f17397b;
                int size4 = arrayList2.size();
                while (true) {
                    if (i11 >= size4) {
                        break;
                    }
                    if (((x) arrayList2.get(i11)).getText().f27761b.length() > 0) {
                        y1.a aVar = this.f17473e;
                        if (aVar != null) {
                            aVar.a(9);
                        }
                    } else {
                        i11++;
                    }
                }
            }
            l2Var.f17406k.setValue(r2Var.j(zVarA));
            this.f17472d.invoke(zVarA);
        }
        this.f17486r = r2Var;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0028  */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q() {
        a5 a5Var;
        g2.v vVar;
        a5 a5Var2;
        p1.e eVar;
        int i10;
        int i11;
        ArrayList arrayList;
        a5 a5Var3;
        g2.v vVarI;
        int[] iArr;
        p1.e eVarB;
        if (((Boolean) this.f17477i.getValue()).booleanValue() && (a5Var = this.f17475g) != null) {
            if (!this.f17487s || !g()) {
                if (a5Var.getStatus() == b5.f14666a) {
                    a5Var.b();
                    return;
                }
                return;
            }
            if (e() != null && (vVar = this.f17479k) != null && vVar.m()) {
                g2.v vVarJ = j();
                l2 l2Var = this.f17469a;
                ArrayList arrayListJ = l2Var.j(vVarJ);
                ArrayList arrayList2 = new ArrayList(arrayListJ.size());
                int size = arrayListJ.size();
                for (int i12 = 0; i12 < size; i12++) {
                    x xVar = (x) arrayListJ.get(i12);
                    z zVarB = l2Var.f().b(xVar.e());
                    pg.n nVar = zVarB != null ? new pg.n(xVar, zVarB) : null;
                    if (nVar != null) {
                        arrayList2.add(nVar);
                    }
                }
                int size2 = arrayList2.size();
                int i13 = 1;
                ArrayList arrayListJ2 = arrayList2;
                arrayListJ2 = arrayList2;
                if (size2 != 0 && size2 != 1) {
                    arrayListJ2 = qg.p.j(qg.x.B(arrayList2), qg.x.J(arrayList2));
                }
                if (arrayListJ2.isEmpty()) {
                    a5Var2 = a5Var;
                } else {
                    boolean zIsEmpty = arrayListJ2.isEmpty();
                    p1.e eVar2 = a2.f17255a;
                    if (zIsEmpty) {
                        eVar = eVar2;
                        a5Var2 = a5Var;
                    } else {
                        int size3 = arrayListJ2.size();
                        int i14 = 0;
                        float fMin = Float.POSITIVE_INFINITY;
                        float fMin2 = Float.POSITIVE_INFINITY;
                        float fMax = Float.NEGATIVE_INFINITY;
                        float fMax2 = Float.NEGATIVE_INFINITY;
                        ArrayList arrayList3 = arrayListJ2;
                        while (i14 < size3) {
                            pg.n nVar2 = (pg.n) arrayList3.get(i14);
                            x xVar2 = (x) nVar2.f21469a;
                            z zVar = (z) nVar2.f21470b;
                            int i15 = zVar.f17593a.f17597b;
                            int i16 = zVar.f17594b.f17597b;
                            if (i15 == i16 || (vVarI = xVar2.i()) == null) {
                                i10 = size3;
                                i11 = i13;
                                arrayList = arrayList3;
                                a5Var3 = a5Var;
                            } else {
                                i11 = i13;
                                int iMin = Math.min(i15, i16);
                                int iMax = Math.max(i15, i16) - 1;
                                if (iMin == iMax) {
                                    iArr = new int[i11];
                                    iArr[0] = iMin;
                                } else {
                                    int[] iArr2 = new int[2];
                                    iArr2[0] = iMin;
                                    iArr2[i11] = iMax;
                                    iArr = iArr2;
                                }
                                int length = iArr.length;
                                i10 = size3;
                                arrayList = arrayList3;
                                int[] iArr3 = iArr;
                                int i17 = 0;
                                float fMin3 = Float.POSITIVE_INFINITY;
                                float fMin4 = Float.POSITIVE_INFINITY;
                                float fMax3 = Float.NEGATIVE_INFINITY;
                                float fMax4 = Float.NEGATIVE_INFINITY;
                                while (i17 < length) {
                                    int i18 = length;
                                    p1.e eVarD = xVar2.d(iArr3[i17]);
                                    fMin3 = Math.min(fMin3, eVarD.f21131a);
                                    fMin4 = Math.min(fMin4, eVarD.f21132b);
                                    fMax3 = Math.max(fMax3, eVarD.f21133c);
                                    fMax4 = Math.max(fMax4, eVarD.f21134d);
                                    i17++;
                                    length = i18;
                                    a5Var = a5Var;
                                }
                                a5Var3 = a5Var;
                                long jFloatToRawIntBits = (Float.floatToRawIntBits(fMin4) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fMin3) << 32);
                                long jFloatToRawIntBits2 = Float.floatToRawIntBits(fMax3);
                                long jFloatToRawIntBits3 = Float.floatToRawIntBits(fMax4) & BodyPartID.bodyIdMax;
                                long jL = vVar.L(vVarI, jFloatToRawIntBits);
                                long jL2 = vVar.L(vVarI, jFloatToRawIntBits3 | (jFloatToRawIntBits2 << 32));
                                fMin = Math.min(fMin, Float.intBitsToFloat((int) (jL >> 32)));
                                fMin2 = Math.min(fMin2, Float.intBitsToFloat((int) (jL & BodyPartID.bodyIdMax)));
                                fMax = Math.max(fMax, Float.intBitsToFloat((int) (jL2 >> 32)));
                                fMax2 = Math.max(fMax2, Float.intBitsToFloat((int) (jL2 & BodyPartID.bodyIdMax)));
                            }
                            i14++;
                            i13 = i11;
                            size3 = i10;
                            arrayList3 = arrayList;
                            a5Var = a5Var3;
                        }
                        a5Var2 = a5Var;
                        eVar = new p1.e(fMin, fMin2, fMax, fMax2);
                    }
                    if (!eVar.equals(eVar2)) {
                        p1.e eVarF = a2.c(vVar).f(eVar);
                        if (eVarF.f21133c - eVarF.f21131a >= CropImageView.DEFAULT_ASPECT_RATIO && eVarF.f21134d - eVarF.f21132b >= CropImageView.DEFAULT_ASPECT_RATIO) {
                            p1.e eVarJ = eVarF.j(vVar.Y(0L));
                            eVarB = p1.e.b(eVarJ, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, (h1.f17346b * 4) + eVarJ.f21134d, 7);
                        }
                    }
                }
                eVarB = null;
            }
            if (eVarB == null) {
                return;
            }
            a5Var2.c(eVarB, h() ? new i(0, this, r1.class, "toolbarCopy", "toolbarCopy()V", 0) : null, null, null, f() ? null : new j(0, this, r1.class, "selectAll", "selectAll$foundation_release()V", 0), null);
        }
    }
}
