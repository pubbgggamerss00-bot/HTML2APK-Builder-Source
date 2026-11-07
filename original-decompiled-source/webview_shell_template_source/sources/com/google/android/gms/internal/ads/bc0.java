package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;
import com.google.android.gms.ads.internal.util.zze;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class bc0 extends MutableContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    public Activity f3029a;

    /* renamed from: b, reason: collision with root package name */
    public Context f3030b;

    /* renamed from: c, reason: collision with root package name */
    public Context f3031c;

    public final void a(Intent intent) {
        if (this.f3029a == null) {
            intent.setFlags(268435456);
            this.f3030b.startActivity(intent);
            return;
        }
        zze.zza("Starting activity for result with intent: " + String.valueOf(intent.getData()) + " and requestCode: 236");
        this.f3029a.startActivityForResult(intent, 236);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        return this.f3031c.getSystemService(str);
    }

    @Override // android.content.MutableContextWrapper
    public final void setBaseContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f3030b = applicationContext;
        this.f3029a = context instanceof Activity ? (Activity) context : null;
        this.f3031c = context;
        super.setBaseContext(applicationContext);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        Activity activity = this.f3029a;
        if (activity != null) {
            activity.startActivity(intent);
        } else {
            intent.setFlags(268435456);
            this.f3030b.startActivity(intent);
        }
    }
}
