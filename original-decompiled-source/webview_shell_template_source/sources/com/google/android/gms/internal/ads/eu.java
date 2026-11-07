package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import java.net.URISyntaxException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class eu implements zr1, jk {

    /* renamed from: t, reason: collision with root package name */
    public Object f4395t = null;

    /* renamed from: u, reason: collision with root package name */
    public Object f4396u = null;
    public Object s = null;

    /* renamed from: v, reason: collision with root package name */
    public Object f4397v = lu1.f6858w;

    /* JADX WARN: Removed duplicated region for block: B:119:0x0312  */
    @Override // com.google.android.gms.internal.ads.zr1
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo2a(Object obj) throws URISyntaxException {
        boolean zB;
        String str;
        boolean z6;
        Map map = (Map) this.f4395t;
        String str2 = (String) obj;
        if (((Boolean) zzbe.zzc().a(zn.U9)).booleanValue()) {
            map.put("u", str2);
        }
        iu iuVar = (iu) this.f4397v;
        zza zzaVar = (zza) this.f4396u;
        String str3 = (String) this.s;
        dz0 dz0Var = iuVar.f5845w;
        xa0 xa0Var = (xa0) zzaVar;
        tb1 tb1VarD = xa0Var.d();
        vb1 vb1VarH = xa0Var.h();
        String str4 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        if (tb1VarD == null || vb1VarH == null) {
            zB = false;
        } else {
            str4 = vb1VarH.f9774b;
            zB = tb1VarD.b();
        }
        boolean z7 = (((Boolean) zzbe.zzc().a(zn.Ca)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("0")) ? false : true;
        if (((Boolean) zzbe.zzc().a(zn.Cc)).booleanValue() && map.containsKey("ig_cl") && ((String) map.get("ig_cl")).equals("true")) {
            str = str2;
            z6 = true;
        } else {
            str = str2;
            z6 = false;
        }
        if ("expand".equalsIgnoreCase(str3)) {
            if (xa0Var.x()) {
                zzo.zzj("Cannot expand WebView that is already expanded.");
                return;
            } else {
                iuVar.g(false);
                ((ub0) zzaVar).f(iu.a(map), "1".equals(map.get("custom_close")), z7);
                return;
            }
        }
        if ("webapp".equalsIgnoreCase(str3)) {
            iuVar.g(false);
            boolean z8 = ((Boolean) zzbe.zzc().a(zn.Mb)).booleanValue() && Objects.equals(map.get("is_allowed_for_lock_screen"), "1");
            if (str != null) {
                ((ub0) zzaVar).i("1".equals(map.get("custom_close")), iu.a(map), str, z7, z8);
                return;
            } else {
                ((ub0) zzaVar).k("1".equals(map.get("custom_close")), iu.a(map), (String) map.get("html"), (String) map.get("baseurl"), z7);
                return;
            }
        }
        boolean z9 = z7;
        if ("chrome_custom_tab".equalsIgnoreCase(str3)) {
            Context context = xa0Var.getContext();
            if (((Boolean) zzbe.zzc().a(zn.I4)).booleanValue()) {
                zze.zza("User opt out chrome custom tab.");
                iuVar.i(10);
            } else {
                if (((Boolean) zzbe.zzc().a(zn.G4)).booleanValue() ? p.d.a(context) != null : xo.a(context)) {
                    iuVar.g(true);
                    if (TextUtils.isEmpty(str)) {
                        zzo.zzj("Cannot open browser with null or empty url");
                        iuVar.i(7);
                        return;
                    }
                    Uri uriC = iu.c(iu.b(xa0Var.getContext(), xa0Var.b(), Uri.parse(str), xa0Var.zzF(), xa0Var.zzi(), xa0Var.R()));
                    if (zB && dz0Var != null && iuVar.h(zzaVar, xa0Var.getContext(), uriC.toString(), str4)) {
                        return;
                    }
                    iuVar.f5847y = new fu(iuVar);
                    ((ub0) zzaVar).c0(new zzc(null, uriC.toString(), null, null, null, null, null, null, new k3.b(iuVar.f5847y), true), z9, z6, str4);
                    return;
                }
                iuVar.i(4);
            }
            map.put("use_first_package", "true");
            map.put("use_running_process", "true");
            iuVar.f(zzaVar, map, zB, str4, z9, z6);
            return;
        }
        boolean z10 = z9;
        if ("app".equalsIgnoreCase(str3) && "true".equalsIgnoreCase((String) map.get("system_browser"))) {
            iuVar.f(zzaVar, map, zB, str4, z10, z6);
            return;
        }
        if ("open_app".equalsIgnoreCase(str3)) {
            if (((Boolean) zzbe.zzc().a(zn.d8)).booleanValue()) {
                iuVar.g(true);
                String str5 = (String) map.get("p");
                if (str5 == null) {
                    zzo.zzj("Package name missing from open app action.");
                    return;
                }
                if (zB && dz0Var != null && iuVar.h(zzaVar, xa0Var.getContext(), str5, str4)) {
                    return;
                }
                PackageManager packageManager = xa0Var.getContext().getPackageManager();
                if (packageManager == null) {
                    zzo.zzj("Cannot get package manager from open app action.");
                    return;
                }
                Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str5);
                if (launchIntentForPackage != null) {
                    ((ub0) zzaVar).c0(new zzc(launchIntentForPackage, iuVar.f5847y), z10, z6, str4);
                    return;
                }
                return;
            }
            return;
        }
        iuVar.g(true);
        String str6 = (String) map.get("intent_url");
        Intent uri = null;
        if (!TextUtils.isEmpty(str6)) {
            try {
                uri = Intent.parseUri(str6, 0);
            } catch (URISyntaxException e6) {
                zzo.zzh("Error parsing the url: ".concat(String.valueOf(str6)), e6);
            }
        }
        if (uri != null && uri.getData() != null) {
            Uri data = uri.getData();
            if (!Uri.EMPTY.equals(data)) {
                Uri uriC2 = iu.c(iu.b(xa0Var.getContext(), xa0Var.b(), data, xa0Var.zzF(), xa0Var.zzi(), xa0Var.R()));
                if (!TextUtils.isEmpty(uri.getType())) {
                    if (((Boolean) zzbe.zzc().a(zn.e8)).booleanValue()) {
                        uri.setDataAndType(uriC2, uri.getType());
                    } else {
                        uri.setData(uriC2);
                    }
                }
            }
        }
        boolean z11 = ((Boolean) zzbe.zzc().a(zn.z8)).booleanValue() && "intent_async".equalsIgnoreCase(str3) && map.containsKey("event_id");
        HashMap map2 = new HashMap();
        if (z11) {
            iuVar.f5847y = new gu(z10, zzaVar, map2, map);
            z10 = false;
        }
        if (uri != null) {
            if (!zB || dz0Var == null || !iuVar.h(zzaVar, xa0Var.getContext(), uri.getData().toString(), str4)) {
                ((ub0) zzaVar).c0(new zzc(uri, iuVar.f5847y), z10, z6, str4);
                return;
            } else {
                if (z11) {
                    map2.put((String) map.get("event_id"), Boolean.TRUE);
                    ((lw) zzaVar).G("openIntentAsync", map2);
                    return;
                }
                return;
            }
        }
        String string = !TextUtils.isEmpty(str) ? iu.c(iu.b(xa0Var.getContext(), xa0Var.b(), Uri.parse(str), xa0Var.zzF(), xa0Var.zzi(), xa0Var.R())).toString() : str;
        if (!zB || dz0Var == null || !iuVar.h(zzaVar, xa0Var.getContext(), string, str4)) {
            ((ub0) zzaVar).c0(new zzc((String) map.get("i"), string, (String) map.get("m"), (String) map.get("p"), (String) map.get("c"), (String) map.get("f"), (String) map.get("e"), iuVar.f5847y), z10, z6, str4);
        } else if (z11) {
            map2.put((String) map.get("event_id"), Boolean.TRUE);
            ((lw) zzaVar).G("openIntentAsync", map2);
        }
    }

    public void b(int i6) throws GeneralSecurityException {
        if (i6 != 12 && i6 != 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i6)));
        }
        this.f4396u = Integer.valueOf(i6);
    }

    @Override // com.google.android.gms.internal.ads.jk
    public void c(cn cnVar) {
        pk pkVarR = ((dn) cnVar.f4126t).K().r();
        ok okVar = (ok) this.f4395t;
        pkVarR.i();
        qk.B((qk) pkVarR.f4126t, okVar);
        cnVar.i();
        dn.D((dn) cnVar.f4126t, pkVarR.g());
        xm xmVarR = ((dn) cnVar.f4126t).L().r();
        String str = (String) this.s;
        xmVarR.i();
        ym.B((ym) xmVarR.f4126t, str);
        ll llVar = (ll) this.f4396u;
        xmVarR.i();
        ym.C((ym) xmVarR.f4126t, llVar);
        cnVar.i();
        dn.F((dn) cnVar.f4126t, xmVarR.g());
        String str2 = (String) this.f4397v;
        cnVar.i();
        dn.I((dn) cnVar.f4126t, str2);
    }

    public void d(int i6) throws InvalidAlgorithmParameterException {
        if (i6 != 16 && i6 != 24 && i6 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i6)));
        }
        this.f4395t = Integer.valueOf(i6);
    }

    public h20 e() {
        ih1.k((Long) this.f4397v, Long.class);
        ih1.k((String) this.s, String.class);
        return new h20((kd0) this.f4395t, (td0) this.f4396u, (Long) this.f4397v, (String) this.s);
    }

    public void f() {
        this.s = 16;
    }

    public mu1 g() throws GeneralSecurityException {
        Integer num = (Integer) this.f4395t;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (((Integer) this.f4396u) == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (((Integer) this.s) == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int iIntValue = num.intValue();
        int iIntValue2 = ((Integer) this.f4396u).intValue();
        ((Integer) this.s).getClass();
        return new mu1(iIntValue, iIntValue2, (lu1) this.f4397v);
    }

    @Override // com.google.android.gms.internal.ads.zr1
    public void j(Throwable th) {
        zzv.zzp().h("OpenGmsgHandler.attributionReportingManager", th);
    }
}
