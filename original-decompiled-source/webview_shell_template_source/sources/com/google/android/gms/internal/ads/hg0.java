package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzab;
import com.google.android.gms.ads.internal.zzv;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class hg0 implements ix {
    public final Context s;

    /* renamed from: t, reason: collision with root package name */
    public final xh f5383t;

    /* renamed from: u, reason: collision with root package name */
    public final PowerManager f5384u;

    public hg0(Context context, xh xhVar) {
        this.s = context;
        this.f5383t = xhVar;
        this.f5384u = (PowerManager) context.getSystemService("power");
    }

    @Override // com.google.android.gms.internal.ads.ix
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final JSONObject a(kg0 kg0Var) throws JSONException {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject3 = new JSONObject();
        ai aiVar = kg0Var.f6405e;
        if (aiVar == null) {
            jSONObject2 = new JSONObject();
            jSONObject = jSONObject3;
        } else {
            Rect rect = aiVar.f2771i;
            Rect rect2 = aiVar.f2770g;
            Rect rect3 = aiVar.f2768e;
            Rect rect4 = aiVar.f2767d;
            Rect rect5 = aiVar.f2766c;
            xh xhVar = this.f5383t;
            if (xhVar.f10589b == null) {
                throw new JSONException("Active view Info cannot be null.");
            }
            boolean z6 = aiVar.f2764a;
            JSONObject jSONObject4 = new JSONObject();
            jSONObject = jSONObject3;
            JSONObject jSONObjectPut = jSONObject4.put("afmaVersion", xhVar.f10591d).put("activeViewJSON", xhVar.f10589b).put("timestamp", kg0Var.f6403c).put("adFormat", xhVar.f10588a).put("hashCode", xhVar.f10590c).put("isMraid", false).put("isStopped", false).put("isPaused", kg0Var.f6402b).put("isNative", xhVar.f10592e).put("isScreenOn", this.f5384u.isInteractive()).put("appMuted", zzv.zzs().zze()).put("appVolume", zzv.zzs().zza());
            Context context = this.s;
            jSONObjectPut.put("deviceVolume", zzab.zzb(context.getApplicationContext()));
            Rect rect6 = new Rect();
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            rect6.right = defaultDisplay.getWidth();
            rect6.bottom = defaultDisplay.getHeight();
            jSONObject4.put("windowVisibility", aiVar.f2765b).put("isAttachedToWindow", z6).put("viewBox", new JSONObject().put("top", rect5.top).put("bottom", rect5.bottom).put("left", rect5.left).put("right", rect5.right)).put("adBox", new JSONObject().put("top", rect4.top).put("bottom", rect4.bottom).put("left", rect4.left).put("right", rect4.right)).put("globalVisibleBox", new JSONObject().put("top", rect3.top).put("bottom", rect3.bottom).put("left", rect3.left).put("right", rect3.right)).put("globalVisibleBoxVisible", aiVar.f2769f).put("localVisibleBox", new JSONObject().put("top", rect2.top).put("bottom", rect2.bottom).put("left", rect2.left).put("right", rect2.right)).put("localVisibleBoxVisible", aiVar.h).put("hitBox", new JSONObject().put("top", rect.top).put("bottom", rect.bottom).put("left", rect.left).put("right", rect.right)).put("screenDensity", context.getResources().getDisplayMetrics().density);
            jSONObject4.put("isVisible", kg0Var.f6401a);
            if (((Boolean) zzbe.zzc().a(zn.f11511y1)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = aiVar.f2773k;
                if (list != null) {
                    for (Rect rect7 : list) {
                        jSONArray2.put(new JSONObject().put("top", rect7.top).put("bottom", rect7.bottom).put("left", rect7.left).put("right", rect7.right));
                    }
                }
                jSONObject4.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(kg0Var.f6404d)) {
                jSONObject4.put("doneReasonCode", "u");
            }
            jSONObject2 = jSONObject4;
        }
        jSONArray.put(jSONObject2);
        JSONObject jSONObject5 = jSONObject;
        jSONObject5.put("units", jSONArray);
        return jSONObject5;
    }
}
