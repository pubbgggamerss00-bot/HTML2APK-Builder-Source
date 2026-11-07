package j2;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import com.basitce.htmltoapk.R;
import java.util.LinkedHashMap;
import tg.h;

/* loaded from: classes.dex */
public final class a6 {

    /* renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f14646a = new LinkedHashMap();

    public static final sh.y0 a(Context context) {
        sh.y0 y0Var;
        LinkedHashMap linkedHashMap = f14646a;
        synchronized (linkedHashMap) {
            try {
                Object objI = linkedHashMap.get(context);
                if (objI == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    rh.c cVarA = rh.k.a(-1, 6, null);
                    sh.m0 m0Var = new sh.m0(new y5(contentResolver, uriFor, new z5(cVarA, Handler.createAsync(Looper.getMainLooper())), cVarA, context, null));
                    ph.n2 n2VarA = ah.l.a();
                    wh.c cVar = ph.z0.f21632a;
                    objI = gg.a.i(m0Var, new uh.c(h.a.C0291a.c(n2VarA, uh.o.f29764a)), sh.u0.a(3), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    linkedHashMap.put(context, objI);
                }
                y0Var = (sh.y0) objI;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return y0Var;
    }

    public static final x0.s b(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof x0.s) {
            return (x0.s) tag;
        }
        return null;
    }
}
