package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaFormat;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class bb implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f3025t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f3026u;

    public /* synthetic */ bb(int i6, Object obj, Object obj2) {
        this.s = i6;
        this.f3025t = obj2;
        this.f3026u = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException, JSONException, InterruptedException {
        MediaPlayer.TrackInfo[] trackInfoArr;
        MediaFormat format;
        gc1 gc1Var;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        switch (this.s) {
            case 0:
                try {
                    ((cb) this.f3026u).f3503t.put((pb) this.f3025t);
                    return;
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            case 1:
                boolean zBooleanValue = ((Boolean) zzbe.zzc().a(zn.W4)).booleanValue();
                mk mkVar = (mk) this.f3025t;
                Context context = (Context) this.f3026u;
                if (zBooleanValue) {
                    try {
                        mkVar.f7170a = (wh) zzs.zzb(context, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", new d0(11));
                        mkVar.f7170a.g(new k3.b(context));
                        mkVar.f7171b = true;
                        return;
                    } catch (RemoteException | zzr | NullPointerException unused2) {
                        zzo.zze("Cannot dynamite load clearcut");
                        return;
                    }
                }
                return;
            case 2:
                ((qw) this.f3025t).s.loadData((String) this.f3026u, "text/html", "UTF-8");
                return;
            case 3:
                zzv.zzj();
                zzn.zza(((zzbrw) this.f3026u).f11613a, (AdOverlayInfoParcel) this.f3025t, true, null);
                return;
            case 4:
                z70 z70Var = (z70) this.f3026u;
                p80 p80Var = z70Var.f11201u;
                MediaPlayer mediaPlayer = (MediaPlayer) this.f3025t;
                if (((Boolean) zzbe.zzc().a(zn.Y1)).booleanValue() && p80Var != null && mediaPlayer != null) {
                    try {
                        MediaPlayer.TrackInfo[] trackInfo = mediaPlayer.getTrackInfo();
                        if (trackInfo != null) {
                            HashMap map = new HashMap();
                            int i6 = 0;
                            while (i6 < trackInfo.length) {
                                MediaPlayer.TrackInfo trackInfo2 = trackInfo[i6];
                                if (trackInfo2 != null) {
                                    int trackType = trackInfo2.getTrackType();
                                    if (trackType == 1) {
                                        MediaFormat format2 = trackInfo2.getFormat();
                                        if (format2 != null) {
                                            if (format2.containsKey("frame-rate")) {
                                                try {
                                                    map.put("frameRate", String.valueOf(format2.getFloat("frame-rate")));
                                                } catch (ClassCastException unused3) {
                                                    map.put("frameRate", String.valueOf(format2.getInteger("frame-rate")));
                                                }
                                            }
                                            if (format2.containsKey("bitrate")) {
                                                Integer numValueOf = Integer.valueOf(format2.getInteger("bitrate"));
                                                z70Var.J = numValueOf;
                                                map.put("bitRate", String.valueOf(numValueOf));
                                            }
                                            if (format2.containsKey("width") && format2.containsKey("height")) {
                                                trackInfoArr = trackInfo;
                                                map.put("resolution", format2.getInteger("width") + "x" + format2.getInteger("height"));
                                            } else {
                                                trackInfoArr = trackInfo;
                                            }
                                            if (format2.containsKey("mime")) {
                                                map.put("videoMime", format2.getString("mime"));
                                            }
                                            if (Build.VERSION.SDK_INT >= 30 && format2.containsKey("codecs-string")) {
                                                map.put("videoCodec", format2.getString("codecs-string"));
                                            }
                                        }
                                    } else if (trackType == 2 && (format = trackInfo2.getFormat()) != null) {
                                        if (format.containsKey("mime")) {
                                            map.put("audioMime", format.getString("mime"));
                                        }
                                        if (Build.VERSION.SDK_INT >= 30 && format.containsKey("codecs-string")) {
                                            map.put("audioCodec", format.getString("codecs-string"));
                                        }
                                    }
                                    trackInfoArr = trackInfo;
                                } else {
                                    trackInfoArr = trackInfo;
                                }
                                i6++;
                                trackInfo = trackInfoArr;
                            }
                            if (!map.isEmpty()) {
                                p80Var.G("onMetadataEvent", map);
                            }
                        }
                    } catch (RuntimeException e6) {
                        zzv.zzp().h("AdMediaPlayerView.reportMetadata", e6);
                    }
                }
                f80 f80Var = z70Var.H;
                if (f80Var != null) {
                    f80Var.g();
                    return;
                }
                return;
            case 5:
                z80 z80Var = (z80) this.f3025t;
                String str = (String) this.f3026u;
                f80 f80Var2 = z80Var.f11216x;
                if (f80Var2 != null) {
                    f80Var2.c("exception", "what", "ExoPlayerAdapter exception", "extra", str);
                    return;
                }
                return;
            case 6:
                fe0 fe0Var = (fe0) this.f3025t;
                Runnable runnable = (Runnable) this.f3026u;
                com.google.android.gms.common.internal.l.d("Adapters must be initialized on the main thread.");
                HashMap map2 = zzv.zzp().d().zzg().f10064c;
                if (map2.isEmpty()) {
                    return;
                }
                if (runnable != null) {
                    try {
                        runnable.run();
                    } catch (Throwable th) {
                        zzo.zzk("Could not initialize rewarded ads.", th);
                        return;
                    }
                }
                if (((gy) ((AtomicReference) fe0Var.f4621u.f7220a.f8029c).get()) != null) {
                    HashMap map3 = new HashMap();
                    Iterator it = map2.values().iterator();
                    while (it.hasNext()) {
                        for (yx yxVar : ((zx) it.next()).f11594a) {
                            String str2 = yxVar.f11111b;
                            for (String str3 : yxVar.f11110a) {
                                if (!map3.containsKey(str3)) {
                                    map3.put(str3, new ArrayList());
                                }
                                if (str2 != null) {
                                    ((List) map3.get(str3)).add(str2);
                                }
                            }
                        }
                    }
                    JSONObject jSONObject3 = new JSONObject();
                    for (Map.Entry entry : map3.entrySet()) {
                        String str4 = (String) entry.getKey();
                        try {
                            b01 b01VarA = fe0Var.f4622v.a(str4, jSONObject3);
                            if (b01VarA != null) {
                                rc1 rc1Var = (rc1) b01VarA.f2884b;
                                boolean zA = rc1Var.a();
                                jy jyVar = rc1Var.f8609a;
                                if (!zA) {
                                    try {
                                        if (jyVar.zzM()) {
                                            try {
                                                jyVar.N0(new k3.b(fe0Var.s), (f11) b01VarA.f2885c, (List) entry.getValue());
                                                zzo.zze("Initialized rewarded video mediation adapter " + str4);
                                            } finally {
                                            }
                                        }
                                    } finally {
                                    }
                                }
                            }
                        } catch (gc1 e7) {
                            zzo.zzk("Failed to initialize rewarded video mediation adapter \"" + str4 + "\"", e7);
                        }
                    }
                    return;
                }
                return;
            case 7:
                vf0 vf0Var = (vf0) this.f3025t;
                Throwable th2 = (Throwable) this.f3026u;
                Context context2 = vf0Var.f9844a;
                if (((Boolean) zzbe.zzc().a(zn.ha)).booleanValue()) {
                    u20 u20VarE = t20.e(context2);
                    vf0Var.f9851i = u20VarE;
                    u20VarE.b("AttributionReporting", th2);
                    return;
                } else {
                    u20 u20VarA = t20.a(context2);
                    vf0Var.h = u20VarA;
                    u20VarA.b("AttributionReportingSampled", th2);
                    return;
                }
            case 8:
                vv0 vv0Var = (vv0) this.f3025t;
                String str5 = (String) this.f3026u;
                sv0 sv0Var = vv0Var.f9945u;
                synchronized (sv0Var) {
                    try {
                        jSONObject = new JSONObject();
                        jSONObject.put("platform", "ANDROID");
                        if (!TextUtils.isEmpty(sv0Var.f9018k)) {
                            jSONObject.put("sdkVersion", "afma-sdk-a-v" + sv0Var.f9018k);
                        }
                        jSONObject.put("internalSdkVersion", sv0Var.f9016i);
                        jSONObject.put("osVersion", Build.VERSION.RELEASE);
                        jSONObject.put("adapters", sv0Var.f9012d.a());
                        if (((Boolean) zzbe.zzc().a(zn.n9)).booleanValue()) {
                            String str6 = zzv.zzp().f2952g;
                            if (!TextUtils.isEmpty(str6)) {
                                jSONObject.put("plugin", str6);
                            }
                        }
                        if (sv0Var.f9024q < zzv.zzC().a() / 1000) {
                            sv0Var.f9022o = "{}";
                        }
                        jSONObject.put("networkExtras", sv0Var.f9022o);
                        jSONObject.put("adSlots", sv0Var.g());
                        jSONObject.put("appInfo", sv0Var.f9013e.a());
                        String str7 = zzv.zzp().d().zzg().f10066e;
                        if (!TextUtils.isEmpty(str7)) {
                            jSONObject.put("cld", new JSONObject(str7));
                        }
                        if (((Boolean) zzbe.zzc().a(zn.d9)).booleanValue() && (jSONObject2 = sv0Var.f9023p) != null) {
                            zzo.zze("Server data: " + jSONObject2.toString());
                            jSONObject.put("serverData", sv0Var.f9023p);
                        }
                        if (((Boolean) zzbe.zzc().a(zn.c9)).booleanValue()) {
                            jSONObject.put("openAction", sv0Var.f9028v);
                            jSONObject.put("gesture", sv0Var.f9025r);
                        }
                        jSONObject.put("isGamRegisteredTestDevice", zzv.zzt().zzl());
                        zzv.zzq();
                        zzbc.zzb();
                        jSONObject.put("isSimulator", zzf.zzr());
                        if (((Boolean) zzbe.zzc().a(zn.p9)).booleanValue()) {
                            jSONObject.put("uiStorage", new JSONObject(sv0Var.f9030x));
                        }
                        if (!TextUtils.isEmpty((CharSequence) zzbe.zzc().a(zn.r9))) {
                            jSONObject.put("gmaDisk", sv0Var.h.f9636a);
                        }
                        if (!TextUtils.isEmpty((CharSequence) zzbe.zzc().a(zn.q9))) {
                            jSONObject.put("userDisk", sv0Var.f9015g.f9636a);
                        }
                    } catch (JSONException e8) {
                        zzv.zzp().g("Inspector.toJson", e8);
                        zzo.zzk("Ad inspector encountered an error", e8);
                    } finally {
                    }
                }
                if (!TextUtils.isEmpty(str5)) {
                    try {
                        jSONObject.put("redirectUrl", str5);
                    } catch (JSONException unused4) {
                    }
                }
                vv0Var.f9946v.a("window.inspectorInfo", jSONObject.toString());
                return;
            case 9:
                ((ia1) this.f3025t).f5640d.k0((zze) this.f3026u);
                return;
            case 10:
                ((kr1) this.f3025t).p((wn1) this.f3026u);
                return;
            case 11:
                androidx.work.k kVarC = androidx.work.k.c();
                String str8 = k2.a.f13538d;
                r2.l lVar = (r2.l) this.f3025t;
                kVarC.a(str8, androidx.camera.camera2.internal.k0.a("Scheduling work ", lVar.f14280a), new Throwable[0]);
                ((k2.a) this.f3026u).f13539a.a(lVar);
                return;
            default:
                v3.h hVar = (v3.h) this.f3026u;
                v3.p pVar = hVar.f14804u;
                v3.p pVar2 = (v3.p) this.f3025t;
                if (pVar2.f()) {
                    pVar.k();
                    return;
                }
                try {
                    pVar.j(hVar.f14803t.b(pVar2));
                    return;
                } catch (v3.e e9) {
                    if (e9.getCause() instanceof Exception) {
                        pVar.i((Exception) e9.getCause());
                        return;
                    } else {
                        pVar.i(e9);
                        return;
                    }
                } catch (Exception e10) {
                    pVar.i(e10);
                    return;
                }
        }
    }

    public /* synthetic */ bb(Object obj, Object obj2, int i6, boolean z6) {
        this.s = i6;
        this.f3025t = obj;
        this.f3026u = obj2;
    }
}
