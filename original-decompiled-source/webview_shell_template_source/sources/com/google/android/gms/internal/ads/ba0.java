package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ba0 extends wj1 implements f22 {

    /* renamed from: t, reason: collision with root package name */
    public static final Pattern f3003t = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: u, reason: collision with root package name */
    public static final AtomicReference f3004u = new AtomicReference();

    /* renamed from: e, reason: collision with root package name */
    public final aa0 f3005e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3006f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3007g;
    public final String h;

    /* renamed from: i, reason: collision with root package name */
    public final ro0 f3008i;

    /* renamed from: j, reason: collision with root package name */
    public HttpURLConnection f3009j;

    /* renamed from: k, reason: collision with root package name */
    public InputStream f3010k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3011l;

    /* renamed from: m, reason: collision with root package name */
    public int f3012m;

    /* renamed from: n, reason: collision with root package name */
    public long f3013n;

    /* renamed from: o, reason: collision with root package name */
    public long f3014o;

    /* renamed from: p, reason: collision with root package name */
    public long f3015p;

    /* renamed from: q, reason: collision with root package name */
    public long f3016q;

    /* renamed from: r, reason: collision with root package name */
    public int f3017r;
    public final HashSet s;

    public ba0(String str, ja0 ja0Var, int i6, int i7, int i8) {
        super(true);
        this.f3005e = new aa0(this);
        this.s = new HashSet();
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.h = str;
        this.f3008i = new ro0(8);
        this.f3006f = i6;
        this.f3007g = i7;
        this.f3017r = i8;
        if (ja0Var != null) {
            d(ja0Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0243 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0213 A[Catch: IOException -> 0x0038, TryCatch #0 {IOException -> 0x0038, blocks: (B:3:0x000c, B:4:0x001d, B:6:0x0023, B:8:0x002d, B:12:0x003d, B:13:0x0055, B:15:0x005b, B:22:0x007f, B:24:0x0099, B:25:0x00ab, B:26:0x00b0, B:39:0x00e5, B:88:0x0208, B:90:0x0213, B:92:0x0224, B:95:0x022d, B:96:0x023c, B:98:0x0243, B:99:0x024a, B:100:0x024b, B:101:0x0261), top: B:104:0x000c }] */
    @Override // com.google.android.gms.internal.ads.lo1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long c(os1 os1Var) throws IOException, NumberFormatException {
        long j6;
        long j7;
        int responseCode;
        String headerField;
        int responseCode2;
        long jMax;
        String headerField2;
        long j8 = 0;
        this.f3016q = 0L;
        this.f3015p = 0L;
        try {
            Uri uri = os1Var.f7851a;
            long j9 = os1Var.f7853c;
            long j10 = os1Var.f7854d;
            URL url = new URL(uri.toString());
            int i6 = 0;
            while (true) {
                int i7 = i6 + 1;
                if (i6 > 20) {
                    throw new NoRouteToHostException("Too many redirects: " + i7);
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                if (httpURLConnection instanceof HttpsURLConnection) {
                    j6 = j8;
                    ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(this.f3005e);
                } else {
                    j6 = j8;
                }
                httpURLConnection.setConnectTimeout(this.f3006f);
                httpURLConnection.setReadTimeout(this.f3007g);
                for (Map.Entry entry : this.f3008i.d().entrySet()) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                if (j9 == j6) {
                    if (j10 != -1) {
                        j7 = j6;
                    }
                    httpURLConnection.setRequestProperty("User-Agent", this.h);
                    httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setDoOutput(false);
                    httpURLConnection.connect();
                    responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                        this.f3009j = httpURLConnection;
                        try {
                            responseCode2 = httpURLConnection.getResponseCode();
                            this.f3012m = responseCode2;
                            if (responseCode2 >= 200 || responseCode2 > 299) {
                                this.f3009j.getHeaderFields();
                                n();
                                int i8 = this.f3012m;
                                int i9 = j31.f5914a;
                                x02 x02Var = new x02(i8, null);
                                if (this.f3012m == 416) {
                                    throw x02Var;
                                }
                                x02Var.initCause(new dp1());
                                throw x02Var;
                            }
                            if (responseCode2 != 200 || j9 == j6) {
                                j9 = j6;
                            }
                            this.f3013n = j9;
                            if (j10 != -1) {
                                this.f3014o = j10;
                            } else {
                                HttpURLConnection httpURLConnection2 = this.f3009j;
                                String headerField3 = httpURLConnection2.getHeaderField("Content-Length");
                                if (TextUtils.isEmpty(headerField3)) {
                                    jMax = -1;
                                    headerField2 = httpURLConnection2.getHeaderField("Content-Range");
                                    if (!TextUtils.isEmpty(headerField2)) {
                                    }
                                    this.f3014o = jMax != -1 ? jMax - this.f3013n : -1L;
                                } else {
                                    try {
                                        jMax = Long.parseLong(headerField3);
                                    } catch (NumberFormatException unused) {
                                        zzo.zzg("Unexpected Content-Length [" + headerField3 + "]");
                                    }
                                    headerField2 = httpURLConnection2.getHeaderField("Content-Range");
                                    if (!TextUtils.isEmpty(headerField2)) {
                                        Matcher matcher = f3003t.matcher(headerField2);
                                        if (matcher.find()) {
                                            try {
                                                long j11 = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
                                                if (jMax < j6) {
                                                    jMax = j11;
                                                } else if (jMax != j11) {
                                                    zzo.zzj("Inconsistent headers [" + headerField3 + "] [" + headerField2 + "]");
                                                    jMax = Math.max(jMax, j11);
                                                }
                                            } catch (NumberFormatException unused2) {
                                                zzo.zzg("Unexpected Content-Range [" + headerField2 + "]");
                                            }
                                        }
                                    }
                                    this.f3014o = jMax != -1 ? jMax - this.f3013n : -1L;
                                }
                            }
                            try {
                                this.f3010k = this.f3009j.getInputStream();
                                this.f3011l = true;
                                m(os1Var);
                                return this.f3014o;
                            } catch (IOException e6) {
                                n();
                                throw new uz1(e6, 2000, 1);
                            }
                        } catch (IOException e7) {
                            n();
                            throw new uz1("Unable to connect to ".concat(String.valueOf(os1Var.f7851a.toString())), e7, 2000, 1);
                        }
                    }
                    headerField = httpURLConnection.getHeaderField("Location");
                    httpURLConnection.disconnect();
                    if (headerField != null) {
                        throw new ProtocolException("Null location redirect");
                    }
                    URL url2 = new URL(url, headerField);
                    String protocol = url2.getProtocol();
                    if (!"https".equals(protocol) && !"http".equals(protocol)) {
                        throw new ProtocolException("Unsupported protocol redirect: ".concat(String.valueOf(protocol)));
                    }
                    url = url2;
                    i6 = i7;
                    j8 = j6;
                } else {
                    j7 = j9;
                }
                String string = "bytes=" + j7 + "-";
                if (j10 != -1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(string);
                    sb.append((j7 + j10) - 1);
                    string = sb.toString();
                }
                httpURLConnection.setRequestProperty("Range", string);
                httpURLConnection.setRequestProperty("User-Agent", this.h);
                httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setDoOutput(false);
                httpURLConnection.connect();
                responseCode = httpURLConnection.getResponseCode();
                if (responseCode != 300) {
                    this.f3009j = httpURLConnection;
                    responseCode2 = httpURLConnection.getResponseCode();
                    this.f3012m = responseCode2;
                    if (responseCode2 >= 200) {
                    }
                    this.f3009j.getHeaderFields();
                    n();
                    int i82 = this.f3012m;
                    int i92 = j31.f5914a;
                    x02 x02Var2 = new x02(i82, null);
                    if (this.f3012m == 416) {
                    }
                }
                headerField = httpURLConnection.getHeaderField("Location");
                httpURLConnection.disconnect();
                if (headerField != null) {
                }
            }
        } catch (IOException e8) {
            throw new uz1("Unable to connect to ".concat(String.valueOf(os1Var.f7851a.toString())), e8, 2000, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0078 A[Catch: IOException -> 0x001b, TryCatch #0 {IOException -> 0x001b, blocks: (B:3:0x0002, B:24:0x0058, B:26:0x0060, B:29:0x006a, B:30:0x0070, B:32:0x0078, B:35:0x007f, B:36:0x0084, B:37:0x0085, B:6:0x000d, B:8:0x0016, B:11:0x001e, B:13:0x0026, B:16:0x003c, B:17:0x0046, B:18:0x004b, B:19:0x004c, B:20:0x0051, B:21:0x0052), top: B:41:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0085 A[Catch: IOException -> 0x001b, TRY_LEAVE, TryCatch #0 {IOException -> 0x001b, blocks: (B:3:0x0002, B:24:0x0058, B:26:0x0060, B:29:0x006a, B:30:0x0070, B:32:0x0078, B:35:0x007f, B:36:0x0084, B:37:0x0085, B:6:0x000d, B:8:0x0016, B:11:0x001e, B:13:0x0026, B:16:0x003c, B:17:0x0046, B:18:0x004b, B:19:0x004c, B:20:0x0051, B:21:0x0052), top: B:41:0x0002 }] */
    @Override // com.google.android.gms.internal.ads.gc2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int j(int i6, int i7, byte[] bArr) throws IOException {
        int i8;
        AtomicReference atomicReference = f3004u;
        try {
            if (this.f3015p != this.f3013n) {
                byte[] bArr2 = (byte[]) atomicReference.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (true) {
                    long j6 = this.f3015p;
                    long j7 = this.f3013n;
                    if (j6 == j7) {
                        atomicReference.set(bArr2);
                        break;
                    }
                    int i9 = this.f3010k.read(bArr2, 0, (int) Math.min(j7 - j6, bArr2.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (i9 == -1) {
                        throw new EOFException();
                    }
                    this.f3015p += i9;
                    a(i9);
                }
            }
            if (i7 == 0) {
                return 0;
            }
            long j8 = this.f3014o;
            if (j8 != -1) {
                long j9 = j8 - this.f3016q;
                if (j9 != 0) {
                    i7 = (int) Math.min(i7, j9);
                    i8 = this.f3010k.read(bArr, i6, i7);
                    if (i8 == -1) {
                        this.f3016q += i8;
                        a(i8);
                        return i8;
                    }
                    if (this.f3014o != -1) {
                        throw new EOFException();
                    }
                }
            } else {
                i8 = this.f3010k.read(bArr, i6, i7);
                if (i8 == -1) {
                }
            }
            return -1;
        } catch (IOException e6) {
            throw new uz1(e6, 2000, 2);
        }
    }

    public final void n() {
        HttpURLConnection httpURLConnection = this.f3009j;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e6) {
                zzo.zzh("Unexpected error while disconnecting", e6);
            }
            this.f3009j = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.lo1
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.f3009j;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.lo1
    public final void zzd() {
        HashSet hashSet = this.s;
        try {
            InputStream inputStream = this.f3010k;
            if (inputStream != null) {
                int i6 = j31.f5914a;
                try {
                    inputStream.close();
                } catch (IOException e6) {
                    throw new uz1(e6, 2000, 3);
                }
            }
        } finally {
            this.f3010k = null;
            n();
            if (this.f3011l) {
                this.f3011l = false;
                k();
            }
            hashSet.clear();
        }
    }

    @Override // com.google.android.gms.internal.ads.wj1, com.google.android.gms.internal.ads.lo1
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.f3009j;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }
}
