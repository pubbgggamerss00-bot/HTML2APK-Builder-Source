package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import com.google.android.ump.a;
import java.io.ByteArrayOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f11860t;

    public /* synthetic */ p(int i6, Object obj) {
        this.s = i6;
        this.f11860t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        switch (this.s) {
            case 0:
                ((a.InterfaceC0040a) this.f11860t).a(new f2(1, "No consentInformation.").a());
                break;
            default:
                y yVar = (y) this.f11860t;
                JSONObject jSONObject = new JSONObject();
                Application application = yVar.f11936a;
                try {
                    jSONObject.put("app_name", application.getPackageManager().getApplicationLabel(application.getApplicationInfo()).toString());
                    Drawable applicationIcon = application.getPackageManager().getApplicationIcon(application.getApplicationInfo());
                    String strConcat = null;
                    if (applicationIcon != null && applicationIcon.getIntrinsicWidth() > 0 && applicationIcon.getIntrinsicHeight() > 0) {
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(applicationIcon.getIntrinsicWidth(), applicationIcon.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        applicationIcon.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                        applicationIcon.draw(canvas);
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                        strConcat = "data:image/png;base64,".concat(String.valueOf(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2)));
                    }
                    jSONObject.put("app_icon", strConcat);
                    JSONObject jSONObject2 = new JSONObject();
                    j jVar = yVar.h;
                    for (String str : jVar.a().keySet()) {
                        jSONObject2.put(str, jVar.a().get(str));
                    }
                    jSONObject.put("stored_infos_map", jSONObject2);
                } catch (JSONException unused) {
                }
                yVar.f11942g.h.a("UMP_configureFormWithAppAssets", jSONObject.toString());
                break;
        }
    }
}
