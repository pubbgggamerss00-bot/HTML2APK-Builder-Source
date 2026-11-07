package i2;

import android.view.View;

/* loaded from: classes.dex */
public final class l {
    public static final View a(j jVar) {
        if (!jVar.B().f1157p) {
            f2.a.b("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) i0.a(k.f(jVar));
    }
}
