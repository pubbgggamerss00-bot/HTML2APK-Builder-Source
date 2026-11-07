package d4;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7365a;

    public x(Context context) {
        kotlin.jvm.internal.r.e(context, "context");
        this.f7365a = context;
    }

    public static w a(x xVar, Object obj) {
        if ((obj instanceof k) || obj.equals("androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL")) {
            return xVar.b();
        }
        if (obj instanceof x0) {
            for (v vVar : ((x0) obj).f7366a) {
                if ((vVar instanceof c1) || (vVar instanceof a1)) {
                    return xVar.b();
                }
            }
        } else {
            if (obj instanceof h1) {
                return xVar.b();
            }
            if (obj instanceof e) {
                return xVar.b();
            }
        }
        Context ctx = xVar.f7365a;
        kotlin.jvm.internal.r.e(ctx, "ctx");
        if (ctx.getPackageManager().hasSystemFeature("android.software.leanback") || ctx.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return xVar.b();
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            s0 s0Var = new s0(ctx);
            s0 s0Var2 = s0Var.isAvailableOnDevice() ? s0Var : null;
            return s0Var2 == null ? xVar.b() : s0Var2;
        }
        if (i10 <= 33) {
            return xVar.b();
        }
        return null;
    }

    public final w b() throws PackageManager.NameNotFoundException {
        String string;
        Context context = this.f7365a;
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 132);
        ArrayList arrayList = new ArrayList();
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                Bundle bundle = serviceInfo.metaData;
                if (bundle != null && (string = bundle.getString("androidx.credentials.CREDENTIAL_PROVIDER_KEY")) != null) {
                    arrayList.add(string);
                }
            }
        }
        List listC0 = qg.x.c0(arrayList);
        if (listC0.isEmpty()) {
            return null;
        }
        Iterator it = listC0.iterator();
        w wVar = null;
        while (it.hasNext()) {
            try {
                Object objNewInstance = Class.forName((String) it.next()).getConstructor(Context.class).newInstance(context);
                kotlin.jvm.internal.r.c(objNewInstance, "null cannot be cast to non-null type androidx.credentials.CredentialProvider");
                w wVar2 = (w) objNewInstance;
                if (!wVar2.isAvailableOnDevice()) {
                    continue;
                } else {
                    if (wVar != null) {
                        Log.i("CredProviderFactory", "Only one active OEM CredentialProvider allowed");
                        return null;
                    }
                    wVar = wVar2;
                }
            } catch (Throwable unused) {
            }
        }
        return wVar;
    }
}
