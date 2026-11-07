package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzcd;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a10 extends ni0 implements yt {
    public float A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;

    /* renamed from: v, reason: collision with root package name */
    public final xa0 f2536v;

    /* renamed from: w, reason: collision with root package name */
    public final Context f2537w;

    /* renamed from: x, reason: collision with root package name */
    public final WindowManager f2538x;

    /* renamed from: y, reason: collision with root package name */
    public final kn f2539y;

    /* renamed from: z, reason: collision with root package name */
    public DisplayMetrics f2540z;

    public a10(xa0 xa0Var, Context context, kn knVar) {
        super(5, xa0Var, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        this.B = -1;
        this.C = -1;
        this.E = -1;
        this.F = -1;
        this.G = -1;
        this.H = -1;
        this.f2536v = xa0Var;
        this.f2537w = context;
        this.f2539y = knVar;
        this.f2538x = (WindowManager) context.getSystemService("window");
    }

    @Override // com.google.android.gms.internal.ads.yt
    public final void d(Object obj, Map map) throws JSONException {
        JSONObject jSONObjectPut;
        this.f2540z = new DisplayMetrics();
        Display defaultDisplay = this.f2538x.getDefaultDisplay();
        defaultDisplay.getMetrics(this.f2540z);
        this.A = this.f2540z.density;
        this.D = defaultDisplay.getRotation();
        zzbc.zzb();
        DisplayMetrics displayMetrics = this.f2540z;
        this.B = zzf.zzv(displayMetrics, displayMetrics.widthPixels);
        zzbc.zzb();
        DisplayMetrics displayMetrics2 = this.f2540z;
        this.C = zzf.zzv(displayMetrics2, displayMetrics2.heightPixels);
        xa0 xa0Var = this.f2536v;
        Activity activityZzi = xa0Var.zzi();
        if (activityZzi == null || activityZzi.getWindow() == null) {
            this.E = this.B;
            this.F = this.C;
        } else {
            zzv.zzq();
            int[] iArrZzQ = zzs.zzQ(activityZzi);
            zzbc.zzb();
            this.E = zzf.zzv(this.f2540z, iArrZzQ[0]);
            zzbc.zzb();
            this.F = zzf.zzv(this.f2540z, iArrZzQ[1]);
        }
        if (xa0Var.zzO().b()) {
            this.G = this.B;
            this.H = this.C;
        } else {
            xa0Var.measure(0, 0);
        }
        n(this.B, this.C, this.E, this.F, this.A, this.D);
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        kn knVar = this.f2539y;
        boolean zA = knVar.a(intent);
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        boolean zA2 = knVar.a(intent2);
        boolean zA3 = knVar.a(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
        jn jnVar = new jn();
        Context context = knVar.f6446a;
        try {
            jSONObjectPut = new JSONObject().put("sms", zA2).put("tel", zA).put("calendar", zA3).put("storePicture", ((Boolean) zzcd.zza(context, jnVar)).booleanValue() && j3.d.a(context).f13494a.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0).put("inlineVideo", true);
        } catch (JSONException e6) {
            zzo.zzh("Error occurred while obtaining the MRAID capabilities.", e6);
            jSONObjectPut = null;
        }
        xa0Var.j("onDeviceFeaturesReceived", jSONObjectPut);
        int[] iArr = new int[2];
        xa0Var.getLocationOnScreen(iArr);
        zzf zzfVarZzb = zzbc.zzb();
        int i6 = iArr[0];
        Context context2 = this.f2537w;
        q(zzfVarZzb.zzb(context2, i6), zzbc.zzb().zzb(context2, iArr[1]));
        if (zzo.zzm(2)) {
            zzo.zzi("Dispatching Ready Event.");
        }
        try {
            ((xa0) this.f7447t).j("onReadyEventReceived", new JSONObject().put("js", xa0Var.zzn().afmaVersion));
        } catch (JSONException e7) {
            zzo.zzh("Error occurred while dispatching ready Event.", e7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0060 A[PHI: r4
      0x0060: PHI (r4v2 int) = (r4v1 int), (r4v6 int) binds: [B:11:0x003f, B:17:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(int i6, int i7) {
        int i8;
        Context context = this.f2537w;
        int i9 = 0;
        if (context instanceof Activity) {
            zzv.zzq();
            i8 = zzs.zzR((Activity) context)[0];
        } else {
            i8 = 0;
        }
        xa0 xa0Var = this.f2536v;
        if (xa0Var.zzO() == null || !xa0Var.zzO().b()) {
            int width = xa0Var.getWidth();
            int height = xa0Var.getHeight();
            if (((Boolean) zzbe.zzc().a(zn.f11374d0)).booleanValue()) {
                if (width == 0) {
                    width = xa0Var.zzO() != null ? xa0Var.zzO().f3514c : 0;
                }
                if (height == 0) {
                    if (xa0Var.zzO() != null) {
                        i9 = xa0Var.zzO().f3513b;
                    }
                }
                this.G = zzbc.zzb().zzb(context, width);
                this.H = zzbc.zzb().zzb(context, i9);
            } else {
                i9 = height;
                this.G = zzbc.zzb().zzb(context, width);
                this.H = zzbc.zzb().zzb(context, i9);
            }
        }
        try {
            ((xa0) this.f7447t).j("onDefaultPositionReceived", new JSONObject().put("x", i6).put("y", i7 - i8).put("width", this.G).put("height", this.H));
        } catch (JSONException e6) {
            zzo.zzh("Error occurred while dispatching default position.", e6);
        }
        w00 w00Var = xa0Var.zzN().P;
        if (w00Var != null) {
            w00Var.f10001x = i6;
            w00Var.f10002y = i7;
        }
    }
}
