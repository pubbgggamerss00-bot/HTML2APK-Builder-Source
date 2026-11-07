package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzl;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class tj1 extends qj1 {
    public em1<Integer> s;

    /* renamed from: t, reason: collision with root package name */
    public eu1 f9311t;

    /* renamed from: u, reason: collision with root package name */
    public HttpURLConnection f9312u;

    public final HttpURLConnection a(eu1 eu1Var) throws IOException {
        this.s = new fo(21);
        this.f9311t = eu1Var;
        ((Integer) this.s.mo7zza()).getClass();
        eu1 eu1Var2 = this.f9311t;
        eu1Var2.getClass();
        Set set = u90.f9503x;
        zzv.zzx();
        int iIntValue = ((Integer) zzbe.zzc().a(zn.M)).intValue();
        URL url = new URL(eu1Var2.f4407t);
        int i6 = 0;
        while (true) {
            i6++;
            if (i6 > 20) {
                throw new IOException("Too many redirects (20)");
            }
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            uRLConnectionOpenConnection.setConnectTimeout(iIntValue);
            uRLConnectionOpenConnection.setReadTimeout(iIntValue);
            if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                throw new IOException("Invalid protocol.");
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            zzl zzlVar = new zzl(null);
            zzlVar.zzc(httpURLConnection, null);
            httpURLConnection.setInstanceFollowRedirects(false);
            int responseCode = httpURLConnection.getResponseCode();
            zzlVar.zze(httpURLConnection, responseCode);
            if (responseCode / 100 != 3) {
                this.f9312u = httpURLConnection;
                return httpURLConnection;
            }
            String headerField = httpURLConnection.getHeaderField("Location");
            if (headerField == null) {
                throw new IOException("Missing Location header in redirect");
            }
            URL url2 = new URL(url, headerField);
            String protocol = url2.getProtocol();
            if (protocol == null) {
                throw new IOException("Protocol is null");
            }
            if (!protocol.equals("http") && !protocol.equals("https")) {
                throw new IOException("Unsupported scheme: ".concat(protocol));
            }
            zzo.zze("Redirecting to ".concat(headerField));
            httpURLConnection.disconnect();
            url = url2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        HttpURLConnection httpURLConnection = this.f9312u;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }
}
