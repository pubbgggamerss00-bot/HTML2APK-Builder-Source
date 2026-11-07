package b3;

import com.google.android.gms.common.api.Status;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import q1.e2;
import q1.u0;
import q1.w0;
import t2.o;

/* loaded from: classes.dex */
public final class a {
    public static final void a(t2.l lVar, w0 w0Var, u0 u0Var, float f10, e2 e2Var, e3.i iVar, s1.f fVar) {
        ArrayList arrayList = lVar.f27850h;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            o oVar = (o) arrayList.get(i10);
            oVar.f27864a.l(w0Var, u0Var, f10, e2Var, iVar, fVar);
            w0Var.n(CropImageView.DEFAULT_ASPECT_RATIO, oVar.f27864a.d());
        }
    }

    public static com.google.android.gms.common.api.b b(Status status) {
        return status.f5912c != null ? new com.google.android.gms.common.api.k(status) : new com.google.android.gms.common.api.b(status);
    }

    public static Object c(Class cls, Object obj) {
        if (obj instanceof mg.a) {
            return cls.cast(obj);
        }
        if (obj instanceof mg.b) {
            return c(cls, ((mg.b) obj).generatedComponent());
        }
        throw new IllegalStateException("Given component holder " + obj.getClass() + " does not implement " + mg.a.class + " or " + mg.b.class);
    }
}
