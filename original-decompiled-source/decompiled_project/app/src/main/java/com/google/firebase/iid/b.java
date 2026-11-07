package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import de.n;
import de.r;
import id.e;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final long f6896a;

    /* renamed from: b, reason: collision with root package name */
    public final PowerManager.WakeLock f6897b;

    /* renamed from: c, reason: collision with root package name */
    public final FirebaseInstanceId f6898c;

    public static class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        public b f6899a;

        public final void a() {
            com.google.firebase.iid.a aVar = FirebaseInstanceId.f6877j;
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "Connectivity change received registered");
            }
            this.f6899a.a().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            b bVar = this.f6899a;
            if (bVar == null) {
                return;
            }
            ConnectivityManager connectivityManager = (ConnectivityManager) bVar.a().getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return;
            }
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "Connectivity changed. Starting background sync.");
            }
            b bVar2 = this.f6899a;
            bVar2.f6898c.getClass();
            FirebaseInstanceId.d(0L, bVar2);
            this.f6899a.a().unregisterReceiver(this);
            this.f6899a = null;
        }
    }

    public b(FirebaseInstanceId firebaseInstanceId, long j10) {
        de.b.a();
        this.f6898c = firebaseInstanceId;
        this.f6896a = j10;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) a().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f6897b = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    public final Context a() {
        e eVar = this.f6898c.f6881b;
        eVar.a();
        return eVar.f14480a;
    }

    public final boolean b() throws IOException {
        FirebaseInstanceId firebaseInstanceId = this.f6898c;
        if (firebaseInstanceId.h(firebaseInstanceId.e(n.b(firebaseInstanceId.f6881b), "*"))) {
            try {
                if (firebaseInstanceId.b() == null) {
                    Log.e("FirebaseInstanceId", "Token retrieval failed: null");
                    return false;
                }
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    Log.d("FirebaseInstanceId", "Token successfully retrieved");
                }
            } catch (IOException e10) {
                String message = e10.getMessage();
                if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                    if (e10.getMessage() != null) {
                        throw e10;
                    }
                    Log.w("FirebaseInstanceId", "Token retrieval failed without exception message. Will retry token retrieval");
                    return false;
                }
                String message2 = e10.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message2).length() + 52);
                sb.append("Token retrieval failed: ");
                sb.append(message2);
                sb.append(". Will retry token retrieval");
                Log.w("FirebaseInstanceId", sb.toString());
                return false;
            } catch (SecurityException unused) {
                Log.w("FirebaseInstanceId", "Token retrieval failed with SecurityException. Will retry token retrieval");
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        FirebaseInstanceId firebaseInstanceId = this.f6898c;
        PowerManager.WakeLock wakeLock = this.f6897b;
        if (r.a().c(a())) {
            wakeLock.acquire();
        }
        try {
            try {
                synchronized (firebaseInstanceId) {
                    z10 = true;
                    firebaseInstanceId.f6886g = true;
                }
                if (!firebaseInstanceId.f()) {
                    synchronized (firebaseInstanceId) {
                        firebaseInstanceId.f6886g = false;
                    }
                    if (r.a().c(a())) {
                        wakeLock.release();
                        return;
                    }
                    return;
                }
                if (r.a().b(a())) {
                    ConnectivityManager connectivityManager = (ConnectivityManager) a().getSystemService("connectivity");
                    NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
                    if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                        z10 = false;
                    }
                    if (!z10) {
                        a aVar = new a();
                        aVar.f6899a = this;
                        aVar.a();
                        if (r.a().c(a())) {
                            wakeLock.release();
                            return;
                        }
                        return;
                    }
                }
                if (b()) {
                    synchronized (firebaseInstanceId) {
                        firebaseInstanceId.f6886g = false;
                    }
                } else {
                    firebaseInstanceId.g(this.f6896a);
                }
                if (r.a().c(a())) {
                    wakeLock.release();
                }
            } catch (IOException e10) {
                String message = e10.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 93);
                sb.append("Topic sync or token retrieval failed on hard failure exceptions: ");
                sb.append(message);
                sb.append(". Won't retry the operation.");
                Log.e("FirebaseInstanceId", sb.toString());
                synchronized (firebaseInstanceId) {
                    firebaseInstanceId.f6886g = false;
                    if (r.a().c(a())) {
                        wakeLock.release();
                    }
                }
            }
        } catch (Throwable th2) {
            if (r.a().c(a())) {
                wakeLock.release();
            }
            throw th2;
        }
    }
}
