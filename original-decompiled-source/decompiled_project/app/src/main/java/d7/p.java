package d7;

import android.content.ComponentName;
import android.content.Context;
import android.util.Log;
import androidx.datastore.preferences.protobuf.y0;
import t6.s;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final String f7392a = t6.s.f("PackageManagerHelper");

    public static void a(Context context, Class<?> cls, boolean z10) {
        String str = f7392a;
        try {
            int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, cls.getName()));
            boolean z11 = false;
            if (componentEnabledSetting != 0 && componentEnabledSetting == 1) {
                z11 = true;
            }
            if (z10 == z11) {
                t6.s.d().a(str, "Skipping component enablement for ".concat(cls.getName()));
                return;
            }
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z10 ? 1 : 2, 1);
            t6.s sVarD = t6.s.d();
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getName());
            sb.append(" ");
            sb.append(z10 ? "enabled" : "disabled");
            sVarD.a(str, sb.toString());
        } catch (Exception e10) {
            t6.s sVarD2 = t6.s.d();
            StringBuilder sb2 = new StringBuilder();
            y0.a(cls, sb2, "could not be ");
            sb2.append(z10 ? "enabled" : "disabled");
            String string = sb2.toString();
            if (((s.a) sVarD2).f28051c <= 3) {
                Log.d(str, string, e10);
            }
        }
    }
}
