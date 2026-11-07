package ld;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.NoSuchAlgorithmException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final Context f17009a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17010b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17011c;

    /* renamed from: d, reason: collision with root package name */
    public final String f17012d;

    /* renamed from: e, reason: collision with root package name */
    public final fe.b<ce.h> f17013e;

    public m(id.e eVar) {
        eVar.a();
        Context context = eVar.f14480a;
        eVar.a();
        id.l lVar = eVar.f14482c;
        fe.b<ce.h> bVar = ((i) ((kd.d) eVar.b(kd.d.class))).f16989b;
        com.google.android.gms.common.internal.p.f(context);
        com.google.android.gms.common.internal.p.f(lVar);
        com.google.android.gms.common.internal.p.f(bVar);
        this.f17009a = context;
        this.f17010b = lVar.f14492a;
        this.f17011c = lVar.f14493b;
        String str = lVar.f14498g;
        this.f17012d = str;
        if (str == null) {
            throw new IllegalArgumentException("FirebaseOptions#getProjectId cannot be null.");
        }
        this.f17013e = bVar;
    }

    public final String a() throws NoSuchAlgorithmException {
        Context context = this.f17009a;
        try {
            byte[] bArrA = wa.a.a(context, context.getPackageName());
            if (bArrA != null) {
                return wa.c.a(bArrA);
            }
            Log.e("ld.m", "Could not get fingerprint hash for package: " + context.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("ld.m", "No such package: " + context.getPackageName(), e10);
            return null;
        }
    }

    public final String b(URL url, byte[] bArr, n nVar, boolean z10) throws JSONException, id.j, IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        boolean z11 = true;
        try {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            ce.h hVar = this.f17013e.get();
            String str = null;
            if (hVar != null) {
                try {
                    str = (String) Tasks.await(hVar.a());
                } catch (Exception unused) {
                    Log.w("ld.m", "Unable to get heartbeats!");
                }
            }
            if (str != null) {
                httpURLConnection.setRequestProperty("X-Firebase-Client", str);
            }
            httpURLConnection.setRequestProperty("X-Android-Package", this.f17009a.getPackageName());
            httpURLConnection.setRequestProperty("X-Android-Cert", a());
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream(), bArr.length);
            try {
                bufferedOutputStream.write(bArr, 0, bArr.length);
                bufferedOutputStream.close();
                int responseCode = httpURLConnection.getResponseCode();
                InputStream inputStream = responseCode >= 200 && responseCode < 300 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
                StringBuilder sb = new StringBuilder();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        sb.append(line);
                    } finally {
                    }
                }
                bufferedReader.close();
                String string = sb.toString();
                if (responseCode < 200 || responseCode >= 300) {
                    z11 = false;
                }
                if (z11) {
                    if (z10) {
                        nVar.f17014a = 0L;
                        nVar.f17015b = -1L;
                    }
                    httpURLConnection.disconnect();
                    return string;
                }
                nVar.f17014a++;
                if (responseCode == 400 || responseCode == 404) {
                    nVar.f17015b = System.currentTimeMillis() + 86400000;
                } else {
                    nVar.f17015b = Math.min((long) (Math.pow(2.0d, nVar.f17014a * ((Math.random() * 0.5d) + 1.0d)) * 1000.0d), 14400000L) + System.currentTimeMillis();
                }
                JSONObject jSONObject = new JSONObject(new JSONObject(string).optString("error"));
                throw new id.j("Error returned from API. code: " + jSONObject.optInt("code") + " body: " + jSONObject.optString("message"));
            } finally {
            }
        } catch (Throwable th2) {
            httpURLConnection.disconnect();
            throw th2;
        }
    }
}
