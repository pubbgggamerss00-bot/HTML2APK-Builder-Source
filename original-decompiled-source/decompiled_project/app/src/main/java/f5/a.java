package f5;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.b1;
import androidx.lifecycle.i;
import androidx.lifecycle.z0;
import b.k;
import ig.b;
import kotlin.jvm.internal.r;
import x0.j;

/* loaded from: classes.dex */
public final class a {
    public static final b a(b1 b1Var, j jVar) {
        b bVarD;
        jVar.e(1770922558);
        if (b1Var instanceof i) {
            Context context = (Context) jVar.f(AndroidCompositionLocals_androidKt.f1281b);
            z0.c delegateFactory = ((i) b1Var).getDefaultViewModelProviderFactory();
            r.e(context, "context");
            r.e(delegateFactory, "delegateFactory");
            while (context instanceof ContextWrapper) {
                if (context instanceof k) {
                    bVarD = b.d((k) context, delegateFactory);
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                    r.d(context, "ctx.baseContext");
                }
            }
            throw new IllegalStateException("Expected an activity context for creating a HiltViewModelFactory but instead found: " + context);
        }
        bVarD = null;
        jVar.G();
        return bVarD;
    }
}
