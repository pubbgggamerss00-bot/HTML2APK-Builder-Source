package c;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import x0.d0;
import x0.x;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final d0 f4305a = new d0(a.f4306a);

    public static final class a extends kotlin.jvm.internal.s implements eh.l<x, Activity> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f4306a = new a(1);

        @Override // eh.l
        public final Activity invoke(x xVar) {
            Context baseContext = (Context) xVar.a(AndroidCompositionLocals_androidKt.f1281b);
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    baseContext = null;
                    break;
                }
                if (baseContext instanceof Activity) {
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            return (Activity) baseContext;
        }
    }
}
