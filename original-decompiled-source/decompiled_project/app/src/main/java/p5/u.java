package p5;

import android.content.Context;
import android.content.ContextWrapper;

/* loaded from: classes.dex */
public final /* synthetic */ class u implements eh.l {
    @Override // eh.l
    public final Object invoke(Object obj) {
        Context it = (Context) obj;
        kotlin.jvm.internal.r.e(it, "it");
        if (it instanceof ContextWrapper) {
            return ((ContextWrapper) it).getBaseContext();
        }
        return null;
    }
}
