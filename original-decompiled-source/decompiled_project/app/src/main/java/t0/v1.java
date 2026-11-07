package t0;

import com.yalantis.ucrop.view.CropImageView;
import g2.g1;
import java.util.List;
import java.util.NoSuchElementException;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* loaded from: classes.dex */
public final class v1 implements g2.l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final v1 f27206a = new v1();

    public static final class a extends kotlin.jvm.internal.s implements eh.l<g1.a, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g2.g1 f27207a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f27208b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f27209c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ g2.g1 f27210d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f27211e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ g2.g1 f27212f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f27213g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g2.g1 g1Var, int i10, int i11, g2.g1 g1Var2, int i12, g2.g1 g1Var3, int i13) {
            super(1);
            this.f27207a = g1Var;
            this.f27208b = i10;
            this.f27209c = i11;
            this.f27210d = g1Var2;
            this.f27211e = i12;
            this.f27212f = g1Var3;
            this.f27213g = i13;
        }

        @Override // eh.l
        public final pg.f0 invoke(g1.a aVar) {
            g1.a aVar2 = aVar;
            int i10 = this.f27209c;
            g2.g1 g1Var = this.f27207a;
            if (g1Var != null) {
                g1.a.g(aVar2, g1Var, 0, org.bouncycastle.asn1.x509.a.a(1, CropImageView.DEFAULT_ASPECT_RATIO, (i10 - this.f27208b) / 2.0f));
            }
            g2.g1 g1Var2 = this.f27210d;
            int i11 = this.f27211e;
            g1.a.g(aVar2, g1Var2, i11, 0);
            g2.g1 g1Var3 = this.f27212f;
            if (g1Var3 != null) {
                g1.a.g(aVar2, g1Var3, i11 + g1Var2.f11382a, org.bouncycastle.asn1.x509.a.a(1, CropImageView.DEFAULT_ASPECT_RATIO, (i10 - this.f27213g) / 2.0f));
            }
            return pg.f0.f21461a;
        }
    }

    @Override // g2.l0
    public final g2.m0 h(g2.o0 o0Var, List<? extends g2.k0> list, long j10) {
        g2.k0 k0Var;
        g2.k0 k0Var2;
        int size = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                k0Var = null;
                break;
            }
            k0Var = list.get(i10);
            if (kotlin.jvm.internal.r.a(androidx.compose.ui.layout.a.a(k0Var), "leadingIcon")) {
                break;
            }
            i10++;
        }
        g2.k0 k0Var3 = k0Var;
        g2.g1 g1VarP = k0Var3 != null ? k0Var3.P(f3.b.b(j10, 0, 0, 0, 0, 10)) : null;
        float f10 = u0.t1.f29148b;
        int i11 = g1VarP != null ? g1VarP.f11382a : 0;
        int i12 = g1VarP != null ? g1VarP.f11383b : 0;
        int size2 = list.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size2) {
                k0Var2 = null;
                break;
            }
            k0Var2 = list.get(i13);
            if (kotlin.jvm.internal.r.a(androidx.compose.ui.layout.a.a(k0Var2), "trailingIcon")) {
                break;
            }
            i13++;
        }
        g2.k0 k0Var4 = k0Var2;
        g2.g1 g1VarP2 = k0Var4 != null ? k0Var4.P(f3.b.b(j10, 0, 0, 0, 0, 10)) : null;
        int i14 = g1VarP2 != null ? g1VarP2.f11382a : 0;
        int i15 = g1VarP2 != null ? g1VarP2.f11383b : 0;
        int size3 = list.size();
        int i16 = 0;
        while (i16 < size3) {
            g2.k0 k0Var5 = list.get(i16);
            if (kotlin.jvm.internal.r.a(androidx.compose.ui.layout.a.a(k0Var5), AnnotatedPrivateKey.LABEL)) {
                g2.g1 g1VarP3 = k0Var5.P(f3.c.j(-(i11 + i14), 0, 2, j10));
                int i17 = g1VarP3.f11382a + i11 + i14;
                int iMax = Math.max(i12, Math.max(g1VarP3.f11383b, i15));
                return o0Var.i0(i17, iMax, qg.a0.f22708a, new a(g1VarP, i12, iMax, g1VarP3, i11, g1VarP2, i15));
            }
            i16++;
            g1VarP = g1VarP;
            i11 = i11;
            i12 = i12;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
