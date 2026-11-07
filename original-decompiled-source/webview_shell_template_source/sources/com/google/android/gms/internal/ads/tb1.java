package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzu;
import com.google.android.gms.ads.internal.util.client.zzv;
import com.google.android.gms.ads.internal.util.client.zzw;
import com.google.android.gms.ads.internal.util.zzbs;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class tb1 {
    public final p50 A;
    public final String B;
    public final JSONObject C;
    public final JSONObject D;
    public final String E;
    public final String F;
    public final String G;
    public final String H;
    public final String I;
    public final boolean J;
    public final boolean K;
    public final boolean L;
    public final boolean M;
    public final boolean N;
    public final boolean O;
    public final boolean P;
    public final int Q;
    public final int R;
    public final boolean S;
    public final boolean T;
    public final String U;
    public final l2 V;
    public final boolean W;
    public final boolean X;
    public final int Y;
    public final String Z;

    /* renamed from: a, reason: collision with root package name */
    public final List f9171a;

    /* renamed from: a0, reason: collision with root package name */
    public final int f9172a0;

    /* renamed from: b, reason: collision with root package name */
    public final int f9173b;

    /* renamed from: b0, reason: collision with root package name */
    public final String f9174b0;

    /* renamed from: c, reason: collision with root package name */
    public final List f9175c;

    /* renamed from: c0, reason: collision with root package name */
    public final boolean f9176c0;

    /* renamed from: d, reason: collision with root package name */
    public final List f9177d;

    /* renamed from: d0, reason: collision with root package name */
    public final y10 f9178d0;

    /* renamed from: e, reason: collision with root package name */
    public final int f9179e;

    /* renamed from: e0, reason: collision with root package name */
    public final zzu f9180e0;

    /* renamed from: f, reason: collision with root package name */
    public final List f9181f;

    /* renamed from: f0, reason: collision with root package name */
    public final String f9182f0;

    /* renamed from: g, reason: collision with root package name */
    public final List f9183g;

    /* renamed from: g0, reason: collision with root package name */
    public final boolean f9184g0;
    public final List h;

    /* renamed from: h0, reason: collision with root package name */
    public final JSONObject f9185h0;

    /* renamed from: i, reason: collision with root package name */
    public final List f9186i;

    /* renamed from: i0, reason: collision with root package name */
    public final boolean f9187i0;

    /* renamed from: j, reason: collision with root package name */
    public final String f9188j;

    /* renamed from: j0, reason: collision with root package name */
    public final JSONObject f9189j0;

    /* renamed from: k, reason: collision with root package name */
    public final String f9190k;

    /* renamed from: k0, reason: collision with root package name */
    public final boolean f9191k0;

    /* renamed from: l, reason: collision with root package name */
    public final l40 f9192l;

    /* renamed from: l0, reason: collision with root package name */
    public final String f9193l0;

    /* renamed from: m, reason: collision with root package name */
    public final List f9194m;

    /* renamed from: m0, reason: collision with root package name */
    public final boolean f9195m0;

    /* renamed from: n, reason: collision with root package name */
    public final List f9196n;

    /* renamed from: n0, reason: collision with root package name */
    public final String f9197n0;

    /* renamed from: o, reason: collision with root package name */
    public final List f9198o;

    /* renamed from: o0, reason: collision with root package name */
    public final String f9199o0;

    /* renamed from: p, reason: collision with root package name */
    public final List f9200p;
    public final String p0;

    /* renamed from: q, reason: collision with root package name */
    public final int f9201q;

    /* renamed from: q0, reason: collision with root package name */
    public final boolean f9202q0;

    /* renamed from: r, reason: collision with root package name */
    public final List f9203r;

    /* renamed from: r0, reason: collision with root package name */
    public final boolean f9204r0;
    public final xb1 s;

    /* renamed from: s0, reason: collision with root package name */
    public final int f9205s0;

    /* renamed from: t, reason: collision with root package name */
    public final List f9206t;

    /* renamed from: t0, reason: collision with root package name */
    public final String f9207t0;

    /* renamed from: u, reason: collision with root package name */
    public final List f9208u;

    /* renamed from: u0, reason: collision with root package name */
    public final List f9209u0;

    /* renamed from: v, reason: collision with root package name */
    public final JSONObject f9210v;

    /* renamed from: v0, reason: collision with root package name */
    public final boolean f9211v0;

    /* renamed from: w, reason: collision with root package name */
    public final String f9212w;

    /* renamed from: w0, reason: collision with root package name */
    public final Map f9213w0;

    /* renamed from: x, reason: collision with root package name */
    public final String f9214x;

    /* renamed from: x0, reason: collision with root package name */
    public final zzv f9215x0;

    /* renamed from: y, reason: collision with root package name */
    public final String f9216y;

    /* renamed from: y0, reason: collision with root package name */
    public final zzw f9217y0;

    /* renamed from: z, reason: collision with root package name */
    public final String f9218z;

    /* JADX WARN: Removed duplicated region for block: B:301:0x078f A[PHI: r81 r82 r83
      0x078f: PHI (r81v46 java.util.List) = 
      (r81v4 java.util.List)
      (r81v5 java.util.List)
      (r81v6 java.util.List)
      (r81v7 java.util.List)
      (r81v8 java.util.List)
      (r81v9 java.util.List)
      (r81v10 java.util.List)
      (r81v47 java.util.List)
     binds: [B:299:0x0787, B:296:0x0770, B:293:0x0759, B:287:0x0724, B:284:0x070e, B:281:0x06f8, B:275:0x06c5, B:12:0x00e1] A[DONT_GENERATE, DONT_INLINE]
      0x078f: PHI (r82v13 java.lang.String) = 
      (r82v2 java.lang.String)
      (r82v3 java.lang.String)
      (r82v4 java.lang.String)
      (r82v5 java.lang.String)
      (r82v6 java.lang.String)
      (r82v7 java.lang.String)
      (r82v8 java.lang.String)
      (r82v14 java.lang.String)
     binds: [B:299:0x0787, B:296:0x0770, B:293:0x0759, B:287:0x0724, B:284:0x070e, B:281:0x06f8, B:275:0x06c5, B:12:0x00e1] A[DONT_GENERATE, DONT_INLINE]
      0x078f: PHI (r83v13 java.util.List) = 
      (r83v2 java.util.List)
      (r83v3 java.util.List)
      (r83v4 java.util.List)
      (r83v5 java.util.List)
      (r83v6 java.util.List)
      (r83v7 java.util.List)
      (r83v8 java.util.List)
      (r83v14 java.util.List)
     binds: [B:299:0x0787, B:296:0x0770, B:293:0x0759, B:287:0x0724, B:284:0x070e, B:281:0x06f8, B:275:0x06c5, B:12:0x00e1] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public tb1(JsonReader jsonReader) throws IOException {
        List list;
        List list2;
        String str;
        int i6;
        List listZzd = Collections.EMPTY_LIST;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = new JSONObject();
        zn1 zn1Var = bo1.f3236t;
        cp1 cp1Var = cp1.f3636w;
        HashMap map = new HashMap();
        jsonReader.beginObject();
        String str2 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        List listA = listZzd;
        List listZzd2 = listA;
        List listZzd3 = listZzd2;
        List listZzd4 = listZzd3;
        List listA2 = listZzd4;
        JSONObject jSONObjectZzi = jSONObject;
        JSONObject jSONObjectZzi2 = jSONObject2;
        JSONObject jSONObjectZzi3 = jSONObject3;
        JSONObject jSONObjectZzi4 = jSONObject4;
        JSONObject jSONObjectZzi5 = jSONObject5;
        JSONObject jSONObjectZzi6 = jSONObject6;
        List listZzd5 = cp1Var;
        Map mapZze = map;
        String strNextString = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        String strNextString2 = strNextString;
        String strNextString3 = strNextString2;
        String strNextString4 = strNextString3;
        String strNextString5 = strNextString4;
        String string = strNextString5;
        String strNextString6 = string;
        String strNextString7 = strNextString6;
        String strNextString8 = strNextString7;
        String strNextString9 = strNextString8;
        String strNextString10 = strNextString9;
        String strNextString11 = strNextString10;
        String strNextString12 = strNextString11;
        String strNextString13 = strNextString12;
        String strNextString14 = strNextString13;
        String strNextString15 = strNextString14;
        String strNextString16 = strNextString15;
        String strNextString17 = strNextString16;
        String strNextString18 = strNextString17;
        String strNextString19 = strNextString18;
        int i7 = 0;
        int i8 = 0;
        l40 l40VarL = null;
        int iNextInt = 0;
        xb1 xb1Var = null;
        p50 p50Var = null;
        boolean zNextBoolean = false;
        boolean zNextBoolean2 = false;
        boolean zNextBoolean3 = false;
        boolean zNextBoolean4 = false;
        boolean zNextBoolean5 = false;
        boolean zNextBoolean6 = false;
        boolean zNextBoolean7 = false;
        int i9 = -1;
        int iNextInt2 = 0;
        boolean zNextBoolean8 = false;
        boolean zNextBoolean9 = false;
        boolean zNextBoolean10 = false;
        int iNextInt3 = 0;
        int iNextInt4 = -1;
        boolean zNextBoolean11 = false;
        y10 y10Var = null;
        zzu zzuVarZza = null;
        boolean zNextBoolean12 = false;
        boolean zNextBoolean13 = false;
        boolean zNextBoolean14 = false;
        String strNextString20 = null;
        boolean zNextBoolean15 = false;
        boolean zNextBoolean16 = false;
        boolean zNextBoolean17 = false;
        boolean zNextBoolean18 = false;
        int iNextInt5 = 0;
        boolean zNextBoolean19 = false;
        zzv zzvVarZza = null;
        zzw zzwVarZzd = null;
        List listZzd6 = listA2;
        List listZzd7 = listZzd6;
        List listZzd8 = listZzd7;
        List listZzd9 = listZzd8;
        List listZzd10 = listZzd9;
        List listZzd11 = listZzd10;
        List listZzd12 = listZzd11;
        List listZzd13 = listZzd12;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            String str3 = strNextName == null ? str2 : strNextName;
            switch (str3.hashCode()) {
                case -2138196627:
                    list = listA;
                    list2 = listZzd3;
                    String str4 = str3;
                    str = str2;
                    if (str4.equals("ad_source_instance_name")) {
                        strNextString14 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    listA = list;
                    str2 = str;
                    listZzd3 = list2;
                    break;
                case -1980587809:
                    list = listA;
                    list2 = listZzd3;
                    String str5 = str3;
                    str = str2;
                    if (str5.equals("debug_signals")) {
                        jSONObjectZzi2 = zzbs.zzi(jsonReader);
                    }
                    listA = list;
                    str2 = str;
                    listZzd3 = list2;
                    break;
                case -1965512151:
                    list = listA;
                    list2 = listZzd3;
                    String str6 = str3;
                    str = str2;
                    if (str6.equals("omid_settings")) {
                        jSONObjectZzi4 = zzbs.zzi(jsonReader);
                    }
                    listA = list;
                    str2 = str;
                    listZzd3 = list2;
                    break;
                case -1964744830:
                    list = listA;
                    list2 = listZzd3;
                    String str7 = str3;
                    str = str2;
                    if (str7.equals("offline_ad_config")) {
                        nn nnVar = zn.w8;
                        nnVar.getClass();
                        if (((Boolean) zzbe.zzc().a(nnVar)).booleanValue()) {
                            zzwVarZzd = zzw.zzd(zzbs.zzi(jsonReader));
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    listA = list;
                    str2 = str;
                    listZzd3 = list2;
                    break;
                case -1871425831:
                    list = listA;
                    list2 = listZzd3;
                    String str8 = str3;
                    str = str2;
                    if (str8.equals("recursive_server_response_data")) {
                        strNextString17 = jsonReader.nextString();
                    }
                    listA = list;
                    str2 = str;
                    listZzd3 = list2;
                    break;
                case -1843156475:
                    list = listA;
                    list2 = listZzd3;
                    String str9 = str3;
                    str = str2;
                    if (str9.equals("is_consent")) {
                        zNextBoolean18 = jsonReader.nextBoolean();
                    }
                    listA = list;
                    str2 = str;
                    listZzd3 = list2;
                    break;
                case -1828733410:
                    list = listA;
                    list2 = listZzd3;
                    String str10 = str3;
                    str = str2;
                    if (str10.equals("network_ping_config")) {
                        nn nnVar2 = zn.u8;
                        nnVar2.getClass();
                        if (((Boolean) zzbe.zzc().a(nnVar2)).booleanValue()) {
                            zzvVarZza = zzv.zza(zzbs.zzi(jsonReader));
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    listA = list;
                    str2 = str;
                    listZzd3 = list2;
                    break;
                case -1812055556:
                    list = listA;
                    if (str3.equals("play_prewarm_options")) {
                        JSONObject jSONObjectZzi7 = zzbs.zzi(jsonReader);
                        str = str2;
                        list2 = listZzd3;
                        y10Var = new y10(jSONObjectZzi7.optBoolean("enable_prewarming", false), jSONObjectZzi7.optBoolean("skip_offline_notification_flow", false), jSONObjectZzi7.optString("prefetch_url", str2));
                        listA = list;
                        str2 = str;
                        listZzd3 = list2;
                        break;
                    }
                    str = str2;
                    list2 = listZzd3;
                    jsonReader.skipValue();
                    listA = list;
                    str2 = str;
                    listZzd3 = list2;
                case -1785028569:
                    list = listA;
                    if (!str3.equals("parallel_key")) {
                        str = str2;
                        list2 = listZzd3;
                        jsonReader.skipValue();
                        listA = list;
                        str2 = str;
                        listZzd3 = list2;
                        break;
                    } else {
                        strNextString19 = jsonReader.nextString();
                        listA = list;
                        break;
                    }
                case -1776946669:
                    list = listA;
                    if (!str3.equals("ad_source_name")) {
                        str = str2;
                        list2 = listZzd3;
                        jsonReader.skipValue();
                        listA = list;
                        str2 = str;
                        listZzd3 = list2;
                        break;
                    } else {
                        strNextString12 = jsonReader.nextString();
                        listA = list;
                        break;
                    }
                case -1662989631:
                    list = listA;
                    if (!str3.equals("is_interscroller")) {
                        str = str2;
                        list2 = listZzd3;
                        jsonReader.skipValue();
                        listA = list;
                        str2 = str;
                        listZzd3 = list2;
                        break;
                    } else {
                        zNextBoolean12 = jsonReader.nextBoolean();
                        listA = list;
                        break;
                    }
                case -1620470467:
                    list = listA;
                    if (!str3.equals("backend_query_id")) {
                        str = str2;
                        list2 = listZzd3;
                        jsonReader.skipValue();
                        listA = list;
                        str2 = str;
                        listZzd3 = list2;
                        break;
                    } else {
                        strNextString9 = jsonReader.nextString();
                        listA = list;
                        break;
                    }
                case -1550155393:
                    list = listA;
                    if (!str3.equals("nofill_urls")) {
                        str = str2;
                        list2 = listZzd3;
                        jsonReader.skipValue();
                        listA = list;
                        str2 = str;
                        listZzd3 = list2;
                        break;
                    } else {
                        listZzd13 = zzbs.zzd(jsonReader);
                        listA = list;
                        break;
                    }
                case -1440104884:
                    list = listA;
                    if (!str3.equals("is_custom_close_blocked")) {
                        str = str2;
                        list2 = listZzd3;
                        jsonReader.skipValue();
                        listA = list;
                        str2 = str;
                        listZzd3 = list2;
                        break;
                    } else {
                        zNextBoolean6 = jsonReader.nextBoolean();
                        listA = list;
                        break;
                    }
                case -1439500848:
                    list = listA;
                    if (!str3.equals("orientation")) {
                        str = str2;
                        list2 = listZzd3;
                        jsonReader.skipValue();
                        listA = list;
                        str2 = str;
                        listZzd3 = list2;
                        break;
                    } else {
                        String strNextString21 = jsonReader.nextString();
                        i9 = "landscape".equalsIgnoreCase(strNextString21) ? 6 : "portrait".equalsIgnoreCase(strNextString21) ? 7 : -1;
                        listA = list;
                        break;
                    }
                case -1428969291:
                    list = listA;
                    if (!str3.equals("enable_omid")) {
                        str = str2;
                        list2 = listZzd3;
                        jsonReader.skipValue();
                        listA = list;
                        str2 = str;
                        listZzd3 = list2;
                        break;
                    } else {
                        zNextBoolean8 = jsonReader.nextBoolean();
                        listA = list;
                        break;
                    }
                case -1406227629:
                    list = listA;
                    if (!str3.equals("buffer_click_url_as_ready_to_ping")) {
                        str = str2;
                        list2 = listZzd3;
                        jsonReader.skipValue();
                        listA = list;
                        str2 = str;
                        listZzd3 = list2;
                        break;
                    } else {
                        zNextBoolean16 = jsonReader.nextBoolean();
                        listA = list;
                        break;
                    }
                case -1403779768:
                    list = listA;
                    if (!str3.equals("showable_impression_type")) {
                        str = str2;
                        list2 = listZzd3;
                        jsonReader.skipValue();
                        listA = list;
                        str2 = str;
                        listZzd3 = list2;
                        break;
                    } else {
                        iNextInt3 = jsonReader.nextInt();
                        listA = list;
                        break;
                    }
                case -1375413093:
                    list = listA;
                    if (!str3.equals("ad_cover")) {
                        str = str2;
                        list2 = listZzd3;
                        jsonReader.skipValue();
                        listA = list;
                        str2 = str;
                        listZzd3 = list2;
                        break;
                    } else {
                        jSONObjectZzi5 = zzbs.zzi(jsonReader);
                        listA = list;
                        break;
                    }
                case -1360811658:
                    list = listA;
                    if (!str3.equals("ad_sizes")) {
                        str = str2;
                        list2 = listZzd3;
                        jsonReader.skipValue();
                        listA = list;
                        str2 = str;
                        listZzd3 = list2;
                        break;
                    } else {
                        listA2 = ub1.a(jsonReader);
                        listA = list;
                        break;
                    }
                case -1306015996:
                    list = listA;
                    if (!str3.equals("adapters")) {
                        str = str2;
                        list2 = listZzd3;
                        jsonReader.skipValue();
                        listA = list;
                        str2 = str;
                        listZzd3 = list2;
                        break;
                    } else {
                        listZzd4 = zzbs.zzd(jsonReader);
                        listA = list;
                        break;
                    }
                case -1303332046:
                    list = listA;
                    if (!str3.equals("test_mode_enabled")) {
                        str = str2;
                        list2 = listZzd3;
                        jsonReader.skipValue();
                        listA = list;
                        str2 = str;
                        listZzd3 = list2;
                        break;
                    } else {
                        zNextBoolean5 = jsonReader.nextBoolean();
                        listA = list;
                        break;
                    }
                case -1289032093:
                    list = listA;
                    if (!str3.equals("extras")) {
                        str = str2;
                        list2 = listZzd3;
                        jsonReader.skipValue();
                        listA = list;
                        str2 = str;
                        listZzd3 = list2;
                        break;
                    } else {
                        jSONObjectZzi3 = zzbs.zzi(jsonReader);
                        listA = list;
                        break;
                    }
                case -1240082064:
                    list = listA;
                    if (!str3.equals("ad_event_value")) {
                        str = str2;
                        list2 = listZzd3;
                        jsonReader.skipValue();
                        listA = list;
                        str2 = str;
                        listZzd3 = list2;
                        break;
                    } else {
                        zzuVarZza = zzu.zza(zzbs.zzi(jsonReader));
                        listA = list;
                        break;
                    }
                case -1234181075:
                    list = listA;
                    if (!str3.equals("allow_pub_rendered_attribution")) {
                        str = str2;
                        list2 = listZzd3;
                        jsonReader.skipValue();
                        listA = list;
                        str2 = str;
                        listZzd3 = list2;
                        break;
                    } else {
                        zNextBoolean = jsonReader.nextBoolean();
                        listA = list;
                        break;
                    }
                case -1168140544:
                    list = listA;
                    if (!str3.equals("presentation_error_urls")) {
                        str = str2;
                        list2 = listZzd3;
                        jsonReader.skipValue();
                        listA = list;
                        str2 = str;
                        listZzd3 = list2;
                        break;
                    } else {
                        listZzd2 = zzbs.zzd(jsonReader);
                        listA = list;
                        break;
                    }
                case -1152230954:
                    list = listA;
                    if (!str3.equals("ad_type")) {
                        str = str2;
                        list2 = listZzd3;
                        jsonReader.skipValue();
                        listA = list;
                        str2 = str;
                        listZzd3 = list2;
                        break;
                    } else {
                        String strNextString22 = jsonReader.nextString();
                        if ("banner".equals(strNextString22)) {
                            i7 = 1;
                        } else {
                            if ("interstitial".equals(strNextString22)) {
                                i6 = 2;
                            } else if ("native_express".equals(strNextString22)) {
                                i7 = 3;
                            } else if ("native".equals(strNextString22)) {
                                i6 = 4;
                            } else if ("rewarded".equals(strNextString22)) {
                                i6 = 5;
                            } else {
                                i7 = "app_open_ad".equals(strNextString22) ? 6 : "rewarded_interstitial".equals(strNextString22) ? 7 : 0;
                            }
                            i7 = i6;
                        }
                        listA = list;
                        break;
                    }
                case -1146534047:
                    list = listA;
                    if (!str3.equals("is_scroll_aware")) {
                        str = str2;
                        list2 = listZzd3;
                        jsonReader.skipValue();
                        listA = list;
                        str2 = str;
                        listZzd3 = list2;
                        break;
                    } else {
                        zNextBoolean10 = jsonReader.nextBoolean();
                        listA = list;
                        break;
                    }
                case -1115838944:
                    list = listA;
                    if (!str3.equals("fill_urls")) {
                        str = str2;
                        list2 = listZzd3;
                        jsonReader.skipValue();
                        listA = list;
                        str2 = str;
                        listZzd3 = list2;
                        break;
                    } else {
                        listZzd12 = zzbs.zzd(jsonReader);
                        listA = list;
                        break;
                    }
                case -1081936678:
                    list = listA;
                    if (!str3.equals("allocation_id")) {
                        str = str2;
                        list2 = listZzd3;
                        jsonReader.skipValue();
                        listA = list;
                        str2 = str;
                        listZzd3 = list2;
                        break;
                    } else {
                        strNextString3 = jsonReader.nextString();
                        listA = list;
                        break;
                    }
                case -1078050970:
                    list = listA;
                    if (!str3.equals("video_complete_urls")) {
                        str = str2;
                        list2 = listZzd3;
                        jsonReader.skipValue();
                        listA = list;
                        str2 = str;
                        listZzd3 = list2;
                        break;
                    } else {
                        listZzd11 = zzbs.zzd(jsonReader);
                        listA = list;
                        break;
                    }
                case -1051269058:
                    list = listA;
                    if (!str3.equals("active_view")) {
                        str = str2;
                        list2 = listZzd3;
                        jsonReader.skipValue();
                        listA = list;
                        str2 = str;
                        listZzd3 = list2;
                        break;
                    } else {
                        string = zzbs.zzi(jsonReader).toString();
                        listA = list;
                        break;
                    }
                case -982608540:
                    list = listA;
                    if (!str3.equals("valid_from_timestamp")) {
                        str = str2;
                        list2 = listZzd3;
                        jsonReader.skipValue();
                        listA = list;
                        str2 = str;
                        listZzd3 = list2;
                        break;
                    } else {
                        strNextString2 = jsonReader.nextString();
                        listA = list;
                        break;
                    }
                case -972056451:
                    list = listA;
                    if (!str3.equals("ad_source_instance_id")) {
                        str = str2;
                        list2 = listZzd3;
                        jsonReader.skipValue();
                        listA = list;
                        str2 = str;
                        listZzd3 = list2;
                        break;
                    } else {
                        strNextString15 = jsonReader.nextString();
                        listA = list;
                        break;
                    }
                case -776859333:
                    list = listA;
                    if (!str3.equals("click_urls")) {
                        str = str2;
                        list2 = listZzd3;
                        jsonReader.skipValue();
                        listA = list;
                        str2 = str;
                        listZzd3 = list2;
                        break;
                    } else {
                        listZzd6 = zzbs.zzd(jsonReader);
                        listA = list;
                        break;
                    }
                case -570101180:
                    list = listA;
                    if (!str3.equals("late_load_urls")) {
                        str = str2;
                        list2 = listZzd3;
                        jsonReader.skipValue();
                        listA = list;
                        str2 = str;
                        listZzd3 = list2;
                        break;
                    } else {
                        listZzd5 = zzbs.zzd(jsonReader);
                        listA = list;
                        break;
                    }
                case -544216775:
                    if (!str3.equals("safe_browsing")) {
                        list = listA;
                        str = str2;
                        list2 = listZzd3;
                        jsonReader.skipValue();
                        listA = list;
                        str2 = str;
                        listZzd3 = list2;
                        break;
                    } else {
                        JSONObject jSONObjectZzi8 = zzbs.zzi(jsonReader);
                        listA = listA;
                        p50Var = new p50(jSONObjectZzi8.optString("click_string", str2), jSONObjectZzi8.optString("report_url", str2), jSONObjectZzi8.optBoolean("rendered_ad_enabled", false), jSONObjectZzi8.optBoolean("non_malicious_reporting_enabled", false), zzbs.zzc(jSONObjectZzi8.optJSONArray("allowed_headers"), null), jSONObjectZzi8.optBoolean("protection_enabled", false), jSONObjectZzi8.optBoolean("malicious_reporting_enabled", false), zzbs.zzc(jSONObjectZzi8.optJSONArray("webview_permissions"), null));
                        break;
                    }
                case -437057161:
                    if (!str3.equals("imp_urls")) {
                        str = str2;
                        list = listA;
                        list2 = listZzd3;
                        jsonReader.skipValue();
                        listA = list;
                        str2 = str;
                        listZzd3 = list2;
                        break;
                    } else {
                        listZzd7 = zzbs.zzd(jsonReader);
                        break;
                    }
                case -404433734:
                    if (!str3.equals("rtb_native_required_assets")) {
                        str = str2;
                        list = listA;
                        list2 = listZzd3;
                        jsonReader.skipValue();
                        listA = list;
                        str2 = str;
                        listZzd3 = list2;
                        break;
                    } else {
                        jSONObjectZzi6 = zzbs.zzi(jsonReader);
                        break;
                    }
                case -404326515:
                    if (!str3.equals("render_timeout_ms")) {
                        str = str2;
                        list = listA;
                        list2 = listZzd3;
                        jsonReader.skipValue();
                        listA = list;
                        str2 = str;
                        listZzd3 = list2;
                        break;
                    } else {
                        iNextInt2 = jsonReader.nextInt();
                        break;
                    }
                case -397704715:
                    if (!str3.equals("ad_close_time_ms")) {
                        str = str2;
                        list = listA;
                        list2 = listZzd3;
                        jsonReader.skipValue();
                        listA = list;
                        str2 = str;
                        listZzd3 = list2;
                        break;
                    } else {
                        iNextInt4 = jsonReader.nextInt();
                        break;
                    }
                case -388807511:
                    if (!str3.equals("content_url")) {
                        str = str2;
                        list = listA;
                        list2 = listZzd3;
                        jsonReader.skipValue();
                        listA = list;
                        str2 = str;
                        listZzd3 = list2;
                        break;
                    } else {
                        strNextString20 = jsonReader.nextString();
                        break;
                    }
                case -369773488:
                    if (str3.equals("is_close_button_enabled")) {
                        jsonReader.nextBoolean();
                        str = str2;
                        list = listA;
                        list2 = listZzd3;
                        listA = list;
                        str2 = str;
                        listZzd3 = list2;
                        break;
                    }
                    str = str2;
                    list = listA;
                    list2 = listZzd3;
                    jsonReader.skipValue();
                    listA = list;
                    str2 = str;
                    listZzd3 = list2;
                case -213449460:
                    if (!str3.equals("force_disable_hardware_acceleration")) {
                        str = str2;
                        list = listA;
                        list2 = listZzd3;
                        jsonReader.skipValue();
                        listA = list;
                        str2 = str;
                        listZzd3 = list2;
                        break;
                    } else {
                        zNextBoolean15 = jsonReader.nextBoolean();
                        break;
                    }
                case -213424028:
                    if (!str3.equals("watermark")) {
                        str = str2;
                        list = listA;
                        list2 = listZzd3;
                        jsonReader.skipValue();
                        listA = list;
                        str2 = str;
                        listZzd3 = list2;
                        break;
                    } else {
                        strNextString8 = jsonReader.nextString();
                        break;
                    }
                case -180214626:
                    if (!str3.equals("native_required_asset_viewability")) {
                        str = str2;
                        list = listA;
                        list2 = listZzd3;
                        jsonReader.skipValue();
                        listA = list;
                        str2 = str;
                        listZzd3 = list2;
                        break;
                    } else {
                        zNextBoolean14 = jsonReader.nextBoolean();
                        break;
                    }
                case -154616268:
                    if (!str3.equals("is_offline_ad")) {
                        str = str2;
                        list = listA;
                        list2 = listZzd3;
                        jsonReader.skipValue();
                        listA = list;
                        str2 = str;
                        listZzd3 = list2;
                        break;
                    } else {
                        zNextBoolean13 = jsonReader.nextBoolean();
                        break;
                    }
                case -29338502:
                    if (!str3.equals("allow_custom_click_gesture")) {
                        str = str2;
                        list = listA;
                        list2 = listZzd3;
                        jsonReader.skipValue();
                        listA = list;
                        str2 = str;
                        listZzd3 = list2;
                        break;
                    } else {
                        zNextBoolean3 = jsonReader.nextBoolean();
                        break;
                    }
                case 3107:
                    if (!str3.equals("ad")) {
                        str = str2;
                        list = listA;
                        list2 = listZzd3;
                        jsonReader.skipValue();
                        listA = list;
                        str2 = str;
                        listZzd3 = list2;
                        break;
                    } else {
                        xb1Var = new xb1(jsonReader);
                        break;
                    }
                case 3355:
                    if (!str3.equals("id")) {
                        str = str2;
                        list = listA;
                        list2 = listZzd3;
                        jsonReader.skipValue();
                        listA = list;
                        str2 = str;
                        listZzd3 = list2;
                        break;
                    } else {
                        strNextString4 = jsonReader.nextString();
                        break;
                    }
                case 3076010:
                    if (!str3.equals("data")) {
                        str = str2;
                        list = listA;
                        list2 = listZzd3;
                        jsonReader.skipValue();
                        listA = list;
                        str2 = str;
                        listZzd3 = list2;
                        break;
                    } else {
                        jSONObjectZzi = zzbs.zzi(jsonReader);
                        break;
                    }
                case 37109963:
                    if (!str3.equals("request_id")) {
                        str = str2;
                        list = listA;
                        list2 = listZzd3;
                        jsonReader.skipValue();
                        listA = list;
                        str2 = str;
                        listZzd3 = list2;
                        break;
                    } else {
                        strNextString16 = jsonReader.nextString();
                        break;
                    }
                case 63195984:
                    if (!str3.equals("render_test_label")) {
                        str = str2;
                        list = listA;
                        list2 = listZzd3;
                        jsonReader.skipValue();
                        listA = list;
                        str2 = str;
                        listZzd3 = list2;
                        break;
                    } else {
                        zNextBoolean4 = jsonReader.nextBoolean();
                        break;
                    }
                case 107433883:
                    if (!str3.equals("qdata")) {
                        str = str2;
                        list = listA;
                        list2 = listZzd3;
                        jsonReader.skipValue();
                        listA = list;
                        str2 = str;
                        listZzd3 = list2;
                        break;
                    } else {
                        strNextString5 = jsonReader.nextString();
                        break;
                    }
                case 230323073:
                    if (!str3.equals("ad_load_urls")) {
                        str = str2;
                        list = listA;
                        list2 = listZzd3;
                        jsonReader.skipValue();
                        listA = list;
                        str2 = str;
                        listZzd3 = list2;
                        break;
                    } else {
                        listZzd8 = zzbs.zzd(jsonReader);
                        break;
                    }
                case 418392395:
                    if (!str3.equals("is_closable_area_disabled")) {
                        str = str2;
                        list = listA;
                        list2 = listZzd3;
                        jsonReader.skipValue();
                        listA = list;
                        str2 = str;
                        listZzd3 = list2;
                        break;
                    } else {
                        zNextBoolean7 = jsonReader.nextBoolean();
                        break;
                    }
                case 542250332:
                    if (!str3.equals("consent_form_action_identifier")) {
                        str = str2;
                        list = listA;
                        list2 = listZzd3;
                        jsonReader.skipValue();
                        listA = list;
                        str2 = str;
                        listZzd3 = list2;
                        break;
                    } else {
                        iNextInt5 = jsonReader.nextInt();
                        break;
                    }
                case 549176928:
                    if (!str3.equals("presentation_error_timeout_ms")) {
                        str = str2;
                        list = listA;
                        list2 = listZzd3;
                        jsonReader.skipValue();
                        listA = list;
                        str2 = str;
                        listZzd3 = list2;
                        break;
                    } else {
                        iNextInt = jsonReader.nextInt();
                        break;
                    }
                case 597473788:
                    if (!str3.equals("debug_dialog_string")) {
                        str = str2;
                        list = listA;
                        list2 = listZzd3;
                        jsonReader.skipValue();
                        listA = list;
                        str2 = str;
                        listZzd3 = list2;
                        break;
                    } else {
                        strNextString6 = jsonReader.nextString();
                        break;
                    }
                case 754887508:
                    if (!str3.equals("container_sizes")) {
                        str = str2;
                        list = listA;
                        list2 = listZzd3;
                        jsonReader.skipValue();
                        listA = list;
                        str2 = str;
                        listZzd3 = list2;
                        break;
                    } else {
                        listA = ub1.a(jsonReader);
                        break;
                    }
                case 791122864:
                    if (!str3.equals("impression_type")) {
                        str = str2;
                        list = listA;
                        list2 = listZzd3;
                        jsonReader.skipValue();
                        listA = list;
                        str2 = str;
                        listZzd3 = list2;
                        break;
                    } else {
                        int iNextInt6 = jsonReader.nextInt();
                        if (iNextInt6 != 0 && iNextInt6 != 1 && iNextInt6 != 3) {
                            i8 = 0;
                            break;
                        } else {
                            i8 = iNextInt6;
                            break;
                        }
                    }
                    break;
                case 805095541:
                    if (str3.equals("analytics_event_name_to_parameters_map")) {
                        nn nnVar3 = zn.f11435m0;
                        nnVar3.getClass();
                        if (!((Boolean) zzbe.zzc().a(nnVar3)).booleanValue()) {
                            jsonReader.skipValue();
                            str = str2;
                            list = listA;
                            list2 = listZzd3;
                            listA = list;
                            str2 = str;
                            listZzd3 = list2;
                            break;
                        } else {
                            mapZze = zzbs.zze(jsonReader);
                            break;
                        }
                    } else {
                        str = str2;
                        list = listA;
                        list2 = listZzd3;
                        jsonReader.skipValue();
                        listA = list;
                        str2 = str;
                        listZzd3 = list2;
                    }
                case 1010584092:
                    if (!str3.equals("transaction_id")) {
                        str = str2;
                        list = listA;
                        list2 = listZzd3;
                        jsonReader.skipValue();
                        listA = list;
                        str2 = str;
                        listZzd3 = list2;
                        break;
                    } else {
                        strNextString = jsonReader.nextString();
                        break;
                    }
                case 1100650276:
                    if (!str3.equals("rewards")) {
                        str = str2;
                        list = listA;
                        list2 = listZzd3;
                        jsonReader.skipValue();
                        listA = list;
                        str2 = str;
                        listZzd3 = list2;
                        break;
                    } else {
                        l40VarL = l40.l(zzbs.zzf(jsonReader));
                        break;
                    }
                case 1141602460:
                    if (!str3.equals("adapter_response_info_key")) {
                        str = str2;
                        list = listA;
                        list2 = listZzd3;
                        jsonReader.skipValue();
                        listA = list;
                        str2 = str;
                        listZzd3 = list2;
                        break;
                    } else {
                        strNextString18 = jsonReader.nextString();
                        break;
                    }
                case 1186014765:
                    if (str3.equals("cache_hit_urls")) {
                        zzbs.zzd(jsonReader);
                        str = str2;
                        list = listA;
                        list2 = listZzd3;
                        listA = list;
                        str2 = str;
                        listZzd3 = list2;
                        break;
                    }
                    str = str2;
                    list = listA;
                    list2 = listZzd3;
                    jsonReader.skipValue();
                    listA = list;
                    str2 = str;
                    listZzd3 = list2;
                case 1321720943:
                    if (!str3.equals("allow_pub_owned_ad_view")) {
                        str = str2;
                        list = listA;
                        list2 = listZzd3;
                        jsonReader.skipValue();
                        listA = list;
                        str2 = str;
                        listZzd3 = list2;
                        break;
                    } else {
                        zNextBoolean2 = jsonReader.nextBoolean();
                        break;
                    }
                case 1422388341:
                    if (!str3.equals("is_collapsible")) {
                        str = str2;
                        list = listA;
                        list2 = listZzd3;
                        jsonReader.skipValue();
                        listA = list;
                        str2 = str;
                        listZzd3 = list2;
                        break;
                    } else {
                        zNextBoolean17 = jsonReader.nextBoolean();
                        break;
                    }
                case 1437255331:
                    if (!str3.equals("ad_source_id")) {
                        str = str2;
                        list = listA;
                        list2 = listZzd3;
                        jsonReader.skipValue();
                        listA = list;
                        str2 = str;
                        listZzd3 = list2;
                        break;
                    } else {
                        strNextString13 = jsonReader.nextString();
                        break;
                    }
                case 1637553475:
                    if (!str3.equals("bid_response")) {
                        str = str2;
                        list = listA;
                        list2 = listZzd3;
                        jsonReader.skipValue();
                        listA = list;
                        str2 = str;
                        listZzd3 = list2;
                        break;
                    } else {
                        strNextString7 = jsonReader.nextString();
                        break;
                    }
                case 1638957285:
                    if (!str3.equals("video_start_urls")) {
                        str = str2;
                        list = listA;
                        list2 = listZzd3;
                        jsonReader.skipValue();
                        listA = list;
                        str2 = str;
                        listZzd3 = list2;
                        break;
                    } else {
                        listZzd9 = zzbs.zzd(jsonReader);
                        break;
                    }
                case 1686319423:
                    if (!str3.equals("ad_network_class_name")) {
                        str = str2;
                        list = listA;
                        list2 = listZzd3;
                        jsonReader.skipValue();
                        listA = list;
                        str2 = str;
                        listZzd3 = list2;
                        break;
                    } else {
                        strNextString11 = jsonReader.nextString();
                        break;
                    }
                case 1688341040:
                    if (!str3.equals("video_reward_urls")) {
                        str = str2;
                        list = listA;
                        list2 = listZzd3;
                        jsonReader.skipValue();
                        listA = list;
                        str2 = str;
                        listZzd3 = list2;
                        break;
                    } else {
                        listZzd10 = zzbs.zzd(jsonReader);
                        break;
                    }
                case 1799285870:
                    if (!str3.equals("use_third_party_container_height")) {
                        str = str2;
                        list = listA;
                        list2 = listZzd3;
                        jsonReader.skipValue();
                        listA = list;
                        str2 = str;
                        listZzd3 = list2;
                        break;
                    } else {
                        zNextBoolean11 = jsonReader.nextBoolean();
                        break;
                    }
                case 1839650832:
                    if (!str3.equals("renderers")) {
                        str = str2;
                        list = listA;
                        list2 = listZzd3;
                        jsonReader.skipValue();
                        listA = list;
                        str2 = str;
                        listZzd3 = list2;
                        break;
                    } else {
                        listZzd = zzbs.zzd(jsonReader);
                        break;
                    }
                case 1875425491:
                    if (!str3.equals("is_analytics_logging_enabled")) {
                        str = str2;
                        list = listA;
                        list2 = listZzd3;
                        jsonReader.skipValue();
                        listA = list;
                        str2 = str;
                        listZzd3 = list2;
                        break;
                    } else {
                        zNextBoolean9 = jsonReader.nextBoolean();
                        break;
                    }
                case 2068142375:
                    if (!str3.equals("rule_line_external_id")) {
                        str = str2;
                        list = listA;
                        list2 = listZzd3;
                        jsonReader.skipValue();
                        listA = list;
                        str2 = str;
                        listZzd3 = list2;
                        break;
                    } else {
                        strNextString10 = jsonReader.nextString();
                        break;
                    }
                case 2072888499:
                    if (!str3.equals("manual_tracking_urls")) {
                        str = str2;
                        list = listA;
                        list2 = listZzd3;
                        jsonReader.skipValue();
                        listA = list;
                        str2 = str;
                        listZzd3 = list2;
                        break;
                    } else {
                        listZzd3 = zzbs.zzd(jsonReader);
                        break;
                    }
                case 2075506442:
                    if (!str3.equals("render_serially")) {
                        str = str2;
                        list = listA;
                        list2 = listZzd3;
                        jsonReader.skipValue();
                        listA = list;
                        str2 = str;
                        listZzd3 = list2;
                        break;
                    } else {
                        zNextBoolean19 = jsonReader.nextBoolean();
                        break;
                    }
                default:
                    str = str2;
                    list = listA;
                    list2 = listZzd3;
                    jsonReader.skipValue();
                    listA = list;
                    str2 = str;
                    listZzd3 = list2;
                    break;
            }
        }
        jsonReader.endObject();
        this.f9171a = listZzd;
        this.f9173b = i7;
        this.f9175c = listZzd6;
        this.f9177d = listZzd7;
        this.f9181f = listZzd8;
        this.f9179e = i8;
        this.f9183g = listZzd9;
        this.h = listZzd10;
        this.f9186i = listZzd11;
        this.f9188j = strNextString;
        this.f9190k = strNextString2;
        this.f9192l = l40VarL;
        this.f9194m = listZzd12;
        this.f9196n = listZzd13;
        this.f9198o = listZzd2;
        this.f9200p = listZzd3;
        this.f9201q = iNextInt;
        this.f9203r = listA;
        this.s = xb1Var;
        this.f9206t = listZzd4;
        this.f9208u = listA2;
        this.f9212w = strNextString3;
        this.f9210v = jSONObjectZzi;
        this.f9214x = strNextString4;
        this.f9216y = strNextString5;
        this.f9218z = string;
        this.A = p50Var;
        this.B = strNextString6;
        this.C = jSONObjectZzi2;
        this.D = jSONObjectZzi3;
        this.J = zNextBoolean;
        this.K = zNextBoolean2;
        this.L = zNextBoolean3;
        this.M = zNextBoolean4;
        this.N = zNextBoolean5;
        this.O = zNextBoolean6;
        this.P = zNextBoolean7;
        this.Q = i9;
        this.R = iNextInt2;
        this.T = zNextBoolean8;
        this.U = strNextString7;
        this.V = new l2(12, jSONObjectZzi4);
        this.W = zNextBoolean9;
        this.X = zNextBoolean10;
        this.Y = iNextInt3;
        this.Z = strNextString8;
        this.f9172a0 = iNextInt4;
        this.f9174b0 = strNextString9;
        this.f9176c0 = zNextBoolean11;
        this.f9178d0 = y10Var;
        this.f9180e0 = zzuVarZza;
        this.f9182f0 = strNextString10;
        this.f9184g0 = zNextBoolean12;
        this.f9185h0 = jSONObjectZzi5;
        this.E = strNextString11;
        this.F = strNextString12;
        this.G = strNextString13;
        this.H = strNextString14;
        this.I = strNextString15;
        this.f9187i0 = zNextBoolean13;
        this.f9189j0 = jSONObjectZzi6;
        this.f9191k0 = zNextBoolean14;
        this.f9193l0 = strNextString20;
        this.f9195m0 = zNextBoolean15;
        this.S = zNextBoolean16;
        this.f9197n0 = strNextString16;
        this.f9199o0 = strNextString17;
        this.p0 = strNextString18;
        this.f9202q0 = zNextBoolean17;
        this.f9204r0 = zNextBoolean18;
        this.f9205s0 = iNextInt5;
        this.f9209u0 = listZzd5;
        this.f9207t0 = strNextString19;
        this.f9211v0 = zNextBoolean19;
        this.f9213w0 = mapZze;
        this.f9215x0 = zzvVarZza;
        this.f9217y0 = zzwVarZzd;
    }

    public static String a(int i6) {
        switch (i6) {
            case 1:
                return "BANNER";
            case 2:
                return "INTERSTITIAL";
            case 3:
                return "NATIVE_EXPRESS";
            case 4:
                return "NATIVE";
            case 5:
                return "REWARDED";
            case 6:
                return "APP_OPEN_AD";
            case 7:
                return "REWARDED_INTERSTITIAL";
            default:
                return "UNKNOWN";
        }
    }

    public final boolean b() {
        return this.f9187i0 || this.f9217y0 != null;
    }
}
