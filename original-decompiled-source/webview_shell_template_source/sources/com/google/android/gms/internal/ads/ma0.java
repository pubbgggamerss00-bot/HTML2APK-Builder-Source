package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ma0 extends wj1 implements f22 {

    /* renamed from: v, reason: collision with root package name */
    public static final Pattern f7016v = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: e, reason: collision with root package name */
    public final int f7017e;

    /* renamed from: f, reason: collision with root package name */
    public final int f7018f;

    /* renamed from: g, reason: collision with root package name */
    public final String f7019g;
    public final ro0 h;

    /* renamed from: i, reason: collision with root package name */
    public os1 f7020i;

    /* renamed from: j, reason: collision with root package name */
    public HttpURLConnection f7021j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayDeque f7022k;

    /* renamed from: l, reason: collision with root package name */
    public InputStream f7023l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f7024m;

    /* renamed from: n, reason: collision with root package name */
    public int f7025n;

    /* renamed from: o, reason: collision with root package name */
    public long f7026o;

    /* renamed from: p, reason: collision with root package name */
    public long f7027p;

    /* renamed from: q, reason: collision with root package name */
    public long f7028q;

    /* renamed from: r, reason: collision with root package name */
    public long f7029r;
    public long s;

    /* renamed from: t, reason: collision with root package name */
    public final long f7030t;

    /* renamed from: u, reason: collision with root package name */
    public final long f7031u;

    public ma0(String str, ja0 ja0Var, int i6, int i7, long j6, long j7) {
        super(true);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.f7019g = str;
        this.h = new ro0(8);
        this.f7017e = i6;
        this.f7018f = i7;
        this.f7022k = new ArrayDeque();
        this.f7030t = j6;
        this.f7031u = j7;
        if (ja0Var != null) {
            d(ja0Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.lo1
    public final long c(os1 os1Var) throws IOException, NumberFormatException {
        this.f7020i = os1Var;
        this.f7027p = 0L;
        long j6 = os1Var.f7853c;
        long j7 = os1Var.f7854d;
        long jMin = this.f7030t;
        if (j7 != -1) {
            jMin = Math.min(jMin, j7);
        }
        this.f7028q = j6;
        HttpURLConnection httpURLConnectionN = n(1, j6, (jMin + j6) - 1);
        this.f7021j = httpURLConnectionN;
        String headerField = httpURLConnectionN.getHeaderField("Content-Range");
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = f7016v.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long j8 = Long.parseLong(matcher.group(2));
                    long j9 = Long.parseLong(matcher.group(3));
                    if (j7 != -1) {
                        this.f7026o = j7;
                        this.f7029r = Math.max(j8, (this.f7028q + j7) - 1);
                    } else {
                        this.f7026o = j9 - this.f7028q;
                        this.f7029r = j9 - 1;
                    }
                    this.s = j8;
                    this.f7024m = true;
                    m(os1Var);
                    return this.f7026o;
                } catch (NumberFormatException unused) {
                    zzo.zzg("Unexpected Content-Range [" + headerField + "]");
                }
            }
        }
        throw new ka0("Invalid content range: ".concat(String.valueOf(headerField)), 2000, 1);
    }

    @Override // com.google.android.gms.internal.ads.gc2
    public final int j(int i6, int i7, byte[] bArr) throws IOException {
        if (i7 == 0) {
            return 0;
        }
        try {
            long j6 = this.f7026o;
            long j7 = this.f7027p;
            if (j6 - j7 == 0) {
                return -1;
            }
            long j8 = this.f7028q + j7;
            long j9 = i7;
            long j10 = j8 + j9 + this.f7031u;
            long j11 = this.s;
            long j12 = j11 + 1;
            if (j10 > j12) {
                long j13 = this.f7029r;
                if (j11 < j13) {
                    long jMin = Math.min(j13, Math.max(((this.f7030t + j12) - r4) - 1, (j12 + j9) - 1));
                    n(2, j12, jMin);
                    this.s = jMin;
                    j11 = jMin;
                }
            }
            int i8 = this.f7023l.read(bArr, i6, (int) Math.min(j9, ((j11 + 1) - this.f7028q) - this.f7027p));
            if (i8 == -1) {
                throw new EOFException();
            }
            this.f7027p += i8;
            a(i8);
            return i8;
        } catch (IOException e6) {
            throw new uz1(e6, 2000, 2);
        }
    }

    public final HttpURLConnection n(int i6, long j6, long j7) throws IOException {
        String string = this.f7020i.f7851a.toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(string).openConnection();
            httpURLConnection.setConnectTimeout(this.f7017e);
            httpURLConnection.setReadTimeout(this.f7018f);
            for (Map.Entry entry : this.h.d().entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnection.setRequestProperty("Range", "bytes=" + j6 + "-" + j7);
            httpURLConnection.setRequestProperty("User-Agent", this.f7019g);
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            this.f7022k.add(httpURLConnection);
            String string2 = this.f7020i.f7851a.toString();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                this.f7025n = responseCode;
                if (responseCode < 200 || responseCode > 299) {
                    httpURLConnection.getHeaderFields();
                    o();
                    throw new la0(androidx.camera.camera2.internal.compat.workaround.c.d(this.f7025n, "Response code: "), 2000, i6);
                }
                try {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    if (this.f7023l != null) {
                        inputStream = new SequenceInputStream(this.f7023l, inputStream);
                    }
                    this.f7023l = inputStream;
                    return httpURLConnection;
                } catch (IOException e6) {
                    o();
                    throw new uz1(e6, 2000, i6);
                }
            } catch (IOException e7) {
                o();
                throw new uz1("Unable to connect to ".concat(String.valueOf(string2)), e7, 2000, i6);
            }
        } catch (IOException e8) {
            throw new uz1("Unable to connect to ".concat(String.valueOf(string)), e8, 2000, i6);
        }
    }

    public final void o() {
        while (true) {
            ArrayDeque arrayDeque = this.f7022k;
            if (arrayDeque.isEmpty()) {
                this.f7021j = null;
                return;
            } else {
                try {
                    ((HttpURLConnection) arrayDeque.remove()).disconnect();
                } catch (Exception e6) {
                    zzo.zzh("Unexpected error while disconnecting", e6);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.lo1
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.f7021j;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.lo1
    public final void zzd() {
        try {
            InputStream inputStream = this.f7023l;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e6) {
                    throw new uz1(e6, 2000, 3);
                }
            }
        } finally {
            this.f7023l = null;
            o();
            if (this.f7024m) {
                this.f7024m = false;
                k();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.wj1, com.google.android.gms.internal.ads.lo1
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.f7021j;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }
}
