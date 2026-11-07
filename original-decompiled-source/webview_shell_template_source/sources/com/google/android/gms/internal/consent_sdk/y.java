package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.ads.kb0;
import com.google.android.ump.a;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class y implements n0 {

    /* renamed from: a, reason: collision with root package name */
    public final Application f11936a;

    /* renamed from: b, reason: collision with root package name */
    public final w f11937b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f11938c;

    /* renamed from: d, reason: collision with root package name */
    public final Executor f11939d;

    /* renamed from: e, reason: collision with root package name */
    public final b1 f11940e;

    /* renamed from: f, reason: collision with root package name */
    public final h f11941f;

    /* renamed from: g, reason: collision with root package name */
    public final n f11942g;
    public final j h;

    public y(Application application, w wVar, Handler handler, Executor executor, b1 b1Var, h hVar, n nVar, j jVar) {
        this.f11936a = application;
        this.f11937b = wVar;
        this.f11938c = handler;
        this.f11939d = executor;
        this.f11940e = b1Var;
        this.f11941f = hVar;
        this.f11942g = nVar;
        this.h = jVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (r7.equals("non_personalized") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
    
        if (r7.equals("CONSENT_SIGNAL_PERSONALIZED_ADS") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        if (r7.equals("CONSENT_SIGNAL_SUFFICIENT") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004f, code lost:
    
        if (r7.equals("personalized") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
    
        if (r7.equals("CONSENT_SIGNAL_NON_PERSONALIZED_ADS") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005a, code lost:
    
        r7 = 3;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cb  */
    @Override // com.google.android.gms.internal.consent_sdk.n0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(String str, JSONObject jSONObject) {
        Dialog dialog;
        l lVar;
        a.InterfaceC0040a interfaceC0040a;
        int iHashCode = str.hashCode();
        n nVar = this.f11942g;
        switch (iHashCode) {
            case -1370505102:
                if (!str.equals("load_complete")) {
                    return false;
                }
                m mVar = (m) nVar.f11839j.getAndSet(null);
                if (mVar != null) {
                    if (!nVar.f11842m && !nVar.f11843n) {
                        g0 g0Var = nVar.f11836f;
                        g0Var.a((Queue) g0Var.f11752g.get(), 4, 5, null);
                    }
                    mVar.b(nVar);
                    return true;
                }
                return true;
            case -278739366:
                if (!str.equals("configure_app_assets")) {
                    return false;
                }
                this.f11939d.execute(new p(1, this));
                return true;
            case 150940456:
                if (!str.equals("browser")) {
                    return false;
                }
                String strOptString = jSONObject.optString("url");
                if (TextUtils.isEmpty(strOptString)) {
                    Log.d("UserMessagingPlatform", "Action[browser]: empty url.");
                }
                Uri uri = Uri.parse(strOptString);
                if (uri.getScheme() == null) {
                    Log.d("UserMessagingPlatform", "Action[browser]: empty scheme: ".concat(String.valueOf(strOptString)));
                }
                try {
                    this.f11937b.startActivity(new Intent("android.intent.action.VIEW", uri));
                    return true;
                } catch (ActivityNotFoundException e6) {
                    Log.d("UserMessagingPlatform", "Action[browser]: can not open url: ".concat(String.valueOf(strOptString)), e6);
                    return true;
                }
            case 1671672458:
                if (!str.equals("dismiss")) {
                    return false;
                }
                String strOptString2 = jSONObject.optString("status");
                switch (strOptString2.hashCode()) {
                    case -954325659:
                        break;
                    case -258041904:
                        break;
                    case 429411856:
                        break;
                    case 467888915:
                        break;
                    case 1666911234:
                        break;
                    case 1725474845:
                        if (strOptString2.equals("CONSENT_SIGNAL_NOT_REQUIRED")) {
                            int i6 = 1;
                            Dialog dialog2 = nVar.f11837g;
                            if (dialog2 != null) {
                                dialog2.dismiss();
                                nVar.f11837g = null;
                            }
                            nVar.f11832b.f11923a = null;
                            l lVar2 = (l) nVar.f11841l.getAndSet(null);
                            if (lVar2 != null) {
                                lVar2.f11807t.f11831a.unregisterActivityLifecycleCallbacks(lVar2);
                            }
                            a.InterfaceC0040a interfaceC0040a2 = (a.InterfaceC0040a) nVar.f11840k.getAndSet(null);
                            if (interfaceC0040a2 != null) {
                                nVar.f11833c.f11784b.edit().putInt("consent_status", i6).commit();
                                interfaceC0040a2.a(null);
                                break;
                            }
                        }
                        f2 f2Var = new f2(1, "We are getting something wrong with the webview.");
                        dialog = nVar.f11837g;
                        if (dialog != null) {
                            dialog.dismiss();
                            nVar.f11837g = null;
                        }
                        nVar.f11832b.f11923a = null;
                        lVar = (l) nVar.f11841l.getAndSet(null);
                        if (lVar != null) {
                            lVar.f11807t.f11831a.unregisterActivityLifecycleCallbacks(lVar);
                        }
                        interfaceC0040a = (a.InterfaceC0040a) nVar.f11840k.getAndSet(null);
                        if (interfaceC0040a != null) {
                            nVar.d(f2Var);
                            interfaceC0040a.a(f2Var.a());
                            break;
                        }
                        break;
                    default:
                        f2 f2Var2 = new f2(1, "We are getting something wrong with the webview.");
                        dialog = nVar.f11837g;
                        if (dialog != null) {
                        }
                        nVar.f11832b.f11923a = null;
                        lVar = (l) nVar.f11841l.getAndSet(null);
                        if (lVar != null) {
                        }
                        interfaceC0040a = (a.InterfaceC0040a) nVar.f11840k.getAndSet(null);
                        if (interfaceC0040a != null) {
                        }
                        break;
                }
                return true;
            default:
                return false;
        }
    }

    public final void b(String str) {
        Log.d("UserMessagingPlatform", "Receive consent action: ".concat(String.valueOf(str)));
        Uri uri = Uri.parse(str);
        String queryParameter = uri.getQueryParameter("action");
        String queryParameter2 = uri.getQueryParameter("args");
        n0[] n0VarArr = {this, this.f11941f};
        b1 b1Var = this.f11940e;
        b1Var.getClass();
        b1Var.f11643a.execute(new kb0(queryParameter, queryParameter2, n0VarArr));
    }

    @Override // com.google.android.gms.internal.consent_sdk.n0
    public final Executor zza() {
        Handler handler = this.f11938c;
        Objects.requireNonNull(handler);
        return new x(0, handler);
    }
}
