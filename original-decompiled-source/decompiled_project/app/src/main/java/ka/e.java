package ka;

import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes2.dex */
public final class e implements Runnable {

    /* renamed from: c, reason: collision with root package name */
    public static final sa.a f16232c = new sa.a("RevokeAccessOperation", new String[0]);

    /* renamed from: a, reason: collision with root package name */
    public final String f16233a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.common.api.internal.t f16234b;

    public e(String str) {
        com.google.android.gms.common.internal.p.d(str);
        this.f16233a = str;
        this.f16234b = new com.google.android.gms.common.api.internal.t(null);
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        sa.a aVar = f16232c;
        Status status = Status.f5907g;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + this.f16233a).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f5905e;
            } else {
                aVar.c("Unable to revoke access!", new Object[0]);
            }
            aVar.a("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e10) {
            aVar.c("IOException when revoking access: ".concat(String.valueOf(e10.toString())), new Object[0]);
        } catch (Exception e11) {
            aVar.c("Exception when revoking access: ".concat(String.valueOf(e11.toString())), new Object[0]);
        }
        this.f16234b.setResult(status);
    }
}
