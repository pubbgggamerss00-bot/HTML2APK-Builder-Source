package sc;

import ed.f0;
import ed.i0;
import ed.j0;
import ed.o0;
import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f24835a = 0;

    static {
        Charset.forName("UTF-8");
    }

    public static j0 a(i0 i0Var) {
        j0.a aVarZ = j0.z();
        int iB = i0Var.B();
        aVarZ.e();
        j0.w((j0) aVarZ.f6808b, iB);
        for (i0.b bVar : i0Var.A()) {
            j0.b.a aVarB = j0.b.B();
            String strB = bVar.A().B();
            aVarB.e();
            j0.b.w((j0.b) aVarB.f6808b, strB);
            f0 f0VarD = bVar.D();
            aVarB.e();
            j0.b.y((j0.b) aVarB.f6808b, f0VarD);
            o0 o0VarC = bVar.C();
            aVarB.e();
            j0.b.x((j0.b) aVarB.f6808b, o0VarC);
            int iB2 = bVar.B();
            aVarB.e();
            j0.b.z((j0.b) aVarB.f6808b, iB2);
            j0.b bVarB = aVarB.b();
            aVarZ.e();
            j0.x((j0) aVarZ.f6808b, bVarB);
        }
        return aVarZ.b();
    }
}
