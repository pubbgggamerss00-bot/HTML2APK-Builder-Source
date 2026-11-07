package k8;

import android.content.Context;
import kotlin.jvm.internal.r;
import sh.a1;
import sh.l0;
import sh.z0;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final z0 f16136a;

    /* renamed from: b, reason: collision with root package name */
    public static final l0 f16137b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f16138c;

    static {
        z0 z0VarA = a1.a(Boolean.FALSE);
        f16136a = z0VarA;
        f16137b = gg.a.a(z0VarA);
    }

    public static void a(Context context) {
        r.e(context, "context");
        if (f16138c) {
            return;
        }
        Boolean boolValueOf = Boolean.valueOf(context.getSharedPreferences("cat_world_unlock_prefs", 0).getBoolean("is_cat_world_unlocked", false));
        z0 z0Var = f16136a;
        z0Var.getClass();
        z0Var.j(null, boolValueOf);
        f16138c = true;
    }

    public static l0 b() {
        return f16137b;
    }
}
