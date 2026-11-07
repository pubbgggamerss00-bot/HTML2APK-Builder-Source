package t0;

import androidx.compose.ui.d;
import com.android.apksig.internal.apk.v4.V4Signature;
import com.google.protobuf.DescriptorProtos;
import com.yalantis.ucrop.view.CropImageView;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jf.dexlib2.dexbacked.raw.CdexHeaderItem;
import s.l0;
import s.q0;
import x0.j;

/* loaded from: classes.dex */
public final class z9 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f27529a;

    /* renamed from: b, reason: collision with root package name */
    public static final androidx.compose.ui.d f27530b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f27531c = 240;

    /* renamed from: d, reason: collision with root package name */
    public static final float f27532d;

    /* renamed from: e, reason: collision with root package name */
    public static final float f27533e;

    /* renamed from: f, reason: collision with root package name */
    public static final s.w f27534f;

    /* renamed from: g, reason: collision with root package name */
    public static final s.w f27535g;

    /* renamed from: h, reason: collision with root package name */
    public static final s.w f27536h;

    /* renamed from: i, reason: collision with root package name */
    public static final s.w f27537i;

    /* renamed from: j, reason: collision with root package name */
    public static final s.w f27538j;

    public static final class a extends kotlin.jvm.internal.s implements eh.l<s1.e, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f27539a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ s1.i f27540b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x0.r3<Integer> f27541c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ x0.r3<Float> f27542d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ x0.r3<Float> f27543e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ x0.r3<Float> f27544f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ float f27545g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ long f27546h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j10, s1.i iVar, l0.a aVar, l0.a aVar2, l0.a aVar3, l0.a aVar4, float f10, long j11) {
            super(1);
            this.f27539a = j10;
            this.f27540b = iVar;
            this.f27541c = aVar;
            this.f27542d = aVar2;
            this.f27543e = aVar3;
            this.f27544f = aVar4;
            this.f27545g = f10;
            this.f27546h = j11;
        }

        @Override // eh.l
        public final pg.f0 invoke(s1.e eVar) {
            float f10;
            s1.e eVar2 = eVar;
            long j10 = this.f27539a;
            s1.i iVar = this.f27540b;
            z9.e(eVar2, CropImageView.DEFAULT_ASPECT_RATIO, 360.0f, j10, iVar);
            float fFloatValue = (this.f27541c.getValue().floatValue() * 216.0f) % 360.0f;
            float fFloatValue2 = this.f27542d.getValue().floatValue();
            x0.r3<Float> r3Var = this.f27543e;
            float fAbs = Math.abs(fFloatValue2 - r3Var.getValue().floatValue());
            float fFloatValue3 = r3Var.getValue().floatValue() + this.f27544f.getValue().floatValue() + (fFloatValue - 90.0f);
            if (iVar.f24189c == 0) {
                f10 = CropImageView.DEFAULT_ASPECT_RATIO;
            } else {
                f10 = ((this.f27545g / (z9.f27533e / 2)) * 57.29578f) / 2.0f;
            }
            z9.e(eVar2, fFloatValue3 + f10, Math.max(fAbs, 0.1f), this.f27546h, iVar);
            return pg.f0.f21461a;
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.d f27547a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f27548b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f27549c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f27550d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f27551e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f27552f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f27553g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f10, int i10, int i11, int i12, long j10, long j11, androidx.compose.ui.d dVar) {
            super(2);
            this.f27547a = dVar;
            this.f27548b = j10;
            this.f27549c = f10;
            this.f27550d = j11;
            this.f27551e = i10;
            this.f27552f = i11;
            this.f27553g = i12;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            num.intValue();
            int iN = f3.i.n(this.f27552f | 1);
            int i10 = this.f27553g;
            z9.a(this.f27549c, this.f27551e, iN, i10, this.f27548b, this.f27550d, this.f27547a, jVar);
            return pg.f0.f21461a;
        }
    }

    public static final class c extends kotlin.jvm.internal.s implements eh.l<q0.b<Float>, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f27554a = new c(1);

        @Override // eh.l
        public final pg.f0 invoke(q0.b<Float> bVar) {
            q0.b<Float> bVar2 = bVar;
            bVar2.f23906a = 1332;
            bVar2.a(0, Float.valueOf(CropImageView.DEFAULT_ASPECT_RATIO)).f14648b = z9.f27538j;
            bVar2.a(666, Float.valueOf(290.0f));
            return pg.f0.f21461a;
        }
    }

    public static final class d extends kotlin.jvm.internal.s implements eh.l<q0.b<Float>, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f27555a = new d(1);

        @Override // eh.l
        public final pg.f0 invoke(q0.b<Float> bVar) {
            q0.b<Float> bVar2 = bVar;
            bVar2.f23906a = 1332;
            bVar2.a(666, Float.valueOf(CropImageView.DEFAULT_ASPECT_RATIO)).f14648b = z9.f27538j;
            bVar2.a(bVar2.f23906a, Float.valueOf(290.0f));
            return pg.f0.f21461a;
        }
    }

    public static final class e extends kotlin.jvm.internal.s implements eh.q<g2.o0, g2.k0, f3.b, g2.m0> {

        /* renamed from: a, reason: collision with root package name */
        public static final e f27556a = new e(3);

        @Override // eh.q
        public final g2.m0 b(g2.o0 o0Var, g2.k0 k0Var, f3.b bVar) {
            g2.o0 o0Var2 = o0Var;
            long j10 = bVar.f8811a;
            int iB1 = o0Var2.b1(z9.f27529a);
            int i10 = iB1 * 2;
            g2.g1 g1VarP = k0Var.P(f3.c.i(0, i10, j10));
            int i11 = g1VarP.f11383b - i10;
            return o0Var2.i0(g1VarP.f11382a, i11, qg.a0.f22708a, new aa(g1VarP, iB1));
        }
    }

    public static final class f extends kotlin.jvm.internal.s implements eh.l<q2.d0, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final f f27557a = new f(1);

        @Override // eh.l
        public final /* bridge */ /* synthetic */ pg.f0 invoke(q2.d0 d0Var) {
            return pg.f0.f21461a;
        }
    }

    public static final class g extends kotlin.jvm.internal.s implements eh.l<s1.e, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f27558a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f27559b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(int i10, long j10) {
            super(1);
            this.f27558a = j10;
            this.f27559b = i10;
        }

        @Override // eh.l
        public final pg.f0 invoke(s1.e eVar) {
            s1.e eVar2 = eVar;
            float fMin = Math.min(eVar2.N0(y9.f27476d), p1.h.b(eVar2.i()));
            float fB = (p1.h.b(eVar2.i()) - fMin) / 2;
            long j10 = this.f27558a;
            if (this.f27559b == 1) {
                float f10 = fMin / 2.0f;
                s1.e.f0(eVar2, j10, f10, p1.d.a((p1.h.d(eVar2.i()) - f10) - fB, p1.h.b(eVar2.i()) / 2.0f), null, 0, CdexHeaderItem.DEBUG_INFO_OFFSETS_TABLE_OFFSET);
            } else {
                s1.e.X0(eVar2, j10, p1.d.a((p1.h.d(eVar2.i()) - fMin) - fB, (p1.h.b(eVar2.i()) - fMin) / 2.0f), d0.h.a(fMin, fMin), CropImageView.DEFAULT_ASPECT_RATIO, null, CdexHeaderItem.DEBUG_INFO_OFFSETS_TABLE_OFFSET);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class h extends kotlin.jvm.internal.s implements eh.l<q2.d0, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ eh.a<Float> f27560a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(eh.a<Float> aVar) {
            super(1);
            this.f27560a = aVar;
        }

        @Override // eh.l
        public final pg.f0 invoke(q2.d0 d0Var) {
            q2.h hVar = new q2.h(this.f27560a.invoke().floatValue(), 0, new jh.d(CropImageView.DEFAULT_ASPECT_RATIO, 1.0f));
            kh.i<Object>[] iVarArr = q2.a0.f21754a;
            q2.c0<q2.h> c0Var = q2.w.f21822c;
            kh.i<Object> iVar = q2.a0.f21754a[1];
            c0Var.getClass();
            d0Var.c(c0Var, hVar);
            return pg.f0.f21461a;
        }
    }

    public static final class i extends kotlin.jvm.internal.s implements eh.l<s1.e, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f27561a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f27562b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ eh.a<Float> f27563c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f27564d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ long f27565e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ eh.l<s1.e, pg.f0> f27566f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public i(int i10, float f10, eh.a<Float> aVar, long j10, long j11, eh.l<? super s1.e, pg.f0> lVar) {
            super(1);
            this.f27561a = i10;
            this.f27562b = f10;
            this.f27563c = aVar;
            this.f27564d = j10;
            this.f27565e = j11;
            this.f27566f = lVar;
        }

        @Override // eh.l
        public final pg.f0 invoke(s1.e eVar) {
            s1.e eVar2 = eVar;
            float fB = p1.h.b(eVar2.i());
            int i10 = this.f27561a;
            float fV = this.f27562b;
            if (i10 != 0 && p1.h.b(eVar2.i()) <= p1.h.d(eVar2.i())) {
                fV += eVar2.v(fB);
            }
            float fV2 = fV / eVar2.v(p1.h.d(eVar2.i()));
            float fFloatValue = this.f27563c.invoke().floatValue();
            float fMin = Math.min(fFloatValue, fV2) + fFloatValue;
            if (fMin <= 1.0f) {
                z9.d(eVar2, fMin, 1.0f, this.f27564d, fB, this.f27561a);
            }
            z9.d(eVar2, CropImageView.DEFAULT_ASPECT_RATIO, fFloatValue, this.f27565e, fB, this.f27561a);
            this.f27566f.invoke(eVar2);
            return pg.f0.f21461a;
        }
    }

    public static final class j extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ eh.a<Float> f27567a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.d f27568b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f27569c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f27570d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f27571e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ float f27572f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ eh.l<s1.e, pg.f0> f27573g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ int f27574h;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ int f27575j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public j(eh.a<Float> aVar, androidx.compose.ui.d dVar, long j10, long j11, int i10, float f10, eh.l<? super s1.e, pg.f0> lVar, int i11, int i12) {
            super(2);
            this.f27567a = aVar;
            this.f27568b = dVar;
            this.f27569c = j10;
            this.f27570d = j11;
            this.f27571e = i10;
            this.f27572f = f10;
            this.f27573g = lVar;
            this.f27574h = i11;
            this.f27575j = i12;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            num.intValue();
            z9.b(this.f27567a, this.f27568b, this.f27569c, this.f27570d, this.f27571e, this.f27572f, this.f27573g, jVar, f3.i.n(this.f27574h | 1), this.f27575j);
            return pg.f0.f21461a;
        }
    }

    public static final class k extends kotlin.jvm.internal.s implements eh.l<s1.e, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f27576a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f27577b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x0.r3<Float> f27578c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f27579d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ x0.r3<Float> f27580e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ long f27581f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ x0.r3<Float> f27582g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ x0.r3<Float> f27583h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(int i10, float f10, l0.a aVar, long j10, l0.a aVar2, long j11, l0.a aVar3, l0.a aVar4) {
            super(1);
            this.f27576a = i10;
            this.f27577b = f10;
            this.f27578c = aVar;
            this.f27579d = j10;
            this.f27580e = aVar2;
            this.f27581f = j11;
            this.f27582g = aVar3;
            this.f27583h = aVar4;
        }

        @Override // eh.l
        public final pg.f0 invoke(s1.e eVar) {
            s1.e eVar2 = eVar;
            float fB = p1.h.b(eVar2.i());
            int i10 = this.f27576a;
            float fV = this.f27577b;
            if (i10 != 0 && p1.h.b(eVar2.i()) <= p1.h.d(eVar2.i())) {
                fV += eVar2.v(fB);
            }
            float fV2 = fV / eVar2.v(p1.h.d(eVar2.i()));
            x0.r3<Float> r3Var = this.f27578c;
            if (r3Var.getValue().floatValue() < 1.0f - fV2) {
                z9.d(eVar2, r3Var.getValue().floatValue() > CropImageView.DEFAULT_ASPECT_RATIO ? r3Var.getValue().floatValue() + fV2 : 0.0f, 1.0f, this.f27579d, fB, this.f27576a);
            }
            float fFloatValue = r3Var.getValue().floatValue();
            x0.r3<Float> r3Var2 = this.f27580e;
            if (fFloatValue - r3Var2.getValue().floatValue() > CropImageView.DEFAULT_ASPECT_RATIO) {
                z9.d(eVar2, r3Var.getValue().floatValue(), r3Var2.getValue().floatValue(), this.f27581f, fB, this.f27576a);
            }
            float fFloatValue2 = r3Var2.getValue().floatValue();
            x0.r3<Float> r3Var3 = this.f27582g;
            if (fFloatValue2 > fV2) {
                z9.d(eVar2, r3Var3.getValue().floatValue() > CropImageView.DEFAULT_ASPECT_RATIO ? r3Var3.getValue().floatValue() + fV2 : 0.0f, r3Var2.getValue().floatValue() < 1.0f ? r3Var2.getValue().floatValue() - fV2 : 1.0f, this.f27579d, fB, this.f27576a);
            }
            float fFloatValue3 = r3Var3.getValue().floatValue();
            x0.r3<Float> r3Var4 = this.f27583h;
            if (fFloatValue3 - r3Var4.getValue().floatValue() > CropImageView.DEFAULT_ASPECT_RATIO) {
                z9.d(eVar2, r3Var3.getValue().floatValue(), r3Var4.getValue().floatValue(), this.f27581f, fB, this.f27576a);
            }
            if (r3Var4.getValue().floatValue() > fV2) {
                z9.d(eVar2, CropImageView.DEFAULT_ASPECT_RATIO, r3Var4.getValue().floatValue() < 1.0f ? r3Var4.getValue().floatValue() - fV2 : 1.0f, this.f27579d, fB, this.f27576a);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class l extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.d f27584a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f27585b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f27586c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f27587d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ float f27588e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f27589f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f27590g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(float f10, int i10, int i11, int i12, long j10, long j11, androidx.compose.ui.d dVar) {
            super(2);
            this.f27584a = dVar;
            this.f27585b = j10;
            this.f27586c = j11;
            this.f27587d = i10;
            this.f27588e = f10;
            this.f27589f = i11;
            this.f27590g = i12;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            num.intValue();
            int iN = f3.i.n(this.f27589f | 1);
            int i10 = this.f27590g;
            z9.c(this.f27588e, this.f27587d, iN, i10, this.f27585b, this.f27586c, this.f27584a, jVar);
            return pg.f0.f21461a;
        }
    }

    public static final class m extends kotlin.jvm.internal.s implements eh.a<Float> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ eh.a<Float> f27591a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(eh.a<Float> aVar) {
            super(0);
            this.f27591a = aVar;
        }

        @Override // eh.a
        public final Float invoke() {
            return Float.valueOf(jh.j.l(this.f27591a.invoke().floatValue(), CropImageView.DEFAULT_ASPECT_RATIO, 1.0f));
        }
    }

    public static final class n extends kotlin.jvm.internal.s implements eh.l<q0.b<Float>, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final n f27592a = new n(1);

        @Override // eh.l
        public final pg.f0 invoke(q0.b<Float> bVar) {
            q0.b<Float> bVar2 = bVar;
            bVar2.f23906a = 1800;
            bVar2.a(0, Float.valueOf(CropImageView.DEFAULT_ASPECT_RATIO)).f14648b = z9.f27534f;
            bVar2.a(750, Float.valueOf(1.0f));
            return pg.f0.f21461a;
        }
    }

    public static final class o extends kotlin.jvm.internal.s implements eh.l<q0.b<Float>, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final o f27593a = new o(1);

        @Override // eh.l
        public final pg.f0 invoke(q0.b<Float> bVar) {
            q0.b<Float> bVar2 = bVar;
            bVar2.f23906a = 1800;
            bVar2.a(333, Float.valueOf(CropImageView.DEFAULT_ASPECT_RATIO)).f14648b = z9.f27535g;
            bVar2.a(1183, Float.valueOf(1.0f));
            return pg.f0.f21461a;
        }
    }

    public static final class p extends kotlin.jvm.internal.s implements eh.l<q0.b<Float>, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final p f27594a = new p(1);

        @Override // eh.l
        public final pg.f0 invoke(q0.b<Float> bVar) {
            q0.b<Float> bVar2 = bVar;
            bVar2.f23906a = 1800;
            bVar2.a(DescriptorProtos.Edition.EDITION_2023_VALUE, Float.valueOf(CropImageView.DEFAULT_ASPECT_RATIO)).f14648b = z9.f27536h;
            bVar2.a(1567, Float.valueOf(1.0f));
            return pg.f0.f21461a;
        }
    }

    public static final class q extends kotlin.jvm.internal.s implements eh.l<q0.b<Float>, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final q f27595a = new q(1);

        @Override // eh.l
        public final pg.f0 invoke(q0.b<Float> bVar) {
            q0.b<Float> bVar2 = bVar;
            bVar2.f23906a = 1800;
            bVar2.a(1267, Float.valueOf(CropImageView.DEFAULT_ASPECT_RATIO)).f14648b = z9.f27537i;
            bVar2.a(1800, Float.valueOf(1.0f));
            return pg.f0.f21461a;
        }
    }

    static {
        float f10 = 10;
        f27529a = f10;
        f27530b = androidx.compose.foundation.layout.f.j(q2.q.a(androidx.compose.ui.layout.b.a(d.a.f1143b, e.f27556a), true, f.f27557a), CropImageView.DEFAULT_ASPECT_RATIO, f10, 1);
        float f11 = v0.a0.f30194c;
        f27532d = f11;
        f27533e = v0.a0.f30195d - (f11 * 2);
        f27534f = new s.w(0.2f, CropImageView.DEFAULT_ASPECT_RATIO, 0.8f, 1.0f);
        f27535g = new s.w(0.4f, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, 1.0f);
        f27536h = new s.w(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 0.65f, 1.0f);
        f27537i = new s.w(0.1f, CropImageView.DEFAULT_ASPECT_RATIO, 0.45f, 1.0f);
        f27538j = new s.w(0.4f, CropImageView.DEFAULT_ASPECT_RATIO, 0.2f, 1.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c2 A[PHI: r14 r23
      0x01c2: PHI (r14v12 long) = (r14v10 long), (r14v13 long) binds: [B:72:0x01c0, B:69:0x01b4] A[DONT_GENERATE, DONT_INLINE]
      0x01c2: PHI (r23v2 float) = (r23v0 float), (r23v3 float) binds: [B:72:0x01c0, B:69:0x01b4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(float f10, int i10, int i11, int i12, long j10, long j11, androidx.compose.ui.d dVar, x0.j jVar) {
        androidx.compose.ui.d dVar2;
        int i13;
        long jE;
        float f11;
        int i14;
        int i15;
        int i16;
        long j12;
        int i17;
        long j13;
        float f12;
        boolean z10;
        Object objG;
        long j14;
        long j15;
        float f13;
        x0.k kVar;
        androidx.compose.ui.d dVar3;
        int i18;
        x0.h2 h2VarV;
        x0.k kVarP = jVar.p(-115871647);
        int i19 = i12 & 1;
        if (i19 != 0) {
            i13 = i11 | 6;
            dVar2 = dVar;
        } else if ((i11 & 6) == 0) {
            dVar2 = dVar;
            i13 = (kVarP.K(dVar2) ? 4 : 2) | i11;
        } else {
            dVar2 = dVar;
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            if ((i12 & 2) == 0) {
                jE = j10;
                int i20 = kVarP.j(jE) ? 32 : 16;
                i13 |= i20;
            } else {
                jE = j10;
            }
            i13 |= i20;
        } else {
            jE = j10;
        }
        int i21 = i12 & 4;
        if (i21 == 0) {
            if ((i11 & 384) == 0) {
                f11 = f10;
                i13 |= kVarP.h(f11) ? 256 : 128;
            }
            i14 = i13 | 25600;
            if ((i14 & 9363) == 9362 || !kVarP.s()) {
                kVarP.r0();
                if ((i11 & 1) != 0 || kVarP.a0()) {
                    androidx.compose.ui.d dVar4 = i19 == 0 ? d.a.f1143b : dVar2;
                    if ((i12 & 2) != 0) {
                        float f14 = y9.f27473a;
                        float f15 = v0.a0.f30192a;
                        jE = f2.e(v0.d.f30248m, kVarP);
                        i14 &= -113;
                    }
                    if (i21 != 0) {
                        f11 = y9.f27473a;
                    }
                    float f16 = y9.f27473a;
                    long j16 = q1.b1.f21653g;
                    int i22 = i14 & (-7169);
                    i15 = y9.f27475c;
                    i16 = i22;
                    j12 = j16;
                    dVar2 = dVar4;
                } else {
                    kVarP.v();
                    if ((i12 & 2) != 0) {
                        i14 &= -113;
                    }
                    int i23 = i14 & (-7169);
                    i15 = i10;
                    j12 = j11;
                    i16 = i23;
                }
                long j17 = jE;
                float f17 = f11;
                kVarP.U();
                int i24 = i15;
                s1.i iVar = new s1.i(((f3.d) kVarP.f(j2.j2.f14779h)).N0(f17), CropImageView.DEFAULT_ASPECT_RATIO, i24, 0, 26);
                s.l0 l0VarC = s.p0.c(null, kVarP, 1);
                s.o2 o2Var = s.p2.f23869b;
                s.c0 c0Var = s.d0.f23706d;
                long j18 = j12;
                l0.a aVarB = s.p0.b(l0VarC, 0, 5, o2Var, s.m.a(s.m.d(6660, 0, c0Var, 2), null, 6), null, kVarP, 33208, 16);
                l0.a aVarA = s.p0.a(l0VarC, CropImageView.DEFAULT_ASPECT_RATIO, 286.0f, s.m.a(s.m.d(1332, 0, c0Var, 2), null, 6), null, kVarP, 4536, 8);
                l0.a aVarA2 = s.p0.a(l0VarC, CropImageView.DEFAULT_ASPECT_RATIO, 290.0f, s.m.a(s.m.b(c.f27554a), null, 6), null, kVarP, 4536, 8);
                l0.a aVarA3 = s.p0.a(l0VarC, CropImageView.DEFAULT_ASPECT_RATIO, 290.0f, s.m.a(s.m.b(d.f27555a), null, 6), null, kVarP, 4536, 8);
                androidx.compose.ui.d dVarN = androidx.compose.foundation.layout.g.n(q2.q.a(dVar2, true, t.q1.f25326a), f27533e);
                boolean zJ = kVarP.j(j18) | kVarP.l(iVar) | kVarP.K(aVarB) | kVarP.K(aVarA2) | kVarP.K(aVarA3) | kVarP.K(aVarA) | ((i16 & 896) != 256);
                if (((i16 & 112) ^ 48) <= 32) {
                    i17 = i16;
                    j13 = j17;
                    if (kVarP.j(j13)) {
                        f12 = f17;
                    }
                    z10 = z | zJ;
                    objG = kVarP.g();
                    if (z10 || objG == j.a.f31715a) {
                        j14 = j13;
                        a aVar = new a(j18, iVar, aVarB, aVarA2, aVarA3, aVarA, f12, j14);
                        kVarP.C(aVar);
                        objG = aVar;
                    } else {
                        j14 = j13;
                    }
                    t.w.a(dVarN, (eh.l) objG, kVarP, 0);
                    j15 = j18;
                    f13 = f12;
                    jE = j14;
                    kVar = kVarP;
                    dVar3 = dVar2;
                    i18 = i24;
                } else {
                    i17 = i16;
                    j13 = j17;
                }
                f12 = f17;
                boolean z11 = (i17 & 48) != 32;
                z10 = z11 | zJ;
                objG = kVarP.g();
                if (z10) {
                    j14 = j13;
                    a aVar2 = new a(j18, iVar, aVarB, aVarA2, aVarA3, aVarA, f12, j14);
                    kVarP.C(aVar2);
                    objG = aVar2;
                    t.w.a(dVarN, (eh.l) objG, kVarP, 0);
                    j15 = j18;
                    f13 = f12;
                    jE = j14;
                    kVar = kVarP;
                    dVar3 = dVar2;
                    i18 = i24;
                }
            } else {
                kVarP.v();
                f13 = f11;
                kVar = kVarP;
                j15 = j11;
                dVar3 = dVar2;
                i18 = i10;
            }
            h2VarV = kVar.V();
            if (h2VarV == null) {
                h2VarV.f31703d = new b(f13, i18, i11, i12, jE, j15, dVar3);
                return;
            }
            return;
        }
        i13 |= 384;
        f11 = f10;
        i14 = i13 | 25600;
        if ((i14 & 9363) == 9362) {
            kVarP.r0();
            if ((i11 & 1) != 0) {
                if (i19 == 0) {
                }
                if ((i12 & 2) != 0) {
                }
                if (i21 != 0) {
                }
                float f162 = y9.f27473a;
                long j162 = q1.b1.f21653g;
                int i222 = i14 & (-7169);
                i15 = y9.f27475c;
                i16 = i222;
                j12 = j162;
                dVar2 = dVar4;
                long j172 = jE;
                float f172 = f11;
                kVarP.U();
                int i242 = i15;
                s1.i iVar2 = new s1.i(((f3.d) kVarP.f(j2.j2.f14779h)).N0(f172), CropImageView.DEFAULT_ASPECT_RATIO, i242, 0, 26);
                s.l0 l0VarC2 = s.p0.c(null, kVarP, 1);
                s.o2 o2Var2 = s.p2.f23869b;
                s.c0 c0Var2 = s.d0.f23706d;
                long j182 = j12;
                l0.a aVarB2 = s.p0.b(l0VarC2, 0, 5, o2Var2, s.m.a(s.m.d(6660, 0, c0Var2, 2), null, 6), null, kVarP, 33208, 16);
                l0.a aVarA4 = s.p0.a(l0VarC2, CropImageView.DEFAULT_ASPECT_RATIO, 286.0f, s.m.a(s.m.d(1332, 0, c0Var2, 2), null, 6), null, kVarP, 4536, 8);
                l0.a aVarA22 = s.p0.a(l0VarC2, CropImageView.DEFAULT_ASPECT_RATIO, 290.0f, s.m.a(s.m.b(c.f27554a), null, 6), null, kVarP, 4536, 8);
                l0.a aVarA32 = s.p0.a(l0VarC2, CropImageView.DEFAULT_ASPECT_RATIO, 290.0f, s.m.a(s.m.b(d.f27555a), null, 6), null, kVarP, 4536, 8);
                androidx.compose.ui.d dVarN2 = androidx.compose.foundation.layout.g.n(q2.q.a(dVar2, true, t.q1.f25326a), f27533e);
                boolean zJ2 = kVarP.j(j182) | kVarP.l(iVar2) | kVarP.K(aVarB2) | kVarP.K(aVarA22) | kVarP.K(aVarA32) | kVarP.K(aVarA4) | ((i16 & 896) != 256);
                if (((i16 & 112) ^ 48) <= 32) {
                }
                f12 = f172;
                if ((i17 & 48) != 32) {
                }
                z10 = z11 | zJ2;
                objG = kVarP.g();
                if (z10) {
                }
            }
        }
        h2VarV = kVar.V();
        if (h2VarV == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(eh.a<Float> aVar, androidx.compose.ui.d dVar, long j10, long j11, int i10, float f10, eh.l<? super s1.e, pg.f0> lVar, x0.j jVar, int i11, int i12) {
        float f11;
        eh.l<? super s1.e, pg.f0> lVar2;
        int i13;
        float f12;
        int i14;
        long j12;
        int i15;
        boolean z10;
        Object objG;
        eh.a aVar2;
        boolean zK;
        Object objG2;
        boolean zK2;
        int i16;
        Object iVar;
        eh.l<? super s1.e, pg.f0> lVar3;
        int i17;
        float f13;
        long j13;
        int i18;
        eh.l<? super s1.e, pg.f0> lVar4;
        x0.h2 h2VarV;
        x0.k kVarP = jVar.p(-339970038);
        int i19 = (kVarP.l(aVar) ? 4 : 2) | i11;
        if ((i11 & 48) == 0) {
            i19 |= kVarP.K(dVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i19 |= kVarP.j(j10) ? 256 : 128;
        }
        long jE = j11;
        int i20 = i19 | (((i12 & 8) == 0 && kVarP.j(jE)) ? 2048 : 1024);
        int i21 = i20 | 24576;
        int i22 = i12 & 32;
        if (i22 == 0) {
            if ((196608 & i11) == 0) {
                f11 = f10;
                i21 |= kVarP.h(f11) ? 131072 : 65536;
            }
            if ((i11 & 1572864) != 0) {
                lVar2 = lVar;
                i21 |= ((i12 & 64) == 0 && kVarP.l(lVar2)) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
            } else {
                lVar2 = lVar;
            }
            if ((i21 & 599187) == 599186 || !kVarP.s()) {
                kVarP.r0();
                i13 = i11 & 1;
                Object obj = j.a.f31715a;
                if (i13 != 0 || kVarP.a0()) {
                    if ((i12 & 8) != 0) {
                        float f14 = y9.f27473a;
                        float f15 = v0.a0.f30192a;
                        jE = f2.e(v0.d.f30252r, kVarP);
                        i21 &= -7169;
                    }
                    int i23 = y9.f27474b;
                    if (i22 != 0) {
                        f11 = y9.f27477e;
                    }
                    if ((i12 & 64) != 0) {
                        boolean z11 = (((i21 & 896) ^ 384) > 256 && kVarP.j(j10)) || (i21 & 384) == 256;
                        Object objG3 = kVarP.g();
                        if (z11 || objG3 == obj) {
                            objG3 = new g(i23, j10);
                            kVarP.C(objG3);
                        }
                        i21 &= -3670017;
                        lVar2 = (eh.l) objG3;
                    }
                    int i24 = i21;
                    f12 = f11;
                    i14 = i23;
                    j12 = jE;
                    i15 = i24;
                } else {
                    kVarP.v();
                    if ((i12 & 8) != 0) {
                        i21 &= -7169;
                    }
                    if ((i12 & 64) != 0) {
                        i21 &= -3670017;
                    }
                    j12 = jE;
                    i15 = i21;
                    f12 = f11;
                    i14 = i10;
                }
                kVarP.U();
                z10 = (i15 & 14) != 4;
                objG = kVarP.g();
                if (!z10 || objG == obj) {
                    objG = new m(aVar);
                    kVarP.C(objG);
                }
                aVar2 = (eh.a) objG;
                androidx.compose.ui.d dVarH = dVar.h(f27530b);
                zK = kVarP.K(aVar2);
                objG2 = kVarP.g();
                if (!zK || objG2 == obj) {
                    objG2 = new h(aVar2);
                    kVarP.C(objG2);
                }
                androidx.compose.ui.d dVarO = androidx.compose.foundation.layout.g.o(q2.q.a(dVarH, true, (eh.l) objG2), f27531c, f27532d);
                zK2 = ((((i15 & V4Signature.MAX_SIGNING_INFOS_SIZE) ^ 3072) <= 2048 && kVarP.j(j12)) || (i15 & 3072) == 2048) | ((458752 & i15) != 131072) | kVarP.K(aVar2) | ((((i15 & 896) ^ 384) > 256 && kVarP.j(j10)) || (i15 & 384) == 256) | ((((3670016 & i15) ^ 1572864) > 1048576 && kVarP.K(lVar2)) || (i15 & 1572864) == 1048576);
                Object objG4 = kVarP.g();
                if (zK2 || objG4 == obj) {
                    i16 = i14;
                    lVar3 = lVar2;
                    i17 = 0;
                    iVar = new i(i16, f12, aVar2, j12, j10, lVar3);
                    kVarP.C(iVar);
                } else {
                    i16 = i14;
                    iVar = objG4;
                    lVar3 = lVar2;
                    i17 = 0;
                }
                t.w.a(dVarO, (eh.l) iVar, kVarP, i17);
                f13 = f12;
                j13 = j12;
                i18 = i16;
                lVar4 = lVar3;
            } else {
                kVarP.v();
                i18 = i10;
                f13 = f11;
                j13 = jE;
                lVar4 = lVar2;
            }
            h2VarV = kVarP.V();
            if (h2VarV == null) {
                h2VarV.f31703d = new j(aVar, dVar, j10, j13, i18, f13, lVar4, i11, i12);
                return;
            }
            return;
        }
        i21 = 221184 | i20;
        f11 = f10;
        if ((i11 & 1572864) != 0) {
        }
        if ((i21 & 599187) == 599186) {
            kVarP.r0();
            i13 = i11 & 1;
            Object obj2 = j.a.f31715a;
            if (i13 != 0) {
                if ((i12 & 8) != 0) {
                }
                int i232 = y9.f27474b;
                if (i22 != 0) {
                }
                if ((i12 & 64) != 0) {
                }
                int i242 = i21;
                f12 = f11;
                i14 = i232;
                j12 = jE;
                i15 = i242;
                kVarP.U();
                if ((i15 & 14) != 4) {
                }
                objG = kVarP.g();
                if (!z10) {
                    objG = new m(aVar);
                    kVarP.C(objG);
                    aVar2 = (eh.a) objG;
                    androidx.compose.ui.d dVarH2 = dVar.h(f27530b);
                    zK = kVarP.K(aVar2);
                    objG2 = kVarP.g();
                    if (!zK) {
                        objG2 = new h(aVar2);
                        kVarP.C(objG2);
                        androidx.compose.ui.d dVarO2 = androidx.compose.foundation.layout.g.o(q2.q.a(dVarH2, true, (eh.l) objG2), f27531c, f27532d);
                        if (((i15 & V4Signature.MAX_SIGNING_INFOS_SIZE) ^ 3072) <= 2048) {
                            if (((i15 & 896) ^ 384) > 256) {
                                if (((3670016 & i15) ^ 1572864) > 1048576) {
                                    zK2 = ((((i15 & V4Signature.MAX_SIGNING_INFOS_SIZE) ^ 3072) <= 2048 && kVarP.j(j12)) || (i15 & 3072) == 2048) | ((458752 & i15) != 131072) | kVarP.K(aVar2) | ((((i15 & 896) ^ 384) > 256 && kVarP.j(j10)) || (i15 & 384) == 256) | ((((3670016 & i15) ^ 1572864) > 1048576 && kVarP.K(lVar2)) || (i15 & 1572864) == 1048576);
                                    Object objG42 = kVarP.g();
                                    if (zK2) {
                                        i16 = i14;
                                        lVar3 = lVar2;
                                        i17 = 0;
                                        iVar = new i(i16, f12, aVar2, j12, j10, lVar3);
                                        kVarP.C(iVar);
                                        t.w.a(dVarO2, (eh.l) iVar, kVarP, i17);
                                        f13 = f12;
                                        j13 = j12;
                                        i18 = i16;
                                        lVar4 = lVar3;
                                    }
                                } else {
                                    zK2 = ((((i15 & V4Signature.MAX_SIGNING_INFOS_SIZE) ^ 3072) <= 2048 && kVarP.j(j12)) || (i15 & 3072) == 2048) | ((458752 & i15) != 131072) | kVarP.K(aVar2) | ((((i15 & 896) ^ 384) > 256 && kVarP.j(j10)) || (i15 & 384) == 256) | ((((3670016 & i15) ^ 1572864) > 1048576 && kVarP.K(lVar2)) || (i15 & 1572864) == 1048576);
                                    Object objG422 = kVarP.g();
                                    if (zK2) {
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        h2VarV = kVarP.V();
        if (h2VarV == null) {
        }
    }

    public static final void c(float f10, int i10, int i11, int i12, long j10, long j11, androidx.compose.ui.d dVar, x0.j jVar) {
        int i13;
        long jE;
        long jE2;
        int i14;
        float f11;
        int i15;
        long j12;
        long j13;
        int i16;
        float f12;
        long j14;
        x0.k kVarP = jVar.p(567589233);
        if ((i11 & 6) == 0) {
            i13 = (kVarP.K(dVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            jE = j10;
            i13 |= ((i12 & 2) == 0 && kVarP.j(jE)) ? 32 : 16;
        } else {
            jE = j10;
        }
        if ((i11 & 384) == 0) {
            jE2 = j11;
            i13 |= ((i12 & 4) == 0 && kVarP.j(jE2)) ? 256 : 128;
        } else {
            jE2 = j11;
        }
        int i17 = i13 | 27648;
        if ((i17 & 9363) == 9362 && kVarP.s()) {
            kVarP.v();
            f12 = f10;
            i16 = i10;
            j14 = jE;
        } else {
            kVarP.r0();
            if ((i11 & 1) == 0 || kVarP.a0()) {
                if ((i12 & 2) != 0) {
                    float f13 = y9.f27473a;
                    float f14 = v0.a0.f30192a;
                    jE = f2.e(v0.d.f30248m, kVarP);
                    i17 &= -113;
                }
                if ((i12 & 4) != 0) {
                    float f15 = y9.f27473a;
                    float f16 = v0.a0.f30192a;
                    jE2 = f2.e(v0.d.f30252r, kVarP);
                    i17 &= -897;
                }
                i14 = y9.f27474b;
                f11 = y9.f27477e;
            } else {
                kVarP.v();
                if ((i12 & 2) != 0) {
                    i17 &= -113;
                }
                if ((i12 & 4) != 0) {
                    i17 &= -897;
                }
                f11 = f10;
                i14 = i10;
            }
            kVarP.U();
            s.l0 l0VarC = s.p0.c(null, kVarP, 1);
            l0.a aVarA = s.p0.a(l0VarC, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, s.m.a(s.m.b(n.f27592a), null, 6), null, kVarP, 4536, 8);
            l0.a aVarA2 = s.p0.a(l0VarC, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, s.m.a(s.m.b(o.f27593a), null, 6), null, kVarP, 4536, 8);
            l0.a aVarA3 = s.p0.a(l0VarC, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, s.m.a(s.m.b(p.f27594a), null, 6), null, kVarP, 4536, 8);
            l0.a aVarA4 = s.p0.a(l0VarC, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, s.m.a(s.m.b(q.f27595a), null, 6), null, kVarP, 4536, 8);
            androidx.compose.ui.d dVarO = androidx.compose.foundation.layout.g.o(q2.q.a(dVar.h(f27530b), true, t.q1.f25326a), f27531c, f27532d);
            boolean zK = ((((i17 & 896) ^ 384) > 256 && kVarP.j(jE2)) || (i17 & 384) == 256) | kVarP.K(aVarA) | kVarP.K(aVarA2) | ((((i17 & 112) ^ 48) > 32 && kVarP.j(jE)) || (i17 & 48) == 32) | kVarP.K(aVarA3) | kVarP.K(aVarA4);
            Object objG = kVarP.g();
            if (zK || objG == j.a.f31715a) {
                i15 = i14;
                j12 = jE;
                j13 = jE2;
                objG = new k(i15, f11, aVarA, j13, aVarA2, j12, aVarA3, aVarA4);
                kVarP.C(objG);
            } else {
                i15 = i14;
                j12 = jE;
                j13 = jE2;
            }
            t.w.a(dVarO, (eh.l) objG, kVarP, 0);
            i16 = i15;
            f12 = f11;
            jE2 = j13;
            j14 = j12;
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new l(f12, i16, i11, i12, j14, jE2, dVar);
        }
    }

    public static final void d(s1.e eVar, float f10, float f11, long j10, float f12, int i10) {
        float fD = p1.h.d(eVar.i());
        float fB = p1.h.b(eVar.i());
        float f13 = 2;
        float f14 = fB / f13;
        boolean z10 = eVar.getLayoutDirection() == f3.r.f8828a;
        float f15 = (z10 ? f10 : 1.0f - f11) * fD;
        float f16 = (z10 ? f11 : 1.0f - f10) * fD;
        if (i10 == 0 || fB > fD) {
            eVar.k0(j10, p1.d.a(f15, f14), p1.d.a(f16, f14), f12, (496 & 16) != 0 ? 0 : 0);
            return;
        }
        float f17 = f12 / f13;
        jh.d dVar = new jh.d(f17, fD - f17);
        float fFloatValue = ((Number) jh.j.o(Float.valueOf(f15), dVar)).floatValue();
        float fFloatValue2 = ((Number) jh.j.o(Float.valueOf(f16), dVar)).floatValue();
        if (Math.abs(f11 - f10) > CropImageView.DEFAULT_ASPECT_RATIO) {
            eVar.k0(j10, p1.d.a(fFloatValue, f14), p1.d.a(fFloatValue2, f14), f12, (496 & 16) != 0 ? 0 : i10);
        }
    }

    public static final void e(s1.e eVar, float f10, float f11, long j10, s1.i iVar) {
        float f12 = 2;
        float f13 = iVar.f24187a / f12;
        float fD = p1.h.d(eVar.i()) - (f12 * f13);
        eVar.S0(j10, f10, f11, p1.d.a(f13, f13), d0.h.a(fD, fD), iVar);
    }
}
