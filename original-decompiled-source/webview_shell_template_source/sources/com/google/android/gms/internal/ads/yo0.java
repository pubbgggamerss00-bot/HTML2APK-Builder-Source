package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzdd;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.client.zzez;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbv;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class yo0 implements np0 {
    public zzdd C;
    public final wp0 D;

    /* renamed from: a, reason: collision with root package name */
    public final Context f11035a;

    /* renamed from: b, reason: collision with root package name */
    public final pp0 f11036b;

    /* renamed from: c, reason: collision with root package name */
    public final JSONObject f11037c;

    /* renamed from: d, reason: collision with root package name */
    public final gs0 f11038d;

    /* renamed from: e, reason: collision with root package name */
    public final jp0 f11039e;

    /* renamed from: f, reason: collision with root package name */
    public final mf f11040f;

    /* renamed from: g, reason: collision with root package name */
    public final yk0 f11041g;
    public final nk0 h;

    /* renamed from: i, reason: collision with root package name */
    public final nn0 f11042i;

    /* renamed from: j, reason: collision with root package name */
    public final tb1 f11043j;

    /* renamed from: k, reason: collision with root package name */
    public final VersionInfoParcel f11044k;

    /* renamed from: l, reason: collision with root package name */
    public final ec1 f11045l;

    /* renamed from: m, reason: collision with root package name */
    public final lg0 f11046m;

    /* renamed from: n, reason: collision with root package name */
    public final zp0 f11047n;

    /* renamed from: o, reason: collision with root package name */
    public final i3.a f11048o;

    /* renamed from: p, reason: collision with root package name */
    public final ln0 f11049p;

    /* renamed from: q, reason: collision with root package name */
    public final cf1 f11050q;

    /* renamed from: r, reason: collision with root package name */
    public final it0 f11051r;
    public final he1 s;

    /* renamed from: t, reason: collision with root package name */
    public final oz0 f11052t;

    /* renamed from: v, reason: collision with root package name */
    public boolean f11054v;

    /* renamed from: u, reason: collision with root package name */
    public boolean f11053u = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f11055w = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f11056x = false;

    /* renamed from: y, reason: collision with root package name */
    public Point f11057y = new Point();

    /* renamed from: z, reason: collision with root package name */
    public Point f11058z = new Point();
    public long A = 0;
    public long B = 0;

    public yo0(Context context, pp0 pp0Var, JSONObject jSONObject, gs0 gs0Var, jp0 jp0Var, mf mfVar, yk0 yk0Var, nk0 nk0Var, nn0 nn0Var, tb1 tb1Var, VersionInfoParcel versionInfoParcel, ec1 ec1Var, lg0 lg0Var, zp0 zp0Var, i3.a aVar, ln0 ln0Var, cf1 cf1Var, he1 he1Var, oz0 oz0Var, it0 it0Var, wp0 wp0Var) {
        this.f11035a = context;
        this.f11036b = pp0Var;
        this.f11037c = jSONObject;
        this.f11038d = gs0Var;
        this.f11039e = jp0Var;
        this.f11040f = mfVar;
        this.f11041g = yk0Var;
        this.h = nk0Var;
        this.f11042i = nn0Var;
        this.f11043j = tb1Var;
        this.f11044k = versionInfoParcel;
        this.f11045l = ec1Var;
        this.f11046m = lg0Var;
        this.f11047n = zp0Var;
        this.f11048o = aVar;
        this.f11049p = ln0Var;
        this.f11050q = cf1Var;
        this.s = he1Var;
        this.f11052t = oz0Var;
        this.f11051r = it0Var;
        this.D = wp0Var;
    }

    @Override // com.google.android.gms.internal.ads.np0
    public final void a(View view, Map map, Map map2, ImageView.ScaleType scaleType) throws JSONException {
        Context context = this.f11035a;
        v(zzbv.zzg(context, view), zzbv.zzd(context, map, map2, view, scaleType), zzbv.zzf(view), zzbv.zze(context, view), s(view), null, zzbv.zzh(context, this.f11043j), view);
    }

    @Override // com.google.android.gms.internal.ads.np0
    public final void b(View view) {
        if (!this.f11037c.optBoolean("custom_one_point_five_click_enabled", false)) {
            zzo.zzj("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
        } else {
            if (view == null) {
                return;
            }
            zp0 zp0Var = this.f11047n;
            view.setOnClickListener(zp0Var);
            view.setClickable(true);
            zp0Var.f11555y = new WeakReference(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.np0
    public final void c() {
        this.f11056x = true;
    }

    @Override // com.google.android.gms.internal.ads.np0
    public final boolean d(Bundle bundle) {
        if (u("impression_reporting")) {
            return v(null, null, null, null, ((Boolean) zzbe.zzc().a(zn.ob)).booleanValue() ? s(null) : null, zzbc.zzb().zzk(bundle, null), false, null);
        }
        zzo.zzg("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.np0
    public final void e(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.f11057y = new Point();
        this.f11058z = new Point();
        if (!this.f11054v) {
            this.f11049p.p0(view);
            this.f11054v = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        lg0 lg0Var = this.f11046m;
        lg0Var.getClass();
        lg0Var.B = new WeakReference(this);
        boolean zZzi = zzbv.zzi(this.f11044k.clientJarVersion);
        if (map != null) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                View view2 = (View) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (view2 != null) {
                    if (zZzi) {
                        view2.setOnTouchListener(onTouchListener);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(onClickListener);
                }
            }
        }
        if (map2 != null) {
            Iterator it2 = map2.entrySet().iterator();
            while (it2.hasNext()) {
                View view3 = (View) ((WeakReference) ((Map.Entry) it2.next()).getValue()).get();
                if (view3 != null) {
                    if (zZzi) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.np0
    public final void f(View view, View view2, Map map, Map map2, boolean z6, ImageView.ScaleType scaleType) throws JSONException {
        Context context = this.f11035a;
        JSONObject jSONObjectZzd = zzbv.zzd(context, map, map2, view2, scaleType);
        JSONObject jSONObjectZzg = zzbv.zzg(context, view2);
        JSONObject jSONObjectZzf = zzbv.zzf(view2);
        JSONObject jSONObjectZze = zzbv.zze(context, view2);
        String strT = t(view, map);
        x(true == ((Boolean) zzbe.zzc().a(zn.L3)).booleanValue() ? view2 : view, jSONObjectZzg, jSONObjectZzd, jSONObjectZzf, jSONObjectZze, strT, zzbv.zzc(strT, context, this.f11058z, this.f11057y), null, z6, false);
    }

    @Override // com.google.android.gms.internal.ads.np0
    public final void g(Bundle bundle) throws JSONException {
        if (bundle == null) {
            zzo.zze("Click data is null. No click is reported.");
        } else if (!u("click_reporting")) {
            zzo.zzg("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
        } else {
            Bundle bundle2 = bundle.getBundle("click_signal");
            x(null, null, null, null, null, bundle2 != null ? bundle2.getString("asset_id") : null, null, zzbc.zzb().zzk(bundle, null), false, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.np0
    public final void h(View view) {
        this.f11057y = new Point();
        this.f11058z = new Point();
        if (view != null) {
            ln0 ln0Var = this.f11049p;
            synchronized (ln0Var) {
                if (ln0Var.f6793t.containsKey(view)) {
                    ((ci) ln0Var.f6793t.get(view)).D.remove(ln0Var);
                    ln0Var.f6793t.remove(view);
                }
            }
        }
        this.f11054v = false;
    }

    @Override // com.google.android.gms.internal.ads.np0
    public final void i(Bundle bundle) {
        if (bundle == null) {
            zzo.zze("Touch event data is null. No touch event is reported.");
            return;
        }
        if (!u("touch_reporting")) {
            zzo.zzg("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
            return;
        }
        this.f11040f.f7110b.zzl((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), bundle.getInt("duration_ms"));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    @Override // com.google.android.gms.internal.ads.np0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(View view, View view2, Map map, Map map2, boolean z6, ImageView.ScaleType scaleType, int i6) throws JSONException {
        boolean z7;
        JSONObject jSONObject;
        JSONObject jSONObject2 = this.f11037c;
        if (jSONObject2.optBoolean("allow_sdk_custom_click_gesture", false)) {
            z7 = ((Boolean) zzbe.zzc().a(zn.sb)).booleanValue();
        }
        if (!z7) {
            if (!this.f11056x) {
                zzo.zze("Custom click reporting failed. enableCustomClickGesture is not set.");
                return;
            } else if (!jSONObject2.optBoolean("allow_custom_click_gesture", false)) {
                zzo.zze("Custom click reporting failed. Ad unit id not in the allow list.");
                return;
            }
        }
        Context context = this.f11035a;
        JSONObject jSONObjectZzd = zzbv.zzd(context, map, map2, view2, scaleType);
        JSONObject jSONObjectZzg = zzbv.zzg(context, view2);
        JSONObject jSONObjectZzf = zzbv.zzf(view2);
        boolean z8 = z7;
        JSONObject jSONObjectZze = zzbv.zze(context, view2);
        String strT = t(view, map);
        JSONObject jSONObjectZzc = zzbv.zzc(strT, context, this.f11058z, this.f11057y);
        if (z8) {
            try {
                Point point = this.f11058z;
                Point point2 = this.f11057y;
                try {
                    jSONObject = new JSONObject();
                    try {
                        JSONObject jSONObject3 = new JSONObject();
                        JSONObject jSONObject4 = new JSONObject();
                        if (point != null) {
                            jSONObject3.put("x", point.x);
                            jSONObject3.put("y", point.y);
                        }
                        if (point2 != null) {
                            jSONObject4.put("x", point2.x);
                            jSONObject4.put("y", point2.y);
                        }
                        jSONObject.put("start_point", jSONObject3);
                        jSONObject.put("end_point", jSONObject4);
                        jSONObject.put("duration_ms", i6);
                    } catch (Exception e6) {
                        e = e6;
                        zzo.zzh("Error occurred while grabbing custom click gesture signals.", e);
                        jSONObject2.put("custom_click_gesture_signal", jSONObject);
                        x(view2, jSONObjectZzg, jSONObjectZzd, jSONObjectZzf, jSONObjectZze, strT, jSONObjectZzc, null, z6, true);
                    }
                } catch (Exception e7) {
                    e = e7;
                    jSONObject = null;
                }
                jSONObject2.put("custom_click_gesture_signal", jSONObject);
            } catch (JSONException e8) {
                zzo.zzh("Error occurred while adding CustomClickGestureSignals to adJson.", e8);
                zzv.zzp().h("FirstPartyNativeAdCore.performCustomClickGesture", e8);
            }
        }
        x(view2, jSONObjectZzg, jSONObjectZzd, jSONObjectZzf, jSONObjectZze, strT, jSONObjectZzc, null, z6, true);
    }

    @Override // com.google.android.gms.internal.ads.np0
    public final void k(String str) throws JSONException {
        x(null, null, null, null, null, str, null, null, false, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.android.gms.internal.ads.yp0, com.google.android.gms.internal.ads.yt] */
    @Override // com.google.android.gms.internal.ads.np0
    public final void l(final ss ssVar) {
        if (!this.f11037c.optBoolean("custom_one_point_five_click_enabled", false)) {
            zzo.zzj("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        final zp0 zp0Var = this.f11047n;
        gs0 gs0Var = zp0Var.s;
        zp0Var.f11551u = ssVar;
        yp0 yp0Var = zp0Var.f11552v;
        if (yp0Var != null) {
            gs0Var.d("/unconfirmedClick", yp0Var);
        }
        ?? r22 = new yt() { // from class: com.google.android.gms.internal.ads.yp0
            @Override // com.google.android.gms.internal.ads.yt
            public final void d(Object obj, Map map) {
                zp0 zp0Var2 = zp0Var;
                try {
                    zp0Var2.f11554x = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
                } catch (NumberFormatException unused) {
                    zzo.zzg("Failed to call parse unconfirmedClickTimestamp.");
                }
                zp0Var2.f11553w = (String) map.get("id");
                String str = (String) map.get("asset_id");
                ss ssVar2 = ssVar;
                if (ssVar2 == null) {
                    zzo.zze("Received unconfirmed click but UnconfirmedClickListener is null.");
                    return;
                }
                try {
                    ssVar2.zzf(str);
                } catch (RemoteException e6) {
                    zzo.zzl("#007 Could not call remote method.", e6);
                }
            }
        };
        zp0Var.f11552v = r22;
        gs0Var.c("/unconfirmedClick", r22);
    }

    @Override // com.google.android.gms.internal.ads.np0
    public final JSONObject m(View view, Map map, Map map2, ImageView.ScaleType scaleType) throws JSONException {
        Context context = this.f11035a;
        JSONObject jSONObjectZzd = zzbv.zzd(context, map, map2, view, scaleType);
        JSONObject jSONObjectZzg = zzbv.zzg(context, view);
        JSONObject jSONObjectZzf = zzbv.zzf(view);
        JSONObject jSONObjectZze = zzbv.zze(context, view);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_view_signal", jSONObjectZzd);
            jSONObject.put("ad_view_signal", jSONObjectZzg);
            jSONObject.put("scroll_view_signal", jSONObjectZzf);
            jSONObject.put("lock_screen_signal", jSONObjectZze);
            return jSONObject;
        } catch (JSONException e6) {
            zzo.zzh("Unable to create native ad view signals JSON.", e6);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.np0
    public final void n(zzdd zzddVar) {
        this.C = zzddVar;
    }

    @Override // com.google.android.gms.internal.ads.np0
    public final void o(MotionEvent motionEvent, View view) {
        this.f11057y = zzbv.zza(motionEvent, view);
        long jA = this.f11048o.a();
        this.B = jA;
        if (motionEvent.getAction() == 0) {
            this.f11051r.f5841a = motionEvent;
            this.A = jA;
            this.f11058z = this.f11057y;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        Point point = this.f11057y;
        motionEventObtain.setLocation(point.x, point.y);
        this.f11040f.f7110b.zzk(motionEventObtain);
        motionEventObtain.recycle();
    }

    @Override // com.google.android.gms.internal.ads.np0
    public final boolean p() {
        return this.f11037c.optBoolean("allow_custom_click_gesture", false);
    }

    @Override // com.google.android.gms.internal.ads.np0
    public final void q(zzdh zzdhVar) {
        zzez zzezVar;
        zzez zzezVar2;
        he1 he1Var = this.s;
        tb1 tb1Var = this.f11043j;
        cf1 cf1Var = this.f11050q;
        try {
            if (this.f11055w) {
                return;
            }
            if (zzdhVar == null) {
                jp0 jp0Var = this.f11039e;
                synchronized (jp0Var) {
                    zzezVar = jp0Var.f6129g;
                }
                if (zzezVar != null) {
                    this.f11055w = true;
                    synchronized (jp0Var) {
                        zzezVar2 = jp0Var.f6129g;
                    }
                    cf1Var.a(zzezVar2.zzf(), tb1Var.f9215x0, he1Var);
                    w();
                    return;
                }
            }
            this.f11055w = true;
            cf1Var.a(zzdhVar.zzf(), tb1Var.f9215x0, he1Var);
            w();
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.np0
    public final JSONObject r(View view, Map map, Map map2, ImageView.ScaleType scaleType) throws JSONException {
        JSONObject jSONObjectM = m(view, map, map2, scaleType);
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f11056x && this.f11037c.optBoolean("allow_custom_click_gesture", false)) {
                jSONObject.put("custom_click_gesture_eligible", true);
            }
            if (jSONObjectM != null) {
                jSONObject.put("nas", jSONObjectM);
            }
            return jSONObject;
        } catch (JSONException e6) {
            zzo.zzh("Unable to create native click meta data JSON.", e6);
            return jSONObject;
        }
    }

    public final String s(View view) {
        if (!((Boolean) zzbe.zzc().a(zn.E3)).booleanValue()) {
            return null;
        }
        try {
            return this.f11040f.f7110b.zzh(this.f11035a, view, null);
        } catch (Exception unused) {
            zzo.zzg("Exception getting data.");
            return null;
        }
    }

    public final String t(View view, Map map) {
        if (map != null && view != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                    return (String) entry.getKey();
                }
            }
        }
        int iG = this.f11039e.g();
        if (iG == 1) {
            return "1099";
        }
        if (iG == 2) {
            return "2099";
        }
        if (iG != 6) {
            return null;
        }
        return "3099";
    }

    public final boolean u(String str) {
        JSONObject jSONObjectOptJSONObject = this.f11037c.optJSONObject("allow_pub_event_reporting");
        return jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optBoolean(str, false);
    }

    public final boolean v(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, boolean z6, View view) throws JSONException {
        Context context = this.f11035a;
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.f11037c);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            if (((Boolean) zzbe.zzc().a(zn.E3)).booleanValue()) {
                jSONObject6.put("view_signals", str);
            }
            jSONObject6.put("policy_validator_enabled", z6);
            JSONObject jSONObject7 = new JSONObject();
            zzv.zzq();
            DisplayMetrics displayMetricsZzu = zzs.zzu((WindowManager) context.getSystemService("window"));
            try {
                jSONObject7.put("width", zzbc.zzb().zzb(context, displayMetricsZzu.widthPixels));
                jSONObject7.put("height", zzbc.zzb().zzb(context, displayMetricsZzu.heightPixels));
            } catch (JSONException unused) {
                jSONObject7 = null;
            }
            jSONObject6.put("screen", jSONObject7);
            boolean zBooleanValue = ((Boolean) zzbe.zzc().a(zn.x8)).booleanValue();
            gs0 gs0Var = this.f11038d;
            if (zBooleanValue) {
                gs0Var.c("/clickRecorded", new zt(this));
            } else {
                gs0Var.c("/logScionEvent", new e90(this));
            }
            gs0Var.c("/nativeImpression", new wo0(this, view));
            y5.g(gs0Var.a("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
            if (this.f11053u) {
                return true;
            }
            this.f11053u = zzv.zzt().zzn(context, this.f11044k.afmaVersion, this.f11043j.C.toString(), this.f11045l.f4211f);
            return true;
        } catch (JSONException e6) {
            zzo.zzh("Unable to create impression JSON.", e6);
            return false;
        }
    }

    public final void w() {
        try {
            zzdd zzddVar = this.C;
            if (zzddVar != null) {
                zzddVar.zze();
            }
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z6, boolean z7) throws JSONException {
        List list;
        boolean z8;
        String strZzd;
        zzez zzezVar;
        i3.a aVar = this.f11048o;
        pp0 pp0Var = this.f11036b;
        JSONObject jSONObject7 = this.f11037c;
        jp0 jp0Var = this.f11039e;
        try {
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("ad", jSONObject7);
            jSONObject8.put("asset_view_signal", jSONObject2);
            jSONObject8.put("ad_view_signal", jSONObject);
            jSONObject8.put("click_signal", jSONObject5);
            jSONObject8.put("scroll_view_signal", jSONObject3);
            jSONObject8.put("lock_screen_signal", jSONObject4);
            jSONObject8.put("has_custom_click_handler", ((cs) pp0Var.f8131g.get(jp0Var.a())) != null);
            jSONObject8.put("provided_signals", jSONObject6);
            JSONObject jSONObject9 = new JSONObject();
            jSONObject9.put("asset_id", str);
            jSONObject9.put("template", jp0Var.g());
            jSONObject9.put("view_aware_api_used", z6);
            oq oqVar = this.f11045l.f4213i;
            jSONObject9.put("custom_mute_requested", oqVar != null && oqVar.f7843y);
            synchronized (jp0Var) {
                list = jp0Var.f6128f;
            }
            if (!list.isEmpty()) {
                synchronized (jp0Var) {
                    zzezVar = jp0Var.f6129g;
                }
                z8 = zzezVar != null;
            }
            jSONObject9.put("custom_mute_enabled", z8);
            if (this.f11047n.f11551u != null && jSONObject7.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject9.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject9.put("timestamp", aVar.a());
            if (this.f11056x && this.f11037c.optBoolean("allow_custom_click_gesture", false)) {
                jSONObject9.put("custom_click_gesture_eligible", true);
            }
            if (z7) {
                jSONObject9.put("is_custom_click_gesture", true);
            }
            jSONObject9.put("has_custom_click_handler", ((cs) pp0Var.f8131g.get(jp0Var.a())) != null);
            try {
                JSONObject jSONObjectOptJSONObject = jSONObject7.optJSONObject("tracking_urls_and_actions");
                if (jSONObjectOptJSONObject == null) {
                    jSONObjectOptJSONObject = new JSONObject();
                }
                strZzd = this.f11040f.f7110b.zzd(this.f11035a, jSONObjectOptJSONObject.optString("click_string"), view);
            } catch (Exception e6) {
                zzo.zzh("Exception obtaining click signals", e6);
                strZzd = null;
            }
            jSONObject9.put("click_signals", strZzd);
            jSONObject9.put("open_chrome_custom_tab", true);
            if (((Boolean) zzbe.zzc().a(zn.B8)).booleanValue() && i3.g.b()) {
                jSONObject9.put("try_fallback_for_deep_link", true);
            }
            if (((Boolean) zzbe.zzc().a(zn.C8)).booleanValue() && i3.g.b()) {
                jSONObject9.put("in_app_link_handling_for_android_11_enabled", true);
            }
            jSONObject8.put("click", jSONObject9);
            JSONObject jSONObject10 = new JSONObject();
            long jA = aVar.a();
            jSONObject10.put("time_from_last_touch_down", jA - this.A);
            jSONObject10.put("time_from_last_touch", jA - this.B);
            jSONObject8.put("touch_signal", jSONObject10);
            if (this.f11043j.b()) {
                JSONObject jSONObject11 = (JSONObject) jSONObject7.get("tracking_urls_and_actions");
                String string = jSONObject11 != null ? jSONObject11.getString("gws_query_id") : null;
                if (string != null) {
                    this.f11052t.e2(string, jp0Var);
                }
            }
            y5.g(this.f11038d.a("google.afma.nativeAds.handleClick", jSONObject8), "Error during performing handleClick");
        } catch (JSONException e7) {
            zzo.zzh("Unable to create click JSON.", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.np0
    public final boolean zzB() {
        if (zza() == 0) {
            return true;
        }
        if (((Boolean) zzbe.zzc().a(zn.sb)).booleanValue()) {
            return this.f11045l.f4213i.B;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.np0
    public final int zza() {
        ec1 ec1Var = this.f11045l;
        if (ec1Var.f4213i == null) {
            return 0;
        }
        if (((Boolean) zzbe.zzc().a(zn.sb)).booleanValue()) {
            return ec1Var.f4213i.A;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.np0
    public final void zzi() {
        View view;
        if (this.f11037c.optBoolean("custom_one_point_five_click_enabled", false)) {
            zp0 zp0Var = this.f11047n;
            if (zp0Var.f11551u == null || zp0Var.f11554x == null) {
                return;
            }
            zp0Var.f11553w = null;
            zp0Var.f11554x = null;
            WeakReference weakReference = zp0Var.f11555y;
            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                view.setClickable(false);
                view.setOnClickListener(null);
                zp0Var.f11555y = null;
            }
            try {
                zp0Var.f11551u.zze();
            } catch (RemoteException e6) {
                zzo.zzl("#007 Could not call remote method.", e6);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.np0
    public final void zzj() {
        gs0 gs0Var = this.f11038d;
        synchronized (gs0Var) {
            hr1 hr1Var = gs0Var.f5151m;
            if (hr1Var == null) {
                return;
            }
            d0 d0Var = new d0(22);
            hr1Var.addListener(new as1(0, hr1Var, d0Var), gs0Var.f5144e);
            gs0Var.f5151m = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.np0
    public final void zzq() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.f11037c);
            y5.g(this.f11038d.a("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (JSONException e6) {
            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.np0
    public final void zzs() throws JSONException {
        v(null, null, null, null, null, null, false, null);
    }
}
