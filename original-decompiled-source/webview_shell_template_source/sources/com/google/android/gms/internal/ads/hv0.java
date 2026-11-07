package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.util.Base64;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.io.ByteArrayOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class hv0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5496a;

    /* renamed from: b, reason: collision with root package name */
    public final ApplicationInfo f5497b;

    /* renamed from: e, reason: collision with root package name */
    public String f5500e = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    /* renamed from: c, reason: collision with root package name */
    public final int f5498c = ((Integer) zzbe.zzc().a(zn.a9)).intValue();

    /* renamed from: d, reason: collision with root package name */
    public final int f5499d = ((Integer) zzbe.zzc().a(zn.b9)).intValue();

    public hv0(Context context) {
        this.f5496a = context;
        this.f5497b = context.getApplicationInfo();
    }

    public final JSONObject a() throws JSONException, PackageManager.NameNotFoundException {
        String strZzq;
        String strEncodeToString;
        ApplicationInfo applicationInfo = this.f5497b;
        Context context = this.f5496a;
        JSONObject jSONObject = new JSONObject();
        try {
            String str = applicationInfo.packageName;
            uj1 uj1Var = zzs.zza;
            Context context2 = j3.d.a(context).f13494a;
            jSONObject.put("name", context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(str, 0)));
        } catch (PackageManager.NameNotFoundException unused) {
        }
        jSONObject.put("packageName", applicationInfo.packageName);
        zzv.zzq();
        Drawable applicationIcon = null;
        try {
            strZzq = zzs.zzq(context);
        } catch (RemoteException unused2) {
            strZzq = null;
        }
        jSONObject.put("adMobAppId", strZzq);
        boolean zIsEmpty = this.f5500e.isEmpty();
        int i6 = this.f5499d;
        int i7 = this.f5498c;
        if (zIsEmpty) {
            try {
                j3.c cVarA = j3.d.a(context);
                String str2 = applicationInfo.packageName;
                Context context3 = cVarA.f13494a;
                ApplicationInfo applicationInfo2 = context3.getPackageManager().getApplicationInfo(str2, 0);
                context3.getPackageManager().getApplicationLabel(applicationInfo2);
                applicationIcon = context3.getPackageManager().getApplicationIcon(applicationInfo2);
            } catch (PackageManager.NameNotFoundException unused3) {
            }
            if (applicationIcon == null) {
                strEncodeToString = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            } else {
                applicationIcon.setBounds(0, 0, i7, i6);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i7, i6, Bitmap.Config.ARGB_8888);
                applicationIcon.draw(new Canvas(bitmapCreateBitmap));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            }
            this.f5500e = strEncodeToString;
        }
        if (!this.f5500e.isEmpty()) {
            jSONObject.put("icon", this.f5500e);
            jSONObject.put("iconWidthPx", i7);
            jSONObject.put("iconHeightPx", i6);
        }
        return jSONObject;
    }
}
