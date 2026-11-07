package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzl;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class cy0 implements td1 {
    public final Context s;

    /* renamed from: t, reason: collision with root package name */
    public final String f3699t;

    public cy0(Context context, String str) {
        this.s = context;
        this.f3699t = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x0224, code lost:
    
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Received error HTTP response code: " + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x024b, code lost:
    
        throw new com.google.android.gms.internal.ads.gw0(1, "Received error HTTP response code: " + r0);
     */
    @Override // com.google.android.gms.internal.ads.td1
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final by0 zza(ay0 ay0Var) {
        by0 by0Var;
        InputStreamReader inputStreamReader;
        InputStreamReader inputStreamReader2;
        cy0 cy0Var = this;
        String str = ay0Var.f2869a;
        int i6 = ay0Var.f2870b;
        HashMap map = ay0Var.f2871c;
        byte[] bArr = ay0Var.f2872d;
        String str2 = ay0Var.f2873e;
        long jB = zzv.zzC().b();
        try {
            by0 by0Var2 = new by0();
            zzo.zzi("SDK version: " + cy0Var.f3699t);
            zzo.zze("AdRequestServiceImpl: Sending request: " + str);
            URL url = new URL(str);
            HashMap map2 = new HashMap();
            int i7 = 0;
            int i8 = 0;
            while (true) {
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                int i9 = i7;
                try {
                    try {
                        zzs zzsVarZzq = zzv.zzq();
                        by0 by0Var3 = by0Var2;
                        try {
                            Context context = cy0Var.s;
                            String str3 = cy0Var.f3699t;
                            by0Var = by0Var3;
                            HashMap map3 = map;
                            try {
                                zzsVarZzq.zzf(context, str3, false, httpURLConnection, false, i6);
                                for (Map.Entry entry : map3.entrySet()) {
                                    httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                                }
                                if (!TextUtils.isEmpty(str2)) {
                                    httpURLConnection.setRequestProperty("Content-Type", str2);
                                }
                                BufferedOutputStream bufferedOutputStream = null;
                                zzl zzlVar = new zzl(null);
                                try {
                                    zzlVar.zzc(httpURLConnection, bArr);
                                } catch (Throwable th) {
                                    zzo.zzh("Network request logging failed.", th);
                                    zzv.zzp().g("HttpRequestFunction.logAdRequest", th);
                                }
                                int length = bArr.length;
                                int i10 = 1;
                                if (length > 0) {
                                    httpURLConnection.setDoOutput(true);
                                    httpURLConnection.setFixedLengthStreamingMode(length);
                                    try {
                                        BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection.getOutputStream());
                                        try {
                                            bufferedOutputStream2.write(bArr);
                                            i3.f.a(bufferedOutputStream2);
                                        } catch (Throwable th2) {
                                            th = th2;
                                            bufferedOutputStream = bufferedOutputStream2;
                                            i3.f.a(bufferedOutputStream);
                                            throw th;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                }
                                int responseCode = httpURLConnection.getResponseCode();
                                for (Map.Entry<String, List<String>> entry2 : httpURLConnection.getHeaderFields().entrySet()) {
                                    String key = entry2.getKey();
                                    List<String> value = entry2.getValue();
                                    if (map2.containsKey(key)) {
                                        ((List) map2.get(key)).addAll(value);
                                    } else {
                                        map2.put(key, new ArrayList(value));
                                        i10 = i10;
                                    }
                                }
                                int i11 = i10;
                                zzlVar.zze(httpURLConnection, responseCode);
                                by0Var.f3324a = responseCode;
                                by0Var.f3325b = map2;
                                by0Var.f3326c = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                                if (responseCode >= 200 && responseCode < 300) {
                                    try {
                                        inputStreamReader2 = new InputStreamReader(httpURLConnection.getInputStream());
                                    } catch (Throwable th4) {
                                        th = th4;
                                        inputStreamReader = null;
                                    }
                                    try {
                                        zzv.zzq();
                                        StringBuilder sb = new StringBuilder(8192);
                                        char[] cArr = new char[2048];
                                        while (true) {
                                            int i12 = inputStreamReader2.read(cArr);
                                            if (i12 == -1) {
                                                break;
                                            }
                                            sb.append(cArr, i9, i12);
                                        }
                                        String string = sb.toString();
                                        i3.f.a(inputStreamReader2);
                                        zzlVar.zzg(string);
                                        by0Var.f3326c = string;
                                        if (TextUtils.isEmpty(string)) {
                                            if (!((Boolean) zzbe.zzc().a(zn.f11494v5)).booleanValue()) {
                                                throw new gw0(3);
                                            }
                                        }
                                        by0Var.f3327d = zzv.zzC().b() - jB;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        inputStreamReader = inputStreamReader2;
                                        i3.f.a(inputStreamReader);
                                        throw th;
                                    }
                                } else {
                                    if (responseCode < 300 || responseCode >= 400) {
                                        break;
                                    }
                                    String headerField = httpURLConnection.getHeaderField("Location");
                                    if (TextUtils.isEmpty(headerField)) {
                                        zzo.zzj("No location header to follow redirect.");
                                        throw new gw0(1, "No location header to follow redirect");
                                    }
                                    if (((Boolean) zzbe.zzc().a(zn.H7)).booleanValue()) {
                                        try {
                                            url = new URI(headerField).toURL();
                                        } catch (URISyntaxException e6) {
                                            throw new gw0(e6.getMessage(), e6);
                                        }
                                    } else {
                                        url = new URL(headerField);
                                    }
                                    int i13 = i8 + 1;
                                    if (i13 > ((Integer) zzbe.zzc().a(zn.f11363b5)).intValue()) {
                                        zzo.zzj("Too many redirects.");
                                        throw new gw0(i11, "Too many redirects");
                                    }
                                    httpURLConnection.disconnect();
                                    by0Var2 = by0Var;
                                    i8 = i13;
                                    i7 = i9;
                                    map = map3;
                                    cy0Var = this;
                                }
                            } catch (gw0 e7) {
                                e = e7;
                                if (!((Boolean) zzbe.zzc().a(zn.h8)).booleanValue()) {
                                    throw e;
                                }
                                by0Var.f3327d = zzv.zzC().b() - jB;
                                httpURLConnection.disconnect();
                                return by0Var;
                            }
                        } catch (gw0 e8) {
                            e = e8;
                            by0Var = by0Var3;
                        }
                    } finally {
                        httpURLConnection.disconnect();
                    }
                } catch (gw0 e9) {
                    e = e9;
                    by0Var = by0Var2;
                }
            }
        } catch (IOException e10) {
            String strConcat = "Error while connecting to ad server: ".concat(String.valueOf(e10.getMessage()));
            zzo.zzj(strConcat);
            throw new gw0(strConcat, e10);
        }
    }
}
