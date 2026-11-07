package oa;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final Context f19102a;

    /* renamed from: b, reason: collision with root package name */
    public int f19103b;

    /* renamed from: c, reason: collision with root package name */
    public int f19104c = 0;

    public o(Context context) {
        this.f19102a = context;
    }

    public final synchronized int a() {
        int i10 = this.f19104c;
        if (i10 != 0) {
            return i10;
        }
        PackageManager packageManager = this.f19102a.getPackageManager();
        if (ya.d.a(this.f19102a).f34356a.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
        intent.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
        if (listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0) {
            this.f19104c = 2;
            return 2;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        this.f19104c = 2;
        return 2;
    }
}
