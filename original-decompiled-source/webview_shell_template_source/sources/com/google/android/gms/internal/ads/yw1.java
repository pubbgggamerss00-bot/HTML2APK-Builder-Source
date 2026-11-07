package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class yw1 extends wj1 implements f22 {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f11098e;

    /* renamed from: f, reason: collision with root package name */
    public final int f11099f;

    /* renamed from: g, reason: collision with root package name */
    public final int f11100g;
    public final String h;

    /* renamed from: i, reason: collision with root package name */
    public final ro0 f11101i;

    /* renamed from: j, reason: collision with root package name */
    public final ro0 f11102j;

    /* renamed from: k, reason: collision with root package name */
    public os1 f11103k;

    /* renamed from: l, reason: collision with root package name */
    public HttpURLConnection f11104l;

    /* renamed from: m, reason: collision with root package name */
    public InputStream f11105m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f11106n;

    /* renamed from: o, reason: collision with root package name */
    public int f11107o;

    /* renamed from: p, reason: collision with root package name */
    public long f11108p;

    /* renamed from: q, reason: collision with root package name */
    public long f11109q;

    public /* synthetic */ yw1(String str, int i6, int i7, boolean z6, ro0 ro0Var) {
        super(true);
        this.h = str;
        this.f11099f = i6;
        this.f11100g = i7;
        this.f11098e = z6;
        this.f11101i = ro0Var;
        this.f11102j = new ro0(8);
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0193 A[Catch: IOException -> 0x019e, TRY_LEAVE, TryCatch #7 {IOException -> 0x019e, blocks: (B:81:0x018b, B:83:0x0193), top: B:162:0x018b }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ab  */
    @Override // com.google.android.gms.internal.ads.lo1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long c(os1 os1Var) throws Throwable {
        long j6;
        long j7;
        yw1 yw1Var;
        HttpURLConnection httpURLConnectionN;
        boolean z6;
        long j8;
        long j9;
        Throwable th;
        long j10;
        yw1 yw1Var2 = this;
        yw1Var2.f11103k = os1Var;
        yw1Var2.f11109q = 0L;
        yw1Var2.f11108p = 0L;
        l(os1Var);
        int i6 = 1;
        try {
            Uri uri = os1Var.f7851a;
            long j11 = os1Var.f7853c;
            long j12 = os1Var.f7854d;
            URL url = new URL(uri.toString());
            long j13 = os1Var.f7853c;
            long j14 = os1Var.f7854d;
            boolean z7 = false;
            try {
                if (yw1Var2.f11098e) {
                    j6 = 0;
                    j7 = j12;
                    int i7 = 0;
                    while (true) {
                        int i8 = i7 + 1;
                        if (i7 > 20) {
                            throw new uz1(new NoRouteToHostException("Too many redirects: " + i8), 2001, 1);
                        }
                        yw1Var = this;
                        HttpURLConnection httpURLConnectionN2 = yw1Var.n(url, j13, j14, z7, false, os1Var.f7852b);
                        int responseCode = httpURLConnectionN2.getResponseCode();
                        String headerField = httpURLConnectionN2.getHeaderField("Location");
                        if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                            httpURLConnectionN = httpURLConnectionN2;
                            break;
                        }
                        httpURLConnectionN2.disconnect();
                        url = yw1Var.o(url, headerField);
                        i7 = i8;
                        z7 = false;
                        i6 = 1;
                    }
                } else {
                    j6 = 0;
                    j7 = j12;
                    httpURLConnectionN = yw1Var2.n(url, j13, j14, false, true, os1Var.f7852b);
                    yw1Var = this;
                }
                yw1Var.f11104l = httpURLConnectionN;
                yw1Var.f11107o = httpURLConnectionN.getResponseCode();
                httpURLConnectionN.getResponseMessage();
                int i9 = yw1Var.f11107o;
                long jMax = -1;
                if (i9 < 200 || i9 > 299) {
                    httpURLConnectionN.getHeaderFields();
                    if (yw1Var.f11107o == 416) {
                        String headerField2 = httpURLConnectionN.getHeaderField("Content-Range");
                        Pattern pattern = x22.f10337a;
                        if (TextUtils.isEmpty(headerField2)) {
                            z6 = true;
                            j8 = -1;
                            if (j11 == j8) {
                                yw1Var.f11106n = z6;
                                m(os1Var);
                                return j7 != -1 ? j7 : j6;
                            }
                        } else {
                            Matcher matcher = x22.f10338b.matcher(headerField2);
                            if (matcher.matches()) {
                                z6 = true;
                                String strGroup = matcher.group(1);
                                strGroup.getClass();
                                j8 = Long.parseLong(strGroup);
                            }
                            if (j11 == j8) {
                            }
                        }
                    }
                    InputStream errorStream = httpURLConnectionN.getErrorStream();
                    try {
                        if (errorStream != null) {
                            dq1.a(errorStream);
                        } else {
                            int i10 = j31.f5914a;
                        }
                    } catch (IOException unused) {
                        int i11 = j31.f5914a;
                    }
                    yw1Var.p();
                    throw new x02(yw1Var.f11107o, yw1Var.f11107o == 416 ? new dp1() : null);
                }
                httpURLConnectionN.getContentType();
                if (yw1Var.f11107o != 200 || j11 == j6) {
                    j11 = j6;
                }
                boolean zEqualsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnectionN.getHeaderField("Content-Encoding"));
                if (zEqualsIgnoreCase) {
                    j9 = j11;
                    yw1Var.f11108p = j7;
                } else if (j7 != -1) {
                    yw1Var.f11108p = j7;
                    j9 = j11;
                } else {
                    String headerField3 = httpURLConnectionN.getHeaderField("Content-Length");
                    String headerField4 = httpURLConnectionN.getHeaderField("Content-Range");
                    Pattern pattern2 = x22.f10337a;
                    if (TextUtils.isEmpty(headerField3)) {
                        th = null;
                    } else {
                        try {
                            j10 = -1;
                            jMax = Long.parseLong(headerField3);
                            th = null;
                        } catch (NumberFormatException unused2) {
                            th = null;
                            qs0.c("HttpUtil", "Unexpected Content-Length [" + headerField3 + "]");
                        }
                        if (TextUtils.isEmpty(headerField4)) {
                            Matcher matcher2 = x22.f10337a.matcher(headerField4);
                            if (matcher2.matches()) {
                                try {
                                    String strGroup2 = matcher2.group(2);
                                    try {
                                        if (strGroup2 == null) {
                                            throw th;
                                        }
                                        long j15 = Long.parseLong(strGroup2);
                                        String strGroup3 = matcher2.group(i6);
                                        if (strGroup3 == null) {
                                            throw th;
                                        }
                                        j9 = j11;
                                        long j16 = (j15 - Long.parseLong(strGroup3)) + 1;
                                        if (jMax < j6) {
                                            jMax = j16;
                                        } else if (jMax != j16) {
                                            qs0.f("HttpUtil", "Inconsistent headers [" + headerField3 + "] [" + headerField4 + "]");
                                            jMax = Math.max(jMax, j16);
                                        }
                                    } catch (NumberFormatException unused3) {
                                        qs0.c("HttpUtil", "Unexpected Content-Range [" + headerField4 + "]");
                                        yw1Var.f11108p = jMax == j10 ? jMax - j9 : j10;
                                        yw1Var.f11105m = httpURLConnectionN.getInputStream();
                                        if (zEqualsIgnoreCase) {
                                        }
                                        yw1Var.f11106n = true;
                                        m(os1Var);
                                        if (j9 != j6) {
                                        }
                                        return yw1Var.f11108p;
                                    }
                                } catch (NumberFormatException unused4) {
                                    j9 = j11;
                                }
                            } else {
                                j9 = j11;
                            }
                            yw1Var.f11108p = jMax == j10 ? jMax - j9 : j10;
                        }
                    }
                    j10 = -1;
                    if (TextUtils.isEmpty(headerField4)) {
                    }
                }
                try {
                    yw1Var.f11105m = httpURLConnectionN.getInputStream();
                    if (zEqualsIgnoreCase) {
                        yw1Var.f11105m = new GZIPInputStream(yw1Var.f11105m);
                    }
                    yw1Var.f11106n = true;
                    m(os1Var);
                    if (j9 != j6) {
                        try {
                            byte[] bArr = new byte[4096];
                            long j17 = j9;
                            while (j17 > j6) {
                                int iMin = (int) Math.min(j17, 4096L);
                                InputStream inputStream = yw1Var.f11105m;
                                int i12 = j31.f5914a;
                                int i13 = inputStream.read(bArr, 0, iMin);
                                if (Thread.currentThread().isInterrupted()) {
                                    throw new uz1(new InterruptedIOException(), 2000, 1);
                                }
                                if (i13 == -1) {
                                    throw new uz1();
                                }
                                j17 -= i13;
                                yw1Var.a(i13);
                            }
                        } catch (IOException e6) {
                            yw1Var.p();
                            if (e6 instanceof uz1) {
                                throw ((uz1) e6);
                            }
                            throw new uz1(e6, 2000, 1);
                        }
                    }
                    return yw1Var.f11108p;
                } catch (IOException e7) {
                    yw1Var.p();
                    throw new uz1(e7, 2000, 1);
                }
            } catch (IOException e8) {
                e = e8;
                yw1Var2 = this;
                yw1Var2.p();
                throw uz1.a(e, 1);
            }
        } catch (IOException e9) {
            e = e9;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002b A[Catch: IOException -> 0x001e, TRY_LEAVE, TryCatch #0 {IOException -> 0x001e, blocks: (B:5:0x0004, B:7:0x000d, B:10:0x0017, B:13:0x0020, B:16:0x002b), top: B:20:0x0004 }] */
    @Override // com.google.android.gms.internal.ads.gc2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int j(int i6, int i7, byte[] bArr) throws IOException {
        int i8;
        if (i7 == 0) {
            return 0;
        }
        try {
            long j6 = this.f11108p;
            if (j6 != -1) {
                long j7 = j6 - this.f11109q;
                if (j7 != 0) {
                    i7 = (int) Math.min(i7, j7);
                    InputStream inputStream = this.f11105m;
                    int i9 = j31.f5914a;
                    i8 = inputStream.read(bArr, i6, i7);
                    if (i8 != -1) {
                        this.f11109q += i8;
                        a(i8);
                        return i8;
                    }
                }
            } else {
                InputStream inputStream2 = this.f11105m;
                int i92 = j31.f5914a;
                i8 = inputStream2.read(bArr, i6, i7);
                if (i8 != -1) {
                }
            }
            return -1;
        } catch (IOException e6) {
            int i10 = j31.f5914a;
            throw uz1.a(e6, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final HttpURLConnection n(URL url, long j6, long j7, boolean z6, boolean z7, Map map) throws IOException {
        String string;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f11099f);
        httpURLConnection.setReadTimeout(this.f11100g);
        HashMap map2 = new HashMap();
        map2.putAll(this.f11101i.d());
        map2.putAll(this.f11102j.d());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        if (j6 != 0) {
            StringBuilder sb = new StringBuilder("bytes=");
            sb.append(j6);
            sb.append("-");
            if (j7 != -1) {
                sb.append((j6 + j7) - 1);
            }
            string = sb.toString();
        } else if (j7 == -1) {
            string = null;
        } else {
            j6 = 0;
            StringBuilder sb2 = new StringBuilder("bytes=");
            sb2.append(j6);
            sb2.append("-");
            if (j7 != -1) {
            }
            string = sb2.toString();
        }
        if (string != null) {
            httpURLConnection.setRequestProperty("Range", string);
        }
        String str = this.h;
        if (str != null) {
            httpURLConnection.setRequestProperty("User-Agent", str);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", true != z6 ? "identity" : "gzip");
        httpURLConnection.setInstanceFollowRedirects(z7);
        httpURLConnection.setDoOutput(false);
        int i6 = os1.f7850f;
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return httpURLConnection;
    }

    public final URL o(URL url, String str) throws uz1 {
        if (str == null) {
            throw new uz1("Null location redirect", 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new uz1("Unsupported protocol redirect: ".concat(String.valueOf(protocol)), 2001, 1);
            }
            if (this.f11098e || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new uz1("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", 2001, 1);
        } catch (MalformedURLException e6) {
            throw new uz1(e6, 2001, 1);
        }
    }

    public final void p() {
        HttpURLConnection httpURLConnection = this.f11104l;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e6) {
                qs0.d("DefaultHttpDataSource", "Unexpected error while disconnecting", e6);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.lo1
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.f11104l;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        os1 os1Var = this.f11103k;
        if (os1Var != null) {
            return os1Var.f7851a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.lo1
    public final void zzd() {
        try {
            InputStream inputStream = this.f11105m;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e6) {
                    int i6 = j31.f5914a;
                    throw new uz1(e6, 2000, 3);
                }
            }
        } finally {
            this.f11105m = null;
            p();
            if (this.f11106n) {
                this.f11106n = false;
                k();
            }
            this.f11104l = null;
            this.f11103k = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.wj1, com.google.android.gms.internal.ads.lo1
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.f11104l;
        return httpURLConnection == null ? ip1.f5823y : new zv1(httpURLConnection.getHeaderFields());
    }
}
