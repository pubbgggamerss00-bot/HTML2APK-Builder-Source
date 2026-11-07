package o2;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import f3.o;
import kotlin.jvm.internal.r;
import q1.e0;
import q1.n1;
import x0.j;

/* loaded from: classes.dex */
public final class a {
    public static final n1 a(int i10, j jVar) throws Resources.NotFoundException {
        Resources resourcesC = o.c(jVar);
        Object objG = jVar.g();
        j.a.C0321a c0321a = j.a.f31715a;
        if (objG == c0321a) {
            objG = new TypedValue();
            jVar.C(objG);
        }
        TypedValue typedValue = (TypedValue) objG;
        resourcesC.getValue(i10, typedValue, true);
        CharSequence charSequence = typedValue.string;
        r.b(charSequence);
        boolean zK = jVar.K(charSequence.toString());
        Object objG2 = jVar.g();
        if (zK || objG2 == c0321a) {
            Drawable drawable = resourcesC.getDrawable(i10, null);
            r.c(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
            objG2 = new e0(((BitmapDrawable) drawable).getBitmap());
            jVar.C(objG2);
        }
        return (n1) objG2;
    }
}
