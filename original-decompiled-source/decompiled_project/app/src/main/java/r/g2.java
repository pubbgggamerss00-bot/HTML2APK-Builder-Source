package r;

import com.yalantis.ucrop.view.CropImageView;
import x0.j;
import x0.r3;

/* loaded from: classes.dex */
public final class g2 {

    /* renamed from: a, reason: collision with root package name */
    public static final s.l1<q1.b1> f22831a = s.m.c(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, 7);

    public static final r3 a(long j10, s.e0 e0Var, String str, x0.j jVar, int i10, int i11) {
        if ((i11 & 2) != 0) {
            e0Var = f22831a;
        }
        s.e0 e0Var2 = e0Var;
        if ((i11 & 4) != 0) {
            str = "ColorAnimation";
        }
        String str2 = str;
        boolean zK = jVar.K(q1.b1.g(j10));
        Object objG = jVar.g();
        if (zK || objG == j.a.f31715a) {
            objG = (s.n2) m0.f22884a.invoke(q1.b1.g(j10));
            jVar.C(objG);
        }
        return s.g.c(new q1.b1(j10), (s.n2) objG, e0Var2, null, str2, jVar, ((i10 << 3) & 896) | ((i10 << 6) & 57344), 8);
    }
}
