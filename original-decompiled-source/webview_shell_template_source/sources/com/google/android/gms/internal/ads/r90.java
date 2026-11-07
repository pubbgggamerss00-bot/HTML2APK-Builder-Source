package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.ump.ConsentInformation;
import java.util.HashMap;
import java.util.Objects;
import java.util.Queue;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class r90 implements Runnable {
    public final /* synthetic */ int s = 0;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f8586t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f8587u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f8588v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f8589w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f8590x;

    public r90(s90 s90Var, String str, String str2, String str3, String str4) {
        this.f8586t = str;
        this.f8587u = str2;
        this.f8588v = str3;
        this.f8589w = str4;
        this.f8590x = s90Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0195  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String str;
        switch (this.s) {
            case 0:
                String str2 = (String) this.f8589w;
                String str3 = (String) this.f8588v;
                HashMap map = new HashMap();
                map.put("event", "precacheCanceled");
                map.put("src", (String) this.f8586t);
                String str4 = (String) this.f8587u;
                if (!TextUtils.isEmpty(str4)) {
                    map.put("cachedSrc", str4);
                }
                String str5 = "internal";
                switch (str3.hashCode()) {
                    case -1947652542:
                        str = "interrupted";
                        str3.equals(str);
                        break;
                    case -1396664534:
                        if (str3.equals("badUrl")) {
                            str5 = "network";
                            break;
                        }
                        break;
                    case -1347010958:
                        str = "inProgress";
                        str3.equals(str);
                        break;
                    case -918817863:
                        if (str3.equals("downloadTimeout")) {
                        }
                        break;
                    case -659376217:
                        str = "contentLengthMissing";
                        str3.equals(str);
                        break;
                    case -642208130:
                        str = "playerFailed";
                        str3.equals(str);
                        break;
                    case -354048396:
                        if (str3.equals("sizeExceeded")) {
                            str5 = "policy";
                            break;
                        }
                        break;
                    case -32082395:
                        if (str3.equals("externalAbort")) {
                        }
                        break;
                    case 3387234:
                        str = "noop";
                        str3.equals(str);
                        break;
                    case 96784904:
                        str = "error";
                        str3.equals(str);
                        break;
                    case 580119100:
                        if (str3.equals("expireFailed")) {
                            str5 = "io";
                            break;
                        }
                        break;
                    case 725497484:
                        if (str3.equals("noCacheDir")) {
                        }
                        break;
                }
                map.put("type", str5);
                map.put("reason", str3);
                if (!TextUtils.isEmpty(str2)) {
                    map.put("message", str2);
                }
                s90.h((s90) this.f8590x, map);
                break;
            default:
                final com.google.android.gms.internal.consent_sdk.c9 c9Var = (com.google.android.gms.internal.consent_sdk.c9) this.f8586t;
                Handler handler = c9Var.f11663b;
                com.google.android.gms.internal.consent_sdk.g0 g0Var = c9Var.f11669i;
                Activity activity = (Activity) this.f8587u;
                b5.b bVar = (b5.b) this.f8588v;
                final ConsentInformation.b bVar2 = (ConsentInformation.b) this.f8589w;
                final ConsentInformation.a aVar = (ConsentInformation.a) this.f8590x;
                try {
                    b5.a aVar2 = bVar.f2007b;
                    if (aVar2 == null || !aVar2.f2001a) {
                        Log.i("UserMessagingPlatform", "Use new ConsentDebugSettings.Builder().addTestDeviceHashedId(\"" + com.google.android.gms.internal.consent_sdk.h0.a(c9Var.f11662a) + "\") to set this as a debug device.");
                    }
                    final com.google.android.gms.internal.consent_sdk.b bVarC = c9Var.f11668g.c(c9Var.a(c9Var.f11667f.a(activity, bVar)));
                    com.google.android.gms.internal.consent_sdk.j jVar = c9Var.f11665d;
                    jVar.f11784b.edit().putInt("consent_status", bVarC.f11636a).commit();
                    jVar.f11784b.edit().putString("privacy_options_requirement_status", bVarC.f11637b.name()).commit();
                    c9Var.f11666e.f11874c.set(bVarC.f11638c);
                    g0Var.a((Queue) g0Var.f11751f.get(), 8, 9, null);
                    c9Var.h.f11643a.execute(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.b9
                        @Override // java.lang.Runnable
                        public final void run() {
                            ConsentInformation.b bVar3 = bVar2;
                            Objects.requireNonNull(bVar3);
                            com.google.android.gms.ads.internal.util.a aVar3 = new com.google.android.gms.ads.internal.util.a(5, bVar3);
                            c9 c9Var2 = c9Var;
                            c9Var2.f11663b.post(aVar3);
                            if (bVarC.f11637b != ConsentInformation.c.f12520t) {
                                c9Var2.f11666e.b();
                            }
                        }
                    });
                    break;
                } catch (com.google.android.gms.internal.consent_sdk.f2 e6) {
                    g0Var.a((Queue) g0Var.f11751f.get(), 8, 9, "RequestConsentUpdate exception. Error: " + e6.getMessage() + ", cause: " + String.valueOf(e6.getCause()));
                    final int i6 = 0;
                    handler.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.j7
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i6) {
                                case 0:
                                    aVar.a(e6.a());
                                    break;
                                default:
                                    aVar.a(e6.a());
                                    break;
                            }
                        }
                    });
                } catch (RuntimeException e7) {
                    g0Var.a((Queue) g0Var.f11751f.get(), 8, 9, "RequestConsentUpdate RuntimeException. ".concat(String.valueOf(e7.getMessage())));
                    final int i7 = 1;
                    final com.google.android.gms.internal.consent_sdk.f2 f2Var = new com.google.android.gms.internal.consent_sdk.f2(1, "Caught exception when trying to request consent info update: ".concat(String.valueOf(Log.getStackTraceString(e7))));
                    handler.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.j7
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i7) {
                                case 0:
                                    aVar.a(f2Var.a());
                                    break;
                                default:
                                    aVar.a(f2Var.a());
                                    break;
                            }
                        }
                    });
                    return;
                }
                break;
        }
    }

    public /* synthetic */ r90(com.google.android.gms.internal.consent_sdk.c9 c9Var, Activity activity, b5.b bVar, ConsentInformation.b bVar2, ConsentInformation.a aVar) {
        this.f8586t = c9Var;
        this.f8587u = activity;
        this.f8588v = bVar;
        this.f8589w = bVar2;
        this.f8590x = aVar;
    }
}
