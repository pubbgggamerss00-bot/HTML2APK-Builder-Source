package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzbs;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class vb1 {

    /* renamed from: a, reason: collision with root package name */
    public final List f9773a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9774b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9775c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9776d;

    /* renamed from: e, reason: collision with root package name */
    public final String f9777e;

    /* renamed from: f, reason: collision with root package name */
    public final int f9778f;

    /* renamed from: g, reason: collision with root package name */
    public final long f9779g;
    public final boolean h;

    /* renamed from: i, reason: collision with root package name */
    public final String f9780i;

    /* renamed from: j, reason: collision with root package name */
    public final dt1 f9781j;

    /* renamed from: k, reason: collision with root package name */
    public final Bundle f9782k;

    /* renamed from: l, reason: collision with root package name */
    public final String f9783l;

    /* renamed from: m, reason: collision with root package name */
    public final String f9784m;

    /* renamed from: n, reason: collision with root package name */
    public final String f9785n;

    /* renamed from: o, reason: collision with root package name */
    public final JSONObject f9786o;

    /* renamed from: p, reason: collision with root package name */
    public final JSONObject f9787p;

    /* renamed from: q, reason: collision with root package name */
    public final String f9788q;

    /* renamed from: r, reason: collision with root package name */
    public final int f9789r;
    public final long s;

    /* renamed from: t, reason: collision with root package name */
    public final long f9790t;

    /* JADX WARN: Removed duplicated region for block: B:51:0x0118  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public vb1(JsonReader jsonReader) throws IOException {
        String str;
        List listZzd = Collections.EMPTY_LIST;
        Bundle bundle = new Bundle();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jsonReader.beginObject();
        String str2 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        int iNextInt = 0;
        String strNextString = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        String strNextString2 = strNextString;
        String strNextString3 = strNextString2;
        String strNextString4 = strNextString3;
        String strNextString5 = strNextString4;
        String strNextString6 = strNextString5;
        String strNextString7 = strNextString6;
        boolean zNextBoolean = false;
        dt1 dt1Var = null;
        long j6 = -1;
        long j7 = -1;
        long jNextLong = 0;
        int iNextInt2 = -1;
        int iMax = 1;
        int iNextInt3 = 0;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (Objects.equals(strNextName, "nofill_urls")) {
                listZzd = zzbs.zzd(jsonReader);
            } else if ("refresh_interval".equals(strNextName)) {
                iNextInt = jsonReader.nextInt();
            } else if (Objects.equals(strNextName, "refresh_load_delay_time_interval")) {
                iNextInt2 = jsonReader.nextInt();
            } else if ("gws_query_id".equals(strNextName)) {
                strNextString = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(strNextName)) {
                strNextString2 = jsonReader.nextString();
            } else if ("is_idless".equals(strNextName)) {
                zNextBoolean = jsonReader.nextBoolean();
            } else if ("response_code".equals(strNextName)) {
                iNextInt3 = jsonReader.nextInt();
            } else if ("latency".equals(strNextName)) {
                jNextLong = jsonReader.nextLong();
            } else {
                str = str2;
                if (((Boolean) zzbe.zzc().a(zn.g8)).booleanValue() && "public_error".equals(strNextName) && jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                    dt1 dt1Var2 = new dt1();
                    jsonReader.beginObject();
                    String strNextString8 = str;
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        int iHashCode = strNextName2.hashCode();
                        long j8 = j6;
                        if (iHashCode != -1724546052) {
                            if (iHashCode == 3059181 && strNextName2.equals("code")) {
                                jsonReader.nextInt();
                            } else {
                                jsonReader.skipValue();
                            }
                        } else if (strNextName2.equals("description")) {
                            strNextString8 = jsonReader.nextString();
                        }
                        j6 = j8;
                    }
                    jsonReader.endObject();
                    dt1Var2.f4025t = strNextString8;
                    dt1Var = dt1Var2;
                } else {
                    long j9 = j6;
                    if ("bidding_data".equals(strNextName)) {
                        strNextString3 = jsonReader.nextString();
                    } else {
                        if (((Boolean) zzbe.zzc().a(zn.ma)).booleanValue() && Objects.equals(strNextName, "topics_should_record_observation")) {
                            jsonReader.nextBoolean();
                        } else if ("adapter_response_replacement_key".equals(strNextName)) {
                            strNextString7 = jsonReader.nextString();
                        } else if ("response_info_extras".equals(strNextName)) {
                            if (((Boolean) zzbe.zzc().a(zn.E6)).booleanValue()) {
                                try {
                                    try {
                                        Bundle bundleZza = zzbs.zza(zzbs.zzi(jsonReader));
                                        if (bundleZza != null) {
                                            bundle = bundleZza;
                                        }
                                    } catch (IOException | JSONException unused) {
                                    }
                                } catch (IllegalStateException unused2) {
                                    jsonReader.skipValue();
                                }
                            } else {
                                jsonReader.skipValue();
                            }
                        } else if ("adRequestPostBody".equals(strNextName)) {
                            if (((Boolean) zzbe.zzc().a(zn.g9)).booleanValue()) {
                                strNextString5 = jsonReader.nextString();
                            } else {
                                jsonReader.skipValue();
                            }
                        } else if ("adRequestUrl".equals(strNextName)) {
                            if (((Boolean) zzbe.zzc().a(zn.g9)).booleanValue()) {
                                strNextString4 = jsonReader.nextString();
                            } else {
                                jsonReader.skipValue();
                            }
                        } else {
                            nn nnVar = zn.h9;
                            if (((Boolean) zzbe.zzc().a(nnVar)).booleanValue() && Objects.equals(strNextName, "adResponseBody")) {
                                strNextString6 = jsonReader.nextString();
                            } else if (((Boolean) zzbe.zzc().a(nnVar)).booleanValue() && Objects.equals(strNextName, "adResponseHeaders")) {
                                jSONObject = zzbs.zzi(jsonReader);
                            } else if (Objects.equals(strNextName, "max_parallel_renderers")) {
                                iMax = Math.max(1, jsonReader.nextInt());
                            } else {
                                if (((Boolean) zzbe.zzc().a(zn.o9)).booleanValue() && Objects.equals(strNextName, "inspector_ad_transaction_extras")) {
                                    jSONObject2 = zzbs.zzi(jsonReader);
                                } else {
                                    if (((Boolean) zzbe.zzc().a(zn.f11431l2)).booleanValue() && Objects.equals(strNextName, "latency_extras")) {
                                        try {
                                            Bundle bundleZza2 = zzbs.zza(zzbs.zzi(jsonReader));
                                            if (bundleZza2 != null) {
                                                double d7 = bundleZza2.getDouble("start_time");
                                                long j10 = (d7 > 9.223372036854776E18d || d7 < -9.223372036854776E18d) ? -1L : (long) d7;
                                                try {
                                                    double d8 = bundleZza2.getDouble("end_time");
                                                    j6 = (d8 > 9.223372036854776E18d || d8 < -9.223372036854776E18d) ? -1L : (long) d8;
                                                    j7 = j10;
                                                } catch (IOException | JSONException unused3) {
                                                    j7 = j10;
                                                } catch (IllegalStateException unused4) {
                                                    j7 = j10;
                                                    jsonReader.skipValue();
                                                    j6 = j9;
                                                    str2 = str;
                                                }
                                            }
                                        } catch (IllegalStateException unused5) {
                                        }
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                            }
                        }
                    }
                    j6 = j9;
                }
                str2 = str;
            }
            str = str2;
            str2 = str;
        }
        long j11 = j6;
        jsonReader.endObject();
        this.f9773a = listZzd;
        this.f9775c = iNextInt;
        if (((Boolean) xp.f10656c.c()).booleanValue()) {
            this.f9776d = -1;
        } else {
            ep epVar = hp.f5450a;
            if (((Long) epVar.c()).longValue() > -1) {
                this.f9776d = ((Long) epVar.c()).intValue();
            } else {
                this.f9776d = iNextInt2;
            }
        }
        this.f9774b = strNextString;
        this.f9777e = strNextString2;
        this.f9778f = iNextInt3;
        this.f9779g = jNextLong;
        this.f9781j = dt1Var;
        this.h = zNextBoolean;
        this.f9780i = strNextString3;
        this.f9782k = bundle;
        this.f9783l = strNextString4;
        this.f9784m = strNextString5;
        this.f9785n = strNextString6;
        this.f9786o = jSONObject;
        this.f9787p = jSONObject2;
        this.f9788q = strNextString7;
        ep epVar2 = vp.f9905a;
        this.f9789r = ((Long) epVar2.c()).longValue() > 0 ? ((Long) epVar2.c()).intValue() : iMax;
        this.s = j7;
        this.f9790t = j11;
    }
}
