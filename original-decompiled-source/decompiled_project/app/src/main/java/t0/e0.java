package t0;

import com.yalantis.ucrop.view.CropImageView;
import g2.g1;
import java.util.List;
import java.util.NoSuchElementException;
import z.b;

/* loaded from: classes.dex */
public final class e0 implements g2.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ta f25739a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b.e f25740b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b.l f25741c;

    public static final class a extends kotlin.jvm.internal.s implements eh.l<g1.a, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g2.g1 f25742a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f25743b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ g2.g1 f25744c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ b.e f25745d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ long f25746e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ g2.g1 f25747f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ g2.o0 f25748g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ b.l f25749h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g2.g1 g1Var, int i10, g2.g1 g1Var2, b.e eVar, long j10, g2.g1 g1Var3, g2.o0 o0Var, b.l lVar, int i11) {
            super(1);
            this.f25742a = g1Var;
            this.f25743b = i10;
            this.f25744c = g1Var2;
            this.f25745d = eVar;
            this.f25746e = j10;
            this.f25747f = g1Var3;
            this.f25748g = o0Var;
            this.f25749h = lVar;
        }

        @Override // eh.l
        public final pg.f0 invoke(g1.a aVar) {
            int i10;
            int i11;
            g1.a aVar2 = aVar;
            g2.g1 g1Var = this.f25742a;
            int i12 = g1Var.f11383b;
            int i13 = this.f25743b;
            int i14 = 0;
            g1.a.g(aVar2, g1Var, 0, (i13 - i12) / 2);
            b.c cVar = z.b.f34448e;
            b.e eVar = this.f25745d;
            boolean zA = kotlin.jvm.internal.r.a(eVar, cVar);
            g2.g1 g1Var2 = this.f25747f;
            g2.g1 g1Var3 = this.f25744c;
            long j10 = this.f25746e;
            if (zA) {
                int i15 = f3.b.i(j10);
                int i16 = g1Var3.f11382a;
                i10 = (i15 - i16) / 2;
                int i17 = g1Var.f11382a;
                if (i10 < i17) {
                    i11 = i17 - i10;
                } else if (i16 + i10 > f3.b.i(j10) - g1Var2.f11382a) {
                    i11 = (f3.b.i(j10) - g1Var2.f11382a) - (g1Var3.f11382a + i10);
                }
                i10 += i11;
            } else {
                i10 = kotlin.jvm.internal.r.a(eVar, z.b.f34445b) ? (f3.b.i(j10) - g1Var3.f11382a) - g1Var2.f11382a : Math.max(this.f25748g.b1(g0.f25902b), g1Var.f11382a);
            }
            b.l lVar = this.f25749h;
            if (kotlin.jvm.internal.r.a(lVar, cVar)) {
                i14 = (i13 - g1Var3.f11383b) / 2;
            } else if (kotlin.jvm.internal.r.a(lVar, z.b.f34447d)) {
                i14 = i13 - g1Var3.f11383b;
            }
            g1.a.g(aVar2, g1Var3, i10, i14);
            g1.a.g(aVar2, g1Var2, f3.b.i(j10) - g1Var2.f11382a, (i13 - g1Var2.f11383b) / 2);
            return pg.f0.f21461a;
        }
    }

    public e0(ta taVar, b.e eVar, b.l lVar) {
        this.f25739a = taVar;
        this.f25740b = eVar;
        this.f25741c = lVar;
    }

    @Override // g2.l0
    public final g2.m0 h(g2.o0 o0Var, List<? extends g2.k0> list, long j10) {
        int i10;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            g2.k0 k0Var = list.get(i11);
            if (kotlin.jvm.internal.r.a(androidx.compose.ui.layout.a.a(k0Var), "navigationIcon")) {
                g2.g1 g1VarP = k0Var.P(f3.b.b(j10, 0, 0, 0, 0, 14));
                int size2 = list.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    g2.k0 k0Var2 = list.get(i12);
                    if (kotlin.jvm.internal.r.a(androidx.compose.ui.layout.a.a(k0Var2), "actionIcons")) {
                        g2.g1 g1VarP2 = k0Var2.P(f3.b.b(j10, 0, 0, 0, 0, 14));
                        if (f3.b.i(j10) == Integer.MAX_VALUE) {
                            i10 = f3.b.i(j10);
                        } else {
                            i10 = (f3.b.i(j10) - g1VarP.f11382a) - g1VarP2.f11382a;
                            if (i10 < 0) {
                                i10 = 0;
                            }
                        }
                        int i13 = i10;
                        int size3 = list.size();
                        for (int i14 = 0; i14 < size3; i14++) {
                            g2.k0 k0Var3 = list.get(i14);
                            if (kotlin.jvm.internal.r.a(androidx.compose.ui.layout.a.a(k0Var3), "title")) {
                                g2.g1 g1VarP3 = k0Var3.P(f3.b.b(j10, 0, i13, 0, 0, 12));
                                g2.o oVar = g2.b.f11315b;
                                int iQ = g1VarP3.Q(oVar) != Integer.MIN_VALUE ? g1VarP3.Q(oVar) : 0;
                                this.f25739a.getClass();
                                int iH = f3.b.h(j10) == Integer.MAX_VALUE ? f3.b.h(j10) : f3.b.h(j10) + (Float.isNaN(CropImageView.DEFAULT_ASPECT_RATIO) ? 0 : gh.a.b(CropImageView.DEFAULT_ASPECT_RATIO));
                                return o0Var.i0(f3.b.i(j10), iH, qg.a0.f22708a, new a(g1VarP, iH, g1VarP3, this.f25740b, j10, g1VarP2, o0Var, this.f25741c, iQ));
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
