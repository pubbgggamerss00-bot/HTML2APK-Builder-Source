package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.tc1;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzu f2266a;

    public a(zzu zzuVar) {
        this.f2266a = zzuVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        zzu zzuVar = this.f2266a;
        if (zzuVar.zzg != null) {
            try {
                zzuVar.zzg.zzf(tc1.d(1, null, null));
            } catch (RemoteException e6) {
                zzo.zzl("#007 Could not call remote method.", e6);
            }
        }
        if (zzuVar.zzg != null) {
            try {
                zzuVar.zzg.zze(0);
            } catch (RemoteException e7) {
                zzo.zzl("#007 Could not call remote method.", e7);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        zzu zzuVar = this.f2266a;
        if (str.startsWith(zzuVar.zzq())) {
            return false;
        }
        if (str.startsWith("gmsg://noAdLoaded")) {
            if (zzuVar.zzg != null) {
                try {
                    zzuVar.zzg.zzf(tc1.d(3, null, null));
                } catch (RemoteException e6) {
                    zzo.zzl("#007 Could not call remote method.", e6);
                }
            }
            if (zzuVar.zzg != null) {
                try {
                    zzuVar.zzg.zze(3);
                } catch (RemoteException e7) {
                    zzo.zzl("#007 Could not call remote method.", e7);
                }
            }
            zzuVar.zzV(0);
            return true;
        }
        if (str.startsWith("gmsg://scriptLoadFailed")) {
            if (zzuVar.zzg != null) {
                try {
                    zzuVar.zzg.zzf(tc1.d(1, null, null));
                } catch (RemoteException e8) {
                    zzo.zzl("#007 Could not call remote method.", e8);
                }
            }
            if (zzuVar.zzg != null) {
                try {
                    zzuVar.zzg.zze(0);
                } catch (RemoteException e9) {
                    zzo.zzl("#007 Could not call remote method.", e9);
                }
            }
            zzuVar.zzV(0);
            return true;
        }
        if (str.startsWith("gmsg://adResized")) {
            if (zzuVar.zzg != null) {
                try {
                    zzuVar.zzg.zzi();
                } catch (RemoteException e10) {
                    zzo.zzl("#007 Could not call remote method.", e10);
                }
            }
            zzuVar.zzV(zzuVar.zzb(str));
            return true;
        }
        if (str.startsWith("gmsg://")) {
            return true;
        }
        if (zzuVar.zzg != null) {
            try {
                zzuVar.zzg.zzc();
                zzuVar.zzg.zzh();
            } catch (RemoteException e11) {
                zzo.zzl("#007 Could not call remote method.", e11);
            }
        }
        zzu.zzw(zzuVar, zzu.zzo(zzuVar, str));
        return true;
    }
}
