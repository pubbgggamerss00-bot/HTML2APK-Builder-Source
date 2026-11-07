package com.google.android.gms.ads.internal.util;

import android.util.Log;
import android.webkit.WebSettings;
import com.google.android.gms.internal.consent_sdk.f2;
import com.google.android.gms.internal.consent_sdk.g0;
import com.google.android.gms.internal.consent_sdk.l3;
import com.google.android.gms.internal.consent_sdk.y;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.a;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f2344t;

    public /* synthetic */ a(int i6, Object obj) {
        this.s = i6;
        this.f2344t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        switch (this.s) {
            case 0:
                zzb zzbVar = (zzb) this.f2344t;
                zzbVar.zzb = Thread.currentThread();
                zzbVar.zza();
                break;
            case 1:
                ((com.google.android.gms.internal.consent_sdk.n) this.f2344t).c(new f2(4, "Web view timed out."));
                break;
            case 2:
                ((a.InterfaceC0040a) this.f2344t).a(new f2(3, "Privacy options form is not required.").a());
                break;
            case 3:
                y yVar = (y) this.f2344t;
                yVar.getClass();
                yVar.f11939d.execute(new com.google.android.gms.internal.consent_sdk.p(1, yVar));
                break;
            case 4:
                g0 g0Var = (g0) this.f2344t;
                AtomicReference atomicReference = g0Var.f11755k;
                String str = (String) g0Var.f11746a.get();
                if (str == null) {
                    Log.w("UserMessagingPlatform", "Metrics reporting URL is not set yet.");
                    break;
                } else {
                    int size = ((Queue) atomicReference.get()).size();
                    for (int i6 = 0; i6 < size; i6++) {
                        l3 l3Var = (l3) ((Queue) atomicReference.get()).poll();
                        if (l3Var != null) {
                            try {
                                HttpURLConnection httpURLConnection = (HttpURLConnection) new URI(str).toURL().openConnection();
                                httpURLConnection.setRequestProperty("User-Agent", WebSettings.getDefaultUserAgent(g0Var.f11747b));
                                httpURLConnection.setConnectTimeout(10000);
                                httpURLConnection.setReadTimeout(30000);
                                httpURLConnection.setDoOutput(true);
                                httpURLConnection.setRequestMethod("POST");
                                httpURLConnection.setRequestProperty("Content-Type", "application/protobuf");
                                l3Var.b(httpURLConnection.getOutputStream());
                                int responseCode = httpURLConnection.getResponseCode();
                                if (responseCode != 200 && responseCode != 204) {
                                    Log.w("UserMessagingPlatform", "Fail to ping metrics reporting URL: Http error code - " + responseCode + ".\n" + (httpURLConnection.getErrorStream() != null ? new Scanner(httpURLConnection.getErrorStream()).useDelimiter("\\A").next() : null));
                                    ((Queue) atomicReference.get()).add(l3Var);
                                }
                            } catch (IOException e6) {
                                Log.w("UserMessagingPlatform", "Fail to ping metrics reporting URL: ".concat(String.valueOf(e6.getMessage())));
                                ((Queue) atomicReference.get()).add(l3Var);
                            } catch (URISyntaxException e7) {
                                Log.w("UserMessagingPlatform", "Metrics reporting URL " + str + " is not valid: " + e7.getMessage());
                            }
                        }
                    }
                    break;
                }
                break;
            default:
                ((ConsentInformation.b) this.f2344t).c();
                break;
        }
    }
}
