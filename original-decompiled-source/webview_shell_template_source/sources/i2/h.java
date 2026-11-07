package i2;

import android.app.Application;
import android.net.Uri;
import android.webkit.WebView;
import androidx.fragment.app.p;
import com.google.android.gms.internal.ads.cg1;
import com.google.android.gms.internal.ads.d0;
import com.google.android.gms.internal.ads.kg1;
import com.google.android.gms.internal.ads.o70;
import com.google.android.gms.internal.ads.t31;
import com.google.android.gms.internal.ads.tb;
import com.google.android.gms.internal.ads.xb;
import com.google.android.gms.internal.consent_sdk.z8;
import com.google.android.ump.UserMessagingPlatform;
import com.google.android.ump.a;
import e3.i0;
import java.lang.reflect.InvocationHandler;
import java.util.HashMap;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class h implements WebMessageListenerBoundaryInterface, tb, z8, UserMessagingPlatform.a, z1.c {
    public final Object s;

    public /* synthetic */ h(Object obj) {
        this.s = obj;
    }

    @Override // com.google.android.gms.internal.ads.tb
    public void a(xb xbVar) {
        ((o70) this.s).b(xbVar);
    }

    @Override // z1.c
    public String b() {
        return (String) this.s;
    }

    @Override // com.google.android.ump.UserMessagingPlatform.a
    public void c(b5.c cVar) {
        ((a.InterfaceC0040a) this.s).a(cVar);
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fa A[ORIG_RETURN, RETURN] */
    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z6, InvocationHandler invocationHandler2) throws JSONException {
        i0 i0Var;
        i0 i0Var2;
        cg1 cg1Var;
        WebMessageBoundaryInterface webMessageBoundaryInterface = (WebMessageBoundaryInterface) d6.a.a(WebMessageBoundaryInterface.class, invocationHandler);
        InvocationHandler[] ports = webMessageBoundaryInterface.getPorts();
        p[] pVarArr = new p[ports.length];
        for (int i6 = 0; i6 < ports.length; i6++) {
            InvocationHandler invocationHandler3 = ports[i6];
            i iVar = new i();
            iVar.s = (WebMessagePortBoundaryInterface) d6.a.a(WebMessagePortBoundaryInterface.class, invocationHandler3);
            pVarArr[i6] = iVar;
        }
        if (j.f13351a.d()) {
            WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface) d6.a.a(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
            int type = webMessagePayloadBoundaryInterface.getType();
            if (type == 0) {
                i0Var = new i0(webMessagePayloadBoundaryInterface.getAsString());
            } else {
                if (type != 1) {
                    i0Var2 = null;
                    if (i0Var2 == null) {
                        final JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) d6.a.a(JsReplyProxyBoundaryInterface.class, invocationHandler2);
                        t31 t31Var = ((kg1) this.s).f6406a;
                        HashMap map = (HashMap) t31Var.f9097v;
                        int i7 = i0Var2.f12886a;
                        if (i7 != 0) {
                            StringBuilder sb = new StringBuilder("Wrong data accessor type detected. ");
                            sb.append(i7 != 0 ? i7 != 1 ? "Unknown" : "ArrayBuffer" : "String");
                            sb.append(" expected, but got ");
                            sb.append("String");
                            throw new IllegalStateException(sb.toString());
                        }
                        try {
                            JSONObject jSONObject = new JSONObject((String) i0Var2.f12887b);
                            String string = jSONObject.getString("method");
                            String string2 = jSONObject.getJSONObject("data").getString("adSessionId");
                            if (string.equals("startSession")) {
                                t31.a(t31Var, string2);
                                return;
                            } else {
                                if (string.equals("finishSession") && (cg1Var = (cg1) map.get(string2)) != null) {
                                    cg1Var.b();
                                    map.remove(string2);
                                    return;
                                }
                                return;
                            }
                        } catch (JSONException e6) {
                            d0.f("Error parsing JS message in JavaScriptSessionService.", e6);
                            return;
                        }
                    }
                    return;
                }
                i0Var = new i0(webMessagePayloadBoundaryInterface.getAsArrayBuffer());
            }
        } else {
            i0Var = new i0(webMessageBoundaryInterface.getData());
        }
        i0Var2 = i0Var;
        if (i0Var2 == null) {
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.a9
    public Object zzb() {
        return new com.google.android.gms.internal.consent_sdk.g((Application) ((com.google.android.gms.internal.consent_sdk.f) this.s).f11718t);
    }

    @Override // z1.c
    public void d(a2.d dVar) {
    }
}
