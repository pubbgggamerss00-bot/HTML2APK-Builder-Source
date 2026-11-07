package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzc;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.nonagon.signalgeneration.zzv;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class fj0 {

    /* renamed from: a, reason: collision with root package name */
    public final ww0 f4693a;

    /* renamed from: b, reason: collision with root package name */
    public final ec1 f4694b;

    /* renamed from: c, reason: collision with root package name */
    public final ae1 f4695c;

    /* renamed from: d, reason: collision with root package name */
    public final ro0 f4696d;

    /* renamed from: e, reason: collision with root package name */
    public final r21 f4697e;

    /* renamed from: f, reason: collision with root package name */
    public final km0 f4698f;

    /* renamed from: g, reason: collision with root package name */
    public ac1 f4699g;
    public final ox0 h;

    /* renamed from: i, reason: collision with root package name */
    public final dk0 f4700i;

    /* renamed from: j, reason: collision with root package name */
    public final Executor f4701j;

    /* renamed from: k, reason: collision with root package name */
    public final gx0 f4702k;

    /* renamed from: l, reason: collision with root package name */
    public final e01 f4703l;

    public fj0(ww0 ww0Var, ec1 ec1Var, ae1 ae1Var, ro0 ro0Var, r21 r21Var, km0 km0Var, ac1 ac1Var, ox0 ox0Var, dk0 dk0Var, h70 h70Var, gx0 gx0Var, e01 e01Var) {
        this.f4693a = ww0Var;
        this.f4694b = ec1Var;
        this.f4695c = ae1Var;
        this.f4696d = ro0Var;
        this.f4697e = r21Var;
        this.f4698f = km0Var;
        this.f4699g = ac1Var;
        this.h = ox0Var;
        this.f4700i = dk0Var;
        this.f4701j = h70Var;
        this.f4702k = gx0Var;
        this.f4703l = e01Var;
    }

    public final vd1 a(c5.a aVar) {
        wd1 wd1VarC = this.f4695c.a(aVar, yd1.f10929w).b(new dh0(11, this)).c(this.f4697e);
        if (!((Boolean) zzbe.zzc().a(zn.f11508x5)).booleanValue()) {
            long jIntValue = ((Integer) zzbe.zzc().a(zn.f11514y5)).intValue();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            wd1VarC = wd1VarC.d(jIntValue);
        }
        return wd1VarC.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0139 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012f A[Catch: all -> 0x00b9, PHI: r5
      0x012f: PHI (r5v19 java.lang.String) = 
      (r5v0 java.lang.String)
      (r5v0 java.lang.String)
      (r5v0 java.lang.String)
      (r5v0 java.lang.String)
      (r5v22 java.lang.String)
      (r5v0 java.lang.String)
     binds: [B:30:0x0099, B:32:0x00a1, B:48:0x00d7, B:62:0x0119, B:60:0x0114, B:42:0x00c4] A[DONT_GENERATE, DONT_INLINE], TryCatch #5 {, blocks: (B:29:0x007e, B:31:0x009b, B:33:0x00a3, B:35:0x00b6, B:40:0x00be, B:43:0x00c5, B:45:0x00cd, B:47:0x00d3, B:51:0x00dc, B:60:0x0114, B:54:0x00ee, B:59:0x00fd, B:62:0x0119, B:39:0x00bc, B:63:0x012f, B:70:0x014a, B:73:0x0152, B:77:0x0176, B:79:0x018c, B:83:0x01af, B:85:0x01c4, B:88:0x01d8, B:90:0x01de, B:91:0x01eb, B:93:0x01ee, B:96:0x01f7, B:95:0x01f4, B:84:0x01b9, B:80:0x019e, B:76:0x0160, B:67:0x0139, B:68:0x013e), top: B:138:0x007e, inners: #1, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01af A[Catch: all -> 0x00b9, TryCatch #5 {, blocks: (B:29:0x007e, B:31:0x009b, B:33:0x00a3, B:35:0x00b6, B:40:0x00be, B:43:0x00c5, B:45:0x00cd, B:47:0x00d3, B:51:0x00dc, B:60:0x0114, B:54:0x00ee, B:59:0x00fd, B:62:0x0119, B:39:0x00bc, B:63:0x012f, B:70:0x014a, B:73:0x0152, B:77:0x0176, B:79:0x018c, B:83:0x01af, B:85:0x01c4, B:88:0x01d8, B:90:0x01de, B:91:0x01eb, B:93:0x01ee, B:96:0x01f7, B:95:0x01f4, B:84:0x01b9, B:80:0x019e, B:76:0x0160, B:67:0x0139, B:68:0x013e), top: B:138:0x007e, inners: #1, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b9 A[Catch: all -> 0x00b9, TryCatch #5 {, blocks: (B:29:0x007e, B:31:0x009b, B:33:0x00a3, B:35:0x00b6, B:40:0x00be, B:43:0x00c5, B:45:0x00cd, B:47:0x00d3, B:51:0x00dc, B:60:0x0114, B:54:0x00ee, B:59:0x00fd, B:62:0x0119, B:39:0x00bc, B:63:0x012f, B:70:0x014a, B:73:0x0152, B:77:0x0176, B:79:0x018c, B:83:0x01af, B:85:0x01c4, B:88:0x01d8, B:90:0x01de, B:91:0x01eb, B:93:0x01ee, B:96:0x01f7, B:95:0x01f4, B:84:0x01b9, B:80:0x019e, B:76:0x0160, B:67:0x0139, B:68:0x013e), top: B:138:0x007e, inners: #1, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f4 A[Catch: all -> 0x00b9, TryCatch #5 {, blocks: (B:29:0x007e, B:31:0x009b, B:33:0x00a3, B:35:0x00b6, B:40:0x00be, B:43:0x00c5, B:45:0x00cd, B:47:0x00d3, B:51:0x00dc, B:60:0x0114, B:54:0x00ee, B:59:0x00fd, B:62:0x0119, B:39:0x00bc, B:63:0x012f, B:70:0x014a, B:73:0x0152, B:77:0x0176, B:79:0x018c, B:83:0x01af, B:85:0x01c4, B:88:0x01d8, B:90:0x01de, B:91:0x01eb, B:93:0x01ee, B:96:0x01f7, B:95:0x01f4, B:84:0x01b9, B:80:0x019e, B:76:0x0160, B:67:0x0139, B:68:0x013e), top: B:138:0x007e, inners: #1, #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final vd1 b() {
        cr1 cr1VarL;
        String strOptString;
        String str;
        int i6;
        String str2;
        String str3;
        String string;
        zzm zzmVar = this.f4694b.f4209d;
        if (zzmVar.zzx == null && zzmVar.zzs == null) {
            return c(this.f4700i.b());
        }
        ae1 ae1Var = this.f4695c;
        ww0 ww0Var = this.f4693a;
        yd1 yd1Var = yd1.P;
        String strA = ww0Var.f10290d.f4209d.zzx;
        if (!TextUtils.isEmpty(strA)) {
            String strSubstring = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            try {
                strSubstring = new JSONObject(strA).optString("request_id", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            } catch (JSONException unused) {
            }
            nn nnVar = zn.R6;
            if (((Boolean) zzbe.zzc().a(nnVar)).booleanValue() && strSubstring.isEmpty()) {
                int iLastIndexOf = strA.lastIndexOf("&request_id=");
                strSubstring = iLastIndexOf != -1 ? strA.substring(iLastIndexOf + 12) : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            }
            String str4 = strSubstring;
            if (TextUtils.isEmpty(str4)) {
                cr1VarL = bs1.l(new p21(15, "Invalid ad string."));
            } else {
                synchronized (ww0Var.f10295j) {
                    zzv zzvVarL = ww0Var.f10287a.l();
                    String strZzb = zzvVarL.zzb(str4, ww0Var.f10294i);
                    if (((Boolean) zzbe.zzc().a(nnVar)).booleanValue()) {
                        zt0 zt0Var = ww0Var.f10294i;
                        if (TextUtils.isEmpty(strZzb)) {
                            if (TextUtils.isEmpty(strA)) {
                            }
                            str = strOptString;
                            if (TextUtils.isEmpty(str)) {
                            }
                        } else {
                            Boolean bool = new JSONObject(strZzb).optString("is_gbid").equals("true") ? Boolean.TRUE : Boolean.FALSE;
                            if (bool.booleanValue()) {
                                int iLastIndexOf2 = strA.lastIndexOf("&");
                                String strSubstring2 = iLastIndexOf2 != -1 ? strA.substring(0, iLastIndexOf2) : null;
                                if (!TextUtils.isEmpty(strSubstring2)) {
                                    try {
                                        byte[] bArrDecode = Base64.decode(strSubstring2, 11);
                                        byte[] bytes = str4.getBytes("UTF-8");
                                        if (TextUtils.isEmpty(strZzb)) {
                                            string = null;
                                            strA = mc1.a(bArrDecode, bytes, string, zt0Var);
                                        } else {
                                            try {
                                                string = new JSONObject(strZzb).getString("arek");
                                            } catch (JSONException e6) {
                                                zze.zza("Failed to get key from QueryJSONMap".concat(e6.toString()));
                                                com.google.android.gms.ads.internal.zzv.zzp().h("CryptoUtils.getKeyFromQueryJsonMap", e6);
                                            }
                                            strA = mc1.a(bArrDecode, bytes, string, zt0Var);
                                        }
                                    } catch (UnsupportedEncodingException e7) {
                                        zze.zza("Failed to decode the adResponse. ".concat(e7.toString()));
                                        com.google.android.gms.ads.internal.zzv.zzp().h("PreloadedLoader.decryptAdResponseIfNecessary", e7);
                                    }
                                }
                            }
                            if (TextUtils.isEmpty(strA)) {
                                try {
                                    strOptString = new JSONObject(strA).optString("render_id", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                                } catch (JSONException unused2) {
                                    strOptString = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                                }
                            } else {
                                strOptString = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                            }
                            str = strOptString;
                            if (TextUtils.isEmpty(str)) {
                                String str5 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                                try {
                                    str5 = new String(Base64.decode(str, 0), StandardCharsets.UTF_8);
                                } catch (IllegalArgumentException e8) {
                                    zze.zza("Ad grouping: Has render_id, but not base64 encoded: ".concat(String.valueOf(str)));
                                    com.google.android.gms.ads.internal.zzv.zzp().h("PreloadedLoader.decodeRenderId", e8);
                                }
                                List listB = cm1.a(new ml1(':')).b(str5);
                                if (listB.size() == 2) {
                                    str2 = (String) listB.get(0);
                                    i6 = Integer.parseInt((String) listB.get(1));
                                    Pair pair = str2 != null ? new Pair(str2, Integer.valueOf(i6)) : new Pair(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, 0);
                                    str3 = (String) pair.first;
                                    int iIntValue = ((Integer) pair.second).intValue();
                                    if (TextUtils.isEmpty(str3) || iIntValue <= 0) {
                                        zzvVarL.zzf(str4);
                                        if (TextUtils.isEmpty(strZzb)) {
                                            zzc zzcVar = ww0Var.f10290d.f4209d.zzs;
                                            if (zzcVar != null) {
                                                if (((Boolean) zzbe.zzc().a(zn.J6)).booleanValue()) {
                                                    String str6 = zzcVar.zza;
                                                    String str7 = zzcVar.zzb;
                                                    String strOptString2 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                                                    try {
                                                        strOptString2 = new JSONObject(str6).optString("request_id", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                                                    } catch (JSONException unused3) {
                                                    }
                                                    String strOptString3 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                                                    try {
                                                        strOptString3 = new JSONObject(str7).optString("request_id", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                                                    } catch (JSONException unused4) {
                                                    }
                                                    if (TextUtils.isEmpty(strOptString3) || !strOptString2.equals(strOptString3)) {
                                                        ww0Var.f10294i.f11575a.put("ridmm", "true");
                                                        cr1VarL = bs1.l(new p21(14, "Mismatch request IDs."));
                                                    } else {
                                                        ww0Var.f10287a.l().zzf(strOptString2);
                                                        ww0Var.f10294i.f11575a.put("request_id", strOptString2);
                                                    }
                                                }
                                                cr1VarL = ww0Var.a(zzcVar.zza, ww0Var.b(zzcVar.zzb));
                                            } else {
                                                cr1VarL = bs1.l(new p21(14, "Mismatch request IDs."));
                                            }
                                        } else {
                                            cr1VarL = ww0Var.a(strA, ww0Var.b(strZzb));
                                        }
                                    } else if (zzvVarL.zzh(str4, str3)) {
                                        cr1VarL = bs1.l(new p21(10, "The ad has already been shown."));
                                    } else {
                                        if (!zzvVarL.zzg(str4, str3, iIntValue)) {
                                        }
                                        if (TextUtils.isEmpty(strZzb)) {
                                        }
                                    }
                                } else {
                                    zze.zza("Ad grouping: Has render_id, but invalid format: ".concat(String.valueOf(str)));
                                    i6 = 0;
                                    str2 = null;
                                    if (str2 != null) {
                                    }
                                    str3 = (String) pair.first;
                                    int iIntValue2 = ((Integer) pair.second).intValue();
                                    if (TextUtils.isEmpty(str3)) {
                                        zzvVarL.zzf(str4);
                                        if (TextUtils.isEmpty(strZzb)) {
                                        }
                                    }
                                }
                            } else {
                                i6 = 0;
                                str2 = null;
                                if (str2 != null) {
                                }
                                str3 = (String) pair.first;
                                int iIntValue22 = ((Integer) pair.second).intValue();
                                if (TextUtils.isEmpty(str3)) {
                                }
                            }
                        }
                    }
                }
            }
        }
        return new wd1(ae1Var, yd1Var, null, ae1.f2730d, Collections.EMPTY_LIST, cr1VarL).a();
    }

    public final vd1 c(c5.a aVar) {
        ac1 ac1Var = this.f4699g;
        if (ac1Var != null) {
            return new wd1(this.f4695c, yd1.f10928v, null, ae1.f2730d, Collections.EMPTY_LIST, bs1.m(ac1Var)).a();
        }
        tj tjVarZzc = com.google.android.gms.ads.internal.zzv.zzc();
        tjVarZzc.getClass();
        if (((Boolean) zzbe.zzc().a(zn.f11445n4)).booleanValue()) {
            synchronized (tjVarZzc.f9301c) {
                try {
                    tjVarZzc.d();
                    ScheduledFuture scheduledFuture = tjVarZzc.f9299a;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    tjVarZzc.f9299a = i70.f5589d.schedule(tjVarZzc.f9300b, ((Long) zzbe.zzc().a(zn.f11451o4)).longValue(), TimeUnit.MILLISECONDS);
                } finally {
                }
            }
        }
        return this.f4695c.a(aVar, yd1.f10928v).c(new zi0(1, this.f4702k)).a();
    }
}
