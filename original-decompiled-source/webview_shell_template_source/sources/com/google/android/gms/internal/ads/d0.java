package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzbl;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.ads.internal.util.client.zzq;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaa;
import java.io.ByteArrayInputStream;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d0 implements q1, zzq, hx, om0, zr1, ix, ri0, sa1, v3.a {
    public static final ef0 B;

    /* renamed from: z, reason: collision with root package name */
    public static final d0 f3707z;
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public static final int[] f3701t = {1, 2, 3, 6};

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f3702u = {48000, 44100, 32000};

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f3703v = {24000, 22050, 16000};

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f3704w = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f3705x = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, AdRequest.MAX_CONTENT_URL_LENGTH, 576, 640};

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f3706y = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};
    public static final ef0 A = new ef0(0);
    public static final ef0 C = new ef0(4);
    public static final ho0 D = new ho0();
    public static final ef0 E = new ef0(6);
    public static final ef0 F = new ef0(7);
    public static final ef0 G = new ef0(8);
    public static final d0 H = new d0(9);

    static {
        int i6 = 1;
        f3707z = new d0(i6);
        B = new ef0(i6);
    }

    public /* synthetic */ d0(int i6) {
        this.s = i6;
    }

    public static de1 e(Context context, int i6) {
        boolean zBooleanValue;
        if (ie1.a()) {
            int i7 = i6 - 2;
            if (i7 != 20 && i7 != 21) {
                switch (i7) {
                    case 2:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        zBooleanValue = ((Boolean) mp.f7199c.c()).booleanValue();
                        break;
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        zBooleanValue = ((Boolean) mp.f7200d.c()).booleanValue();
                        break;
                    case 5:
                        zBooleanValue = ((Boolean) mp.f7198b.c()).booleanValue();
                        break;
                }
            } else {
                zBooleanValue = ((Boolean) mp.f7201e.c()).booleanValue();
            }
            if (zBooleanValue) {
                return new ee1(context, i6);
            }
        }
        return new te1();
    }

    public static void f(String str, Exception exc) {
        Log.e("OMIDLIB", str, exc);
    }

    public static de1 g(Context context, int i6, int i7, zzm zzmVar) {
        boolean zMatches;
        de1 de1VarE = e(context, i6);
        if (de1VarE instanceof ee1) {
            ee1 ee1Var = (ee1) de1VarE;
            ee1Var.h();
            ee1Var.a(i7);
            ee1Var.b(zzaa.zza(zzmVar.zzm));
            String str = zzmVar.zzp;
            if (TextUtils.isEmpty(str)) {
                zMatches = false;
            } else {
                zMatches = Pattern.matches((String) zzbe.zzc().a(zn.H8), str);
            }
            if (zMatches) {
                ee1Var.zze(zzmVar.zzp);
            }
        }
        return de1VarE;
    }

    public static void h(SpannableStringBuilder spannableStringBuilder, Object obj, int i6, int i7) {
        for (Object obj2 : spannableStringBuilder.getSpans(i6, i7, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i6 && spannableStringBuilder.getSpanEnd(obj2) == i7 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i6, i7, 33);
    }

    public static int i(int i6, int i7) {
        int i8;
        if (i6 < 0 || i6 >= 3 || i7 < 0 || (i8 = i7 >> 1) >= 19) {
            return -1;
        }
        int i9 = f3702u[i6];
        if (i9 == 44100) {
            int i10 = f3706y[i8] + (i7 & 1);
            return i10 + i10;
        }
        int i11 = f3705x[i8];
        return i9 == 32000 ? i11 * 6 : i11 * 4;
    }

    @Override // com.google.android.gms.internal.ads.ix
    public JSONObject a(Object obj) throws JSONException {
        xx0 xx0Var = (xx0) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (((Boolean) zzbe.zzc().a(zn.g9)).booleanValue()) {
            jSONObject2.put("ad_request_url", xx0Var.f10741c.f9090f);
            jSONObject2.put("ad_request_post_body", xx0Var.f10741c.f9087c);
        }
        t30 t30Var = xx0Var.f10741c;
        by0 by0Var = xx0Var.f10739a;
        jSONObject2.put("base_url", t30Var.f9086b);
        jSONObject2.put("signals", xx0Var.f10740b);
        jSONObject3.put("body", by0Var.f3326c);
        jSONObject3.put("headers", zzbc.zzb().zzj(by0Var.f3325b));
        jSONObject3.put("response_code", by0Var.f3324a);
        jSONObject3.put("latency", by0Var.f3327d);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", xx0Var.f10741c.h);
        return jSONObject;
    }

    @Override // v3.a
    public Object b(v3.p pVar) {
        return Boolean.valueOf(pVar.h());
    }

    @Override // com.google.android.gms.internal.ads.hx
    public Object c(JSONObject jSONObject) {
        return new ByteArrayInputStream(jSONObject.toString().getBytes(kx.f6518a));
    }

    public int d(w wVar) {
        return wVar.f9982q != null ? 1 : 0;
    }

    @Override // com.google.android.gms.internal.ads.ri0
    public zzeb zza() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.om0
    /* renamed from: zza, reason: collision with other method in class */
    public void mo3zza(Object obj) {
        switch (this.s) {
            case 17:
                ((zza) obj).onAdClicked();
                break;
            case 18:
                ((pk0) obj).zzc();
                break;
            case 19:
                ((zzr) obj).zzdi();
                break;
            case 20:
                ((fm0) obj).zzi();
                break;
            case dn.zzm /* 21 */:
                ((nm0) obj).zza();
                break;
            case 22:
            case 23:
            case 24:
            default:
                ((u40) obj).zzj();
                break;
            case 25:
                ((zzbl) obj).zzj();
                break;
        }
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzq
    public Object zza(Object obj) {
        IBinder iBinder = (IBinder) obj;
        switch (this.s) {
            case 11:
                int i6 = vh.s;
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.clearcut.IClearcut");
                if (iInterfaceQueryLocalInterface instanceof wh) {
                    return (wh) iInterfaceQueryLocalInterface;
                }
                return new uh(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
            default:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                if (iInterfaceQueryLocalInterface2 instanceof jq) {
                    return (jq) iInterfaceQueryLocalInterface2;
                }
                return new jq(iBinder, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
        }
    }

    @Override // com.google.android.gms.internal.ads.zr1
    /* renamed from: a, reason: collision with other method in class */
    public /* synthetic */ void mo2a(Object obj) {
        ((xa0) obj).destroy();
    }

    @Override // com.google.android.gms.internal.ads.zr1
    public void j(Throwable th) {
    }
}
