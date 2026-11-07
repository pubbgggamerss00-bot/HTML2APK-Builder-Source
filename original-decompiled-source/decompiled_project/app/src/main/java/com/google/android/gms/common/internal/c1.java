package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class c1 {

    /* renamed from: d, reason: collision with root package name */
    public static final Uri f6086d = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a, reason: collision with root package name */
    public final String f6087a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6088b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6089c;

    public c1(String str, String str2, boolean z10) {
        p.d(str);
        this.f6087a = str;
        p.d(str2);
        this.f6088b = str2;
        this.f6089c = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a2 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Intent a(Context context) throws q0, RemoteException {
        Bundle bundleCall;
        PendingIntent pendingIntent;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient;
        Intent intent = null;
        String str = this.f6087a;
        if (str == null) {
            return new Intent().setComponent(null);
        }
        if (this.f6089c) {
            Bundle bundle = new Bundle();
            bundle.putString("serviceActionBundleKey", str);
            try {
                contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(f6086d);
            } catch (RemoteException e10) {
                e = e10;
                bundleCall = null;
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e.toString()));
                if (bundleCall == null) {
                }
                if (intent == null) {
                }
                if (intent == null) {
                }
            } catch (IllegalArgumentException e11) {
                e = e11;
                bundleCall = null;
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e.toString()));
                if (bundleCall == null) {
                }
                if (intent == null) {
                }
                if (intent == null) {
                }
            }
            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                throw new RemoteException("Failed to acquire ContentProviderClient");
            }
            try {
                bundleCall = contentProviderClientAcquireUnstableContentProviderClient.call("serviceIntentCall", null, bundle);
                try {
                } catch (RemoteException e12) {
                    e = e12;
                    Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e.toString()));
                    if (bundleCall == null) {
                    }
                    if (intent == null) {
                    }
                    if (intent == null) {
                    }
                } catch (IllegalArgumentException e13) {
                    e = e13;
                    Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e.toString()));
                    if (bundleCall == null) {
                    }
                    if (intent == null) {
                    }
                    if (intent == null) {
                    }
                }
                if (bundleCall == null && (intent = (Intent) bundleCall.getParcelable("serviceResponseIntentKey")) == null && (pendingIntent = (PendingIntent) bundleCall.getParcelable("serviceMissingResolutionIntentKey")) != null) {
                    Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action " + str + " but has possible resolution");
                    throw new q0(new pa.a(25, pendingIntent));
                }
                if (intent == null) {
                    Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(str));
                }
            } finally {
                contentProviderClientAcquireUnstableContentProviderClient.release();
            }
        }
        return intent == null ? new Intent(str).setPackage(this.f6088b) : intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return o.a(this.f6087a, c1Var.f6087a) && o.a(this.f6088b, c1Var.f6088b) && o.a(null, null) && this.f6089c == c1Var.f6089c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6087a, this.f6088b, null, 4225, Boolean.valueOf(this.f6089c)});
    }

    public final String toString() {
        String str = this.f6087a;
        if (str != null) {
            return str;
        }
        p.f(null);
        throw null;
    }
}
