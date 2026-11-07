package m0;

import androidx.compose.ui.d;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.yalantis.ucrop.view.CropImageView;
import java.util.List;
import m0.w0;
import m0.z;
import x0.j;

/* loaded from: classes.dex */
public final class p0 extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f1.b f17446a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r1 f17447b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(f1.b bVar, r1 r1Var) {
        super(2);
        this.f17446a = bVar;
        this.f17447b = r1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0138  */
    @Override // eh.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        z.a aVar;
        x xVarC;
        z.a aVar2;
        x xVarC2;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        if (jVar2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
            this.f17446a.invoke(jVar2, 0);
            r1 r1Var = this.f17447b;
            if (r1Var.g() && ((Boolean) r1Var.f17477i.getValue()).booleanValue()) {
                z zVarE = r1Var.e();
                if (!(zVarE != null ? kotlin.jvm.internal.r.a(zVarE.f17593a, zVarE.f17594b) : true)) {
                    jVar2.L(-881553831);
                    z zVarE2 = r1Var.e();
                    if (zVarE2 == null) {
                        jVar2.L(-881514989);
                    } else {
                        jVar2.L(-881514988);
                        jVar2.L(1495586214);
                        List listJ = qg.p.j(Boolean.TRUE, Boolean.FALSE);
                        int size = listJ.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            boolean zBooleanValue = ((Boolean) listJ.get(i10)).booleanValue();
                            boolean zC = jVar2.c(zBooleanValue);
                            Object objG = jVar2.g();
                            j.a.C0321a c0321a = j.a.f31715a;
                            if (zC || objG == c0321a) {
                                objG = new t1(zBooleanValue, r1Var);
                                jVar2.C(objG);
                            }
                            i0.b3 b3Var = (i0.b3) objG;
                            boolean zC2 = jVar2.c(zBooleanValue);
                            Object objG2 = jVar2.g();
                            if (zC2 || objG2 == c0321a) {
                                objG2 = zBooleanValue ? new n0(r1Var) : new o0(r1Var);
                                jVar2.C(objG2);
                            }
                            eh.a aVar3 = (eh.a) objG2;
                            e3.g gVar = zBooleanValue ? zVarE2.f17593a.f17596a : zVarE2.f17594b.f17596a;
                            float fG = CropImageView.DEFAULT_ASPECT_RATIO;
                            if (zBooleanValue) {
                                z zVarE3 = r1Var.e();
                                if (zVarE3 != null && (xVarC2 = r1Var.c((aVar2 = zVarE3.f17593a))) != null) {
                                    fG = xVarC2.g(aVar2.f17597b);
                                }
                            } else {
                                z zVarE4 = r1Var.e();
                                if (zVarE4 != null && (xVarC = r1Var.c((aVar = zVarE4.f17594b))) != null) {
                                    fG = xVarC.g(aVar.f17597b);
                                }
                            }
                            float f10 = fG;
                            e3.g gVar2 = gVar;
                            w0.a aVar4 = new w0.a(aVar3);
                            boolean z10 = zVarE2.f17595c;
                            boolean zL = jVar2.l(b3Var);
                            Object objG3 = jVar2.g();
                            if (zL || objG3 == c0321a) {
                                objG3 = new m0(b3Var);
                                jVar2.C(objG3);
                            }
                            g.b(aVar4, zBooleanValue, gVar2, z10, 0L, f10, c2.s0.a(d.a.f1143b, b3Var, (PointerInputEventHandler) objG3), jVar2, 0);
                        }
                        jVar2.B();
                    }
                    jVar2.B();
                    jVar2.B();
                }
            } else {
                jVar2.L(-879541497);
                jVar2.B();
            }
        } else {
            jVar2.v();
        }
        return pg.f0.f21461a;
    }
}
