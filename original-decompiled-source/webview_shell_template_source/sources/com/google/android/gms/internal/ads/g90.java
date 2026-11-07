package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzcj;
import com.google.android.gms.ads.internal.util.zze;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class g90 implements yt {
    public boolean s;

    public static int a(Context context, Map map, String str, int i6) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                zzbc.zzb();
                i6 = zzf.zzx(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                zzo.zzj("Could not parse " + str + " in a video GMSG: " + str2);
            }
        }
        if (zze.zzc()) {
            StringBuilder sbA = androidx.camera.camera2.internal.i0.a("Parse pixels for ", str, ", got string ", str2, ", int ");
            sbA.append(i6);
            sbA.append(".");
            zze.zza(sbA.toString());
        }
        return i6;
    }

    public static void b(f80 f80Var, Map map) throws NumberFormatException {
        b80 b80Var = f80Var.f4542y;
        String str = (String) map.get("minBufferMs");
        String str2 = (String) map.get("maxBufferMs");
        String str3 = (String) map.get("bufferForPlaybackMs");
        String str4 = (String) map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = (String) map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                int i6 = Integer.parseInt(str);
                if (b80Var != null) {
                    b80Var.d(i6);
                }
            } catch (NumberFormatException unused) {
                zzo.zzj("Could not parse buffer parameters in loadControl video GMSG: (" + str + ", " + str2 + ")");
                return;
            }
        }
        if (str2 != null) {
            int i7 = Integer.parseInt(str2);
            if (b80Var != null) {
                b80Var.B(i7);
            }
        }
        if (str3 != null) {
            int i8 = Integer.parseInt(str3);
            if (b80Var != null) {
                b80Var.z(i8);
            }
        }
        if (str4 != null) {
            int i9 = Integer.parseInt(str4);
            if (b80Var != null) {
                b80Var.A(i9);
            }
        }
        if (str5 != null) {
            int i10 = Integer.parseInt(str5);
            if (b80Var == null) {
                return;
            }
            b80Var.f(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.yt
    public final void d(Object obj, Map map) throws NumberFormatException {
        int iMin;
        int iMin2;
        int i6;
        boolean z6;
        int i7;
        f80 f80Var;
        b80 b80Var;
        p80 p80Var = (p80) obj;
        String str = (String) map.get("action");
        if (str == null) {
            zzo.zzj("Action missing from video GMSG.");
            return;
        }
        Integer numValueOf = map.containsKey("playerId") ? Integer.valueOf(Integer.parseInt((String) map.get("playerId"))) : null;
        Integer numY = (p80Var.zzo() == null || (f80Var = p80Var.zzo().f4938d) == null || (b80Var = f80Var.f4542y) == null) ? null : b80Var.y();
        if (numValueOf != null && numY != null && !numValueOf.equals(numY) && !str.equals("load")) {
            Locale locale = Locale.US;
            zzo.zzi("Event intended for player " + numValueOf + ", but sent to player " + numY + " - event ignored");
            return;
        }
        Integer numValueOf2 = null;
        if (zzo.zzm(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            zzo.zze("Video GMSG: " + str + " " + jSONObject.toString());
        }
        if (str.equals("background")) {
            String str2 = (String) map.get("color");
            if (TextUtils.isEmpty(str2)) {
                zzo.zzj("Color parameter missing from background video GMSG.");
                return;
            }
            try {
                p80Var.setBackgroundColor(Color.parseColor(str2));
                return;
            } catch (IllegalArgumentException unused) {
                zzo.zzj("Invalid color parameter in background video GMSG.");
                return;
            }
        }
        if (str.equals("playerBackground")) {
            String str3 = (String) map.get("color");
            if (TextUtils.isEmpty(str3)) {
                zzo.zzj("Color parameter missing from playerBackground video GMSG.");
                return;
            }
            try {
                p80Var.e(Color.parseColor(str3));
                return;
            } catch (IllegalArgumentException unused2) {
                zzo.zzj("Invalid color parameter in playerBackground video GMSG.");
                return;
            }
        }
        if (str.equals("decoderProps")) {
            String str4 = (String) map.get("mimeTypes");
            if (str4 == null) {
                zzo.zzj("No MIME types specified for decoder properties inspection.");
                HashMap map2 = new HashMap();
                map2.put("event", "decoderProps");
                map2.put("error", "missingMimeTypes");
                p80Var.G("onVideoEvent", map2);
                return;
            }
            HashMap map3 = new HashMap();
            for (String str5 : str4.split(",")) {
                map3.put(str5, zzcj.zza(str5.trim()));
            }
            HashMap map4 = new HashMap();
            map4.put("event", "decoderProps");
            map4.put("mimeTypes", map3);
            p80Var.G("onVideoEvent", map4);
            return;
        }
        g80 g80VarZzo = p80Var.zzo();
        if (g80VarZzo == null) {
            zzo.zzj("Could not get underlay container for a video GMSG.");
            return;
        }
        boolean zEquals = str.equals("new");
        boolean zEquals2 = str.equals("position");
        if (zEquals || zEquals2) {
            Context context = p80Var.getContext();
            int iA = a(context, map, "x", 0);
            int iA2 = a(context, map, "y", 0);
            int iA3 = a(context, map, "w", -1);
            nn nnVar = zn.W3;
            if (((Boolean) zzbe.zzc().a(nnVar)).booleanValue()) {
                iMin = iA3 == -1 ? p80Var.zzh() : Math.min(iA3, p80Var.zzh());
            } else {
                if (zze.zzc()) {
                    StringBuilder sbA = androidx.camera.camera2.internal.g0.a("Calculate width with original width ", iA3, ", videoHost.getVideoBoundingWidth() ", p80Var.zzh(), ", x ");
                    sbA.append(iA);
                    sbA.append(".");
                    zze.zza(sbA.toString());
                }
                iMin = Math.min(iA3, p80Var.zzh() - iA);
            }
            int iA4 = a(context, map, "h", -1);
            if (((Boolean) zzbe.zzc().a(nnVar)).booleanValue()) {
                iMin2 = iA4 == -1 ? p80Var.zzg() : Math.min(iA4, p80Var.zzg());
            } else {
                if (zze.zzc()) {
                    StringBuilder sbA2 = androidx.camera.camera2.internal.g0.a("Calculate height with original height ", iA4, ", videoHost.getVideoBoundingHeight() ", p80Var.zzg(), ", y ");
                    sbA2.append(iA2);
                    sbA2.append(".");
                    zze.zza(sbA2.toString());
                }
                iMin2 = Math.min(iA4, p80Var.zzg() - iA2);
            }
            try {
                i6 = Integer.parseInt((String) map.get("player"));
            } catch (NumberFormatException unused3) {
                i6 = 0;
            }
            boolean z7 = Boolean.parseBoolean((String) map.get("spherical"));
            if (!zEquals || g80VarZzo.f4938d != null) {
                com.google.android.gms.common.internal.l.d("The underlay may only be modified from the UI thread.");
                f80 f80Var2 = g80VarZzo.f4938d;
                if (f80Var2 != null) {
                    f80Var2.a(iA, iA2, iMin, iMin2);
                    return;
                }
                return;
            }
            o80 o80Var = new o80((String) map.get("flags"));
            jb0 jb0Var = g80VarZzo.f4936b;
            if (g80VarZzo.f4938d == null) {
                mb0 mb0Var = jb0Var.s;
                fo.d((oo) mb0Var.f7048g0.f6799u, mb0Var.f7046e0, "vpr2");
                f80 f80Var3 = new f80(g80VarZzo.f4935a, jb0Var, i6, z7, (oo) jb0Var.s.f7048g0.f6799u, o80Var);
                g80VarZzo.f4938d = f80Var3;
                g80VarZzo.f4937c.addView(f80Var3, 0, new ViewGroup.LayoutParams(-1, -1));
                g80VarZzo.f4938d.a(iA, iA2, iMin, iMin2);
                jb0Var.s.F.D = false;
            }
            f80 f80Var4 = g80VarZzo.f4938d;
            if (f80Var4 != null) {
                b(f80Var4, map);
                return;
            }
            return;
        }
        ob0 ob0VarZzq = p80Var.zzq();
        if (ob0VarZzq != null) {
            if (str.equals("timeupdate")) {
                String str6 = (String) map.get("currentTime");
                if (str6 == null) {
                    zzo.zzj("currentTime parameter missing from timeupdate video GMSG.");
                    return;
                }
                try {
                    float f6 = Float.parseFloat(str6);
                    synchronized (ob0VarZzq.f7669t) {
                        ob0VarZzq.B = f6;
                    }
                    return;
                } catch (NumberFormatException unused4) {
                    zzo.zzj("Could not parse currentTime parameter from timeupdate video GMSG: ".concat(str6));
                    return;
                }
            }
            if (str.equals("skip")) {
                synchronized (ob0VarZzq.f7669t) {
                    z6 = ob0VarZzq.f7675z;
                    i7 = ob0VarZzq.f7672w;
                    ob0VarZzq.f7672w = 3;
                }
                i70.f5591f.execute(new nb0(ob0VarZzq, i7, 3, z6, z6));
                return;
            }
        }
        f80 f80Var5 = g80VarZzo.f4938d;
        if (f80Var5 == null) {
            HashMap map5 = new HashMap();
            map5.put("event", "no_video_view");
            p80Var.G("onVideoEvent", map5);
            return;
        }
        if (str.equals("click")) {
            Context context2 = p80Var.getContext();
            int iA5 = a(context2, map, "x", 0);
            float fA = a(context2, map, "y", 0);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, iA5, fA, 0);
            b80 b80Var2 = f80Var5.f4542y;
            if (b80Var2 != null) {
                b80Var2.dispatchTouchEvent(motionEventObtain);
            }
            motionEventObtain.recycle();
            return;
        }
        if (str.equals("currentTime")) {
            String str7 = (String) map.get("time");
            if (str7 == null) {
                zzo.zzj("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try {
                int i8 = (int) (Float.parseFloat(str7) * 1000.0f);
                b80 b80Var3 = f80Var5.f4542y;
                if (b80Var3 == null) {
                    return;
                }
                b80Var3.t(i8);
                return;
            } catch (NumberFormatException unused5) {
                zzo.zzj("Could not parse time parameter from currentTime video GMSG: ".concat(str7));
                return;
            }
        }
        if (str.equals("hide")) {
            f80Var5.setVisibility(4);
            return;
        }
        if (str.equals("remove")) {
            f80Var5.setVisibility(8);
            return;
        }
        if (str.equals("load")) {
            b80 b80Var4 = f80Var5.f4542y;
            if (b80Var4 == null) {
                return;
            }
            if (TextUtils.isEmpty(f80Var5.F)) {
                f80Var5.c("no_src", new String[0]);
                return;
            } else {
                b80Var4.h(f80Var5.F, f80Var5.G, numValueOf);
                return;
            }
        }
        if (str.equals("loadControl")) {
            b(f80Var5, map);
            return;
        }
        if (str.equals("muted")) {
            if (Boolean.parseBoolean((String) map.get("muted"))) {
                b80 b80Var5 = f80Var5.f4542y;
                if (b80Var5 == null) {
                    return;
                }
                t80 t80Var = b80Var5.f2979t;
                t80Var.f9129e = true;
                t80Var.a();
                b80Var5.zzn();
                return;
            }
            b80 b80Var6 = f80Var5.f4542y;
            if (b80Var6 == null) {
                return;
            }
            t80 t80Var2 = b80Var6.f2979t;
            t80Var2.f9129e = false;
            t80Var2.a();
            b80Var6.zzn();
            return;
        }
        if (str.equals("pause")) {
            b80 b80Var7 = f80Var5.f4542y;
            if (b80Var7 == null) {
                return;
            }
            b80Var7.r();
            return;
        }
        if (str.equals("play")) {
            b80 b80Var8 = f80Var5.f4542y;
            if (b80Var8 == null) {
                return;
            }
            b80Var8.s();
            return;
        }
        if (str.equals("show")) {
            f80Var5.setVisibility(0);
            return;
        }
        if (str.equals("src")) {
            String str8 = (String) map.get("src");
            if (map.containsKey("periodicReportIntervalMs")) {
                try {
                    numValueOf2 = Integer.valueOf(Integer.parseInt((String) map.get("periodicReportIntervalMs")));
                } catch (NumberFormatException unused6) {
                    zzo.zzj("Video gmsg invalid numeric parameter 'periodicReportIntervalMs': ".concat(String.valueOf((String) map.get("periodicReportIntervalMs"))));
                }
            }
            String[] strArr = {str8};
            String str9 = (String) map.get("demuxed");
            if (str9 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str9);
                    String[] strArr2 = new String[jSONArray.length()];
                    for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                        strArr2[i9] = jSONArray.getString(i9);
                    }
                    strArr = strArr2;
                } catch (JSONException unused7) {
                    zzo.zzj("Malformed demuxed URL list for playback: ".concat(str9));
                    strArr = new String[]{str8};
                }
            }
            if (numValueOf2 != null) {
                p80Var.zzA(numValueOf2.intValue());
            }
            f80Var5.F = str8;
            f80Var5.G = strArr;
            return;
        }
        if (str.equals("touchMove")) {
            Context context3 = p80Var.getContext();
            int iA6 = a(context3, map, "dx", 0);
            int iA7 = a(context3, map, "dy", 0);
            float f7 = iA6;
            float f8 = iA7;
            b80 b80Var9 = f80Var5.f4542y;
            if (b80Var9 != null) {
                b80Var9.x(f7, f8);
            }
            if (this.s) {
                return;
            }
            p80Var.t();
            this.s = true;
            return;
        }
        if (!str.equals("volume")) {
            if (str.equals("watermark")) {
                f80Var5.k();
                return;
            } else {
                zzo.zzj("Unknown video action: ".concat(str));
                return;
            }
        }
        String str10 = (String) map.get("volume");
        if (str10 == null) {
            zzo.zzj("Level parameter missing from volume video GMSG.");
            return;
        }
        try {
            float f9 = Float.parseFloat(str10);
            b80 b80Var10 = f80Var5.f4542y;
            if (b80Var10 == null) {
                return;
            }
            t80 t80Var3 = b80Var10.f2979t;
            t80Var3.f9130f = f9;
            t80Var3.a();
            b80Var10.zzn();
        } catch (NumberFormatException unused8) {
            zzo.zzj("Could not parse volume parameter from volume video GMSG: ".concat(str10));
        }
    }
}
