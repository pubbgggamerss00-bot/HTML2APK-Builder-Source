package j9;

import a9.d2;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.d;
import com.basitce.htmltoapk.R;
import com.yalantis.ucrop.view.CropImageView;
import g2.j;
import i2.e0;
import i2.g;
import j1.d;
import j1.f;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jf.dexlib2.dexbacked.raw.HeaderItem;
import p0.va;
import t0.ff;
import t0.nf;
import t0.of;
import t0.t4;
import x0.h2;
import x0.j;
import x0.r3;
import x0.s3;

/* loaded from: classes.dex */
public final class e {

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.templates.CatalogCardsKt$CatalogCard$1$1", f = "CatalogCards.kt", l = {87, HeaderItem.METHOD_COUNT_OFFSET}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f15344a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f15345b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ s.b<Float, s.o> f15346c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ x0.n1<Boolean> f15347d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, s.b<Float, s.o> bVar, x0.n1<Boolean> n1Var, tg.e<? super a> eVar) {
            super(2, eVar);
            this.f15345b = i10;
            this.f15346c = bVar;
            this.f15347d = n1Var;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new a(this.f15345b, this.f15346c, this.f15347d, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x005c, code lost:
        
            if (s.b.c(r9.f15346c, r4, r5, null, r9, 12) != r0) goto L18;
         */
        @Override // vg.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f15344a;
            if (i10 == 0) {
                pg.q.b(obj);
                x0.n1<Boolean> n1Var = this.f15347d;
                if (!n1Var.getValue().booleanValue()) {
                    n1Var.setValue(Boolean.TRUE);
                    long j10 = this.f15345b;
                    this.f15344a = 1;
                    if (ph.t0.b(j10, this) != aVar) {
                        Float f10 = new Float(1.0f);
                        s.l1 l1VarC = s.m.c(0.85f, 300.0f, null, 4);
                        this.f15344a = 2;
                    }
                    return aVar;
                }
                return pg.f0.f21461a;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
                return pg.f0.f21461a;
            }
            pg.q.b(obj);
            Float f102 = new Float(1.0f);
            s.l1 l1VarC2 = s.m.c(0.85f, 300.0f, null, 4);
            this.f15344a = 2;
        }
    }

    public static final class b implements eh.q<z.r, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f15348a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f15349b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f15350c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f15351d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f15352e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ boolean f15353f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ long f15354g;

        public b(boolean z10, String str, long j10, String str2, String str3, boolean z11, long j11) {
            this.f15348a = z10;
            this.f15349b = str;
            this.f15350c = j10;
            this.f15351d = str2;
            this.f15352e = str3;
            this.f15353f = z11;
            this.f15354g = j11;
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x00ee  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00fa  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00fd  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0120  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0278  */
        @Override // eh.q
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final pg.f0 b(z.r rVar, x0.j jVar, Integer num) {
            String strC;
            f.a aVar;
            z.r Card = rVar;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(Card, "$this$Card");
            if ((iIntValue & 17) == 16 && jVar2.s()) {
                jVar2.v();
            } else {
                boolean z10 = this.f15348a;
                d.a aVar2 = d.a.f1143b;
                f.a aVar3 = d.a.f14614m;
                boolean z11 = this.f15353f;
                String str = this.f15349b;
                f.b bVar = d.a.f14612k;
                if (z10) {
                    jVar2.L(2120901134);
                    androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.f.h(androidx.compose.foundation.layout.g.d(aVar2, 1.0f), 12);
                    float f10 = 14;
                    z.m1 m1VarA = z.k1.a(z.b.h(f10), bVar, jVar2, 54);
                    int iD = jVar2.D();
                    x0.a2 a2VarY = jVar2.y();
                    androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarH, jVar2);
                    i2.g.f13861o.getClass();
                    e0.a aVar4 = g.a.f13863b;
                    if (jVar2.t() == null) {
                        c9.u1.d();
                        throw null;
                    }
                    jVar2.r();
                    if (jVar2.m()) {
                        jVar2.w(aVar4);
                    } else {
                        jVar2.z();
                    }
                    g.a.b bVar2 = g.a.f13867f;
                    ph.v1.j(bVar2, m1VarA, jVar2);
                    g.a.d dVar = g.a.f13866e;
                    ph.v1.j(dVar, a2VarY, jVar2);
                    g.a.C0128a c0128a = g.a.f13868g;
                    if (jVar2.m()) {
                        aVar = aVar3;
                    } else {
                        aVar = aVar3;
                        if (!kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                        }
                        g.a.c cVar = g.a.f13865d;
                        ph.v1.j(cVar, dVarC, jVar2);
                        f.a aVar5 = aVar;
                        h7.r.a("file:///android_asset/catalog_covers/" + str + ".webp", null, e1.d.d(androidx.compose.foundation.layout.g.n(aVar2, 96), h0.f.a(f10)), j.a.f11397a, jVar2, 1572912);
                        if (1.0f <= 0.0d) {
                            a0.a.a("invalid weight; must be greater than zero");
                        }
                        LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                        z.q qVarA = z.o.a(z.b.h(5), aVar5, jVar2, 6);
                        int iD2 = jVar2.D();
                        x0.a2 a2VarY2 = jVar2.y();
                        androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(layoutWeightElement, jVar2);
                        if (jVar2.t() != null) {
                            c9.u1.d();
                            throw null;
                        }
                        jVar2.r();
                        if (jVar2.m()) {
                            jVar2.w(aVar4);
                        } else {
                            jVar2.z();
                        }
                        ph.v1.j(bVar2, qVarA, jVar2);
                        ph.v1.j(dVar, a2VarY2, jVar2);
                        if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD2))) {
                            l9.i.a(iD2, jVar2, iD2, c0128a);
                        }
                        ph.v1.j(cVar, dVarC2, jVar2);
                        z.m1 m1VarA2 = z.k1.a(z.b.h(8), bVar, jVar2, 54);
                        int iD3 = jVar2.D();
                        x0.a2 a2VarY3 = jVar2.y();
                        androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(aVar2, jVar2);
                        if (jVar2.t() == null) {
                            c9.u1.d();
                            throw null;
                        }
                        jVar2.r();
                        if (jVar2.m()) {
                            jVar2.w(aVar4);
                        } else {
                            jVar2.z();
                        }
                        ph.v1.j(bVar2, m1VarA2, jVar2);
                        ph.v1.j(dVar, a2VarY3, jVar2);
                        if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD3))) {
                            l9.i.a(iD3, jVar2, iD3, c0128a);
                        }
                        ph.v1.j(cVar, dVarC3, jVar2);
                        if (1.0f <= 0.0d) {
                            a0.a.a("invalid weight; must be greater than zero");
                        }
                        LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                        s3 s3Var = of.f26647a;
                        t2.l0 l0Var = ((nf) jVar2.f(s3Var)).f26545h;
                        x2.p pVar = x2.p.f32033f;
                        String str2 = this.f15352e;
                        long j10 = this.f15350c;
                        ff.b(str2, layoutWeightElement2, j10, 0L, pVar, null, 0L, null, 0L, 2, false, 2, 0, l0Var, jVar2, 196608, 3120, 55256);
                        w1.d dVarA = z11 ? va.a() : n0.e.a();
                        jVar2.L(-1573925382);
                        strC = z11 ? f3.q.c(R.string.common_pro, jVar2) : null;
                        jVar2.B();
                        t4.b(dVarA, strC, androidx.compose.foundation.layout.g.n(aVar2, 18), q1.b1.c(0.75f, j10), jVar2, 384, 0);
                        jVar2.H();
                        ff.b(this.f15351d, null, q1.b1.c(0.8f, j10), 0L, null, null, 0L, null, 0L, 2, false, 3, 0, ((nf) jVar2.f(s3Var)).f26549l, jVar2, 0, 3120, 55290);
                        jVar2.H();
                        jVar2.H();
                        jVar2.B();
                    }
                    l9.i.a(iD, jVar2, iD, c0128a);
                    g.a.c cVar2 = g.a.f13865d;
                    ph.v1.j(cVar2, dVarC, jVar2);
                    f.a aVar52 = aVar;
                    h7.r.a("file:///android_asset/catalog_covers/" + str + ".webp", null, e1.d.d(androidx.compose.foundation.layout.g.n(aVar2, 96), h0.f.a(f10)), j.a.f11397a, jVar2, 1572912);
                    if (1.0f <= 0.0d) {
                    }
                    LayoutWeightElement layoutWeightElement3 = new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    z.q qVarA2 = z.o.a(z.b.h(5), aVar52, jVar2, 6);
                    int iD22 = jVar2.D();
                    x0.a2 a2VarY22 = jVar2.y();
                    androidx.compose.ui.d dVarC22 = androidx.compose.ui.c.c(layoutWeightElement3, jVar2);
                    if (jVar2.t() != null) {
                    }
                } else {
                    jVar2.L(-1594099262);
                    androidx.compose.ui.d dVarA2 = androidx.compose.foundation.layout.a.a(androidx.compose.foundation.layout.g.d(aVar2, 1.0f), 1.5f, false);
                    g2.l0 l0VarD = z.g.d(d.a.f14602a, false);
                    int iD4 = jVar2.D();
                    x0.a2 a2VarY4 = jVar2.y();
                    androidx.compose.ui.d dVarC4 = androidx.compose.ui.c.c(dVarA2, jVar2);
                    i2.g.f13861o.getClass();
                    e0.a aVar6 = g.a.f13863b;
                    if (jVar2.t() == null) {
                        c9.u1.d();
                        throw null;
                    }
                    jVar2.r();
                    if (jVar2.m()) {
                        jVar2.w(aVar6);
                    } else {
                        jVar2.z();
                    }
                    g.a.b bVar3 = g.a.f13867f;
                    ph.v1.j(bVar3, l0VarD, jVar2);
                    g.a.d dVar2 = g.a.f13866e;
                    ph.v1.j(dVar2, a2VarY4, jVar2);
                    g.a.C0128a c0128a2 = g.a.f13868g;
                    if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD4))) {
                        l9.i.a(iD4, jVar2, iD4, c0128a2);
                    }
                    g.a.c cVar3 = g.a.f13865d;
                    ph.v1.j(cVar3, dVarC4, jVar2);
                    androidx.compose.foundation.layout.b bVar4 = androidx.compose.foundation.layout.b.f961a;
                    e.b(str, bVar4.e(), jVar2, 0);
                    androidx.compose.ui.d dVarI = androidx.compose.foundation.layout.f.i(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.g.d(bVar4.b(aVar2, d.a.f14609h), 1.0f), q1.b1.c(0.6f, this.f15354g), q1.y1.f21750a), 14, 10);
                    z.q qVarA3 = z.o.a(z.b.f34446c, aVar3, jVar2, 0);
                    int iD5 = jVar2.D();
                    x0.a2 a2VarY5 = jVar2.y();
                    androidx.compose.ui.d dVarC5 = androidx.compose.ui.c.c(dVarI, jVar2);
                    if (jVar2.t() == null) {
                        c9.u1.d();
                        throw null;
                    }
                    jVar2.r();
                    if (jVar2.m()) {
                        jVar2.w(aVar6);
                    } else {
                        jVar2.z();
                    }
                    ph.v1.j(bVar3, qVarA3, jVar2);
                    ph.v1.j(dVar2, a2VarY5, jVar2);
                    if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD5))) {
                        l9.i.a(iD5, jVar2, iD5, c0128a2);
                    }
                    ph.v1.j(cVar3, dVarC5, jVar2);
                    z.m1 m1VarA3 = z.k1.a(z.b.h(8), bVar, jVar2, 54);
                    int iD6 = jVar2.D();
                    x0.a2 a2VarY6 = jVar2.y();
                    androidx.compose.ui.d dVarC6 = androidx.compose.ui.c.c(aVar2, jVar2);
                    if (jVar2.t() == null) {
                        c9.u1.d();
                        throw null;
                    }
                    jVar2.r();
                    if (jVar2.m()) {
                        jVar2.w(aVar6);
                    } else {
                        jVar2.z();
                    }
                    ph.v1.j(bVar3, m1VarA3, jVar2);
                    ph.v1.j(dVar2, a2VarY6, jVar2);
                    if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD6))) {
                        l9.i.a(iD6, jVar2, iD6, c0128a2);
                    }
                    ph.v1.j(cVar3, dVarC6, jVar2);
                    if (1.0f <= 0.0d) {
                        a0.a.a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement4 = new LayoutWeightElement(1.0f, true);
                    s3 s3Var2 = of.f26647a;
                    t2.l0 l0Var2 = ((nf) jVar2.f(s3Var2)).f26545h;
                    x2.p pVar2 = x2.p.f32033f;
                    String str3 = this.f15352e;
                    long j11 = this.f15350c;
                    ff.b(str3, layoutWeightElement4, j11, 0L, pVar2, null, 0L, null, 0L, 2, false, 1, 0, l0Var2, jVar2, 196608, 3120, 55256);
                    w1.d dVarA3 = z11 ? va.a() : n0.e.a();
                    jVar2.L(-1573883910);
                    strC = z11 ? f3.q.c(R.string.common_pro, jVar2) : null;
                    jVar2.B();
                    t4.b(dVarA3, strC, androidx.compose.foundation.layout.g.n(aVar2, 20), q1.b1.c(0.75f, j11), jVar2, 384, 0);
                    jVar2.H();
                    ff.b(this.f15351d, androidx.compose.foundation.layout.f.l(aVar2, CropImageView.DEFAULT_ASPECT_RATIO, 3, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), j11, 0L, null, null, 0L, null, 0L, 2, false, 2, 2, ((nf) jVar2.f(s3Var2)).f26549l, jVar2, 48, 27696, 38904);
                    jVar2.H();
                    jVar2.H();
                    jVar2.B();
                }
            }
            return pg.f0.f21461a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final String id2, final String title, final String description, final boolean z10, final eh.a<pg.f0> onClick, final androidx.compose.ui.d dVar, int i10, x.m mVar, boolean z11, x0.j jVar, final int i11, final int i12) {
        int i13;
        final int i14;
        int i15;
        x.m mVar2;
        int i16;
        boolean z12;
        int i17;
        int i18;
        x.m mVar3;
        Object objG;
        Object obj;
        final r3 r3VarB;
        final boolean zA;
        boolean zC;
        Object objG2;
        x0.n1 n1Var;
        Object objG3;
        final s.b bVar;
        boolean zK;
        Object objG4;
        boolean zK2;
        Object objG5;
        x0.k kVar;
        final boolean z13;
        final x.m mVar4;
        h2 h2VarV;
        kotlin.jvm.internal.r.e(id2, "id");
        kotlin.jvm.internal.r.e(title, "title");
        kotlin.jvm.internal.r.e(description, "description");
        kotlin.jvm.internal.r.e(onClick, "onClick");
        x0.k kVarP = jVar.p(377910255);
        if ((i11 & 6) == 0) {
            i13 = (kVarP.K(id2) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= kVarP.K(title) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= kVarP.K(description) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= kVarP.c(z10) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i13 |= kVarP.l(onClick) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i13 |= kVarP.K(dVar) ? 131072 : 65536;
        }
        int i19 = i12 & 64;
        if (i19 != 0) {
            i13 |= 1572864;
        } else {
            if ((1572864 & i11) == 0) {
                i14 = i10;
                i13 |= kVarP.i(i14) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
            }
            i15 = i12 & 128;
            if (i15 != 0) {
                if ((12582912 & i11) == 0) {
                    mVar2 = mVar;
                    i13 |= kVarP.K(mVar2) ? 8388608 : 4194304;
                }
                i16 = i12 & 256;
                if (i16 != 0) {
                    i13 |= 100663296;
                    z12 = z11;
                } else {
                    z12 = z11;
                    if ((i11 & 100663296) == 0) {
                        i13 |= kVarP.c(z12) ? 67108864 : 33554432;
                    }
                }
                i17 = i13;
                if ((i17 & 38347923) == 38347922 && kVarP.s()) {
                    kVarP.v();
                    kVar = kVarP;
                    mVar4 = mVar2;
                    z13 = z12;
                } else {
                    i18 = i19 == 0 ? 0 : i14;
                    mVar3 = i15 == 0 ? null : mVar2;
                    if (i16 != 0) {
                        z12 = false;
                    }
                    kVarP.L(-1335499156);
                    objG = kVarP.g();
                    obj = j.a.f31715a;
                    if (objG == obj) {
                        objG = new x.n();
                        kVarP.C(objG);
                    }
                    x.m mVar5 = (x.m) objG;
                    kVarP.T(false);
                    if (mVar3 != null) {
                        mVar5 = mVar3;
                    }
                    boolean z14 = z12;
                    r3VarB = s.g.b(!((Boolean) h1.m.d(mVar5, kVarP, 0).getValue()).booleanValue() ? 0.975f : 1.0f, s.m.c(0.7f, CropImageView.DEFAULT_ASPECT_RATIO, null, 6), "catalogPress", kVarP, 3120, 20);
                    zA = q8.x1.a(kVarP);
                    Object[] objArr = {id2};
                    kVarP.L(-1335487610);
                    zC = kVarP.c(zA);
                    objG2 = kVarP.g();
                    if (!zC || objG2 == obj) {
                        objG2 = new eh.a() { // from class: j9.a
                            @Override // eh.a
                            public final Object invoke() {
                                return bg.b.h(Boolean.valueOf(zA));
                            }
                        };
                        kVarP.C(objG2);
                    }
                    kVarP.T(false);
                    n1Var = (x0.n1) b0.a0.d(objArr, null, (eh.a) objG2, kVarP, 0, 6);
                    kVarP.L(-1335485899);
                    objG3 = kVarP.g();
                    if (objG3 == obj) {
                        objG3 = s.d.a(((Boolean) n1Var.getValue()).booleanValue() ? 1.0f : CropImageView.DEFAULT_ASPECT_RATIO);
                        kVarP.C(objG3);
                    }
                    bVar = (s.b) objG3;
                    kVarP.T(false);
                    k9.e eVar = (k9.e) kVarP.f(k9.c.f16178b);
                    pg.n<q1.b1, q1.b1> nVarC = c(eVar);
                    long j10 = nVarC.f21469a.f21656a;
                    x.m mVar6 = mVar5;
                    long j11 = nVarC.f21470b.f21656a;
                    long jC = c2.n0.c(!eVar.a() ? 4294047222L : 4280298548L);
                    kVarP.L(-1335477947);
                    zK = kVarP.K(n1Var) | ((i17 & 3670016) != 1048576) | kVarP.l(bVar);
                    objG4 = kVarP.g();
                    if (!zK || objG4 == obj) {
                        objG4 = new a(i18, bVar, n1Var, null);
                        kVarP.C(objG4);
                    }
                    kVarP.T(false);
                    x0.o0.d((eh.p) objG4, id2, kVarP);
                    kVarP.L(-1335467959);
                    zK2 = kVarP.K(r3VarB) | kVarP.l(bVar);
                    objG5 = kVarP.g();
                    if (!zK2 || objG5 == obj) {
                        objG5 = new eh.l() { // from class: j9.b
                            @Override // eh.l
                            public final Object invoke(Object obj2) {
                                q1.l1 graphicsLayer = (q1.l1) obj2;
                                kotlin.jvm.internal.r.e(graphicsLayer, "$this$graphicsLayer");
                                r3 r3Var = r3VarB;
                                graphicsLayer.h(((Number) r3Var.getValue()).floatValue());
                                graphicsLayer.d(((Number) r3Var.getValue()).floatValue());
                                s.b bVar2 = bVar;
                                graphicsLayer.f(((Number) bVar2.d()).floatValue());
                                graphicsLayer.c(graphicsLayer.N0(18) * (1.0f - ((Number) bVar2.d()).floatValue()));
                                return pg.f0.f21461a;
                            }
                        };
                        kVarP.C(objG5);
                    }
                    kVarP.T(false);
                    t0.d1.b(onClick, androidx.compose.ui.graphics.a.a(dVar, (eh.l) objG5), false, h0.f.a(20), t0.z0.a(!z14 ? q1.b1.c(0.85f, j10) : j10, kVarP, 0), null, d2.a((float) 0.75d, j11), mVar6, f1.c.b(-275974812, new b(z14, id2, jC, description, title, z10, j10), kVarP), kVarP, ((i17 >> 12) & 14) | 100663296, 36);
                    kVar = kVarP;
                    z13 = z14;
                    i14 = i18;
                    mVar4 = mVar3;
                }
                h2VarV = kVar.V();
                if (h2VarV != null) {
                    h2VarV.f31703d = new eh.p() { // from class: j9.c
                        @Override // eh.p
                        public final Object invoke(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            e.a(id2, title, description, z10, onClick, dVar, i14, mVar4, z13, (x0.j) obj2, f3.i.n(i11 | 1), i12);
                            return pg.f0.f21461a;
                        }
                    };
                    return;
                }
                return;
            }
            i13 |= 12582912;
            mVar2 = mVar;
            i16 = i12 & 256;
            if (i16 != 0) {
            }
            i17 = i13;
            if ((i17 & 38347923) == 38347922) {
                if (i19 == 0) {
                }
                if (i15 == 0) {
                }
                if (i16 != 0) {
                }
                kVarP.L(-1335499156);
                objG = kVarP.g();
                obj = j.a.f31715a;
                if (objG == obj) {
                }
                x.m mVar52 = (x.m) objG;
                kVarP.T(false);
                if (mVar3 != null) {
                }
                boolean z142 = z12;
                r3VarB = s.g.b(!((Boolean) h1.m.d(mVar52, kVarP, 0).getValue()).booleanValue() ? 0.975f : 1.0f, s.m.c(0.7f, CropImageView.DEFAULT_ASPECT_RATIO, null, 6), "catalogPress", kVarP, 3120, 20);
                zA = q8.x1.a(kVarP);
                Object[] objArr2 = {id2};
                kVarP.L(-1335487610);
                zC = kVarP.c(zA);
                objG2 = kVarP.g();
                if (!zC) {
                    objG2 = new eh.a() { // from class: j9.a
                        @Override // eh.a
                        public final Object invoke() {
                            return bg.b.h(Boolean.valueOf(zA));
                        }
                    };
                    kVarP.C(objG2);
                    kVarP.T(false);
                    n1Var = (x0.n1) b0.a0.d(objArr2, null, (eh.a) objG2, kVarP, 0, 6);
                    kVarP.L(-1335485899);
                    objG3 = kVarP.g();
                    if (objG3 == obj) {
                    }
                    bVar = (s.b) objG3;
                    kVarP.T(false);
                    k9.e eVar2 = (k9.e) kVarP.f(k9.c.f16178b);
                    pg.n<q1.b1, q1.b1> nVarC2 = c(eVar2);
                    long j102 = nVarC2.f21469a.f21656a;
                    x.m mVar62 = mVar52;
                    long j112 = nVarC2.f21470b.f21656a;
                    long jC2 = c2.n0.c(!eVar2.a() ? 4294047222L : 4280298548L);
                    kVarP.L(-1335477947);
                    zK = kVarP.K(n1Var) | ((i17 & 3670016) != 1048576) | kVarP.l(bVar);
                    objG4 = kVarP.g();
                    if (!zK) {
                        objG4 = new a(i18, bVar, n1Var, null);
                        kVarP.C(objG4);
                        kVarP.T(false);
                        x0.o0.d((eh.p) objG4, id2, kVarP);
                        kVarP.L(-1335467959);
                        zK2 = kVarP.K(r3VarB) | kVarP.l(bVar);
                        objG5 = kVarP.g();
                        if (!zK2) {
                            objG5 = new eh.l() { // from class: j9.b
                                @Override // eh.l
                                public final Object invoke(Object obj2) {
                                    q1.l1 graphicsLayer = (q1.l1) obj2;
                                    kotlin.jvm.internal.r.e(graphicsLayer, "$this$graphicsLayer");
                                    r3 r3Var = r3VarB;
                                    graphicsLayer.h(((Number) r3Var.getValue()).floatValue());
                                    graphicsLayer.d(((Number) r3Var.getValue()).floatValue());
                                    s.b bVar2 = bVar;
                                    graphicsLayer.f(((Number) bVar2.d()).floatValue());
                                    graphicsLayer.c(graphicsLayer.N0(18) * (1.0f - ((Number) bVar2.d()).floatValue()));
                                    return pg.f0.f21461a;
                                }
                            };
                            kVarP.C(objG5);
                            kVarP.T(false);
                            t0.d1.b(onClick, androidx.compose.ui.graphics.a.a(dVar, (eh.l) objG5), false, h0.f.a(20), t0.z0.a(!z142 ? q1.b1.c(0.85f, j102) : j102, kVarP, 0), null, d2.a((float) 0.75d, j112), mVar62, f1.c.b(-275974812, new b(z142, id2, jC2, description, title, z10, j102), kVarP), kVarP, ((i17 >> 12) & 14) | 100663296, 36);
                            kVar = kVarP;
                            z13 = z142;
                            i14 = i18;
                            mVar4 = mVar3;
                        }
                    }
                }
            }
            h2VarV = kVar.V();
            if (h2VarV != null) {
            }
        }
        i14 = i10;
        i15 = i12 & 128;
        if (i15 != 0) {
        }
        mVar2 = mVar;
        i16 = i12 & 256;
        if (i16 != 0) {
        }
        i17 = i13;
        if ((i17 & 38347923) == 38347922) {
        }
        h2VarV = kVar.V();
        if (h2VarV != null) {
        }
    }

    public static final void b(final String id2, final androidx.compose.ui.d dVar, x0.j jVar, final int i10) {
        kotlin.jvm.internal.r.e(id2, "id");
        x0.k kVarP = jVar.p(-1529620376);
        int i11 = (kVarP.K(id2) ? 4 : 2) | i10;
        if ((i10 & 48) == 0) {
            i11 |= kVarP.K(dVar) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && kVarP.s()) {
            kVarP.v();
        } else {
            h7.r.a(i8.n.d("file:///android_asset/catalog_covers/", id2, ".webp"), null, e1.d.d(androidx.compose.foundation.layout.a.a(androidx.compose.foundation.layout.g.d(dVar, 1.0f), 1.5f, false), h0.f.a(20)), j.a.f11398b, kVarP, 1572912);
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p() { // from class: j9.d
                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(i10 | 1);
                    e.b(id2, dVar, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final pg.n<q1.b1, q1.b1> c(k9.e eVar) {
        switch (eVar.ordinal()) {
            case 0:
                return new pg.n<>(new q1.b1(c2.n0.c(4294441210L)), new q1.b1(c2.n0.c(4288259503L)));
            case 1:
                return new pg.n<>(new q1.b1(c2.n0.c(4293391096L)), new q1.b1(c2.n0.c(4284324531L)));
            case 2:
                return new pg.n<>(new q1.b1(c2.n0.c(4294569705L)), new q1.b1(c2.n0.c(4290677635L)));
            case 3:
                return new pg.n<>(new q1.b1(c2.n0.c(4293588462L)), new q1.b1(c2.n0.c(4284456330L)));
            case 4:
                return new pg.n<>(new q1.b1(c2.n0.c(4280428336L)), new q1.b1(c2.n0.c(4285758601L)));
            case 5:
                return new pg.n<>(new q1.b1(c2.n0.c(4280165675L)), new q1.b1(c2.n0.c(4284510332L)));
            case 6:
                return new pg.n<>(new q1.b1(c2.n0.c(4279244313L)), new q1.b1(c2.n0.c(4283193700L)));
            default:
                throw new pg.l();
        }
    }
}
