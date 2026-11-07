package i8;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import sd.z;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements d8.b, sd.d {
    public static String c(IllegalArgumentException illegalArgumentException, StringBuilder sb) {
        sb.append(illegalArgumentException.getMessage());
        return sb.toString();
    }

    public static String d(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    @Override // d8.b
    public void a(com.android.billingclient.api.a aVar) {
    }

    @Override // sd.d
    public Object b(z zVar) {
        return ExecutorsRegistrar.f6873b.get();
    }
}
