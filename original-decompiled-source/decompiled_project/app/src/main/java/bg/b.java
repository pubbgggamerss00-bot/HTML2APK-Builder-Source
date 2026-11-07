package bg;

import androidx.room.z0;
import com.yalantis.ucrop.view.CropImageView;
import eh.p;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.r;
import pg.f0;
import ph.k1;
import sh.m0;
import sh.y0;
import tg.h;
import tg.i;
import x0.g0;
import x0.i0;
import x0.i3;
import x0.j;
import x0.j3;
import x0.k3;
import x0.l3;
import x0.n1;
import x0.n3;
import x0.o0;
import x0.o3;
import x0.u3;
import x0.x1;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f4215a = 0;

    public static final n1 a(sh.f fVar, Object obj, h hVar, j jVar, int i10, int i11) {
        if ((i11 & 2) != 0) {
            hVar = i.f28768a;
        }
        h hVar2 = hVar;
        boolean zL = jVar.l(hVar2) | jVar.l(fVar);
        Object objG = jVar.g();
        if (zL || objG == j.a.f31715a) {
            objG = new n3(hVar2, fVar, null);
            jVar.C(objG);
        }
        return j(obj, fVar, hVar2, (p) objG, jVar, ((i10 >> 3) & 14) | (i10 & 896));
    }

    public static final n1 b(y0 y0Var, j jVar) {
        return a(y0Var, y0Var.getValue(), i.f28768a, jVar, 0, 0);
    }

    public static final z0.b c() {
        f1.i<z0.b<i0>> iVar = j3.f31727b;
        z0.b<i0> bVarA = iVar.a();
        if (bVarA != null) {
            return bVarA;
        }
        z0.b<i0> bVar = new z0.b<>(new i0[0]);
        iVar.b(bVar);
        return bVar;
    }

    public static final g0 d(eh.a aVar) {
        f1.i<f1.d> iVar = j3.f31726a;
        return new g0(aVar, null);
    }

    public static final g0 e(eh.a aVar, i3 i3Var) {
        f1.i<f1.d> iVar = j3.f31726a;
        return new g0(aVar, i3Var);
    }

    public static float f(float f10, float f11, float f12) {
        float f13 = f10 / (f12 / 2.0f);
        float f14 = f11 / 2.0f;
        if (f13 < 1.0f) {
            return (f14 * f13 * f13 * f13) + CropImageView.DEFAULT_ASPECT_RATIO;
        }
        float f15 = f13 - 2.0f;
        return (((f15 * f15 * f15) + 2.0f) * f14) + CropImageView.DEFAULT_ASPECT_RATIO;
    }

    public static final ph.g0 g(Executor executor) {
        ph.g0 g0Var;
        ph.y0 y0Var = executor instanceof ph.y0 ? (ph.y0) executor : null;
        return (y0Var == null || (g0Var = y0Var.f21610a) == null) ? new k1(executor) : g0Var;
    }

    public static x1 h(Object obj) {
        return new x1(obj, u3.f31923a);
    }

    public static final n1 i(p pVar, Object obj, j jVar) {
        Object objG = jVar.g();
        j.a.C0321a c0321a = j.a.f31715a;
        if (objG == c0321a) {
            objG = h(obj);
            jVar.C(objG);
        }
        n1 n1Var = (n1) objG;
        f0 f0Var = f0.f21461a;
        boolean zL = jVar.l(pVar);
        Object objG2 = jVar.g();
        if (zL || objG2 == c0321a) {
            objG2 = new k3(pVar, n1Var, null);
            jVar.C(objG2);
        }
        o0.d((p) objG2, f0Var, jVar);
        return n1Var;
    }

    public static final n1 j(Object obj, Object obj2, Object obj3, p pVar, j jVar, int i10) {
        Object objG = jVar.g();
        j.a.C0321a c0321a = j.a.f31715a;
        if (objG == c0321a) {
            objG = h(obj);
            jVar.C(objG);
        }
        n1 n1Var = (n1) objG;
        boolean zL = jVar.l(pVar);
        Object objG2 = jVar.g();
        if (zL || objG2 == c0321a) {
            objG2 = new l3(pVar, n1Var, null);
            jVar.C(objG2);
        }
        o0.e(obj2, obj3, (p) objG2, jVar);
        return n1Var;
    }

    public static final n1 k(Object obj, j jVar) {
        Object objG = jVar.g();
        if (objG == j.a.f31715a) {
            objG = h(obj);
            jVar.C(objG);
        }
        n1 n1Var = (n1) objG;
        n1Var.setValue(obj);
        return n1Var;
    }

    public static final m0 l(eh.a aVar) {
        return new m0(new o3(aVar, null));
    }

    public static final void m(String str, kh.c baseClass) {
        String string;
        r.e(baseClass, "baseClass");
        String str2 = "in the polymorphic scope of '" + baseClass.e() + '\'';
        if (str == null) {
            string = "Class discriminator was missing and no default serializers were registered " + str2 + '.';
        } else {
            StringBuilder sbA = androidx.room.y0.a("Serializer for subclass '", str, "' is not found ", str2, ".\nCheck if class with serial name '");
            z0.a(sbA, str, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", str, "' has to be '@Serializable', and the base class '");
            sbA.append(baseClass.e());
            sbA.append("' has to be sealed and '@Serializable'.");
            string = sbA.toString();
        }
        throw new zh.h(string);
    }
}
