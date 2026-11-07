package androidx.compose.animation;

import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import com.yalantis.ucrop.view.CropImageView;
import eh.l;
import f3.r;
import g2.g1;
import g2.k0;
import g2.l0;
import g2.m0;
import g2.o0;
import g2.p;
import g2.q;
import java.util.List;
import jh.f;
import jh.g;
import kotlin.jvm.internal.s;
import org.bouncycastle.asn1.cmc.BodyPartID;
import pg.f0;
import qg.a0;

/* loaded from: classes.dex */
public final class c implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public final AnimatedContentTransitionScopeImpl<?> f764a;

    public static final class a extends s implements l<g1.a, f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g1[] f765a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f766b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f767c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f768d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g1[] g1VarArr, c cVar, int i10, int i11) {
            super(1);
            this.f765a = g1VarArr;
            this.f766b = cVar;
            this.f767c = i10;
            this.f768d = i11;
        }

        @Override // eh.l
        public final f0 invoke(g1.a aVar) {
            g1.a aVar2 = aVar;
            for (g1 g1Var : this.f765a) {
                if (g1Var != null) {
                    long jA = this.f766b.f764a.f726b.a((g1Var.f11382a << 32) | (g1Var.f11383b & BodyPartID.bodyIdMax), (this.f767c << 32) | (this.f768d & BodyPartID.bodyIdMax), r.f8828a);
                    aVar2.d(g1Var, (int) (jA >> 32), (int) (jA & BodyPartID.bodyIdMax), CropImageView.DEFAULT_ASPECT_RATIO);
                }
            }
            return f0.f21461a;
        }
    }

    public c(AnimatedContentTransitionScopeImpl<?> animatedContentTransitionScopeImpl) {
        this.f764a = animatedContentTransitionScopeImpl;
    }

    @Override // g2.l0
    public final int c(q qVar, List<? extends p> list, int i10) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(list.get(0).O(i10));
            int i11 = qg.p.i(list);
            int i12 = 1;
            if (1 <= i11) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i12).O(i10));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i12 == i11) {
                        break;
                    }
                    i12++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // g2.l0
    public final int f(q qVar, List<? extends p> list, int i10) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(list.get(0).J(i10));
            int i11 = qg.p.i(list);
            int i12 = 1;
            if (1 <= i11) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i12).J(i10));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i12 == i11) {
                        break;
                    }
                    i12++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // g2.l0
    public final int g(q qVar, List<? extends p> list, int i10) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(list.get(0).b0(i10));
            int i11 = qg.p.i(list);
            int i12 = 1;
            if (1 <= i11) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i12).b0(i10));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i12 == i11) {
                        break;
                    }
                    i12++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // g2.l0
    public final m0 h(o0 o0Var, List<? extends k0> list, long j10) {
        g1 g1Var;
        g1 g1Var2;
        int i10;
        int i11;
        int size = list.size();
        g1[] g1VarArr = new g1[size];
        int size2 = list.size();
        long j11 = 0;
        int i12 = 0;
        while (true) {
            g1Var = null;
            if (i12 >= size2) {
                break;
            }
            k0 k0Var = list.get(i12);
            Object objW = k0Var.w();
            AnimatedContentTransitionScopeImpl.a aVar = objW instanceof AnimatedContentTransitionScopeImpl.a ? (AnimatedContentTransitionScopeImpl.a) objW : null;
            if (aVar != null && ((Boolean) aVar.f734b.getValue()).booleanValue()) {
                g1 g1VarP = k0Var.P(j10);
                long j12 = (g1VarP.f11383b & BodyPartID.bodyIdMax) | (g1VarP.f11382a << 32);
                f0 f0Var = f0.f21461a;
                g1VarArr[i12] = g1VarP;
                j11 = j12;
            }
            i12++;
        }
        int size3 = list.size();
        for (int i13 = 0; i13 < size3; i13++) {
            k0 k0Var2 = list.get(i13);
            if (g1VarArr[i13] == null) {
                g1VarArr[i13] = k0Var2.P(j10);
            }
        }
        if (o0Var.I0()) {
            i10 = (int) (j11 >> 32);
        } else {
            if (size == 0) {
                g1Var2 = null;
            } else {
                g1Var2 = g1VarArr[0];
                int i14 = size - 1;
                if (i14 != 0) {
                    int i15 = g1Var2 != null ? g1Var2.f11382a : 0;
                    f it = new g(1, i14, 1).iterator();
                    while (it.f15749c) {
                        g1 g1Var3 = g1VarArr[it.nextInt()];
                        int i16 = g1Var3 != null ? g1Var3.f11382a : 0;
                        if (i15 < i16) {
                            g1Var2 = g1Var3;
                            i15 = i16;
                        }
                    }
                }
            }
            i10 = g1Var2 != null ? g1Var2.f11382a : 0;
        }
        if (o0Var.I0()) {
            i11 = (int) (j11 & BodyPartID.bodyIdMax);
        } else {
            if (size != 0) {
                g1Var = g1VarArr[0];
                int i17 = size - 1;
                if (i17 != 0) {
                    int i18 = g1Var != null ? g1Var.f11383b : 0;
                    f it2 = new g(1, i17, 1).iterator();
                    while (it2.f15749c) {
                        g1 g1Var4 = g1VarArr[it2.nextInt()];
                        int i19 = g1Var4 != null ? g1Var4.f11383b : 0;
                        if (i18 < i19) {
                            g1Var = g1Var4;
                            i18 = i19;
                        }
                    }
                }
            }
            i11 = g1Var != null ? g1Var.f11383b : 0;
        }
        if (!o0Var.I0()) {
            this.f764a.f728d.setValue(new f3.p((i10 << 32) | (i11 & BodyPartID.bodyIdMax)));
        }
        return o0Var.i0(i10, i11, a0.f22708a, new a(g1VarArr, this, i10, i11));
    }

    @Override // g2.l0
    public final int i(q qVar, List<? extends p> list, int i10) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(list.get(0).z(i10));
            int i11 = qg.p.i(list);
            int i12 = 1;
            if (1 <= i11) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i12).z(i10));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i12 == i11) {
                        break;
                    }
                    i12++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }
}
