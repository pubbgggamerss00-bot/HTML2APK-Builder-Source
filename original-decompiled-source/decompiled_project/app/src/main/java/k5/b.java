package k5;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.b1;
import androidx.lifecycle.d1;
import x0.j;
import x0.m0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final m0 f16000a = new m0(new a(0));

    public static b1 a(j jVar) {
        b1 b1VarA = (b1) jVar.f(f16000a);
        if (b1VarA == null) {
            jVar.L(1260197609);
            b1VarA = d1.a((View) jVar.f(AndroidCompositionLocals_androidKt.f1285f));
        } else {
            jVar.L(1260196493);
        }
        jVar.B();
        return b1VarA;
    }
}
