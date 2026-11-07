package id;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import ne.g;

/* loaded from: classes2.dex */
public final /* synthetic */ class f implements g.a {
    @Override // ne.g.a
    public final String a(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
    }
}
