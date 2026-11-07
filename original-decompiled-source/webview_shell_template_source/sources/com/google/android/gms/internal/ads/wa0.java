package com.google.android.gms.internal.ads;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class wa0 extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    public final jb0 f10135a;

    public wa0(jb0 jb0Var) {
        this.f10135a = jb0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Context b(WebView webView) {
        if (!(webView instanceof xa0)) {
            return webView.getContext();
        }
        xa0 xa0Var = (xa0) webView;
        Activity activityZzi = xa0Var.zzi();
        return activityZzi != null ? activityZzi : xa0Var.getContext();
    }

    public final boolean a(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z6) {
        zzb zzbVar;
        jb0 jb0Var = this.f10135a;
        if (jb0Var != null) {
            try {
                eb0 eb0Var = jb0Var.s.F;
                if (eb0Var != null && (zzbVar = eb0Var.O) != null && zzbVar != null && !zzbVar.zzc()) {
                    zzbVar.zzb("window." + str + "('" + str3 + "')");
                    return false;
                }
            } catch (WindowManager.BadTokenException e6) {
                zzo.zzk("Fail to display Dialog.", e6);
                return true;
            }
        }
        zzv.zzq();
        AlertDialog.Builder builderZzL = zzs.zzL(context);
        builderZzL.setTitle(str2);
        if (!z6) {
            builderZzL.setMessage(str3).setPositiveButton(R.string.ok, new ra0(jsResult)).setNegativeButton(R.string.cancel, new qa0(jsResult)).setOnCancelListener(new pa0(jsResult)).create().show();
            return true;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setText(str3);
        EditText editText = new EditText(context);
        editText.setText(str4);
        linearLayout.addView(textView);
        linearLayout.addView(editText);
        builderZzL.setView(linearLayout).setPositiveButton(R.string.ok, new ua0(jsPromptResult, editText)).setNegativeButton(R.string.cancel, new ta0(jsPromptResult)).setOnCancelListener(new sa0(jsPromptResult)).create().show();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        if (!(webView instanceof xa0)) {
            zzo.zzj("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        zzm zzmVarZzL = ((xa0) webView).zzL();
        if (zzmVarZzL == null) {
            zzo.zzj("Tried to close an AdWebView not associated with an overlay.");
        } else {
            zzmVarZzL.zzb();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String strMessage = consoleMessage.message();
        String strSourceId = consoleMessage.sourceId();
        String strA = androidx.camera.camera2.internal.p0.a(androidx.camera.camera2.internal.i0.a("JS: ", strMessage, " (", strSourceId, ":"), consoleMessage.lineNumber(), ")");
        if (strA.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i6 = va0.f9763a[consoleMessage.messageLevel().ordinal()];
        if (i6 == 1) {
            zzo.zzg(strA);
        } else if (i6 == 2) {
            zzo.zzj(strA);
        } else if (i6 == 3 || i6 == 4 || i6 != 5) {
            zzo.zzi(strA);
        } else {
            zzo.zze(strA);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z6, boolean z7, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        eb0 eb0Var = this.f10135a.s.F;
        if (eb0Var != null) {
            webView2.setWebViewClient(eb0Var);
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(String str, String str2, long j6, long j7, long j8, WebStorage.QuotaUpdater quotaUpdater) {
        long j9 = 5242880 - j8;
        if (j9 <= 0) {
            quotaUpdater.updateQuota(j6);
            return;
        }
        if (j6 == 0) {
            if (j7 > j9 || j7 > 1048576) {
                j7 = 0;
            }
        } else if (j7 == 0) {
            j7 = Math.min(Math.min(131072L, j9) + j6, 1048576L);
        } else {
            if (j7 <= Math.min(1048576 - j6, j9)) {
                j6 += j7;
            }
            j7 = j6;
        }
        quotaUpdater.updateQuota(j7);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    @Override // android.webkit.WebChromeClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        boolean z6;
        if (callback != null) {
            zzv.zzq();
            jb0 jb0Var = this.f10135a;
            if (!zzs.zzB(jb0Var.getContext(), "android.permission.ACCESS_FINE_LOCATION")) {
                zzv.zzq();
                z6 = zzs.zzB(jb0Var.getContext(), "android.permission.ACCESS_COARSE_LOCATION");
            }
            callback.invoke(str, z6, true);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        zzm zzmVarZzL = this.f10135a.s.zzL();
        if (zzmVarZzL == null) {
            zzo.zzj("Could not get ad overlay when hiding custom view.");
        } else {
            zzmVarZzL.zzg();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return a(b(webView), "alert", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return a(b(webView), "onBeforeUnload", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return a(b(webView), "confirm", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return a(b(webView), "prompt", str, str2, str3, null, jsPromptResult, true);
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public final void onShowCustomView(View view, int i6, WebChromeClient.CustomViewCallback customViewCallback) {
        zzm zzmVarZzL = this.f10135a.s.zzL();
        if (zzmVarZzL == null) {
            zzo.zzj("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
        } else {
            zzmVarZzL.zzC(view, customViewCallback);
            zzmVarZzL.zzA(i6);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }
}
