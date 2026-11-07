package m0;

import androidx.compose.ui.d;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.yalantis.ucrop.view.CropImageView;
import i0.k4;
import i0.l4;
import org.bouncycastle.asn1.cmc.BodyPartID;
import x0.j;

/* loaded from: classes.dex */
public final class d3 {

    public static final class a implements w {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x2 f17286a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f17287b;

        public a(x2 x2Var, boolean z10) {
            this.f17286a = x2Var;
            this.f17287b = z10;
        }

        @Override // m0.w
        public final long a() {
            return this.f17286a.j(this.f17287b);
        }
    }

    public static final class b implements PointerInputEventHandler {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i0.b3 f17288a;

        public b(i0.b3 b3Var) {
            this.f17288a = b3Var;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(c2.j0 j0Var, tg.e<? super pg.f0> eVar) {
            Object objA = i0.m2.a(j0Var, this.f17288a, eVar);
            return objA == ug.a.f29706a ? objA : pg.f0.f21461a;
        }
    }

    public static final class c extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f17289a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e3.g f17290b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x2 f17291c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f17292d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z10, e3.g gVar, x2 x2Var, int i10) {
            super(2);
            this.f17289a = z10;
            this.f17290b = gVar;
            this.f17291c = x2Var;
            this.f17292d = i10;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            num.intValue();
            int iN = f3.i.n(this.f17292d | 1);
            d3.a(this.f17289a, this.f17290b, this.f17291c, jVar, iN);
            return pg.f0.f21461a;
        }
    }

    public /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17293a;

        static {
            int[] iArr = new int[i0.u1.values().length];
            try {
                i0.u1 u1Var = i0.u1.f13615a;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                i0.u1 u1Var2 = i0.u1.f13615a;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                i0.u1 u1Var3 = i0.u1.f13615a;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f17293a = iArr;
        }
    }

    public static final void a(boolean z10, e3.g gVar, x2 x2Var, x0.j jVar, int i10) {
        int i11;
        l4 l4VarD;
        x0.k kVarP = jVar.p(-1344558920);
        if ((i10 & 6) == 0) {
            i11 = (kVarP.c(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= kVarP.K(gVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= kVarP.l(x2Var) ? 256 : 128;
        }
        if (kVarP.A(i11 & 1, (i11 & 147) != 146)) {
            int i12 = i11 & 14;
            boolean zK = (i12 == 4) | kVarP.K(x2Var);
            Object objG = kVarP.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (zK || objG == c0321a) {
                objG = new w2(x2Var, z10);
                kVarP.C(objG);
            }
            i0.b3 b3Var = (i0.b3) objG;
            boolean zL = kVarP.l(x2Var) | (i12 == 4);
            Object objG2 = kVarP.g();
            if (zL || objG2 == c0321a) {
                objG2 = new a(x2Var, z10);
                kVarP.C(objG2);
            }
            w wVar = (w) objG2;
            boolean zF = t2.j0.f(x2Var.k().f33683b);
            int i13 = (int) (z10 ? x2Var.k().f33683b >> 32 : x2Var.k().f33683b & BodyPartID.bodyIdMax);
            i0.i2 i2Var = x2Var.f17550d;
            float fA = (i2Var == null || (l4VarD = i2Var.d()) == null) ? CropImageView.DEFAULT_ASPECT_RATIO : k4.a(l4VarD.f13418a, i13);
            boolean zL2 = kVarP.l(b3Var);
            Object objG3 = kVarP.g();
            if (zL2 || objG3 == c0321a) {
                objG3 = new b(b3Var);
                kVarP.C(objG3);
            }
            g.b(wVar, z10, gVar, zF, 0L, fA, c2.s0.a(d.a.f1143b, b3Var, (PointerInputEventHandler) objG3), kVarP, (i11 << 3) & 1008);
        } else {
            kVarP.v();
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new c(z10, gVar, x2Var, i10);
        }
    }

    public static final boolean b(x2 x2Var, boolean z10) {
        g2.v vVarC;
        i0.i2 i2Var = x2Var.f17550d;
        if (i2Var == null || (vVarC = i2Var.c()) == null) {
            return false;
        }
        return a2.a(a2.c(vVarC), x2Var.j(z10));
    }
}
